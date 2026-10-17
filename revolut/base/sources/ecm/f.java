package ecm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class f {
    private static final /* synthetic */ f[] $VALUES;
    public static final f DEBUG;
    public static final f ERROR;
    public static final f INFO;
    public static final f WARNING;

    static {
        f fVar = new f("DEBUG", 0);
        DEBUG = fVar;
        f fVar2 = new f("INFO", 1);
        INFO = fVar2;
        f fVar3 = new f("WARNING", 2);
        WARNING = fVar3;
        f fVar4 = new f("ERROR", 3);
        ERROR = fVar4;
        $VALUES = new f[]{fVar, fVar2, fVar3, fVar4};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
