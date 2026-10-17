package b9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class j2 {
    private static final /* synthetic */ j2[] $VALUES;

    /* JADX INFO: renamed from: cm, reason: collision with root package name */
    public static final j2 f13371cm;

    /* JADX INFO: renamed from: em, reason: collision with root package name */
    public static final j2 f13372em;

    /* JADX INFO: renamed from: ex, reason: collision with root package name */
    public static final j2 f13373ex;

    /* JADX INFO: renamed from: in, reason: collision with root package name */
    public static final j2 f13374in;

    /* JADX INFO: renamed from: mm, reason: collision with root package name */
    public static final j2 f13375mm;

    /* JADX INFO: renamed from: pc, reason: collision with root package name */
    public static final j2 f13376pc;
    public static final j2 percent;

    /* JADX INFO: renamed from: pt, reason: collision with root package name */
    public static final j2 f13377pt;

    /* JADX INFO: renamed from: px, reason: collision with root package name */
    public static final j2 f13378px;

    static {
        j2 j2Var = new j2("px", 0);
        f13378px = j2Var;
        j2 j2Var2 = new j2("em", 1);
        f13372em = j2Var2;
        j2 j2Var3 = new j2("ex", 2);
        f13373ex = j2Var3;
        j2 j2Var4 = new j2("in", 3);
        f13374in = j2Var4;
        j2 j2Var5 = new j2("cm", 4);
        f13371cm = j2Var5;
        j2 j2Var6 = new j2("mm", 5);
        f13375mm = j2Var6;
        j2 j2Var7 = new j2("pt", 6);
        f13377pt = j2Var7;
        j2 j2Var8 = new j2("pc", 7);
        f13376pc = j2Var8;
        j2 j2Var9 = new j2("percent", 8);
        percent = j2Var9;
        $VALUES = new j2[]{j2Var, j2Var2, j2Var3, j2Var4, j2Var5, j2Var6, j2Var7, j2Var8, j2Var9};
    }

    public static j2 valueOf(String str) {
        return (j2) Enum.valueOf(j2.class, str);
    }

    public static j2[] values() {
        return (j2[]) $VALUES.clone();
    }
}
