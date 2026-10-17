package ow3;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.application.close.models.CreditApplicationClosePayload;
import com.revolut.feature.credit.application.close.provider.CancellationDialogProvider$CancellationConfirmationOption;
import com.revolut.feature.credit.application.plugins.impl.models.CreditOnboardingClosePayload;
import com.revolut.feature.credit.core.R$string;
import kotlin.jvm.internal.Intrinsics;
import rp0.l;
import rp0.m;
import rp0.t;
import rp0.y;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements eq3.b {
    public final y b(CreditApplicationClosePayload payload, String str) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        boolean z = payload instanceof CreditOnboardingClosePayload;
        int i = (z && ((CreditOnboardingClosePayload) payload).f66907a.d.b()) ? R$string.credit_application_cancellation_cancel_request_dialog_confirm_cancellation_title : R$string.credit_application_cancellation_cancel_application_alert_title;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
        int i2 = (z && ((CreditOnboardingClosePayload) payload).f66907a.d.b()) ? R$string.credit_application_cancellation_cancel_request_dialog_confirm_cancellation_subtitle : R$string.credit_application_cancellation_cancel_application_alert_subtitle;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(i2, null, new Custom(Integer.valueOf(R$attr.uikit_colorGrey50), false, null, false, null, 254), 10);
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("CONFIRM_CANCELLATION_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.credit_application_cancellation_cancel_application_alert_confirm_cancellation_button_title, null, null, 14), false, null, null, CancellationDialogProvider$CancellationConfirmationOption.ConfirmCancellation.f66212a, null, 744);
        yp0.b.r(model, 0, 0, 0, 0, 15);
        LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("CLOSE_CANCELLATION_ID", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.credit_application_cancellation_cancel_application_alert_confirm_cancellation_secondary_button_title, null, null, 14), false, null, null, CancellationDialogProvider$CancellationConfirmationOption.RejectCancellation.f66213a, null, 744);
        yp0.b.r(model2, 0, R$attr.uikit_dp24, 0, 0, 13);
        return dy4.b.b(m.Companion, v.k(model, model2), new t(textLocalisedClause, textLocalisedClause2, null, 28), l.WINDOW, str, ((CreditOnboardingClosePayload) payload).f66908b, null, 632);
    }
}
