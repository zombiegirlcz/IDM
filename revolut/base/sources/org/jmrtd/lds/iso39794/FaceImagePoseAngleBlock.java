package org.jmrtd.lds.iso39794;

import j6.a;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.bouncycastle.asn1.ASN1Encodable;
import org.jmrtd.ASN1Util;

/* JADX INFO: loaded from: classes14.dex */
public class FaceImagePoseAngleBlock extends Block {
    private static final long serialVersionUID = -7526271037214134760L;
    private AngleDataBlock pitchAngleDataBlock;
    private AngleDataBlock rollAngleDataBlock;
    private AngleDataBlock yawAngleDataBlock;

    public FaceImagePoseAngleBlock(AngleDataBlock angleDataBlock, AngleDataBlock angleDataBlock2, AngleDataBlock angleDataBlock3) {
        this.yawAngleDataBlock = angleDataBlock;
        this.pitchAngleDataBlock = angleDataBlock2;
        this.rollAngleDataBlock = angleDataBlock3;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || getClass() != obj2.getClass()) {
            return false;
        }
        FaceImagePoseAngleBlock faceImagePoseAngleBlock = (FaceImagePoseAngleBlock) obj2;
        return Objects.equals(this.pitchAngleDataBlock, faceImagePoseAngleBlock.pitchAngleDataBlock) && Objects.equals(this.rollAngleDataBlock, faceImagePoseAngleBlock.rollAngleDataBlock) && Objects.equals(this.yawAngleDataBlock, faceImagePoseAngleBlock.yawAngleDataBlock);
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public ASN1Encodable getASN1Object() {
        HashMap map = new HashMap();
        if (this.yawAngleDataBlock != null) {
            map.put(0, this.yawAngleDataBlock.getASN1Object());
        }
        if (this.pitchAngleDataBlock != null) {
            map.put(1, this.pitchAngleDataBlock.getASN1Object());
        }
        if (this.rollAngleDataBlock != null) {
            map.put(2, this.rollAngleDataBlock.getASN1Object());
        }
        return ASN1Util.encodeTaggedObjects(map);
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public /* bridge */ /* synthetic */ byte[] getEncoded() {
        return super.getEncoded();
    }

    public AngleDataBlock getPitchAngleDataBlock() {
        return this.pitchAngleDataBlock;
    }

    public AngleDataBlock getRollAngleDataBlock() {
        return this.rollAngleDataBlock;
    }

    public AngleDataBlock getYawAngleDataBlock() {
        return this.yawAngleDataBlock;
    }

    @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
    public int hashCode() {
        return Objects.hash(this.pitchAngleDataBlock, this.rollAngleDataBlock, this.yawAngleDataBlock);
    }

    public String toString() {
        return "FaceImagePoseAngleBlock [yawAngleDataBlock: " + this.yawAngleDataBlock + ", pitchAngleDataBlock: " + this.pitchAngleDataBlock + ", rollAngleDataBlock: " + this.rollAngleDataBlock + "]";
    }

    public static class AngleDataBlock extends Block {
        private static final long serialVersionUID = 3589963464356857977L;
        private int angleUncertainty;
        private int angleValue;

        public AngleDataBlock(int i, int i2) {
            this.angleValue = i;
            this.angleUncertainty = i2;
        }

        @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (obj2 == null || getClass() != obj2.getClass()) {
                return false;
            }
            AngleDataBlock angleDataBlock = (AngleDataBlock) obj2;
            return this.angleUncertainty == angleDataBlock.angleUncertainty && this.angleValue == angleDataBlock.angleValue;
        }

        @Override // org.jmrtd.lds.iso39794.Block
        public ASN1Encodable getASN1Object() {
            HashMap map = new HashMap();
            map.put(0, ASN1Util.encodeInt(this.angleValue));
            if (this.angleUncertainty >= 0) {
                map.put(1, ASN1Util.encodeInt(this.angleUncertainty));
            }
            return ASN1Util.encodeTaggedObjects(map);
        }

        public int getAngleUncertainty() {
            return this.angleUncertainty;
        }

        public int getAngleValue() {
            return this.angleValue;
        }

        @Override // org.jmrtd.lds.iso39794.Block
        public /* bridge */ /* synthetic */ byte[] getEncoded() {
            return super.getEncoded();
        }

        @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.angleUncertainty), Integer.valueOf(this.angleValue));
        }

        public String toString() {
            StringBuilder sb6 = new StringBuilder("AngleDataBlock [angleValue: ");
            sb6.append(this.angleValue);
            sb6.append(", angleUncertainty: ");
            return a.v(sb6, "]", this.angleUncertainty);
        }

        public AngleDataBlock(ASN1Encodable aSN1Encodable) {
            Map<Integer, ASN1Encodable> mapDecodeTaggedObjects = ASN1Util.decodeTaggedObjects(aSN1Encodable);
            this.angleValue = ASN1Util.decodeInt(mapDecodeTaggedObjects.get(0));
            if (mapDecodeTaggedObjects.containsKey(1)) {
                this.angleUncertainty = ASN1Util.decodeInt(mapDecodeTaggedObjects.get(1));
            } else {
                this.angleUncertainty = -1;
            }
        }
    }

    public FaceImagePoseAngleBlock(ASN1Encodable aSN1Encodable) {
        Map<Integer, ASN1Encodable> mapDecodeTaggedObjects = ASN1Util.decodeTaggedObjects(aSN1Encodable);
        if (mapDecodeTaggedObjects.containsKey(0)) {
            this.yawAngleDataBlock = new AngleDataBlock(mapDecodeTaggedObjects.get(0));
        }
        if (mapDecodeTaggedObjects.containsKey(1)) {
            this.pitchAngleDataBlock = new AngleDataBlock(mapDecodeTaggedObjects.get(1));
        }
        if (mapDecodeTaggedObjects.containsKey(2)) {
            this.rollAngleDataBlock = new AngleDataBlock(mapDecodeTaggedObjects.get(2));
        }
    }
}
