package uam;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f278690b = new e(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f278691c = new e(1);
    public static final e d = new e(2);
    public static final e e = new e(3);
    public static final e f = new e(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e f278692g = new e(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e f278693h = new e(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f278694a;

    public /* synthetic */ e(int i) {
        this.f278694a = i;
    }

    public final String toString() {
        switch (this.f278694a) {
            case 0:
                return "FocusMode.Auto";
            case 1:
                return "FocusMode.ContinuousFocusPicture";
            case 2:
                return "FocusMode.ContinuousFocusVideo";
            case 3:
                return "FocusMode.Edof";
            case 4:
                return "FocusMode.Fixed";
            case 5:
                return "FocusMode.Infinity";
            default:
                return "FocusMode.Macro";
        }
    }
}
