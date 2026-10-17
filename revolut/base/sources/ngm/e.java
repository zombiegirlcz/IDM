package ngm;

import fgm.p;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes14.dex */
public final class e extends CountDownLatch implements p, fgm.b, fgm.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f215236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Throwable f215237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Disposable f215238c;
    public volatile boolean d;

    public final Object a() {
        if (getCount() != 0) {
            try {
                await();
            } catch (InterruptedException e) {
                this.d = true;
                Disposable disposable = this.f215238c;
                if (disposable != null) {
                    disposable.dispose();
                }
                throw ygm.g.f(e);
            }
        }
        Throwable th10 = this.f215237b;
        if (th10 == null) {
            return this.f215236a;
        }
        throw ygm.g.f(th10);
    }

    @Override // fgm.b
    public final void onComplete() {
        countDown();
    }

    @Override // fgm.p
    public final void onError(Throwable th10) {
        this.f215237b = th10;
        countDown();
    }

    @Override // fgm.p
    public final void onSubscribe(Disposable disposable) {
        this.f215238c = disposable;
        if (this.d) {
            disposable.dispose();
        }
    }

    @Override // fgm.p
    public final void onSuccess(Object obj2) {
        this.f215236a = obj2;
        countDown();
    }
}
