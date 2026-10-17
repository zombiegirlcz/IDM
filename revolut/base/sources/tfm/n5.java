package tfm;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class n5 extends p5 {
    public final AtomicInteger e;
    public volatile boolean f;

    public n5(bgm.d dVar, efm.w wVar) {
        super(dVar, wVar);
        this.e = new AtomicInteger();
    }

    @Override // tfm.p5
    public final void a() {
        this.f = true;
        if (this.e.getAndIncrement() == 0) {
            Object andSet = getAndSet(null);
            if (andSet != null) {
                this.f270720a.onNext(andSet);
            }
            this.f270720a.onComplete();
        }
    }

    @Override // tfm.p5
    public final void b() {
        if (this.e.getAndIncrement() == 0) {
            do {
                boolean z = this.f;
                Object andSet = getAndSet(null);
                if (andSet != null) {
                    this.f270720a.onNext(andSet);
                }
                if (z) {
                    this.f270720a.onComplete();
                    return;
                }
            } while (this.e.decrementAndGet() != 0);
        }
    }
}
