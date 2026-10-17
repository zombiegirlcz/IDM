package j01;

import android.view.View;
import android.widget.ImageView;
import efm.d0;
import efm.k;
import efm.r;
import efm.u;
import efm.w;
import efm.y;
import java.util.Iterator;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import org.reactivestreams.Publisher;
import pfm.o;
import rfm.e0;
import tfm.p2;
import tfm.s2;
import tfm.z0;

/* JADX INFO: loaded from: classes.dex */
public final class b extends r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f169905g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f169906h;

    public /* synthetic */ b(Object obj2, int i) {
        this.f169905g = i;
        this.f169906h = obj2;
    }

    @Override // efm.r
    public final void subscribeActual(y observer) {
        switch (this.f169905g) {
            case 0:
                Intrinsics.checkNotNullParameter(observer, "observer");
                View view = (View) this.f169906h;
                a aVar = new a(view, observer);
                observer.onSubscribe(aVar);
                view.setOnClickListener(aVar);
                break;
            case 1:
                ((efm.b) this.f169906h).d(new pfm.y(observer));
                break;
            case 2:
                ((k) this.f169906h).i(new e0(observer, 0));
                break;
            case 3:
                z0 z0Var = new z0(observer);
                observer.onSubscribe(z0Var);
                try {
                    ((u) this.f169906h).a(z0Var);
                } catch (Throwable th10) {
                    m70.a.u(th10);
                    z0Var.b(th10);
                    return;
                }
                break;
            case 4:
                try {
                    Object objCall = ((Callable) this.f169906h).call();
                    mfm.f.b(objCall, "null ObservableSource supplied");
                    ((w) objCall).subscribe(observer);
                } catch (Throwable th11) {
                    m70.a.u(th11);
                    lfm.e.d(th11, observer);
                    return;
                }
                break;
            case 5:
                Object[] objArr = (Object[]) this.f169906h;
                p2 p2Var = new p2(observer, objArr);
                observer.onSubscribe(p2Var);
                if (!p2Var.d) {
                    int length = objArr.length;
                    for (int i = 0; i < length && !p2Var.e; i++) {
                        Object obj2 = objArr[i];
                        if (obj2 == null) {
                            p2Var.f270714a.onError(new NullPointerException(j6.a.l(i, "The element at index ", " is null")));
                        } else {
                            p2Var.f270714a.onNext(obj2);
                        }
                        break;
                    }
                    if (!p2Var.e) {
                        p2Var.f270714a.onComplete();
                    }
                    break;
                }
                break;
            case 6:
                try {
                    Iterator it8 = ((Iterable) this.f169906h).iterator();
                    try {
                        if (it8.hasNext()) {
                            s2 s2Var = new s2(observer, it8);
                            observer.onSubscribe(s2Var);
                            if (!s2Var.d) {
                                while (!s2Var.f270805c) {
                                    try {
                                        Object next = s2Var.f270804b.next();
                                        mfm.f.b(next, "The iterator returned a null value");
                                        s2Var.f270803a.onNext(next);
                                        if (s2Var.f270805c) {
                                            break;
                                        } else {
                                            try {
                                                if (!s2Var.f270804b.hasNext()) {
                                                    if (!s2Var.f270805c) {
                                                        s2Var.f270803a.onComplete();
                                                    }
                                                    break;
                                                }
                                            } catch (Throwable th12) {
                                                m70.a.u(th12);
                                                s2Var.f270803a.onError(th12);
                                                return;
                                            }
                                        }
                                    } catch (Throwable th13) {
                                        m70.a.u(th13);
                                        s2Var.f270803a.onError(th13);
                                        return;
                                    }
                                }
                            }
                        } else {
                            lfm.e.a(observer);
                        }
                    } catch (Throwable th14) {
                        m70.a.u(th14);
                        lfm.e.d(th14, observer);
                        return;
                    }
                } catch (Throwable th15) {
                    m70.a.u(th15);
                    lfm.e.d(th15, observer);
                    return;
                }
                break;
            case 7:
                ((Publisher) this.f169906h).a(new o(observer, 1));
                break;
            default:
                ((d0) this.f169906h).q(new e0(observer, 1));
                break;
        }
    }

    public b(ImageView view) {
        this.f169905g = 0;
        Intrinsics.checkNotNullParameter(view, "view");
        this.f169906h = view;
    }
}
