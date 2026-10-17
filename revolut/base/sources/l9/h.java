package l9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class h {
    private static final /* synthetic */ h[] $VALUES;
    public static final h DEFAULT_TYPING;
    public static final h DYNAMIC;
    public static final h STATIC;

    static {
        h hVar = new h("DYNAMIC", 0);
        DYNAMIC = hVar;
        h hVar2 = new h("STATIC", 1);
        STATIC = hVar2;
        h hVar3 = new h("DEFAULT_TYPING", 2);
        DEFAULT_TYPING = hVar3;
        $VALUES = new h[]{hVar, hVar2, hVar3};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}
