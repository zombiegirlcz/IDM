package org.jmrtd.lds.iso39794;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
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

/* JADX INFO: loaded from: classes14.dex */
public class FaceImageDataBlock extends Block implements BiometricDataBlock {
    private static final long serialVersionUID = -7831183488053975281L;
    private List<FaceImageRepresentationBlock> representationBlocks;

    /* JADX INFO: renamed from: sbh, reason: collision with root package name */
    private StandardBiometricHeader f228982sbh;
    private VersionBlock versionBlock;

    public FaceImageDataBlock(VersionBlock versionBlock, List<FaceImageRepresentationBlock> list, StandardBiometricHeader standardBiometricHeader) {
        this.versionBlock = versionBlock;
        this.representationBlocks = list;
        this.f228982sbh = standardBiometricHeader;
    }

    @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || getClass() != obj2.getClass()) {
            return false;
        }
        FaceImageDataBlock faceImageDataBlock = (FaceImageDataBlock) obj2;
        return Objects.equals(this.representationBlocks, faceImageDataBlock.representationBlocks) && Objects.equals(this.f228982sbh, faceImageDataBlock.f228982sbh) && Objects.equals(this.versionBlock, faceImageDataBlock.versionBlock);
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public ASN1Encodable getASN1Object() {
        HashMap map = new HashMap();
        map.put(0, this.versionBlock.getASN1Object());
        map.put(1, ISO39794Util.encodeBlocks(this.representationBlocks));
        return new DERTaggedObject(false, 64, 5, ASN1Util.encodeTaggedObjects(map));
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public /* bridge */ /* synthetic */ byte[] getEncoded() {
        return super.getEncoded();
    }

    public List<FaceImageRepresentationBlock> getRepresentationBlocks() {
        return this.representationBlocks;
    }

    @Override // org.jmrtd.cbeff.BiometricDataBlock
    public StandardBiometricHeader getStandardBiometricHeader() {
        if (this.f228982sbh == null) {
            byte[] bArr = {0, ISO7816.INS_PSO};
            TreeMap treeMap = new TreeMap();
            treeMap.put(129, new byte[]{2});
            treeMap.put(130, new byte[]{0});
            treeMap.put(135, new byte[]{1, 1});
            treeMap.put(136, bArr);
            this.f228982sbh = new StandardBiometricHeader(treeMap);
        }
        return this.f228982sbh;
    }

    public VersionBlock getVersionBlock() {
        return this.versionBlock;
    }

    @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
    public int hashCode() {
        return Objects.hash(this.representationBlocks, this.f228982sbh, this.versionBlock);
    }

    public String toString() {
        return "FaceImageDataBlock [versionBlock: " + this.versionBlock + ", representationBlocks: " + this.representationBlocks + ", sbh: " + this.f228982sbh + "]";
    }

    public FaceImageDataBlock(InputStream inputStream) throws IOException {
        this((StandardBiometricHeader) null, inputStream);
    }

    public FaceImageDataBlock(StandardBiometricHeader standardBiometricHeader, InputStream inputStream) throws IOException {
        this(standardBiometricHeader, ASN1Util.readASN1Object(inputStream));
    }

    public FaceImageDataBlock(StandardBiometricHeader standardBiometricHeader, ASN1Encodable aSN1Encodable) {
        this.f228982sbh = standardBiometricHeader;
        ASN1Encodable aSN1EncodableCheckTag = ASN1Util.checkTag(aSN1Encodable, 64, 5);
        if (aSN1EncodableCheckTag instanceof ASN1Sequence) {
            Map<Integer, ASN1Encodable> mapDecodeTaggedObjects = ASN1Util.decodeTaggedObjects(aSN1EncodableCheckTag);
            this.versionBlock = new VersionBlock(mapDecodeTaggedObjects.get(0));
            this.representationBlocks = FaceImageRepresentationBlock.decodeRepresentationBlocks(mapDecodeTaggedObjects.get(1));
            return;
        }
        throw new IllegalArgumentException("Cannot decode!");
    }
}
