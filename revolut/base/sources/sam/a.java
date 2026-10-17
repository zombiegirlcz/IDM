package sam;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f261457c = new a(90, 0);
    public static final a d = new a(270, 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f261458b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i, int i2) {
        super(i);
        this.f261458b = i2;
    }

    public final String toString() {
        switch (this.f261458b) {
            case 0:
                return "Orientation.Horizontal.Landscape";
            default:
                return "Orientation.Horizontal.ReverseLandscape";
        }
    }
}
