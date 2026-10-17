package jlc;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class t {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ t[] $VALUES;
    public static final t PORTFOLIO_ALLOCATIONS;
    public static final t PORTFOLIO_DETAILS;
    public static final t PREFUNDED_PORTFOLIO_DETAILS;
    public static final t PROJECTIONS;
    public static final t TEMPLATES;

    static {
        t tVar = new t("PORTFOLIO_ALLOCATIONS", 0);
        PORTFOLIO_ALLOCATIONS = tVar;
        t tVar2 = new t("PREFUNDED_PORTFOLIO_DETAILS", 1);
        PREFUNDED_PORTFOLIO_DETAILS = tVar2;
        t tVar3 = new t("PORTFOLIO_DETAILS", 2);
        PORTFOLIO_DETAILS = tVar3;
        t tVar4 = new t("PROJECTIONS", 3);
        PROJECTIONS = tVar4;
        t tVar5 = new t("TEMPLATES", 4);
        TEMPLATES = tVar5;
        t[] tVarArr = {tVar, tVar2, tVar3, tVar4, tVar5};
        $VALUES = tVarArr;
        $ENTRIES = vc.s.n(tVarArr);
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) $VALUES.clone();
    }
}
