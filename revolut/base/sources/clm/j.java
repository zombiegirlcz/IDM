package clm;

import efm.y;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: loaded from: classes13.dex */
public final class j implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ProducerScope f25076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f25077b;

    public j(AtomicReference atomicReference, ProducerScope producerScope) {
        this.f25076a = producerScope;
        this.f25077b = atomicReference;
    }

    @Override // efm.y
    public final void onComplete() {
        this.f25076a.close(null);
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        this.f25076a.close(th10);
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        try {
            com.bumptech.glide.c.E(this.f25076a, obj2);
        } catch (InterruptedException unused) {
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        AtomicReference atomicReference;
        do {
            atomicReference = this.f25077b;
            if (atomicReference.compareAndSet(null, cVar)) {
                return;
            }
        } while (atomicReference.get() == null);
        cVar.dispose();
    }
}
