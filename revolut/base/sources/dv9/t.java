package dv9;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class t {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ t[] $VALUES;
    public static final t GROUP_BILL;
    public static final t GROUP_SETTLEMENT;
    public static final t MESSAGE;
    public static final t MONEY_REQUEST;
    public static final t P2P_TRANSFER;
    public static final t TRANSFER_LINK;
    public static final t UNKNOWN;

    static {
        t tVar = new t("MESSAGE", 0);
        MESSAGE = tVar;
        t tVar2 = new t("MONEY_REQUEST", 1);
        MONEY_REQUEST = tVar2;
        t tVar3 = new t("P2P_TRANSFER", 2);
        P2P_TRANSFER = tVar3;
        t tVar4 = new t("TRANSFER_LINK", 3);
        TRANSFER_LINK = tVar4;
        t tVar5 = new t("GROUP_BILL", 4);
        GROUP_BILL = tVar5;
        t tVar6 = new t("GROUP_SETTLEMENT", 5);
        GROUP_SETTLEMENT = tVar6;
        t tVar7 = new t("UNKNOWN", 6);
        UNKNOWN = tVar7;
        t[] tVarArr = {tVar, tVar2, tVar3, tVar4, tVar5, tVar6, tVar7};
        $VALUES = tVarArr;
        $ENTRIES = vc.s.n(tVarArr);
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) $VALUES.clone();
    }
}
