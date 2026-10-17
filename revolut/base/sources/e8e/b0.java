package e8e;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.subaccount.impl.R$string;
import ip0.qd0;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class b0 implements jki.p {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f123632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a9e.a f123633b;

    public b0(a9e.a billAccountRecurringPaymentItemMapper, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(billAccountRecurringPaymentItemMapper, "billAccountRecurringPaymentItemMapper");
        this.f123632a = dateProvider;
        this.f123633b = billAccountRecurringPaymentItemMapper;
    }

    public static RowDelegate.Model b() {
        return new RowDelegate.Model("ITEM_ID_OTHER_OPTIONS_ADD_RECURRING_PAYMENT", new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_plus, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 62), new TextLocalisedClause(R$string.bill_accounts_payments_picker_rev10_action_add_recurring_transfer, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccentNeutral), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, true, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856);
    }

    public static RowDelegate.Model e() {
        return new RowDelegate.Model("ITEM_ID_OTHER_OPTIONS_SEARCH_PAYMENT", new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_search, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 62), new TextLocalisedClause(R$string.bill_accounts_payments_picker_rev10_action_find_subscription, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccentNeutral), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, true, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856);
    }

    public static List f(aim.e eVar, ListSubheaderDelegate.Model model) {
        return !eVar.isEmpty() ? yp0.b.g(eVar, model, null, 0, 0, 126) : eVar;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        m domainState = (m) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (q) iii.c.f(domainState.f123643b, new y(0), new e6e.a(6), new dn8.k(domainState, this, 13));
    }

    public final List c(List list, ZonedDateTime zonedDateTime, Set set, int i, int i2, TextLocalisedClause textLocalisedClause, boolean z, o oVar, k71.q qVar) {
        boolean z3 = list.size() > 3;
        List listV0 = z ? list : zhm.d0.V0(list, 3);
        aim.e eVarB = zhm.u.b();
        List<qua.p> list2 = listV0;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (qua.p pVar : list2) {
            boolean zH = qua.u.h(pVar, zonedDateTime);
            String str = pVar.f249314a.f160150a;
            arrayList.add(new SelectableDelegate.Model(str, a9e.a.b(this.f123633b, pVar, zH, true, qVar), set.contains(str) ? qd0.SELECTED : qd0.UNSELECTED, null, null, false, null, null, null, false, 32760));
        }
        eVarB.addAll(arrayList);
        if (z3) {
            eVarB.add(new LargeActionButtonDelegate.Model(a0.d.n("COLLAPSE_BUTTON_", i2), LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(z ? R$string.bill_accounts_payments_picker_action_show_less : R$string.bill_accounts_payments_picker_action_show_more, null, null, 14), false, null, null, oVar, null, 744));
        }
        return f(zhm.u.a(eVarB), new ListSubheaderDelegate.Model(a0.d.n("ITEM_ID_PAYMENTS_HEADER_", i2), (Image) null, (Clause) new TextLocalisedClause(i, v1.c.v(list), null, 12), (ResourceImage) null, false, false, (Clause) textLocalisedClause, textLocalisedClause != null, (Object) oVar, (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 259898));
    }

    public final aim.e d(List list, boolean z, String str, o oVar, k71.q qVar) {
        boolean z3 = list.size() > 3;
        List listV0 = z ? list : zhm.d0.V0(list, 3);
        aim.e eVarB = zhm.u.b();
        List list2 = listV0;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(a9e.a.b(this.f123633b, (qua.p) it8.next(), true, false, qVar));
        }
        eVarB.addAll(arrayList);
        if (z3) {
            eVarB.add(new LargeActionButtonDelegate.Model(str, LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(z ? R$string.bill_accounts_payments_picker_action_show_less : R$string.bill_accounts_payments_picker_action_show_more, null, null, 14), false, null, null, oVar, null, 744));
        }
        return zhm.u.a(eVarB);
    }
}
