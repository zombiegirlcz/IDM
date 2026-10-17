package z58;

import com.revolut.feature.junior.account_activation.impl.data.network.JuniorAsyncAccountActivationService;
import kotlin.jvm.internal.Intrinsics;
import vc.s;

/* JADX INFO: loaded from: classes4.dex */
public abstract class o implements e4m.e {
    public static JuniorAsyncAccountActivationService a(ek.a converterFactory, ik0.b retrofitFactory) {
        n.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(JuniorAsyncAccountActivationService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        JuniorAsyncAccountActivationService juniorAsyncAccountActivationService = (JuniorAsyncAccountActivationService) objCreate;
        s.k(juniorAsyncAccountActivationService);
        return juniorAsyncAccountActivationService;
    }
}
