package bi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class f {
    private static final /* synthetic */ f[] $VALUES;
    public static final f FORCE_NONE;
    public static final f FORCE_RECTANGLE;
    public static final f FORCE_SQUARE;

    static {
        f fVar = new f("FORCE_NONE", 0);
        FORCE_NONE = fVar;
        f fVar2 = new f("FORCE_SQUARE", 1);
        FORCE_SQUARE = fVar2;
        f fVar3 = new f("FORCE_RECTANGLE", 2);
        FORCE_RECTANGLE = fVar3;
        $VALUES = new f[]{fVar, fVar2, fVar3};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
