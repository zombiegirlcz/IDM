package pni;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g REQUEST_ANOTHER_METHOD;
    public static final g RESEND_ONLY;
    public static final g SELECT_ANOTHER_METHOD;

    static {
        g gVar = new g("REQUEST_ANOTHER_METHOD", 0);
        REQUEST_ANOTHER_METHOD = gVar;
        g gVar2 = new g("RESEND_ONLY", 1);
        RESEND_ONLY = gVar2;
        g gVar3 = new g("SELECT_ANOTHER_METHOD", 2);
        SELECT_ANOTHER_METHOD = gVar3;
        g[] gVarArr = {gVar, gVar2, gVar3};
        $VALUES = gVarArr;
        $ENTRIES = vc.s.n(gVarArr);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}
