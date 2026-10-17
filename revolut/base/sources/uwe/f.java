package uwe;

import aw0.n6;
import cli.y;
import com.revolut.camerakit.revolut.ui.barcode.screen.BarcodeReaderScreen;
import com.revolut.feature.apm.core.ui.impl.ui.qr.scanner.QrScannerFlow;
import com.revolut.feature.cash_topup.impl.ui.details.CashTopUpDetailsScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.agreements.common.viewer.CreditApplicationDocumentViewerScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.password_input.PasswordInputScreen;
import com.revolut.feature.freelancer.impl.ui.invoice.settings.screen.InvoiceSettingsScreen;
import com.revolut.feature.image_gallery.screens.grid.ImageGalleryGridScreen;
import com.revolut.feature.incentive_reward.impl.ui.lottery.draw.screen.share.LotteryShareController;
import com.revolut.feature.junior.accounts.impl.ui.junior_selection.JuniorSelectionScreen;
import com.revolut.feature.junior.isa.impl.ui.jisa_national_number_info.JuniorIsaNationalNumberInfo;
import com.revolut.feature.onboarding.impl.onboarding.duplicate_account.DuplicateAccountScreen;
import com.revolut.feature.payments.who_to_transfer.impl.transfer.selection.RecipientSelectionScreen;
import com.revolut.feature.pix.impl.flow.pix_area.screens.pix_area.PixAreaScreen;
import com.revolut.feature.rev_points.api.navigation.RevPointsFlowDestination;
import com.revolut.feature.rev_points.impl.ui.points_expiry.details.RevPointsExpiryDetailsScreen;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.alert_details.SharedAlertDetailsScreen;
import com.revolut.feature.standingordertopup.impl.ui.screen.payment_details.AutoTopUpPaymentDetailsScreen;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.screens.instruments_list.InstrumentsListScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.past_and_cancelled.TravelExperiencesPastAndCancelledScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.price_breakdown.TravelFlightsPriceBreakdownScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.map_preview.TravelHotelsPropertyMapPreviewScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.policies.TravelHotelsPropertyPoliciesScreen;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ExternalDestination;
import ip0.vj0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import kotlinx.coroutines.CoroutineScope;
import nii.n1;
import v44.l;
import v44.n;
import v6l.b0;
import v9f.p;
import vd4.k;
import vdl.h0;
import ved.o;
import vkm.j2;
import zh9.u0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f((g) this.v, continuation, 0);
            case 1:
                return new f((BarcodeReaderScreen) this.v, continuation, 1);
            case 2:
                return new f((AutoTopUpPaymentDetailsScreen) this.v, continuation, 2);
            case 3:
                return new f((InvoiceSettingsScreen) this.v, continuation, 3);
            case 4:
                return new f((RevPointsExpiryDetailsScreen) this.v, continuation, 4);
            case 5:
                return new f((TravelExperiencesPastAndCancelledScreen) this.v, continuation, 5);
            case 6:
                return new f((QrScannerFlow) this.v, continuation, 6);
            case 7:
                return new f((n) this.v, continuation, 7);
            case 8:
                return new f((RecipientSelectionScreen) this.v, continuation, 8);
            case 9:
                return new f((TravelFlightsPriceBreakdownScreen) this.v, continuation, 9);
            case 10:
                return new f((JuniorSelectionScreen) this.v, continuation, 10);
            case 11:
                return new f((g7f.b) this.v, continuation, 11);
            case 12:
                return new f((InstrumentsListScreen) this.v, continuation, 12);
            case 13:
                return new f((p) this.v, continuation, 13);
            case 14:
                return new f((JuniorIsaNationalNumberInfo) this.v, continuation, 14);
            case 15:
                return new f((DuplicateAccountScreen) this.v, continuation, 15);
            case 16:
                return new f((PixAreaScreen) this.v, continuation, 16);
            case 17:
                return new f((CashTopUpDetailsScreen) this.v, continuation, 17);
            case 18:
                return new f((TravelHotelsPropertyMapPreviewScreen) this.v, continuation, 18);
            case 19:
                return new f((PasswordInputScreen) this.v, continuation, 19);
            case 20:
                return new f((ImageGalleryGridScreen) this.v, continuation, 20);
            case 21:
                return new f((TravelHotelsPropertyPoliciesScreen) this.v, continuation, 21);
            case 22:
                return new f((vdl.d) this.v, continuation, 22);
            case 23:
                return new f((vdl.h) this.v, continuation, 23);
            case 24:
                return new f((h0) this.v, continuation, 24);
            case 25:
                return new f((ve1.g) this.v, continuation, 25);
            case 26:
                return new f((SharedAlertDetailsScreen) this.v, continuation, 26);
            case 27:
                return new f((o) this.v, continuation, 27);
            case 28:
                return new f((vd1.a) this.v, continuation, 28);
            default:
                return new f((LotteryShareController) this.v, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((f) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((f) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((f) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((f) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((f) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((f) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((f) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((f) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((f) create((rp0.p) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((f) create((vj0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((f) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((f) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((f) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((f) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((f) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((f) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((f) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((f) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((f) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((f) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((f) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((f) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((f) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((f) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((f) create((ngd.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((f) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v30, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v35, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v47, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v51, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v62, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v66, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v71, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v92, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ArrayList arrayList = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object obj3 = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return pd.b.n(kotlin.coroutines.g.f186406a, new mt8.c(((g) obj3).f283644g, objArr == true ? 1 : 0, 2));
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((BarcodeReaderScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                uxd.h hVar = (uxd.h) ((AutoTopUpPaymentDetailsScreen) obj3).N.getValue();
                hVar.getClass();
                Object uiEvent = uxd.d.f283981a;
                Intrinsics.checkNotNullParameter(uiEvent, "uiEvent");
                if (!uiEvent.equals(uiEvent)) {
                    throw new NoWhenBranchMatchedException();
                }
                hVar.B2();
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((uy6.p) ((InvoiceSettingsScreen) obj3).P.getValue()).B2();
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                uzb.b bVar = (uzb.b) ((uzb.a) ((RevPointsExpiryDetailsScreen) obj3).S.getValue());
                bVar.getClass();
                bVar.C1(new BridgeDestination(u0.f(new RevPointsFlowDestination(new RevPointsFlowDestination.StartType.OpenRedeemHub(false)))));
                return Unit.f186387a;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((v2g.h) ((v2g.f) ((TravelExperiencesPastAndCancelledScreen) obj3).Q.getValue())).B2();
                return Unit.f186387a;
            case 6:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((QrScannerFlow) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 7:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVar = (n) obj3;
                bk0.e eVar = nVar.f285960r;
                CreditApplicationDocumentViewerScreenContract$InputData creditApplicationDocumentViewerScreenContract$InputData = nVar.o;
                return new l((creditApplicationDocumentViewerScreenContract$InputData.d.f66359b && creditApplicationDocumentViewerScreenContract$InputData.e == null) ? r0.p(eVar.a(creditApplicationDocumentViewerScreenContract$InputData.f66989c.f285940a), eVar.e()) : r0.g(), (String) eVar.f().f186386b);
            case 8:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((RecipientSelectionScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 9:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((v6g.f) ((v6g.e) ((TravelFlightsPriceBreakdownScreen) obj3).U.getValue())).B2();
                return Unit.f186387a;
            case 10:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((v78.g) ((v78.c) ((JuniorSelectionScreen) obj3).O.getValue())).v2(u68.d.f277504a);
                return Unit.f186387a;
            case 11:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                v7f.e eVar2 = (v7f.e) ((g7f.b) obj3).f141197h;
                eVar2.X2(eVar2.o, new b0(29));
                return Unit.f186387a;
            case 12:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((p) ((InstrumentsListScreen) obj3).e3()).B2();
                return Unit.f186387a;
            case 13:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                vii.c cVar = ((p) obj3).f287041q;
                Unit unit = Unit.f186387a;
                cVar.b(unit);
                return unit;
            case 14:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((va8.b) ((JuniorIsaNationalNumberInfo) obj3).R.getValue()).B2();
                return Unit.f186387a;
            case 15:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                va9.j jVar = (va9.j) ((va9.g) ((DuplicateAccountScreen) obj3).M.getValue());
                jVar.getClass();
                jVar.C1(new ExternalDestination.Browser("https://help.revolut.com/help/profile-and-plan/log-in-issues/i-think-i-have-a-duplicate-account", null));
                return Unit.f186387a;
            case 16:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((PixAreaScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 17:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((CashTopUpDetailsScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 18:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((TravelHotelsPropertyMapPreviewScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 19:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                k kVar = (k) ((PasswordInputScreen) obj3).O.getValue();
                y yVar = kVar.f287793s;
                String str = ((vd4.e) ((j2) yVar.f22677a).getValue()).f287779c;
                if (str != null && str.length() != 0) {
                    kVar.H2(yVar, new vch.h0(5));
                    kVar.n2(new v06.i(kVar, str, objArr2 == true ? 1 : 0, 22), new whi.b(6));
                }
                return Unit.f186387a;
            case 20:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((vd7.h) ((vd7.f) ((ImageGalleryGridScreen) obj3).P.getValue())).B2();
                return Unit.f186387a;
            case 21:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((vdg.f) ((TravelHotelsPropertyPoliciesScreen) obj3).P.getValue()).B2();
                return Unit.f186387a;
            case 22:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                gdl.c cVar2 = (gdl.c) j6.a.k(gdl.c.class, ((vdl.d) obj3).f287950c, "INVEST_BUY_BLOCK");
                if (cVar2 != null) {
                    return zi0.c.U(cVar2);
                }
                return null;
            case 23:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                List list = (List) p.a.j(jdl.c.class, KTypeProjection.INSTANCE, List.class, ((vdl.h) obj3).f287971b, "INDEXES_CACHE_KEY");
                if (list != null) {
                    List<jdl.c> list2 = list;
                    arrayList = new ArrayList(w.t(list2, 10));
                    for (jdl.c cVar3 : list2) {
                        Intrinsics.checkNotNullParameter(cVar3, "<this>");
                        arrayList.add(new lel.b(cVar3.f173155a, cVar3.f173156b, cVar3.f173157c, cVar3.d, cVar3.e, cVar3.f, cVar3.f173158g, cVar3.f173159h));
                    }
                }
                return arrayList;
            case 24:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                kdl.f fVar = (kdl.f) j6.a.k(kdl.f.class, ((h0) obj3).f287974b, "INDUSTRIES_CACHE_KEY");
                if (fVar != null) {
                    return l9.l.B(fVar);
                }
                return null;
            case 25:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((ve1.g) obj3).u2();
                return Unit.f186387a;
            case 26:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((SharedAlertDetailsScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 27:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j2 j2Var = ((o) obj3).f288287y;
                Object obj4 = new Object();
                j2Var.getClass();
                j2Var.g(null, obj4);
                return Unit.f186387a;
            case 28:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((vd1.a) obj3).invoke();
                return Unit.f186387a;
            default:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((vg7.i) ((vg7.e) ((LotteryShareController) obj3).O.getValue())).B2();
                return Unit.f186387a;
        }
    }
}
