package sgm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
public final class g1 implements fgm.l, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ahm.c f262845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f262846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f262847c;
    public final fgm.o d;
    public final igm.g e;
    public Disposable f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public pgm.k f262848g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile long f262849h;
    public boolean i;

    public g1(ahm.c cVar, long j2, TimeUnit timeUnit, fgm.o oVar, igm.g gVar) {
        this.f262845a = cVar;
        this.f262846b = j2;
        this.f262847c = timeUnit;
        this.d = oVar;
        this.e = gVar;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        this.f.dispose();
        this.d.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.d.isDisposed();
    }

    @Override // fgm.l
    public final void onComplete() {
        if (this.i) {
            return;
        }
        this.i = true;
        pgm.k kVar = this.f262848g;
        if (kVar != null) {
            jgm.b.a(kVar);
        }
        if (kVar != null) {
            kVar.run();
        }
        this.f262845a.onComplete();
        this.d.dispose();
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        if (this.i) {
            jb3.l.v(th10);
            return;
        }
        pgm.k kVar = this.f262848g;
        if (kVar != null) {
            jgm.b.a(kVar);
        }
        this.i = true;
        this.f262845a.onError(th10);
        this.d.dispose();
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        if (this.i) {
            return;
        }
        long j2 = this.f262849h + 1;
        this.f262849h = j2;
        pgm.k kVar = this.f262848g;
        if (kVar != null) {
            jgm.b.a(kVar);
        }
        igm.g gVar = this.e;
        if (gVar != null && kVar != null) {
            try {
                gVar.accept(this.f262848g.f236088b);
            } catch (Throwable th10) {
                ce9.m.F(th10);
                this.f.dispose();
                this.f262845a.onError(th10);
                this.i = true;
            }
        }
        pgm.k kVar2 = new pgm.k(obj2, j2, this);
        this.f262848g = kVar2;
        jgm.b.c(kVar2, this.d.a(kVar2, this.f262846b, this.f262847c));
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        if (jgm.b.f(this.f, disposable)) {
            this.f = disposable;
            this.f262845a.onSubscribe(this);
        }
    }
}
