package elm;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d BLOCKING;
    public static final d CPU_ACQUIRED;
    public static final d DORMANT;
    public static final d PARKING;
    public static final d TERMINATED;

    static {
        d dVar = new d("CPU_ACQUIRED", 0);
        CPU_ACQUIRED = dVar;
        d dVar2 = new d("BLOCKING", 1);
        BLOCKING = dVar2;
        d dVar3 = new d("PARKING", 2);
        PARKING = dVar3;
        d dVar4 = new d("DORMANT", 3);
        DORMANT = dVar4;
        d dVar5 = new d("TERMINATED", 4);
        TERMINATED = dVar5;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5};
        $VALUES = dVarArr;
        $ENTRIES = s.n(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
