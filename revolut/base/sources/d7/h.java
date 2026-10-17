package d7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    private static final /* synthetic */ h[] $VALUES;
    public static final h PLAY_OPTION;
    public static final h SET_ANIMATION;
    public static final h SET_IMAGE_ASSETS;
    public static final h SET_PROGRESS;
    public static final h SET_REPEAT_COUNT;
    public static final h SET_REPEAT_MODE;

    static {
        h hVar = new h("SET_ANIMATION", 0);
        SET_ANIMATION = hVar;
        h hVar2 = new h("SET_PROGRESS", 1);
        SET_PROGRESS = hVar2;
        h hVar3 = new h("SET_REPEAT_MODE", 2);
        SET_REPEAT_MODE = hVar3;
        h hVar4 = new h("SET_REPEAT_COUNT", 3);
        SET_REPEAT_COUNT = hVar4;
        h hVar5 = new h("SET_IMAGE_ASSETS", 4);
        SET_IMAGE_ASSETS = hVar5;
        h hVar6 = new h("PLAY_OPTION", 5);
        PLAY_OPTION = hVar6;
        $VALUES = new h[]{hVar, hVar2, hVar3, hVar4, hVar5, hVar6};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}
