package qfm;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public final class a0 extends yfm.c implements efm.j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f245363c;
    public final boolean d;
    public dom.b e;
    public long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f245364g;

    public a0(dom.a aVar, Object obj2, boolean z) {
        super(aVar);
        this.f245363c = obj2;
        this.d = z;
    }

    @Override // yfm.c, dom.b
    public final void cancel() {
        super.cancel();
        this.e.cancel();
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (yfm.g.h(this.e, bVar)) {
            this.e = bVar;
            this.f313466a.e(this);
            bVar.a(Long.MAX_VALUE);
        }
    }

    @Override // dom.a
    public final void onComplete() {
        if (this.f245364g) {
            return;
        }
        this.f245364g = true;
        Object obj2 = this.f245363c;
        if (obj2 != null) {
            c(obj2);
            return;
        }
        boolean z = this.d;
        dom.a aVar = this.f313466a;
        if (z) {
            aVar.onError(new NoSuchElementException());
        } else {
            aVar.onComplete();
        }
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        if (this.f245364g) {
            mo3.a.m(th10);
        } else {
            this.f245364g = true;
            this.f313466a.onError(th10);
        }
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        if (this.f245364g) {
            return;
        }
        long j2 = this.f;
        if (j2 != 0) {
            this.f = j2 + 1;
            return;
        }
        this.f245364g = true;
        this.e.cancel();
        c(obj2);
    }
}
