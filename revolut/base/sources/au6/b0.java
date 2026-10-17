package au6;

import com.revolut.feature.freelancer.common.models.acquiring_payment.payment.AcquiringPayment$Id;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f9498b;

    public /* synthetic */ b0(d0 d0Var, int i) {
        this.f9497a = i;
        this.f9498b = d0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f9497a) {
            case 0:
                od0.i payment = (od0.i) obj3;
                Intrinsics.checkNotNullParameter(((AcquiringPayment$Id) obj2).f73363a, "$v$c$com-revolut-feature-freelancer-common-models-acquiring_payment-payment-AcquiringPayment-Id$-<unused var>$0");
                Intrinsics.checkNotNullParameter(payment, "payment");
                pr6.e eVar = (pr6.e) payment.f224257a;
                if (eVar != null) {
                    this.f9498b.e(new pr6.q(zhm.u.c(eVar), null));
                }
                break;
            default:
                String str = ((AcquiringPayment$Id) obj2).f73363a;
                List timeline = (List) obj3;
                Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-feature-freelancer-common-models-acquiring_payment-payment-AcquiringPayment-Id$-id$0");
                Intrinsics.checkNotNullParameter(timeline, "timeline");
                d0 d0Var = this.f9498b;
                d0Var.f9510b.f(d0.b(d0Var, str), timeline);
                break;
        }
        return Unit.f186387a;
    }
}
