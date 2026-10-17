package tfm;

import java.util.Collection;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class t0 extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f270830h;
    public final Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(efm.r rVar, Object obj2, int i) {
        super(rVar);
        this.f270830h = i;
        this.i = obj2;
    }

    @Override // efm.r
    public final void subscribeActual(efm.y yVar) {
        switch (this.f270830h) {
            case 0:
                this.f270328g.subscribe(new s0(yVar, (efm.f) this.i, 0));
                break;
            case 1:
                this.f270328g.subscribe(new r1(yVar, (kfm.g) this.i));
                break;
            case 2:
                lfm.b bVar = new lfm.b(1);
                yVar.onSubscribe(bVar);
                new e5(yVar, (kfm.d) this.i, bVar, this.f270328g).a();
                break;
            case 3:
                this.f270328g.subscribe(new g0(yVar, (kfm.c) this.i, 3));
                break;
            default:
                try {
                    Object objCall = ((Callable) this.i).call();
                    mfm.f.b(objCall, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
                    this.f270328g.subscribe(new o2(yVar, (Collection) objCall, 3));
                } catch (Throwable th10) {
                    m70.a.u(th10);
                    lfm.e.d(th10, yVar);
                    return;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(efm.w wVar) {
        super(wVar);
        this.f270830h = 4;
        this.i = new mfm.a(16);
    }
}
