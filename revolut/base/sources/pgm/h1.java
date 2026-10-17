package pgm;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes14.dex */
public final class h1 extends AtomicInteger implements fgm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dom.a f236069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xgm.e f236070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Publisher f236071c;
    public final igm.p d;
    public long e;
    public long f;

    public h1(dom.a aVar, long j2, igm.p pVar, xgm.e eVar, Publisher publisher) {
        this.f236069a = aVar;
        this.f236070b = eVar;
        this.f236071c = publisher;
        this.d = pVar;
        this.e = j2;
    }

    public final void a() {
        if (getAndIncrement() == 0) {
            int iAddAndGet = 1;
            while (!this.f236070b.f) {
                long j2 = this.f;
                if (j2 != 0) {
                    this.f = 0L;
                    this.f236070b.c(j2);
                }
                this.f236071c.a(this);
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        this.f236070b.f(bVar);
    }

    @Override // dom.a
    public final void onComplete() {
        this.f236069a.onComplete();
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        long j2 = this.e;
        if (j2 != Long.MAX_VALUE) {
            this.e = j2 - 1;
        }
        dom.a aVar = this.f236069a;
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
            ce9.m.F(th11);
            aVar.onError(new CompositeException(th10, th11));
        }
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        this.f++;
        this.f236069a.onNext(obj2);
    }
}
