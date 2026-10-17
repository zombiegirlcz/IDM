package r6e;

import com.revolut.feature.subaccount.impl.network.SubaccountLinkService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public abstract class g0 implements e4m.e {
    public static SubaccountLinkService a(ek.a converterFactory, ik0.b retrofitFactory) {
        e0.Companion.getClass();
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(SubaccountLinkService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        SubaccountLinkService subaccountLinkService = (SubaccountLinkService) objCreate;
        vc.s.k(subaccountLinkService);
        return subaccountLinkService;
    }
}
