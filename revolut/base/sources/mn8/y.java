package mn8;

import com.revolut.feature.junior_settings.impl.services.JuniorSettingsSignInService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class y implements e4m.e {
    public static JuniorSettingsSignInService a(ek.a converterFactory, ik0.b retrofitFactory) {
        x.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(JuniorSettingsSignInService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        JuniorSettingsSignInService juniorSettingsSignInService = (JuniorSettingsSignInService) objCreate;
        vc.s.k(juniorSettingsSignInService);
        return juniorSettingsSignInService;
    }
}
