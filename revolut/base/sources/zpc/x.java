package zpc;

import com.revolut.feature.salary_switch.impl.network.PayrollService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class x implements e4m.e {
    public static PayrollService a(ek.a converterFactory, ik0.b retrofitFactory) {
        v.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(PayrollService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        PayrollService payrollService = (PayrollService) objCreate;
        vc.s.k(payrollService);
        return payrollService;
    }
}
