package o95;

import cli.n;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.acquiring.card_reader.order.impl.ui.screen.product_details.CardReaderProductDetailsScreen;
import com.revolut.feature.acquiring.card_reader.order.impl.ui.screen.product_details.CardReaderProductDetailsScreenContract$ProductDetailsWidgetType;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.Quote;
import com.revolut.feature.revolutpay.impl.ui.summary_screen.RevolutPaySummaryScreen;
import com.revolut.shared.feature.wealth.models.config.Links;
import f95.b;
import ip0.nb0;
import ip0.pb0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import o9c.s;
import s6c.l;
import wp5.y;
import zhm.h0;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f223071a;

    public /* synthetic */ b(int i) {
        this.f223071a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data data;
        Data data2;
        switch (this.f223071a) {
            case 0:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 1:
                Throwable it9 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return b.a.f132822a;
            case 2:
                List facilities = (List) obj2;
                Intrinsics.checkNotNullParameter(facilities, "facilities");
                List list = facilities;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it10 = list.iterator();
                    while (true) {
                        if (it10.hasNext()) {
                            if (((f95.d) it10.next()).f132831b == f95.e.ACTIVE) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 3:
                yoj.a aVar = (yoj.a) obj2;
                return y.s(aVar, "it", aVar);
            case 4:
                Throwable it11 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return g95.b.f141462a;
            case 5:
                RowDelegate.Model it12 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr = RevolutPaySummaryScreen.f84518b0;
                Intrinsics.checkNotNullParameter(it12, "it");
                return Boolean.valueOf(Intrinsics.f(it12.f53228a, "SHIPPING_ADDRESS_LIST_ID"));
            case 6:
                RowDelegate.Model it13 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr2 = RevolutPaySummaryScreen.f84518b0;
                Intrinsics.checkNotNullParameter(it13, "it");
                return Boolean.valueOf(Intrinsics.f(it13.f53228a, "CHECKOUT_DETAILS_DELIVERY_METHOD_LIST_ID"));
            case 7:
                RowDelegate.Model it14 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr3 = RevolutPaySummaryScreen.f84518b0;
                Intrinsics.checkNotNullParameter(it14, "it");
                return Boolean.valueOf(Intrinsics.f(it14.f53228a, "PAYMENT_METHOD_PAYMENT_METHODS_LIST_ID"));
            case 8:
                RowDelegate.Model it15 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr4 = RevolutPaySummaryScreen.f84518b0;
                Intrinsics.checkNotNullParameter(it15, "it");
                return Boolean.valueOf(Intrinsics.f(it15.f53228a, "ORDER_SUMMARY_ID"));
            case 9:
                s currentState = (s) obj2;
                Intrinsics.checkNotNullParameter(currentState, "currentState");
                Data data3 = currentState.f;
                try {
                    Object content = data3.getContent();
                    data = new Data(content != null ? ((l) content).d() : null, data3.getError(), data3.getLoading());
                    break;
                } catch (Throwable th10) {
                    data = new Data(null, th10, data3.getLoading());
                }
                Data data4 = currentState.f;
                try {
                    Object content2 = data4.getContent();
                    data2 = new Data(content2 != null ? ((l) content2).f() : null, data4.getError(), data4.getLoading());
                    break;
                } catch (Throwable th11) {
                    data2 = new Data(null, th11, data4.getLoading());
                }
                return t1.u(currentState.f223227c, data, data2);
            case 10:
                s it16 = (s) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return (q6c.h) it16.f223227c.getContent();
            case 11:
                Quote it17 = (Quote) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it17);
            case 12:
                s update = (s) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return s.a(update, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, 253951);
            case 13:
                s update2 = (s) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return s.a(update2, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, 253951);
            case 14:
                s update3 = (s) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return s.a(update3, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, 258047);
            case 15:
                i67.a it18 = (i67.a) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return Boolean.valueOf(it18 != i67.a.DISABLED);
            case 16:
                s it19 = (s) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return it19.f223227c;
            case 17:
                s it20 = (s) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return it20.f223227c;
            case 18:
                s update4 = (s) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return s.a(update4, null, null, null, null, null, null, null, null, null, null, null, null, !update4.o, null, null, null, 245759);
            case 19:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return (q6c.h) pair.f186385a;
            case 20:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                return new n0h.b((Links) pair2.f186385a, (hel.b) pair2.f186386b);
            case 21:
                ya0.b it21 = (ya0.b) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return Unit.f186387a;
            case 22:
                Function0 it22 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                nb0 nb0Var = pb0.Companion;
                List listK = v.k(nb0.b(nb0Var, "loading_1", false, 0, false, 30), nb0.b(nb0Var, "loading_2", false, 0, false, 30));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                return listK;
            case 23:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 24:
                ly0.e it23 = (ly0.e) obj2;
                KProperty[] kPropertyArr5 = CardReaderProductDetailsScreen.f60604e0;
                Intrinsics.checkNotNullParameter(it23, "it");
                return Boolean.valueOf(Objects.nonNull(it23));
            case 25:
                ly0.e eVar = (ly0.e) obj2;
                KProperty[] kPropertyArr6 = CardReaderProductDetailsScreen.f60604e0;
                if (eVar == null) {
                    eVar = null;
                }
                yi0.a aVar2 = eVar != null ? eVar.f200629a : null;
                if (aVar2 instanceof CardReaderProductDetailsScreenContract$ProductDetailsWidgetType) {
                    return (CardReaderProductDetailsScreenContract$ProductDetailsWidgetType) aVar2;
                }
                return null;
            case 26:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "OnboardingPlanSelectionFlowModel", "Unable to fetch onboarding free trial offer", error, h0Var);
                return ggk.c.f143706a;
            case 27:
                obc.h update5 = (obc.h) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return obc.h.a(update5, null, "", 1);
            case 28:
                obc.h it24 = (obc.h) obj2;
                Intrinsics.checkNotNullParameter(it24, "it");
                return it24.f223918b;
            default:
                Function0 it25 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it25, "it");
                nb0 nb0Var2 = pb0.Companion;
                List listK2 = v.k(nb0.b(nb0Var2, "CARRIER_LOADING_1", false, 0, false, 20), nb0.b(nb0Var2, "CARRIER_LOADING_2", false, 0, false, 20), nb0.b(nb0Var2, "CARRIER_LOADING_3", false, 0, false, 20));
                yp0.b.k(listK2, 0, 0, 0, 0, 31);
                return listK2;
        }
    }

    public /* synthetic */ b(n nVar, int i) {
        this.f223071a = i;
    }
}
