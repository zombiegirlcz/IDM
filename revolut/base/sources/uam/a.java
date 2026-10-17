package uam;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f278684b = new a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f278685c = new a(1);
    public static final a d = new a(2);
    public static final a e = new a(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f278686a;

    public /* synthetic */ a(int i) {
        this.f278686a = i;
    }

    public final String toString() {
        switch (this.f278686a) {
            case 0:
                return "AntiBandingMode.Auto";
            case 1:
                return "AntiBandingMode.HZ50";
            case 2:
                return "AntiBandingMode.HZ60";
            default:
                return "AntiBandingMode.None";
        }
    }
}
