package f5i;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature_market_data.impl.R$string;
import com.revolut.feature_market_data_impl.ui.activity.stackedbreakdown.Screen;
import efm.r;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import p4i.f;
import rp0.t;
import rp0.y;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements f {
    @Override // p4i.f
    public final r E(Screen screen) {
        Object next;
        Screen.Faq screen2 = (Screen.Faq) screen;
        Intrinsics.checkNotNullParameter(screen2, "screen");
        Intrinsics.checkNotNullParameter(screen2, "screen");
        LargeActionButtonDelegate.Model model = null;
        t tVar = new t(screen2.f97110a, screen2.f97111b, null, 28);
        Iterator it8 = screen2.f97112c.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (next instanceof Screen.Faq.FaqItem.GotItButton) {
                break;
            }
        }
        if (((Screen.Faq.FaqItem.GotItButton) next) != null) {
            LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("FAQ_GOT_IT_BUTTON", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.common_action_got_it, null, null, 14), false, null, null, null, null, 1000);
            yp0.b.r(model2, 0, R$attr.uikit_dp24, 0, 0, 13);
            model = model2;
        }
        r rVarJust = r.just(new y(v.l(model), tVar, null, null, screen2, null, 988));
        Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
        return rVarJust;
    }
}
