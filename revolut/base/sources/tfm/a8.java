package tfm;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class a8 implements efm.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z7 f270349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vfm.c f270350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f270351c;
    public Throwable d;
    public final AtomicReference e = new AtomicReference();

    public a8(z7 z7Var, int i) {
        this.f270349a = z7Var;
        this.f270350b = new vfm.c(i);
    }

    @Override // efm.y
    public final void onComplete() {
        this.f270351c = true;
        this.f270349a.b();
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        this.d = th10;
        this.f270351c = true;
        this.f270349a.b();
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        this.f270350b.offer(obj2);
        this.f270349a.b();
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        lfm.d.e(this.e, cVar);
    }
}
