package sgm;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public final class n6 extends Observable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final igm.q f263028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final igm.o f263029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final igm.g f263030c;
    public final boolean d;

    public n6(igm.q qVar, igm.o oVar, igm.g gVar, boolean z) {
        this.f263028a = qVar;
        this.f263029b = oVar;
        this.f263030c = gVar;
        this.d = z;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(fgm.l lVar) {
        igm.g gVar = this.f263030c;
        try {
            Object obj2 = this.f263028a.get();
            try {
                Object objApply = this.f263029b.apply(obj2);
                Objects.requireNonNull(objApply, "The sourceSupplier returned a null ObservableSource");
                ((ObservableSource) objApply).subscribe(new m6(lVar, obj2, gVar, this.d));
            } catch (Throwable th10) {
                ce9.m.F(th10);
                try {
                    gVar.accept(obj2);
                    jgm.c.c(th10, lVar);
                } catch (Throwable th11) {
                    ce9.m.F(th11);
                    jgm.c.c(new CompositeException(th10, th11), lVar);
                }
            }
        } catch (Throwable th12) {
            ce9.m.F(th12);
            jgm.c.c(th12, lVar);
        }
    }
}
