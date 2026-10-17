package bgm;

import efm.f0;
import efm.l;
import efm.y;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import zfm.o;

/* JADX INFO: loaded from: classes4.dex */
public class f extends a implements y, l, f0, efm.d {
    public final e e;
    public final AtomicReference f;

    public f() {
        e eVar = e.INSTANCE;
        this.f = new AtomicReference();
        this.e = eVar;
    }

    @Override // ifm.c
    public final void dispose() {
        lfm.d.a(this.f);
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return lfm.d.b((ifm.c) this.f.get());
    }

    @Override // efm.y
    public final void onComplete() {
        CountDownLatch countDownLatch = this.f15212a;
        if (!this.d) {
            this.d = true;
            if (this.f.get() == null) {
                this.f15214c.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            Thread.currentThread();
            this.e.getClass();
        } finally {
            countDownLatch.countDown();
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        CountDownLatch countDownLatch = this.f15212a;
        boolean z = this.d;
        o oVar = this.f15214c;
        if (!z) {
            this.d = true;
            if (this.f.get() == null) {
                oVar.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            Thread.currentThread();
            if (th10 == null) {
                oVar.add(new NullPointerException("onError received a null Throwable"));
            } else {
                oVar.add(th10);
            }
            this.e.getClass();
            countDownLatch.countDown();
        } catch (Throwable th11) {
            countDownLatch.countDown();
            throw th11;
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        boolean z = this.d;
        o oVar = this.f15214c;
        if (!z) {
            this.d = true;
            if (this.f.get() == null) {
                oVar.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        Thread.currentThread();
        this.f15213b.add(obj2);
        if (obj2 == null) {
            oVar.add(new NullPointerException("onNext received a null value"));
        }
        this.e.getClass();
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        AtomicReference atomicReference;
        Thread.currentThread();
        o oVar = this.f15214c;
        if (cVar == null) {
            oVar.add(new NullPointerException("onSubscribe received a null Subscription"));
            return;
        }
        do {
            atomicReference = this.f;
            if (atomicReference.compareAndSet(null, cVar)) {
                this.e.getClass();
                return;
            }
        } while (atomicReference.get() == null);
        cVar.dispose();
        if (atomicReference.get() != lfm.d.DISPOSED) {
            oVar.add(new IllegalStateException("onSubscribe received multiple subscriptions: " + cVar));
        }
    }

    @Override // efm.l, efm.f0
    public final void onSuccess(Object obj2) {
        onNext(obj2);
        onComplete();
    }
}
