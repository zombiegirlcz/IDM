package ngm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes14.dex */
public final class d extends CountDownLatch implements fgm.l, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f215233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Throwable f215234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Disposable f215235c;
    public volatile boolean d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i, int i2) {
        super(i);
        this.e = i2;
    }

    public final Object a() {
        if (getCount() != 0) {
            try {
                await();
            } catch (InterruptedException e) {
                dispose();
                throw ygm.g.f(e);
            }
        }
        Throwable th10 = this.f215234b;
        if (th10 == null) {
            return this.f215233a;
        }
        throw ygm.g.f(th10);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        this.d = true;
        Disposable disposable = this.f215235c;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.d;
    }

    @Override // fgm.l
    public final void onComplete() {
        countDown();
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        switch (this.e) {
            case 0:
                if (this.f215233a == null) {
                    this.f215234b = th10;
                }
                countDown();
                break;
            default:
                this.f215233a = null;
                this.f215234b = th10;
                countDown();
                break;
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        switch (this.e) {
            case 0:
                if (this.f215233a == null) {
                    this.f215233a = obj2;
                    this.f215235c.dispose();
                    countDown();
                }
                break;
            default:
                this.f215233a = obj2;
                break;
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        this.f215235c = disposable;
        if (this.d) {
            disposable.dispose();
        }
    }
}
