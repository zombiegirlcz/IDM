package kjk;

import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanContextualSelectionLayoutParams;
import hha.w0;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zhm.q0;
import zhm.r0;

/* JADX INFO: loaded from: classes11.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f184451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w0 f184452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f184453c;
    public final PricingPlanContextualSelectionLayoutParams d;
    public final String e;

    public k(String promptType, w0 w0Var, String currentPlanId, PricingPlanContextualSelectionLayoutParams pricingPlanContextualSelectionLayoutParams) throws IOException {
        Intrinsics.checkNotNullParameter(promptType, "promptType");
        Intrinsics.checkNotNullParameter(currentPlanId, "currentPlanId");
        this.f184451a = promptType;
        this.f184452b = w0Var;
        this.f184453c = currentPlanId;
        this.d = pricingPlanContextualSelectionLayoutParams;
        Map mapQ = pricingPlanContextualSelectionLayoutParams != null ? foh.i.q(new Pair("presentation_type", pricingPlanContextualSelectionLayoutParams.f102829a), new Pair("loyaltyProduct", pricingPlanContextualSelectionLayoutParams.f102830b)) : null;
        Set setEntrySet = q0.e(mapQ == null ? r0.g() : mapQ).entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "<get-entries>(...)");
        String strK0 = zhm.d0.k0(setEntrySet, "", null, null, 0, new kh4.b(27), 30);
        StringBuilder sb6 = new StringBuilder("plan_contextual_selection_");
        sb6.append(promptType);
        sb6.append("_");
        sb6.append(w0Var);
        sb6.append("_");
        this.e = v0.a.i(sb6, currentPlanId, strK0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f184451a, kVar.f184451a) && this.f184452b == kVar.f184452b && Intrinsics.f(this.f184453c, kVar.f184453c) && Intrinsics.f(this.d, kVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f184451a.hashCode() * 31;
        w0 w0Var = this.f184452b;
        int iC = p.a.c((iHashCode + (w0Var == null ? 0 : w0Var.hashCode())) * 31, 31, this.f184453c);
        PricingPlanContextualSelectionLayoutParams pricingPlanContextualSelectionLayoutParams = this.d;
        return iC + (pricingPlanContextualSelectionLayoutParams != null ? pricingPlanContextualSelectionLayoutParams.hashCode() : 0);
    }
}
