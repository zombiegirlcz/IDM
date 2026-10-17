package jjd;

import aw0.f;
import aw0.g;
import aw0.m6;
import aw0.n6;
import aw0.o9;
import aw0.t0;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.shops.impl.R$string;
import com.revolut.feature.shops.impl.ui.items_details.cancellation.ShopsCancelOrderContract$InputData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static CellDetailsDelegate.Model a(int i, Clause clause, String str) {
        return new CellDetailsDelegate.Model(str, new t0((Clause) new TextLocalisedClause(i, null, null, 14), (Image) null, 0, false, 30), clause, null, null, null, null, 0, null, false, false, null, null, 32760);
    }

    @Override // cli.n
    public final o c(j jVar) {
        CellDetailsDelegate.Model modelA;
        jjd.a domainState = (jjd.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        ShopsCancelOrderContract$InputData shopsCancelOrderContract$InputData = domainState.f174813a;
        boolean z = domainState.f174814b;
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.shops_screens_cancel_order_title, null, null, 14), new TextLocalisedClause(R$string.shops_screens_cancel_order_description, null, null, 14), null, null, false, 28);
        CellDetailsDelegate.Model modelA2 = a(R$string.shops_screens_cancel_order_refunding_to, new TextClause(shopsCancelOrderContract$InputData.f87218b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), "cancel_order_refunding_to");
        CellDetailsDelegate.Model modelA3 = a(R$string.shops_screens_cancel_order_item_purchased, new TextClause(shopsCancelOrderContract$InputData.f87219c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), "cancel_order_item");
        CellDetailsDelegate.Model modelA4 = a(R$string.shops_screens_item_details_sections_purchase_details_quantity_title, new TextClause(String.valueOf(shopsCancelOrderContract$InputData.d), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), "cancel_order_quantity");
        Long l2 = shopsCancelOrderContract$InputData.e;
        if (l2 != null) {
            long jLongValue = l2.longValue();
            int i = R$string.shops_screens_cancel_order_purchase_date;
            TimeClause.Format.INSTANCE.getClass();
            modelA = a(i, new TimeClause(jLongValue, TimeClause.Format.f57959a, null, null, 12), "cancel_order_date");
        } else {
            modelA = null;
        }
        CellDetailsDelegate.Model[] elements = {modelA2, modelA3, modelA4, modelA, a(R$string.shops_screens_cancel_order_refund_amount, nub.a.q(qvb.a.a(shopsCancelOrderContract$InputData.f), null, null, null, 7), "cancel_order_amount")};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        f fVar = f.EQUAL_BUTTONS_REVERSED;
        m6 m6Var = n6.Companion;
        boolean z3 = !z;
        return new cii.b(new g(m6.c(m6Var, new TextLocalisedClause(R$string.shops_screens_cancel_order_confirm, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, z3, null, null, null, 988), m6.c(m6Var, new TextLocalisedClause(R$string.shops_screens_cancel_order_back, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, z3, null, null, null, 988), (Clause) null, fVar, 9), listL, aVar);
    }
}
