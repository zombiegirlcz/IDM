package pgm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class n0 implements igm.g {
    private static final /* synthetic */ n0[] $VALUES;
    public static final n0 INSTANCE;

    static {
        n0 n0Var = new n0("INSTANCE", 0);
        INSTANCE = n0Var;
        $VALUES = new n0[]{n0Var};
    }

    public static n0 valueOf(String str) {
        return (n0) Enum.valueOf(n0.class, str);
    }

    public static n0[] values() {
        return (n0[]) $VALUES.clone();
    }

    @Override // igm.g
    public final void accept(Object obj2) {
        ((dom.b) obj2).a(Long.MAX_VALUE);
    }
}
