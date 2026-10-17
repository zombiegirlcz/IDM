package ulm;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class h1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h1[] $VALUES;

    @NotNull
    public static final g1 Companion;
    public static final h1 H2_PRIOR_KNOWLEDGE;
    public static final h1 HTTP_1_0;
    public static final h1 HTTP_1_1;
    public static final h1 HTTP_2;
    public static final h1 HTTP_3;
    public static final h1 QUIC;

    @yhm.d
    public static final h1 SPDY_3;

    @NotNull
    private final String protocol;

    static {
        h1 h1Var = new h1("HTTP_1_0", 0, "http/1.0");
        HTTP_1_0 = h1Var;
        h1 h1Var2 = new h1("HTTP_1_1", 1, "http/1.1");
        HTTP_1_1 = h1Var2;
        h1 h1Var3 = new h1("SPDY_3", 2, "spdy/3.1");
        SPDY_3 = h1Var3;
        h1 h1Var4 = new h1("HTTP_2", 3, "h2");
        HTTP_2 = h1Var4;
        h1 h1Var5 = new h1("H2_PRIOR_KNOWLEDGE", 4, "h2_prior_knowledge");
        H2_PRIOR_KNOWLEDGE = h1Var5;
        h1 h1Var6 = new h1("QUIC", 5, "quic");
        QUIC = h1Var6;
        h1 h1Var7 = new h1("HTTP_3", 6, "h3");
        HTTP_3 = h1Var7;
        h1[] h1VarArr = {h1Var, h1Var2, h1Var3, h1Var4, h1Var5, h1Var6, h1Var7};
        $VALUES = h1VarArr;
        $ENTRIES = vc.s.n(h1VarArr);
        Companion = new g1();
    }

    public h1(String str, int i, String str2) {
        this.protocol = str2;
    }

    public static h1 valueOf(String str) {
        return (h1) Enum.valueOf(h1.class, str);
    }

    public static h1[] values() {
        return (h1[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.protocol;
    }
}
