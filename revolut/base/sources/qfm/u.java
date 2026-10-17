package qfm;

import java.util.concurrent.Callable;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes4.dex */
public final class u extends efm.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f245552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f245553c;
    public final Object d;

    public /* synthetic */ u(Object obj2, Object obj3, int i) {
        this.f245552b = i;
        this.f245553c = obj2;
        this.d = obj3;
    }

    @Override // efm.i
    public final void o(dom.a aVar) {
        switch (this.f245552b) {
            case 0:
                t tVar = new t(aVar, (n) this.f245553c);
                aVar.e(tVar);
                ((v2) this.d).a(tVar.f245543c);
                break;
            case 1:
                try {
                    Object objApply = ((kfm.o) this.d).apply(this.f245553c);
                    mfm.f.b(objApply, "The mapper returned a null Publisher");
                    Publisher publisher = (Publisher) objApply;
                    if (!(publisher instanceof Callable)) {
                        publisher.a(aVar);
                    } else {
                        try {
                            Object objCall = ((Callable) publisher).call();
                            if (objCall != null) {
                                aVar.e(new yfm.e(aVar, objCall));
                            } else {
                                yfm.d.c(aVar);
                            }
                        } catch (Throwable th10) {
                            m70.a.u(th10);
                            yfm.d.d(th10, aVar);
                            return;
                        }
                    }
                } catch (Throwable th11) {
                    yfm.d.d(th11, aVar);
                    return;
                }
                break;
            default:
                ((pfm.h) this.f245553c).d(new sfm.c(aVar, (f1) this.d));
                break;
        }
    }
}
