package lbf;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class l {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final l ACCOUNT_IS_RESTRICTED;
    public static final l BUY_ORDER_BLOCK_ACTIVE;
    public static final l NOT_ONBOARDED_FOR_TRADING;
    public static final l UNKNOWN;

    static {
        l lVar = new l("NOT_ONBOARDED_FOR_TRADING", 0);
        NOT_ONBOARDED_FOR_TRADING = lVar;
        l lVar2 = new l("BUY_ORDER_BLOCK_ACTIVE", 1);
        BUY_ORDER_BLOCK_ACTIVE = lVar2;
        l lVar3 = new l("ACCOUNT_IS_RESTRICTED", 2);
        ACCOUNT_IS_RESTRICTED = lVar3;
        l lVar4 = new l("UNKNOWN", 3);
        UNKNOWN = lVar4;
        l[] lVarArr = {lVar, lVar2, lVar3, lVar4};
        $VALUES = lVarArr;
        $ENTRIES = s.n(lVarArr);
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }
}
