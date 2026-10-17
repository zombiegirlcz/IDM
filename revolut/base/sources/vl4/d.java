package vl4;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d FULLY_PAID;
    public static final d LEFT_TO_PAY;
    public static final d OVERDUE;
    public static final d PARTIALLY_PAID;
    public static final d UNKNOWN;
    public static final d UPCOMING;

    static {
        d dVar = new d("OVERDUE", 0);
        OVERDUE = dVar;
        d dVar2 = new d("LEFT_TO_PAY", 1);
        LEFT_TO_PAY = dVar2;
        d dVar3 = new d("FULLY_PAID", 2);
        FULLY_PAID = dVar3;
        d dVar4 = new d("PARTIALLY_PAID", 3);
        PARTIALLY_PAID = dVar4;
        d dVar5 = new d("UPCOMING", 4);
        UPCOMING = dVar5;
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
