package qw7;

import com.revolut.feature.insurance_home.impl.data.network.InsuranceHomeService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class o implements e4m.e {
    public static InsuranceHomeService a(ek.a converterFactory, ik0.b retrofitFactory) {
        n.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(InsuranceHomeService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        InsuranceHomeService insuranceHomeService = (InsuranceHomeService) objCreate;
        vc.s.k(insuranceHomeService);
        return insuranceHomeService;
    }
}
