package h38;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d JOINT_ACCOUNT_PENDING_BANNER;
    public static final d JOINT_CARD;
    public static final d JOINT_INVEST;
    public static final d JOINT_SAVINGS;
    public static final d JOINT_SUBACCOUNT;
    public static final d STATEMENT;

    static {
        d dVar = new d("JOINT_ACCOUNT_PENDING_BANNER", 0);
        JOINT_ACCOUNT_PENDING_BANNER = dVar;
        d dVar2 = new d("STATEMENT", 1);
        STATEMENT = dVar2;
        d dVar3 = new d("JOINT_CARD", 2);
        JOINT_CARD = dVar3;
        d dVar4 = new d("JOINT_SUBACCOUNT", 3);
        JOINT_SUBACCOUNT = dVar4;
        d dVar5 = new d("JOINT_SAVINGS", 4);
        JOINT_SAVINGS = dVar5;
        d dVar6 = new d("JOINT_INVEST", 5);
        JOINT_INVEST = dVar6;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6};
        $VALUES = dVarArr;
        $ENTRIES = s.n(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
