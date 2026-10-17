package anm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class h {
    private static final /* synthetic */ h[] $VALUES;
    public static final h errorIfNoSemiColon;
    public static final h semiColonOptional;
    public static final h semiColonRequired;

    static {
        h hVar = new h("semiColonRequired", 0);
        semiColonRequired = hVar;
        h hVar2 = new h("semiColonOptional", 1);
        semiColonOptional = hVar2;
        h hVar3 = new h("errorIfNoSemiColon", 2);
        errorIfNoSemiColon = hVar3;
        $VALUES = new h[]{hVar, hVar2, hVar3};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}
