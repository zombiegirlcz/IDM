package lu7;

import com.revolut.feature.insurance_embedded.impl.data.network.InsuranceEmbeddedService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class p0 implements e4m.e {
    public static InsuranceEmbeddedService a(ek.a converterFactory, ik0.b retrofitFactory) {
        o0.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(InsuranceEmbeddedService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        InsuranceEmbeddedService insuranceEmbeddedService = (InsuranceEmbeddedService) objCreate;
        vc.s.k(insuranceEmbeddedService);
        return insuranceEmbeddedService;
    }
}
