package org.jmrtd.lds.iso39794;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.jcajce.provider.digest.a;
import org.jmrtd.ASN1Util;

/* JADX INFO: loaded from: classes14.dex */
public class FaceImagePropertiesBlock extends Block {
    private static final long serialVersionUID = 4371559611288515912L;
    private Boolean hasBeard;
    private Boolean hasDarkGlasses;
    private Boolean hasGlasses;
    private Boolean hasLeftEyePatch;
    private Boolean hasMoustache;
    private Boolean hasRightEyePatch;
    private Boolean isBiometricAbsent;
    private Boolean isHeadCoveringsPresent;
    private Boolean isMouthOpen;
    private Boolean isPupilOrIrisNotVisible;
    private Boolean isTeethVisible;

    public FaceImagePropertiesBlock(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11) {
        this.hasGlasses = bool;
        this.hasMoustache = bool2;
        this.hasBeard = bool3;
        this.isTeethVisible = bool4;
        this.isPupilOrIrisNotVisible = bool5;
        this.isMouthOpen = bool6;
        this.hasLeftEyePatch = bool7;
        this.hasRightEyePatch = bool8;
        this.hasDarkGlasses = bool9;
        this.isBiometricAbsent = bool10;
        this.isHeadCoveringsPresent = bool11;
    }

    @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || getClass() != obj2.getClass()) {
            return false;
        }
        FaceImagePropertiesBlock faceImagePropertiesBlock = (FaceImagePropertiesBlock) obj2;
        return Objects.equals(this.hasBeard, faceImagePropertiesBlock.hasBeard) && Objects.equals(this.hasDarkGlasses, faceImagePropertiesBlock.hasDarkGlasses) && Objects.equals(this.hasGlasses, faceImagePropertiesBlock.hasGlasses) && Objects.equals(this.hasLeftEyePatch, faceImagePropertiesBlock.hasLeftEyePatch) && Objects.equals(this.hasMoustache, faceImagePropertiesBlock.hasMoustache) && Objects.equals(this.hasRightEyePatch, faceImagePropertiesBlock.hasRightEyePatch) && Objects.equals(this.isBiometricAbsent, faceImagePropertiesBlock.isBiometricAbsent) && Objects.equals(this.isHeadCoveringsPresent, faceImagePropertiesBlock.isHeadCoveringsPresent) && Objects.equals(this.isMouthOpen, faceImagePropertiesBlock.isMouthOpen) && Objects.equals(this.isPupilOrIrisNotVisible, faceImagePropertiesBlock.isPupilOrIrisNotVisible) && Objects.equals(this.isTeethVisible, faceImagePropertiesBlock.isTeethVisible);
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public ASN1Encodable getASN1Object() {
        HashMap map = new HashMap();
        if (this.hasGlasses != null) {
            a.w(this.hasGlasses, map, 0);
        }
        if (this.hasMoustache != null) {
            a.w(this.hasMoustache, map, 1);
        }
        if (this.hasBeard != null) {
            a.w(this.hasBeard, map, 2);
        }
        if (this.isTeethVisible != null) {
            a.w(this.isTeethVisible, map, 3);
        }
        if (this.isPupilOrIrisNotVisible != null) {
            a.w(this.isPupilOrIrisNotVisible, map, 4);
        }
        if (this.isMouthOpen != null) {
            a.w(this.isMouthOpen, map, 5);
        }
        if (this.hasLeftEyePatch != null) {
            a.w(this.hasLeftEyePatch, map, 6);
        }
        if (this.hasRightEyePatch != null) {
            a.w(this.hasRightEyePatch, map, 7);
        }
        if (this.hasDarkGlasses != null) {
            a.w(this.hasDarkGlasses, map, 8);
        }
        if (this.isBiometricAbsent != null) {
            a.w(this.isBiometricAbsent, map, 9);
        }
        if (this.isHeadCoveringsPresent != null) {
            a.w(this.isHeadCoveringsPresent, map, 10);
        }
        return ASN1Util.encodeTaggedObjects(map);
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public /* bridge */ /* synthetic */ byte[] getEncoded() {
        return super.getEncoded();
    }

    public Boolean hasBeard() {
        return this.hasBeard;
    }

    public Boolean hasDarkGlasses() {
        return this.hasDarkGlasses;
    }

    public Boolean hasGlasses() {
        return this.hasGlasses;
    }

    public Boolean hasLeftEyePatch() {
        return this.hasLeftEyePatch;
    }

    public Boolean hasMoustache() {
        return this.hasMoustache;
    }

    public Boolean hasRightEyePatch() {
        return this.hasRightEyePatch;
    }

    @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
    public int hashCode() {
        return Objects.hash(this.hasBeard, this.hasDarkGlasses, this.hasGlasses, this.hasLeftEyePatch, this.hasMoustache, this.hasRightEyePatch, this.isBiometricAbsent, this.isHeadCoveringsPresent, this.isMouthOpen, this.isPupilOrIrisNotVisible, this.isTeethVisible);
    }

    public Boolean isBiometricAbsent() {
        return this.isBiometricAbsent;
    }

    public Boolean isHeadCoveringsPresent() {
        return this.isHeadCoveringsPresent;
    }

    public Boolean isMouthOpen() {
        return this.isMouthOpen;
    }

    public Boolean isPupilOrIrisNotVisible() {
        return this.isPupilOrIrisNotVisible;
    }

    public Boolean isTeethVisible() {
        return this.isTeethVisible;
    }

    public String toString() {
        return "FaceImagePropertiesBlock [hasGlasses: " + this.hasGlasses + ", hasMoustache: " + this.hasMoustache + ", hasBeard: " + this.hasBeard + ", isTeethVisible: " + this.isTeethVisible + ", isPupilOrIrisNotVisible: " + this.isPupilOrIrisNotVisible + ", isMouthOpen: " + this.isMouthOpen + ", hasLeftEyePatch: " + this.hasLeftEyePatch + ", hasRightEyePatch: " + this.hasRightEyePatch + ", hasDarkGlasses: " + this.hasDarkGlasses + ", isBiometricAbsent: " + this.isBiometricAbsent + ", isHeadCoveringsPresent: " + this.isHeadCoveringsPresent + "]";
    }

    public FaceImagePropertiesBlock(ASN1Encodable aSN1Encodable) {
        Map<Integer, ASN1Encodable> mapDecodeTaggedObjects = ASN1Util.decodeTaggedObjects(aSN1Encodable);
        if (mapDecodeTaggedObjects.containsKey(0)) {
            this.hasGlasses = Boolean.valueOf(ASN1Util.decodeBoolean(mapDecodeTaggedObjects.get(0)));
        }
        if (mapDecodeTaggedObjects.containsKey(1)) {
            this.hasMoustache = Boolean.valueOf(ASN1Util.decodeBoolean(mapDecodeTaggedObjects.get(1)));
        }
        if (mapDecodeTaggedObjects.containsKey(2)) {
            this.hasBeard = Boolean.valueOf(ASN1Util.decodeBoolean(mapDecodeTaggedObjects.get(2)));
        }
        if (mapDecodeTaggedObjects.containsKey(3)) {
            this.isTeethVisible = Boolean.valueOf(ASN1Util.decodeBoolean(mapDecodeTaggedObjects.get(3)));
        }
        if (mapDecodeTaggedObjects.containsKey(4)) {
            this.isPupilOrIrisNotVisible = Boolean.valueOf(ASN1Util.decodeBoolean(mapDecodeTaggedObjects.get(4)));
        }
        if (mapDecodeTaggedObjects.containsKey(5)) {
            this.isMouthOpen = Boolean.valueOf(ASN1Util.decodeBoolean(mapDecodeTaggedObjects.get(5)));
        }
        if (mapDecodeTaggedObjects.containsKey(6)) {
            this.hasLeftEyePatch = Boolean.valueOf(ASN1Util.decodeBoolean(mapDecodeTaggedObjects.get(6)));
        }
        if (mapDecodeTaggedObjects.containsKey(7)) {
            this.hasRightEyePatch = Boolean.valueOf(ASN1Util.decodeBoolean(mapDecodeTaggedObjects.get(7)));
        }
        if (mapDecodeTaggedObjects.containsKey(8)) {
            this.hasDarkGlasses = Boolean.valueOf(ASN1Util.decodeBoolean(mapDecodeTaggedObjects.get(8)));
        }
        if (mapDecodeTaggedObjects.containsKey(9)) {
            this.isBiometricAbsent = Boolean.valueOf(ASN1Util.decodeBoolean(mapDecodeTaggedObjects.get(9)));
        }
        if (mapDecodeTaggedObjects.containsKey(10)) {
            this.isHeadCoveringsPresent = Boolean.valueOf(ASN1Util.decodeBoolean(mapDecodeTaggedObjects.get(10)));
        }
    }
}
