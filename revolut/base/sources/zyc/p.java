package zyc;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class p {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;
    public static final p ACTION_REQUIRED;
    public static final p IN_REVIEW;
    public static final p SUBMITTED;
    public static final p UNKNOWN;
    public static final p VERIFIED;

    static {
        p pVar = new p("SUBMITTED", 0);
        SUBMITTED = pVar;
        p pVar2 = new p("IN_REVIEW", 1);
        IN_REVIEW = pVar2;
        p pVar3 = new p("VERIFIED", 2);
        VERIFIED = pVar3;
        p pVar4 = new p("ACTION_REQUIRED", 3);
        ACTION_REQUIRED = pVar4;
        p pVar5 = new p("UNKNOWN", 4);
        UNKNOWN = pVar5;
        p[] pVarArr = {pVar, pVar2, pVar3, pVar4, pVar5};
        $VALUES = pVarArr;
        $ENTRIES = vc.s.n(pVarArr);
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) $VALUES.clone();
    }
}
