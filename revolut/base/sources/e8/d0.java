package e8;

/* JADX INFO: loaded from: classes.dex */
public final class d0 implements e0, z8.b {
    public static final gpk.c e = z8.d.a(20, new he2.b(10));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z8.e f123444a = new z8.e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e0 f123445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f123446c;
    public boolean d;

    @Override // e8.e0
    public final Class a() {
        return this.f123445b.a();
    }

    @Override // z8.b
    public final z8.e b() {
        return this.f123444a;
    }

    public final synchronized void c() {
        this.f123444a.a();
        if (!this.f123446c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f123446c = false;
        if (this.d) {
            recycle();
        }
    }

    @Override // e8.e0
    public final Object get() {
        return this.f123445b.get();
    }

    @Override // e8.e0
    public final int getSize() {
        return this.f123445b.getSize();
    }

    @Override // e8.e0
    public final synchronized void recycle() {
        this.f123444a.a();
        this.d = true;
        if (!this.f123446c) {
            this.f123445b.recycle();
            this.f123445b = null;
            e.release(this);
        }
    }
}
