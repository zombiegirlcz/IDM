package sgm;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public final class i1 extends Observable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f262896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final igm.q f262897b;

    public /* synthetic */ i1(int i, igm.q qVar) {
        this.f262896a = i;
        this.f262897b = qVar;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(fgm.l lVar) {
        Object obj2;
        int i = this.f262896a;
        igm.q qVar = this.f262897b;
        switch (i) {
            case 0:
                try {
                    Object obj3 = qVar.get();
                    Objects.requireNonNull(obj3, "The supplier returned a null ObservableSource");
                    ((ObservableSource) obj3).subscribe(lVar);
                    return;
                } catch (Throwable th10) {
                    ce9.m.F(th10);
                    jgm.c.c(th10, lVar);
                    return;
                }
            default:
                try {
                    obj2 = qVar.get();
                } catch (Throwable th11) {
                    th = th11;
                    ce9.m.F(th);
                }
                if (obj2 == null) {
                    throw ygm.g.b("Supplier returned a null Throwable.");
                }
                q75.t tVar = ygm.g.f313672a;
                th = (Throwable) obj2;
                jgm.c.c(th, lVar);
                return;
        }
    }
}
