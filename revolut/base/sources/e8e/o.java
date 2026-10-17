package e8e;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class o {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    public static final o ANOTHER_SUBACCOUNT;
    public static final o BLOCKED;
    public static final o CURRENT;
    public static final o DEBIT;
    public static final o HIDE;
    public static final o LINKED_CARD;
    public static final o LINKED_PARTNER_CARD;
    public static final o RECURRING;
    public static final o SUBSCRIPTION;

    static {
        o oVar = new o("LINKED_CARD", 0);
        LINKED_CARD = oVar;
        o oVar2 = new o("LINKED_PARTNER_CARD", 1);
        LINKED_PARTNER_CARD = oVar2;
        o oVar3 = new o("CURRENT", 2);
        CURRENT = oVar3;
        o oVar4 = new o("RECURRING", 3);
        RECURRING = oVar4;
        o oVar5 = new o("DEBIT", 4);
        DEBIT = oVar5;
        o oVar6 = new o("SUBSCRIPTION", 5);
        SUBSCRIPTION = oVar6;
        o oVar7 = new o("ANOTHER_SUBACCOUNT", 6);
        ANOTHER_SUBACCOUNT = oVar7;
        o oVar8 = new o("HIDE", 7);
        HIDE = oVar8;
        o oVar9 = new o("BLOCKED", 8);
        BLOCKED = oVar9;
        o[] oVarArr = {oVar, oVar2, oVar3, oVar4, oVar5, oVar6, oVar7, oVar8, oVar9};
        $VALUES = oVarArr;
        $ENTRIES = vc.s.n(oVarArr);
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }
}
