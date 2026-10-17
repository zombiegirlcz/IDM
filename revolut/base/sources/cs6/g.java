package cs6;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g ALL_SALES;
    public static final g ECOMMERCE;
    public static final g INVOICES;
    public static final g IN_PERSON;
    public static final g PAYMENT_LINKS;
    public static final g RECURRING_INVOICES;

    static {
        g gVar = new g("ALL_SALES", 0);
        ALL_SALES = gVar;
        g gVar2 = new g("PAYMENT_LINKS", 1);
        PAYMENT_LINKS = gVar2;
        g gVar3 = new g("INVOICES", 2);
        INVOICES = gVar3;
        g gVar4 = new g("RECURRING_INVOICES", 3);
        RECURRING_INVOICES = gVar4;
        g gVar5 = new g("IN_PERSON", 4);
        IN_PERSON = gVar5;
        g gVar6 = new g("ECOMMERCE", 5);
        ECOMMERCE = gVar6;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6};
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
