package gcm;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ecm.g2 f142553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f142554c;
    public final /* synthetic */ ecm.m1 d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(Object obj2, ecm.g2 g2Var, b0 b0Var, ecm.m1 m1Var, int i) {
        this.f142552a = i;
        this.e = obj2;
        this.f142553b = g2Var;
        this.f142554c = b0Var;
        this.d = m1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f142552a) {
            case 0:
                ((b) this.e).b(this.f142553b, this.f142554c, this.d);
                break;
            case 1:
                ((v0) this.e).f142905a.c(this.f142553b, this.f142554c, this.d);
                break;
            default:
                x2 x2Var = (x2) this.e;
                x2Var.z = true;
                x2Var.u.c(this.f142553b, this.f142554c, this.d);
                break;
        }
    }
}
