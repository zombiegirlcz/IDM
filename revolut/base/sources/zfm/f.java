package zfm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class f {
    private static final /* synthetic */ f[] $VALUES;
    public static final f BOUNDARY;
    public static final f END;
    public static final f IMMEDIATE;

    static {
        f fVar = new f("IMMEDIATE", 0);
        IMMEDIATE = fVar;
        f fVar2 = new f("BOUNDARY", 1);
        BOUNDARY = fVar2;
        f fVar3 = new f("END", 2);
        END = fVar3;
        $VALUES = new f[]{fVar, fVar2, fVar3};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
