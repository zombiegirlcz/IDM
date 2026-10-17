package ogm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class o extends AtomicReference implements Disposable, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f225238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f225239b;

    public /* synthetic */ o(Object obj2, int i) {
        this.f225238a = i;
        this.f225239b = obj2;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        switch (this.f225238a) {
            case 0:
                jgm.b.a(this);
                break;
            default:
                jgm.b.a(this);
                break;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        switch (this.f225238a) {
            case 0:
                return jgm.b.b((Disposable) get());
            default:
                return get() == jgm.b.DISPOSED;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f225238a) {
            case 0:
                ((fgm.b) this.f225239b).onComplete();
                break;
            default:
                fgm.l lVar = (fgm.l) this.f225239b;
                if (!isDisposed()) {
                    lVar.onNext(0L);
                    lazySet(jgm.c.INSTANCE);
                    lVar.onComplete();
                }
                break;
        }
    }
}
