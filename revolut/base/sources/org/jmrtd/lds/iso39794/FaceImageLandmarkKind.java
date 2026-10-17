package org.jmrtd.lds.iso39794;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1Encodable;
import org.jmrtd.ASN1Util;

/* JADX INFO: loaded from: classes14.dex */
public interface FaceImageLandmarkKind {

    public enum AnthropometricLandmarkNameCode implements EncodableEnum<AnthropometricLandmarkNameCode>, FaceImageLandmarkKind {
        VERTEX(0),
        GLABELLA(1),
        OPISTHOCRANION(2),
        EURION_LEFT(3),
        EURION_RIGHT(4),
        FRONTOTEMPORALE_LEFT(5),
        FRONTOTEMPORALE_RIGHT(6),
        TRICHION(7),
        ZYGION_LEFT(8),
        ZYGION_RIGHT(9),
        GONION_LEFT(10),
        GONION_RIGHT(11),
        SUBLABIALE(12),
        POGONION(13),
        MENTON(14),
        CONDYLION_LATERALE_LEFT(15),
        CONDYLION_LATERALE_RIGHT(16),
        ENDOCANTHION_LEFT(17),
        ENDOCANTHION_RIGHT(18),
        EXOCANTHION_LEFT(19),
        EXOCANTHION_RIGHT(20),
        CENTER_POINT_OF_PUPIL_LEFT(21),
        CENTER_POINT_OF_PUPIL_RIGHT(22),
        ORBITALE_LEFT(23),
        ORBITALE_RIGHT(24),
        PALPEBRALE_SUPERIUS_LEFT(25),
        PALPEBRALE_SUPERIUS_RIGHT(26),
        PALPEBRALE_INFERIUS_LEFT(27),
        PALPEBRALE_INFERIUS_RIGHT(28),
        ORBITALE_SUPERIUS_LEFT(29),
        ORBITALE_SUPERIUS_RIGHT(30),
        SUPERCILIARE_LEFT(31),
        SUPERCILIARE_RIGHT(32),
        NASION(33),
        SELLION(34),
        ALARE_LEFT(35),
        ALARE_RIGHT(36),
        PRONASALE(37),
        SUBNASALE(38),
        SUBALARE(39),
        ALAR_CURVATURE_LEFT(40),
        ALAR_CURVATURE_RIGHT(41),
        MAXILLOFRONTALE(42),
        CHRISTA_PHILTRA_LANDMARK_LEFT(43),
        CHRISTA_PHILTRA_LANDMARK_RIGHT(44),
        LABIALE_SUPERIUS(45),
        LABIALE_INFERIUS(46),
        CHEILION_LEFT(47),
        CHEILION_RIGHT(48),
        STOMION(49),
        SUPERAURALE_LEFT(50),
        SUPERAURALE_RIGHT(51),
        SUBAURALE_LEFT(52),
        SUBAURALE_RIGHT(53),
        PREAURALE(54),
        POSTAURALE(55),
        OTOBASION_SUPERIUS_LEFT(56),
        OTOBASION_SUPERIUS_RIGHT(57),
        OTOBASION_INFERIUS(58),
        PORION(59),
        TRAGION(60);

        private int code;

        AnthropometricLandmarkNameCode(int i) {
            this.code = i;
        }

        public static AnthropometricLandmarkNameCode fromCode(int i) {
            return (AnthropometricLandmarkNameCode) EncodableEnum.fromCode(i, AnthropometricLandmarkNameCode.class);
        }

        @Override // org.jmrtd.lds.iso39794.EncodableEnum
        public int getCode() {
            return this.code;
        }
    }

    public enum AnthropometricLandmarkPointIdCode implements EncodableEnum<AnthropometricLandmarkPointIdCode>, FaceImageLandmarkKind {
        V(0),
        G(1),
        OP(2),
        EU_LEFT(3),
        EU_RIGHT(4),
        FT_LEFT(5),
        FT_RIGHT(6),
        TR(7),
        ZY_LEFT(8),
        ZY_RIGHT(9),
        GO_LEFT(10),
        GO_RIGHT(11),
        SL(12),
        PG(13),
        GN(14),
        CDL_LEFT(15),
        CDL_RIGHT(16),
        EN_LEFT(17),
        EN_RIGHT(18),
        EX_LEFT(19),
        EX_RIGHT(20),
        P_LEFT(21),
        P_RIGHT(22),
        OR_LEFT(23),
        OR_RIGHT(24),
        PS_LEFT(25),
        PS_RIGHT(26),
        PI_LEFT(27),
        PI_RIGHT(28),
        OS_LEFT(29),
        OS_RIGHT(30),
        SCI_LEFT(31),
        SCI_RIGHT(32),
        N(33),
        SE(34),
        AL_LEFT(35),
        AL_RIGHT(36),
        PRN(37),
        SN(38),
        SBAL(39),
        AC_LEFT(40),
        AC_RIGHT(41),
        MF_LEFT(42),
        MF_RIGHT(43),
        CPH_LEFT(44),
        CPH_RIGHT(45),
        LS(46),
        LI(47),
        CH_LEFT(48),
        CH_RIGHT(49),
        STO(50),
        SA_LEFT(51),
        SA_RIGHT(52),
        SBA_LEFT(53),
        SBA_RIGHT(54),
        PRA_LEFT(55),
        PRA_RIGHT(56),
        PA(57),
        OBS_LEFT(58),
        OBS_RIGHT(59),
        OBI(60),
        PO(61),
        T(62);

        private int code;

        AnthropometricLandmarkPointIdCode(int i) {
            this.code = i;
        }

        public static AnthropometricLandmarkPointIdCode fromCode(int i) {
            return (AnthropometricLandmarkPointIdCode) EncodableEnum.fromCode(i, AnthropometricLandmarkPointIdCode.class);
        }

        @Override // org.jmrtd.lds.iso39794.EncodableEnum
        public int getCode() {
            return this.code;
        }
    }

    public enum AnthropometricLandmarkPointNameCode implements EncodableEnum<AnthropometricLandmarkPointNameCode>, FaceImageLandmarkKind {
        POINTCODE_01_01(0),
        POINTCODE_01_02(1),
        POINTCODE_01_05(2),
        POINTCODE_01_06(3),
        POINTCODE_01_07(4),
        POINTCODE_01_08(5),
        POINTCODE_01_09(6),
        POINTCODE_02_01(7),
        POINTCODE_02_02(8),
        POINTCODE_02_03(9),
        POINTCODE_02_04(10),
        POINTCODE_02_05(11),
        POINTCODE_02_06(12),
        POINTCODE_02_07(13),
        POINTCODE_02_09(14),
        POINTCODE_02_10(15),
        POINTCODE_03_01(16),
        POINTCODE_03_02(17),
        POINTCODE_03_03(18),
        POINTCODE_03_04(19),
        POINTCODE_03_05(20),
        POINTCODE_03_06(21),
        POINTCODE_03_07(22),
        POINTCODE_03_08(23),
        POINTCODE_03_09(24),
        POINTCODE_03_10(25),
        POINTCODE_03_11(26),
        POINTCODE_03_12(27),
        POINTCODE_04_01(28),
        POINTCODE_04_02(29),
        POINTCODE_04_03(30),
        POINTCODE_04_04(31),
        POINTCODE_05_01(32),
        POINTCODE_05_02(33),
        POINTCODE_05_03(34),
        POINTCODE_05_04(35),
        POINTCODE_05_06(36);

        private int code;

        AnthropometricLandmarkPointNameCode(int i) {
            this.code = i;
        }

        public static AnthropometricLandmarkPointNameCode fromCode(int i) {
            return (AnthropometricLandmarkPointNameCode) EncodableEnum.fromCode(i, AnthropometricLandmarkPointNameCode.class);
        }

        @Override // org.jmrtd.lds.iso39794.EncodableEnum
        public int getCode() {
            return this.code;
        }
    }

    public enum MPEGFeaturePointCode implements EncodableEnum<MPEGFeaturePointCode>, FaceImageLandmarkKind {
        MPEG4_POINT_CODE_02_01(0),
        MPEG4_POINT_CODE_02_02(1),
        MPEG4_POINT_CODE_02_03(2),
        MPEG4_POINT_CODE_02_04(3),
        MPEG4_POINT_CODE_02_05(4),
        MPEG4_POINT_CODE_02_06(5),
        MPEG4_POINT_CODE_02_07(6),
        MPEG4_POINT_CODE_02_08(7),
        MPEG4_POINT_CODE_02_09(8),
        MPEG4_POINT_CODE_02_10(9),
        MPEG4_POINT_CODE_02_11(10),
        MPEG4_POINT_CODE_02_12(11),
        MPEG4_POINT_CODE_02_13(12),
        MPEG4_POINT_CODE_02_14(13),
        MPEG4_POINT_CODE_03_01(14),
        MPEG4_POINT_CODE_03_02(15),
        MPEG4_POINT_CODE_03_03(16),
        MPEG4_POINT_CODE_03_04(17),
        MPEG4_POINT_CODE_03_05(18),
        MPEG4_POINT_CODE_03_06(19),
        MPEG4_POINT_CODE_03_07(20),
        MPEG4_POINT_CODE_03_08(21),
        MPEG4_POINT_CODE_03_09(22),
        MPEG4_POINT_CODE_03_10(23),
        MPEG4_POINT_CODE_03_11(24),
        MPEG4_POINT_CODE_03_12(25),
        MPEG4_POINT_CODE_03_13(26),
        MPEG4_POINT_CODE_03_14(27),
        MPEG4_POINT_CODE_04_01(28),
        MPEG4_POINT_CODE_04_02(29),
        MPEG4_POINT_CODE_04_03(30),
        MPEG4_POINT_CODE_04_04(31),
        MPEG4_POINT_CODE_04_05(32),
        MPEG4_POINT_CODE_04_06(33),
        MPEG4_POINT_CODE_05_01(34),
        MPEG4_POINT_CODE_05_02(35),
        MPEG4_POINT_CODE_05_03(36),
        MPEG4_POINT_CODE_05_04(37),
        MPEG4_POINT_CODE_06_01(38),
        MPEG4_POINT_CODE_06_02(39),
        MPEG4_POINT_CODE_06_03(40),
        MPEG4_POINT_CODE_06_04(41),
        MPEG4_POINT_CODE_07_01(42),
        MPEG4_POINT_CODE_08_01(43),
        MPEG4_POINT_CODE_08_02(44),
        MPEG4_POINT_CODE_08_03(45),
        MPEG4_POINT_CODE_08_04(46),
        MPEG4_POINT_CODE_08_05(47),
        MPEG4_POINT_CODE_08_06(48),
        MPEG4_POINT_CODE_08_07(49),
        MPEG4_POINT_CODE_08_08(50),
        MPEG4_POINT_CODE_08_09(51),
        MPEG4_POINT_CODE_08_10(52),
        MPEG4_POINT_CODE_09_01(53),
        MPEG4_POINT_CODE_09_02(54),
        MPEG4_POINT_CODE_09_03(55),
        MPEG4_POINT_CODE_09_04(56),
        MPEG4_POINT_CODE_09_05(57),
        MPEG4_POINT_CODE_09_06(58),
        MPEG4_POINT_CODE_09_07(59),
        MPEG4_POINT_CODE_09_08(60),
        MPEG4_POINT_CODE_09_09(61),
        MPEG4_POINT_CODE_09_10(62),
        MPEG4_POINT_CODE_09_11(63),
        MPEG4_POINT_CODE_09_12(64),
        MPEG4_POINT_CODE_09_13(65),
        MPEG4_POINT_CODE_09_14(66),
        MPEG4_POINT_CODE_09_15(67),
        MPEG4_POINT_CODE_10_01(68),
        MPEG4_POINT_CODE_10_02(69),
        MPEG4_POINT_CODE_10_03(70),
        MPEG4_POINT_CODE_10_04(71),
        MPEG4_POINT_CODE_10_05(72),
        MPEG4_POINT_CODE_10_06(73),
        MPEG4_POINT_CODE_10_07(74),
        MPEG4_POINT_CODE_10_08(75),
        MPEG4_POINT_CODE_10_09(76),
        MPEG4_POINT_CODE_10_10(77),
        MPEG4_POINT_CODE_11_01(78),
        MPEG4_POINT_CODE_11_02(79),
        MPEG4_POINT_CODE_11_03(80),
        MPEG4_POINT_CODE_11_04(81),
        MPEG4_POINT_CODE_11_05(82),
        MPEG4_POINT_CODE_11_06(83),
        MPEG4_POINT_CODE_12_01(84),
        MPEG4_POINT_CODE_12_02(85),
        MPEG4_POINT_CODE_12_03(86),
        MPEG4_POINT_CODE_12_04(87);

        private int code;

        MPEGFeaturePointCode(int i) {
            this.code = i;
        }

        public static MPEGFeaturePointCode fromCode(int i) {
            return (MPEGFeaturePointCode) EncodableEnum.fromCode(i, MPEGFeaturePointCode.class);
        }

        @Override // org.jmrtd.lds.iso39794.EncodableEnum
        public int getCode() {
            return this.code;
        }
    }

    static FaceImageLandmarkKind decodeAnthropometricLandmark(ASN1Encodable aSN1Encodable) {
        Map<Integer, ASN1Encodable> mapDecodeTaggedObjects = ASN1Util.decodeTaggedObjects(aSN1Encodable);
        if (!mapDecodeTaggedObjects.containsKey(0)) {
            return null;
        }
        Map<Integer, ASN1Encodable> mapDecodeTaggedObjects2 = ASN1Util.decodeTaggedObjects(mapDecodeTaggedObjects.get(0));
        if (mapDecodeTaggedObjects2.containsKey(0)) {
            return AnthropometricLandmarkNameCode.fromCode(ISO39794Util.decodeCodeFromChoiceExtensionBlockFallback(mapDecodeTaggedObjects2.get(0)).intValue());
        }
        if (mapDecodeTaggedObjects2.containsKey(1)) {
            return AnthropometricLandmarkPointNameCode.fromCode(ISO39794Util.decodeCodeFromChoiceExtensionBlockFallback(mapDecodeTaggedObjects2.get(1)).intValue());
        }
        if (mapDecodeTaggedObjects2.containsKey(2)) {
            return AnthropometricLandmarkPointIdCode.fromCode(ISO39794Util.decodeCodeFromChoiceExtensionBlockFallback(mapDecodeTaggedObjects2.get(2)).intValue());
        }
        return null;
    }

    static FaceImageLandmarkKind decodeLandmarkKind(ASN1Encodable aSN1Encodable) {
        Map<Integer, ASN1Encodable> mapDecodeTaggedObjects = ASN1Util.decodeTaggedObjects(aSN1Encodable);
        if (!mapDecodeTaggedObjects.containsKey(0)) {
            return null;
        }
        Map<Integer, ASN1Encodable> mapDecodeTaggedObjects2 = ASN1Util.decodeTaggedObjects(mapDecodeTaggedObjects.get(0));
        if (mapDecodeTaggedObjects2.containsKey(0)) {
            return MPEGFeaturePointCode.fromCode(ISO39794Util.decodeCodeFromChoiceExtensionBlockFallback(mapDecodeTaggedObjects2.get(0)).intValue());
        }
        if (!mapDecodeTaggedObjects2.containsKey(1)) {
            return null;
        }
        decodeAnthropometricLandmark(mapDecodeTaggedObjects2.get(1));
        return null;
    }

    static ASN1Encodable encodeAnthropmetricLandmark(FaceImageLandmarkKind faceImageLandmarkKind) {
        HashMap map = new HashMap();
        if (faceImageLandmarkKind instanceof AnthropometricLandmarkNameCode) {
            map.put(0, ISO39794Util.encodeCodeAsChoiceExtensionBlockFallback(((AnthropometricLandmarkNameCode) faceImageLandmarkKind).getCode()));
        } else if (faceImageLandmarkKind instanceof AnthropometricLandmarkPointNameCode) {
            map.put(1, ISO39794Util.encodeCodeAsChoiceExtensionBlockFallback(((AnthropometricLandmarkPointNameCode) faceImageLandmarkKind).getCode()));
        } else if (faceImageLandmarkKind instanceof AnthropometricLandmarkPointIdCode) {
            map.put(2, ISO39794Util.encodeCodeAsChoiceExtensionBlockFallback(((AnthropometricLandmarkPointIdCode) faceImageLandmarkKind).getCode()));
        }
        HashMap map2 = new HashMap();
        map2.put(0, ASN1Util.encodeTaggedObjects(map));
        return ASN1Util.encodeTaggedObjects(map2);
    }

    static ASN1Encodable encodeLandmarkKind(FaceImageLandmarkKind faceImageLandmarkKind) {
        HashMap map = new HashMap();
        if (faceImageLandmarkKind instanceof MPEGFeaturePointCode) {
            map.put(0, ISO39794Util.encodeCodeAsChoiceExtensionBlockFallback(((MPEGFeaturePointCode) faceImageLandmarkKind).getCode()));
        } else {
            map.put(1, encodeAnthropmetricLandmark(faceImageLandmarkKind));
        }
        HashMap map2 = new HashMap();
        map2.put(0, ASN1Util.encodeTaggedObjects(map));
        return ASN1Util.encodeTaggedObjects(map2);
    }

    boolean equals(Object obj2);

    int getCode();

    int hashCode();
}
