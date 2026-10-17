package ta9;

import com.revolut.feature.onboarding.impl.promo.services.PromptsService;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes5.dex */
public abstract class j0 implements e4m.e {
    public static PromptsService a(Retrofit retrofit) {
        i0.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object objCreate = retrofit.create(PromptsService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        PromptsService promptsService = (PromptsService) objCreate;
        vc.s.k(promptsService);
        return promptsService;
    }
}
