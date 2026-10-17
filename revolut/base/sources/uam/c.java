package uam;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f278687b = new c(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f278688c = new c(1);
    public static final c d = new c(2);
    public static final c e = new c(3);
    public static final c f = new c(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f278689a;

    public /* synthetic */ c(int i) {
        this.f278689a = i;
    }

    public final String toString() {
        switch (this.f278689a) {
            case 0:
                return "Flash.Auto";
            case 1:
                return "Flash.AutoRedEye";
            case 2:
                return "Flash.Off";
            case 3:
                return "Flash.On";
            default:
                return "Flash.Torch";
        }
    }
}
