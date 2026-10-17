package f2k;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.HtmlLocalisedClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.transfer.core.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import ip0.qd0;
import ip0.vd0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rp0.t;
import rp0.y;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class k implements x1k.a {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f131848a;

    public k(f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f131848a = uiKitResources;
    }

    public final y a(kq2.e feeOptions) {
        Intrinsics.checkNotNullParameter(feeOptions, "feeOptions");
        t tVar = new t(new TextLocalisedClause(R$string.payments_core_fees_swift_pay_fees_works_title, null, null, 14), new HtmlLocalisedClause(R$string.payments_core_fees_swift_pay_fees_works_subtitle_v2, v.k(this.f131848a.b(new MoneyClause(feeOptions.f188301b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), "revolut://app/faq?key=4085a672-b5b9-4ed1-884f-8eef33d86ab5"), (Integer) null, (Object) null, 28), null, 28);
        rp0.l lVar = rp0.l.WINDOW;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.payments_core_fees_swift_got_it, null, null, 14);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        kq2.c cVar = kq2.c.DEBTOR;
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("CHARGE_BEARER_DEBTOR_LARGE_BUTTON_ID", defaultFilledButton, null, textLocalisedClause, false, null, null, cVar, null, 744);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return new y(u.c(model), tVar, lVar, null, cVar, null, 984);
    }

    public final y b(List transferFeeOptions, od0.i selectedChargeBearer) {
        Iterator it8;
        int i;
        SelectableDelegate.Model model;
        Object obj2 = selectedChargeBearer.f224257a;
        Intrinsics.checkNotNullParameter(transferFeeOptions, "transferFeeOptions");
        Intrinsics.checkNotNullParameter(selectedChargeBearer, "selectedChargeBearer");
        int i2 = 14;
        t tVar = new t(new TextLocalisedClause(R$string.payments_core_fees_swift_bottom_sheet_title, null, null, 14), null, null, 30);
        rp0.l lVar = rp0.l.WINDOW;
        List list = transferFeeOptions;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it9 = list.iterator();
        while (it9.hasNext()) {
            kq2.e eVar = (kq2.e) it9.next();
            kq2.c cVar = eVar.f188300a;
            int i3 = j.f131847a[cVar.ordinal()];
            if (i3 == 1) {
                it8 = it9;
                vd0 vd0Var = vd0.RADIO;
                Object[] elements = {new TextLocalisedClause(R$string.payments_core_fees_swift_share_fees_title, null, null, 14), new DotDividerClause((Integer) null), new MoneyClause(eVar.f188301b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)};
                Intrinsics.checkNotNullParameter(elements, "elements");
                i = 14;
                model = new SelectableDelegate.Model("SHARED_ITEM_SELECTABLE_ID", new RowDelegate.Model("SHARED_ITEM_ID", null, new CompositeClause(kotlin.collections.d.L(elements), null, null, null, 14), null, 0, new TextLocalisedClause(R$string.payments_core_fees_swift_share_fees_subtitle, null, null, 14), new TextLocalisedClause(R.string.common_action_learn_more, null, new Click(28, (Integer) null, (Object) eVar, "CHARGE_BEARER_SHARED_LEARN_MORE_ID", false), 10), null, 0, null, false, null, false, null, null, null, null, null, null, eVar.f188300a, null, 0, 0, 0, 0, 532674458), (cVar == obj2 || transferFeeOptions.size() == 1) ? qd0.SELECTED : qd0.UNSELECTED, null, vd0Var, false, null, null, null, true, 31720);
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                vd0 vd0Var2 = vd0.RADIO;
                Object[] elements2 = {new TextLocalisedClause(R$string.payments_core_fees_swift_pay_fees_title, null, null, i2), new DotDividerClause((Integer) null), new MoneyClause(eVar.f188301b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)};
                Intrinsics.checkNotNullParameter(elements2, "elements");
                it8 = it9;
                model = new SelectableDelegate.Model("DEBTOR_ITEM_SELECTABLE_ID", new RowDelegate.Model("DEBTOR_ITEM_ID", null, new CompositeClause(kotlin.collections.d.L(elements2), null, null, null, 14), null, 0, new TextLocalisedClause(R$string.payments_core_fees_swift_pay_fees_subtitle, null, null, i2), new TextLocalisedClause(R.string.common_action_learn_more, null, new Click(28, (Integer) null, (Object) eVar, "CHARGE_BEARER_DEBTOR_LEARN_MORE_ID", false), 10), null, 0, null, false, null, false, null, null, null, null, null, null, eVar.f188300a, null, 0, 0, 0, 0, 532674458), (cVar == obj2 || transferFeeOptions.size() == 1) ? qd0.SELECTED : qd0.UNSELECTED, null, vd0Var2, false, null, null, null, true, 31720);
                i = 14;
            }
            arrayList.add(model);
            i2 = i;
            it9 = it8;
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new y(arrayList, tVar, lVar, null, null, null, 1016);
    }

    public final y c() {
        t tVar = new t(new TextLocalisedClause(R$string.payments_core_fees_swift_share_fees_works_title, null, null, 14), new HtmlLocalisedClause(R$string.payments_core_fees_swift_share_fees_works_subtitle_v2, u.c("revolut://app/faq?key=4085a672-b5b9-4ed1-884f-8eef33d86ab5"), (Integer) null, (Object) null, 28), null, 28);
        rp0.l lVar = rp0.l.WINDOW;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.payments_core_fees_swift_got_it, null, null, 14);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        kq2.c cVar = kq2.c.SHARED;
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("CHARGE_BEARER_SHARED_LARGE_BUTTON_ID", defaultFilledButton, null, textLocalisedClause, false, null, null, cVar, null, 744);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return new y(u.c(model), tVar, lVar, null, cVar, null, 984);
    }
}
