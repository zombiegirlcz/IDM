package mgm;

import ce9.m;
import igm.o;
import igm.q;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collector;
import sgm.h5;
import sgm.n1;
import sgm.t5;

/* JADX INFO: loaded from: classes14.dex */
public final class b extends Observable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f205308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f205309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f205310c;

    public /* synthetic */ b(Object obj2, Object obj3, int i) {
        this.f205308a = i;
        this.f205309b = obj2;
        this.f205310c = obj3;
    }

    public boolean c() {
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.f205310c;
        return !atomicBoolean.get() && atomicBoolean.compareAndSet(false, true);
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(fgm.l lVar) {
        int length;
        switch (this.f205308a) {
            case 0:
                Collector collector = (Collector) this.f205310c;
                try {
                    ((Observable) this.f205309b).subscribe(new a(lVar, collector.supplier().get(), collector.accumulator(), collector.finisher()));
                } catch (Throwable th10) {
                    m.F(th10);
                    jgm.c.c(th10, lVar);
                    return;
                }
                break;
            case 1:
                rgm.a aVar = new rgm.a(lVar, (ObservableSource) this.f205310c, 0);
                lVar.onSubscribe(aVar);
                ((Completable) this.f205309b).c(aVar);
                break;
            case 2:
                rgm.a aVar2 = new rgm.a(lVar, (o) this.f205310c, 1);
                lVar.onSubscribe(aVar2);
                ((Maybe) this.f205309b).c(aVar2);
                break;
            case 3:
                ObservableSource[] observableSourceArr = (ObservableSource[]) this.f205309b;
                if (observableSourceArr == null) {
                    observableSourceArr = new ObservableSource[8];
                    try {
                        length = 0;
                        for (ObservableSource observableSource : (Iterable) this.f205310c) {
                            if (observableSource == null) {
                                jgm.c.c(new NullPointerException("One of the sources is null"), lVar);
                            } else {
                                if (length == observableSourceArr.length) {
                                    ObservableSource[] observableSourceArr2 = new ObservableSource[(length >> 2) + length];
                                    System.arraycopy(observableSourceArr, 0, observableSourceArr2, 0, length);
                                    observableSourceArr = observableSourceArr2;
                                }
                                int i = length + 1;
                                observableSourceArr[length] = observableSource;
                                length = i;
                            }
                        }
                    } catch (Throwable th11) {
                        m.F(th11);
                        jgm.c.c(th11, lVar);
                        return;
                    }
                } else {
                    length = observableSourceArr.length;
                }
                if (length == 0) {
                    jgm.c.a(lVar);
                } else if (length == 1) {
                    observableSourceArr[0].subscribe(lVar);
                } else {
                    ogm.l lVar2 = new ogm.l(lVar, length);
                    AtomicInteger atomicInteger = (AtomicInteger) lVar2.d;
                    fgm.l lVar3 = (fgm.l) lVar2.f225231c;
                    sgm.o[] oVarArr = (sgm.o[]) lVar2.f225230b;
                    int length2 = oVarArr.length;
                    int i2 = 0;
                    while (i2 < length2) {
                        int i3 = i2 + 1;
                        oVarArr[i2] = new sgm.o(lVar2, i3, lVar3);
                        i2 = i3;
                    }
                    atomicInteger.lazySet(0);
                    lVar3.onSubscribe(lVar2);
                    for (int i5 = 0; i5 < length2 && atomicInteger.get() == 0; i5++) {
                        observableSourceArr[i5].subscribe(oVarArr[i5]);
                    }
                }
                break;
            case 4:
                ggm.b bVar = new ggm.b();
                lVar.onSubscribe(bVar);
                ((ObservableSource) this.f205310c).subscribe(new n1(this, bVar, lVar));
                break;
            case 5:
                try {
                    Object obj2 = ((q) this.f205309b).get();
                    Objects.requireNonNull(obj2, "The connectableFactory returned a null ConnectableObservable");
                    zgm.a aVar3 = (zgm.a) obj2;
                    Object objApply = ((o) this.f205310c).apply(aVar3);
                    Objects.requireNonNull(objApply, "The selector returned a null ObservableSource");
                    ObservableSource observableSource2 = (ObservableSource) objApply;
                    t5 t5Var = new t5(lVar, 1);
                    observableSource2.subscribe(t5Var);
                    aVar3.c(new pak.h(t5Var, 22));
                } catch (Throwable th12) {
                    m.F(th12);
                    jgm.c.c(th12, lVar);
                    return;
                }
                break;
            case 6:
                try {
                    Object objApply2 = ((o) this.f205310c).apply(this.f205309b);
                    Objects.requireNonNull(objApply2, "The mapper returned a null ObservableSource");
                    ObservableSource observableSource3 = (ObservableSource) objApply2;
                    if (!(observableSource3 instanceof q)) {
                        observableSource3.subscribe(lVar);
                    } else {
                        try {
                            Object obj3 = ((q) observableSource3).get();
                            if (obj3 == null) {
                                jgm.c.a(lVar);
                            } else {
                                h5 h5Var = new h5(lVar, obj3);
                                lVar.onSubscribe(h5Var);
                                h5Var.run();
                            }
                        } catch (Throwable th13) {
                            m.F(th13);
                            jgm.c.c(th13, lVar);
                            return;
                        }
                    }
                } catch (Throwable th14) {
                    m.F(th14);
                    jgm.c.c(th14, lVar);
                    return;
                }
                break;
            default:
                ((fhm.f) this.f205309b).subscribe(lVar);
                ((AtomicBoolean) this.f205310c).set(true);
                break;
        }
    }

    public b(fhm.f fVar) {
        this.f205308a = 7;
        this.f205309b = fVar;
        this.f205310c = new AtomicBoolean();
    }
}
