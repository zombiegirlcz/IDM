package qfm;

import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes4.dex */
public final class t0 extends efm.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f245544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f245545c;
    public final Object d;
    public final kfm.o e;

    public /* synthetic */ t0(Object obj2, kfm.o oVar, int i, int i2) {
        this.f245544b = i2;
        this.d = obj2;
        this.e = oVar;
        this.f245545c = i;
    }

    @Override // efm.i
    public final void o(dom.a aVar) {
        switch (this.f245544b) {
            case 0:
                pfm.x xVar = (pfm.x) this.d;
                kfm.o oVar = this.e;
                if (!te0.w.x0(xVar, aVar, oVar)) {
                    xVar.a(new l0(aVar, oVar, Integer.MAX_VALUE, this.f245545c));
                    break;
                }
                break;
            default:
                Publisher[] publisherArr = (Publisher[]) this.d;
                int length = publisherArr.length;
                if (length == 0) {
                    yfm.d.c(aVar);
                } else {
                    y2 y2Var = new y2(aVar, (mp.r) this.e, length, this.f245545c);
                    aVar.e(y2Var);
                    z2[] z2VarArr = y2Var.f245587b;
                    for (int i = 0; i < length && !y2Var.f && y2Var.e.get() == null; i++) {
                        publisherArr[i].a(z2VarArr[i]);
                    }
                }
                break;
        }
    }
}
