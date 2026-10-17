package sof;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionBannerPromptAction;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import yp0.b;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    @NotNull
    public static final C1484a Companion = new C1484a();

    /* JADX INFO: renamed from: sof.a$a, reason: collision with other inner class name */
    public static final class C1484a {
        private C1484a() {
        }
    }

    public static LargeActionButtonDelegate.Model a(SuspiciousTransactionBannerPromptAction suspiciousTransactionBannerPromptAction, LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton) {
        if (suspiciousTransactionBannerPromptAction == null) {
            return null;
        }
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model(j6.a.q("PHONE_LOST_BUTTON_LIST_ID", suspiciousTransactionBannerPromptAction.f104925a), defaultFilledButton, null, new TextClause(suspiciousTransactionBannerPromptAction.f104925a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, null, null, suspiciousTransactionBannerPromptAction, null, 744);
        b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }
}
