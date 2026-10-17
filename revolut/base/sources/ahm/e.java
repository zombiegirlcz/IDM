package ahm;

import fgm.l;
import fgm.p;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import ygm.m;

/* JADX INFO: loaded from: classes14.dex */
public final class e implements l, Disposable, fgm.e, p, fgm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CountDownLatch f5142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f5143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f5144c;
    public boolean d;
    public final d e;
    public final AtomicReference f;

    public e() {
        d dVar = d.INSTANCE;
        this.f5143b = new m();
        this.f5144c = new m();
        this.f5142a = new CountDownLatch(1);
        this.f = new AtomicReference();
        this.e = dVar;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        jgm.b.a(this.f);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return jgm.b.b((Disposable) this.f.get());
    }

    @Override // fgm.l
    public final void onComplete() {
        CountDownLatch countDownLatch = this.f5142a;
        if (!this.d) {
            this.d = true;
            if (this.f.get() == null) {
                this.f5144c.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            Thread.currentThread();
            this.e.getClass();
        } finally {
            countDownLatch.countDown();
        }
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        CountDownLatch countDownLatch = this.f5142a;
        boolean z = this.d;
        m mVar = this.f5144c;
        if (!z) {
            this.d = true;
            if (this.f.get() == null) {
                mVar.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            Thread.currentThread();
            if (th10 == null) {
                mVar.add(new NullPointerException("onError received a null Throwable"));
            } else {
                mVar.add(th10);
            }
            this.e.getClass();
            countDownLatch.countDown();
        } catch (Throwable th11) {
            countDownLatch.countDown();
            throw th11;
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        boolean z = this.d;
        m mVar = this.f5144c;
        if (!z) {
            this.d = true;
            if (this.f.get() == null) {
                mVar.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        Thread.currentThread();
        this.f5143b.add(obj2);
        if (obj2 == null) {
            mVar.add(new NullPointerException("onNext received a null value"));
        }
        this.e.getClass();
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        AtomicReference atomicReference;
        Thread.currentThread();
        m mVar = this.f5144c;
        if (disposable == null) {
            mVar.add(new NullPointerException("onSubscribe received a null Subscription"));
            return;
        }
        do {
            atomicReference = this.f;
            if (atomicReference.compareAndSet(null, disposable)) {
                this.e.getClass();
                return;
            }
        } while (atomicReference.get() == null);
        disposable.dispose();
        if (atomicReference.get() != jgm.b.DISPOSED) {
            mVar.add(new IllegalStateException("onSubscribe received multiple subscriptions: " + disposable));
        }
    }

    @Override // fgm.e, fgm.p
    public final void onSuccess(Object obj2) {
        onNext(obj2);
        onComplete();
    }
}
