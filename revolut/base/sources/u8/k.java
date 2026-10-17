package u8;

/* JADX INFO: loaded from: classes16.dex */
public final class k implements e, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f278021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f278022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile j f278023c;
    public volatile c d;
    public d e;
    public d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f278024g;

    public k(Object obj2, e eVar) {
        d dVar = d.CLEARED;
        this.e = dVar;
        this.f = dVar;
        this.f278022b = obj2;
        this.f278021a = eVar;
    }

    @Override // u8.e, u8.c
    public final boolean a() {
        boolean z;
        synchronized (this.f278022b) {
            try {
                z = this.d.a() || this.f278023c.a();
            } finally {
            }
        }
        return z;
    }

    @Override // u8.e
    public final boolean b(c cVar) {
        boolean z;
        synchronized (this.f278022b) {
            try {
                e eVar = this.f278021a;
                z = (eVar == null || eVar.b(this)) && (cVar.equals(this.f278023c) || this.e != d.SUCCESS);
            } finally {
            }
        }
        return z;
    }

    @Override // u8.c
    public final boolean c() {
        boolean z;
        synchronized (this.f278022b) {
            z = this.e == d.CLEARED;
        }
        return z;
    }

    @Override // u8.c
    public final void clear() {
        synchronized (this.f278022b) {
            this.f278024g = false;
            d dVar = d.CLEARED;
            this.e = dVar;
            this.f = dVar;
            this.d.clear();
            this.f278023c.clear();
        }
    }

    @Override // u8.e
    public final void d(c cVar) {
        synchronized (this.f278022b) {
            try {
                if (!cVar.equals(this.f278023c)) {
                    this.f = d.FAILED;
                    return;
                }
                this.e = d.FAILED;
                e eVar = this.f278021a;
                if (eVar != null) {
                    eVar.d(this);
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // u8.e
    public final boolean e(c cVar) {
        boolean z;
        synchronized (this.f278022b) {
            try {
                e eVar = this.f278021a;
                z = (eVar == null || eVar.e(this)) && cVar.equals(this.f278023c) && this.e != d.PAUSED;
            } finally {
            }
        }
        return z;
    }

    @Override // u8.c
    public final boolean f(c cVar) {
        if (!(cVar instanceof k)) {
            return false;
        }
        k kVar = (k) cVar;
        if (this.f278023c == null) {
            if (kVar.f278023c != null) {
                return false;
            }
        } else if (!this.f278023c.f(kVar.f278023c)) {
            return false;
        }
        return this.d == null ? kVar.d == null : this.d.f(kVar.d);
    }

    @Override // u8.e
    public final void g(c cVar) {
        synchronized (this.f278022b) {
            try {
                if (cVar.equals(this.d)) {
                    this.f = d.SUCCESS;
                    return;
                }
                this.e = d.SUCCESS;
                e eVar = this.f278021a;
                if (eVar != null) {
                    eVar.g(this);
                }
                if (!this.f.a()) {
                    this.d.clear();
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // u8.e
    public final e getRoot() {
        e root;
        synchronized (this.f278022b) {
            try {
                e eVar = this.f278021a;
                root = eVar != null ? eVar.getRoot() : this;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return root;
    }

    @Override // u8.e
    public final boolean h(c cVar) {
        boolean z;
        synchronized (this.f278022b) {
            try {
                e eVar = this.f278021a;
                z = (eVar == null || eVar.h(this)) && cVar.equals(this.f278023c) && !a();
            } finally {
            }
        }
        return z;
    }

    @Override // u8.c
    public final void i() {
        synchronized (this.f278022b) {
            try {
                this.f278024g = true;
                try {
                    if (this.e != d.SUCCESS) {
                        d dVar = this.f;
                        d dVar2 = d.RUNNING;
                        if (dVar != dVar2) {
                            this.f = dVar2;
                            this.d.i();
                        }
                    }
                    if (this.f278024g) {
                        d dVar3 = this.e;
                        d dVar4 = d.RUNNING;
                        if (dVar3 != dVar4) {
                            this.e = dVar4;
                            this.f278023c.i();
                        }
                    }
                    this.f278024g = false;
                } catch (Throwable th10) {
                    this.f278024g = false;
                    throw th10;
                }
            } catch (Throwable th11) {
                throw th11;
            }
        }
    }

    @Override // u8.c
    public final boolean isComplete() {
        boolean z;
        synchronized (this.f278022b) {
            z = this.e == d.SUCCESS;
        }
        return z;
    }

    @Override // u8.c
    public final boolean isRunning() {
        boolean z;
        synchronized (this.f278022b) {
            z = this.e == d.RUNNING;
        }
        return z;
    }

    public final void j(c cVar, c cVar2) {
        this.f278023c = (j) cVar;
        this.d = cVar2;
    }

    @Override // u8.c
    public final void pause() {
        synchronized (this.f278022b) {
            try {
                if (!this.f.a()) {
                    this.f = d.PAUSED;
                    this.d.pause();
                }
                if (!this.e.a()) {
                    this.e = d.PAUSED;
                    this.f278023c.pause();
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }
}
