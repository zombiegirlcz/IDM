package u8;

/* JADX INFO: loaded from: classes16.dex */
public final class b implements e, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f277997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f277998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile c f277999c;
    public volatile c d;
    public d e;
    public d f;

    public b(Object obj2, e eVar) {
        d dVar = d.CLEARED;
        this.e = dVar;
        this.f = dVar;
        this.f277997a = obj2;
        this.f277998b = eVar;
    }

    @Override // u8.e, u8.c
    public final boolean a() {
        boolean z;
        synchronized (this.f277997a) {
            try {
                z = this.f277999c.a() || this.d.a();
            } finally {
            }
        }
        return z;
    }

    @Override // u8.e
    public final boolean b(c cVar) {
        boolean z;
        synchronized (this.f277997a) {
            e eVar = this.f277998b;
            z = eVar == null || eVar.b(this);
        }
        return z;
    }

    @Override // u8.c
    public final boolean c() {
        boolean z;
        synchronized (this.f277997a) {
            try {
                d dVar = this.e;
                d dVar2 = d.CLEARED;
                z = dVar == dVar2 && this.f == dVar2;
            } finally {
            }
        }
        return z;
    }

    @Override // u8.c
    public final void clear() {
        synchronized (this.f277997a) {
            try {
                d dVar = d.CLEARED;
                this.e = dVar;
                this.f277999c.clear();
                if (this.f != dVar) {
                    this.f = dVar;
                    this.d.clear();
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // u8.e
    public final void d(c cVar) {
        synchronized (this.f277997a) {
            try {
                if (cVar.equals(this.d)) {
                    this.f = d.FAILED;
                    e eVar = this.f277998b;
                    if (eVar != null) {
                        eVar.d(this);
                    }
                    return;
                }
                this.e = d.FAILED;
                d dVar = this.f;
                d dVar2 = d.RUNNING;
                if (dVar != dVar2) {
                    this.f = dVar2;
                    this.d.i();
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // u8.e
    public final boolean e(c cVar) {
        boolean z;
        synchronized (this.f277997a) {
            e eVar = this.f277998b;
            z = (eVar == null || eVar.e(this)) && cVar.equals(this.f277999c);
        }
        return z;
    }

    @Override // u8.c
    public final boolean f(c cVar) {
        if (cVar instanceof b) {
            b bVar = (b) cVar;
            if (this.f277999c.f(bVar.f277999c) && this.d.f(bVar.d)) {
                return true;
            }
        }
        return false;
    }

    @Override // u8.e
    public final void g(c cVar) {
        synchronized (this.f277997a) {
            try {
                if (cVar.equals(this.f277999c)) {
                    this.e = d.SUCCESS;
                } else if (cVar.equals(this.d)) {
                    this.f = d.SUCCESS;
                }
                e eVar = this.f277998b;
                if (eVar != null) {
                    eVar.g(this);
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // u8.e
    public final e getRoot() {
        e root;
        synchronized (this.f277997a) {
            try {
                e eVar = this.f277998b;
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
        d dVar;
        synchronized (this.f277997a) {
            e eVar = this.f277998b;
            z = false;
            if (eVar == null || eVar.h(this)) {
                d dVar2 = this.e;
                d dVar3 = d.FAILED;
                if (dVar2 != dVar3 ? cVar.equals(this.f277999c) : cVar.equals(this.d) && ((dVar = this.f) == d.SUCCESS || dVar == dVar3)) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // u8.c
    public final void i() {
        synchronized (this.f277997a) {
            try {
                d dVar = this.e;
                d dVar2 = d.RUNNING;
                if (dVar != dVar2) {
                    this.e = dVar2;
                    this.f277999c.i();
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // u8.c
    public final boolean isComplete() {
        boolean z;
        synchronized (this.f277997a) {
            try {
                d dVar = this.e;
                d dVar2 = d.SUCCESS;
                z = dVar == dVar2 || this.f == dVar2;
            } finally {
            }
        }
        return z;
    }

    @Override // u8.c
    public final boolean isRunning() {
        boolean z;
        synchronized (this.f277997a) {
            try {
                d dVar = this.e;
                d dVar2 = d.RUNNING;
                z = dVar == dVar2 || this.f == dVar2;
            } finally {
            }
        }
        return z;
    }

    public final void j(c cVar, c cVar2) {
        this.f277999c = cVar;
        this.d = cVar2;
    }

    @Override // u8.c
    public final void pause() {
        synchronized (this.f277997a) {
            try {
                d dVar = this.e;
                d dVar2 = d.RUNNING;
                if (dVar == dVar2) {
                    this.e = d.PAUSED;
                    this.f277999c.pause();
                }
                if (this.f == dVar2) {
                    this.f = d.PAUSED;
                    this.d.pause();
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }
}
