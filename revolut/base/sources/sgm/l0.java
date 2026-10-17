package sgm;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public final class l0 extends Observable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f262970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ObservableSource[] f262971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Iterable f262972c;
    public final igm.o d;
    public final int e;
    public final boolean f;

    public /* synthetic */ l0(ObservableSource[] observableSourceArr, Iterable iterable, igm.o oVar, int i, boolean z, int i2) {
        this.f262970a = i2;
        this.f262971b = observableSourceArr;
        this.f262972c = iterable;
        this.d = oVar;
        this.e = i;
        this.f = z;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(fgm.l lVar) {
        int length;
        int length2;
        switch (this.f262970a) {
            case 0:
                ObservableSource[] observableSourceArr = this.f262971b;
                if (observableSourceArr == null) {
                    observableSourceArr = new ObservableSource[8];
                    try {
                        length = 0;
                        for (ObservableSource observableSource : this.f262972c) {
                            if (length == observableSourceArr.length) {
                                ObservableSource[] observableSourceArr2 = new ObservableSource[(length >> 2) + length];
                                System.arraycopy(observableSourceArr, 0, observableSourceArr2, 0, length);
                                observableSourceArr = observableSourceArr2;
                            }
                            int i = length + 1;
                            Objects.requireNonNull(observableSource, "The Iterator returned a null ObservableSource");
                            observableSourceArr[length] = observableSource;
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
                    jgm.c.a(lVar);
                } else {
                    k0 k0Var = new k0(length, this.e, lVar, this.d, this.f);
                    j0[] j0VarArr = k0Var.f262946c;
                    int length3 = j0VarArr.length;
                    k0Var.f262944a.onSubscribe(k0Var);
                    for (int i2 = 0; i2 < length3 && !k0Var.f262948h && !k0Var.f262947g; i2++) {
                        observableSourceArr[i2].subscribe(j0VarArr[i2]);
                    }
                }
                break;
            default:
                ObservableSource[] observableSourceArr3 = this.f262971b;
                if (observableSourceArr3 == null) {
                    observableSourceArr3 = new ObservableSource[8];
                    length2 = 0;
                    for (ObservableSource observableSource2 : this.f262972c) {
                        if (length2 == observableSourceArr3.length) {
                            ObservableSource[] observableSourceArr4 = new ObservableSource[(length2 >> 2) + length2];
                            System.arraycopy(observableSourceArr3, 0, observableSourceArr4, 0, length2);
                            observableSourceArr3 = observableSourceArr4;
                        }
                        observableSourceArr3[length2] = observableSource2;
                        length2++;
                    }
                } else {
                    length2 = observableSourceArr3.length;
                }
                if (length2 == 0) {
                    jgm.c.a(lVar);
                } else {
                    g7 g7Var = new g7(length2, lVar, this.d, this.f);
                    int i3 = this.e;
                    h7[] h7VarArr = g7Var.f262867c;
                    int length4 = h7VarArr.length;
                    for (int i5 = 0; i5 < length4; i5++) {
                        h7VarArr[i5] = new h7(g7Var, i3);
                    }
                    g7Var.lazySet(0);
                    g7Var.f262865a.onSubscribe(g7Var);
                    for (int i6 = 0; i6 < length4 && !g7Var.f; i6++) {
                        observableSourceArr3[i6].subscribe(h7VarArr[i6]);
                    }
                }
                break;
        }
    }
}
