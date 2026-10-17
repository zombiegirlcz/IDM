package p6l;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lp6l/t;", "", "ATM_WITHDRAWAL", "ECOMMERCE", "CONTACTLESS", "POINT_OF_SALE", "feature_shared_cards_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ t[] $VALUES;

    @lg.b("ATM_WITHDRAWAL")
    public static final t ATM_WITHDRAWAL;

    @lg.b("CONTACTLESS")
    public static final t CONTACTLESS;

    @lg.b("ECOMMERCE")
    public static final t ECOMMERCE;

    @lg.b("POINT_OF_SALE")
    public static final t POINT_OF_SALE;

    static {
        t tVar = new t("ATM_WITHDRAWAL", 0);
        ATM_WITHDRAWAL = tVar;
        t tVar2 = new t("ECOMMERCE", 1);
        ECOMMERCE = tVar2;
        t tVar3 = new t("CONTACTLESS", 2);
        CONTACTLESS = tVar3;
        t tVar4 = new t("POINT_OF_SALE", 3);
        POINT_OF_SALE = tVar4;
        t[] tVarArr = {tVar, tVar2, tVar3, tVar4};
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
