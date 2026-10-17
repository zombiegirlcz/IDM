package wk5;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g CREATED;
    public static final g PENDING_VALIDATION;
    public static final g PENDING_VALIDATION_FAILED;
    public static final g PRE_CHECK;
    public static final g VALIDATED;

    static {
        g gVar = new g("CREATED", 0);
        CREATED = gVar;
        g gVar2 = new g("PRE_CHECK", 1);
        PRE_CHECK = gVar2;
        g gVar3 = new g("PENDING_VALIDATION", 2);
        PENDING_VALIDATION = gVar3;
        g gVar4 = new g("PENDING_VALIDATION_FAILED", 3);
        PENDING_VALIDATION_FAILED = gVar4;
        g gVar5 = new g("VALIDATED", 4);
        VALIDATED = gVar5;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5};
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
