package yte;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class m {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m AKAHU;
    public static final m CARD;
    public static final m GMO_PG_BANK_DIRECT;
    public static final m MCY_NET_BANKING;
    public static final m MCY_UPI_APP;
    public static final m NET_BANKING;
    public static final m OPEN_BANKING;
    public static final m PAY_TO;
    public static final m PIX_SMART_TRANSFER;
    public static final m UPI_APP;

    static {
        m mVar = new m("CARD", 0);
        CARD = mVar;
        m mVar2 = new m("OPEN_BANKING", 1);
        OPEN_BANKING = mVar2;
        m mVar3 = new m("PAY_TO", 2);
        PAY_TO = mVar3;
        m mVar4 = new m("MCY_UPI_APP", 3);
        MCY_UPI_APP = mVar4;
        m mVar5 = new m("MCY_NET_BANKING", 4);
        MCY_NET_BANKING = mVar5;
        m mVar6 = new m("UPI_APP", 5);
        UPI_APP = mVar6;
        m mVar7 = new m("NET_BANKING", 6);
        NET_BANKING = mVar7;
        m mVar8 = new m("PIX_SMART_TRANSFER", 7);
        PIX_SMART_TRANSFER = mVar8;
        m mVar9 = new m("AKAHU", 8);
        AKAHU = mVar9;
        m mVar10 = new m("GMO_PG_BANK_DIRECT", 9);
        GMO_PG_BANK_DIRECT = mVar10;
        m[] mVarArr = {mVar, mVar2, mVar3, mVar4, mVar5, mVar6, mVar7, mVar8, mVar9, mVar10};
        $VALUES = mVarArr;
        $ENTRIES = s.n(mVarArr);
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }
}
