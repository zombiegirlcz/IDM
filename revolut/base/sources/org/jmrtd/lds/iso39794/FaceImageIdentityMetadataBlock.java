package org.jmrtd.lds.iso39794;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.jmrtd.ASN1Util;

/* JADX INFO: loaded from: classes14.dex */
public class FaceImageIdentityMetadataBlock extends Block {
    private static final long serialVersionUID = 5968313840533997792L;
    private FaceImageExpressionBlock expressionBlock;
    private EyeColourCode eyeColourCode;
    private GenderCode genderCode;
    private HairColourCode hairColourCode;
    private FaceImagePoseAngleBlock poseAngleBlock;
    private FaceImagePropertiesBlock propertiesBlock;
    private int subjectHeight;

    public enum EyeColourCode implements EncodableEnum<EyeColourCode> {
        UNKNOWN(0),
        OTHER(1),
        BLACK(2),
        BLUE(3),
        BROWN(4),
        GREY(5),
        GREEN(6),
        HAZEL(7),
        MULTI_COLOURED(8),
        PINK(9);

        private int code;

        EyeColourCode(int i) {
            this.code = i;
        }

        public static EyeColourCode fromCode(int i) {
            return (EyeColourCode) EncodableEnum.fromCode(i, EyeColourCode.class);
        }

        @Override // org.jmrtd.lds.iso39794.EncodableEnum
        public int getCode() {
            return this.code;
        }
    }

    public enum GenderCode implements EncodableEnum<GenderCode> {
        UNKNOWN(0),
        OTHER(1),
        MALE(2),
        FEMALE(3);

        private int code;

        GenderCode(int i) {
            this.code = i;
        }

        public static GenderCode fromCode(int i) {
            return (GenderCode) EncodableEnum.fromCode(i, GenderCode.class);
        }

        @Override // org.jmrtd.lds.iso39794.EncodableEnum
        public int getCode() {
            return this.code;
        }
    }

    public enum HairColourCode implements EncodableEnum<HairColourCode> {
        UNKNOWN(0),
        OTHER(1),
        BALD(2),
        BLACK(3),
        BLONDE(4),
        BROWN(5),
        GREY(6),
        WHITE(7),
        RED(8),
        KNOWN_COLOURED(9);

        private int code;

        HairColourCode(int i) {
            this.code = i;
        }

        public static HairColourCode fromCode(int i) {
            return (HairColourCode) EncodableEnum.fromCode(i, HairColourCode.class);
        }

        @Override // org.jmrtd.lds.iso39794.EncodableEnum
        public int getCode() {
            return this.code;
        }
    }

    public FaceImageIdentityMetadataBlock(GenderCode genderCode, EyeColourCode eyeColourCode, HairColourCode hairColourCode, int i, FaceImagePropertiesBlock faceImagePropertiesBlock, FaceImageExpressionBlock faceImageExpressionBlock, FaceImagePoseAngleBlock faceImagePoseAngleBlock) {
        this.genderCode = genderCode;
        this.eyeColourCode = eyeColourCode;
        this.hairColourCode = hairColourCode;
        this.subjectHeight = i;
        this.propertiesBlock = faceImagePropertiesBlock;
        this.expressionBlock = faceImageExpressionBlock;
        this.poseAngleBlock = faceImagePoseAngleBlock;
    }

    @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || getClass() != obj2.getClass()) {
            return false;
        }
        FaceImageIdentityMetadataBlock faceImageIdentityMetadataBlock = (FaceImageIdentityMetadataBlock) obj2;
        return Objects.equals(this.expressionBlock, faceImageIdentityMetadataBlock.expressionBlock) && this.eyeColourCode == faceImageIdentityMetadataBlock.eyeColourCode && this.genderCode == faceImageIdentityMetadataBlock.genderCode && this.hairColourCode == faceImageIdentityMetadataBlock.hairColourCode && Objects.equals(this.poseAngleBlock, faceImageIdentityMetadataBlock.poseAngleBlock) && Objects.equals(this.propertiesBlock, faceImageIdentityMetadataBlock.propertiesBlock) && this.subjectHeight == faceImageIdentityMetadataBlock.subjectHeight;
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public ASN1Encodable getASN1Object() {
        HashMap map = new HashMap();
        if (this.genderCode != null) {
            map.put(0, ISO39794Util.encodeCodeAsChoiceExtensionBlockFallback(this.genderCode.getCode()));
        }
        if (this.eyeColourCode != null) {
            map.put(1, ISO39794Util.encodeCodeAsChoiceExtensionBlockFallback(this.eyeColourCode.getCode()));
        }
        if (this.hairColourCode != null) {
            map.put(2, ISO39794Util.encodeCodeAsChoiceExtensionBlockFallback(this.hairColourCode.getCode()));
        }
        if (this.subjectHeight >= 0) {
            map.put(3, ASN1Util.encodeInt(this.subjectHeight));
        }
        if (this.propertiesBlock != null) {
            map.put(4, this.propertiesBlock.getASN1Object());
        }
        if (this.expressionBlock != null) {
            map.put(5, this.expressionBlock.getASN1Object());
        }
        if (this.poseAngleBlock != null) {
            map.put(6, this.poseAngleBlock.getASN1Object());
        }
        return ASN1Util.encodeTaggedObjects(map);
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public /* bridge */ /* synthetic */ byte[] getEncoded() {
        return super.getEncoded();
    }

    public FaceImageExpressionBlock getExpressionBlock() {
        return this.expressionBlock;
    }

    public EyeColourCode getEyeColourCode() {
        return this.eyeColourCode;
    }

    public GenderCode getGenderCode() {
        return this.genderCode;
    }

    public HairColourCode getHairColourCode() {
        return this.hairColourCode;
    }

    public FaceImagePoseAngleBlock getPoseAngleBlock() {
        return this.poseAngleBlock;
    }

    public FaceImagePropertiesBlock getPropertiesBlock() {
        return this.propertiesBlock;
    }

    public int getSubjectHeight() {
        return this.subjectHeight;
    }

    @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
    public int hashCode() {
        return Objects.hash(this.expressionBlock, this.eyeColourCode, this.genderCode, this.hairColourCode, this.poseAngleBlock, this.propertiesBlock, Integer.valueOf(this.subjectHeight));
    }

    public String toString() {
        return "FaceImageIdentityMetadataBlock [genderCode: " + this.genderCode + ", eyeColourCode: " + this.eyeColourCode + ", hairColourCode: " + this.hairColourCode + ", subjectHeight: " + this.subjectHeight + ", propertiesBlock: " + this.propertiesBlock + ", expressionBlock: " + this.expressionBlock + ", poseAngleBlock: " + this.poseAngleBlock + "]";
    }

    public FaceImageIdentityMetadataBlock(ASN1Encodable aSN1Encodable) {
        if (aSN1Encodable != null) {
            if (!(aSN1Encodable instanceof ASN1Sequence) && !(aSN1Encodable instanceof ASN1TaggedObject)) {
                throw new IllegalArgumentException("Cannot decode!");
            }
            Map<Integer, ASN1Encodable> mapDecodeTaggedObjects = ASN1Util.decodeTaggedObjects(aSN1Encodable);
            if (mapDecodeTaggedObjects.containsKey(0)) {
                this.genderCode = GenderCode.fromCode(ISO39794Util.decodeCodeFromChoiceExtensionBlockFallback(mapDecodeTaggedObjects.get(0)).intValue());
            }
            if (mapDecodeTaggedObjects.containsKey(1)) {
                this.eyeColourCode = EyeColourCode.fromCode(ISO39794Util.decodeCodeFromChoiceExtensionBlockFallback(mapDecodeTaggedObjects.get(1)).intValue());
            }
            if (mapDecodeTaggedObjects.containsKey(2)) {
                this.hairColourCode = HairColourCode.fromCode(ISO39794Util.decodeCodeFromChoiceExtensionBlockFallback(mapDecodeTaggedObjects.get(2)).intValue());
            }
            if (mapDecodeTaggedObjects.containsKey(3)) {
                this.subjectHeight = ASN1Util.decodeInt(mapDecodeTaggedObjects.get(3));
            }
            if (mapDecodeTaggedObjects.containsKey(4)) {
                this.propertiesBlock = new FaceImagePropertiesBlock(mapDecodeTaggedObjects.get(4));
            }
            if (mapDecodeTaggedObjects.containsKey(5)) {
                this.expressionBlock = new FaceImageExpressionBlock(mapDecodeTaggedObjects.get(5));
            }
            if (mapDecodeTaggedObjects.containsKey(6)) {
                this.poseAngleBlock = new FaceImagePoseAngleBlock(mapDecodeTaggedObjects.get(6));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Cannot decode null!");
    }
}
