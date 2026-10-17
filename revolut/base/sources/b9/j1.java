package b9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class j1 {
    private static final /* synthetic */ j1[] $VALUES;
    public static final j1 Blink;
    public static final j1 LineThrough;
    public static final j1 None;
    public static final j1 Overline;
    public static final j1 Underline;

    static {
        j1 j1Var = new j1("None", 0);
        None = j1Var;
        j1 j1Var2 = new j1("Underline", 1);
        Underline = j1Var2;
        j1 j1Var3 = new j1("Overline", 2);
        Overline = j1Var3;
        j1 j1Var4 = new j1("LineThrough", 3);
        LineThrough = j1Var4;
        j1 j1Var5 = new j1("Blink", 4);
        Blink = j1Var5;
        $VALUES = new j1[]{j1Var, j1Var2, j1Var3, j1Var4, j1Var5};
    }

    public static j1 valueOf(String str) {
        return (j1) Enum.valueOf(j1.class, str);
    }

    public static j1[] values() {
        return (j1[]) $VALUES.clone();
    }
}
