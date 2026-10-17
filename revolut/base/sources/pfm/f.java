package pfm;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends efm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f235726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterable f235727b;

    public /* synthetic */ f(Iterable iterable, int i) {
        this.f235726a = i;
        this.f235727b = iterable;
    }

    @Override // efm.b
    public final void x(efm.d dVar) {
        efm.d dVar2;
        switch (this.f235726a) {
            case 0:
                try {
                    Iterator it8 = this.f235727b.iterator();
                    mfm.f.b(it8, "The iterator returned is null");
                    e eVar = new e(dVar, it8);
                    dVar.onSubscribe((lfm.b) eVar.d);
                    eVar.a();
                } catch (Throwable th10) {
                    m70.a.u(th10);
                    dVar.onSubscribe(lfm.e.INSTANCE);
                    dVar.onError(th10);
                    return;
                }
                break;
            case 1:
                ifm.b bVar = new ifm.b();
                dVar.onSubscribe(bVar);
                try {
                    Iterator it9 = this.f235727b.iterator();
                    mfm.f.b(it9, "The source iterator returned is null");
                    AtomicInteger atomicInteger = new AtomicInteger(1);
                    zfm.c cVar = new zfm.c();
                    while (!bVar.f161042b) {
                        try {
                            if (!it9.hasNext()) {
                                dVar2 = dVar;
                            } else if (!bVar.f161042b) {
                                try {
                                    Object next = it9.next();
                                    mfm.f.b(next, "The iterator returned a null CompletableSource");
                                    efm.f fVar = (efm.f) next;
                                    if (!bVar.f161042b) {
                                        atomicInteger.getAndIncrement();
                                        fVar.d(new lal.a(dVar, bVar, cVar, atomicInteger, 27));
                                    }
                                } catch (Throwable th11) {
                                    dVar2 = dVar;
                                    m70.a.u(th11);
                                    zfm.h.a(cVar, th11);
                                }
                            }
                        } catch (Throwable th12) {
                            dVar2 = dVar;
                            m70.a.u(th12);
                            zfm.h.a(cVar, th12);
                        }
                        if (atomicInteger.decrementAndGet() == 0) {
                            Throwable thB = zfm.h.b(cVar);
                            if (thB != null) {
                                dVar2.onError(thB);
                            } else {
                                dVar2.onComplete();
                            }
                        }
                    }
                } catch (Throwable th13) {
                    m70.a.u(th13);
                    dVar.onError(th13);
                    return;
                }
                break;
            default:
                ifm.b bVar2 = new ifm.b();
                dVar.onSubscribe(bVar2);
                try {
                    Iterator it10 = this.f235727b.iterator();
                    mfm.f.b(it10, "The source iterator returned is null");
                    AtomicInteger atomicInteger2 = new AtomicInteger(1);
                    p pVar = new p(dVar, bVar2, atomicInteger2);
                    while (!bVar2.f161042b) {
                        try {
                            if (!it10.hasNext()) {
                                pVar.onComplete();
                            } else if (!bVar2.f161042b) {
                                try {
                                    Object next2 = it10.next();
                                    mfm.f.b(next2, "The iterator returned a null CompletableSource");
                                    efm.f fVar2 = (efm.f) next2;
                                    if (!bVar2.f161042b) {
                                        atomicInteger2.getAndIncrement();
                                        fVar2.d(pVar);
                                    }
                                } catch (Throwable th14) {
                                    m70.a.u(th14);
                                    bVar2.dispose();
                                    pVar.onError(th14);
                                    return;
                                }
                            }
                        } catch (Throwable th15) {
                            m70.a.u(th15);
                            bVar2.dispose();
                            pVar.onError(th15);
                            return;
                        }
                    }
                } catch (Throwable th16) {
                    m70.a.u(th16);
                    dVar.onError(th16);
                }
                break;
        }
    }
}
