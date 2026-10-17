package h98;

import com.revolut.feature.junior.card_request.impl.data.service.JuniorCardRequestService;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import vc.s;

/* JADX INFO: loaded from: classes4.dex */
public abstract class m implements e4m.e {
    public static JuniorCardRequestService a(Retrofit retrofit) {
        l.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(JuniorCardRequestService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        JuniorCardRequestService juniorCardRequestService = (JuniorCardRequestService) objCreate;
        s.k(juniorCardRequestService);
        return juniorCardRequestService;
    }
}
