package osb;

import cn0.h;
import ei3.o;
import eli.j;
import kotlin.jvm.internal.Intrinsics;
import msb.i;
import no.j2;
import sri.m;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nf0.a f229302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final an0.c f229303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final opa.b f229304c;
    public final cri.a d;
    public final tql.a e;
    public final poi.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final th0.a f229305g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f229306h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f229307j;
    public final e4m.e k;

    public a(poi.b bVar, cri.a aVar, nf0.a aVar2, th0.a aVar3, opa.b bVar2, tql.a aVar4, an0.c cVar) {
        this.f229302a = aVar2;
        this.f229303b = cVar;
        this.f229304c = bVar2;
        this.d = aVar;
        this.e = aVar4;
        this.f = bVar;
        this.f229305g = aVar3;
        int i = 12;
        this.f229306h = e4m.b.b(new of3.e(this, 0, i));
        this.i = e4m.b.b(new of3.e(this, 1, i));
        this.f229307j = e4m.b.b(new of3.e(this, 2, i));
        this.k = e4m.b.b(new of3.e(this, 3, i));
    }

    public final j a() {
        ujg.a aVar = (ujg.a) this.f229306h.get();
        msb.j jVar = (msb.j) this.i.get();
        h hVar = (h) this.f229303b.f6526l.get();
        s.j(hVar);
        sjg.c cVar = (sjg.c) this.f229307j.get();
        g8b.a aVar2 = (g8b.a) this.d;
        m mVarD = aVar2.d();
        s.j(mVarD);
        i iVar = new i(mVarD, (sjg.c) this.f229307j.get());
        tql.a aVar3 = this.e;
        o ssoServerErrorParser = new o((kg.o) aVar3.f273620h.get(), 1);
        rql.a ssoReauthenticationRepository = aVar3.b();
        s.j(ssoReauthenticationRepository);
        m navigator = aVar2.d();
        s.j(navigator);
        Intrinsics.checkNotNullParameter(ssoServerErrorParser, "ssoServerErrorParser");
        Intrinsics.checkNotNullParameter(ssoReauthenticationRepository, "ssoReauthenticationRepository");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        gpk.c cVar2 = new gpk.c();
        cVar2.f145463a = ssoServerErrorParser;
        cVar2.f145464b = ssoReauthenticationRepository;
        cVar2.f145465c = navigator;
        j2 j2VarH = this.f.h();
        s.j(j2VarH);
        return new j(aVar, jVar, hVar, cVar, iVar, cVar2, j2VarH);
    }

    public final ujg.a b() {
        return (ujg.a) this.f229306h.get();
    }
}
