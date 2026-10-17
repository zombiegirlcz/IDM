package e4d;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import lg.b;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Le4d/a;", "", "SECURITY", "CRYPTO", "COMMODITY", "FIAT", "feature_separate_favourites_item_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;

    @b("COMMODITY")
    public static final a COMMODITY;

    @b("CRYPTO")
    public static final a CRYPTO;

    @b("FIAT")
    public static final a FIAT;

    @b("SECURITY")
    public static final a SECURITY;

    static {
        a aVar = new a("SECURITY", 0);
        SECURITY = aVar;
        a aVar2 = new a("CRYPTO", 1);
        CRYPTO = aVar2;
        a aVar3 = new a("COMMODITY", 2);
        COMMODITY = aVar3;
        a aVar4 = new a("FIAT", 3);
        FIAT = aVar4;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
