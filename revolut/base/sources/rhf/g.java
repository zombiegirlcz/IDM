package rhf;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g BEREAVEMENT_HOME;
    public static final g CHARITY_DETAILS;
    public static final g CREDIT_CARD_CASHBACK;
    public static final g CREDIT_CARD_HOME;
    public static final g HOME;
    public static final g JOINT_HOME;
    public static final g JUNIOR_HOME;
    public static final g OTHER;
    public static final g PRO;
    public static final g SEARCH;
    public static final g TEEN_HOME;
    public static final g TOTAL_WEALTH_HOME;
    public static final g VAULT_DETAILS;

    static {
        g gVar = new g("HOME", 0);
        HOME = gVar;
        g gVar2 = new g("TOTAL_WEALTH_HOME", 1);
        TOTAL_WEALTH_HOME = gVar2;
        g gVar3 = new g("CREDIT_CARD_HOME", 2);
        CREDIT_CARD_HOME = gVar3;
        g gVar4 = new g("CREDIT_CARD_CASHBACK", 3);
        CREDIT_CARD_CASHBACK = gVar4;
        g gVar5 = new g("JOINT_HOME", 4);
        JOINT_HOME = gVar5;
        g gVar6 = new g("BEREAVEMENT_HOME", 5);
        BEREAVEMENT_HOME = gVar6;
        g gVar7 = new g("JUNIOR_HOME", 6);
        JUNIOR_HOME = gVar7;
        g gVar8 = new g("TEEN_HOME", 7);
        TEEN_HOME = gVar8;
        g gVar9 = new g("VAULT_DETAILS", 8);
        VAULT_DETAILS = gVar9;
        g gVar10 = new g("CHARITY_DETAILS", 9);
        CHARITY_DETAILS = gVar10;
        g gVar11 = new g("SEARCH", 10);
        SEARCH = gVar11;
        g gVar12 = new g("PRO", 11);
        PRO = gVar12;
        g gVar13 = new g("OTHER", 12);
        OTHER = gVar13;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, gVar10, gVar11, gVar12, gVar13};
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
