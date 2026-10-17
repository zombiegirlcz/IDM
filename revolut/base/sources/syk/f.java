package syk;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import com.revolut.retail.operation_status.modal_status.SuccessType;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sf0.h f266685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v60.e f266686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f266687c;

    public f(sf0.h serverErrorParser, v60.e serverErrorsProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f266685a = serverErrorParser;
        this.f266686b = serverErrorsProvider;
        this.f266687c = featureToggleInteractor;
    }

    public final StatusViewConfiguration.Success a() {
        return new StatusViewConfiguration.Success("COMPLETED_DIALOG", new TextLocalisedClause(R$string.wealth_trade_onboarding_status_pending_title, null, null, 14), new TextLocalisedClause(R$string.wealth_trade_onboarding_status_pending_general_subtitle, null, null, 14), null, new SuccessType.ResultAction(new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), null), 1912);
    }
}
