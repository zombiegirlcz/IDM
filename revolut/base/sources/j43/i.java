package j43;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.card_payment_method.impl.R$plurals;
import com.revolut.feature.card_payment_method.impl.R$string;
import com.revolut.feature.recurring_payments.api.data.models.RecurringPaymentWithExtra;
import h93.f0;
import h93.l0;
import ia3.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import qua.p;
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f171287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m93.g f171288b;

    public i(j linkCardDetailsReviewUiRowsMapper, m93.g cardsSimplifiedItemMapper) {
        Intrinsics.checkNotNullParameter(linkCardDetailsReviewUiRowsMapper, "linkCardDetailsReviewUiRowsMapper");
        Intrinsics.checkNotNullParameter(cardsSimplifiedItemMapper, "cardsSimplifiedItemMapper");
        this.f171287a = linkCardDetailsReviewUiRowsMapper;
        this.f171288b = cardsSimplifiedItemMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        RowDelegate.Model model;
        Clause textClause;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        f0 f0Var = domainState.f171281a;
        List cardPayments = domainState.f171283c;
        RowDelegate.Model modelG = ((t) this.f171288b).g(true, f0Var, false, Boolean.valueOf(domainState.e));
        yp0.b.l(modelG, 0, 0, 0, 0, null, false, 63);
        List listC = u.c(modelG);
        RowDelegate.Model model2 = null;
        RowDelegate.Model model3 = new RowDelegate.Model("SUBACCOUNT_AS_SOURCE_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_wallet, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.subaccount_alert_multicurrency_bill_source_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.subaccount_alert_multicurrency_bill_source_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
        xi0.a aVar = xi0.b.Companion;
        String str = domainState.f171282b.f65523a.f163147c;
        aVar.getClass();
        xi0.b currency = xi0.a.a(str);
        l0 l0Var = domainState.f171281a.G;
        Intrinsics.checkNotNullParameter(currency, "currency");
        if (l0Var == l0.INDIA_LOCAL) {
            model = null;
        } else {
            int i = R$string.subaccount_alert_multicurrency_bill_currency_title;
            String str2 = currency.f306286a;
            if (str2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            model = new RowDelegate.Model("SUBACCOUNT_CURRENCY_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_rates_converter_page, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(i, u.c(str2), null, 12), null, 0, yoj.b.w(yoj.b.w(l0Var == l0.INDIA_GLOBAL ? new TextLocalisedClause(R$string.subaccount_alert_multicurrency_bill_currency_global_card_description, null, null, 14) : new TextLocalisedClause(R$string.subaccount_alert_multicurrency_bill_currency_description, null, null, 14), new TextClause(m70.a.o(t0.f186434a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new TextLocalisedClause(R$string.subaccount_alert_multicurrency_bill_currency_link, null, new Click(30, (Integer) null, (Object) null, "EXCHANGE_INFO_ID", false), 10)), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
        }
        if (!cardPayments.isEmpty()) {
            Intrinsics.checkNotNullParameter(cardPayments, "cardPayments");
            TextLocalisedQuantityClause textLocalisedQuantityClause = new TextLocalisedQuantityClause(R$plurals.card_link_card_to_pocket_subscriptions_title, Integer.valueOf(cardPayments.size()), v1.c.v(cardPayments), (Style) null, 24);
            List list = cardPayments;
            ArrayList arrayList = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(this.f171287a.f171289a.i(new RecurringPaymentWithExtra.General((p) it8.next())));
            }
            int size = arrayList.size();
            if (size != 0) {
                textClause = size != 1 ? size != 2 ? size != 3 ? new TextLocalisedClause(R$string.card_payment_method_personal_vault_affected_subscriptions_subtitle_more, v.k(new TextClause((String) arrayList.get(0), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause((String) arrayList.get(1), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12) : new TextLocalisedClause(R$string.card_payment_method_personal_vault_affected_subscriptions_subtitle_three, v.k(new TextClause((String) arrayList.get(0), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause((String) arrayList.get(1), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause((String) arrayList.get(2), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12) : new TextLocalisedClause(R$string.card_payment_method_personal_vault_affected_subscriptions_subtitle_two, v.k(new TextClause((String) arrayList.get(0), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause((String) arrayList.get(1), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12) : new TextClause((String) arrayList.get(0), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            } else {
                m70.a.c(t0.f186434a);
                textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            }
            m70.a.t(t0.f186434a);
            model2 = new RowDelegate.Model("SUBACCOUNT_BILLS_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_calendar_recurring, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), textLocalisedQuantityClause, null, 0, yoj.b.w(yoj.b.w(textClause, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new TextLocalisedClause(R$string.card_link_card_to_pocket_subscriptions_action, null, new Click(30, (Integer) null, (Object) null, "CARD_SUBSCRIPTIONS_ID", false), 10)), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
        }
        qv0.i[] elements = {model3, model, model2};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        return new f(d0.E0(listL, listC));
    }
}
