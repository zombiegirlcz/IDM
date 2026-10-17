package org.jmrtd.lds.iso39794;

import ehe.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import net.sf.scuba.util.Hex;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.jmrtd.ASN1Util;

/* JADX INFO: loaded from: classes14.dex */
public class PADDataBlock extends Block {
    private static final long serialVersionUID = 1498548397505331884L;
    private DateTimeBlock captureDateTimeBlock;
    private List<byte[]> challenges;
    private PADCaptureContextCode padCaptureContextCode;
    private PADCriteriaCategoryCode padCriteriaCategoryCode;
    private PADDecisionCode padDecisionCode;
    private List<ExtendedDataBlock> padExtendedDataBlocks;
    private List<PADScoreBlock> padScoreBlocks;
    private PADSupervisionLevelCode padSupervisionLevelCode;
    private byte[] parameter;
    private int riskLevel;

    public enum PADCaptureContextCode implements EncodableEnum<PADCaptureContextCode> {
        ENROLMENT(0),
        VERIFICATION(1),
        IDENTIFICATION(2);

        private int code;

        PADCaptureContextCode(int i) {
            this.code = i;
        }

        public static PADCaptureContextCode fromCode(int i) {
            return (PADCaptureContextCode) EncodableEnum.fromCode(i, PADCaptureContextCode.class);
        }

        @Override // org.jmrtd.lds.iso39794.EncodableEnum
        public int getCode() {
            return this.code;
        }
    }

    public enum PADCriteriaCategoryCode implements EncodableEnum<PADCriteriaCategoryCode> {
        UNKNOWN(0),
        INDIVIDUAL(1),
        COMMON(2);

        private int code;

        PADCriteriaCategoryCode(int i) {
            this.code = i;
        }

        public static PADCriteriaCategoryCode fromCode(int i) {
            return (PADCriteriaCategoryCode) EncodableEnum.fromCode(i, PADCriteriaCategoryCode.class);
        }

        @Override // org.jmrtd.lds.iso39794.EncodableEnum
        public int getCode() {
            return this.code;
        }
    }

    public enum PADDecisionCode implements EncodableEnum<PADDecisionCode> {
        NO_ATTACK(0),
        ATTACK(1),
        FAILURE_TO_ASSESS(2);

        private int code;

        PADDecisionCode(int i) {
            this.code = i;
        }

        public static PADDecisionCode fromCode(int i) {
            return (PADDecisionCode) EncodableEnum.fromCode(i, PADDecisionCode.class);
        }

        @Override // org.jmrtd.lds.iso39794.EncodableEnum
        public int getCode() {
            return this.code;
        }
    }

    public enum PADSupervisionLevelCode implements EncodableEnum<PADSupervisionLevelCode> {
        UNKNOWN(0),
        CONTROLLED(1),
        ASSISTED(2),
        OBSERVED(3),
        UNATTENDED(4);

        private int code;

        PADSupervisionLevelCode(int i) {
            this.code = i;
        }

        public static PADSupervisionLevelCode fromCode(int i) {
            return (PADSupervisionLevelCode) EncodableEnum.fromCode(i, PADSupervisionLevelCode.class);
        }

        @Override // org.jmrtd.lds.iso39794.EncodableEnum
        public int getCode() {
            return this.code;
        }
    }

    public PADDataBlock(PADDecisionCode pADDecisionCode, List<PADScoreBlock> list, List<ExtendedDataBlock> list2, PADCaptureContextCode pADCaptureContextCode, PADSupervisionLevelCode pADSupervisionLevelCode, int i, PADCriteriaCategoryCode pADCriteriaCategoryCode, byte[] bArr, List<byte[]> list3, DateTimeBlock dateTimeBlock) {
        this.padDecisionCode = pADDecisionCode;
        this.padScoreBlocks = list;
        this.padExtendedDataBlocks = list2;
        this.padCaptureContextCode = pADCaptureContextCode;
        this.padSupervisionLevelCode = pADSupervisionLevelCode;
        this.riskLevel = i;
        this.padCriteriaCategoryCode = pADCriteriaCategoryCode;
        this.parameter = bArr;
        this.challenges = list3;
        this.captureDateTimeBlock = dateTimeBlock;
    }

    private static List<byte[]> decodePADChallenges(ASN1Encodable aSN1Encodable) {
        List<ASN1Encodable> list = ASN1Util.list(aSN1Encodable);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<ASN1Encodable> it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(ASN1OctetString.getInstance(it8.next()).getOctets());
        }
        return arrayList;
    }

    public static List<PADDataBlock> decodePADDataBlocks(ASN1Encodable aSN1Encodable) {
        if (!ASN1Util.isSequenceOfSequences(aSN1Encodable)) {
            return Collections.singletonList(new PADDataBlock(aSN1Encodable));
        }
        List<ASN1Encodable> list = ASN1Util.list(aSN1Encodable);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<ASN1Encodable> it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(new PADDataBlock(it8.next()));
        }
        return arrayList;
    }

    private static ASN1Encodable encodePADChallenges(List<byte[]> list) {
        ASN1Encodable[] aSN1EncodableArr = new ASN1Encodable[list.size()];
        Iterator<byte[]> it8 = list.iterator();
        int i = 0;
        while (it8.hasNext()) {
            aSN1EncodableArr[i] = new DEROctetString(it8.next());
            i++;
        }
        return new DERSequence(aSN1EncodableArr);
    }

    private static boolean equalBytes(List<byte[]> list, List<byte[]> list2) {
        if (Objects.equals(list, list2)) {
            return true;
        }
        if (list == null && list2 != null) {
            return false;
        }
        if ((list != null && list2 == null) || list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || getClass() != obj2.getClass()) {
            return false;
        }
        PADDataBlock pADDataBlock = (PADDataBlock) obj2;
        return Objects.equals(this.captureDateTimeBlock, pADDataBlock.captureDateTimeBlock) && equalBytes(this.challenges, pADDataBlock.challenges) && this.padCaptureContextCode == pADDataBlock.padCaptureContextCode && this.padCriteriaCategoryCode == pADDataBlock.padCriteriaCategoryCode && this.padDecisionCode == pADDataBlock.padDecisionCode && Objects.equals(this.padExtendedDataBlocks, pADDataBlock.padExtendedDataBlocks) && Objects.equals(this.padScoreBlocks, pADDataBlock.padScoreBlocks) && this.padSupervisionLevelCode == pADDataBlock.padSupervisionLevelCode && Arrays.equals(this.parameter, pADDataBlock.parameter) && this.riskLevel == pADDataBlock.riskLevel;
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public ASN1Encodable getASN1Object() {
        HashMap map = new HashMap();
        if (this.padDecisionCode != null) {
            map.put(0, ISO39794Util.encodeCodeAsChoiceExtensionBlockFallback(this.padDecisionCode.getCode()));
        }
        if (this.padScoreBlocks != null) {
            map.put(1, ISO39794Util.encodeBlocks(this.padScoreBlocks));
        }
        if (this.padExtendedDataBlocks != null) {
            map.put(2, ISO39794Util.encodeBlocks(this.padExtendedDataBlocks));
        }
        if (this.padCaptureContextCode != null) {
            map.put(3, ISO39794Util.encodeCodeAsChoiceExtensionBlockFallback(this.padCaptureContextCode.getCode()));
        }
        if (this.padSupervisionLevelCode != null) {
            map.put(4, ISO39794Util.encodeCodeAsChoiceExtensionBlockFallback(this.padSupervisionLevelCode.getCode()));
        }
        if (this.riskLevel >= 0) {
            map.put(5, ASN1Util.encodeInt(this.riskLevel));
        }
        if (this.padCriteriaCategoryCode != null) {
            map.put(6, ISO39794Util.encodeCodeAsChoiceExtensionBlockFallback(this.padCriteriaCategoryCode.getCode()));
        }
        if (this.parameter != null) {
            map.put(7, new DEROctetString(this.parameter));
        }
        if (this.challenges != null) {
            map.put(8, encodePADChallenges(this.challenges));
        }
        if (this.captureDateTimeBlock != null) {
            map.put(9, this.captureDateTimeBlock.getASN1Object());
        }
        return ASN1Util.encodeTaggedObjects(map);
    }

    public DateTimeBlock getCaptureDateTimeBlock() {
        return this.captureDateTimeBlock;
    }

    public List<byte[]> getChallenges() {
        return this.challenges;
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public /* bridge */ /* synthetic */ byte[] getEncoded() {
        return super.getEncoded();
    }

    public PADCaptureContextCode getPADCaptureContextCode() {
        return this.padCaptureContextCode;
    }

    public PADCriteriaCategoryCode getPADCriteriaCategoryCode() {
        return this.padCriteriaCategoryCode;
    }

    public PADDecisionCode getPADDecisionCode() {
        return this.padDecisionCode;
    }

    public PADSupervisionLevelCode getPADSupervisionLevelCode() {
        return this.padSupervisionLevelCode;
    }

    public List<ExtendedDataBlock> getPadExtendedDataBlocks() {
        return this.padExtendedDataBlocks;
    }

    public List<PADScoreBlock> getPadScoreBlocks() {
        return this.padScoreBlocks;
    }

    public byte[] getParameter() {
        return this.parameter;
    }

    public int getRiskLevel() {
        return this.riskLevel;
    }

    @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
    public int hashCode() {
        return Objects.hash(this.captureDateTimeBlock, this.challenges, this.padCaptureContextCode, this.padCriteriaCategoryCode, this.padDecisionCode, this.padExtendedDataBlocks, this.padScoreBlocks, this.padSupervisionLevelCode, Integer.valueOf(this.riskLevel)) + n.b(31, 31, this.parameter);
    }

    public String toString() {
        return "PADDataBlock [padDecisionCode: " + this.padDecisionCode + ", padScoreBlocks: " + this.padScoreBlocks + ", padExtendedDataBlocks: " + this.padExtendedDataBlocks + ", padCaptureContextCode: " + this.padCaptureContextCode + ", padSupervisionLevelCode: " + this.padSupervisionLevelCode + ", riskLevel: " + this.riskLevel + ", padCriteriaCategoryCode: " + this.padCriteriaCategoryCode + ", parameter: " + Hex.bytesToHexString(this.parameter) + ", challenges: " + toString(this.challenges) + ", captureDateTimeBlock: " + this.captureDateTimeBlock + "]";
    }

    private static String toString(List<byte[]> list) {
        if (list == null) {
            return "null";
        }
        StringBuilder sb6 = new StringBuilder("[");
        boolean z = true;
        for (byte[] bArr : list) {
            if (z) {
                z = false;
            } else {
                sb6.append(", ");
            }
            sb6.append(Hex.bytesToHexString(bArr));
        }
        sb6.append("]");
        return sb6.toString();
    }

    public PADDataBlock(ASN1Encodable aSN1Encodable) {
        Map<Integer, ASN1Encodable> mapDecodeTaggedObjects = ASN1Util.decodeTaggedObjects(aSN1Encodable);
        if (mapDecodeTaggedObjects.containsKey(0)) {
            this.padDecisionCode = PADDecisionCode.fromCode(ISO39794Util.decodeCodeFromChoiceExtensionBlockFallback(mapDecodeTaggedObjects.get(0)).intValue());
        }
        if (mapDecodeTaggedObjects.containsKey(1)) {
            this.padScoreBlocks = PADScoreBlock.decodePADScoreBlocks(mapDecodeTaggedObjects.get(1));
        }
        if (mapDecodeTaggedObjects.containsKey(2)) {
            this.padExtendedDataBlocks = ExtendedDataBlock.decodeExtendedDataBlocks(mapDecodeTaggedObjects.get(2));
        }
        if (mapDecodeTaggedObjects.containsKey(3)) {
            this.padCaptureContextCode = PADCaptureContextCode.fromCode(ISO39794Util.decodeCodeFromChoiceExtensionBlockFallback(mapDecodeTaggedObjects.get(3)).intValue());
        }
        if (mapDecodeTaggedObjects.containsKey(4)) {
            this.padSupervisionLevelCode = PADSupervisionLevelCode.fromCode(ISO39794Util.decodeCodeFromChoiceExtensionBlockFallback(mapDecodeTaggedObjects.get(4)).intValue());
        }
        if (mapDecodeTaggedObjects.containsKey(5)) {
            this.riskLevel = ASN1Util.decodeInt(mapDecodeTaggedObjects.get(5));
        }
        if (mapDecodeTaggedObjects.containsKey(6)) {
            this.padCriteriaCategoryCode = PADCriteriaCategoryCode.fromCode(ISO39794Util.decodeCodeFromChoiceExtensionBlockFallback(mapDecodeTaggedObjects.get(6)).intValue());
        }
        if (mapDecodeTaggedObjects.containsKey(7)) {
            this.parameter = ASN1OctetString.getInstance(mapDecodeTaggedObjects.get(7)).getOctets();
        }
        if (mapDecodeTaggedObjects.containsKey(8)) {
            this.challenges = decodePADChallenges(mapDecodeTaggedObjects.get(8));
        }
        if (mapDecodeTaggedObjects.containsKey(9)) {
            this.captureDateTimeBlock = new DateTimeBlock(mapDecodeTaggedObjects.get(9));
        }
    }
}
