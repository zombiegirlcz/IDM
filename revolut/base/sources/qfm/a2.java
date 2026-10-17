package qfm;

import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes13.dex */
public final class a2 extends AtomicInteger implements efm.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dom.a f245367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yfm.f f245368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Publisher f245369c;
    public final kfm.p d;
    public long e;
    public long f;

    public a2(dom.a aVar, long j2, kfm.p pVar, yfm.f fVar, Publisher publisher) {
        this.f245367a = aVar;
        this.f245368b = fVar;
        this.f245369c = publisher;
        this.d = pVar;
        this.e = j2;
    }

    public final void a() {
        if (getAndIncrement() == 0) {
            int iAddAndGet = 1;
            while (!this.f245368b.f313473g) {
                long j2 = this.f;
                if (j2 != 0) {
                    this.f = 0L;
                    this.f245368b.c(j2);
                }
                this.f245369c.a(this);
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        this.f245368b.f(bVar);
    }

    @Override // dom.a
    public final void onComplete() {
        this.f245367a.onComplete();
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        long j2 = this.e;
        if (j2 != Long.MAX_VALUE) {
            this.e = j2 - 1;
        }
        dom.a aVar = this.f245367a;
        if (j2 == 0) {
            aVar.onError(th10);
            return;
        }
        try {
            if (this.d.test(th10)) {
                a();
            } else {
                aVar.onError(th10);
            }
        } catch (Throwable th11) {
            m70.a.u(th11);
            aVar.onError(new CompositeException(th10, th11));
        }
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        this.f++;
        this.f245367a.onNext(obj2);
    }
}
