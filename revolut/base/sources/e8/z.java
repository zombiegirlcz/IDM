package e8;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes.dex */
public final class z implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f123543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f123544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f123545c;
    public final y d;
    public final c8.g e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f123546g;

    public z(e0 e0Var, boolean z, boolean z3, c8.g gVar, y yVar) {
        y8.f.c(e0Var, "Argument must not be null");
        this.f123545c = e0Var;
        this.f123543a = z;
        this.f123544b = z3;
        this.e = gVar;
        y8.f.c(yVar, "Argument must not be null");
        this.d = yVar;
    }

    @Override // e8.e0
    public final Class a() {
        return this.f123545c.a();
    }

    public final synchronized void b() {
        if (this.f123546g) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f++;
    }

    public final void c() {
        boolean z;
        synchronized (this) {
            int i = this.f;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z = true;
            int i2 = i - 1;
            this.f = i2;
            if (i2 != 0) {
                z = false;
            }
        }
        if (z) {
            ((s) this.d).e(this.e, this);
        }
    }

    @Override // e8.e0
    public final Object get() {
        return this.f123545c.get();
    }

    @Override // e8.e0
    public final int getSize() {
        return this.f123545c.getSize();
    }

    @Override // e8.e0
    public final synchronized void recycle() {
        if (this.f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f123546g) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f123546g = true;
        if (this.f123544b) {
            this.f123545c.recycle();
        }
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f123543a + ", listener=" + this.d + ", key=" + this.e + ", acquired=" + this.f + ", isRecycled=" + this.f123546g + ", resource=" + this.f123545c + CoreConstants.CURLY_RIGHT;
    }
}
