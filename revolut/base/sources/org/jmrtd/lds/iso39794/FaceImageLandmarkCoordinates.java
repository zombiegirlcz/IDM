package org.jmrtd.lds.iso39794;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1Encodable;
import org.jmrtd.ASN1Util;

/* JADX INFO: loaded from: classes14.dex */
public interface FaceImageLandmarkCoordinates extends Serializable {
    static FaceImageLandmarkCoordinates decodeLandmarkCoordinates(ASN1Encodable aSN1Encodable) {
        Map<Integer, ASN1Encodable> mapDecodeTaggedObjects = ASN1Util.decodeTaggedObjects(aSN1Encodable);
        if (!mapDecodeTaggedObjects.containsKey(0)) {
            return null;
        }
        Map<Integer, ASN1Encodable> mapDecodeTaggedObjects2 = ASN1Util.decodeTaggedObjects(mapDecodeTaggedObjects.get(0));
        if (mapDecodeTaggedObjects2.containsKey(0)) {
            return new CoordinateCartesian2DUnsignedShortBlock(mapDecodeTaggedObjects2.get(0));
        }
        if (mapDecodeTaggedObjects2.containsKey(1)) {
            return new FaceImageCoordinateTextureImageBlock(mapDecodeTaggedObjects2.get(1));
        }
        if (mapDecodeTaggedObjects2.containsKey(2)) {
            return new CoordinateCartesian3DUnsignedShortBlock(mapDecodeTaggedObjects2.get(2));
        }
        return null;
    }

    static ASN1Encodable encodeLandmarkCoordinates(FaceImageLandmarkCoordinates faceImageLandmarkCoordinates) {
        HashMap map = new HashMap();
        if (faceImageLandmarkCoordinates instanceof CoordinateCartesian2DUnsignedShortBlock) {
            map.put(0, ((CoordinateCartesian2DUnsignedShortBlock) faceImageLandmarkCoordinates).getASN1Object());
        } else if (faceImageLandmarkCoordinates instanceof FaceImageCoordinateTextureImageBlock) {
            map.put(1, ((FaceImageCoordinateTextureImageBlock) faceImageLandmarkCoordinates).getASN1Object());
        } else if (faceImageLandmarkCoordinates instanceof CoordinateCartesian3DUnsignedShortBlock) {
            map.put(2, ((CoordinateCartesian3DUnsignedShortBlock) faceImageLandmarkCoordinates).getASN1Object());
        }
        HashMap map2 = new HashMap();
        map2.put(0, ASN1Util.encodeTaggedObjects(map));
        return ASN1Util.encodeTaggedObjects(map2);
    }

    boolean equals(Object obj2);

    int hashCode();
}
