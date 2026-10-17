package qbk;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.feature.plan_gifting.api.model.PlanGiftingRefund;
import com.revolut.retail.feature.plan_gifting.impl.R$string;
import dj0.d;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import rp0.l;
import rp0.t;
import rp0.y;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements ibk.b {
    public final y a(PlanGiftingRefund refund) {
        CellDetailsDelegate.Model model;
        Intrinsics.checkNotNullParameter(refund, "refund");
        t tVar = new t(new TextClause(refund.f102444b.f102435a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(refund.f102445c.f102435a, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), null, 28);
        d dVar = refund.f102443a;
        if (dVar != null) {
            model = new CellDetailsDelegate.Model("giftClaimingItemId", new TextLocalisedClause(R$string.plan_gifting_claiming_confirmation_refund, null, null, 14), new CompositeClause(v.k(new TextClause("+", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4)), null, null, null, 14), 0, null, null, null, null, null, false, 0, 0, 32760);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        } else {
            model = null;
        }
        LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("ID_CONFIRM_PLAN_CHANGE", LargeActionButton.ButtonStyle.e, null, new TextLocalisedClause(R$string.plan_gifting_claiming_confirmation_action, null, null, 14), false, null, null, null, null, 1000);
        int i = R$attr.uikit_dp16;
        yp0.b.p(model2, i, R$attr.uikit_dp32, i, i);
        l lVar = l.WINDOW;
        Object[] elements = {model, model2};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new y(kotlin.collections.d.L(elements), tVar, lVar, null, null, null, 1016);
    }
}
