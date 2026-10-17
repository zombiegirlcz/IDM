package kjk;

import com.revolut.core.error.data.model.ServerErrorException;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanOfferPromptErrorModel;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fn2.c f184428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v60.e f184429b;

    public e(fn2.c errorParser, v60.e serverErrorsProvider) {
        Intrinsics.checkNotNullParameter(errorParser, "errorParser");
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        this.f184428a = errorParser;
        this.f184429b = serverErrorsProvider;
    }

    public static PricingPlanOfferPromptErrorModel a(ServerErrorException serverErrorException) {
        return new PricingPlanOfferPromptErrorModel(serverErrorException.f.f51362a, new TextLocalisedClause(R$string.premium_plan_offer_prompt_error_state_generic_title, null, null, 14), new TextLocalisedClause(R$string.premium_plan_offer_prompt_error_state_generic_subtitle, null, null, 14));
    }
}
