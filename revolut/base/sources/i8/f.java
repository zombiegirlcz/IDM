package i8;

/* JADX INFO: loaded from: classes.dex */
public final class f implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f159360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f159361b;

    public f(int i) {
        this.f159360a = i;
        switch (i) {
            case 1:
                this.f159361b = new yf.c(10);
                break;
            default:
                this.f159361b = new d(1);
                break;
        }
    }

    @Override // i8.v
    public final u a(b0 b0Var) {
        switch (this.f159360a) {
            case 0:
                return new b8.d((d) this.f159361b, 2);
            default:
                return new j8.a((yf.c) this.f159361b);
        }
    }
}
