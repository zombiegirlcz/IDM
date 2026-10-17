package rj1;

import com.revolut.feature.advised_components.network.AdvisedComponentsService;
import kotlin.jvm.internal.Intrinsics;
import vc.s;

/* JADX INFO: loaded from: classes20.dex */
public abstract class c implements e4m.e {
    public static AdvisedComponentsService a(ek.a converterFactory, ik0.b retrofitFactory) {
        b.Companion.getClass();
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(AdvisedComponentsService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        AdvisedComponentsService advisedComponentsService = (AdvisedComponentsService) objCreate;
        s.k(advisedComponentsService);
        return advisedComponentsService;
    }
}
