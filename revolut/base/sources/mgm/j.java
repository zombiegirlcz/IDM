package mgm;

import ce9.m;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.SingleSource;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CompletionStage;
import java.util.stream.Stream;
import org.reactivestreams.Publisher;
import pgm.l0;
import sgm.c1;
import sgm.n2;
import sgm.p2;

/* JADX INFO: loaded from: classes14.dex */
public final class j extends Observable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f205327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f205328b;

    public /* synthetic */ j(Object obj2, int i) {
        this.f205327a = i;
        this.f205328b = obj2;
    }

    public static void c(fgm.l lVar, Stream stream) {
        try {
            Iterator it8 = stream.iterator();
            if (it8.hasNext()) {
                k kVar = new k(lVar, it8, stream);
                lVar.onSubscribe(kVar);
                kVar.a();
            } else {
                jgm.c.a(lVar);
                try {
                    m72.b.B(stream);
                } catch (Throwable th10) {
                    m.F(th10);
                    jb3.l.v(th10);
                }
            }
        } catch (Throwable th11) {
            m.F(th11);
            jgm.c.c(th11, lVar);
            try {
                m72.b.B(stream);
            } catch (Throwable th12) {
                m.F(th12);
                jb3.l.v(th12);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(fgm.l lVar) {
        switch (this.f205327a) {
            case 0:
                h hVar = new h();
                i iVar = new i(lVar, hVar);
                hVar.lazySet(iVar);
                lVar.onSubscribe(iVar);
                ((CompletionStage) this.f205328b).whenComplete(hVar);
                break;
            case 1:
                c(lVar, (Stream) this.f205328b);
                break;
            case 2:
                ((Completable) this.f205328b).c(new l0(lVar, 1));
                break;
            case 3:
                ((MaybeSource) this.f205328b).c(new qgm.k(lVar, 0));
                break;
            case 4:
                c1 c1Var = new c1(lVar);
                lVar.onSubscribe(c1Var);
                try {
                    ((fgm.j) this.f205328b).f(c1Var);
                } catch (Throwable th10) {
                    m.F(th10);
                    c1Var.b(th10);
                    return;
                }
                break;
            case 5:
                Object[] objArr = (Object[]) this.f205328b;
                n2 n2Var = new n2(lVar, objArr);
                lVar.onSubscribe(n2Var);
                if (!n2Var.d) {
                    int length = objArr.length;
                    for (int i = 0; i < length && !n2Var.e; i++) {
                        Object obj2 = objArr[i];
                        if (obj2 == null) {
                            n2Var.f263020a.onError(new NullPointerException(j6.a.l(i, "The element at index ", " is null")));
                        } else {
                            n2Var.f263020a.onNext(obj2);
                        }
                        break;
                    }
                    if (!n2Var.e) {
                        n2Var.f263020a.onComplete();
                    }
                    break;
                }
                break;
            case 6:
                ((CompletableSource) this.f205328b).c(new l0(lVar, 1));
                break;
            case 7:
                try {
                    Iterator it8 = ((Iterable) this.f205328b).iterator();
                    try {
                        if (it8.hasNext()) {
                            p2 p2Var = new p2(lVar, it8);
                            lVar.onSubscribe(p2Var);
                            if (!p2Var.d) {
                                while (!p2Var.f263069c) {
                                    try {
                                        Object next = p2Var.f263068b.next();
                                        Objects.requireNonNull(next, "The iterator returned a null value");
                                        p2Var.f263067a.onNext(next);
                                        if (p2Var.f263069c) {
                                            break;
                                        } else {
                                            try {
                                                if (!p2Var.f263068b.hasNext()) {
                                                    if (!p2Var.f263069c) {
                                                        p2Var.f263067a.onComplete();
                                                    }
                                                    break;
                                                }
                                            } catch (Throwable th11) {
                                                m.F(th11);
                                                p2Var.f263067a.onError(th11);
                                                return;
                                            }
                                        }
                                    } catch (Throwable th12) {
                                        m.F(th12);
                                        p2Var.f263067a.onError(th12);
                                        return;
                                    }
                                }
                            }
                        } else {
                            jgm.c.a(lVar);
                        }
                    } catch (Throwable th13) {
                        m.F(th13);
                        jgm.c.c(th13, lVar);
                        return;
                    }
                } catch (Throwable th14) {
                    m.F(th14);
                    jgm.c.c(th14, lVar);
                    return;
                }
                break;
            case 8:
                ((Publisher) this.f205328b).a(new ogm.h(lVar, 1));
                break;
            case 9:
                ((ObservableSource) this.f205328b).subscribe(lVar);
                break;
            default:
                ((SingleSource) this.f205328b).c(new qgm.k(lVar, 1));
                break;
        }
    }
}
