package btd;

import aw0.n6;
import bnj.n;
import btk.h;
import btk.j;
import btk.k;
import bu4.m;
import bw6.l;
import bxg.g;
import c17.s;
import cli.y;
import com.revolut.camerakit.vision_framework.common.DocClassifierResultMapperKt;
import com.revolut.camerakit.vision_framework.common.DocQualityMapperKt;
import com.revolut.camerakit.vision_framework.common.FourCornersResultMapperKt;
import com.revolut.camerakit.vision_framework.common.VisionFaceMapperKt;
import com.revolut.camerakit.vision_framework.common.VisionImageMapperKt;
import com.revolut.camerakit.vision_framework.generated.DocClassifierResult;
import com.revolut.camerakit.vision_framework.generated.DocCornersResult;
import com.revolut.camerakit.vision_framework.generated.DocImageQualityResult;
import com.revolut.camerakit.vision_framework.generated.Face;
import com.revolut.core.ui_kit.models.AppTipUIModel;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.impl.ui.repay.boleto.payment_amount.CreditCardBoletoPaymentAmountScreen;
import com.revolut.feature.credit.card.impl.ui.settings.screen.CreditCardSettingsScreen;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.screen.amount.v2.CryptoCommodityBuyCollectionAmountScreenV2;
import com.revolut.feature.freelancer.impl.ui.ecommerce.manage.shopify.ShopifyManageScreen;
import com.revolut.feature.freelancer.impl.ui.onboarding.validation.OnboardingInputDataValidator$ValidationState;
import com.revolut.feature.profile.api.navigation.ProfileFeatureConfig;
import com.revolut.feature.rev_points.api.provider.RevPointsDisclaimerProvider$Parcel$LearnMore;
import com.revolut.feature.rev_points.buying.impl.ui.screen.main.RevPointsBuyingControllerScreen;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.smart_estimation.bottom_sheet.SmartEstimationBottomSheetController;
import com.revolut.feature.wealth.analytics.insights.ui.indicator.asset.PortfolioInsightsAssetIndicatorController;
import com.revolut.feature.wealth.analytics.insights.ui.indicator.asset.PortfolioInsightsAssetIndicatorControllerContract$Step;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_details.AirportLoungePassDetailsScreen;
import com.revolut.retail.feature.impl.travel_trips.ui.screen.travel_itinerary.add_event.date_picker.TravelItineraryDatePickerScreen;
import com.revolut.retail.feature.trading_onboarding.impl.ui.failed_prompt.GiaOnboardingFailedBottomSheetScreen;
import e10.p;
import e10.q;
import e10.r;
import gim.i;
import ip0.vd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import m1c.f1;
import m1c.g1;
import m1c.h1;
import m1c.i1;
import svi.w;
import vkm.j2;
import vkm.v;
import yhm.o;
import zh9.u0;
import zhm.a1;
import zhm.d0;
import zhm.h0;
import zhm.q0;
import zhm.r0;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f18562w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj2, r rVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
        this.f18562w = rVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e((SmartEstimationBottomSheetController) this.f18562w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            case 1:
                e eVar2 = new e((bte.c) this.f18562w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
            case 2:
                e eVar3 = new e((h) this.f18562w, continuation, 2);
                eVar3.v = obj2;
                return eVar3;
            case 3:
                e eVar4 = new e((k) this.f18562w, continuation, 3);
                eVar4.v = obj2;
                return eVar4;
            case 4:
                e eVar5 = new e((com.revolut.trading.orders.ui.flows.trading_asset_details.a) this.f18562w, continuation, 4);
                eVar5.v = obj2;
                return eVar5;
            case 5:
                e eVar6 = new e((CreditCardBoletoPaymentAmountScreen) this.f18562w, continuation, 5);
                eVar6.v = obj2;
                return eVar6;
            case 6:
                e eVar7 = new e((m) this.f18562w, continuation, 6);
                eVar7.v = obj2;
                return eVar7;
            case 7:
                e eVar8 = new e((CreditCardSettingsScreen) this.f18562w, continuation, 7);
                eVar8.v = obj2;
                return eVar8;
            case 8:
                e eVar9 = new e((bv4.i) this.f18562w, continuation, 8);
                eVar9.v = obj2;
                return eVar9;
            case 9:
                e eVar10 = new e((RevPointsBuyingControllerScreen) this.f18562w, continuation, 9);
                eVar10.v = obj2;
                return eVar10;
            case 10:
                e eVar11 = new e((TravelItineraryDatePickerScreen) this.f18562w, continuation, 10);
                eVar11.v = obj2;
                return eVar11;
            case 11:
                e eVar12 = new e((com.revolut.feature.credit.card.impl.ui.statement_financing.confirmation.a) this.f18562w, continuation, 11);
                eVar12.v = obj2;
                return eVar12;
            case 12:
                e eVar13 = new e((l) this.f18562w, continuation, 12);
                eVar13.v = obj2;
                return eVar13;
            case 13:
                e eVar14 = new e((bwd.c) this.f18562w, continuation, 13);
                eVar14.v = obj2;
                return eVar14;
            case 14:
                e eVar15 = new e((CryptoCommodityBuyCollectionAmountScreenV2) this.f18562w, continuation, 14);
                eVar15.v = obj2;
                return eVar15;
            case 15:
                e eVar16 = new e((ShopifyManageScreen) this.f18562w, continuation, 15);
                eVar16.v = obj2;
                return eVar16;
            case 16:
                e eVar17 = new e((bx6.i) this.f18562w, continuation, 16);
                eVar17.v = obj2;
                return eVar17;
            case 17:
                e eVar18 = new e((PortfolioInsightsAssetIndicatorController) this.f18562w, continuation, 17);
                eVar18.v = obj2;
                return eVar18;
            case 18:
                e eVar19 = new e((com.revolut.feature.wealth.analytics.insights.ui.indicator.asset.a) this.f18562w, continuation, 18);
                eVar19.v = obj2;
                return eVar19;
            case 19:
                e eVar20 = new e((by6.k) this.f18562w, continuation, 19);
                eVar20.v = obj2;
                return eVar20;
            case 20:
                e eVar21 = new e((AirportLoungePassDetailsScreen) this.f18562w, continuation, 20);
                eVar21.v = obj2;
                return eVar21;
            case 21:
                e eVar22 = new e((GiaOnboardingFailedBottomSheetScreen) this.f18562w, continuation, 21);
                eVar22.v = obj2;
                return eVar22;
            case 22:
                e eVar23 = new e((c0c.a) this.f18562w, continuation, 22);
                eVar23.v = obj2;
                return eVar23;
            case 23:
                return new e((c10.a) this.v, (q) this.f18562w, continuation, 23);
            case 24:
                return new e((c10.b) this.v, (q) this.f18562w, continuation, 24);
            case 25:
                return new e((c10.d) this.v, (q) this.f18562w, continuation, 25);
            case 26:
                return new e((c10.d) this.v, (p) this.f18562w, continuation, 26);
            case 27:
                return new e((c10.d) this.v, (r) this.f18562w, continuation, 27);
            case 28:
                return new e((c10.f) this.v, (q) this.f18562w, continuation, 28);
            default:
                e eVar24 = new e((s) this.f18562w, continuation, 29);
                eVar24.v = obj2;
                return eVar24;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((e) create((AppTipUIModel) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((e) create((btk.f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((e) create((btk.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((e) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((e) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((e) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((e) create((yx4.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((e) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((e) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((e) create((vd) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((e) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((e) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((e) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((e) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((e) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((e) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((e) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((e) create((g1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((OnboardingInputDataValidator$ValidationState) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v37, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v67, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v76, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object value;
        Data data;
        g gVar;
        Object gVar2;
        int i = this.u;
        int i2 = 1;
        int i3 = 6;
        int i5 = 23;
        int i6 = 29;
        int i21 = 2;
        int i22 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object obj3 = this.f18562w;
        switch (i) {
            case 0:
                ty0.a aVar = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                Object obj4 = aVar.d;
                String url2 = obj4 instanceof String ? (String) obj4 : null;
                if (url2 != null) {
                    com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.smart_estimation.bottom_sheet.b bVar = (com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.smart_estimation.bottom_sheet.b) ((b) ((SmartEstimationBottomSheetController) obj3).U.getValue());
                    bVar.getClass();
                    Intrinsics.checkNotNullParameter(url2, "url");
                    bVar.n2(new be7.s(bVar, url2, objArr == true ? 1 : 0, i6), new whi.b(i3));
                }
                return Unit.f186387a;
            case 1:
                AppTipUIModel appTipUIModel = (AppTipUIModel) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ate.e eVar = ((bte.c) obj3).f18567b;
                String id10 = appTipUIModel.f57725a;
                Intrinsics.checkNotNullParameter(id10, "appTipId");
                yse.e eVar2 = eVar.f9038b;
                eVar2.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                j2 j2Var = eVar2.e;
                do {
                    value = j2Var.getValue();
                } while (!j2Var.h(value, a1.m((Set) value, id10)));
                return Unit.f186387a;
            case 2:
                btk.f fVar = (btk.f) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((h) obj3).f18633c.Z2(fVar);
                return Unit.f186387a;
            case 3:
                btk.d dVar = (btk.d) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                k kVar = (k) obj3;
                kVar.X2(kVar.f18642q, new btk.i(dVar, i22));
                return Unit.f186387a;
            case 4:
                Data data2 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.trading.orders.ui.flows.trading_asset_details.a aVar7 = (com.revolut.trading.orders.ui.flows.trading_asset_details.a) obj3;
                aVar7.H2(aVar7.f106828t, new bmj.g(data2, 18));
                return Unit.f186387a;
            case 5:
                Object obj5 = this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                m mVar = (m) ((CreditCardBoletoPaymentAmountScreen) obj3).N.getValue();
                yx4.a aVar9 = yx4.b.Companion;
                Intrinsics.h(obj5);
                aVar9.getClass();
                yx4.b event = yx4.a.a(obj5);
                mVar.getClass();
                y yVar = mVar.f18685r;
                Intrinsics.checkNotNullParameter(event, "event");
                String str = event.f317544a;
                switch (str.hashCode()) {
                    case -1661376363:
                        if (str.equals("id_min_repayment_amount")) {
                            mVar.H2(yVar, new n(mVar, mVar.I2().f144558b, i5));
                        }
                        break;
                    case -1420998708:
                        if (str.equals("id_statement_amount")) {
                            mVar.H2(yVar, new n(mVar, mVar.I2().f144559c, i5));
                        }
                        break;
                    case -262808349:
                        if (str.equals("id_total_repayment_amount")) {
                            mVar.H2(yVar, new n(mVar, mVar.I2().d, i5));
                        }
                        break;
                    case -134523289:
                        if (str.equals("id_generate_boleto")) {
                            w80.b bVar2 = mVar.f18683p;
                            String str2 = ((bu4.a) ((j2) yVar.f22677a).getValue()).f18671b;
                            if (str2 == null) {
                                str2 = "";
                            }
                            mVar.n2(new j(mVar, new dj0.d(bVar2.b(str2, mVar.I2().f144557a.f306286a), mVar.I2().f144557a), objArr2 == true ? 1 : 0, i2), new whi.b(i3));
                        }
                        break;
                    case 1918729248:
                        if (str.equals("ERROR_STATE_ID")) {
                            mVar.n2(new aza.g(mVar, objArr3 == true ? 1 : 0, i6), new whi.b(i3));
                        }
                        break;
                }
                return Unit.f186387a;
            case 6:
                Data data3 = (Data) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                m mVar2 = (m) obj3;
                mVar2.H2(mVar2.f18685r, new bmj.g(data3, 19));
                return Unit.f186387a;
            case 7:
                yx4.b event2 = (yx4.b) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                bv4.i iVar = (bv4.i) ((CreditCardSettingsScreen) obj3).R.getValue();
                iVar.getClass();
                Intrinsics.checkNotNullParameter(event2, "event");
                if (event2.f317545b instanceof bv4.f) {
                    iVar.C2(bv4.e.f18961a);
                } else if (Intrinsics.f(event2.f317544a, "ERROR_STATE_ID")) {
                    iVar.n2(new bv4.h(iVar, objArr4 == true ? 1 : 0, i22), new whi.b(i3));
                }
                return Unit.f186387a;
            case 8:
                Data data4 = (Data) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                bv4.i iVar2 = (bv4.i) obj3;
                iVar2.H2(iVar2.f18966q, new bmj.g(data4, 20));
                return Unit.f186387a;
            case 9:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                bvb.k kVarM3 = ((RevPointsBuyingControllerScreen) obj3).m3();
                Intrinsics.h(clickData);
                bvb.r rVar = (bvb.r) kVarM3;
                rVar.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                if (Intrinsics.f(clickData.d, RevPointsDisclaimerProvider$Parcel$LearnMore.f83547a)) {
                    rVar.l2(new bv4.h(rVar, objArr5 == true ? 1 : 0, i2), new yi5.b(26));
                }
                return Unit.f186387a;
            case 10:
                vd clickData2 = (vd) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                bvj.f fVar2 = (bvj.f) ((TravelItineraryDatePickerScreen) obj3).Q.getValue();
                Intrinsics.h(clickData2);
                fVar2.getClass();
                Intrinsics.checkNotNullParameter(clickData2, "clickData");
                fVar2.H2(fVar2.o, new aae.e(clickData2, 2));
                return Unit.f186387a;
            case 11:
                Data data5 = (Data) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.credit.card.impl.ui.statement_financing.confirmation.a aVar16 = (com.revolut.feature.credit.card.impl.ui.statement_financing.confirmation.a) obj3;
                aVar16.H2(aVar16.z, new bmj.g(data5, 22));
                return Unit.f186387a;
            case 12:
                Data data6 = (Data) this.v;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l lVar = (l) obj3;
                lVar.H2(lVar.f19256q, new bmj.g(data6, i5));
                return Unit.f186387a;
            case 13:
                String str3 = (String) this.v;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                owd.a aVar19 = (owd.a) j6.a.k(owd.a.class, ((bwd.c) obj3).f19321c, bwd.c.a(str3));
                if (aVar19 == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(aVar19, "<this>");
                return new vtd.d(mo3.a.o(aVar19.getThisMonth()), mo3.a.o(aVar19.getAllTime()));
            case 14:
                String editedAmount = (String) this.v;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                zw5.n nVar = (zw5.n) ((CryptoCommodityBuyCollectionAmountScreenV2) obj3).T2();
                nVar.getClass();
                Intrinsics.checkNotNullParameter(editedAmount, "editedAmount");
                zw5.n.A2(nVar, null, null, new dj0.d(nVar.f325747s.b(editedAmount, ((zw5.a) nVar.t2()).f325724a.f115083b.f306286a), ((zw5.a) nVar.t2()).f325724a.f115083b), null, null, 27);
                return Unit.f186387a;
            case 15:
                ty0.a aVar21 = (ty0.a) this.v;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                bx6.e eVarE3 = ((ShopifyManageScreen) obj3).d();
                String id11 = aVar21.f275445a;
                bx6.i iVar3 = (bx6.i) eVarE3;
                iVar3.getClass();
                Intrinsics.checkNotNullParameter(id11, "id");
                if (Intrinsics.f(id11, "LIST_ID_FREELANCER_TERMS_CLICKABLE_PART")) {
                    iVar3.C1(u0.c(ProfileFeatureConfig.Terms.f81349a));
                }
                return Unit.f186387a;
            case 16:
                Data data7 = (Data) this.v;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                bx6.i iVar4 = (bx6.i) obj3;
                iVar4.H2(iVar4.f19505s, new bmj.g(data7, 25));
                return Unit.f186387a;
            case 17:
                String listId = (String) this.v;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                bxg.f fVarE3 = ((PortfolioInsightsAssetIndicatorController) obj3).R2();
                Intrinsics.h(listId);
                com.revolut.feature.wealth.analytics.insights.ui.indicator.asset.a aVar25 = (com.revolut.feature.wealth.analytics.insights.ui.indicator.asset.a) fVarE3;
                aVar25.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                if (listId.equals("ASSET_INDICATOR_INFO_ICON_LIST_ID") && (data = ((bxg.h) ((j2) aVar25.f95030t.f22677a).getValue()).f19688a) != null && (gVar = (g) data.getContent()) != null) {
                    oki.h.v2(aVar25.u, new PortfolioInsightsAssetIndicatorControllerContract$Step.InfoStep(gVar.e), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
                return Unit.f186387a;
            case 18:
                Data data8 = (Data) this.v;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.wealth.analytics.insights.ui.indicator.asset.a aVar27 = (com.revolut.feature.wealth.analytics.insights.ui.indicator.asset.a) obj3;
                aVar27.H2(aVar27.f95030t, new bmj.g(data8, 28));
                return Unit.f186387a;
            case 19:
                Data data9 = (Data) this.v;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                by6.k kVar2 = (by6.k) obj3;
                kVar2.H2(kVar2.f19757q, new bmj.g(data9, i6));
                return Unit.f186387a;
            case 20:
                String menuItemId = (String) this.v;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                byi.f fVar3 = (byi.f) ((AirportLoungePassDetailsScreen) obj3).Q.getValue();
                Intrinsics.h(menuItemId);
                com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_details.b bVar3 = (com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_details.b) fVar3;
                bVar3.getClass();
                Intrinsics.checkNotNullParameter(menuItemId, "menuItemId");
                if (menuItemId.equals("ID_MENU_ITEM_SETTINGS")) {
                    y yVar2 = bVar3.f99130t;
                    j2 j2Var2 = (j2) yVar2.f22677a;
                    j2 j2Var3 = (j2) yVar2.f22677a;
                    svi.k kVar3 = (svi.k) ((byi.d) j2Var2.getValue()).f19827c.getContent();
                    if (kVar3 == null) {
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "AirportLoungesPassDetailsScreenModel", "Can't launch help dialog: no pass data in the screen state", null, h0Var);
                    } else {
                        String str4 = (String) ((byi.d) j2Var3.getValue()).f.getContent();
                        if (str4 == null) {
                            h0 h0Var2 = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, "AirportLoungesPassDetailsScreenModel", "Can't launch help dialog: no terms and conditions url in the screen state", null, h0Var2);
                        } else {
                            bVar3.C2(new byi.e(kVar3, str4, (w) ((byi.d) j2Var3.getValue()).e.getContent()));
                        }
                    }
                }
                return Unit.f186387a;
            case 21:
                n6 n6Var = (n6) this.v;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                bzk.k kVar4 = (bzk.k) ((GiaOnboardingFailedBottomSheetScreen) obj3).R.getValue();
                Object obj6 = n6Var.k;
                kVar4.getClass();
                bzk.g gVar3 = obj6 instanceof bzk.g ? (bzk.g) obj6 : null;
                if (gVar3 == null) {
                    CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                    rd0.d.b(rd0.c.WARNING, "GiaOnboardingFailedBottomSheetScreenModel", a0.d.m(obj6, "unsupported parcel = "), null, null, 16);
                } else if (gVar3.equals(bzk.e.f20051a)) {
                    kVar4.C2(bzk.b.f20049a);
                } else {
                    if (!gVar3.equals(bzk.f.f20052a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    kVar4.C2(bzk.c.f20050a);
                }
                return Unit.f186387a;
            case 22:
                g1 g1Var = (g1) this.v;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ArrayList arrayList = g1Var.f201366a;
                int iB = q0.b(zhm.w.t(arrayList, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (Object obj7 : arrayList) {
                    linkedHashMap.put(((h1) obj7).f201375a, obj7);
                }
                EnumEntries enumEntriesA = i1.a();
                c0c.a aVar32 = (c0c.a) obj3;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(enumEntriesA, 10));
                Iterator<E> it8 = enumEntriesA.iterator();
                while (true) {
                    int i32 = 9;
                    if (!it8.hasNext()) {
                        return arrayList2.isEmpty() ? new go.g(new Data(r0.g(), null, false, 6, null), 2) : new ag1.k((Flow[]) d0.d1(arrayList2).toArray(new Flow[0]), i32);
                    }
                    i1 i1Var = (i1) it8.next();
                    phm.a aVar33 = (phm.a) aVar32.f20204b.get(i1Var);
                    c0c.b bVar4 = aVar33 != null ? (c0c.b) aVar33.get() : null;
                    if (bVar4 == null) {
                        IllegalStateException illegalStateException = new IllegalStateException("Product source not found for " + i1Var);
                        h0 h0Var3 = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var3);
                    }
                    if (bVar4 != null) {
                        f1 f1VarB = i1Var.b();
                        gVar2 = rd0.e.e(new v(bVar4.a(f1VarB != null ? (h1) linkedHashMap.get(f1VarB) : null), new a35.j(i21, i32, objArr7 == true ? 1 : 0)), h0.f322473a, new a35.k(3, i6, objArr6 == true ? 1 : 0));
                    } else {
                        od0.i.Companion.getClass();
                        gVar2 = new go.g(od0.i.f224256b, 2);
                    }
                    arrayList2.add(gVar2);
                }
                break;
            case 23:
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                DocClassifierResult docClassifierResultDetect = ((c10.a) this.v).f20305a.detect(VisionImageMapperKt.toFrameworkImage((q) obj3));
                Intrinsics.checkNotNullExpressionValue(docClassifierResultDetect, "detect(...)");
                return DocClassifierResultMapperKt.toVisionDocClassifierResult(docClassifierResultDetect);
            case 24:
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                DocImageQualityResult docImageQualityResultValidate = ((c10.b) this.v).f20307a.validate(VisionImageMapperKt.toFrameworkImage((q) obj3));
                Intrinsics.checkNotNullExpressionValue(docImageQualityResultValidate, "validate(...)");
                return DocQualityMapperKt.toVisionDocQualityResult(docImageQualityResultValidate);
            case 25:
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ArrayList<Face> arrayListDetectFaces = ((c10.d) this.v).f20310a.detectFaces(VisionImageMapperKt.toFrameworkImage((q) obj3));
                Intrinsics.checkNotNullExpressionValue(arrayListDetectFaces, "detectFaces(...)");
                ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayListDetectFaces, 10));
                for (Face face : arrayListDetectFaces) {
                    Intrinsics.h(face);
                    arrayList3.add(VisionFaceMapperKt.toVisionFace(face));
                }
                return arrayList3;
            case 26:
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ArrayList<Float> arrayListExtractFaceEmbedding = ((c10.d) this.v).f20310a.extractFaceEmbedding(VisionImageMapperKt.toFrameworkImage((p) obj3));
                Intrinsics.checkNotNullExpressionValue(arrayListExtractFaceEmbedding, "extractFaceEmbedding(...)");
                return d0.a1(arrayListExtractFaceEmbedding);
            case 27:
                fim.a aVar38 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return ((c10.d) this.v).f20310a.preprocessFace(VisionImageMapperKt.toFrameworkImage((r) obj3));
            case 28:
                fim.a aVar39 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                DocCornersResult docCornersResultDetect = ((c10.f) this.v).f20314a.detect(VisionImageMapperKt.toFrameworkImage((q) obj3));
                Intrinsics.checkNotNullExpressionValue(docCornersResultDetect, "detect(...)");
                return FourCornersResultMapperKt.toVisionFourCornersResult(docCornersResultDetect);
            default:
                OnboardingInputDataValidator$ValidationState onboardingInputDataValidator$ValidationState = (OnboardingInputDataValidator$ValidationState) this.v;
                fim.a aVar40 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                s sVar = (s) obj3;
                sVar.H2(sVar.u, new c17.q(onboardingInputDataValidator$ValidationState, 0));
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f18562w = obj2;
    }
}
