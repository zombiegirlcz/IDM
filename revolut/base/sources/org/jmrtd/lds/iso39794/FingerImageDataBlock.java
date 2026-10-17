package org.jmrtd.lds.iso39794;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.jmrtd.ASN1Util;
import org.jmrtd.cbeff.BiometricDataBlock;
import org.jmrtd.cbeff.StandardBiometricHeader;

/* JADX INFO: loaded from: classes14.dex */
public class FingerImageDataBlock extends Block implements BiometricDataBlock {
    private static final long serialVersionUID = -7831183486053375281L;
    private List<FingerImageRepresentationBlock> representationBlocks;

    /* JADX INFO: renamed from: sbh, reason: collision with root package name */
    private StandardBiometricHeader f228983sbh;
    private VersionBlock versionBlock;

    public FingerImageDataBlock(VersionBlock versionBlock, List<FingerImageRepresentationBlock> list, StandardBiometricHeader standardBiometricHeader) {
        this.versionBlock = versionBlock;
        this.representationBlocks = list;
        this.f228983sbh = standardBiometricHeader;
    }

    private int getBiometricSubtype() {
        Iterator<FingerImageRepresentationBlock> it8 = getRepresentationBlocks().iterator();
        boolean z = true;
        int i = 0;
        while (it8.hasNext()) {
            int biometricSubtype = it8.next().getBiometricSubtype();
            if (z) {
                z = false;
                i = biometricSubtype;
            } else {
                i &= biometricSubtype;
            }
        }
        return i;
    }

    @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || getClass() != obj2.getClass()) {
            return false;
        }
        FingerImageDataBlock fingerImageDataBlock = (FingerImageDataBlock) obj2;
        return Objects.equals(this.representationBlocks, fingerImageDataBlock.representationBlocks) && Objects.equals(this.f228983sbh, fingerImageDataBlock.f228983sbh) && Objects.equals(this.versionBlock, fingerImageDataBlock.versionBlock);
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public ASN1Encodable getASN1Object() {
        HashMap map = new HashMap();
        map.put(0, this.versionBlock.getASN1Object());
        map.put(1, ISO39794Util.encodeBlocks(this.representationBlocks));
        return new DERTaggedObject(false, 64, 4, ASN1Util.encodeTaggedObjects(map));
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public /* bridge */ /* synthetic */ byte[] getEncoded() {
        return super.getEncoded();
    }

    public List<FingerImageRepresentationBlock> getRepresentationBlocks() {
        return this.representationBlocks;
    }

    @Override // org.jmrtd.cbeff.BiometricDataBlock
    public StandardBiometricHeader getStandardBiometricHeader() {
        if (this.f228983sbh == null) {
            byte[] bArr = {(byte) getBiometricSubtype()};
            TreeMap treeMap = new TreeMap();
            treeMap.put(129, new byte[]{8});
            treeMap.put(130, bArr);
            treeMap.put(135, new byte[]{1, 1});
            treeMap.put(136, new byte[]{0, 40});
            this.f228983sbh = new StandardBiometricHeader(treeMap);
        }
        return this.f228983sbh;
    }

    public VersionBlock getVersionBlock() {
        return this.versionBlock;
    }

    @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
    public int hashCode() {
        return Objects.hash(this.representationBlocks, this.f228983sbh, this.versionBlock);
    }

    public String toString() {
        return "FingerImageDataBlock [versionBlock: " + this.versionBlock + ", representationBlocks: " + this.representationBlocks + ", sbh: " + this.f228983sbh + "]";
    }

    public FingerImageDataBlock(InputStream inputStream) throws IOException {
        this((StandardBiometricHeader) null, inputStream);
    }

    public FingerImageDataBlock(StandardBiometricHeader standardBiometricHeader, InputStream inputStream) throws IOException {
        this(standardBiometricHeader, ASN1Util.readASN1Object(inputStream));
    }

    public FingerImageDataBlock(StandardBiometricHeader standardBiometricHeader, ASN1Encodable aSN1Encodable) {
        this.f228983sbh = standardBiometricHeader;
        ASN1Encodable aSN1EncodableCheckTag = ASN1Util.checkTag(aSN1Encodable, 64, 4);
        if (aSN1EncodableCheckTag instanceof ASN1Sequence) {
            Map<Integer, ASN1Encodable> mapDecodeTaggedObjects = ASN1Util.decodeTaggedObjects(aSN1EncodableCheckTag);
            this.versionBlock = new VersionBlock(mapDecodeTaggedObjects.get(0));
            this.representationBlocks = FingerImageRepresentationBlock.decodeRepresentationBlocks(mapDecodeTaggedObjects.get(1));
            return;
        }
        throw new IllegalArgumentException("Cannot decode!");
    }
}
