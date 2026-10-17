package rbg;

import aw0.o9;
import aw0.t0;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.confirmation.TravelHotelsCancellationConfirmationContract$CancellationConfirmationData;
import com.revolut.feature_travel_hotels_models.booking.details.CancellationRefund;
import com.revolut.feature_travel_hotels_models.booking.details.CancellationRefundBreakdown;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class m implements cli.n {

    @NotNull
    public static final k Companion = new k();

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        TextLocalisedClause textLocalisedClause;
        char c2;
        char c3;
        CellDetailsDelegate.Model model;
        List listL;
        dj0.d dVar;
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        qbg.d dVar2 = domainState.f253051b;
        TravelHotelsCancellationConfirmationContract$CancellationConfirmationData data = domainState.f253050a;
        int i = l.f253061a[dVar2.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            Intrinsics.checkNotNullParameter(data, "data");
            lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.hotels_booking_details_manage_booking_cancellation_refund_breakdown, null, null, 14), null, null, null, false, 30);
            Companion.getClass();
            aw0.g gVarA = k.a();
            CancellationRefund cancellationRefund = data.f93885a;
            CancellationRefundBreakdown cancellationRefundBreakdown = cancellationRefund.f97877b;
            dj0.d dVar3 = cancellationRefundBreakdown.f97878a;
            CellDetailsDelegate.Model model2 = (dVar3 == null || (dVar = cancellationRefundBreakdown.f97879b) == null) ? null : new CellDetailsDelegate.Model("BOOKING_VALUE_ITEM_ID", new t0((Clause) new TextLocalisedClause(R$string.hotels_booking_details_manage_booking_cancellation_booking_value, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(pyd.c.O(dVar3, dVar), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4), null, null, null, null, 0, null, false, false, null, null, 30712);
            dj0.d dVar4 = cancellationRefund.f97877b.d;
            CellDetailsDelegate.Model model3 = dVar4 != null ? new CellDetailsDelegate.Model("CASH_NET_REFUND_ITEM_ID", new t0((Clause) new TextLocalisedClause(R$string.hotels_booking_details_manage_booking_cancellation_cash_net_refund, null, null, 14), (Image) null, 0, false, 30), r.a(new MoneyClause(dVar4, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4)), null, null, null, null, 0, null, false, false, null, null, 32760) : null;
            RevPoints revPointsO = t1.o(cancellationRefund);
            qv0.i[] elements = {model2, model3, revPointsO != null ? new CellDetailsDelegate.Model("POINTS_NET_REFUND_ITEM_ID", new t0((Clause) new TextLocalisedClause(R$string.hotels_booking_details_manage_booking_cancellation_points_net_refund, null, null, 14), (Image) null, 0, false, 30), r.a(nub.a.q(revPointsO, null, nub.d.f219277a, o9.NON_SENSITIVE, 1)), null, null, null, null, 0, null, false, false, null, null, 32760) : null};
            Intrinsics.checkNotNullParameter(elements, "elements");
            List listL2 = kotlin.collections.d.L(elements);
            yp0.b.k(listL2, 0, 0, 0, 0, 31);
            return new cii.b(gVarA, listL2, aVar);
        }
        Intrinsics.checkNotNullParameter(data, "data");
        cgi.e eVar = data.f93886b;
        CancellationRefund cancellationRefund2 = data.f93885a;
        int[] iArr = n.f253062a;
        int i2 = iArr[eVar.ordinal()];
        if (i2 == 1) {
            textLocalisedClause = new TextLocalisedClause(R$string.hotels_booking_details_manage_booking_cancellation_confirm_change, null, null, 14);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.hotels_booking_details_manage_booking_cancellation_pay_later_title, null, null, 14);
        }
        lw0.a aVar2 = new lw0.a(textLocalisedClause, null, null, null, false, 30);
        Companion.getClass();
        aw0.g gVarA2 = k.a();
        int i3 = iArr[data.f93886b.ordinal()];
        if (i3 == 1) {
            CancellationRefundBreakdown cancellationRefundBreakdown2 = cancellationRefund2.f97877b;
            dj0.d dVar5 = cancellationRefundBreakdown2.f97878a;
            dj0.d dVar6 = cancellationRefundBreakdown2.f97879b;
            if (dVar5 == null || dVar6 == null) {
                c2 = 0;
                c3 = 3;
                model = null;
            } else {
                c2 = 0;
                c3 = 3;
                model = new CellDetailsDelegate.Model("REFUND_ITEM_ID", new t0((Clause) new TextLocalisedClause(R$string.hotels_booking_details_manage_booking_cancellation_booking_value, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(pyd.c.O(dVar5, dVar6), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 30712);
            }
            CellDetailsDelegate.Model model4 = dVar6 != null ? new CellDetailsDelegate.Model("CANCELLATION_FEE_ITEM_ID", new t0((Clause) new TextLocalisedClause(R$string.hotels_booking_details_manage_booking_cancellation_cancellation_fee, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(dVar6.l(), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 30712) : null;
            dj0.d dVar7 = cancellationRefundBreakdown2.f97880c;
            CellDetailsDelegate.Model model5 = dVar7 != null ? new CellDetailsDelegate.Model("CASHBACK_REVERSAL_ITEM_ID", new t0((Clause) new TextLocalisedClause(R$string.hotels_booking_details_manage_booking_cancellation_cashback_reversal, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(dVar7.l(), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 30712) : null;
            dj0.d dVar8 = cancellationRefund2.f97876a;
            CellDetailsDelegate.Model model6 = dVar8 != null ? new CellDetailsDelegate.Model("NET_REFUND_ITEM_ID", new t0((Clause) new TextLocalisedClause(R$string.hotels_booking_details_manage_booking_cancellation_net_refund, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), (Image) null, 0, false, 30), new MoneyClause(dVar8, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 30712) : null;
            qv0.i[] elements2 = new qv0.i[4];
            elements2[c2] = model;
            elements2[1] = model4;
            elements2[2] = model5;
            elements2[c3] = model6;
            Intrinsics.checkNotNullParameter(elements2, "elements");
            List listL3 = kotlin.collections.d.L(elements2);
            yp0.b.k(listL3, 0, 0, 0, 0, 31);
            listL = listL3;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            dj0.d dVar9 = cancellationRefund2.f97877b.f97879b;
            listL = v.l(dVar9 != null ? new CellDetailsDelegate.Model("PENALTY_ITEM_ID", new t0((Clause) new TextLocalisedClause(R$string.hotels_booking_details_manage_booking_cancellation_pay_later_penalty, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), (Image) null, 0, false, 30), new MoneyClause(dVar9.l(), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 30712) : null);
            yp0.b.k(listL, 0, 0, 0, 0, 31);
        }
        return new cii.b(gVarA2, listL, aVar2);
    }
}
