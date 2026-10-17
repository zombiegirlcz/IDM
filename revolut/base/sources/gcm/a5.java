package gcm;

/* JADX INFO: loaded from: classes13.dex */
public final class a5 implements g5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f142568b;

    public /* synthetic */ a5(Object obj2, int i) {
        this.f142567a = i;
        this.f142568b = obj2;
    }

    @Override // gcm.g5
    public final void a(m5 m5Var) {
        switch (this.f142567a) {
            case 0:
                m5Var.f142773a.b((ecm.o) this.f142568b);
                break;
            case 1:
                m5Var.f142773a.i((ecm.w) this.f142568b);
                break;
            default:
                m5Var.f142773a.j((ecm.y) this.f142568b);
                break;
        }
    }
}
