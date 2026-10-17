package ql7;

import com.revolut.feature.insurance_car.impl.data.network.InsuranceCarService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l2 implements e4m.e {
    public static InsuranceCarService a(ek.a converterFactory, ik0.b retrofitFactory) {
        j2.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(InsuranceCarService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        InsuranceCarService insuranceCarService = (InsuranceCarService) objCreate;
        vc.s.k(insuranceCarService);
        return insuranceCarService;
    }
}
