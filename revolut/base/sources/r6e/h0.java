package r6e;

import com.revolut.feature.subaccount.impl.network.SubaccountsService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public abstract class h0 implements e4m.e {
    public static SubaccountsService a(ek.a converterFactory, ik0.b retrofitFactory) {
        e0.Companion.getClass();
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(SubaccountsService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        SubaccountsService subaccountsService = (SubaccountsService) objCreate;
        vc.s.k(subaccountsService);
        return subaccountsService;
    }
}
