package sgm;

/* JADX INFO: loaded from: classes14.dex */
public final class r6 extends ahm.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s6 f263131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f263132c;

    public r6(s6 s6Var) {
        this.f263131b = s6Var;
    }

    @Override // fgm.l
    public final void onComplete() {
        if (this.f263132c) {
            return;
        }
        this.f263132c = true;
        s6 s6Var = this.f263131b;
        jgm.b.a(s6Var.d);
        s6Var.i = true;
        s6Var.a();
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        if (this.f263132c) {
            jb3.l.v(th10);
            return;
        }
        this.f263132c = true;
        s6 s6Var = this.f263131b;
        jgm.b.a(s6Var.d);
        if (s6Var.f263157g.a(th10)) {
            s6Var.i = true;
            s6Var.a();
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        if (this.f263132c) {
            return;
        }
        this.f263131b.b();
    }
}
