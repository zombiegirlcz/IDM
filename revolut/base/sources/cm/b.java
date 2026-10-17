package cm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class b {
    private static final /* synthetic */ b[] $VALUES;
    public static final b HORIZONTAL;
    public static final b VERTICAL;

    static {
        b bVar = new b("HORIZONTAL", 0);
        HORIZONTAL = bVar;
        b bVar2 = new b("VERTICAL", 1);
        VERTICAL = bVar2;
        $VALUES = new b[]{bVar, bVar2};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
