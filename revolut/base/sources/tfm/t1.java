package tfm;

/* JADX INFO: loaded from: classes13.dex */
public final class t1 extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f270831h;
    public final Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t1(efm.r rVar, Object obj2, int i) {
        super(rVar);
        this.f270831h = i;
        this.i = obj2;
    }

    @Override // efm.r
    public final void subscribeActual(efm.y yVar) {
        switch (this.f270831h) {
            case 0:
                this.f270328g.subscribe(new s1(yVar, (kfm.a) this.i));
                return;
            case 1:
                efm.v vVar = (efm.v) this.i;
                try {
                    efm.y yVarA = vVar.a(yVar);
                    mfm.f.b(yVarA, "Operator " + vVar + " returned a null Observer");
                    this.f270328g.subscribe(yVarA);
                    return;
                } catch (NullPointerException e) {
                    throw e;
                } catch (Throwable th10) {
                    m70.a.u(th10);
                    mo3.a.m(th10);
                    NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
                    nullPointerException.initCause(th10);
                    throw nullPointerException;
                }
            case 2:
                s3 s3Var = new s3(yVar);
                yVar.onSubscribe(s3Var);
                this.f270328g.subscribe(s3Var);
                ((efm.f) this.i).d(s3Var.f270808c);
                return;
            default:
                g6 g6Var = new g6(yVar, (efm.w) this.i);
                yVar.onSubscribe(g6Var.f270492c);
                this.f270328g.subscribe(g6Var);
                return;
        }
    }
}
