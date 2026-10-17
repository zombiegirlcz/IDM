package sgm;

import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: classes14.dex */
public final class q2 implements fgm.c, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.l f263096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final igm.g f263097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f263098c;
    public volatile boolean d;
    public boolean e;

    public q2(fgm.l lVar, igm.c cVar, igm.g gVar, Object obj2) {
        this.f263096a = lVar;
        this.f263097b = gVar;
        this.f263098c = obj2;
    }

    public final void b(Object obj2) {
        try {
            this.f263097b.accept(obj2);
        } catch (Throwable th10) {
            ce9.m.F(th10);
            jb3.l.v(th10);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        this.d = true;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.d;
    }
}
