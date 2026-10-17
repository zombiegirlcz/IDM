package sgm;

import io.reactivex.rxjava3.core.ObservableSource;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes14.dex */
public final class e5 extends g5 {
    public final AtomicInteger e;
    public volatile boolean f;

    public e5(ahm.c cVar, ObservableSource observableSource) {
        super(cVar, observableSource);
        this.e = new AtomicInteger();
    }

    @Override // sgm.g5
    public final void a() {
        this.f = true;
        if (this.e.getAndIncrement() == 0) {
            Object andSet = getAndSet(null);
            if (andSet != null) {
                this.f262859a.onNext(andSet);
            }
            this.f262859a.onComplete();
        }
    }

    @Override // sgm.g5
    public final void b() {
        if (this.e.getAndIncrement() == 0) {
            do {
                boolean z = this.f;
                Object andSet = getAndSet(null);
                if (andSet != null) {
                    this.f262859a.onNext(andSet);
                }
                if (z) {
                    this.f262859a.onComplete();
                    return;
                }
            } while (this.e.decrementAndGet() != 0);
        }
    }
}
