package fc4;

import iri.j;
import kyk.n;
import qgi.e;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l70.e f133638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nj0.a f133639c;
    public final cri.b d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f133640g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f133641h;
    public final Object i;

    public c(hri.b bVar, l70.e eVar, nj0.a aVar, cri.b bVar2, dw3.e eVar2) {
        this.f133637a = 1;
        this.i = this;
        this.f133638b = eVar;
        this.f133639c = aVar;
        this.f133641h = eVar2;
        this.d = bVar2;
        this.e = e4m.b.b(new a9i.b(this, 0, 3));
        this.f = e4m.b.b(new a9i.b(this, 1, 3));
        this.f133640g = e4m.b.b(new a9i.b(this, 2, 3));
    }

    @Override // hri.a
    public final j e() {
        switch (this.f133637a) {
        }
        return (j) this.f.get();
    }

    @Override // hri.a
    public final ifm.b f() {
        switch (this.f133637a) {
        }
        return (ifm.b) this.e.get();
    }

    @Override // qgi.e
    public final a g() {
        switch (this.f133637a) {
            case 0:
                return new a((c) this.f133641h, 0);
            case 1:
                return new a((c) this.i, 1);
            default:
                return new a((c) this.f133641h, 2);
        }
    }

    public c(hri.b bVar, l70.e eVar, nj0.a aVar, cri.b bVar2, int i) {
        this.f133637a = i;
        switch (i) {
            case 2:
                this.f133641h = this;
                this.f133638b = eVar;
                this.f133639c = aVar;
                this.d = bVar2;
                int i2 = 13;
                this.e = e4m.b.b(new n(this, 0, i2));
                this.f = e4m.b.b(new n(this, 1, i2));
                this.f133640g = e4m.b.b(new n(this, 3, i2));
                this.i = e4m.b.b(new n(this, 2, i2));
                break;
            default:
                this.f133641h = this;
                this.f133638b = eVar;
                this.f133639c = aVar;
                this.d = bVar2;
                int i3 = 26;
                this.e = e4m.b.b(new euh.a(this, 0, i3));
                this.f = e4m.b.b(new euh.a(this, 1, i3));
                this.f133640g = e4m.b.b(new euh.a(this, 3, i3));
                this.i = e4m.b.b(new euh.a(this, 2, i3));
                break;
        }
    }
}
