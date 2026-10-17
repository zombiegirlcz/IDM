package qfm;

import java.util.Collection;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f245482c;
    public final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(efm.i iVar, Object obj2, int i) {
        super(iVar);
        this.f245482c = i;
        this.d = obj2;
    }

    @Override // efm.i
    public final void o(dom.a aVar) {
        switch (this.f245482c) {
            case 0:
                this.f245362b.n(new m(aVar, (pfm.h) this.d));
                break;
            case 1:
                this.f245362b.n(new u1(aVar, (mfm.d) this.d));
                break;
            case 2:
                this.f245362b.n(new q2(aVar, (kfm.p) this.d));
                break;
            default:
                try {
                    Object objCall = ((Callable) this.d).call();
                    mfm.f.b(objCall, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
                    Collection collection = (Collection) objCall;
                    w2 w2Var = new w2(aVar);
                    w2Var.f313467b = collection;
                    this.f245362b.n(w2Var);
                } catch (Throwable th10) {
                    m70.a.u(th10);
                    yfm.d.d(th10, aVar);
                    return;
                }
                break;
        }
    }
}
