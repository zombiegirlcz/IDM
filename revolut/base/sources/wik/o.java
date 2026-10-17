package wik;

import com.revolut.feature.address.models.Address;
import com.revolut.feature.terms.api.model.Terms;
import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.retail.feature.pricing_plans.ui.api.PricingPlansUiApi$Toggles;
import com.revolut.retail.feature.pricing_plans.ui.impl.interactor.terms.PricingPlanTerms;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f297928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f297929b;

    public /* synthetic */ o(q qVar, int i) {
        this.f297928a = i;
        this.f297929b = qVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        TermsScope termsScope;
        switch (this.f297928a) {
            case 0:
                do3.n user = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(user, "user");
                q qVar = this.f297929b;
                if (qVar.f297932c.a(PricingPlansUiApi$Toggles.PaidPlansTermsPoland.f102634c)) {
                    TermsScope.INSTANCE.getClass();
                    termsScope = TermsScope.N;
                } else {
                    Address address = user.k;
                    wi0.b bVarG = address != null ? nz8.d.g(address) : null;
                    wi0.b.Companion.getClass();
                    if (Intrinsics.f(bVarG, wi0.b.t2)) {
                        TermsScope.INSTANCE.getClass();
                        termsScope = TermsScope.O;
                    } else {
                        TermsScope.INSTANCE.getClass();
                        termsScope = TermsScope.N;
                    }
                }
                return pd.b.r(yoj.b.s(pre.c.l(qVar.f297930a, null, null, zhm.u.c(termsScope), 11), f0.f322471a), new wg2.g(qVar, termsScope, 10));
            default:
                od0.i it8 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                Terms terms = (Terms) it8.f224257a;
                if (terms != null) {
                    this.f297929b.getClass();
                    String str = terms.f90357c;
                    PricingPlanTerms pricingPlanTerms = str != null ? new PricingPlanTerms(str, m70.a.l(terms.f90359h), terms.d) : null;
                    if (pricingPlanTerms != null) {
                        return pricingPlanTerms;
                    }
                }
                return new PricingPlanTerms("https://revolut.com/legal/plan-partnerships", null, null);
        }
    }
}
