package b9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class j0 {
    private static final /* synthetic */ j0[] $VALUES;

    /* JADX INFO: renamed from: pad, reason: collision with root package name */
    public static final j0 f13370pad;
    public static final j0 reflect;
    public static final j0 repeat;

    static {
        j0 j0Var = new j0("pad", 0);
        f13370pad = j0Var;
        j0 j0Var2 = new j0("reflect", 1);
        reflect = j0Var2;
        j0 j0Var3 = new j0("repeat", 2);
        repeat = j0Var3;
        $VALUES = new j0[]{j0Var, j0Var2, j0Var3};
    }

    public static j0 valueOf(String str) {
        return (j0) Enum.valueOf(j0.class, str);
    }

    public static j0[] values() {
        return (j0[]) $VALUES.clone();
    }
}
