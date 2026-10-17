package xq2;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e ALL_FORMATS;
    public static final e AZTEC;
    public static final e CODABAR;
    public static final e CODE_128;
    public static final e CODE_39;
    public static final e CODE_93;
    public static final e DATA_MATRIX;
    public static final e EAN_13;
    public static final e EAN_8;
    public static final e ITF;
    public static final e PDF417;
    public static final e QR_CODE;
    public static final e UNKNOWN;
    public static final e UPC_A;
    public static final e UPC_E;

    static {
        e eVar = new e("UNKNOWN", 0);
        UNKNOWN = eVar;
        e eVar2 = new e("ALL_FORMATS", 1);
        ALL_FORMATS = eVar2;
        e eVar3 = new e("CODE_128", 2);
        CODE_128 = eVar3;
        e eVar4 = new e("CODE_39", 3);
        CODE_39 = eVar4;
        e eVar5 = new e("CODE_93", 4);
        CODE_93 = eVar5;
        e eVar6 = new e("CODABAR", 5);
        CODABAR = eVar6;
        e eVar7 = new e("DATA_MATRIX", 6);
        DATA_MATRIX = eVar7;
        e eVar8 = new e("EAN_13", 7);
        EAN_13 = eVar8;
        e eVar9 = new e("EAN_8", 8);
        EAN_8 = eVar9;
        e eVar10 = new e("ITF", 9);
        ITF = eVar10;
        e eVar11 = new e("QR_CODE", 10);
        QR_CODE = eVar11;
        e eVar12 = new e("UPC_A", 11);
        UPC_A = eVar12;
        e eVar13 = new e("UPC_E", 12);
        UPC_E = eVar13;
        e eVar14 = new e("PDF417", 13);
        PDF417 = eVar14;
        e eVar15 = new e("AZTEC", 14);
        AZTEC = eVar15;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9, eVar10, eVar11, eVar12, eVar13, eVar14, eVar15};
        $VALUES = eVarArr;
        $ENTRIES = s.n(eVarArr);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
