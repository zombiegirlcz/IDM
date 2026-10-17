package b3j;

import com.revolut.retail.feature.beneficiary.impl.network.BeneficiarySuggestionsService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class o implements e4m.e {
    public static BeneficiarySuggestionsService a(ek.a converterFactory, ik0.b retrofitFactory) {
        n.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(BeneficiarySuggestionsService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        BeneficiarySuggestionsService beneficiarySuggestionsService = (BeneficiarySuggestionsService) objCreate;
        vc.s.k(beneficiarySuggestionsService);
        return beneficiarySuggestionsService;
    }
}
