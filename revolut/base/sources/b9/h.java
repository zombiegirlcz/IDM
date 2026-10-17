package b9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class h {
    private static final /* synthetic */ h[] $VALUES;

    /* JADX INFO: renamed from: all, reason: collision with root package name */
    public static final h f13355all;
    public static final h aural;
    public static final h braille;
    public static final h embossed;
    public static final h handheld;
    public static final h print;
    public static final h projection;
    public static final h screen;
    public static final h speech;
    public static final h tty;

    /* JADX INFO: renamed from: tv, reason: collision with root package name */
    public static final h f13356tv;

    static {
        h hVar = new h("all", 0);
        f13355all = hVar;
        h hVar2 = new h("aural", 1);
        aural = hVar2;
        h hVar3 = new h("braille", 2);
        braille = hVar3;
        h hVar4 = new h("embossed", 3);
        embossed = hVar4;
        h hVar5 = new h("handheld", 4);
        handheld = hVar5;
        h hVar6 = new h("print", 5);
        print = hVar6;
        h hVar7 = new h("projection", 6);
        projection = hVar7;
        h hVar8 = new h(ib.b.Screen, 7);
        screen = hVar8;
        h hVar9 = new h("speech", 8);
        speech = hVar9;
        h hVar10 = new h("tty", 9);
        tty = hVar10;
        h hVar11 = new h("tv", 10);
        f13356tv = hVar11;
        $VALUES = new h[]{hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9, hVar10, hVar11};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}
