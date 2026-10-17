package tgm;

import ce9.m;
import fgm.p;
import fgm.q;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Objects;
import java.util.concurrent.Callable;
import jb3.l;
import q75.t;

/* JADX INFO: loaded from: classes14.dex */
public final class b extends Single {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f271201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f271202b;

    public /* synthetic */ b(Object obj2, int i) {
        this.f271201a = i;
        this.f271202b = obj2;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void j(p pVar) {
        Object obj2;
        int i = this.f271201a;
        Object obj3 = this.f271202b;
        switch (i) {
            case 0:
                a aVar = new a(pVar);
                pVar.onSubscribe(aVar);
                try {
                    ((q) obj3).c(aVar);
                    return;
                } catch (Throwable th10) {
                    m.F(th10);
                    aVar.onError(th10);
                    return;
                }
            case 1:
                try {
                    Object obj4 = ((igm.q) obj3).get();
                    Objects.requireNonNull(obj4, "The singleSupplier returned a null SingleSource");
                    ((SingleSource) obj4).c(pVar);
                    return;
                } catch (Throwable th11) {
                    m.F(th11);
                    pVar.onSubscribe(jgm.c.INSTANCE);
                    pVar.onError(th11);
                    return;
                }
            case 2:
                try {
                    obj2 = ((kgm.e) obj3).f184019a;
                } catch (Throwable th12) {
                    th = th12;
                    m.F(th);
                }
                if (obj2 == null) {
                    throw ygm.g.b("Supplier returned a null Throwable.");
                }
                t tVar = ygm.g.f313672a;
                th = (Throwable) obj2;
                pVar.onSubscribe(jgm.c.INSTANCE);
                pVar.onError(th);
                return;
            case 3:
                Disposable bVar = new ggm.b(kgm.j.f184026b, 0);
                pVar.onSubscribe(bVar);
                if (bVar.isDisposed()) {
                    return;
                }
                try {
                    Object objCall = ((Callable) obj3).call();
                    Objects.requireNonNull(objCall, "The callable returned a null value");
                    if (bVar.isDisposed()) {
                        return;
                    }
                    pVar.onSuccess(objCall);
                    return;
                } catch (Throwable th13) {
                    m.F(th13);
                    if (bVar.isDisposed()) {
                        l.v(th13);
                        return;
                    } else {
                        pVar.onError(th13);
                        return;
                    }
                }
            case 4:
                ((SingleSource) obj3).c(pVar);
                return;
            default:
                pVar.onSubscribe(jgm.c.INSTANCE);
                pVar.onSuccess(obj3);
                return;
        }
    }
}
