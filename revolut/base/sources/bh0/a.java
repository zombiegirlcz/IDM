package bh0;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ALL_FORMATS;
    public static final a AZTEC;
    public static final a CODABAR;
    public static final a CODE_128;
    public static final a CODE_39;
    public static final a CODE_93;
    public static final a DATA_MATRIX;
    public static final a EAN_13;
    public static final a EAN_8;
    public static final a ITF;
    public static final a PDF417;
    public static final a QR_CODE;
    public static final a UNKNOWN;
    public static final a UPC_A;
    public static final a UPC_E;

    static {
        a aVar = new a("UNKNOWN", 0);
        UNKNOWN = aVar;
        a aVar2 = new a("ALL_FORMATS", 1);
        ALL_FORMATS = aVar2;
        a aVar3 = new a("CODE_128", 2);
        CODE_128 = aVar3;
        a aVar4 = new a("CODE_39", 3);
        CODE_39 = aVar4;
        a aVar5 = new a("CODE_93", 4);
        CODE_93 = aVar5;
        a aVar6 = new a("CODABAR", 5);
        CODABAR = aVar6;
        a aVar7 = new a("DATA_MATRIX", 6);
        DATA_MATRIX = aVar7;
        a aVar8 = new a("EAN_13", 7);
        EAN_13 = aVar8;
        a aVar9 = new a("EAN_8", 8);
        EAN_8 = aVar9;
        a aVar10 = new a("ITF", 9);
        ITF = aVar10;
        a aVar11 = new a("QR_CODE", 10);
        QR_CODE = aVar11;
        a aVar12 = new a("UPC_A", 11);
        UPC_A = aVar12;
        a aVar13 = new a("UPC_E", 12);
        UPC_E = aVar13;
        a aVar14 = new a("PDF417", 13);
        PDF417 = aVar14;
        a aVar15 = new a("AZTEC", 14);
        AZTEC = aVar15;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
