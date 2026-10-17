package qfm;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public final class f2 extends yfm.c implements efm.j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f245410c;
    public dom.b d;
    public boolean e;

    public f2(dom.a aVar, boolean z) {
        super(aVar);
        this.f245410c = z;
    }

    @Override // yfm.c, dom.b
    public final void cancel() {
        super.cancel();
        this.d.cancel();
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (yfm.g.h(this.d, bVar)) {
            this.d = bVar;
            this.f313466a.e(this);
            bVar.a(Long.MAX_VALUE);
        }
    }

    @Override // dom.a
    public final void onComplete() {
        if (this.e) {
            return;
        }
        this.e = true;
        Object obj2 = this.f313467b;
        this.f313467b = null;
        if (obj2 == null) {
            obj2 = null;
        }
        if (obj2 != null) {
            c(obj2);
            return;
        }
        boolean z = this.f245410c;
        dom.a aVar = this.f313466a;
        if (z) {
            aVar.onError(new NoSuchElementException());
        } else {
            aVar.onComplete();
        }
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        if (this.e) {
            mo3.a.m(th10);
        } else {
            this.e = true;
            this.f313466a.onError(th10);
        }
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        if (this.e) {
            return;
        }
        if (this.f313467b == null) {
            this.f313467b = obj2;
            return;
        }
        this.e = true;
        this.d.cancel();
        this.f313466a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
    }
}
