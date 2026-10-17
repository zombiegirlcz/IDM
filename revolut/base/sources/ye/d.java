package ye;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    private static final /* synthetic */ d[] $VALUES;
    public static final d DEFAULT;
    public static final d FIXED;
    public static final d SIGNED;

    static {
        d dVar = new d("DEFAULT", 0);
        DEFAULT = dVar;
        d dVar2 = new d("SIGNED", 1);
        SIGNED = dVar2;
        d dVar3 = new d("FIXED", 2);
        FIXED = dVar3;
        $VALUES = new d[]{dVar, dVar2, dVar3};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
