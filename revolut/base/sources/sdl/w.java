package sdl;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class w {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ w[] $VALUES;
    public static final w ACTIVE;
    public static final w CREATED;
    public static final w OFFBOARDING;
    public static final w ONBOARDING;
    public static final w SUSPENDED;
    public static final w TERMINATED;

    static {
        w wVar = new w("CREATED", 0);
        CREATED = wVar;
        w wVar2 = new w("ONBOARDING", 1);
        ONBOARDING = wVar2;
        w wVar3 = new w("ACTIVE", 2);
        ACTIVE = wVar3;
        w wVar4 = new w("SUSPENDED", 3);
        SUSPENDED = wVar4;
        w wVar5 = new w("OFFBOARDING", 4);
        OFFBOARDING = wVar5;
        w wVar6 = new w("TERMINATED", 5);
        TERMINATED = wVar6;
        w[] wVarArr = {wVar, wVar2, wVar3, wVar4, wVar5, wVar6};
        $VALUES = wVarArr;
        $ENTRIES = vc.s.n(wVarArr);
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) $VALUES.clone();
    }
}
