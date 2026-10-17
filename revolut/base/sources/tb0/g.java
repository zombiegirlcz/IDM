package tb0;

import efm.r;
import kotlin.jvm.internal.Intrinsics;
import rp0.n0;
import t05.m;
import vkm.q;
import yji.n;

/* JADX INFO: loaded from: classes19.dex */
public final class g extends xa0.b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final r60.b f269426q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final h f269427r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final qa0.b f269428s;

    public g(r60.b promptViewControllerExtension, h mapper, qa0.b externalNavigationExtension) {
        Intrinsics.checkNotNullParameter(promptViewControllerExtension, "promptViewControllerExtension");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(externalNavigationExtension, "externalNavigationExtension");
        this.f269426q = promptViewControllerExtension;
        this.f269427r = mapper;
        this.f269428s = externalNavigationExtension;
    }

    @Override // xa0.b
    public final void b3() {
        ((r60.d) this.f269426q).Q();
    }

    @Override // xa0.b
    public final void c3() {
        r60.d dVar = (r60.d) this.f269426q;
        vkm.d dVarB = rd0.e.b(dVar.d.d());
        h hVar = this.f269427r;
        n.j2(this, q.J(new c(dVarB, hVar, 0), new c(rd0.e.b(dVar.d.f()), hVar, 1)), null, new ryj.f(2, this, g.class, "handleAction", "handleAction(Lcom/revolut/feature/backend_flow/domain/models/Action;)V", 4, 13), 3);
        int i = 16;
        r map = dVar.d.f256148b.p().map(new rof.e(i, new n0(7)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        n.j2(this, new t9l.f(rd0.e.b(map), 2), null, new ryj.f(2, this.f269428s, qa0.b.class, "openLink", "openLink(Ljava/lang/String;)V", 4, 14), 3);
        n.j2(this, rd0.e.b(dVar.d.f256147a.f()), null, new m(this, null, i), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // xa0.b
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d3(com.revolut.feature.backend_flow.domain.models.PromptScreen r28, gim.c r29) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tb0.g.d3(com.revolut.feature.backend_flow.domain.models.PromptScreen, gim.c):java.lang.Object");
    }
}
