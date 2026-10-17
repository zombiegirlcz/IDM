package t1e;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class z {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ z[] $VALUES;
    public static final z CANCELLED;
    public static final z DELIVERED;
    public static final z FAILED;
    public static final z IN_PROGRESS;
    public static final z IN_TRANSIT;
    public static final z PENDING;
    public static final z SHIPPED;
    public static final z SUBMITTED;
    public static final z UNKNOWN;

    static {
        z zVar = new z("PENDING", 0);
        PENDING = zVar;
        z zVar2 = new z("SUBMITTED", 1);
        SUBMITTED = zVar2;
        z zVar3 = new z("IN_PROGRESS", 2);
        IN_PROGRESS = zVar3;
        z zVar4 = new z("IN_TRANSIT", 3);
        IN_TRANSIT = zVar4;
        z zVar5 = new z("SHIPPED", 4);
        SHIPPED = zVar5;
        z zVar6 = new z("DELIVERED", 5);
        DELIVERED = zVar6;
        z zVar7 = new z("CANCELLED", 6);
        CANCELLED = zVar7;
        z zVar8 = new z("FAILED", 7);
        FAILED = zVar8;
        z zVar9 = new z("UNKNOWN", 8);
        UNKNOWN = zVar9;
        z[] zVarArr = {zVar, zVar2, zVar3, zVar4, zVar5, zVar6, zVar7, zVar8, zVar9};
        $VALUES = zVarArr;
        $ENTRIES = vc.s.n(zVarArr);
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) $VALUES.clone();
    }
}
