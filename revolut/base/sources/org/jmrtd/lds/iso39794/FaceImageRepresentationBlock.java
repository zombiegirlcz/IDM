package org.jmrtd.lds.iso39794;

import java.io.InputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.bouncycastle.asn1.ASN1Encodable;
import org.jmrtd.ASN1Util;
import org.jmrtd.lds.ImageInfo;
import org.jmrtd.lds.iso39794.FaceImageInformation2DBlock;
import t61.a;

/* JADX INFO: loaded from: classes14.dex */
public class FaceImageRepresentationBlock extends Block implements ImageInfo {
    private static final long serialVersionUID = -8372278398595506771L;
    private DateTimeBlock captureDateTimeBlock;
    private FaceImageCaptureDeviceBlock captureDeviceBlock;
    private BigInteger derivedFrom;
    private FaceImageIdentityMetadataBlock identityMetadataBlock;
    private FaceImageRepresentation2DBlock imageRepresentation2DBlock;
    private List<FaceImageLandmarkBlock> landmarkBlocks;
    private List<PADDataBlock> padDataBlocks;
    private List<QualityBlock> qualityBlocks;
    private BigInteger representationId;
    private BigInteger sessionId;

    public FaceImageRepresentationBlock(BigInteger bigInteger, FaceImageRepresentation2DBlock faceImageRepresentation2DBlock, DateTimeBlock dateTimeBlock, List<QualityBlock> list, List<PADDataBlock> list2, BigInteger bigInteger2, BigInteger bigInteger3, FaceImageCaptureDeviceBlock faceImageCaptureDeviceBlock, FaceImageIdentityMetadataBlock faceImageIdentityMetadataBlock, List<FaceImageLandmarkBlock> list3) {
        this.representationId = bigInteger;
        this.imageRepresentation2DBlock = faceImageRepresentation2DBlock;
        this.captureDateTimeBlock = dateTimeBlock;
        this.qualityBlocks = list;
        this.padDataBlocks = list2;
        this.sessionId = bigInteger2;
        this.derivedFrom = bigInteger3;
        this.captureDeviceBlock = faceImageCaptureDeviceBlock;
        this.identityMetadataBlock = faceImageIdentityMetadataBlock;
        this.landmarkBlocks = list3;
    }

    private static FaceImageRepresentation2DBlock decodeImageRepresentation2DBlock(ASN1Encodable aSN1Encodable) {
        Map<Integer, ASN1Encodable> mapDecodeTaggedObjects = ASN1Util.decodeTaggedObjects(aSN1Encodable);
        if (!mapDecodeTaggedObjects.containsKey(0)) {
            return null;
        }
        Map<Integer, ASN1Encodable> mapDecodeTaggedObjects2 = ASN1Util.decodeTaggedObjects(mapDecodeTaggedObjects.get(0));
        if (mapDecodeTaggedObjects2.containsKey(0)) {
            return new FaceImageRepresentation2DBlock(mapDecodeTaggedObjects2.get(0));
        }
        return null;
    }

    public static List<FaceImageRepresentationBlock> decodeRepresentationBlocks(ASN1Encodable aSN1Encodable) {
        ArrayList arrayList = new ArrayList();
        if (!ASN1Util.isSequenceOfSequences(aSN1Encodable)) {
            arrayList.add(new FaceImageRepresentationBlock(aSN1Encodable));
            return arrayList;
        }
        Iterator<ASN1Encodable> it8 = ASN1Util.list(aSN1Encodable).iterator();
        while (it8.hasNext()) {
            arrayList.add(new FaceImageRepresentationBlock(it8.next()));
        }
        return arrayList;
    }

    private static ASN1Encodable encodeImageRepresentation2DBlock(FaceImageRepresentation2DBlock faceImageRepresentation2DBlock) {
        HashMap map = new HashMap();
        map.put(0, faceImageRepresentation2DBlock.getASN1Object());
        HashMap map2 = new HashMap();
        map2.put(0, ASN1Util.encodeTaggedObjects(map));
        return ASN1Util.encodeTaggedObjects(map2);
    }

    @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || getClass() != obj2.getClass()) {
            return false;
        }
        FaceImageRepresentationBlock faceImageRepresentationBlock = (FaceImageRepresentationBlock) obj2;
        return Objects.equals(this.captureDateTimeBlock, faceImageRepresentationBlock.captureDateTimeBlock) && Objects.equals(this.captureDeviceBlock, faceImageRepresentationBlock.captureDeviceBlock) && Objects.equals(this.derivedFrom, faceImageRepresentationBlock.derivedFrom) && Objects.equals(this.identityMetadataBlock, faceImageRepresentationBlock.identityMetadataBlock) && Objects.equals(this.imageRepresentation2DBlock, faceImageRepresentationBlock.imageRepresentation2DBlock) && Objects.equals(this.landmarkBlocks, faceImageRepresentationBlock.landmarkBlocks) && Objects.equals(this.padDataBlocks, faceImageRepresentationBlock.padDataBlocks) && Objects.equals(this.qualityBlocks, faceImageRepresentationBlock.qualityBlocks) && Objects.equals(this.representationId, faceImageRepresentationBlock.representationId) && Objects.equals(this.sessionId, faceImageRepresentationBlock.sessionId);
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public ASN1Encodable getASN1Object() {
        HashMap map = new HashMap();
        map.put(0, ASN1Util.encodeBigInteger(this.representationId));
        map.put(1, encodeImageRepresentation2DBlock(this.imageRepresentation2DBlock));
        if (this.captureDateTimeBlock != null) {
            map.put(2, this.captureDateTimeBlock.getASN1Object());
        }
        if (this.qualityBlocks != null) {
            map.put(3, ISO39794Util.encodeBlocks(this.qualityBlocks));
        }
        if (this.padDataBlocks != null) {
            map.put(4, ISO39794Util.encodeBlocks(this.padDataBlocks));
        }
        if (this.sessionId != null) {
            map.put(5, ASN1Util.encodeBigInteger(this.sessionId));
        }
        if (this.derivedFrom != null) {
            map.put(6, ASN1Util.encodeBigInteger(this.derivedFrom));
        }
        if (this.captureDeviceBlock != null) {
            map.put(7, this.captureDeviceBlock.getASN1Object());
        }
        if (this.identityMetadataBlock != null) {
            map.put(8, this.identityMetadataBlock.getASN1Object());
        }
        if (this.landmarkBlocks != null) {
            map.put(9, ISO39794Util.encodeBlocks(this.landmarkBlocks));
        }
        return ASN1Util.encodeTaggedObjects(map);
    }

    public DateTimeBlock getCaptureDateTimeBlock() {
        return this.captureDateTimeBlock;
    }

    public FaceImageCaptureDeviceBlock getCaptureDeviceBlock() {
        return this.captureDeviceBlock;
    }

    public BigInteger getDerivedFrom() {
        return this.derivedFrom;
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public /* bridge */ /* synthetic */ byte[] getEncoded() {
        return super.getEncoded();
    }

    @Override // org.jmrtd.lds.ImageInfo
    public int getHeight() {
        FaceImageInformation2DBlock imageInformation2DBlock;
        FaceImageInformation2DBlock.ImageSizeBlock imageSizeBlock;
        FaceImageRepresentation2DBlock faceImageRepresentation2DBlock = this.imageRepresentation2DBlock;
        if (faceImageRepresentation2DBlock == null || (imageInformation2DBlock = faceImageRepresentation2DBlock.getImageInformation2DBlock()) == null || (imageSizeBlock = imageInformation2DBlock.getImageSizeBlock()) == null) {
            return 0;
        }
        return imageSizeBlock.getHeight();
    }

    public FaceImageIdentityMetadataBlock getIdentityMetadataBlock() {
        return this.identityMetadataBlock;
    }

    @Override // org.jmrtd.lds.ImageInfo
    public InputStream getImageInputStream() {
        FaceImageRepresentation2DBlock faceImageRepresentation2DBlock = this.imageRepresentation2DBlock;
        if (faceImageRepresentation2DBlock == null) {
            return null;
        }
        return faceImageRepresentation2DBlock.getRepresentationData2DInputStream();
    }

    @Override // org.jmrtd.lds.ImageInfo
    public int getImageLength() {
        FaceImageRepresentation2DBlock faceImageRepresentation2DBlock = this.imageRepresentation2DBlock;
        if (faceImageRepresentation2DBlock == null) {
            return 0;
        }
        return (int) faceImageRepresentation2DBlock.getRepresentationData2DInputLength();
    }

    public FaceImageRepresentation2DBlock getImageRepresentation2DBlock() {
        return this.imageRepresentation2DBlock;
    }

    public List<FaceImageLandmarkBlock> getLandmarkBlocks() {
        return this.landmarkBlocks;
    }

    @Override // org.jmrtd.lds.ImageInfo
    public String getMimeType() {
        FaceImageRepresentation2DBlock faceImageRepresentation2DBlock = this.imageRepresentation2DBlock;
        return faceImageRepresentation2DBlock == null ? "image/raw" : faceImageRepresentation2DBlock.getRepresentationData2DInputMimeType();
    }

    public List<PADDataBlock> getPadDataBlocks() {
        return this.padDataBlocks;
    }

    public List<QualityBlock> getQualityBlocks() {
        return this.qualityBlocks;
    }

    @Override // org.jmrtd.lds.ImageInfo
    public long getRecordLength() {
        return 0L;
    }

    public BigInteger getRepresentationId() {
        return this.representationId;
    }

    public BigInteger getSessionId() {
        return this.sessionId;
    }

    @Override // org.jmrtd.lds.ImageInfo
    public int getType() {
        return 0;
    }

    @Override // org.jmrtd.lds.ImageInfo
    public int getWidth() {
        FaceImageInformation2DBlock imageInformation2DBlock;
        FaceImageInformation2DBlock.ImageSizeBlock imageSizeBlock;
        FaceImageRepresentation2DBlock faceImageRepresentation2DBlock = this.imageRepresentation2DBlock;
        if (faceImageRepresentation2DBlock == null || (imageInformation2DBlock = faceImageRepresentation2DBlock.getImageInformation2DBlock()) == null || (imageSizeBlock = imageInformation2DBlock.getImageSizeBlock()) == null) {
            return 0;
        }
        return imageSizeBlock.getWidth();
    }

    @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
    public int hashCode() {
        return Objects.hash(this.captureDateTimeBlock, this.captureDeviceBlock, this.derivedFrom, this.identityMetadataBlock, this.imageRepresentation2DBlock, this.landmarkBlocks, this.padDataBlocks, this.qualityBlocks, this.representationId, this.sessionId);
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("FaceImageRepresentationBlock [representationId: ");
        sb6.append(this.representationId);
        sb6.append(", imageRepresentation: ");
        sb6.append(this.imageRepresentation2DBlock);
        sb6.append(", captureDateTimeBlock: ");
        sb6.append(this.captureDateTimeBlock);
        sb6.append(", qualityBlocks: ");
        sb6.append(this.qualityBlocks);
        sb6.append(", padDataBlocks: ");
        sb6.append(this.padDataBlocks);
        sb6.append(", sessionId: ");
        sb6.append(this.sessionId);
        sb6.append(", derivedFrom: ");
        sb6.append(this.derivedFrom);
        sb6.append(", captureDeviceBlock: ");
        sb6.append(this.captureDeviceBlock);
        sb6.append(", identityMetadataBlock: ");
        sb6.append(this.identityMetadataBlock);
        sb6.append(", landmarkBlocks: ");
        return a.q("]", this.landmarkBlocks, sb6);
    }

    public FaceImageRepresentationBlock(ASN1Encodable aSN1Encodable) {
        Map<Integer, ASN1Encodable> mapDecodeTaggedObjects = ASN1Util.decodeTaggedObjects(aSN1Encodable);
        this.representationId = ASN1Util.decodeBigInteger(mapDecodeTaggedObjects.get(0));
        this.imageRepresentation2DBlock = decodeImageRepresentation2DBlock(mapDecodeTaggedObjects.get(1));
        if (mapDecodeTaggedObjects.containsKey(2)) {
            this.captureDateTimeBlock = new DateTimeBlock(mapDecodeTaggedObjects.get(2));
        }
        if (mapDecodeTaggedObjects.containsKey(3)) {
            this.qualityBlocks = QualityBlock.decodeQualityBlocks(mapDecodeTaggedObjects.get(3));
        }
        if (mapDecodeTaggedObjects.containsKey(4)) {
            this.padDataBlocks = PADDataBlock.decodePADDataBlocks(mapDecodeTaggedObjects.get(4));
        }
        if (mapDecodeTaggedObjects.containsKey(5)) {
            this.sessionId = ASN1Util.decodeBigInteger(mapDecodeTaggedObjects.get(5));
        }
        if (mapDecodeTaggedObjects.containsKey(6)) {
            this.derivedFrom = ASN1Util.decodeBigInteger(mapDecodeTaggedObjects.get(6));
        }
        if (mapDecodeTaggedObjects.containsKey(7)) {
            this.captureDeviceBlock = new FaceImageCaptureDeviceBlock(mapDecodeTaggedObjects.get(7));
        }
        if (mapDecodeTaggedObjects.containsKey(8)) {
            this.identityMetadataBlock = new FaceImageIdentityMetadataBlock(mapDecodeTaggedObjects.get(8));
        }
        if (mapDecodeTaggedObjects.containsKey(9)) {
            this.landmarkBlocks = FaceImageLandmarkBlock.decodeLandmarkBlocks(mapDecodeTaggedObjects.get(9));
        }
    }
}
