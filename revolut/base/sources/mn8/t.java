package mn8;

import com.revolut.feature.junior_settings.impl.services.JuniorDeviceService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class t implements e4m.e {
    public static JuniorDeviceService a(ek.a converterFactory, ik0.b retrofitFactory) {
        s.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(JuniorDeviceService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        JuniorDeviceService juniorDeviceService = (JuniorDeviceService) objCreate;
        vc.s.k(juniorDeviceService);
        return juniorDeviceService;
    }
}
