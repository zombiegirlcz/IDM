package b6b;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class f0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12588a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i7d.i f12589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f12590c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f12591g;

    public f0(o oVar, q qVar, i7d.i iVar) {
        this.f12590c = oVar;
        this.f12589b = iVar;
        int i = 15;
        this.d = e4m.b.b(new m(oVar, this, 1, i));
        this.e = e4m.b.b(new m(oVar, this, 0, i));
        this.f = e4m.b.b(new m(oVar, this, 3, i));
        this.f12591g = e4m.b.b(new m(oVar, this, 2, i));
    }

    public final c7b.a b() {
        switch (this.f12588a) {
        }
        return new c7b.a(this.f12590c.d.g(), 0);
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f12588a) {
            case 0:
                i7d.o oVar = (i7d.o) this.d.get();
                h7d.e.a(oVar);
                return ImmutableSet.of(oVar);
            default:
                i7d.o oVar2 = (i7d.o) this.d.get();
                h7d.e.a(oVar2);
                return ImmutableSet.of(oVar2);
        }
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f12588a) {
            case 0:
                i7d.n nVar = (i7d.n) this.e.get();
                h7d.c.a(nVar);
                return ImmutableSet.of(nVar);
            default:
                i7d.n nVar2 = (i7d.n) this.e.get();
                h7d.c.a(nVar2);
                return ImmutableSet.of(nVar2);
        }
    }

    public f0(o oVar, j jVar, i7d.i iVar) {
        this.f12590c = oVar;
        this.f12589b = iVar;
        int i = 14;
        this.d = e4m.b.b(new m(oVar, this, 1, i));
        this.e = e4m.b.b(new m(oVar, this, 0, i));
        this.f = e4m.b.b(new m(oVar, this, 3, i));
        this.f12591g = e4m.b.b(new m(oVar, this, 2, i));
    }
}
