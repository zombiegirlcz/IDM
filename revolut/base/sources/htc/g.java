package htc;

import com.revolut.feature.second_device_login.impl.network.SecondDeviceLoginService;
import kotlin.jvm.internal.Intrinsics;
import vc.s;

/* JADX INFO: loaded from: classes6.dex */
public abstract class g implements e4m.e {
    public static SecondDeviceLoginService a(ek.a converterFactory, ik0.b retrofitFactory) {
        f.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(SecondDeviceLoginService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        SecondDeviceLoginService secondDeviceLoginService = (SecondDeviceLoginService) objCreate;
        s.k(secondDeviceLoginService);
        return secondDeviceLoginService;
    }
}
