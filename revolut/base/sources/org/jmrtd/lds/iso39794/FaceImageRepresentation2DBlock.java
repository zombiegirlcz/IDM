package org.jmrtd.lds.iso39794;

import ehe.n;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.jmrtd.ASN1Util;
import org.jmrtd.lds.iso39794.FaceImageInformation2DBlock;

/* JADX INFO: loaded from: classes14.dex */
public class FaceImageRepresentation2DBlock extends Block {
    private static final long serialVersionUID = 1942286473160393593L;
    private FaceImageCaptureDevice2DBlock captureDevice2DBlock;
    private FaceImageInformation2DBlock imageInformation2DBlock;
    private byte[] representationData2DBytes;

    public FaceImageRepresentation2DBlock(byte[] bArr, FaceImageInformation2DBlock faceImageInformation2DBlock, FaceImageCaptureDevice2DBlock faceImageCaptureDevice2DBlock) {
        this.representationData2DBytes = bArr;
        this.imageInformation2DBlock = faceImageInformation2DBlock;
        this.captureDevice2DBlock = faceImageCaptureDevice2DBlock;
    }

    @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || getClass() != obj2.getClass()) {
            return false;
        }
        FaceImageRepresentation2DBlock faceImageRepresentation2DBlock = (FaceImageRepresentation2DBlock) obj2;
        return Objects.equals(this.captureDevice2DBlock, faceImageRepresentation2DBlock.captureDevice2DBlock) && Objects.equals(this.imageInformation2DBlock, faceImageRepresentation2DBlock.imageInformation2DBlock) && Arrays.equals(this.representationData2DBytes, faceImageRepresentation2DBlock.representationData2DBytes);
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public ASN1Encodable getASN1Object() {
        HashMap map = new HashMap();
        map.put(0, new DEROctetString(this.representationData2DBytes));
        map.put(1, this.imageInformation2DBlock.getASN1Object());
        if (this.captureDevice2DBlock != null) {
            map.put(2, this.captureDevice2DBlock.getASN1Object());
        }
        return ASN1Util.encodeTaggedObjects(map);
    }

    public FaceImageCaptureDevice2DBlock getCaptureDevice2DBlock() {
        return this.captureDevice2DBlock;
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public /* bridge */ /* synthetic */ byte[] getEncoded() {
        return super.getEncoded();
    }

    public FaceImageInformation2DBlock getImageInformation2DBlock() {
        return this.imageInformation2DBlock;
    }

    public long getRepresentationData2DInputLength() {
        if (this.representationData2DBytes == null) {
            return 0L;
        }
        return r0.length;
    }

    public String getRepresentationData2DInputMimeType() {
        return FaceImageInformation2DBlock.ImageDataFormatCode.toMimeType(this.imageInformation2DBlock.getImageDataFormatCode());
    }

    public InputStream getRepresentationData2DInputStream() {
        return new ByteArrayInputStream(this.representationData2DBytes);
    }

    @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
    public int hashCode() {
        return Objects.hash(this.captureDevice2DBlock, this.imageInformation2DBlock) + n.b(31, 31, this.representationData2DBytes);
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("FaceImageRepresentation2DBlock [representationData2DBytes: ");
        byte[] bArr = this.representationData2DBytes;
        sb6.append(bArr == null ? "-" : Integer.valueOf(bArr.length));
        sb6.append(", imageInformation2DBlock: ");
        sb6.append(this.imageInformation2DBlock);
        sb6.append(", captureDevice2DBlock: ");
        sb6.append(this.captureDevice2DBlock);
        sb6.append("]");
        return sb6.toString();
    }

    public FaceImageRepresentation2DBlock(ASN1Encodable aSN1Encodable) {
        if (!(aSN1Encodable instanceof ASN1Sequence) && !(aSN1Encodable instanceof ASN1TaggedObject)) {
            throw new IllegalArgumentException("Cannot decode!");
        }
        Map<Integer, ASN1Encodable> mapDecodeTaggedObjects = ASN1Util.decodeTaggedObjects(aSN1Encodable);
        this.representationData2DBytes = ASN1OctetString.getInstance(mapDecodeTaggedObjects.get(0)).getOctets();
        this.imageInformation2DBlock = new FaceImageInformation2DBlock(mapDecodeTaggedObjects.get(1));
        if (mapDecodeTaggedObjects.containsKey(2)) {
            this.captureDevice2DBlock = new FaceImageCaptureDevice2DBlock(mapDecodeTaggedObjects.get(2));
        }
    }
}
