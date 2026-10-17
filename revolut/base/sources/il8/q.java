package il8;

import com.revolut.feature.junior_remote_login.impl.data.service.JuniorRemoteLoginService;
import kotlin.jvm.internal.Intrinsics;
import vc.s;

/* JADX INFO: loaded from: classes4.dex */
public abstract class q implements e4m.e {
    public static JuniorRemoteLoginService a(ek.a converterFactory, ik0.b retrofitFactory) {
        p.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(JuniorRemoteLoginService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        JuniorRemoteLoginService juniorRemoteLoginService = (JuniorRemoteLoginService) objCreate;
        s.k(juniorRemoteLoginService);
        return juniorRemoteLoginService;
    }
}
