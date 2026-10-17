package ta9;

import com.revolut.feature.onboarding.impl.onboarding.service.WaitingListService;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes5.dex */
public abstract class l0 implements e4m.e {
    public static WaitingListService a(Retrofit retrofit) {
        i0.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(WaitingListService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        WaitingListService waitingListService = (WaitingListService) objCreate;
        vc.s.k(waitingListService);
        return waitingListService;
    }
}
