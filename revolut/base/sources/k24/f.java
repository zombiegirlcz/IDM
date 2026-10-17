package k24;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.application.plugins.api.models.config.ManualUnderwritingDocsSentPopupScreenConfig;
import com.revolut.feature.credit.application.plugins.api.models.config.WaitingPopupScreenConfig;
import com.revolut.feature.credit.core.R$string;
import efm.d0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final WaitingPopupScreenConfig f180323a = new WaitingPopupScreenConfig(new TextLocalisedClause(R$string.credit_manual_underwriting_forbearance_prompt_waiting_title, null, null, 14), new TextLocalisedClause(R$string.credit_manual_underwriting_forbearance_prompt_waiting_subtitle, null, null, 14), new TextLocalisedClause(R$string.credit_manual_underwriting_forbearance_prompt_waiting_button_got_it, null, null, 14), new TextLocalisedClause(R$string.credit_manual_underwriting_prompt_waiting_button_turn_notifications_on, null, null, 14));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ManualUnderwritingDocsSentPopupScreenConfig.RequestSent f180324b = new ManualUnderwritingDocsSentPopupScreenConfig.RequestSent(new TextLocalisedClause(R$string.credit_manual_underwriting_forbearance_status_in_review_title, null, null, 14), new TextLocalisedClause(R$string.credit_manual_underwriting_forbearance_status_in_review_description, null, null, 14), new TextLocalisedClause(R$string.credit_manual_underwriting_forbearance_status_in_review_button, null, null, 14));

    @Override // k24.o
    public final d0 a(wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        ufm.c cVar = new ufm.c(new a(this, countryCode, 2), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return cVar;
    }
}
