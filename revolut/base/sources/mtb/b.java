package mtb;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.rev10_main_screen.impl.ui.MainContainerFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import e4m.e;
import ekg.g;
import java.util.List;
import java.util.Set;
import ji5.m;
import kotlin.jvm.internal.Intrinsics;
import kx7.o0;
import ms1.s;
import uie.l;
import vie.h;
import vie.i;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainContainerFlowContract$InputData f208790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f208791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f208792c = this;
    public final e d;
    public final e e;
    public final e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f208793g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f208794h;
    public final e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f208795j;

    public b(d dVar, ViewController viewController, MainContainerFlowContract$InputData mainContainerFlowContract$InputData) {
        this.f208791b = dVar;
        this.f208790a = mainContainerFlowContract$InputData;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 1;
        this.e = e4m.b.b(new s(dVar, this, 2, i));
        this.f = e4m.b.b(new s(dVar, this, 1, i));
        this.f208793g = e4m.b.b(new s(dVar, this, 0, i));
        this.f208794h = e4m.b.b(new s(dVar, this, 3, i));
        this.i = e4m.b.b(new s(dVar, this, 4, i));
        this.f208795j = e4m.b.b(new s(dVar, this, 5, i));
    }

    public final List b() {
        nbb.d provider = ((nbb.a) this.f208791b.f208799a).a();
        vc.s.j(provider);
        stb.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(provider, "provider");
        l lVar = provider.f214067y;
        h hVarA = lVar.f280401b.a();
        vc.s.j(hVarA);
        i iVarB = lVar.f280400a.b();
        vc.s.j(iVarB);
        yie.b bVar = new yie.b(hVarA, iVarB);
        m mVarE = ((jje.c) provider.z).f174833h.e();
        vc.s.j(mVarE);
        List listK = v.k(bVar, new qje.a(mVarE));
        vc.s.k(listK);
        return listK;
    }

    public final kdh.b c() {
        d dVar = this.f208791b;
        nbb.d provider = ((nbb.a) dVar.f208799a).a();
        vc.s.j(provider);
        stb.a aVar = stb.b.Companion;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(provider, "provider");
        g gVarB = dVar.f208800b.b();
        nbb.d provider2 = ((nbb.a) dVar.f208799a).a();
        vc.s.j(provider2);
        aVar.getClass();
        Intrinsics.checkNotNullParameter(provider2, "provider");
        o0 o0Var = new o0(29);
        hwl.c cVar = (hwl.c) dVar.f208801c.f156292b.get();
        vc.s.j(cVar);
        return new kdh.b(gVarB, o0Var, cVar, b());
    }

    @Override // xki.e
    public final Set f() {
        return (Set) this.f208794h.get();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f208793g.get());
    }
}
