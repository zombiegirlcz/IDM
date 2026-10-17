package yte;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class n {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;
    public static final n CARD_CHECKOUT;
    public static final n CARD_CHECKOUT_IND_GLOBAL;
    public static final n CURRENT;
    public static final n INVEST;
    public static final n JOINT;
    public static final n PRO;
    public static final n REVPAY;
    public static final n REVX;
    public static final n SAVINGS;
    public static final n THREE_DS;

    static {
        n nVar = new n("CURRENT", 0);
        CURRENT = nVar;
        n nVar2 = new n("PRO", 1);
        PRO = nVar2;
        n nVar3 = new n("SAVINGS", 2);
        SAVINGS = nVar3;
        n nVar4 = new n("INVEST", 3);
        INVEST = nVar4;
        n nVar5 = new n("JOINT", 4);
        JOINT = nVar5;
        n nVar6 = new n("CARD_CHECKOUT", 5);
        CARD_CHECKOUT = nVar6;
        n nVar7 = new n("THREE_DS", 6);
        THREE_DS = nVar7;
        n nVar8 = new n("REVPAY", 7);
        REVPAY = nVar8;
        n nVar9 = new n("REVX", 8);
        REVX = nVar9;
        n nVar10 = new n("CARD_CHECKOUT_IND_GLOBAL", 9);
        CARD_CHECKOUT_IND_GLOBAL = nVar10;
        n[] nVarArr = {nVar, nVar2, nVar3, nVar4, nVar5, nVar6, nVar7, nVar8, nVar9, nVar10};
        $VALUES = nVarArr;
        $ENTRIES = s.n(nVarArr);
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }
}
