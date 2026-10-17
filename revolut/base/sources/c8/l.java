package c8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class l {
    private static final /* synthetic */ l[] $VALUES;
    public static final l DISPLAY_P3;
    public static final l SRGB;

    static {
        l lVar = new l("SRGB", 0);
        SRGB = lVar;
        l lVar2 = new l("DISPLAY_P3", 1);
        DISPLAY_P3 = lVar2;
        $VALUES = new l[]{lVar, lVar2};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }
}
