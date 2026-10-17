package sgm;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class v extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f263209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final igm.o f263210c;
    public final Object d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(Observable observable, ObservableSource observableSource, igm.o oVar, Object obj2, int i) {
        super(observable);
        this.f263209b = i;
        this.e = observableSource;
        this.f263210c = oVar;
        this.d = obj2;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(fgm.l lVar) {
        int length;
        switch (this.f263209b) {
            case 0:
                t tVar = new t(lVar, (ObservableSource) this.e, this.f263210c, (igm.q) this.d);
                lVar.onSubscribe(tVar);
                this.f262688a.subscribe(tVar);
                break;
            case 1:
                this.f262688a.subscribe(new p3(lVar, this.f263210c, (igm.o) this.e, (igm.q) this.d));
                break;
            case 2:
                ObservableSource observableSource = this.f262688a;
                ObservableSource observableSource2 = (ObservableSource) this.e;
                igm.o oVar = this.f263210c;
                ObservableSource observableSource3 = (ObservableSource) this.d;
                if (observableSource3 == null) {
                    g6 g6Var = new g6(lVar, oVar);
                    lVar.onSubscribe(g6Var);
                    if (observableSource2 != null) {
                        u uVar = new u(0L, g6Var);
                        ggm.b bVar = g6Var.f262864c;
                        bVar.getClass();
                        if (jgm.b.c(bVar, uVar)) {
                            observableSource2.subscribe(uVar);
                        }
                    }
                    observableSource.subscribe(g6Var);
                } else {
                    f6 f6Var = new f6(lVar, oVar, observableSource3);
                    lVar.onSubscribe(f6Var);
                    if (observableSource2 != null) {
                        u uVar2 = new u(0L, f6Var);
                        ggm.b bVar2 = f6Var.f262833c;
                        bVar2.getClass();
                        if (jgm.b.c(bVar2, uVar2)) {
                            observableSource2.subscribe(uVar2);
                        }
                    }
                    observableSource.subscribe(f6Var);
                }
                break;
            default:
                ObservableSource[] observableSourceArr = (ObservableSource[]) this.d;
                if (observableSourceArr == null) {
                    observableSourceArr = new ObservableSource[8];
                    try {
                        length = 0;
                        for (ObservableSource observableSource4 : (Iterable) this.e) {
                            if (length == observableSourceArr.length) {
                                observableSourceArr = (ObservableSource[]) Arrays.copyOf(observableSourceArr, (length >> 1) + length);
                            }
                            int i = length + 1;
                            observableSourceArr[length] = observableSource4;
                            length = i;
                        }
                    } catch (Throwable th10) {
                        ce9.m.F(th10);
                        jgm.c.c(th10, lVar);
                        return;
                    }
                } else {
                    length = observableSourceArr.length;
                }
                if (length == 0) {
                    this.f262688a.subscribe(new mgm.l(lVar, new qr0.i(this, 11), 1));
                } else {
                    e7 e7Var = new e7(lVar, this.f263210c, length);
                    lVar.onSubscribe(e7Var);
                    f7[] f7VarArr = e7Var.f262816c;
                    AtomicReference atomicReference = e7Var.e;
                    for (int i2 = 0; i2 < length && !jgm.b.b((Disposable) atomicReference.get()) && !e7Var.f262817g; i2++) {
                        observableSourceArr[i2].subscribe(f7VarArr[i2]);
                    }
                    this.f262688a.subscribe(e7Var);
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Observable observable, igm.o oVar, igm.o oVar2, igm.q qVar) {
        super(observable);
        this.f263209b = 1;
        this.f263210c = oVar;
        this.e = oVar2;
        this.d = qVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Observable observable, ObservableSource[] observableSourceArr, igm.o oVar) {
        super(observable);
        this.f263209b = 3;
        this.d = observableSourceArr;
        this.e = null;
        this.f263210c = oVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Observable observable, Iterable iterable, igm.o oVar) {
        super(observable);
        this.f263209b = 3;
        this.d = null;
        this.e = iterable;
        this.f263210c = oVar;
    }
}
