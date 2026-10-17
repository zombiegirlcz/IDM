package ff;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class f {
    private static final /* synthetic */ f[] $VALUES;
    public static final f AUTH_ERROR;
    public static final f BAD_CONFIG;
    public static final f OK;

    static {
        f fVar = new f("OK", 0);
        OK = fVar;
        f fVar2 = new f("BAD_CONFIG", 1);
        BAD_CONFIG = fVar2;
        f fVar3 = new f("AUTH_ERROR", 2);
        AUTH_ERROR = fVar3;
        $VALUES = new f[]{fVar, fVar2, fVar3};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
