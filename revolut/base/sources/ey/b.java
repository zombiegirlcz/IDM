package ey;

import com.google.common.collect.ImmutableSet;
import f00.a;
import java.util.Set;
import oai.s;
import px.g;
import ql7.d2;

/* JADX INFO: loaded from: classes16.dex */
public final class b implements my.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ly.c f130478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l70.e f130479c;
    public final gx.c d;
    public final u00.d e;
    public final f00.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g f130480g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k81.a f130481h;
    public final nv.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final fv.e f130482j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f130483l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final my.b f130484m;

    public b(g gVar, l70.e eVar, k81.a aVar, gx.c cVar, u00.d dVar, nv.a aVar2, ly.c cVar2, a.C0766a c0766a, fv.e eVar2, int i) {
        this.f130477a = i;
        switch (i) {
            case 1:
                this.f130484m = this;
                this.f130478b = cVar2;
                this.f130479c = eVar;
                this.d = cVar;
                this.e = dVar;
                this.f = c0766a;
                this.f130480g = gVar;
                this.f130481h = aVar;
                this.i = aVar2;
                this.f130482j = eVar2;
                int i2 = 16;
                this.k = e4m.b.b(new s(this, 0, i2));
                this.f130483l = e4m.b.b(new s(this, 1, i2));
                break;
            case 2:
                this.f130484m = this;
                this.f130478b = cVar2;
                this.f130479c = eVar;
                this.d = cVar;
                this.e = dVar;
                this.f = c0766a;
                this.f130480g = gVar;
                this.f130481h = aVar;
                this.i = aVar2;
                this.f130482j = eVar2;
                int i3 = 17;
                this.k = e4m.b.b(new s(this, 0, i3));
                this.f130483l = e4m.b.b(new s(this, 1, i3));
                break;
            case 3:
                this.f130484m = this;
                this.f130478b = cVar2;
                this.f130479c = eVar;
                this.d = cVar;
                this.e = dVar;
                this.f = c0766a;
                this.f130480g = gVar;
                this.f130481h = aVar;
                this.i = aVar2;
                this.f130482j = eVar2;
                int i5 = 7;
                this.k = e4m.b.b(new d2(this, 0, i5));
                this.f130483l = e4m.b.b(new d2(this, 1, i5));
                break;
            default:
                this.f130484m = this;
                this.f130478b = cVar2;
                this.f130479c = eVar;
                this.d = cVar;
                this.e = dVar;
                this.f = c0766a;
                this.f130480g = gVar;
                this.f130481h = aVar;
                this.i = aVar2;
                this.f130482j = eVar2;
                int i6 = 3;
                this.k = e4m.b.b(new euh.a(this, 0, i6));
                this.f130483l = e4m.b.b(new euh.a(this, 1, i6));
                break;
        }
    }

    @Override // my.b
    public final ly.b e() {
        switch (this.f130477a) {
        }
        return (ly.b) this.k.get();
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f130477a) {
        }
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f130477a) {
        }
        return ImmutableSet.of();
    }

    @Override // my.b
    public final c u() {
        switch (this.f130477a) {
            case 0:
                return new c((b) this.f130484m, 0);
            case 1:
                return new c((b) this.f130484m, 2);
            case 2:
                return new c((b) this.f130484m, 3);
            default:
                return new c((b) this.f130484m, 4);
        }
    }
}
