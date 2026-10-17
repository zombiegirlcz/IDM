package ecm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class o1 {
    private static final /* synthetic */ o1[] $VALUES;
    public static final o1 BIDI_STREAMING;
    public static final o1 CLIENT_STREAMING;
    public static final o1 SERVER_STREAMING;
    public static final o1 UNARY;
    public static final o1 UNKNOWN;

    static {
        o1 o1Var = new o1("UNARY", 0);
        UNARY = o1Var;
        o1 o1Var2 = new o1("CLIENT_STREAMING", 1);
        CLIENT_STREAMING = o1Var2;
        o1 o1Var3 = new o1("SERVER_STREAMING", 2);
        SERVER_STREAMING = o1Var3;
        o1 o1Var4 = new o1("BIDI_STREAMING", 3);
        BIDI_STREAMING = o1Var4;
        o1 o1Var5 = new o1("UNKNOWN", 4);
        UNKNOWN = o1Var5;
        $VALUES = new o1[]{o1Var, o1Var2, o1Var3, o1Var4, o1Var5};
    }

    public static o1 valueOf(String str) {
        return (o1) Enum.valueOf(o1.class, str);
    }

    public static o1[] values() {
        return (o1[]) $VALUES.clone();
    }
}
