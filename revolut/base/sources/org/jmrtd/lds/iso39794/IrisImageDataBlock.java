package org.jmrtd.lds.iso39794;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import net.sf.scuba.smartcards.ISO7816;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.jmrtd.ASN1Util;
import org.jmrtd.cbeff.BiometricDataBlock;
import org.jmrtd.cbeff.StandardBiometricHeader;
import t61.a;

/* JADX INFO: loaded from: classes14.dex */
public class IrisImageDataBlock extends Block implements BiometricDataBlock {
    private static final long serialVersionUID = 5915816895542698638L;
    private List<IrisImageRepresentationBlock> representationBlocks;

    /* JADX INFO: renamed from: sbh, reason: collision with root package name */
    private StandardBiometricHeader f228984sbh;
    private VersionBlock versionBlock;

    public IrisImageDataBlock(InputStream inputStream) throws IOException {
        this((StandardBiometricHeader) null, inputStream);
    }

    private int getBiometricSubtype() {
        Iterator<IrisImageRepresentationBlock> it8 = getRepresentationBlocks().iterator();
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
        IrisImageDataBlock irisImageDataBlock = (IrisImageDataBlock) obj2;
        return Objects.equals(this.representationBlocks, irisImageDataBlock.representationBlocks) && Objects.equals(this.f228984sbh, irisImageDataBlock.f228984sbh) && Objects.equals(this.versionBlock, irisImageDataBlock.versionBlock);
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public ASN1Encodable getASN1Object() {
        HashMap map = new HashMap();
        map.put(0, this.versionBlock.getASN1Object());
        map.put(1, ISO39794Util.encodeBlocks(this.representationBlocks));
        return new DERTaggedObject(false, 64, 6, ASN1Util.encodeTaggedObjects(map));
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public /* bridge */ /* synthetic */ byte[] getEncoded() {
        return super.getEncoded();
    }

    public List<IrisImageRepresentationBlock> getRepresentationBlocks() {
        return this.representationBlocks;
    }

    @Override // org.jmrtd.cbeff.BiometricDataBlock
    public StandardBiometricHeader getStandardBiometricHeader() {
        if (this.f228984sbh == null) {
            byte[] bArr = {(byte) getBiometricSubtype()};
            byte[] bArr2 = {0, ISO7816.INS_UNBLOCK_CHV};
            TreeMap treeMap = new TreeMap();
            treeMap.put(129, new byte[]{16});
            treeMap.put(130, bArr);
            treeMap.put(135, new byte[]{1, 1});
            treeMap.put(136, bArr2);
            this.f228984sbh = new StandardBiometricHeader(treeMap);
        }
        return this.f228984sbh;
    }

    public VersionBlock getVersionBlock() {
        return this.versionBlock;
    }

    @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
    public int hashCode() {
        return Objects.hash(this.representationBlocks, this.f228984sbh, this.versionBlock);
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("IrisImageDataBlock [sbh: ");
        sb6.append(this.f228984sbh);
        sb6.append(", versionBlock: ");
        sb6.append(this.versionBlock);
        sb6.append(", representationBlocks: ");
        return a.q("]", this.representationBlocks, sb6);
    }

    public IrisImageDataBlock(StandardBiometricHeader standardBiometricHeader, InputStream inputStream) throws IOException {
        this(standardBiometricHeader, ASN1Util.readASN1Object(inputStream));
    }

    public IrisImageDataBlock(StandardBiometricHeader standardBiometricHeader, ASN1Encodable aSN1Encodable) {
        this.f228984sbh = standardBiometricHeader;
        ASN1Encodable aSN1EncodableCheckTag = ASN1Util.checkTag(aSN1Encodable, 64, 6);
        if (aSN1EncodableCheckTag instanceof ASN1Sequence) {
            Map<Integer, ASN1Encodable> mapDecodeTaggedObjects = ASN1Util.decodeTaggedObjects(aSN1EncodableCheckTag);
            this.versionBlock = new VersionBlock(mapDecodeTaggedObjects.get(0));
            this.representationBlocks = IrisImageRepresentationBlock.decodeRepresentationBlocks(mapDecodeTaggedObjects.get(1));
            return;
        }
        throw new IllegalArgumentException("Cannot decode!");
    }
}
