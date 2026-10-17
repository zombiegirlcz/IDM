package ywe;

import com.revolut.feature.topup_screen.impl.flows.checkout.post_activation.network.PostActivationService;
import e4m.e;
import kotlin.jvm.internal.Intrinsics;
import vc.s;

/* JADX INFO: loaded from: classes8.dex */
public abstract class c implements e {
    public static PostActivationService a(ek.a converterFactory, ik0.b retrofitFactory) {
        b.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(PostActivationService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        PostActivationService postActivationService = (PostActivationService) objCreate;
        s.k(postActivationService);
        return postActivationService;
    }
}
