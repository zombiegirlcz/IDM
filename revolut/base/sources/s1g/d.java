package s1g;

import aw0.db;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature.travel.experiences.api.R$string;
import com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.TravelExperiencesCancellationScreen;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import rp0.t;
import rp0.y;
import yhm.o;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelExperiencesCancellationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TravelExperiencesCancellationScreen travelExperiencesCancellationScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelExperiencesCancellationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVarI3 = this.v.T2();
        Intrinsics.h(model);
        com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.e eVar = (com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.e) hVarI3;
        u1g.c cVar = eVar.f93041r;
        j60.a aVar2 = eVar.f93039p;
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f51832a;
        Object obj3 = model.o;
        if (Intrinsics.f(str, "NET_REFUND_ITEM_ID")) {
            jyf.b bookingCancellationQuote = obj3 instanceof jyf.b ? (jyf.b) obj3 : null;
            if (bookingCancellationQuote != null) {
                dj0.d dVar = bookingCancellationQuote.e;
                ((u1g.e) cVar).getClass();
                Intrinsics.checkNotNullParameter(bookingCancellationQuote, "bookingCancellationQuote");
                dj0.d dVar2 = bookingCancellationQuote.f179420b;
                dj0.d dVarO = pyd.c.O(dVar, dVar2);
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.experiences_booking_details_manage_booking_cancellation_cash_paid, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
                MoneyClause.Format.Defaults defaults = new MoneyClause.Format.Defaults(null, null, false, false, 15);
                o9 o9Var = o9.NON_SENSITIVE;
                List listK = v.k(new CellDetailsDelegate.Model("CASH_PAID_ITEM_ID", textLocalisedClause, new MoneyClause(dVarO, defaults, null, o9Var, 4), 0, null, null, null, null, null, false, 0, 0, 32760), new CellDetailsDelegate.Model("CANCELLATION_FEE_ITEM_ID", new TextLocalisedClause(R$string.experiences_cancellation_sheet_cancellation_fee, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9Var, 4), 0, null, null, null, null, null, false, 0, 0, 32760), new CellDetailsDelegate.Model("NET_REFUND_ITEM_ID", new TextLocalisedClause(R$string.experiences_booking_details_manage_booking_cancellation_cash_net_refund, null, new Custom(null, false, db.EMPHASIS2, false, null, Constants.TAG_FB_CHARGING_STATUS), 10), new MoneyClause(pyd.c.H(dVar2, bookingCancellationQuote.f179422g), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9Var, 4), 0, null, null, null, null, null, false, 0, 0, 32760));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                aVar2.x(new y(listK, new t(new TextLocalisedClause(R$string.experiences_booking_details_manage_booking_cancellation_cash_net_refund, null, null, 14), null, null, 30), null, null, null, null, 1020));
            }
        } else if (Intrinsics.f(str, "POINTS_NET_REFUND_ITEM_ID")) {
            jyf.b bookingCancellationQuote2 = obj3 instanceof jyf.b ? (jyf.b) obj3 : null;
            if (bookingCancellationQuote2 != null) {
                RevPoints revPoints = bookingCancellationQuote2.f179423h;
                m1c.v vVar = bookingCancellationQuote2.f;
                RevPoints revPoints2 = vVar.f201463a;
                dj0.d dVar3 = vVar.f201464b;
                ((u1g.e) cVar).getClass();
                Intrinsics.checkNotNullParameter(bookingCancellationQuote2, "bookingCancellationQuote");
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.experiences_booking_details_manage_booking_cancellation_points_paid, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
                TextClause textClause = new TextClause("(", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                m1c.v vVar2 = bookingCancellationQuote2.f179421c;
                dj0.d dVar4 = vVar2.f201464b;
                RevPoints revPoints3 = vVar2.f201463a;
                dj0.d dVarO2 = pyd.c.O(dVar3, dVar4);
                MoneyClause.Format.Defaults defaults2 = new MoneyClause.Format.Defaults(null, null, false, false, 15);
                o9 o9Var2 = o9.NON_SENSITIVE;
                CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model("POINTS_PAID_ITEM_ID", textLocalisedClause2, new CompositeClause(v.k(textClause, new MoneyClause(dVarO2, defaults2, null, o9Var2, 4), new TextClause(") ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), nub.a.q(revPoints.z(revPoints2).z(revPoints3), null, null, null, 7)), null, null, null, 14), 0, null, null, null, null, null, false, 0, 0, 32760);
                CellDetailsDelegate.Model model3 = new CellDetailsDelegate.Model("CANCELLATION_FEE_POINTS_ITEM_ID", new TextLocalisedClause(R$string.experiences_cancellation_sheet_cancellation_fee, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), new CompositeClause(v.k(new TextClause("(", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new MoneyClause(dVar3, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9Var2, 4), new TextClause(") ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), nub.a.q(revPoints2, null, null, null, 7)), null, null, null, 14), 0, null, null, null, null, null, false, 0, 0, 32760);
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.experiences_booking_details_manage_booking_cancellation_points_reversal, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
                int i = R$drawable.uikit_icn_16_info_outline;
                Integer numValueOf = Integer.valueOf(R$attr.uikit_colorGreyTone50);
                Float fValueOf = Float.valueOf(14.0f);
                List listK2 = v.k(textLocalisedClause3, new ImageClause(i, numValueOf, fValueOf, fValueOf, 16));
                m70.a.t(t0.f186434a);
                List listK3 = v.k(model2, model3, new CellDetailsDelegate.Model("POINTS_REVERSAL_ITEM_ID", new CompositeClause(listK2, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), true, nub.a.q(revPoints, null, null, null, 7), null, null, null, false, null, null, 0, 134217684), new CellDetailsDelegate.Model("POINTS_NET_REFUND_ITEM_ID", new TextLocalisedClause(R$string.experiences_booking_details_manage_booking_cancellation_points_net_refund, null, null, 14), nub.a.q(revPoints3.j(revPoints), null, null, null, 7), 0, bookingCancellationQuote2, null, null, null, null, false, 0, 0, 32744));
                yp0.b.k(listK3, 0, 0, 0, 0, 31);
                aVar2.x(new y(listK3, new t(new TextLocalisedClause(R$string.experiences_booking_details_manage_booking_cancellation_cash_net_refund, null, null, 14), null, null, 30), null, null, null, null, 1020));
            }
        }
        return Unit.f186387a;
    }
}
