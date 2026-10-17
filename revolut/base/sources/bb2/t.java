package bb2;

import bec.e0;
import bh8.g;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.restaurants.impl.R$string;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.room.selection.common.TravelHotelsRoomsSelectionScreenContract$ModalStep;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.amenities_filter.TravelHotelsRoomAmenitiesFilterScreen;
import com.revolut.feature.wealth.api.ui.invest.transactions.list.InvestTransactionsListContract$Disclaimers;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentInputNotSupportedError;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import ip0.zj;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import ms0.h4;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class t implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14153a;

    public /* synthetic */ t(int i) {
        this.f14153a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f14153a) {
            case 0:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(10, null, true, false, "LIST_ID_REGISTERED_ALIASES_ERROR"));
            case 1:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(10, null, true, false, "LIST_ID_OTHER_ALIASES_ERROR"));
            case 2:
                Function1 defaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItems, "defaultErrorItems");
                return new bb8.i((List) defaultErrorItems.invoke(new iii.d(14, null, true, false, null)), false);
            case 3:
                Function1 defaultFactory = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultFactory, "defaultFactory");
                return new bba.l((List) defaultFactory.invoke(new iii.d(14, null, true, false, null)));
            case 4:
                Function1 errorMapper = (Function1) obj3;
                Intrinsics.checkNotNullParameter(errorMapper, "errorMapper");
                return new bbg.s((List) errorMapper.invoke(new iii.d(12, null, false, true, null)));
            case 5:
                if (((Boolean) obj2).booleanValue()) {
                    return null;
                }
                InvestTransactionsListContract$Disclaimers.INSTANCE.getClass();
                return InvestTransactionsListContract$Disclaimers.Companion.b();
            case 6:
                Throwable error = (Throwable) obj2;
                TradingAccount tradingAccount = (TradingAccount) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (tradingAccount == null) {
                    return error;
                }
                return null;
            case 7:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return new bbk.s((List) getDefaultErrorItems3.invoke(new iii.d(14, null, !(((Throwable) obj2) instanceof PendingPaymentInputNotSupportedError), false, null)), bbk.l.f14332a, null);
            case 8:
                Data t16 = (Data) obj2;
                Data t2 = (Data) obj3;
                Intrinsics.checkNotNullParameter(t16, "t1");
                Intrinsics.checkNotNullParameter(t2, "t2");
                return Boolean.valueOf(i2b.a.k(t16) ? t16.equals(t2) : Intrinsics.f(t16.getContent(), t2.getContent()));
            case 9:
                Throwable error2 = (Throwable) obj2;
                qua.p pVar = (qua.p) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (pVar == null) {
                    return error2;
                }
                return null;
            case 10:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                od0.i.Companion.getClass();
                if (zBooleanValue) {
                    return null;
                }
                return od0.i.f224256b;
            case 11:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 12:
                Throwable error3 = (Throwable) obj2;
                Image image = (Image) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (image == null) {
                    return error3;
                }
                return null;
            case 13:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("CONFIRM_RESERVATION_ERROR", new TextLocalisedClause(R$string.retail_restaurants_common_error_generic_title, null, null, 14), new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_description, null, null, 14), null, new l6(12, new TextLocalisedClause(R$string.retail_restaurants_common_actions_try_again, null, null, 14), null, h4.ACCENT), zj.SMALL, false, null, null, null, 1864);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                return zhm.u.c(model);
            case 14:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return beb.b0.a();
            case 15:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return e0.b(getDefaultErrorItems4);
            case 16:
                Function1 getDefaultErrorItems5 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                return e0.b(getDefaultErrorItems5);
            case 17:
                Function1 getDefaultErrorItems6 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems6, "getDefaultErrorItems");
                return e0.b(getDefaultErrorItems6);
            case 18:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                TravelHotelsRoomsSelectionScreenContract$ModalStep step = (TravelHotelsRoomsSelectionScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof TravelHotelsRoomsSelectionScreenContract$ModalStep.Amenities) {
                    return new TravelHotelsRoomAmenitiesFilterScreen();
                }
                throw new NoWhenBranchMatchedException();
            case 19:
                Function1 getDefaultErrorItems7 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems7, "getDefaultErrorItems");
                return (List) getDefaultErrorItems7.invoke(new iii.d(8, null, true, true, "ERROR_STATE_ITEM_ID"));
            case 20:
                Function1 getDefaultErrorItems8 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems8, "getDefaultErrorItems");
                int i = com.revolut.feature.credit.core.R$string.credit_application_payment_checkout_title;
                m70.a.c(t0.f186434a);
                return new bg4.v(null, new TextLocalisedClause(i, zhm.u.c(""), null, 12), null, (List) getDefaultErrorItems8.invoke(new iii.d(14, null, true, false, null)));
            case 21:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                FlowStep it8 = (FlowStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(it8, "it");
                throw new IllegalStateException("No modal steps are supported for this controller");
            case 22:
                Function1 getDefaultErrorItems9 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems9, "getDefaultErrorItems");
                return new yhm.r(getDefaultErrorItems9.invoke(new iii.d(14, null, true, false, null)), null, null);
            case 23:
                Function1 defaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItems2, "defaultErrorItems");
                return new Pair(defaultErrorItems2.invoke(new iii.d(14, null, true, false, null)), g.a.f15243a);
            case 24:
                Function1 getDefaultErrorItems10 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems10, "getDefaultErrorItems");
                return (List) getDefaultErrorItems10.invoke(new iii.d(14, null, true, false, null));
            case 25:
                Throwable error4 = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (list == null) {
                    return error4;
                }
                return null;
            case 26:
                Function1 getDefaultErrorItems11 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems11, "getDefaultErrorItems");
                return (List) getDefaultErrorItems11.invoke(new iii.d(12, null, true, true, null));
            case 27:
                w4l.f DataObservableDelegate = (w4l.f) obj2;
                a0.d.B(obj3);
                Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                Intrinsics.checkNotNullParameter(null, "params");
                throw null;
            case 28:
                Function1 getDefaultErrorItems12 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems12, "getDefaultErrorItems");
                return (List) getDefaultErrorItems12.invoke(new iii.d(12, null, false, true, null));
            default:
                Function1 getDefaultErrorItems13 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems13, "getDefaultErrorItems");
                return (List) getDefaultErrorItems13.invoke(new iii.d(12, null, false, true, null));
        }
    }

    public /* synthetic */ t(Object obj2, int i) {
        this.f14153a = i;
    }
}
