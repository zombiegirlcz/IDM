package lam;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f193471b = new b(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f193472c = new b(1);
    public static final b d = new b(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f193473a;

    public /* synthetic */ b(int i) {
        this.f193473a = i;
    }

    public final String toString() {
        switch (this.f193473a) {
            case 0:
                return "LensPosition.Back";
            case 1:
                return "LensPosition.External";
            default:
                return "LensPosition.Front";
        }
    }
}
