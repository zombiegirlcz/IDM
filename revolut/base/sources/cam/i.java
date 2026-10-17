package cam;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ i[] f22680a;
    public static final i close;
    public static final i console;
    public static final i domchange;
    public static final i domcontentloaded;
    public static final i finished;
    public static final i hostblocked;
    public static final i load;
    public static final i locationchange;
    public static final i progress;
    public static final i started;
    public static final i visible;

    static {
        i iVar = new i("console", 0);
        console = iVar;
        i iVar2 = new i("close", 1);
        close = iVar2;
        i iVar3 = new i("domcontentloaded", 2);
        domcontentloaded = iVar3;
        i iVar4 = new i("started", 3);
        started = iVar4;
        i iVar5 = new i("finished", 4);
        finished = iVar5;
        i iVar6 = new i("load", 5);
        load = iVar6;
        i iVar7 = new i("locationchange", 6);
        locationchange = iVar7;
        i iVar8 = new i("domchange", 7);
        domchange = iVar8;
        i iVar9 = new i("progress", 8);
        progress = iVar9;
        i iVar10 = new i("visible", 9);
        visible = iVar10;
        i iVar11 = new i("hostblocked", 10);
        hostblocked = iVar11;
        f22680a = new i[]{iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, iVar10, iVar11};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f22680a.clone();
    }
}
