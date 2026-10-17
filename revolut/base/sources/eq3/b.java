package eq3;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.application.close.provider.CancellationDialogProvider$CancellationConfirmationOption;
import com.revolut.feature.credit.application.plugins.api.models.cancel.DropOutConfig;
import com.revolut.feature.credit.core.R$string;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rp0.l;
import rp0.m;
import rp0.t;
import rp0.y;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public interface b {

    @NotNull
    public static final a Companion = a.f128234a;

    static y a(b bVar, AnalyticsContext analyticsContext, DropOutConfig.ConfirmationContent confirmationContent) {
        ((ow3.a) bVar).getClass();
        Intrinsics.checkNotNullParameter(confirmationContent, "confirmationContent");
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("CONFIRM_CANCELLATION_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.credit_application_cancellation_custom_content_template_primaryButton, u.c(confirmationContent.f66315c.f66311a), null, 12), false, null, null, new CancellationDialogProvider$CancellationConfirmationOption.BackendAction(confirmationContent.f66315c.f66312b), null, 744);
        yp0.b.r(model, 0, 0, 0, 0, 15);
        int i = R$string.credit_application_cancellation_custom_content_template_secondaryButton;
        DropOutConfig.Button button = confirmationContent.d;
        LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("CLOSE_CANCELLATION_ID", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(i, u.c(button.f66311a), null, 12), false, null, null, new CancellationDialogProvider$CancellationConfirmationOption.BackendAction(button.f66312b), null, 744);
        yp0.b.r(model2, 0, R$attr.uikit_dp24, 0, 0, 13);
        return dy4.b.b(m.Companion, v.k(model, model2), new t(new TextLocalisedClause(R$string.credit_application_cancellation_custom_content_template_title, u.c(confirmationContent.f66313a), null, 12), new TextLocalisedClause(R$string.credit_application_cancellation_custom_content_template_description, u.c(confirmationContent.f66314b), null, 12), null, 28), l.WINDOW, null, analyticsContext, null, 632);
    }
}
