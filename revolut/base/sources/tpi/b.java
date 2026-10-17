package tpi;

import efm.d0;
import efm.h0;
import efm.i0;
import efm.k;
import efm.n;
import efm.o;
import efm.r;
import efm.w;
import efm.x;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import rfm.l;
import rfm.y;
import tjf.m0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements x, i0, o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f273392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f273393b;

    public /* synthetic */ b(i iVar, int i) {
        this.f273392a = i;
        this.f273393b = iVar;
    }

    @Override // efm.o
    public n apply(k maybe) {
        Intrinsics.checkNotNullParameter(maybe, "maybe");
        i iVar = this.f273393b;
        m0 m0Var = new m0(new e(iVar, 5), 21);
        dfm.c cVar = mfm.f.d;
        return new rfm.f(new y(maybe, m0Var, cVar, cVar, mfm.f.f205043c), new f(iVar, 4), 0);
    }

    @Override // efm.i0
    public h0 i(d0 single) {
        Intrinsics.checkNotNullParameter(single, "single");
        i iVar = this.f273393b;
        return new l(new ufm.f(single, new m0(new e(iVar, 7), 22), 2), new f(iVar, 5), 5);
    }

    @Override // efm.x
    public w apply(final r observable) {
        switch (this.f273392a) {
            case 0:
                Intrinsics.checkNotNullParameter(observable, "observable");
                final i iVar = this.f273393b;
                final int i = 0;
                return observable.doOnNext(new m0(new c(iVar, observable, 0), 11)).doFinally(new kfm.a() { // from class: tpi.d
                    @Override // kfm.a
                    public final void run() {
                        switch (i) {
                            case 0:
                                r rVar = observable;
                                Intrinsics.h(rVar);
                                iVar.O(rVar);
                                break;
                            case 1:
                                r rVar2 = observable;
                                Intrinsics.h(rVar2);
                                iVar.O(rVar2);
                                break;
                            default:
                                r rVar3 = observable;
                                Intrinsics.h(rVar3);
                                iVar.O(rVar3);
                                break;
                        }
                    }
                });
            case 1:
            case 4:
            default:
                Intrinsics.checkNotNullParameter(observable, "observable");
                final i iVar2 = this.f273393b;
                final int i2 = 2;
                return observable.doOnNext(new m0(new c(iVar2, observable, 2), 24)).doFinally(new kfm.a() { // from class: tpi.d
                    @Override // kfm.a
                    public final void run() {
                        switch (i2) {
                            case 0:
                                r rVar = observable;
                                Intrinsics.h(rVar);
                                iVar2.O(rVar);
                                break;
                            case 1:
                                r rVar2 = observable;
                                Intrinsics.h(rVar2);
                                iVar2.O(rVar2);
                                break;
                            default:
                                r rVar3 = observable;
                                Intrinsics.h(rVar3);
                                iVar2.O(rVar3);
                                break;
                        }
                    }
                });
            case 2:
                Intrinsics.checkNotNullParameter(observable, "observable");
                i iVar3 = this.f273393b;
                return observable.doOnSubscribe(new m0(new e(iVar3, 0), 12)).zipWith(new IntRange(0, Integer.MAX_VALUE, 1), new m0(new tj9.d(27), 13)).doOnNext(new m0(new e(iVar3, 1), 14)).map(new m0(new g(0), 15)).doOnError(new m0(new e(iVar3, 2), 16)).doOnComplete(new f(iVar3, 0)).doOnDispose(new f(iVar3, 1));
            case 3:
                Intrinsics.checkNotNullParameter(observable, "observable");
                i iVar4 = this.f273393b;
                return observable.doOnSubscribe(new m0(new e(iVar4, 3), 19)).doOnError(new m0(new e(iVar4, 4), 20)).doOnComplete(new f(iVar4, 2)).doOnDispose(new f(iVar4, 3));
            case 5:
                Intrinsics.checkNotNullParameter(observable, "observable");
                final i iVar5 = this.f273393b;
                final int i3 = 1;
                return observable.doOnNext(new m0(new c(iVar5, observable, 1), 18)).doFinally(new kfm.a() { // from class: tpi.d
                    @Override // kfm.a
                    public final void run() {
                        switch (i3) {
                            case 0:
                                r rVar = observable;
                                Intrinsics.h(rVar);
                                iVar5.O(rVar);
                                break;
                            case 1:
                                r rVar2 = observable;
                                Intrinsics.h(rVar2);
                                iVar5.O(rVar2);
                                break;
                            default:
                                r rVar3 = observable;
                                Intrinsics.h(rVar3);
                                iVar5.O(rVar3);
                                break;
                        }
                    }
                });
        }
    }
}
