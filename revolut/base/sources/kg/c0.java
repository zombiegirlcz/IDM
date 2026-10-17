package kg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {
    private static final /* synthetic */ c0[] $VALUES;
    public static final c0 DEFAULT;
    public static final c0 STRING;

    static {
        c0 c0Var = new c0() { // from class: kg.a0
        };
        DEFAULT = c0Var;
        c0 c0Var2 = new c0() { // from class: kg.b0
        };
        STRING = c0Var2;
        $VALUES = new c0[]{c0Var, c0Var2};
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) $VALUES.clone();
    }
}
