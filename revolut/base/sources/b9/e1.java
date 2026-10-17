package b9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class e1 {
    private static final /* synthetic */ e1[] $VALUES;
    public static final e1 Italic;
    public static final e1 Normal;
    public static final e1 Oblique;

    static {
        e1 e1Var = new e1("Normal", 0);
        Normal = e1Var;
        e1 e1Var2 = new e1("Italic", 1);
        Italic = e1Var2;
        e1 e1Var3 = new e1("Oblique", 2);
        Oblique = e1Var3;
        $VALUES = new e1[]{e1Var, e1Var2, e1Var3};
    }

    public static e1 valueOf(String str) {
        return (e1) Enum.valueOf(e1.class, str);
    }

    public static e1[] values() {
        return (e1[]) $VALUES.clone();
    }
}
