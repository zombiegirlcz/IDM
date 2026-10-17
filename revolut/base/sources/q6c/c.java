package q6c;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c ADJUSTMENT;
    public static final c CHARGE;
    public static final c DISCOUNT;
    public static final c GIFT;
    public static final c MISC;
    public static final c PHYSICAL;
    public static final c REFUND;
    public static final c SERVICE;
    public static final c TAX;

    static {
        c cVar = new c("PHYSICAL", 0);
        PHYSICAL = cVar;
        c cVar2 = new c("SERVICE", 1);
        SERVICE = cVar2;
        c cVar3 = new c("TAX", 2);
        TAX = cVar3;
        c cVar4 = new c("DISCOUNT", 3);
        DISCOUNT = cVar4;
        c cVar5 = new c("CHARGE", 4);
        CHARGE = cVar5;
        c cVar6 = new c("REFUND", 5);
        REFUND = cVar6;
        c cVar7 = new c("ADJUSTMENT", 6);
        ADJUSTMENT = cVar7;
        c cVar8 = new c("GIFT", 7);
        GIFT = cVar8;
        c cVar9 = new c("MISC", 8);
        MISC = cVar9;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9};
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
