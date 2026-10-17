package sfm;

import efm.w;
import efm.y;
import tfm.s5;
import tfm.t5;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends efm.r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f262525g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f262526h;
    public final w i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f262527j;
    public final Object k;

    public /* synthetic */ h(w wVar, Object obj2, Object obj3, int i, int i2) {
        this.f262525g = i2;
        this.i = wVar;
        this.f262527j = obj2;
        this.k = obj3;
        this.f262526h = i;
    }

    @Override // efm.r
    public final void subscribeActual(y yVar) {
        switch (this.f262525g) {
            case 0:
                efm.r rVar = (efm.r) this.i;
                kfm.o oVar = (kfm.o) this.f262527j;
                if (!kli.a.F(rVar, oVar, yVar)) {
                    rVar.subscribe(new g(yVar, oVar, this.f262526h, (zfm.f) this.k));
                }
                break;
            default:
                s5 s5Var = new s5(yVar, this.f262526h, this.i, (w) this.f262527j, (kfm.d) this.k);
                yVar.onSubscribe(s5Var);
                t5[] t5VarArr = (t5[]) s5Var.f270819j;
                s5Var.d.subscribe(t5VarArr[0]);
                s5Var.e.subscribe(t5VarArr[1]);
                break;
        }
    }
}
