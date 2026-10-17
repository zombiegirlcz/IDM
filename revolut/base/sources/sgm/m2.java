package sgm;

import io.reactivex.rxjava3.core.Observable;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes14.dex */
public final class m2 extends Observable implements igm.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f262993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f262994b;

    public /* synthetic */ m2(Object obj2, int i) {
        this.f262993a = i;
        this.f262994b = obj2;
    }

    @Override // igm.q
    public final Object get() throws Exception {
        int i = this.f262993a;
        Object obj2 = this.f262994b;
        switch (i) {
            case 0:
                ((igm.a) obj2).run();
                return null;
            case 1:
                Object objCall = ((Callable) obj2).call();
                if (objCall == null) {
                    throw ygm.g.b("The Callable returned a null value.");
                }
                q75.t tVar = ygm.g.f313672a;
                return objCall;
            case 2:
                ((Runnable) obj2).run();
                return null;
            default:
                Object obj3 = ((igm.q) obj2).get();
                if (obj3 == null) {
                    throw ygm.g.b("The supplier returned a null value.");
                }
                q75.t tVar2 = ygm.g.f313672a;
                return obj3;
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(fgm.l lVar) {
        switch (this.f262993a) {
            case 0:
                lgm.b bVar = new lgm.b();
                lVar.onSubscribe(bVar);
                if (bVar.f195138a) {
                    return;
                }
                try {
                    ((igm.a) this.f262994b).run();
                    if (bVar.f195138a) {
                        return;
                    }
                    lVar.onComplete();
                    return;
                } catch (Throwable th10) {
                    ce9.m.F(th10);
                    if (bVar.f195138a) {
                        jb3.l.v(th10);
                        return;
                    } else {
                        lVar.onError(th10);
                        return;
                    }
                }
            case 1:
                ngm.h hVar = new ngm.h(lVar);
                lVar.onSubscribe(hVar);
                if (hVar.isDisposed()) {
                    return;
                }
                try {
                    Object objCall = ((Callable) this.f262994b).call();
                    if (objCall == null) {
                        throw ygm.g.b("Callable returned a null value.");
                    }
                    q75.t tVar = ygm.g.f313672a;
                    hVar.a(objCall);
                    return;
                } catch (Throwable th11) {
                    ce9.m.F(th11);
                    if (hVar.isDisposed()) {
                        jb3.l.v(th11);
                        return;
                    } else {
                        lVar.onError(th11);
                        return;
                    }
                }
            case 2:
                lgm.b bVar2 = new lgm.b();
                lVar.onSubscribe(bVar2);
                if (bVar2.f195138a) {
                    return;
                }
                try {
                    ((Runnable) this.f262994b).run();
                    if (bVar2.f195138a) {
                        return;
                    }
                    lVar.onComplete();
                    return;
                } catch (Throwable th12) {
                    ce9.m.F(th12);
                    if (bVar2.f195138a) {
                        jb3.l.v(th12);
                        return;
                    } else {
                        lVar.onError(th12);
                        return;
                    }
                }
            default:
                ngm.h hVar2 = new ngm.h(lVar);
                lVar.onSubscribe(hVar2);
                if (hVar2.isDisposed()) {
                    return;
                }
                try {
                    Object obj2 = ((igm.q) this.f262994b).get();
                    if (obj2 == null) {
                        throw ygm.g.b("Supplier returned a null value.");
                    }
                    q75.t tVar2 = ygm.g.f313672a;
                    hVar2.a(obj2);
                    return;
                } catch (Throwable th13) {
                    ce9.m.F(th13);
                    if (hVar2.isDisposed()) {
                        jb3.l.v(th13);
                        return;
                    } else {
                        lVar.onError(th13);
                        return;
                    }
                }
        }
    }
}
