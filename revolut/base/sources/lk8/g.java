package lk8;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g COMPLETED;
    public static final g COMPLETION_STARTED;
    public static final g CREATED;
    public static final g STARTED;

    static {
        g gVar = new g("CREATED", 0);
        CREATED = gVar;
        g gVar2 = new g("STARTED", 1);
        STARTED = gVar2;
        g gVar3 = new g("COMPLETION_STARTED", 2);
        COMPLETION_STARTED = gVar3;
        g gVar4 = new g("COMPLETED", 3);
        COMPLETED = gVar4;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4};
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
