package ulm;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class v1 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ v1[] $VALUES;

    @NotNull
    public static final u1 Companion;
    public static final v1 SSL_3_0;
    public static final v1 TLS_1_0;
    public static final v1 TLS_1_1;
    public static final v1 TLS_1_2;
    public static final v1 TLS_1_3;

    @NotNull
    private final String javaName;

    static {
        v1 v1Var = new v1("TLS_1_3", 0, "TLSv1.3");
        TLS_1_3 = v1Var;
        v1 v1Var2 = new v1("TLS_1_2", 1, "TLSv1.2");
        TLS_1_2 = v1Var2;
        v1 v1Var3 = new v1("TLS_1_1", 2, "TLSv1.1");
        TLS_1_1 = v1Var3;
        v1 v1Var4 = new v1("TLS_1_0", 3, "TLSv1");
        TLS_1_0 = v1Var4;
        v1 v1Var5 = new v1("SSL_3_0", 4, "SSLv3");
        SSL_3_0 = v1Var5;
        v1[] v1VarArr = {v1Var, v1Var2, v1Var3, v1Var4, v1Var5};
        $VALUES = v1VarArr;
        $ENTRIES = vc.s.n(v1VarArr);
        Companion = new u1();
    }

    public v1(String str, int i, String str2) {
        this.javaName = str2;
    }

    public static v1 valueOf(String str) {
        return (v1) Enum.valueOf(v1.class, str);
    }

    public static v1[] values() {
        return (v1[]) $VALUES.clone();
    }

    public final String a() {
        return this.javaName;
    }
}
