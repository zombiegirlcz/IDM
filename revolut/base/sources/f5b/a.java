package f5b;

import e4m.b;
import e4m.e;
import q1h.c;
import q1h.d;
import q1h.f;
import rmc.g;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements c, hlc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f132293a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xmg.a f132294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ite.a f132295c;
    public final e d;
    public final e e;
    public final e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f132296g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f132297h;

    public a(ite.a aVar, h9h.a aVar2, xmg.a aVar3, zdl.c cVar) {
        this.f132294b = aVar3;
        this.f132296g = cVar;
        this.f132297h = aVar2;
        this.f132295c = aVar;
        int i = 22;
        this.d = b.b(new euh.a(this, 0, i));
        this.e = b.b(new euh.a(this, 1, i));
        this.f = b.b(new euh.a(this, 2, i));
    }

    @Override // q1h.c
    public final d a() {
        switch (this.f132293a) {
            case 0:
                return (e5b.b) this.f.get();
            default:
                return (rmc.d) this.f.get();
        }
    }

    @Override // q1h.c
    public final f b() {
        switch (this.f132293a) {
            case 0:
                return (e5b.e) this.d.get();
            default:
                return (g) this.d.get();
        }
    }

    @Override // q1h.c
    public final q1h.e c() {
        switch (this.f132293a) {
            case 0:
                return (e5b.c) this.e.get();
            default:
                return (rmc.e) this.e.get();
        }
    }

    public a(dmc.a aVar, dmc.c cVar, xmg.a aVar2, ite.a aVar3) {
        this.f132296g = cVar;
        this.f132294b = aVar2;
        this.f132297h = aVar;
        this.f132295c = aVar3;
        int i = 11;
        this.d = b.b(new sac.a(this, 0, i));
        this.e = b.b(new sac.a(this, 1, i));
        this.f = b.b(new sac.a(this, 2, i));
    }
}
