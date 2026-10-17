package vz2;

import aim.e;
import aw0.o9;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.cards_core.R$plurals;
import com.revolut.feature.cards_core.R$string;
import com.revolut.feature.recurring_payments.api.data.models.RecurringPaymentWithExtra;
import h93.f0;
import ip0.m00;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import mae.o;
import ngm.n;
import org.jetbrains.annotations.NotNull;
import qua.p;
import rp0.l;
import rp0.t;
import rp0.y;
import te0.w;
import v1.c;
import yt8.i;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements az2.b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f293368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f293369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f293370c;

    public b(o subscriptionsItemMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(subscriptionsItemMapper, "subscriptionsItemMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f293368a = subscriptionsItemMapper;
        this.f293369b = featureToggleInteractor;
        this.f293370c = w.y0(new vt3.a(this, 5));
    }

    public static List c(f0 f0Var, i iVar, boolean z, boolean z3) {
        RowDelegate.Model[] elements = {(f0Var.R && n.p(iVar) && z3) ? new RowDelegate.Model("FREEZE_CARD_ACTION_ID", LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_snowflake, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 8.0f, null, null, 48), null, null, new TextLocalisedClause(R$string.card_terminate_confirm_freeze_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), new TextLocalisedClause(R$string.card_terminate_confirm_freeze_subtitle, null, null, 14), null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073741676) : null, new RowDelegate.Model("TERMINATE_CARD_ACTION_ID", LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_trash, Integer.valueOf(R$attr.uikit_colorRed), R$attr.uikit_colorRed_10, 8.0f, null, null, 48), null, null, new TextLocalisedClause(R$string.card_terminate_confirm_terminate_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10), !z ? new TextLocalisedClause(R$string.card_terminate_confirm_terminate_subtitle_disabled_global_card, null, null, 14) : null, null, null, 0, null, z, false, null, z ? RowDelegate.Model.b.c.f53268a : RowDelegate.Model.b.a.f53266a, null, null, null, null, null, 0, 0, 0, 0, 1073704812)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = d.L(elements);
        yp0.b.k(listL, 0, R$attr.uikit_dp32, 0, 0, 29);
        return listL;
    }

    public static y d(b bVar, f0 f0Var, i iVar, List list, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, boolean z, boolean z3, int i) {
        TextLocalisedClause textLocalisedClause3;
        Clause textClause;
        if ((i & 8) != 0) {
            textLocalisedClause3 = new TextLocalisedClause(f0Var.N() ? R$string.card_terminate_undelivered_title : R$string.card_terminate_confirm_title, null, null, 14);
        } else {
            textLocalisedClause3 = textLocalisedClause;
        }
        TextLocalisedClause textLocalisedClause4 = (i & 16) != 0 ? null : textLocalisedClause2;
        boolean z4 = (i & 64) != 0 ? true : z3;
        bVar.getClass();
        t tVar = new t(textLocalisedClause3, textLocalisedClause4, null, 28);
        l lVar = l.WINDOW;
        e eVarB = u.b();
        List list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            TextLocalisedQuantityClause textLocalisedQuantityClause = new TextLocalisedQuantityClause(R$plurals.card_terminate_affected_subscriptions_title, Integer.valueOf(list.size()), c.v(list), (Style) null, 24);
            List list3 = list;
            ArrayList arrayList = new ArrayList(zhm.w.t(list3, 10));
            Iterator it8 = list3.iterator();
            while (it8.hasNext()) {
                arrayList.add(bVar.f293368a.i(new RecurringPaymentWithExtra.General((p) it8.next())));
            }
            int size = arrayList.size();
            if (size == 0) {
                m70.a.c(t0.f186434a);
                textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            } else if (size != 1) {
                textClause = size != 2 ? size != 3 ? new TextLocalisedClause(R$string.card_terminate_affected_subscriptions_subtitle_more, v.k(new TextClause((String) arrayList.get(0), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause((String) arrayList.get(1), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12) : new TextLocalisedClause(R$string.card_terminate_affected_subscriptions_subtitle_three, v.k(new TextClause((String) arrayList.get(0), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause((String) arrayList.get(1), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause((String) arrayList.get(2), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12) : new TextLocalisedClause(R$string.card_terminate_affected_subscriptions_subtitle_two, v.k(new TextClause((String) arrayList.get(0), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause((String) arrayList.get(1), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
            } else {
                textClause = new TextClause((String) arrayList.get(0), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            }
            m00 m00Var = new m00("AFFECTED_SUBSCRIPTIONS_LIST_ID", textLocalisedQuantityClause, textClause, com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30), new TextLocalisedClause(R$string.card_terminate_affected_subscriptions_action, null, null, 14), null, null, YearClass.CLASS_2016);
            yp0.b.l(m00Var, 0, 0, 0, 0, null, false, 63);
            eVarB.add(m00Var);
        }
        eVarB.addAll(c(f0Var, iVar, z, z4));
        return new y(u.a(eVarB), tVar, lVar, null, null, null, 1016);
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
    public final y e(f0 card, TextLocalisedClause title) {
        RowDelegate.Model model;
        RowDelegate.Model model2;
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(title, "title");
        t tVar = new t(title, null, null, 30);
        l lVar = l.WINDOW;
        e eVarB = u.b();
        boolean z = false;
        int i = 6;
        RowDelegate.Model model3 = new RowDelegate.Model("HOLD_FOREIGN_CURRENCIES_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_dot, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i), new TextLocalisedClause(R$string.card_terminate_mcy_warning_item_hold, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856);
        RowDelegate.Model model4 = new RowDelegate.Model("RECEIVE_FOREIGN_CURRENCIES_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_dot, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i), new TextLocalisedClause(R$string.card_terminate_mcy_warning_item_receive, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856);
        RowDelegate.Model model5 = new RowDelegate.Model("EXCHANGE_FOREIGN_CURRENCIES_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_dot, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i), new TextLocalisedClause(R$string.card_terminate_mcy_warning_item_exchange, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856);
        ?? r92 = this.f293370c;
        if (((Boolean) r92.getValue()).booleanValue() && card.X) {
            model = new RowDelegate.Model("WEALTH_AND_TRADING_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_dot, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i), new TextLocalisedClause(R$string.card_terminate_mcy_warning_item_wealth_and_trading, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856);
        } else {
            model = null;
        }
        if (((Boolean) r92.getValue()).booleanValue() && card.X) {
            model2 = new RowDelegate.Model("MONEY_MARKET_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_dot, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, i), new TextLocalisedClause(R$string.card_terminate_mcy_warning_item_money_market, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856);
        } else {
            model2 = null;
        }
        RowDelegate.Model[] elements = {model3, model4, model5, model, model2};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        eVarB.addAll(listL);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.card_terminate_mcy_warning_button_terminate, null, null, 14);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        int i2 = R$attr.uikit_dp16;
        eVarB.add(new LargeActionButtonDelegate.Model("TERMINATE_MCY_CARD_ACTION_ID", defaultFilledButton, null, textLocalisedClause, false, null, card, R$attr.uikit_dp24, R$attr.uikit_dp8, i2, i2, 368));
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.card_terminate_mcy_warning_button_cancel, null, null, 14);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton2 = LargeActionButton.ButtonStyle.f58726b;
        int i3 = R$attr.uikit_dp16;
        eVarB.add(new LargeActionButtonDelegate.Model("TERMINATE_MCY_CARD_CANCEL_BUTTON_ID", defaultFilledButton2, null, textLocalisedClause2, false, null, null, R$attr.uikit_dp8, R$attr.uikit_dp24, i3, i3, 496));
        return new y(u.a(eVarB), tVar, lVar, null, null, null, 1016);
    }
}
