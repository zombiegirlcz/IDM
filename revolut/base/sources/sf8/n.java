package sf8;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class n {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;
    public static final n ADD_MONEY;
    public static final n MOVE_MONEY;
    public static final n PARTNERSHIPS;
    public static final n SHOW_PROFILE;
    public static final n SHOW_QR_CODE;
    public static final n SHOW_STATEMENT;
    public static final n WITHDRAW_MONEY;

    static {
        n nVar = new n("ADD_MONEY", 0);
        ADD_MONEY = nVar;
        n nVar2 = new n("WITHDRAW_MONEY", 1);
        WITHDRAW_MONEY = nVar2;
        n nVar3 = new n("MOVE_MONEY", 2);
        MOVE_MONEY = nVar3;
        n nVar4 = new n("SHOW_QR_CODE", 3);
        SHOW_QR_CODE = nVar4;
        n nVar5 = new n("SHOW_STATEMENT", 4);
        SHOW_STATEMENT = nVar5;
        n nVar6 = new n("SHOW_PROFILE", 5);
        SHOW_PROFILE = nVar6;
        n nVar7 = new n("PARTNERSHIPS", 6);
        PARTNERSHIPS = nVar7;
        n[] nVarArr = {nVar, nVar2, nVar3, nVar4, nVar5, nVar6, nVar7};
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
