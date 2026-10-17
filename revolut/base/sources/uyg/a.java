package uyg;

import com.revolut.core.ui_kit.delegates.widgets.ErrorWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.wealth.analytics.R$string;
import com.youTransactor.uCube.rpc.Constants;
import op0.q;

/* JADX INFO: loaded from: classes9.dex */
public final class a {
    private a() {
    }

    public static ErrorWidgetDelegate.Model a(String str, q qVar) {
        return new ErrorWidgetDelegate.Model(str, null, new TextLocalisedClause(R$string.wealth_analytics_error_state_title, null, null, 14), new TextLocalisedClause(R$string.wealth_analytics_error_state_action_try_again, null, null, 14), qVar, null, null, Constants.TAG_E2_CONFIGURATION_PAYMENT_SCHEME_CUSTOMIZATION);
    }
}
