package au6;

import com.revolut.feature.freelancer.common.models.acquiring_payment.payment.AcquiringPayment$Id;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f9490b;

    public /* synthetic */ a0(d0 d0Var, int i) {
        this.f9489a = i;
        this.f9490b = d0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        switch (this.f9489a) {
            case 0:
                String str = ((AcquiringPayment$Id) obj2).f73363a;
                Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-feature-freelancer-common-models-acquiring_payment-payment-AcquiringPayment-Id$-id$0");
                pr6.q qVar = (pr6.q) this.f9490b.f9510b.get("FreelancerAcquiringPaymentRepositoryImpl:Payment:Memory");
                List list = qVar != null ? qVar.f238959a : null;
                if (list == null) {
                    list = zhm.f0.f322471a;
                }
                Iterator it8 = list.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (Intrinsics.f(((pr6.e) next).f238938a, str)) {
                        }
                    } else {
                        next = null;
                    }
                }
                pr6.e eVar = (pr6.e) next;
                if (eVar == null) {
                    return null;
                }
                od0.i.Companion.getClass();
                return od0.h.a(eVar);
            default:
                String str2 = ((AcquiringPayment$Id) obj2).f73363a;
                Intrinsics.checkNotNullParameter(str2, "$v$c$com-revolut-feature-freelancer-common-models-acquiring_payment-payment-AcquiringPayment-Id$-id$0");
                d0 d0Var = this.f9490b;
                return (List) d0Var.f9510b.get(d0.b(d0Var, str2));
        }
    }
}
