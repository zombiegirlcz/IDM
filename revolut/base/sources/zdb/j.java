package zdb;

import aw0.n6;
import aw0.o9;
import aw0.t0;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.retail.restaurants.impl.R$string;
import ip0.y10;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements n {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static CellDetailsDelegate.Model a(int i, Clause clause, String str) {
        return new CellDetailsDelegate.Model(str, new t0((Clause) new TextLocalisedClause(i, null, null, 14), (Image) null, 0, false, 30), clause, null, null, null, null, 0, null, false, false, null, null, 32760);
    }

    public static aw0.h b(boolean z) {
        return new aw0.h(false, new n6(new TextLocalisedClause(R$string.retail_restaurants_cancel_reservation_actions_confirm, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "retail_restaurants_cancel_reservation_confirm", z, null, null, 972), new n6(new TextLocalisedClause(R$string.retail_restaurants_cancel_reservation_actions_keep, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121);
    }

    public static f d(TextLocalisedClause textLocalisedClause, xdb.c cVar, Integer num) {
        List listK;
        if (cVar == null || num == null) {
            listK = f0.f322471a;
        } else {
            int iIntValue = num.intValue();
            listK = v.k(a(R$string.retail_restaurants_cancel_reservation_cells_breakdown_guests, new TextClause(String.valueOf(cVar.f304385a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), "cancel_reservation_guests"), new CellDetailsDelegate.Model("cancel_reservation_policy_fee", new t0((Clause) new TextLocalisedClause(R$string.retail_restaurants_cancel_reservation_cells_breakdown_policy_fee, null, null, 14), (Image) null, 0, false, 30), new TextLocalisedClause(R$string.retail_restaurants_cancel_reservation_cells_breakdown_policy_fee_accessory, u.c(new MoneyClause(cVar.f304386b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), null, null, null, null, 0, null, false, false, null, null, 32760), a(iIntValue, new MoneyClause(cVar.f304387c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), "cancel_reservation_total"));
            yp0.b.k(listK, 0, 0, 0, 0, 31);
        }
        return new f(listK, new lw0.a(new TextLocalisedClause(R$string.retail_restaurants_cancel_reservation_screen_title, null, null, 14), textLocalisedClause, null, null, false, 28), b(true));
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        xdb.j jVar2 = domainState.f321434a;
        if (jVar2.equals(xdb.i.f304395a)) {
            return d(new TextLocalisedClause(R$string.retail_restaurants_cancel_reservation_screen_caption_cancellation_fees_no_charge, null, null, 14), null, null);
        }
        if (jVar2 instanceof xdb.g) {
            return d(new TextLocalisedClause(R$string.retail_restaurants_cancel_reservation_screen_caption_deposit_refund, null, null, 14), ((xdb.g) jVar2).f304393a, Integer.valueOf(R$string.retail_restaurants_cancel_reservation_cells_breakdown_total_refund));
        }
        if (jVar2.equals(xdb.e.f304390a)) {
            return d(new TextLocalisedClause(R$string.retail_restaurants_cancel_reservation_screen_caption_cancellation_fees_no_charge, null, null, 14), null, null);
        }
        if (jVar2 instanceof xdb.f) {
            xdb.f fVar = (xdb.f) jVar2;
            return d(new TextLocalisedClause(R$string.retail_restaurants_cancel_reservation_screen_caption_deposit_charge, u.c(tz4.d.C(fVar.f304391a)), null, 12), fVar.f304392b, Integer.valueOf(R$string.retail_restaurants_cancel_reservation_cells_breakdown_total_fee));
        }
        if (jVar2 instanceof xdb.d) {
            xdb.d dVar = (xdb.d) jVar2;
            return d(new TextLocalisedClause(R$string.retail_restaurants_cancel_reservation_screen_caption_cancellation_fees_charge, u.c(tz4.d.C(dVar.f304388a)), null, 12), dVar.f304389b, Integer.valueOf(R$string.retail_restaurants_cancel_reservation_cells_breakdown_total_charge));
        }
        if (!jVar2.equals(xdb.h.f304394a)) {
            throw new NoWhenBranchMatchedException();
        }
        List listC = u.c(new sa("cancel_reservation_error", (Clause) new TextLocalisedClause(R$string.retail_restaurants_common_error_generic_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_description, null, null, 14), (List) f0.f322471a, false, (Image) new ResourceImage(R$drawable.uikit_icn_24_info_legacy, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorPink), (List) null, (ImageTransformations) null, (Clause) null, 246), (y10) null, (Object) null, 4032));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        return new f(listC, new lw0.a(new TextLocalisedClause(R$string.retail_restaurants_cancel_reservation_screen_title, null, null, 14), null, null, null, false, 30), b(false));
    }
}
