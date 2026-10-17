package h93;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class r {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ r[] $VALUES;
    public static final r ACTIVE;
    public static final r BLOCKED;
    public static final r COMPROMISED;
    public static final r CREATED;
    public static final r DELETED;
    public static final r EXPIRED;
    public static final r LOCKED;
    public static final r LOST;
    public static final r NONE;
    public static final r ORDERED;
    public static final r PENDING;
    public static final r TERMINATED;

    static {
        r rVar = new r("NONE", 0);
        NONE = rVar;
        r rVar2 = new r("ACTIVE", 1);
        ACTIVE = rVar2;
        r rVar3 = new r("BLOCKED", 2);
        BLOCKED = rVar3;
        r rVar4 = new r("LOST", 3);
        LOST = rVar4;
        r rVar5 = new r("EXPIRED", 4);
        EXPIRED = rVar5;
        r rVar6 = new r("LOCKED", 5);
        LOCKED = rVar6;
        r rVar7 = new r("COMPROMISED", 6);
        COMPROMISED = rVar7;
        r rVar8 = new r("TERMINATED", 7);
        TERMINATED = rVar8;
        r rVar9 = new r("DELETED", 8);
        DELETED = rVar9;
        r rVar10 = new r("ORDERED", 9);
        ORDERED = rVar10;
        r rVar11 = new r("CREATED", 10);
        CREATED = rVar11;
        r rVar12 = new r("PENDING", 11);
        PENDING = rVar12;
        r[] rVarArr = {rVar, rVar2, rVar3, rVar4, rVar5, rVar6, rVar7, rVar8, rVar9, rVar10, rVar11, rVar12};
        $VALUES = rVarArr;
        $ENTRIES = vc.s.n(rVarArr);
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }
}
