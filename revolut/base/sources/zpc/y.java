package zpc;

import com.revolut.feature.salary_switch.impl.network.PayrollServiceV2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class y implements e4m.e {
    public static PayrollServiceV2 a(ek.a converterFactory, ik0.b retrofitFactory) {
        v.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(PayrollServiceV2.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        PayrollServiceV2 payrollServiceV2 = (PayrollServiceV2) objCreate;
        vc.s.k(payrollServiceV2);
        return payrollServiceV2;
    }
}
