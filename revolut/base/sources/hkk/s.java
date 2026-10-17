package hkk;

import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.n0;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class s implements cli.n {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f152963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Custom f152964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Custom f152965c;

    public s(cjk.a familyPlanPricingProvider, cjk.b familyPlansTermsProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(familyPlanPricingProvider, "familyPlanPricingProvider");
        Intrinsics.checkNotNullParameter(familyPlansTermsProvider, "familyPlansTermsProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f152963a = featureToggleInteractor;
        this.f152964b = new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), true, null, false, null, Constants.TAG_FC_SPEED_MODE);
        this.f152965c = new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254);
    }

    public static TextLocalisedClause b(dj0.d dVar, hha.i iVar) {
        return new TextLocalisedClause((iVar == null ? -1 : r.f152962a[iVar.ordinal()]) == 1 ? R$string.family_plans_checkout_payment_details_plan_value_yearly : R$string.family_plans_checkout_payment_details_plan_value_monthly, u.c(dok.b.b(dVar, null, null, null, 7)), null, 12);
    }

    public static TimeClause d(long j2) {
        return new TimeClause(j2, new TimeClause.Format.DateMedium(n0.HIDE_CURRENT_YEAR), null, null, 12);
    }

    public final Pair a(dj0.d dVar, dj0.d dVar2, hha.i iVar) {
        return dVar2 != null ? new Pair(dok.b.b(dVar2, null, this.f152964b, null, 5), TextLocalisedClause.c(b(dVar, iVar), null, this.f152965c, 27)) : new Pair(b(dVar, iVar), null);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (i) iii.c.f(domainState.f152941a, new hhd.n(this, 19), new hkb.e(2), new hb4.n(this, domainState, 11));
    }
}
