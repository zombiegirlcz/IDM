package dgm;

import e8.q;
import io.reactivex.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicLong;
import zfm.k;
import zfm.m;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends AtomicLong implements dom.b, zfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dom.a f114713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f114714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f114715c;
    public boolean d;
    public q e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f114716g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f114717h;

    public a(dom.a aVar, b bVar) {
        this.f114713a = aVar;
        this.f114714b = bVar;
    }

    @Override // dom.b
    public final void a(long j2) {
        if (yfm.g.f(j2)) {
            com.bumptech.glide.d.a(this, j2);
        }
    }

    public final void b(long j2, Object obj2) {
        if (this.f114716g) {
            return;
        }
        if (!this.f) {
            synchronized (this) {
                try {
                    if (this.f114716g) {
                        return;
                    }
                    if (this.f114717h == j2) {
                        return;
                    }
                    if (this.d) {
                        q qVar = this.e;
                        if (qVar == null) {
                            qVar = new q(4, (byte) 0);
                            this.e = qVar;
                        }
                        qVar.c(obj2);
                        return;
                    }
                    this.f114715c = true;
                    this.f = true;
                } catch (Throwable th10) {
                    throw th10;
                }
            }
        }
        test(obj2);
    }

    @Override // dom.b
    public final void cancel() {
        if (this.f114716g) {
            return;
        }
        this.f114716g = true;
        this.f114714b.t(this);
    }

    @Override // kfm.p
    public final boolean test(Object obj2) {
        if (this.f114716g) {
            return true;
        }
        if (m.c(obj2)) {
            this.f114713a.onComplete();
            return true;
        }
        if (obj2 instanceof k) {
            this.f114713a.onError(((k) obj2).f322037a);
            return true;
        }
        long j2 = get();
        if (j2 == 0) {
            cancel();
            this.f114713a.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
            return true;
        }
        this.f114713a.onNext(obj2);
        if (j2 == Long.MAX_VALUE) {
            return false;
        }
        decrementAndGet();
        return false;
    }
}
