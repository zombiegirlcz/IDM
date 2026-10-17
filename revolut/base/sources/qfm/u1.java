package qfm;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public final class u1 extends AtomicLong implements efm.j, dom.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dom.a f245557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public dom.b f245558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f245559c;
    public long d;
    public final kfm.o e;

    public u1(dom.a aVar, mfm.d dVar) {
        this.f245557a = aVar;
        this.e = dVar;
    }

    @Override // dom.b
    public final void a(long j2) {
        long j3;
        if (yfm.g.f(j2)) {
            do {
                j3 = get();
                if ((j3 & Long.MIN_VALUE) != 0) {
                    if (compareAndSet(Long.MIN_VALUE, -9223372036854775807L)) {
                        Object obj2 = this.f245559c;
                        dom.a aVar = this.f245557a;
                        aVar.onNext(obj2);
                        aVar.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(j3, com.bumptech.glide.d.b(j3, j2)));
            this.f245558b.a(j2);
        }
    }

    @Override // dom.b
    public final void cancel() {
        this.f245558b.cancel();
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (yfm.g.h(this.f245558b, bVar)) {
            this.f245558b = bVar;
            this.f245557a.e(this);
        }
    }

    @Override // dom.a
    public final void onComplete() {
        this.f245557a.onComplete();
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        dom.a aVar = this.f245557a;
        try {
            Object objApply = this.e.apply(th10);
            mfm.f.b(objApply, "The valueSupplier returned a null value");
            long j2 = this.d;
            if (j2 != 0) {
                com.bumptech.glide.d.A(this, j2);
            }
            while (true) {
                long j3 = get();
                if ((j3 & Long.MIN_VALUE) != 0) {
                    return;
                }
                if ((j3 & Long.MAX_VALUE) != 0) {
                    lazySet(-9223372036854775807L);
                    aVar.onNext(objApply);
                    aVar.onComplete();
                    return;
                } else {
                    this.f245559c = objApply;
                    if (compareAndSet(0L, Long.MIN_VALUE)) {
                        return;
                    } else {
                        this.f245559c = null;
                    }
                }
            }
        } catch (Throwable th11) {
            m70.a.u(th11);
            aVar.onError(new CompositeException(th10, th11));
        }
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        this.d++;
        this.f245557a.onNext(obj2);
    }
}
