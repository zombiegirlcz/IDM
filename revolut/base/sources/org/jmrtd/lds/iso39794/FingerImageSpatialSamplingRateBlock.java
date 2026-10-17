package org.jmrtd.lds.iso39794;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.bouncycastle.asn1.ASN1Encodable;
import org.jmrtd.ASN1Util;

/* JADX INFO: loaded from: classes14.dex */
public class FingerImageSpatialSamplingRateBlock extends Block {
    private static final long serialVersionUID = 3134105261906116624L;
    private int samplesPerUnit;
    private UnitDimensionCode unitDimension;

    public enum UnitDimensionCode implements EncodableEnum<UnitDimensionCode> {
        INCH(0),
        CM(1);

        private int code;

        UnitDimensionCode(int i) {
            this.code = i;
        }

        public static UnitDimensionCode fromCode(int i) {
            return (UnitDimensionCode) EncodableEnum.fromCode(i, UnitDimensionCode.class);
        }

        @Override // org.jmrtd.lds.iso39794.EncodableEnum
        public int getCode() {
            return this.code;
        }
    }

    public FingerImageSpatialSamplingRateBlock(int i, UnitDimensionCode unitDimensionCode) {
        this.samplesPerUnit = i;
        this.unitDimension = unitDimensionCode;
    }

    @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || getClass() != obj2.getClass()) {
            return false;
        }
        FingerImageSpatialSamplingRateBlock fingerImageSpatialSamplingRateBlock = (FingerImageSpatialSamplingRateBlock) obj2;
        return this.samplesPerUnit == fingerImageSpatialSamplingRateBlock.samplesPerUnit && this.unitDimension == fingerImageSpatialSamplingRateBlock.unitDimension;
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public ASN1Encodable getASN1Object() {
        HashMap map = new HashMap();
        map.put(0, ASN1Util.encodeInt(this.samplesPerUnit));
        map.put(1, ASN1Util.encodeInt(this.unitDimension.getCode()));
        return ASN1Util.encodeTaggedObjects(map);
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public /* bridge */ /* synthetic */ byte[] getEncoded() {
        return super.getEncoded();
    }

    public int getSamplesPerUnit() {
        return this.samplesPerUnit;
    }

    public UnitDimensionCode getUnitDimension() {
        return this.unitDimension;
    }

    @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.samplesPerUnit), this.unitDimension);
    }

    public String toString() {
        return "FingerImageSpatialSamplingRateBlock [samplesPerUnit: " + this.samplesPerUnit + ", unitDimension: " + this.unitDimension + "]";
    }

    public FingerImageSpatialSamplingRateBlock(ASN1Encodable aSN1Encodable) {
        Map<Integer, ASN1Encodable> mapDecodeTaggedObjects = ASN1Util.decodeTaggedObjects(aSN1Encodable);
        this.samplesPerUnit = ASN1Util.decodeInt(mapDecodeTaggedObjects.get(0));
        this.unitDimension = UnitDimensionCode.fromCode(ASN1Util.decodeInt(mapDecodeTaggedObjects.get(1)));
    }
}
