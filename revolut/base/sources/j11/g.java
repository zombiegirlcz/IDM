package j11;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lj11/g;", "", "PREMIUM", "METAL", "ULTRA", "feature_crypto_challenge_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;

    @lg.b("METAL")
    public static final g METAL;

    @lg.b("PREMIUM")
    public static final g PREMIUM;

    @lg.b("ULTRA")
    public static final g ULTRA;

    static {
        g gVar = new g("PREMIUM", 0);
        PREMIUM = gVar;
        g gVar2 = new g("METAL", 1);
        METAL = gVar2;
        g gVar3 = new g("ULTRA", 2);
        ULTRA = gVar3;
        g[] gVarArr = {gVar, gVar2, gVar3};
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
