package qbf;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lqbf/i;", "", "TOO_EXPENSIVE", "DONT_LIKE_IT", "DONT_USE_ENOUGH", "MISSING_FEATURES", "USING_ANOTHER_APP", "feature_trading_add_ons_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;

    @lg.b("DONT_LIKE_IT")
    public static final i DONT_LIKE_IT;

    @lg.b("DONT_USE_ENOUGH")
    public static final i DONT_USE_ENOUGH;

    @lg.b("MISSING_FEATURES")
    public static final i MISSING_FEATURES;

    @lg.b("TOO_EXPENSIVE")
    public static final i TOO_EXPENSIVE;

    @lg.b("USING_ANOTHER_APP")
    public static final i USING_ANOTHER_APP;

    static {
        i iVar = new i("TOO_EXPENSIVE", 0);
        TOO_EXPENSIVE = iVar;
        i iVar2 = new i("DONT_LIKE_IT", 1);
        DONT_LIKE_IT = iVar2;
        i iVar3 = new i("DONT_USE_ENOUGH", 2);
        DONT_USE_ENOUGH = iVar3;
        i iVar4 = new i("MISSING_FEATURES", 3);
        MISSING_FEATURES = iVar4;
        i iVar5 = new i("USING_ANOTHER_APP", 4);
        USING_ANOTHER_APP = iVar5;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5};
        $VALUES = iVarArr;
        $ENTRIES = vc.s.n(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }
}
