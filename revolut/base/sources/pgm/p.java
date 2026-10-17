package pgm;

import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public final class p extends wgm.b implements bhm.a {
    public final igm.o e;
    public final igm.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f236122g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f236123h;

    public p(dom.a aVar, qy5.a aVar2, dcl.q qVar) {
        super(aVar);
        this.e = aVar2;
        this.f = qVar;
    }

    @Override // bhm.c
    public final int b(int i) {
        return 0;
    }

    @Override // bhm.a
    public final boolean d(Object obj2) {
        if (this.d) {
            return false;
        }
        try {
            Object objApply = this.e.apply(obj2);
            if (this.f236123h) {
                igm.d dVar = this.f;
                Object obj3 = this.f236122g;
                ((dcl.q) dVar).getClass();
                boolean zEquals = Objects.equals(obj3, objApply);
                this.f236122g = objApply;
                if (zEquals) {
                    return false;
                }
            } else {
                this.f236123h = true;
                this.f236122g = objApply;
            }
            this.f297348a.onNext(obj2);
            return true;
        } catch (Throwable th10) {
            c(th10);
            return true;
        }
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        if (d(obj2)) {
            return;
        }
        this.f297349b.a(1L);
    }

    @Override // bhm.g
    public final Object poll() {
        while (true) {
            Object objPoll = this.f297350c.poll();
            if (objPoll == null) {
                return null;
            }
            Object objApply = this.e.apply(objPoll);
            if (!this.f236123h) {
                this.f236123h = true;
                this.f236122g = objApply;
                return objPoll;
            }
            Object obj2 = this.f236122g;
            ((dcl.q) this.f).getClass();
            if (!Objects.equals(obj2, objApply)) {
                this.f236122g = objApply;
                return objPoll;
            }
            this.f236122g = objApply;
            this.f297349b.a(1L);
        }
    }
}
