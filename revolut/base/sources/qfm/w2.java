package qfm;

import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public final class w2 extends yfm.c implements efm.j, dom.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public dom.b f245576c;

    @Override // yfm.c, dom.b
    public final void cancel() {
        super.cancel();
        this.f245576c.cancel();
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (yfm.g.h(this.f245576c, bVar)) {
            this.f245576c = bVar;
            this.f313466a.e(this);
            bVar.a(Long.MAX_VALUE);
        }
    }

    @Override // dom.a
    public final void onComplete() {
        c(this.f313467b);
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        this.f313467b = null;
        this.f313466a.onError(th10);
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        Collection collection = (Collection) this.f313467b;
        if (collection != null) {
            collection.add(obj2);
        }
    }
}
