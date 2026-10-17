package pgm;

import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public final class o extends wgm.a {
    public final igm.o e;
    public final igm.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f236116g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f236117h;

    public o(bhm.a aVar, qy5.a aVar2, dcl.q qVar) {
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
            if (this.f236117h) {
                igm.d dVar = this.f;
                Object obj3 = this.f236116g;
                ((dcl.q) dVar).getClass();
                boolean zEquals = Objects.equals(obj3, objApply);
                this.f236116g = objApply;
                if (zEquals) {
                    return false;
                }
            } else {
                this.f236117h = true;
                this.f236116g = objApply;
            }
            this.f297345a.onNext(obj2);
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
        this.f297346b.a(1L);
    }

    @Override // bhm.g
    public final Object poll() {
        while (true) {
            Object objPoll = this.f297347c.poll();
            if (objPoll == null) {
                return null;
            }
            Object objApply = this.e.apply(objPoll);
            if (!this.f236117h) {
                this.f236117h = true;
                this.f236116g = objApply;
                return objPoll;
            }
            Object obj2 = this.f236116g;
            ((dcl.q) this.f).getClass();
            if (!Objects.equals(obj2, objApply)) {
                this.f236116g = objApply;
                return objPoll;
            }
            this.f236116g = objApply;
            this.f297346b.a(1L);
        }
    }
}
