package ygm;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class c extends AtomicReference {
    public final boolean a(Throwable th10) {
        if (g.a(this, th10)) {
            return true;
        }
        jb3.l.v(th10);
        return false;
    }

    public final void b() {
        Throwable thD = g.d(this);
        if (thD == null || thD == g.f313672a) {
            return;
        }
        jb3.l.v(thD);
    }

    public final void c(dom.a aVar) {
        Throwable thD = g.d(this);
        if (thD == null) {
            aVar.onComplete();
        } else if (thD != g.f313672a) {
            aVar.onError(thD);
        }
    }

    public final void d(fgm.b bVar) {
        Throwable thD = g.d(this);
        if (thD == null) {
            bVar.onComplete();
        } else if (thD != g.f313672a) {
            bVar.onError(thD);
        }
    }

    public final void e(fgm.l lVar) {
        Throwable thD = g.d(this);
        if (thD == null) {
            lVar.onComplete();
        } else if (thD != g.f313672a) {
            lVar.onError(thD);
        }
    }
}
