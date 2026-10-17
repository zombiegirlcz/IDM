package au6;

import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrder$Id;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f9599b;

    public /* synthetic */ q(v vVar, int i) {
        this.f9598a = i;
        this.f9599b = vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f9598a) {
            case 0:
                String str = ((AcquiringOrder$Id) obj2).f73342a;
                List lineItems = (List) obj3;
                Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-feature-freelancer-common-models-acquiring_order-AcquiringOrder-Id$-id$0");
                Intrinsics.checkNotNullParameter(lineItems, "lineItems");
                ehe.n.z("FreelancerAcquiringOrderRepositoryImpl:LineItems:Memory", str, this.f9599b.d, lineItems);
                break;
            case 1:
                od0.i order = (od0.i) obj3;
                Intrinsics.checkNotNullParameter(((AcquiringOrder$Id) obj2).f73342a, "$v$c$com-revolut-feature-freelancer-common-models-acquiring_order-AcquiringOrder-Id$-<unused var>$0");
                Intrinsics.checkNotNullParameter(order, "order");
                if (((nr6.b) order.f224257a) != null) {
                    v.a(this.f9599b, zhm.u.c(order.c()));
                }
                break;
            default:
                String str2 = ((AcquiringOrder$Id) obj2).f73342a;
                nr6.w payments = (nr6.w) obj3;
                Intrinsics.checkNotNullParameter(str2, "$v$c$com-revolut-feature-freelancer-common-models-acquiring_order-AcquiringOrder-Id$-id$0");
                Intrinsics.checkNotNullParameter(payments, "payments");
                this.f9599b.d.f("FreelancerAcquiringOrderRepositoryImpl:OrderPayments:Memory" + str2, payments);
                break;
        }
        return Unit.f186387a;
    }
}
