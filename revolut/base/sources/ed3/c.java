package ed3;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c ALREADY_UPGRADED;
    public static final c PLAN_NOT_AVAILABLE;
    public static final c UPGRADE_AVAILABLE;

    static {
        c cVar = new c("UPGRADE_AVAILABLE", 0);
        UPGRADE_AVAILABLE = cVar;
        c cVar2 = new c("PLAN_NOT_AVAILABLE", 1);
        PLAN_NOT_AVAILABLE = cVar2;
        c cVar3 = new c("ALREADY_UPGRADED", 2);
        ALREADY_UPGRADED = cVar3;
        c[] cVarArr = {cVar, cVar2, cVar3};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
