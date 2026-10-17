package n2h;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.TwinHorizontalButton;
import com.revolut.retail.wealth.resources.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import x2h.b;

/* JADX INFO: loaded from: classes9.dex */
public abstract class h {
    public static final void a(x2h.b bVar, TwinHorizontalButton twinHorizontalButton) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(twinHorizontalButton, "twinHorizontalButton");
        if (bVar instanceof x2h.a) {
            x2h.a aVar = (x2h.a) bVar;
            boolean z = aVar.f302570a;
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_action_buy, null, null, 14);
            if (!z) {
                textLocalisedClause = null;
            }
            twinHorizontalButton.setPrimaryButtonText(textLocalisedClause);
            twinHorizontalButton.setPrimaryButtonEnabled(z);
            twinHorizontalButton.setPrimaryButtonVisible(z);
            boolean z3 = aVar.f302571b;
            twinHorizontalButton.setSecondaryButtonText(z3 ? new TextLocalisedClause(R$string.wealth_action_sell, null, null, 14) : null);
            twinHorizontalButton.setSecondaryButtonEnabled(z3);
            twinHorizontalButton.setSecondaryButtonVisible(z3);
            twinHorizontalButton.setVisibility((z || z3) ? 0 : 8);
            return;
        }
        if (bVar instanceof b.a) {
            twinHorizontalButton.setPrimaryButtonText(new TextLocalisedClause(R$string.wealth_action_get_started, null, null, 14));
            twinHorizontalButton.setPrimaryButtonEnabled(true);
            twinHorizontalButton.setPrimaryButtonVisible(true);
            twinHorizontalButton.setSecondaryButtonText(null);
            twinHorizontalButton.setSecondaryButtonEnabled(false);
            twinHorizontalButton.setSecondaryButtonVisible(false);
            twinHorizontalButton.setVisibility(0);
            return;
        }
        if (!Intrinsics.f(bVar, b.C1676b.f302573a)) {
            throw new NoWhenBranchMatchedException();
        }
        twinHorizontalButton.setPrimaryButtonText(null);
        twinHorizontalButton.setPrimaryButtonEnabled(false);
        twinHorizontalButton.setPrimaryButtonVisible(false);
        twinHorizontalButton.setSecondaryButtonText(null);
        twinHorizontalButton.setSecondaryButtonEnabled(false);
        twinHorizontalButton.setSecondaryButtonVisible(false);
        twinHorizontalButton.setVisibility(8);
    }
}
