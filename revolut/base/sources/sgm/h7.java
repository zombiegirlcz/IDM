package sgm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class h7 implements fgm.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g7 f262885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bhm.i f262886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f262887c;
    public Throwable d;
    public final AtomicReference e = new AtomicReference();

    public h7(g7 g7Var, int i) {
        this.f262885a = g7Var;
        this.f262886b = new bhm.i(i);
    }

    @Override // fgm.l
    public final void onComplete() {
        this.f262887c = true;
        this.f262885a.b();
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        this.d = th10;
        this.f262887c = true;
        this.f262885a.b();
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        this.f262886b.offer(obj2);
        this.f262885a.b();
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        jgm.b.e(this.e, disposable);
    }
}
