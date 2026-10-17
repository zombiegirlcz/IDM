package d9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class r0 {
    private static final /* synthetic */ r0[] $VALUES;
    public static final r0 EXISTING_PROPERTY;
    public static final r0 EXTERNAL_PROPERTY;
    public static final r0 PROPERTY;
    public static final r0 WRAPPER_ARRAY;
    public static final r0 WRAPPER_OBJECT;

    static {
        r0 r0Var = new r0("PROPERTY", 0);
        PROPERTY = r0Var;
        r0 r0Var2 = new r0("WRAPPER_OBJECT", 1);
        WRAPPER_OBJECT = r0Var2;
        r0 r0Var3 = new r0("WRAPPER_ARRAY", 2);
        WRAPPER_ARRAY = r0Var3;
        r0 r0Var4 = new r0("EXTERNAL_PROPERTY", 3);
        EXTERNAL_PROPERTY = r0Var4;
        r0 r0Var5 = new r0("EXISTING_PROPERTY", 4);
        EXISTING_PROPERTY = r0Var5;
        $VALUES = new r0[]{r0Var, r0Var2, r0Var3, r0Var4, r0Var5};
    }

    public static r0 valueOf(String str) {
        return (r0) Enum.valueOf(r0.class, str);
    }

    public static r0[] values() {
        return (r0[]) $VALUES.clone();
    }
}
