package nbm;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
public final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f214098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f214099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d[] f214100c;
    public int d = 0;

    public c(int i) {
        this.f214098a = i;
        this.f214100c = new d[i];
        for (int i2 = 0; i2 < this.f214098a; i2++) {
            this.f214100c[i2] = new d();
        }
        this.f214099b = new d();
    }

    @Override // nbm.f
    public final synchronized g8.f a(long j2, e eVar) {
        g8.f fVar;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        synchronized (this) {
            this.f214099b.a(j2, eVar);
            int i = (this.d + 1) % this.f214098a;
            this.d = i;
            d dVar = this.f214100c[i];
            this.f214099b.b(dVar);
            dVar.f214095a = 0L;
            dVar.f214096b = 0;
            dVar.f214097c = 0;
            dVar.d = 0;
            dVar.a(j2, eVar);
            fVar = new g8.f(this.f214099b);
        }
        return fVar;
    }

    @Override // nbm.f
    public final synchronized g8.f b() {
        return new g8.f(this.f214099b);
    }
}
