package qfm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class e1 implements kfm.g {
    private static final /* synthetic */ e1[] $VALUES;
    public static final e1 INSTANCE;

    static {
        e1 e1Var = new e1("INSTANCE", 0);
        INSTANCE = e1Var;
        $VALUES = new e1[]{e1Var};
    }

    public static e1 valueOf(String str) {
        return (e1) Enum.valueOf(e1.class, str);
    }

    public static e1[] values() {
        return (e1[]) $VALUES.clone();
    }

    @Override // kfm.g
    public final void accept(Object obj2) {
        ((dom.b) obj2).a(Long.MAX_VALUE);
    }
}
