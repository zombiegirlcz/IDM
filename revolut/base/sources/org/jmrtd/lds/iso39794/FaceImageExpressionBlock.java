package org.jmrtd.lds.iso39794;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.jcajce.provider.digest.a;
import org.jmrtd.ASN1Util;

/* JADX INFO: loaded from: classes14.dex */
public class FaceImageExpressionBlock extends Block {
    private static final long serialVersionUID = -3603621366074466000L;
    private Boolean isEyesLookingAwayFromTheCamera;
    private Boolean isFrowning;
    private Boolean isNeutral;
    private Boolean isRaisedEyebrows;
    private Boolean isSmile;
    private Boolean isSquinting;

    public FaceImageExpressionBlock(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6) {
        this.isNeutral = bool;
        this.isSmile = bool2;
        this.isRaisedEyebrows = bool3;
        this.isEyesLookingAwayFromTheCamera = bool4;
        this.isSquinting = bool5;
        this.isFrowning = bool6;
    }

    @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || getClass() != obj2.getClass()) {
            return false;
        }
        FaceImageExpressionBlock faceImageExpressionBlock = (FaceImageExpressionBlock) obj2;
        return Objects.equals(this.isEyesLookingAwayFromTheCamera, faceImageExpressionBlock.isEyesLookingAwayFromTheCamera) && Objects.equals(this.isFrowning, faceImageExpressionBlock.isFrowning) && Objects.equals(this.isNeutral, faceImageExpressionBlock.isNeutral) && Objects.equals(this.isRaisedEyebrows, faceImageExpressionBlock.isRaisedEyebrows) && Objects.equals(this.isSmile, faceImageExpressionBlock.isSmile) && Objects.equals(this.isSquinting, faceImageExpressionBlock.isSquinting);
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public ASN1Encodable getASN1Object() {
        HashMap map = new HashMap();
        if (this.isNeutral != null) {
            a.w(this.isNeutral, map, 0);
        }
        if (this.isSmile != null) {
            a.w(this.isSmile, map, 1);
        }
        if (this.isRaisedEyebrows != null) {
            a.w(this.isRaisedEyebrows, map, 2);
        }
        if (this.isEyesLookingAwayFromTheCamera != null) {
            a.w(this.isEyesLookingAwayFromTheCamera, map, 3);
        }
        if (this.isSquinting != null) {
            a.w(this.isSquinting, map, 4);
        }
        if (this.isFrowning != null) {
            a.w(this.isFrowning, map, 5);
        }
        return ASN1Util.encodeTaggedObjects(map);
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public /* bridge */ /* synthetic */ byte[] getEncoded() {
        return super.getEncoded();
    }

    @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
    public int hashCode() {
        return Objects.hash(this.isEyesLookingAwayFromTheCamera, this.isFrowning, this.isNeutral, this.isRaisedEyebrows, this.isSmile, this.isSquinting);
    }

    public Boolean isEyesLookingAwayFromTheCamera() {
        return this.isEyesLookingAwayFromTheCamera;
    }

    public Boolean isFrowning() {
        return this.isFrowning;
    }

    public Boolean isNeutral() {
        return this.isNeutral;
    }

    public Boolean isRaisedEyebrows() {
        return this.isRaisedEyebrows;
    }

    public Boolean isSmile() {
        return this.isSmile;
    }

    public Boolean isSquinting() {
        return this.isSquinting;
    }

    public String toString() {
        return "FaceImageExpressionBlock [isNeutral: " + this.isNeutral + ", isSmile: " + this.isSmile + ", isRaisedEyebrows: " + this.isRaisedEyebrows + ", isEyesLookingAwayFromTheCamera: " + this.isEyesLookingAwayFromTheCamera + ", isSquinting: " + this.isSquinting + ", isFrowning: " + this.isFrowning + "]";
    }

    public FaceImageExpressionBlock(ASN1Encodable aSN1Encodable) {
        Map<Integer, ASN1Encodable> mapDecodeTaggedObjects = ASN1Util.decodeTaggedObjects(aSN1Encodable);
        if (mapDecodeTaggedObjects.containsKey(0)) {
            this.isNeutral = Boolean.valueOf(ASN1Util.decodeBoolean(mapDecodeTaggedObjects.get(0)));
        }
        if (mapDecodeTaggedObjects.containsKey(1)) {
            this.isSmile = Boolean.valueOf(ASN1Util.decodeBoolean(mapDecodeTaggedObjects.get(1)));
        }
        if (mapDecodeTaggedObjects.containsKey(2)) {
            this.isRaisedEyebrows = Boolean.valueOf(ASN1Util.decodeBoolean(mapDecodeTaggedObjects.get(2)));
        }
        if (mapDecodeTaggedObjects.containsKey(3)) {
            this.isEyesLookingAwayFromTheCamera = Boolean.valueOf(ASN1Util.decodeBoolean(mapDecodeTaggedObjects.get(3)));
        }
        if (mapDecodeTaggedObjects.containsKey(4)) {
            this.isSquinting = Boolean.valueOf(ASN1Util.decodeBoolean(mapDecodeTaggedObjects.get(4)));
        }
        if (mapDecodeTaggedObjects.containsKey(5)) {
            this.isFrowning = Boolean.valueOf(ASN1Util.decodeBoolean(mapDecodeTaggedObjects.get(5)));
        }
    }
}
