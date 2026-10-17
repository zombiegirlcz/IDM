package cgi;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class s {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ s[] $VALUES;
    public static final s BUNK_BED;
    public static final s CHILD_BED;
    public static final s DOUBLE_BED;
    public static final s KING_BED;
    public static final s MURPHY_BE;
    public static final s QUEEN_BED;
    public static final s SLEEP_SOFA_FUTON;
    public static final s TWIN_SINGLE_BED;
    public static final s UNKNOWN;

    static {
        s sVar = new s("KING_BED", 0);
        KING_BED = sVar;
        s sVar2 = new s("QUEEN_BED", 1);
        QUEEN_BED = sVar2;
        s sVar3 = new s("SLEEP_SOFA_FUTON", 2);
        SLEEP_SOFA_FUTON = sVar3;
        s sVar4 = new s("TWIN_SINGLE_BED", 3);
        TWIN_SINGLE_BED = sVar4;
        s sVar5 = new s("BUNK_BED", 4);
        BUNK_BED = sVar5;
        s sVar6 = new s("DOUBLE_BED", 5);
        DOUBLE_BED = sVar6;
        s sVar7 = new s("CHILD_BED", 6);
        CHILD_BED = sVar7;
        s sVar8 = new s("MURPHY_BE", 7);
        MURPHY_BE = sVar8;
        s sVar9 = new s("UNKNOWN", 8);
        UNKNOWN = sVar9;
        s[] sVarArr = {sVar, sVar2, sVar3, sVar4, sVar5, sVar6, sVar7, sVar8, sVar9};
        $VALUES = sVarArr;
        $ENTRIES = vc.s.n(sVarArr);
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) $VALUES.clone();
    }
}
