package ll4;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d ACTION_REQUIRED;
    public static final d IN_PROGRESS;
    public static final d NO_ACTIVE_APPLICATION;
    public static final d TERMINATED;
    public static final d UNKNOWN;
    public static final d WAITING;

    static {
        d dVar = new d("ACTION_REQUIRED", 0);
        ACTION_REQUIRED = dVar;
        d dVar2 = new d("IN_PROGRESS", 1);
        IN_PROGRESS = dVar2;
        d dVar3 = new d("TERMINATED", 2);
        TERMINATED = dVar3;
        d dVar4 = new d("WAITING", 3);
        WAITING = dVar4;
        d dVar5 = new d("NO_ACTIVE_APPLICATION", 4);
        NO_ACTIVE_APPLICATION = dVar5;
        d dVar6 = new d("UNKNOWN", 5);
        UNKNOWN = dVar6;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6};
        $VALUES = dVarArr;
        $ENTRIES = vc.s.n(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
