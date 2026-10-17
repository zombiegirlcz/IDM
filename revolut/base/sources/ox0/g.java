package ox0;

import aw0.n6;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;

/* JADX INFO: loaded from: classes20.dex */
public abstract class g {
    public static final void a(TwinVerticalButton twinVerticalButton, n6 n6Var) {
        if (n6Var == null) {
            twinVerticalButton.setMainButtonVisible(false);
            return;
        }
        twinVerticalButton.setMainButtonVisible(true);
        twinVerticalButton.setMainButtonText(n6Var.f10433a);
        twinVerticalButton.setMainButtonStyle(n6Var.f10434b);
        twinVerticalButton.setMainButtonIcon(n6Var.f10435c);
        twinVerticalButton.setMainButtonEnabled(n6Var.f10436g);
        twinVerticalButton.setMainButtonAnalyticsContext(n6Var.f10437h);
        twinVerticalButton.setMainButtonBadge(n6Var.e);
        twinVerticalButton.setMainButtonCustomE2ETestId(n6Var.f10438j);
        twinVerticalButton.setMainButtonLoadingTag(n6Var.f);
        twinVerticalButton.setMainButtonLoadingStrategy(n6Var.i);
        twinVerticalButton.setMainButtonContentDescription(n6Var.d);
    }
}
