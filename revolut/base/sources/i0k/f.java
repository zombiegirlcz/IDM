package i0k;

import androidx.compose.foundation.layout.WindowInsetsHolder;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.data.network.models.transfer.mapper.ExchangeResultMapperKt;
import com.revolut.feature.card_order_new.common.setpin.kompot.SetPinController;
import com.revolut.feature.credit.card.models.CreditCard;
import com.revolut.feature.freelancer.common.models.sale.FreelancerSalesFilters$CompoundFreelancerSalesFilter;
import com.revolut.feature_exchange.impl.ui.exchange_v2.market_order.MarketOrderActivityV2;
import com.revolut.feature_exchange.impl.ui.exchange_v2.market_order.MarketOrderContractV2$Parcel$GotItDialogParcel;
import com.youTransactor.uCube.rpc.Constants;
import i13.i;
import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.MatchResult;
import kotlin.text.d0;
import org.bouncycastle.asn1.eac.CertificateBody;
import xhf.d1;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f157419a;

    public /* synthetic */ f(int i) {
        this.f157419a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        boolean z = false;
        z = false;
        z = false;
        Object obj3 = null;
        switch (this.f157419a) {
            case 0:
                h0k.f it8 = (h0k.f) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return d0k.b.c(it8);
            case 1:
                h0k.f it9 = (h0k.f) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return d0k.b.c(it9);
            case 2:
                h0k.f it10 = (h0k.f) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return d0k.b.c(it10);
            case 3:
                h0k.c it11 = (h0k.c) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return d0k.b.a(it11);
            case 4:
                return ((WindowInsetsHolder) obj2).getNavigationBars();
            case 5:
                return ((WindowInsetsHolder) obj2).getStatusBars();
            case 6:
                Pair pair = (Pair) obj2;
                KProperty[] kPropertyArr = SetPinController.R;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                String str = (String) pair.f186385a;
                String str2 = (String) pair.f186386b;
                if ((str == null || d0.W(str)) && str2 != null && !d0.W(str2)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 7:
                i update = (i) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return i.a(update, false, false, null, 11);
            case 8:
                i update2 = (i) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return i.a(update2, false, false, null, 13);
            case 9:
                return i.a((i) obj2, true, true, null, 9);
            case 10:
                return i.a((i) obj2, true, false, null, 13);
            case 11:
                return i.a((i) obj2, true, false, null, 13);
            case 12:
                return i.a((i) obj2, true, false, null, 13);
            case 13:
                rlm.f Json = (rlm.f) obj2;
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                Json.f255101c = true;
                return Unit.f186387a;
            case 14:
                Intrinsics.checkNotNullParameter((MatchResult) obj2, "it");
                return "%s";
            case 15:
                i1e.g updateState = (i1e.g) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return i1e.g.a(updateState, null, !updateState.f157617b, null, 5);
            case 16:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return Boolean.FALSE;
            case 17:
                LargeActionButtonDelegate.Model it12 = (LargeActionButtonDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return Boolean.valueOf(Intrinsics.f(it12.f52613a, "LIMIT_EXCEEDED_DIALOG_BUTTON_ID"));
            case 18:
                return ExchangeResultMapperKt.toExchangeLogString$lambda$0((d1) obj2);
            case 19:
                List facilities = (List) obj2;
                Intrinsics.checkNotNullParameter(facilities, "facilities");
                Iterator it13 = facilities.iterator();
                while (true) {
                    if (it13.hasNext()) {
                        Object next = it13.next();
                        if (((CreditCard) next).f69800n == yw4.h.SECURED) {
                            obj3 = next;
                        }
                    }
                }
                od0.i.Companion.getClass();
                return od0.h.a((CreditCard) obj3);
            case 20:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return f0.f322471a;
            case 21:
                com.revolut.feature.freelancer.impl.ui.sales.order_init_page.list.a update3 = (com.revolut.feature.freelancer.impl.ui.sales.order_init_page.list.a) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                com.revolut.feature.freelancer.impl.ui.sales.order_init_page.list.a.Companion.getClass();
                return com.revolut.feature.freelancer.impl.ui.sales.order_init_page.list.a.a(update3, null, com.revolut.feature.freelancer.impl.ui.sales.order_init_page.list.a.f74189g, null, false, false, 17);
            case 22:
                FreelancerSalesFilters$CompoundFreelancerSalesFilter updateFilters = (FreelancerSalesFilters$CompoundFreelancerSalesFilter) obj2;
                Intrinsics.checkNotNullParameter(updateFilters, "$this$updateFilters");
                return FreelancerSalesFilters$CompoundFreelancerSalesFilter.a(updateFilters, f0.f322471a, null, null, null, null, null, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION);
            case 23:
                FreelancerSalesFilters$CompoundFreelancerSalesFilter updateFilters2 = (FreelancerSalesFilters$CompoundFreelancerSalesFilter) obj2;
                Intrinsics.checkNotNullParameter(updateFilters2, "$this$updateFilters");
                return FreelancerSalesFilters$CompoundFreelancerSalesFilter.a(updateFilters2, null, null, null, null, null, null, null, 239);
            case 24:
                FreelancerSalesFilters$CompoundFreelancerSalesFilter updateFilters3 = (FreelancerSalesFilters$CompoundFreelancerSalesFilter) obj2;
                Intrinsics.checkNotNullParameter(updateFilters3, "$this$updateFilters");
                return FreelancerSalesFilters$CompoundFreelancerSalesFilter.a(updateFilters3, null, null, null, null, null, null, null, 159);
            case 25:
                FreelancerSalesFilters$CompoundFreelancerSalesFilter updateFilters4 = (FreelancerSalesFilters$CompoundFreelancerSalesFilter) obj2;
                Intrinsics.checkNotNullParameter(updateFilters4, "$this$updateFilters");
                return FreelancerSalesFilters$CompoundFreelancerSalesFilter.a(updateFilters4, null, null, null, null, null, null, h0.f322473a, CertificateBody.profileType);
            case 26:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 27:
                ArrayList arrayListP = kii.e.p((Function0) obj2, "<unused var>", 5);
                for (int i = 0; i < 5; i++) {
                    arrayListP.add(nb0.b(pb0.Companion, a0.d.n("ASSET_CASH_SELECTION_LOADING_ITEM_ID_", i), false, 0, false, 30));
                }
                yp0.b.k(arrayListP, 0, 0, 0, 0, 31);
                return arrayListP;
            case 28:
                nqi.a it14 = (nqi.a) obj2;
                KProperty[] kPropertyArr2 = MarketOrderActivityV2.I0;
                Intrinsics.checkNotNullParameter(it14, "it");
                return it14.f218468b;
            default:
                LargeActionButtonDelegate.Model it15 = (LargeActionButtonDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                Object obj4 = it15.i;
                if (obj4 instanceof MarketOrderContractV2$Parcel$GotItDialogParcel) {
                    return (MarketOrderContractV2$Parcel$GotItDialogParcel) obj4;
                }
                return null;
        }
    }
}
