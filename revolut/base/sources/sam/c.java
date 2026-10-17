package sam;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f261459c = new c(0, 0);
    public static final c d = new c(180, 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f261460b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i, int i2) {
        super(i);
        this.f261460b = i2;
    }

    public final String toString() {
        switch (this.f261460b) {
            case 0:
                return "Orientation.Vertical.Portrait";
            default:
                return "Orientation.Vertical.ReversePortrait";
        }
    }
}
