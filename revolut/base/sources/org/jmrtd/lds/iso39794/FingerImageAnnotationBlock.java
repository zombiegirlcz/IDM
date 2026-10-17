package org.jmrtd.lds.iso39794;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.bouncycastle.asn1.ASN1Encodable;
import org.jmrtd.ASN1Util;

/* JADX INFO: loaded from: classes14.dex */
public class FingerImageAnnotationBlock extends Block {
    private static final long serialVersionUID = -716107883353729322L;
    private FingerImagePositionCode positionCode;
    private AnnotationReasonCode reasonCode;

    public enum AnnotationReasonCode implements EncodableEnum<AnnotationReasonCode> {
        UNKNOWN(0),
        OTHER(1),
        AMPUTATED(2),
        UNABLE_TO_PRINT(3),
        BANDAGED(4),
        PHYSICALLY_CHALLENGED(5),
        DISEASED(6);

        private int code;

        AnnotationReasonCode(int i) {
            this.code = i;
        }

        public static AnnotationReasonCode fromCode(int i) {
            return (AnnotationReasonCode) EncodableEnum.fromCode(i, AnnotationReasonCode.class);
        }

        @Override // org.jmrtd.lds.iso39794.EncodableEnum
        public int getCode() {
            return this.code;
        }
    }

    public FingerImageAnnotationBlock(FingerImagePositionCode fingerImagePositionCode, AnnotationReasonCode annotationReasonCode) {
        this.positionCode = fingerImagePositionCode;
        this.reasonCode = annotationReasonCode;
    }

    public static List<FingerImageAnnotationBlock> decodeFingerImageAnnotationBlocks(ASN1Encodable aSN1Encodable) {
        if (!ASN1Util.isSequenceOfSequences(aSN1Encodable)) {
            return Collections.singletonList(new FingerImageAnnotationBlock(aSN1Encodable));
        }
        List<ASN1Encodable> list = ASN1Util.list(aSN1Encodable);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<ASN1Encodable> it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(new FingerImageAnnotationBlock(it8.next()));
        }
        return arrayList;
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
        FingerImageAnnotationBlock fingerImageAnnotationBlock = (FingerImageAnnotationBlock) obj2;
        return this.positionCode == fingerImageAnnotationBlock.positionCode && this.reasonCode == fingerImageAnnotationBlock.reasonCode;
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public ASN1Encodable getASN1Object() {
        HashMap map = new HashMap();
        map.put(0, ISO39794Util.encodeCodeAsChoiceExtensionBlockFallback(this.positionCode.getCode()));
        map.put(1, ISO39794Util.encodeCodeAsChoiceExtensionBlockFallback(this.reasonCode.getCode()));
        return ASN1Util.encodeTaggedObjects(map);
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public /* bridge */ /* synthetic */ byte[] getEncoded() {
        return super.getEncoded();
    }

    public FingerImagePositionCode getPositionCode() {
        return this.positionCode;
    }

    public AnnotationReasonCode getReasonCode() {
        return this.reasonCode;
    }

    @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
    public int hashCode() {
        return Objects.hash(this.positionCode, this.reasonCode);
    }

    public String toString() {
        return "FingerImageAnnotationBlock [positionCode: " + this.positionCode + ", reasonCode: " + this.reasonCode + "]";
    }

    public FingerImageAnnotationBlock(ASN1Encodable aSN1Encodable) {
        Map<Integer, ASN1Encodable> mapDecodeTaggedObjects = ASN1Util.decodeTaggedObjects(aSN1Encodable);
        this.positionCode = FingerImagePositionCode.fromCode(ISO39794Util.decodeCodeFromChoiceExtensionBlockFallback(mapDecodeTaggedObjects.get(0)).intValue());
        this.reasonCode = AnnotationReasonCode.fromCode(ISO39794Util.decodeCodeFromChoiceExtensionBlockFallback(mapDecodeTaggedObjects.get(1)).intValue());
    }
}
