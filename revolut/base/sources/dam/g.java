package dam;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class g {
    public static final g BALANCE;
    public static final g DEPOSIT;
    public static final g ENROLL;
    public static final g IDENTIFY;
    public static final g NONE;
    public static final g PRESENT;
    public static final g SWITCH;
    public static final g TAX;
    public static final g VERIFY;
    public static final g WITHHOLD;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ g[] f112561a;

    static {
        g gVar = new g("NONE", 0);
        NONE = gVar;
        g gVar2 = new g("BALANCE", 1);
        BALANCE = gVar2;
        g gVar3 = new g("DEPOSIT", 2);
        DEPOSIT = gVar3;
        g gVar4 = new g("ENROLL", 3);
        ENROLL = gVar4;
        g gVar5 = new g("PRESENT", 4);
        PRESENT = gVar5;
        g gVar6 = new g("TAX", 5);
        TAX = gVar6;
        g gVar7 = new g("SWITCH", 6);
        SWITCH = gVar7;
        g gVar8 = new g("VERIFY", 7);
        VERIFY = gVar8;
        g gVar9 = new g("IDENTIFY", 8);
        IDENTIFY = gVar9;
        g gVar10 = new g("WITHHOLD", 9);
        WITHHOLD = gVar10;
        f112561a = new g[]{gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, gVar10};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f112561a.clone();
    }
}
