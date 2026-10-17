package gkk;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.pricing_plans.ui.api.PricingPlansUiApi$Toggles;
import jgk.v;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k extends oki.h implements g {
    public final ang.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final egk.a f144423p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final cha.b f144424q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final mre.c f144425r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final si7.a f144426s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final v f144427t;
    public final gte.a u;
    public final y v;

    public k(ang.f userInteractor, egk.a familyPlansUiInteractor, cha.b familyPlansInteractor, mre.c termsNavigationFactory, si7.a insuranceInteractor, v pricingPlanTermsNavigationCommandsProvider, gte.a featureToggleInteractor, e inputData, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(familyPlansUiInteractor, "familyPlansUiInteractor");
        Intrinsics.checkNotNullParameter(familyPlansInteractor, "familyPlansInteractor");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(insuranceInteractor, "insuranceInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanTermsNavigationCommandsProvider, "pricingPlanTermsNavigationCommandsProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = userInteractor;
        this.f144423p = familyPlansUiInteractor;
        this.f144424q = familyPlansInteractor;
        this.f144425r = termsNavigationFactory;
        this.f144426s = insuranceInteractor;
        this.f144427t = pricingPlanTermsNavigationCommandsProvider;
        this.u = featureToggleInteractor;
        inputData.getClass();
        this.v = mra.d.b(this, new d(new Data(null, null, true, 3, null), new Data(null, null, false, 3, null), new Data(null, null, true, 3, null), new Data(null, null, ((jte.d) featureToggleInteractor).c(PricingPlansUiApi$Toggles.DuoBillingCycleExtrasEEA2.f102629c), 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l2(new ge7.f(this, continuation, 11), new yi5.b(26));
        wik.e eVar = (wik.e) this.f144423p;
        eVar.getClass();
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        yji.l.a1(this, boh.f.e(boh.f.e(rd0.e.b(mo3.a.n(eVar.f297912b.v(loadingStrategy))), new wdb.b(eVar, 25)), new gd3.i(this, 22)), null, null, new j(this, continuation, 1), 3);
        if (((jte.d) this.u).c(PricingPlansUiApi$Toggles.DuoBillingCycleExtrasEEA2.f102629c)) {
            yji.l.a1(this, ((ffk.h) this.f144424q).e(), null, null, new j(this, continuation, 0), 3);
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }
}
