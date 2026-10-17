package k7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class b {
    private static final /* synthetic */ b[] $VALUES;
    public static final b CENTER;
    public static final b LEFT_ALIGN;
    public static final b RIGHT_ALIGN;

    static {
        b bVar = new b("LEFT_ALIGN", 0);
        LEFT_ALIGN = bVar;
        b bVar2 = new b("RIGHT_ALIGN", 1);
        RIGHT_ALIGN = bVar2;
        b bVar3 = new b("CENTER", 2);
        CENTER = bVar3;
        $VALUES = new b[]{bVar, bVar2, bVar3};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
