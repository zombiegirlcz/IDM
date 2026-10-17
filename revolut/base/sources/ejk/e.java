package ejk;

import hha.i;
import jgk.x;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import wkm.l;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f126909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cjk.b f126910b;

    public e(f footerInsuranceRequiredResolver, b pricingPlanFooterTextBuilder, cjk.b familyPlansTermsProvider) {
        Intrinsics.checkNotNullParameter(footerInsuranceRequiredResolver, "footerInsuranceRequiredResolver");
        Intrinsics.checkNotNullParameter(pricingPlanFooterTextBuilder, "pricingPlanFooterTextBuilder");
        Intrinsics.checkNotNullParameter(familyPlansTermsProvider, "familyPlansTermsProvider");
        this.f126909a = footerInsuranceRequiredResolver;
        this.f126910b = familyPlansTermsProvider;
    }

    public final l a(hha.d plan, i billingCode) {
        Intrinsics.checkNotNullParameter(plan, "plan");
        Intrinsics.checkNotNullParameter(billingCode, "billingCode");
        return q.H(new a9h.a(this, plan, billingCode, (Continuation) null, 6), rd0.e.e(this.f126909a.a(plan), h0.f322473a, new d(3, null)));
    }
}
