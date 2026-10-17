package u8h;

import com.revolut.feature.wealth.impl.data.network.disclaimers.WealthDisclaimersService;
import kotlin.jvm.internal.Intrinsics;
import vc.s;

/* JADX INFO: loaded from: classes9.dex */
public abstract class g implements e4m.e {
    public static WealthDisclaimersService a(ek.a converterFactory, ik0.b retrofitFactory) {
        f.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(WealthDisclaimersService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        WealthDisclaimersService wealthDisclaimersService = (WealthDisclaimersService) objCreate;
        s.k(wealthDisclaimersService);
        return wealthDisclaimersService;
    }
}
