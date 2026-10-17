package qbf;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lqbf/n;", "", "NOT_ONBOARDED_FOR_TRADING", "BUY_ORDER_BLOCK_ACTIVE", "ACCOUNT_IS_RESTRICTED", "UNKNOWN", "feature_trading_add_ons_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;

    @lg.b("ACCOUNT_IS_RESTRICTED")
    public static final n ACCOUNT_IS_RESTRICTED;

    @lg.b("BUY_ORDER_BLOCK_ACTIVE")
    public static final n BUY_ORDER_BLOCK_ACTIVE;

    @lg.b("NOT_ONBOARDED_FOR_TRADING")
    public static final n NOT_ONBOARDED_FOR_TRADING;

    @lg.b("UNKNOWN")
    @he0.b
    public static final n UNKNOWN;

    static {
        n nVar = new n("NOT_ONBOARDED_FOR_TRADING", 0);
        NOT_ONBOARDED_FOR_TRADING = nVar;
        n nVar2 = new n("BUY_ORDER_BLOCK_ACTIVE", 1);
        BUY_ORDER_BLOCK_ACTIVE = nVar2;
        n nVar3 = new n("ACCOUNT_IS_RESTRICTED", 2);
        ACCOUNT_IS_RESTRICTED = nVar3;
        n nVar4 = new n("UNKNOWN", 3);
        UNKNOWN = nVar4;
        n[] nVarArr = {nVar, nVar2, nVar3, nVar4};
        $VALUES = nVarArr;
        $ENTRIES = vc.s.n(nVarArr);
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }
}
