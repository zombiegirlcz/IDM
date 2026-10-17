package ha3;

import com.revolut.feature.cards_core.api.CardsCoreApi$Toggles;
import h93.j0;
import h93.l0;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes13.dex */
public final class j implements l93.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v6l.s f150410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l93.f f150411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f150412c;
    public final ffk.t d;

    public j(v6l.s cardRepository, l93.f revolutCardInteractor, gte.a featureToggleInteractor, ffk.t pricingPlanInteractor) {
        Intrinsics.checkNotNullParameter(cardRepository, "cardRepository");
        Intrinsics.checkNotNullParameter(revolutCardInteractor, "revolutCardInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        this.f150410a = cardRepository;
        this.f150411b = revolutCardInteractor;
        this.f150412c = featureToggleInteractor;
        this.d = pricingPlanInteractor;
    }

    public static efm.r b(j jVar, j0 j0Var, l0 l0Var, int i) {
        efm.r rVarJ;
        v6l.s sVar = jVar.f150410a;
        if ((i & 1) != 0) {
            j0Var = null;
        }
        l0 l0Var2 = (i & 2) != 0 ? null : l0Var;
        if (((jte.d) jVar.f150412c).c(CardsCoreApi$Toggles.CardDesignApiFlagsMigration.f65556c)) {
            rVarJ = sVar.h(false, (126 & 2) != 0 ? null : j0Var, (126 & 4) != 0 ? null : l0Var2, (126 & 8) != 0 ? null : null, null, null, null);
        } else {
            rVarJ = sVar.j(false, (2046 & 2) != 0 ? null : null, (2046 & 4) != 0 ? false : false, (2046 & 8) != 0 ? false : j0Var == j0.PRO, false, false, null, null, (2046 & 256) != 0 ? null : l0Var2, null, null);
        }
        return m70.a.e(ue0.e.p(rVarJ, h0.f322473a), new h43.q(18), new h43.q(19));
    }

    public final ufm.i a() {
        ufm.i iVar = new ufm.i(((x) this.f150411b).s(true), new ha1.s(5, new h(this, 0)), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }
}
