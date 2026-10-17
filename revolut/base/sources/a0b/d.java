package a0b;

import kotlin.jvm.internal.Intrinsics;
import vc.s;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements uza.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l41.a f307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ee0.a f308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final an0.c f309c;
    public final asi.b d;
    public final l70.e e;
    public final d f = this;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f310g = e4m.b.b(new c(this, 0));

    public d(l70.e eVar, ee0.a aVar, l41.a aVar2, zza.b bVar, an0.c cVar, asi.b bVar2) {
        this.f307a = aVar2;
        this.f308b = aVar;
        this.f309c = cVar;
        this.d = bVar2;
        this.e = eVar;
    }

    public final v60.g a() {
        i41.c cVar = (i41.c) this.f307a.f192032c.get();
        s.j(cVar);
        return new v60.g(cVar, (ue0.c) this.f310g.get());
    }

    public final uc.d b() {
        j51.a aVar = (j51.a) this.d;
        mli.e userLogoutInteractor = aVar.b();
        s.j(userLogoutInteractor);
        v60.g policiesRepository = a();
        asi.d userSessionInteractor = aVar.c();
        s.j(userSessionInteractor);
        Intrinsics.checkNotNullParameter(userLogoutInteractor, "userLogoutInteractor");
        Intrinsics.checkNotNullParameter(policiesRepository, "policiesRepository");
        Intrinsics.checkNotNullParameter(userSessionInteractor, "userSessionInteractor");
        uc.d dVar = new uc.d();
        dVar.f278952a = userLogoutInteractor;
        dVar.f278953b = policiesRepository;
        dVar.f278954c = userSessionInteractor;
        return dVar;
    }
}
