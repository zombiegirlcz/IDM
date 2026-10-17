package dgm;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes13.dex */
public final class d extends AtomicLong implements dom.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dom.a f114723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f114724b;

    public d(dom.a aVar, e eVar) {
        this.f114723a = aVar;
        this.f114724b = eVar;
    }

    @Override // dom.b
    public final void a(long j2) {
        long j3;
        if (yfm.g.f(j2)) {
            do {
                j3 = get();
                if (j3 == Long.MIN_VALUE || j3 == Long.MAX_VALUE) {
                    return;
                }
            } while (!compareAndSet(j3, com.bumptech.glide.d.b(j3, j2)));
        }
    }

    @Override // dom.b
    public final void cancel() {
        if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
            this.f114724b.t(this);
        }
    }
}
