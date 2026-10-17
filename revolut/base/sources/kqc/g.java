package kqc;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g CANCELLED_BY_USER;
    public static final g EMPLOYER_NOT_FOUND;
    public static final g INTERNAL_ERROR;
    public static final g REJECTED_BY_COUNTERPARTY;
    public static final g SOURCE_ACCOUNT_NOT_FOUND;
    public static final g UNKNOWN;

    static {
        g gVar = new g("REJECTED_BY_COUNTERPARTY", 0);
        REJECTED_BY_COUNTERPARTY = gVar;
        g gVar2 = new g("CANCELLED_BY_USER", 1);
        CANCELLED_BY_USER = gVar2;
        g gVar3 = new g("EMPLOYER_NOT_FOUND", 2);
        EMPLOYER_NOT_FOUND = gVar3;
        g gVar4 = new g("SOURCE_ACCOUNT_NOT_FOUND", 3);
        SOURCE_ACCOUNT_NOT_FOUND = gVar4;
        g gVar5 = new g("INTERNAL_ERROR", 4);
        INTERNAL_ERROR = gVar5;
        g gVar6 = new g("UNKNOWN", 5);
        UNKNOWN = gVar6;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6};
        $VALUES = gVarArr;
        $ENTRIES = s.n(gVarArr);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}
