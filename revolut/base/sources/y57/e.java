package y57;

import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ErrorWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.freelancer_widgets.api.model.FreelancerWidgetClickData;
import com.youTransactor.uCube.rpc.Constants;
import ct6.u;
import ct6.w;
import kotlin.jvm.internal.Intrinsics;
import op0.q;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aia.c f311000a;

    public e(w freelancerClauseFactory, u freelancerEcommerceClauseFactory, aia.c proAccountsClauseFactory) {
        Intrinsics.checkNotNullParameter(freelancerClauseFactory, "freelancerClauseFactory");
        Intrinsics.checkNotNullParameter(freelancerEcommerceClauseFactory, "freelancerEcommerceClauseFactory");
        Intrinsics.checkNotNullParameter(proAccountsClauseFactory, "proAccountsClauseFactory");
        this.f311000a = proAccountsClauseFactory;
    }

    public static ReferralContactDelegate.Model a(String str, int i, TextLocalisedClause textLocalisedClause, TextLocalisedQuantityClause textLocalisedQuantityClause, FreelancerWidgetClickData.Sales sales) {
        return new ReferralContactDelegate.Model(str, LayeredImage.Companion.b(LayeredImage.INSTANCE, i, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 12.0f, Float.valueOf(32.0f), null, 32), textLocalisedClause, textLocalisedQuantityClause, null, null, null, null, null, sales, null, 393168);
    }

    public final ErrorWidgetDelegate.Model b(String widgetId) {
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        return new ErrorWidgetDelegate.Model(widgetId, null, new TextLocalisedClause(R$string.freelancer_widget_sales_error_title, null, null, 14), w.b(), q.MEDIUM, null, null, Constants.TAG_E2_CONFIGURATION_PAYMENT_SCHEME_CUSTOMIZATION);
    }
}
