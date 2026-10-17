package n78;

import ang.f;
import ao.h;
import jhi.k;
import kotlin.jvm.internal.Intrinsics;
import om4.d0;
import te8.z;
import w4l.i;
import zf8.n;
import zh9.u0;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f213027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f213028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f213029c;
    public final n d;
    public final d0 e;

    public a(f userInteractor, h juniorCoparentInteractor, z juniorProductsInteractor, n juniorAccountStatesProvider, d0 juniorAllowancesInteractor) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(juniorCoparentInteractor, "juniorCoparentInteractor");
        Intrinsics.checkNotNullParameter(juniorProductsInteractor, "juniorProductsInteractor");
        Intrinsics.checkNotNullParameter(juniorAccountStatesProvider, "juniorAccountStatesProvider");
        Intrinsics.checkNotNullParameter(juniorAllowancesInteractor, "juniorAllowancesInteractor");
        this.f213027a = userInteractor;
        this.f213028b = juniorCoparentInteractor;
        this.f213029c = juniorProductsInteractor;
        this.d = juniorAccountStatesProvider;
        this.e = juniorAllowancesInteractor;
    }

    public final k a(String juniorId) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        akg.n nVarG = this.e.g(juniorId, i.f294643c);
        f fVar = this.f213027a;
        w4l.h hVar = w4l.h.f294642c;
        return nim.a.u(new m84.c(2, 5, null), u0.m(u0.i(nVarG, fVar.j(hVar), rd0.e.b(this.f213028b.m(juniorId, false))), u0.m(rd0.e.b(z.b(this.f213029c, juniorId, true, 4)), this.d.c(juniorId, hVar))));
    }
}
