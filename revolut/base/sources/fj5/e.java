package fj5;

import aw0.y4;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.gg;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.delegates.pe;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.crypto.qr.parser.impl.ui.scanner.CryptoQrScannerControllerContract$ProcessingState;
import com.revolut.feature.insurance.api.models.InsuranceDocumentsAvailability;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.shops.api.model.ShopsAuction;
import com.revolut.feature.shops.api.model.ShopsContext;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_billing.EsimMobilePlanBillingScreen;
import dej.t1;
import fjd.o;
import fjj.k;
import fk4.j;
import h30.l;
import ip0.ah0;
import ip0.bo0;
import ip0.gu;
import ip0.nb0;
import ip0.nf0;
import ip0.of0;
import ip0.pb0;
import ip0.s7;
import ip0.u40;
import ip0.v4;
import ip0.w4;
import ip0.za0;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import jid.t;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import mid.d0;
import mid.m;
import mid.n;
import zhm.a0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135539a;

    public /* synthetic */ e(int i) {
        this.f135539a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ShopsAuction.Offer offer;
        ZonedDateTime zonedDateTime;
        switch (this.f135539a) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return (xq2.a) pair.f186385a;
            case 1:
                b update = (b) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.getClass();
                CryptoQrScannerControllerContract$ProcessingState.Processing processingState = CryptoQrScannerControllerContract$ProcessingState.Processing.f70902a;
                Intrinsics.checkNotNullParameter(processingState, "processingState");
                return new b(processingState);
            case 2:
                b update2 = (b) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                update2.getClass();
                CryptoQrScannerControllerContract$ProcessingState.Finished processingState2 = CryptoQrScannerControllerContract$ProcessingState.Finished.f70901a;
                Intrinsics.checkNotNullParameter(processingState2, "processingState");
                return new b(processingState2);
            case 3:
                b it8 = (b) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.f135535a;
            case 4:
                b update3 = (b) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                update3.getClass();
                CryptoQrScannerControllerContract$ProcessingState.Detecting processingState3 = CryptoQrScannerControllerContract$ProcessingState.Detecting.f70899a;
                Intrinsics.checkNotNullParameter(processingState3, "processingState");
                return new b(processingState3);
            case 5:
                ti7.f it9 = (ti7.f) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                if (!pd.b.j(it9.f271433a != null ? Boolean.valueOf(!r2.isEmpty()) : null)) {
                    return InsuranceDocumentsAvailability.Unavailable.f74931a;
                }
                List list = it9.f271433a;
                if (list == null) {
                    list = f0.f322471a;
                }
                return new InsuranceDocumentsAvailability.ReviewRequired(!cp5.c.l(list).isEmpty());
            case 6:
                o domainState = (o) obj2;
                Intrinsics.checkNotNullParameter(domainState, "domainState");
                m mVar = (m) domainState.f135580a.getContent();
                if (mVar == null) {
                    return null;
                }
                ArrayList arrayList = mVar.f205726a;
                ArrayList arrayList2 = new ArrayList();
                Iterator it10 = arrayList.iterator();
                while (it10.hasNext()) {
                    a0.x(((n) it10.next()).d, arrayList2);
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it11 = arrayList2.iterator();
                while (it11.hasNext()) {
                    ShopsContext shopsContextA = ((d0) it11.next()).f205692b.a();
                    ShopsAuction shopsAuction = shopsContextA instanceof ShopsAuction ? (ShopsAuction) shopsContextA : null;
                    Instant instant = (shopsAuction == null || (offer = shopsAuction.f87010a) == null || (zonedDateTime = offer.f87016b) == null) ? null : zonedDateTime.toInstant();
                    if (instant != null) {
                        arrayList3.add(instant);
                    }
                }
                return (Instant) zhm.d0.u0(arrayList3);
            case 7:
                o update4 = (o) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return o.a(update4, null, null, null, null, null, null, null, null, null, false, null, null, null, 0L, 15359);
            case 8:
                return o.a((o) obj2, null, null, null, null, null, null, null, null, null, false, null, null, null, 0L, 15359);
            case 9:
                return o.a((o) obj2, null, t.a.f174453a, null, null, null, null, null, null, null, false, null, null, null, 0L, 16381);
            case 10:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                v4 v4Var = new v4("SHOPS_COMBINED_LOADING_LAYOUT_PREMIUM_CAROUSEL", w4.SQUARE, 60);
                yp0.b.l(v4Var, 0, 0, 0, 0, null, false, 63);
                gu guVar = new gu("SHOPS_COMBINED_LOADING_LAYOUT_GRID_SECTION_SUB_HEADER", 0, 0, 30);
                ArrayList arrayList4 = new ArrayList(12);
                for (int i = 0; i < 12; i++) {
                    arrayList4.add(new pe(a0.d.n("SHOPS_COMBINED_LOADING_LAYOUT_GRID_SECTION_ID_", i)));
                }
                za0 za0Var = new za0("SHOPS_COMBINED_LOADING_LAYOUT_GRID_SECTION", arrayList4);
                yp0.b.l(za0Var, 0, 0, 0, 0, null, false, 63);
                gu guVar2 = new gu("SHOPS_COMBINED_LOADING_LAYOUT_CAROUSEL_SECTION_SUB_HEADER", 0, 0, 30);
                ArrayList arrayList5 = new ArrayList(3);
                for (int i2 = 0; i2 < 3; i2++) {
                    nf0 nf0Var = new nf0(a0.d.n("SHOPS_COMBINED_LOADING_LAYOUT_CAROUSEL_SECTION_ID_", i2), of0.PURPLE);
                    yp0.b.l(nf0Var, 0, 0, 0, 0, null, false, 63);
                    arrayList5.add(nf0Var);
                }
                return v.k(v4Var, guVar, za0Var, guVar2, new hg("SHOPS_COMBINED_LOADING_LAYOUT_CAROUSEL_SECTION", arrayList5, 2, new y4(hjd.d.f152707c), null, gg.a.f54220a, false, false, null, null, 0, 0, 0, 0, 32720));
            case 11:
                IntRange intRangeU = t61.a.u((Function0) obj2, "it", 0, 1, 1);
                ArrayList arrayList6 = new ArrayList(w.t(intRangeU, 10));
                vim.f it12 = intRangeU.iterator();
                while (it12.f289625c) {
                    bo0 bo0Var = new bo0(a0.d.n("SHOPS_COMBINED_DISCOVER_MORE_LOADING_ITEM_ID_", it12.nextInt()));
                    int i3 = R$attr.uikit_dp0;
                    yp0.b.l(bo0Var, i3, i3, i3, i3, null, false, 48);
                    arrayList6.add(new ah0("SHOPS_COMBINED_DISCOVER_MORE_LOADING_GRID", bo0Var, false));
                }
                return arrayList6;
            case 12:
                KProperty[] kPropertyArr = EsimMobilePlanBillingScreen.U;
                Object obj3 = ((RowDelegate.Model) obj2).u;
                if (obj3 instanceof dj0.d) {
                    return (dj0.d) obj3;
                }
                return null;
            case 13:
                RowDelegate.Model model = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr2 = EsimMobilePlanBillingScreen.U;
                Intrinsics.checkNotNullParameter(model, "model");
                return Boolean.valueOf(Intrinsics.f(model.f53228a, "ID_PAYMENTS_ITEM"));
            case 14:
                RowDelegate.Model model2 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr3 = EsimMobilePlanBillingScreen.U;
                Intrinsics.checkNotNullParameter(model2, "model");
                return Boolean.valueOf(Intrinsics.f(model2.f53228a, "ID_INVOICES_ITEM"));
            case 15:
                RowDelegate.Model model3 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr4 = EsimMobilePlanBillingScreen.U;
                Intrinsics.checkNotNullParameter(model3, "model");
                return Boolean.valueOf(Intrinsics.f(model3.f53228a, "ID_PAY_WITH_REV_POINTS_ITEM"));
            case 16:
                RowDelegate.Model model4 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr5 = EsimMobilePlanBillingScreen.U;
                Intrinsics.checkNotNullParameter(model4, "model");
                return Boolean.valueOf(Intrinsics.f(model4.f53228a, "ID_PAY_WITH_REV_POINTS_ITEM"));
            case 17:
                RowDelegate.Model model5 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr6 = EsimMobilePlanBillingScreen.U;
                Intrinsics.checkNotNullParameter(model5, "model");
                return Boolean.valueOf(Intrinsics.f(model5.f53228a, "PAYMENT_METHOD_PAYMENT_METHODS_LIST_ID"));
            case 18:
                InputDisclosureDelegate.Model model6 = (InputDisclosureDelegate.Model) obj2;
                KProperty[] kPropertyArr7 = EsimMobilePlanBillingScreen.U;
                Intrinsics.checkNotNullParameter(model6, "model");
                return Boolean.valueOf(Intrinsics.f(model6.f52539a, "ID_CANCEL_PLAN_ITEM"));
            case 19:
                CellDetailsChevronDelegate.Model model7 = (CellDetailsChevronDelegate.Model) obj2;
                KProperty[] kPropertyArr8 = EsimMobilePlanBillingScreen.U;
                Intrinsics.checkNotNullParameter(model7, "model");
                return Boolean.valueOf(Intrinsics.f(model7.f51822a, "ID_CHANGE_MOBILE_PLAN"));
            case 20:
                KProperty[] kPropertyArr9 = EsimMobilePlanBillingScreen.U;
                Object obj4 = ((CellDetailsChevronDelegate.Model) obj2).e;
                if (obj4 instanceof t1) {
                    return (t1) obj4;
                }
                return null;
            case 21:
                k update5 = (k) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return k.a(update5, null, null, false, null, new Data(Optional.empty(), null, false, 6, null), 15);
            case 22:
                od0.i optionalPaymentMethod = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(optionalPaymentMethod, "optionalPaymentMethod");
                PaymentMethod paymentMethod = (PaymentMethod) optionalPaymentMethod.g();
                if (paymentMethod != null) {
                    PaymentMethod.Pocket pocket = (PaymentMethod.Pocket) (!(paymentMethod instanceof PaymentMethod.Pocket) ? null : paymentMethod);
                    if (pocket != null) {
                        return pocket;
                    }
                }
                throw new IllegalStateException(l.r("Unable to get default pocket. Default payment method type is: ", paymentMethod != null ? edl.a.j(paymentMethod) : null));
            case 23:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                nb0 nb0Var = pb0.Companion;
                List listK = v.k(nb0.a(nb0Var, "loadingItemId1", false, 6), nb0.a(nb0Var, "loadingItemId2", false, 6), nb0.a(nb0Var, "loadingItemId3", false, 6));
                int i5 = 0;
                boolean z = false;
                yp0.b.k(listK, 0, R$attr.uikit_dp16, 0, 0, 29);
                gu guVar3 = new gu("ID_POCKET_SUBHEADER_ITEM", 0, 0, 30);
                int i6 = R$attr.uikit_dp8;
                int i21 = R$attr.uikit_dp0;
                yp0.b.p(guVar3, i6, i21, i21, i21);
                pb0 pb0VarB = nb0.b(nb0Var, "PAYMENT_METHOD_PAYMENT_METHODS_LIST_ID", false, 0, false, 30);
                yp0.b.l(pb0VarB, R$attr.uikit_dp4, 0, 0, 0, null, false, 62);
                qv0.k kVar = null;
                int i22 = 0;
                int i32 = 0;
                int i33 = 0;
                ArrayList arrayListE0 = zhm.d0.E0(u.c(new s7("ID_CHANGE_MOBILE_PLAN", i22, i32, i5, i33, z, kVar, 126)), zhm.d0.E0(v.k(guVar3, pb0VarB), listK));
                List listC = u.c(new s7("ID_CANCEL_PLAN_ITEM", i22, i32, i5, i33, z, kVar, 94));
                yp0.b.k(listC, 0, 0, 0, 0, 31);
                return zhm.d0.E0(listC, arrayListE0);
            case 24:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new j((List) getDefaultLoadingItems.invoke());
            case 25:
                IntRange intRangeU2 = t61.a.u((Function0) obj2, "it", 1, 4, 1);
                ArrayList arrayList7 = new ArrayList(w.t(intRangeU2, 10));
                vim.f it13 = intRangeU2.iterator();
                while (it13.f289625c) {
                    arrayList7.add(new u40(a0.d.n("id_loading_", it13.nextInt())));
                }
                yp0.b.k(arrayList7, 0, 0, 0, 0, 31);
                return arrayList7;
            case 26:
                e0h.a it14 = (e0h.a) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return Optional.of(it14);
            case 27:
                fkh.e update6 = (fkh.e) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return fkh.e.a(update6, null, new Data(Optional.empty(), null, false, 6, null), Boolean.FALSE, null, 9);
            case 28:
                fkh.e update7 = (fkh.e) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                return fkh.e.a(update7, null, null, Boolean.valueOf(!(update7.f135829c != null ? r1.booleanValue() : false)), null, 11);
            default:
                fkh.e update8 = (fkh.e) obj2;
                Intrinsics.checkNotNullParameter(update8, "$this$update");
                return fkh.e.a(update8, null, null, null, Boolean.valueOf(!(update8.d != null ? r1.booleanValue() : false)), 7);
        }
    }

    public /* synthetic */ e(cli.n nVar, int i) {
        this.f135539a = i;
    }
}
