package v42;

import aw0.n6;
import com.revolut.core.ui_kit.views.LargeActionButton;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public abstract class b {
    public static final void a(LargeActionButton largeActionButton, n6 n6Var) {
        Intrinsics.checkNotNullParameter(largeActionButton, "<this>");
        if (n6Var == null) {
            largeActionButton.setVisibility(8);
            return;
        }
        largeActionButton.setVisibility(0);
        largeActionButton.setEnabled(n6Var.f10436g);
        largeActionButton.setText(n6Var.f10433a);
        largeActionButton.o(n6Var.f10434b);
        largeActionButton.setIcon(n6Var.f10435c);
        largeActionButton.setBadge(n6Var.e);
        largeActionButton.setCustomE2ETestId(n6Var.f10438j);
        largeActionButton.setLoadingButtonTag(n6Var.f);
        largeActionButton.setLoadingStrategy(n6Var.i);
        pd.b.p(largeActionButton, n6Var.d);
        largeActionButton.setAnalyticsContext(n6Var.f10437h);
    }
}
