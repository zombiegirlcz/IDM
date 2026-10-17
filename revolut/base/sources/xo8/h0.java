package xo8;

import com.revolut.data.model.Data;
import com.revolut.feature.junior_referrals.api.JuniorReferralsApi$Toggles$JuniorReferralsRevamp;
import com.revolut.feature.junior_settings.impl.ui_kompot.settings.JuniorSettingsControllerContract$Input;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.r0;

/* JADX INFO: loaded from: classes4.dex */
public final class h0 extends oki.h implements n {

    @NotNull
    public static final v Companion = new v();
    public final jla.h A;
    public final te8.e B;
    public final v68.a C;
    public final cge.h D;
    public final cli.y E;
    public final JuniorSettingsControllerContract$Input o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hj8.a f307698p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final wsg.n f307699q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final oc8.d f307700r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final rc8.h f307701s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final wk8.a f307702t;
    public final ao.h u;
    public final kd8.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final kbb.c f307703w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final gte.a f307704x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ang.f f307705y;
    public final te8.z z;

    public h0(JuniorSettingsControllerContract$Input input, hj8.a juniorProfileInteractor, wsg.n walletInteractor, oc8.d juniorCardModelExtension, rc8.h closureModelExtension, wk8.a juniorReferralsInteractor, ao.h juniorCoparentInteractor, kd8.e juniorConsentInteractor, kbb.c juniorConfigInteractor, gte.a featureToggleInteractor, ang.f userInteractor, te8.z juniorProductsInteractor, jla.h productCatalogueInteractor, te8.e juniorAccountInteractor, v68.a removeJuniorPocketControllerExtension, cge.h productAccountsInfoProvider, l0 stateMapper) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(juniorCardModelExtension, "juniorCardModelExtension");
        Intrinsics.checkNotNullParameter(closureModelExtension, "closureModelExtension");
        Intrinsics.checkNotNullParameter(juniorReferralsInteractor, "juniorReferralsInteractor");
        Intrinsics.checkNotNullParameter(juniorCoparentInteractor, "juniorCoparentInteractor");
        Intrinsics.checkNotNullParameter(juniorConsentInteractor, "juniorConsentInteractor");
        Intrinsics.checkNotNullParameter(juniorConfigInteractor, "juniorConfigInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(juniorProductsInteractor, "juniorProductsInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(juniorAccountInteractor, "juniorAccountInteractor");
        Intrinsics.checkNotNullParameter(removeJuniorPocketControllerExtension, "removeJuniorPocketControllerExtension");
        Intrinsics.checkNotNullParameter(productAccountsInfoProvider, "productAccountsInfoProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = input;
        this.f307698p = juniorProfileInteractor;
        this.f307699q = walletInteractor;
        this.f307700r = juniorCardModelExtension;
        this.f307701s = closureModelExtension;
        this.f307702t = juniorReferralsInteractor;
        this.u = juniorCoparentInteractor;
        this.v = juniorConsentInteractor;
        this.f307703w = juniorConfigInteractor;
        this.f307704x = featureToggleInteractor;
        this.f307705y = userInteractor;
        this.z = juniorProductsInteractor;
        this.A = productCatalogueInteractor;
        this.B = juniorAccountInteractor;
        this.C = removeJuniorPocketControllerExtension;
        this.D = productAccountsInfoProvider;
        this.E = mra.d.b(this, new j(new Data(null, null, true, 3, null), null, false, null, new oc8.a(false), r0.g(), null, false, false, false, false, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        H2(this.E, new t(this, 0));
        Continuation continuation = null;
        l2(new xb4.e(this, continuation, 9), new yi5.b(26));
        JuniorSettingsControllerContract$Input juniorSettingsControllerContract$Input = this.o;
        String str = juniorSettingsControllerContract$Input.f77340a;
        hj8.a aVar = this.f307698p;
        w4l.i iVar = w4l.i.f294643c;
        yji.l.a1(this, hj8.a.a(aVar, str, iVar), null, null, new d0(this, continuation, 3), 3);
        String value = juniorSettingsControllerContract$Input.f77340a;
        wsg.n nVar = this.f307699q;
        yji.l.a1(this, rd0.e.b(osg.b.a(nVar, value, false, 4)), null, null, new d0(this, continuation, 6), 3);
        efm.r rVarFlatMap = this.u.o().flatMap(new u(0, new t(this, 1)));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMap, "flatMap(...)");
        yji.l.a1(this, rd0.e.b(rVarFlatMap), null, null, new d0(this, continuation, 0), 3);
        boolean zC = ((jte.d) this.f307704x).c(JuniorReferralsApi$Toggles$JuniorReferralsRevamp.f77156c);
        wk8.a aVar2 = this.f307702t;
        if (zC) {
            Intrinsics.checkNotNullParameter(value, "value");
            yji.l.a1(this, mo3.a.f(aVar2.a(value, iVar), new xlb.l(9), new x0b.h(11), new xlb.l(10)), null, null, new b0(this, continuation, 3), 3);
        } else {
            yji.l.a1(this, rd0.e.b(m70.a.g(aVar2.b(value, true), null, null, 3)), null, null, new e0(this, null), 3);
        }
        kd8.e eVar = this.v;
        w4l.h hVar = w4l.h.f294642c;
        yji.l.a1(this, mo3.a.g(eVar.e(value, hVar), null, new xlb.l(7), 1), new wf0.r0(2, 4, null), null, new d0(this, continuation, 1), 2);
        yji.l.a1(this, boh.f.e(this.f307705y.j(hVar), new t(this, 2)), null, null, new d0(this, continuation, 5), 3);
        yji.l.a1(this, mo3.a.f(rd0.e.b(te8.z.b(this.z, value, false, 4)), new ku1.f0(22), new x0b.h(10), new xlb.l(8)), null, null, new b0(this, continuation, 2), 3);
        yji.l.a1(this, new a0(rd0.e.b(this.f307703w.L()), 0), null, null, new b0(this, continuation, 0), 3);
        yji.l.a1(this, new sa6.o(bla.b.b(this.A, "security_hub.block_merchants"), 13), null, null, new b0(this, continuation, 1), 3);
        yji.l.a1(this, this.B.a(value, hVar), null, null, new d0(this, continuation, 2), 3);
        yji.l.a1(this, new ax9.o(yh5.b.d(this.D.b(ibb.c.f160140a), rd0.e.b(nVar.e0(value, hVar))), 21), null, null, new d0(this, continuation, 4), 3);
        yji.l.a1(this, this.C.b3(), null, null, new xni.h(this, continuation, 2), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.E;
    }
}
