package vrl;

import android.view.MotionEvent;
import aw0.n6;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.internal.views.swipelayout.SwipeToActionLayout;
import com.revolut.feature.backgroundpicker.api.model.PersistedBackground;
import com.revolut.feature.transport.impl.ui.extend.ExtendTicketScreen;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.pass_booking.AsftPassBookingFlowContract$Step;
import com.revolut.retail.feature.balance.picker.api.interactor.BalancesInteractor$InputData;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import zhm.z0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class i0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f291639a;

    public /* synthetic */ i0(int i) {
        this.f291639a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f291639a;
        vv8.g gVar = vv8.g.f292480a;
        vv8.h hVar = vv8.h.f292481a;
        boolean z = false;
        switch (i) {
            case 0:
                io3.d it8 = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(cp5.d.y(z92.f.l(it8)));
            case 1:
                TradingAccount it9 = (TradingAccount) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                if ((it9 instanceof TradingAccount.GIA) && ((TradingAccount.GIA) it9).e == cfl.j.PERSONAL) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                io3.d it10 = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Boolean.valueOf(cp5.d.A(z92.f.l(it10)));
            case 3:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return zhm.f0.f322471a;
            case 4:
                int i2 = vt0.d.u;
                Intrinsics.checkNotNullParameter((n6) obj2, "it");
                return Unit.f186387a;
            case 5:
                int i3 = vt0.h.A;
                Intrinsics.checkNotNullParameter((n6) obj2, "it");
                return Unit.f186387a;
            case 6:
                Set supportedHoldingCurrencies = (Set) obj2;
                Intrinsics.checkNotNullParameter(supportedHoldingCurrencies, "supportedHoldingCurrencies");
                return new BalancesInteractor$InputData(k1j.d.RETAIL, io3.l.CURRENT, z0.i(k1j.a.POCKETS, k1j.a.CRYPTO, k1j.a.COMMODITIES, k1j.a.CREDIT_CARDS), supportedHoldingCurrencies, null, null, null, null, 240);
            case 7:
                Boolean isReviewRequired = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(isReviewRequired, "isReviewRequired");
                return isReviewRequired.booleanValue() ? utf.b.MANUAL : utf.b.AUTO;
            case 8:
                Boolean hasAnyBalances = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(hasAnyBalances, "hasAnyBalances");
                return hasAnyBalances.booleanValue() ? efm.d0.m(utf.b.MANUAL) : efm.d0.m(utf.b.INSUFFICIENT_BALANCE);
            case 9:
                AsftPassBookingFlowContract$Step it11 = (AsftPassBookingFlowContract$Step) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return Boolean.valueOf(it11 instanceof AsftPassBookingFlowContract$Step.TimeSlotBooking);
            case 10:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return zhm.f0.f322471a;
            case 11:
                mel.f it12 = (mel.f) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return new vtk.a(it12.f204744a);
            case 12:
                Intrinsics.checkNotNullParameter((MotionEvent) obj2, "it");
                return Boolean.TRUE;
            case 13:
                Intrinsics.checkNotNullParameter((MotionEvent) obj2, "it");
                return Boolean.TRUE;
            case 14:
                ((Float) obj2).getClass();
                return Boolean.TRUE;
            case 15:
                Boolean it13 = (Boolean) obj2;
                SwipeToActionLayout.Companion companion = SwipeToActionLayout.INSTANCE;
                Intrinsics.checkNotNullParameter(it13, "it");
                return Boolean.valueOf(!it13.booleanValue());
            case 16:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return iii.c.c(3);
            case 17:
                Throwable it14 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, it14, h0Var);
                return Boolean.TRUE;
            case 18:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new vv7.j(null, (List) getDefaultLoadingItems.invoke(), true);
            case 19:
                File it15 = (File) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                if (it15.isFile() && Intrinsics.f(lim.o.n(it15), "apk")) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 20:
                vv8.b update = (vv8.b) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return vv8.b.a(update, gVar, null, 5);
            case 21:
                vv8.b update2 = (vv8.b) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return vv8.b.a(update2, null, gVar, 3);
            case 22:
                return vv8.b.a((vv8.b) obj2, null, null, 6);
            case 23:
                return vv8.b.a((vv8.b) obj2, hVar, null, 5);
            case 24:
                return vv8.b.a((vv8.b) obj2, null, hVar, 3);
            case 25:
                vvc.g update3 = (vvc.g) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return vvc.g.a(update3, null, null, false, null, null, 59);
            case 26:
                RowDelegate.Model it16 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr = ExtendTicketScreen.S;
                Intrinsics.checkNotNullParameter(it16, "it");
                return Boolean.valueOf(Intrinsics.f(it16.f53228a, "BUY_NEW_TICKET_LIST_ID"));
            case 27:
                PersistedBackground it17 = (PersistedBackground) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return it17.f63743a.f63742b;
            case 28:
                List trips = (List) obj2;
                Intrinsics.checkNotNullParameter(trips, "trips");
                return zhm.d0.P0(trips, new afa.a(new vv7.l(4), 13));
            default:
                yw4.p it18 = (yw4.p) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                if (it18.i == yw4.h.PREMIUM && it18.f317331l == yw4.l.FULL_ACCESS) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
