package y17;

import aii.r;
import com.revolut.feature.freelancer.impl.ui.profile.website.flow.a;
import com.revolut.feature.freelancer.impl.ui.sales.new_sale.FreelancerNewSaleFlowContract$Step;
import com.revolut.feature.freelancer.impl.ui.sales.new_sale.FreelancerNewSaleFlowContract$Step$Sale$QrShare;
import com.revolut.feature.full_screen_prompt.c;
import com.revolut.feature.shared.order_initiation.api.domain.OrderInitiationPage;
import d27.w;
import d27.x;
import d27.y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.n1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f310322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.freelancer.impl.ui.sales.new_sale.a f310323b;

    public /* synthetic */ l(com.revolut.feature.freelancer.impl.ui.sales.new_sale.a aVar, int i) {
        this.f310322a = i;
        this.f310323b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f310322a) {
            case 0:
                n1 it8 = (n1) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                oki.h.D2(this.f310323b.f74160w);
                return Unit.f186387a;
            case 1:
                r it9 = (r) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                oki.h.D2(this.f310323b.f74160w);
                return Unit.f186387a;
            case 2:
                com.revolut.feature.freelancer.impl.ui.profile.website.flow.a result = (com.revolut.feature.freelancer.impl.ui.profile.website.flow.a) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (!Intrinsics.f(result, a.C0493a.f74083a)) {
                    throw new NoWhenBranchMatchedException();
                }
                com.revolut.feature.freelancer.impl.ui.sales.new_sale.a aVar = this.f310323b;
                aVar.l2(new n(aVar, null, 1), new yi5.b(26));
                return Unit.f186387a;
            case 3:
                yja.b result2 = (yja.b) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                com.revolut.feature.freelancer.impl.ui.sales.new_sale.a aVar2 = this.f310323b;
                if (aVar2.u.contains(result2)) {
                    aVar2.l2(new n(aVar2, null, 0), new yi5.b(26));
                } else {
                    oki.h.D2(aVar2.f74160w);
                }
                return Unit.f186387a;
            case 4:
                y result3 = (y) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                boolean z = result3 instanceof w;
                com.revolut.feature.freelancer.impl.ui.sales.new_sale.a aVar3 = this.f310323b;
                if (z) {
                    oki.h.D2(aVar3.f74160w);
                } else {
                    if (!(result3 instanceof x)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    yki.i iVar = aVar3.f74160w;
                    OrderInitiationPage orderInitiationPage = ((x) result3).f110779a;
                    oki.h.t2(aVar3, iVar, new FreelancerNewSaleFlowContract$Step$Sale$QrShare(orderInitiationPage.f, orderInitiationPage.f86431h), false, null, false, 12);
                }
                return Unit.f186387a;
            default:
                r result4 = (r) obj2;
                Intrinsics.checkNotNullParameter(result4, "result");
                boolean z3 = result4 instanceof c.C0497c;
                com.revolut.feature.freelancer.impl.ui.sales.new_sale.a aVar4 = this.f310323b;
                if (z3) {
                    oki.h.t2(aVar4, aVar4.f74160w, FreelancerNewSaleFlowContract$Step.WebsiteUrlSubmission.f74154a, true, null, false, 12);
                } else {
                    oki.h.D2(aVar4.f74160w);
                }
                return Unit.f186387a;
        }
    }
}
