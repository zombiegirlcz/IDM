package m2b;

import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ee0.a f201818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final an0.c f201819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cf0.f f201820c;
    public final h9h.a d;
    public final u8h.c e;
    public final e4m.e f = e4m.b.b(new ljl.n(this, 23));

    public f(ee0.a aVar, cf0.f fVar, h9h.a aVar2, an0.c cVar, u8h.c cVar2) {
        this.f201818a = aVar;
        this.f201819b = cVar;
        this.f201820c = fVar;
        this.d = aVar2;
        this.e = cVar2;
    }

    public final p2b.i a() {
        g3b.i iVar = (g3b.i) this.f.get();
        ef0.b bVarB = this.f201820c.b();
        vc.s.j(bVarB);
        tzg.m mVarT = this.d.t();
        vc.s.j(mVarT);
        return new p2b.i(iVar, bVarB, mVarT, ((u8h.b) this.e).f());
    }

    public final xe0.e b() {
        ee0.a aVar = this.f201818a;
        je0.d mapper = aVar.b();
        vc.s.j(mapper);
        yk0.a databaseSessionProvider = this.f201819b.b();
        vc.s.j(databaseSessionProvider);
        xe0.f storageFactory = aVar.f();
        vc.s.j(storageFactory);
        o2b.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
        return xe0.f.f(storageFactory, databaseSessionProvider, "cfd_risk_warning_storage", mapper, 1, f0.f322471a, 32);
    }
}
