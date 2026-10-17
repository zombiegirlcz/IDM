package tfm;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class f7 extends efm.r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Callable f270462g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final kfm.o f270463h;
    public final kfm.g i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f270464j;

    public f7(Callable callable, kfm.o oVar, kfm.g gVar, boolean z) {
        this.f270462g = callable;
        this.f270463h = oVar;
        this.i = gVar;
        this.f270464j = z;
    }

    @Override // efm.r
    public final void subscribeActual(efm.y yVar) {
        kfm.g gVar = this.i;
        try {
            Object objCall = this.f270462g.call();
            try {
                Object objApply = this.f270463h.apply(objCall);
                mfm.f.b(objApply, "The sourceSupplier returned a null ObservableSource");
                ((efm.w) objApply).subscribe(new e7(yVar, objCall, gVar, this.f270464j));
            } catch (Throwable th10) {
                m70.a.u(th10);
                try {
                    gVar.accept(objCall);
                    lfm.e.d(th10, yVar);
                } catch (Throwable th11) {
                    m70.a.u(th11);
                    lfm.e.d(new CompositeException(th10, th11), yVar);
                }
            }
        } catch (Throwable th12) {
            m70.a.u(th12);
            lfm.e.d(th12, yVar);
        }
    }
}
