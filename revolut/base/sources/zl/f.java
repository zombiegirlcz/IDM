package zl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class f {
    private static final /* synthetic */ f[] $VALUES;
    public static final f Height;
    public static final f Radius;
    public static final f Width;

    static {
        f fVar = new f("Width", 0);
        Width = fVar;
        f fVar2 = new f("Height", 1);
        Height = fVar2;
        f fVar3 = new f("Radius", 2);
        Radius = fVar3;
        $VALUES = new f[]{fVar, fVar2, fVar3};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
