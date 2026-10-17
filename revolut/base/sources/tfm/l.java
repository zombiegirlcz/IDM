package tfm;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends efm.r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f270599g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f270600h;
    public final Object i;

    public /* synthetic */ l(Object obj2, Object obj3, int i) {
        this.f270599g = i;
        this.f270600h = obj2;
        this.i = obj3;
    }

    @Override // efm.r
    public final void subscribeActual(efm.y yVar) {
        int length;
        switch (this.f270599g) {
            case 0:
                efm.w[] wVarArr = (efm.w[]) this.f270600h;
                if (wVarArr == null) {
                    wVarArr = new efm.w[8];
                    try {
                        length = 0;
                        for (efm.w wVar : (Iterable) this.i) {
                            if (wVar == null) {
                                lfm.e.d(new NullPointerException("One of the sources is null"), yVar);
                            } else {
                                if (length == wVarArr.length) {
                                    efm.w[] wVarArr2 = new efm.w[(length >> 2) + length];
                                    System.arraycopy(wVarArr, 0, wVarArr2, 0, length);
                                    wVarArr = wVarArr2;
                                }
                                int i = length + 1;
                                wVarArr[length] = wVar;
                                length = i;
                            }
                        }
                    } catch (Throwable th10) {
                        m70.a.u(th10);
                        lfm.e.d(th10, yVar);
                        return;
                    }
                } else {
                    length = wVarArr.length;
                }
                if (length == 0) {
                    lfm.e.a(yVar);
                } else if (length == 1) {
                    wVarArr[0].subscribe(yVar);
                } else {
                    rfm.g gVar = new rfm.g(yVar, length);
                    AtomicInteger atomicInteger = (AtomicInteger) gVar.f253939c;
                    efm.y yVar2 = (efm.y) gVar.f253938b;
                    k[] kVarArr = (k[]) gVar.d;
                    int length2 = kVarArr.length;
                    int i2 = 0;
                    while (i2 < length2) {
                        int i3 = i2 + 1;
                        kVarArr[i2] = new k(gVar, i3, yVar2);
                        i2 = i3;
                    }
                    atomicInteger.lazySet(0);
                    yVar2.onSubscribe(gVar);
                    for (int i5 = 0; i5 < length2 && atomicInteger.get() == 0; i5++) {
                        wVarArr[i5].subscribe(kVarArr[i5]);
                    }
                }
                break;
            case 1:
                lfm.b bVar = new lfm.b(1);
                yVar.onSubscribe(bVar);
                ((efm.w) this.i).subscribe(new l1(this, bVar, yVar));
                break;
            case 2:
                try {
                    Object objCall = ((Callable) this.f270600h).call();
                    mfm.f.b(objCall, "The connectableFactory returned a null ConnectableObservable");
                    agm.a aVar = (agm.a) objCall;
                    Object objApply = ((kfm.o) this.i).apply(aVar);
                    mfm.f.b(objApply, "The selector returned a null ObservableSource");
                    efm.w wVar2 = (efm.w) objApply;
                    sfm.d dVar = new sfm.d(yVar, 2);
                    wVar2.subscribe(dVar);
                    aVar.d(new onh.b(dVar, 26));
                } catch (Throwable th11) {
                    m70.a.u(th11);
                    lfm.e.d(th11, yVar);
                    return;
                }
                break;
            case 3:
                try {
                    Object objApply2 = ((kfm.o) this.i).apply(this.f270600h);
                    mfm.f.b(objApply2, "The mapper returned a null ObservableSource");
                    efm.w wVar3 = (efm.w) objApply2;
                    if (!(wVar3 instanceof Callable)) {
                        wVar3.subscribe(yVar);
                    } else {
                        try {
                            Object objCall2 = ((Callable) wVar3).call();
                            if (objCall2 == null) {
                                lfm.e.a(yVar);
                            } else {
                                q5 q5Var = new q5(yVar, objCall2);
                                yVar.onSubscribe(q5Var);
                                q5Var.run();
                            }
                        } catch (Throwable th12) {
                            m70.a.u(th12);
                            lfm.e.d(th12, yVar);
                            return;
                        }
                    }
                } catch (Throwable th13) {
                    lfm.e.d(th13, yVar);
                    return;
                }
                break;
            default:
                ((ufm.b) this.f270600h).q(new ufm.j(yVar, (dz7.l) this.i));
                break;
        }
    }
}
