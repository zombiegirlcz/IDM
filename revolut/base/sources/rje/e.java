package rje;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.tab.crypto.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class e {
    public e(wqi.a tabHeaderCommonActionsProvider) {
        Intrinsics.checkNotNullParameter(tabHeaderCommonActionsProvider, "tabHeaderCommonActionsProvider");
    }

    public final List a() {
        return u.c(new ActionsView.Item("CRYPTO_ONBOARDING_ID", mx0.d.CONTEXTUAL, false, null, null, new TextLocalisedClause(R$string.crypto_home_intro_single_button_title, null, null, 14), null, null, null, null, false, null, null, null, null, 32668));
    }
}
