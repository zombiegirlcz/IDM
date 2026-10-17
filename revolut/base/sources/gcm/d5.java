package gcm;

/* JADX INFO: loaded from: classes22.dex */
public final class d5 implements g5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f142617b;

    public /* synthetic */ d5(int i, int i2) {
        this.f142616a = i2;
        this.f142617b = i;
    }

    @Override // gcm.g5
    public final void a(m5 m5Var) {
        switch (this.f142616a) {
            case 0:
                m5Var.f142773a.e(this.f142617b);
                break;
            default:
                m5Var.f142773a.a(this.f142617b);
                break;
        }
    }
}
