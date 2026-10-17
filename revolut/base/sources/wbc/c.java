package wbc;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c CANCELLED;
    public static final c DELIVERED;
    public static final c IN_TRANSIT;
    public static final c MISSED_DELIVERY;
    public static final c ORDERED;
    public static final c PICK_UP_AVAILABLE;
    public static final c RETURNED;
    public static final c SHIPPED;
    private final boolean isFinal;

    static {
        c cVar = new c("ORDERED", 0, false);
        ORDERED = cVar;
        c cVar2 = new c("SHIPPED", 1, false);
        SHIPPED = cVar2;
        c cVar3 = new c("IN_TRANSIT", 2, false);
        IN_TRANSIT = cVar3;
        c cVar4 = new c("MISSED_DELIVERY", 3, false);
        MISSED_DELIVERY = cVar4;
        c cVar5 = new c("DELIVERED", 4, true);
        DELIVERED = cVar5;
        c cVar6 = new c("PICK_UP_AVAILABLE", 5, true);
        PICK_UP_AVAILABLE = cVar6;
        c cVar7 = new c("RETURNED", 6, true);
        RETURNED = cVar7;
        c cVar8 = new c("CANCELLED", 7, true);
        CANCELLED = cVar8;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
    }

    public c(String str, int i, boolean z) {
        this.isFinal = z;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final boolean a() {
        return this.isFinal;
    }
}
