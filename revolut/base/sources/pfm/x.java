package pfm;

import efm.d0;
import efm.h0;
import java.util.Iterator;
import qfm.x0;
import qfm.y0;
import qfm.z0;

/* JADX INFO: loaded from: classes13.dex */
public final class x extends efm.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f235774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f235775c;

    public /* synthetic */ x(Object obj2, int i) {
        this.f235774b = i;
        this.f235775c = obj2;
    }

    @Override // efm.i
    public final void o(dom.a aVar) {
        switch (this.f235774b) {
            case 0:
                ((efm.b) this.f235775c).d(new ofm.r(aVar));
                break;
            case 1:
                try {
                    Object obj2 = ((mfm.d) this.f235775c).f205040a;
                    mfm.f.b(obj2, "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
                    th = (Throwable) obj2;
                } catch (Throwable th10) {
                    th = th10;
                    m70.a.u(th);
                }
                yfm.d.d(th, aVar);
                break;
            case 2:
                try {
                    Iterator it8 = ((Iterable) this.f235775c).iterator();
                    try {
                        if (!it8.hasNext()) {
                            yfm.d.c(aVar);
                        } else if (!(aVar instanceof nfm.a)) {
                            aVar.e(new y0(aVar, it8));
                        } else {
                            aVar.e(new x0((nfm.a) aVar, it8));
                        }
                    } catch (Throwable th11) {
                        m70.a.u(th11);
                        yfm.d.d(th11, aVar);
                        return;
                    }
                } catch (Throwable th12) {
                    m70.a.u(th12);
                    yfm.d.d(th12, aVar);
                    return;
                }
                break;
            case 3:
                ((efm.r) this.f235775c).subscribe(new z0(aVar));
                break;
            default:
                ((d0) ((h0) this.f235775c)).q(new ufm.q(aVar));
                break;
        }
    }
}
