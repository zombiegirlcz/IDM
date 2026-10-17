package kkk;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.invitation.FamilyPlanInvitationScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class t extends oki.h implements o {
    public final ffk.t o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final egk.d f185123p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final jgk.v f185124q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final cha.b f185125r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final mre.c f185126s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final si7.a f185127t;
    public final FamilyPlanInvitationScreenContract$InputData u;
    public final vii.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f185128w;

    public t(ffk.t pricingPlanInteractor, egk.d pricingPlansBenefitsInteractor, jgk.v pricingPlanTermsNavigationCommandsProvider, cha.b familyPlansInteractor, mre.c termsNavigationFactory, si7.a insuranceInteractor, FamilyPlanInvitationScreenContract$InputData inputData, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(pricingPlansBenefitsInteractor, "pricingPlansBenefitsInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanTermsNavigationCommandsProvider, "pricingPlanTermsNavigationCommandsProvider");
        Intrinsics.checkNotNullParameter(familyPlansInteractor, "familyPlansInteractor");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(insuranceInteractor, "insuranceInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = pricingPlanInteractor;
        this.f185123p = pricingPlansBenefitsInteractor;
        this.f185124q = pricingPlanTermsNavigationCommandsProvider;
        this.f185125r = familyPlansInteractor;
        this.f185126s = termsNavigationFactory;
        this.f185127t = insuranceInteractor;
        this.u = inputData;
        this.v = new vii.b();
        this.f185128w = mra.d.b(this, new i(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        s sVar = new s(0, this, continuation);
        vii.b bVar = this.v;
        yji.l.a1(this, vkm.q.Q(bVar, sVar), null, null, new r(1, this, continuation), 3);
        yji.l.a1(this, vkm.q.Q(bVar, new s(1, this, continuation)), null, null, new r(2, this, continuation), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f185128w;
    }
}
