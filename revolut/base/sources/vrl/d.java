package vrl;

import com.revolut.core.mobile_services.impl.map.GmsLatLngBounds;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.card.view_pin.ui.screen.old_or_new_pin_dialog.OldOrNewPinDialogScreen;
import com.revolut.feature.card_label.ui.screen.card_label_screen.CardLabelScreen;
import com.revolut.feature.freelancer.api.terms.FreelancerTerms;
import com.revolut.feature.freelancer.impl.ui.profile.terms.FreelancerTermsScreen;
import com.revolut.feature.html_viewer.api.declaration.HtmlDocumentDescriptor;
import com.revolut.feature.html_viewer.api.declaration.HtmlViewerDestination;
import com.revolut.feature.kyc.api.R$string;
import com.revolut.feature.kyc.impl.fourthline.screen.FourthlineViewController;
import com.revolut.feature.location.api.domain.models.location.LocationDomain;
import com.revolut.feature.payments.profile.impl.ui_kompot.flow.PaymentProfileFlow;
import com.revolut.feature.payments.splitbill.impl.ui_new.manage_split.RecurringPaymentsManageSplitContract$ModalStep;
import com.revolut.feature.payments.splitbill.impl.ui_new.manage_split.RecurringPaymentsManageSplitScreen;
import com.revolut.feature.retail.cfd.impl.flows.order.CfdOrderData;
import com.revolut.feature.revolut_shop.ui.screen.checkout.CheckoutScreen;
import com.revolut.feature.security_hub.api.models.StreetModeTrustedLocation;
import com.revolut.feature.security_hub.impl.ui.linked_wallets.host.LinkedWalletsScreen;
import com.revolut.feature.security_hub.impl.ui.street_mode.set_trusted_location.SetTrustedLocationScreen;
import com.revolut.feature.security_hub.impl.ui.street_mode.set_trusted_location.SetTrustedLocationScreenContract$InputData;
import com.revolut.feature.security_hub.impl.ui.views.LocationCircleOverlay;
import com.revolut.feature.staking.impl.stakingdetails.v2.StakingDetailsController;
import com.revolut.feature.staking.impl.stakingdetails.v2.StakingDetailsControllerContract$ModalStep;
import com.revolut.feature.store.impl.ui.brand_filters.StoreBrandsFiltersScreen;
import com.revolut.feature_market_data_impl.ui.breakdown.kompot.screens.transaction.TransactionBreakdownScreen;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import mx0.q9;
import nii.l1;
import nii.n1;
import vkm.j2;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f291620w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
        this.f291620w = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d((e) this.f291620w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            case 1:
                d dVar2 = new d((vsf.i) this.f291620w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
            case 2:
                d dVar3 = new d((vsl.g) this.f291620w, continuation, 2);
                dVar3.v = obj2;
                return dVar3;
            case 3:
                return new d((ts8.e) this.v, (com.revolut.feature.kyc.impl.dap.b) this.f291620w, continuation, 3);
            case 4:
                d dVar4 = new d((LinkedWalletsScreen) this.f291620w, continuation, 4);
                dVar4.v = obj2;
                return dVar4;
            case 5:
                return new d((ProducerScope) this.v, (Ref$BooleanRef) this.f291620w, continuation, 5);
            case 6:
                d dVar5 = new d((OldOrNewPinDialogScreen) this.f291620w, continuation, 6);
                dVar5.v = obj2;
                return dVar5;
            case 7:
                d dVar6 = new d((com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.make_claim.a) this.f291620w, continuation, 7);
                dVar6.v = obj2;
                return dVar6;
            case 8:
                d dVar7 = new d((FourthlineViewController) this.f291620w, continuation, 8);
                dVar7.v = obj2;
                return dVar7;
            case 9:
                d dVar8 = new d((SetTrustedLocationScreen) this.f291620w, continuation, 9);
                dVar8.v = obj2;
                return dVar8;
            case 10:
                d dVar9 = new d((com.revolut.feature.security_hub.impl.ui.street_mode.set_trusted_location.d) this.f291620w, continuation, 10);
                dVar9.v = obj2;
                return dVar9;
            case 11:
                d dVar10 = new d((PaymentProfileFlow) this.f291620w, continuation, 11);
                dVar10.v = obj2;
                return dVar10;
            case 12:
                d dVar11 = new d((StakingDetailsController) this.f291620w, continuation, 12);
                dVar11.v = obj2;
                return dVar11;
            case 13:
                d dVar12 = new d((CardLabelScreen) this.f291620w, continuation, 13);
                dVar12.v = obj2;
                return dVar12;
            case 14:
                d dVar13 = new d((com.revolut.feature.card_label.ui.screen.card_label_screen.d) this.f291620w, continuation, 14);
                dVar13.v = obj2;
                return dVar13;
            case 15:
                d dVar14 = new d((vzk.u) this.f291620w, continuation, 15);
                dVar14.v = obj2;
                return dVar14;
            case 16:
                d dVar15 = new d((FreelancerTermsScreen) this.f291620w, continuation, 16);
                dVar15.v = obj2;
                return dVar15;
            case 17:
                d dVar16 = new d((w07.n) this.f291620w, continuation, 17);
                dVar16.v = obj2;
                return dVar16;
            case 18:
                d dVar17 = new d((RecurringPaymentsManageSplitScreen) this.f291620w, continuation, 18);
                dVar17.v = obj2;
                return dVar17;
            case 19:
                d dVar18 = new d((com.revolut.feature.payments.splitbill.impl.ui_new.manage_split.b) this.f291620w, continuation, 19);
                dVar18.v = obj2;
                return dVar18;
            case 20:
                d dVar19 = new d((w2a.s) this.f291620w, continuation, 20);
                dVar19.v = obj2;
                return dVar19;
            case 21:
                d dVar20 = new d((com.revolut.feature.retail.cfd.impl.flows.order.c) this.f291620w, continuation, 21);
                dVar20.v = obj2;
                return dVar20;
            case 22:
                d dVar21 = new d((w2b.h) this.f291620w, continuation, 22);
                dVar21.v = obj2;
                return dVar21;
            case 23:
                d dVar22 = new d((StoreBrandsFiltersScreen) this.f291620w, continuation, 23);
                dVar22.v = obj2;
                return dVar22;
            case 24:
                d dVar23 = new d((com.revolut.feature.retail.cfd.impl.screens.margin.a) this.f291620w, continuation, 24);
                dVar23.v = obj2;
                return dVar23;
            case 25:
                d dVar24 = new d((CheckoutScreen) this.f291620w, continuation, 25);
                dVar24.v = obj2;
                return dVar24;
            case 26:
                d dVar25 = new d((w4d.f) this.f291620w, continuation, 26);
                dVar25.v = obj2;
                return dVar25;
            case 27:
                d dVar26 = new d((TransactionBreakdownScreen) this.f291620w, continuation, 27);
                dVar26.v = obj2;
                return dVar26;
            case 28:
                d dVar27 = new d((w4i.d0) this.f291620w, continuation, 28);
                dVar27.v = obj2;
                return dVar27;
            default:
                d dVar28 = new d((w4k.p) this.f291620w, continuation, 29);
                dVar28.v = obj2;
                return dVar28;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((d) create((xv.l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((d) create((vv2.h) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((d) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((d) create((q9) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((d) create((do3.n) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((d) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((d) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((d) create((FreelancerTerms) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((d) create((CfdOrderData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((d) create((k4l.e0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((d) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((d) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((d) create((w4i.m) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((rp0.z) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v50, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v62, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v38, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 18;
        int i3 = 11;
        int i5 = 22;
        int i6 = 2;
        int i21 = 6;
        int i22 = 21;
        int i32 = 25;
        int i33 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object obj3 = this.f291620w;
        switch (i) {
            case 0:
                String stockExchangeCode = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ael.d0 d0Var = ((e) obj3).d;
                Intrinsics.checkNotNullParameter(stockExchangeCode, "stockExchangeCode");
                vdl.x0 x0Var = d0Var.f3606c;
                x0Var.getClass();
                Intrinsics.checkNotNullParameter(stockExchangeCode, "stockExchangeCode");
                return rd0.e.b(te0.w.f0(nim.a.w(x0Var.f.f(stockExchangeCode, x0Var.e.get()), new vch.h0(24))));
            case 1:
                String str = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                vsf.i iVar = (vsf.i) obj3;
                iVar.C1(zh9.u0.b(iVar.f291783q.c(null, str)));
                return Unit.f186387a;
            case 2:
                Data data = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                vsl.g gVar = (vsl.g) obj3;
                gVar.H2(gVar.f291852r, new vo8.i0(data, 10));
                return Unit.f186387a;
            case 3:
                com.revolut.feature.kyc.impl.dap.b bVar = (com.revolut.feature.kyc.impl.dap.b) obj3;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ts8.e eVar = (ts8.e) this.v;
                if (Intrinsics.f(eVar, ts8.c.f274054a)) {
                    r6.b.D("Dap flow unexpected success");
                } else if (Intrinsics.f(eVar, ts8.d.f274055a) || Intrinsics.f(eVar, ts8.b.f274053a)) {
                    bVar.B2();
                } else {
                    if (!Intrinsics.f(eVar, ts8.a.f274052a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar.B2();
                    yji.l.a1(bVar, bVar.X1(new nii.y0(null, new nii.z(new TextLocalisedClause(R$string.kyc_vendors_dap_intro_error_cant_open_link_title, null, null, 14), new TextLocalisedClause(R$string.kyc_vendors_dap_intro_error_cant_open_link_description, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 5)), null, null, null, 7);
                }
                return Unit.f186387a;
            case 4:
                String selectedId = (String) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                vuc.l lVarE3 = ((LinkedWalletsScreen) obj3).R2();
                Intrinsics.h(selectedId);
                com.revolut.feature.security_hub.impl.ui.linked_wallets.host.a aVar6 = (com.revolut.feature.security_hub.impl.ui.linked_wallets.host.a) lVarE3;
                aVar6.getClass();
                Intrinsics.checkNotNullParameter(selectedId, "selectedId");
                aVar6.H2(aVar6.u, new vb2.r(selectedId, i2));
                return Unit.f186387a;
            case 5:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                skm.e0.C((ProducerScope) this.v, null, null, new vmf.k((Ref$BooleanRef) obj3, objArr == true ? 1 : 0, 8), 3);
                return Unit.f186387a;
            case 6:
                vv2.h event = (vv2.h) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                vv2.m mVar = (vv2.m) ((OldOrNewPinDialogScreen) obj3).M.getValue();
                mVar.getClass();
                Intrinsics.checkNotNullParameter(event, "event");
                if (event instanceof vv2.g) {
                    String str2 = ((vv2.g) event).f292441a;
                    int iHashCode = str2.hashCode();
                    if (iHashCode != 1076053824) {
                        if (iHashCode != 1933136421) {
                            if (iHashCode == 1964459675 && str2.equals("SHOW_NEW_PIN_ITEM_LIST_ID")) {
                                mVar.C2(vv2.b.f292437a);
                            }
                        } else if (str2.equals("NOT_NOW_ITEM_LIST_ID")) {
                            mVar.C2(vv2.a.f292436a);
                        }
                    } else if (str2.equals("SHOW_PREVIOUS_PIN_ITEM_LIST_ID")) {
                        mVar.C2(vv2.c.f292438a);
                    }
                } else {
                    if (!Intrinsics.f(event, vv2.f.f292440a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    mVar.C1(((gwh.c) mVar.f292446p).a(mVar.o.f64413a));
                }
                return Unit.f186387a;
            case 7:
                Data data2 = (Data) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.make_claim.a aVar10 = (com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.make_claim.a) obj3;
                aVar10.H2(aVar10.u, new vo8.i0(data2, i3));
                return Unit.f186387a;
            case 8:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                vv8.d dVar = (vv8.d) ((FourthlineViewController) obj3).T.getValue();
                Intrinsics.h(clickData);
                vv8.q qVar = (vv8.q) dVar;
                qVar.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                String str3 = clickData.f275445a;
                if (Intrinsics.f(str3, "PRIVACY_LINK_ID")) {
                    qVar.C1(new HtmlViewerDestination(new HtmlViewerDestination.InputData(new HtmlDocumentDescriptor.TermsWebDocumentDescriptor("https://fourthline.com/privacy-statement", true), new TextLocalisedClause(R$string.components_privacy_title, null, null, 14))));
                } else {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(a0.d.r(str3, " is not handled"));
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                }
                return Unit.f186387a;
            case 9:
                q9 boundariesUpdate = (q9) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                SetTrustedLocationScreen setTrustedLocationScreen = (SetTrustedLocationScreen) obj3;
                vvc.q qVarE3 = setTrustedLocationScreen.d();
                Intrinsics.h(boundariesUpdate);
                GmsLatLngBounds gmsLatLngBounds = boundariesUpdate.f209962a;
                LocationCircleOverlay setTrustedLocationControllerLocationOverlay = setTrustedLocationScreen.d3().d;
                Intrinsics.checkNotNullExpressionValue(setTrustedLocationControllerLocationOverlay, "setTrustedLocationControllerLocationOverlay");
                float width = setTrustedLocationControllerLocationOverlay.getWidth();
                float width2 = setTrustedLocationScreen.f3().getWidth();
                LocationCircleOverlay setTrustedLocationControllerLocationOverlay2 = setTrustedLocationScreen.d3().d;
                Intrinsics.checkNotNullExpressionValue(setTrustedLocationControllerLocationOverlay2, "setTrustedLocationControllerLocationOverlay");
                float height = setTrustedLocationControllerLocationOverlay2.getHeight();
                float height2 = setTrustedLocationScreen.f3().getHeight();
                com.revolut.feature.security_hub.impl.ui.street_mode.set_trusted_location.d dVar2 = (com.revolut.feature.security_hub.impl.ui.street_mode.set_trusted_location.d) qVarE3;
                cli.y yVar = dVar2.f85693w;
                Intrinsics.checkNotNullParameter(boundariesUpdate, "boundariesUpdate");
                SetTrustedLocationScreenContract$InputData setTrustedLocationScreenContract$InputData = dVar2.o;
                if (!(setTrustedLocationScreenContract$InputData instanceof SetTrustedLocationScreenContract$InputData.EditTrustedLocation) || ((vvc.g) ((j2) yVar.f22677a).getValue()).f) {
                    double d = gmsLatLngBounds.c().f4848b;
                    double d5 = gmsLatLngBounds.b().f4848b;
                    ah0.a aVarA = gmsLatLngBounds.a();
                    double d6 = aVarA.f4847a;
                    int iA = (int) ((dVar2.f85689q.a(d6, d, d6, d5) * (width / width2)) / 2);
                    Object mVar2 = iA < 25 ? vvc.o.f292518a : iA > 250 ? vvc.n.f292517a : new vvc.m(iA);
                    LocationDomain locationDomain = new LocationDomain(aVarA.f4847a, aVarA.f4848b);
                    dVar2.H2(yVar, new n(locationDomain, mVar2, 10));
                    dVar2.n2(new vnl.o(dVar2, locationDomain, objArr2 == true ? 1 : 0, 12), new whi.b(i21));
                } else {
                    StreetModeTrustedLocation streetModeTrustedLocation = ((SetTrustedLocationScreenContract$InputData.EditTrustedLocation) setTrustedLocationScreenContract$InputData).f85681a;
                    LocationDomain location = streetModeTrustedLocation.f85430c;
                    int i43 = streetModeTrustedLocation.d;
                    qr0.i iVar2 = dVar2.f85692t;
                    iVar2.getClass();
                    Intrinsics.checkNotNullParameter(location, "location");
                    float f = width2 / width;
                    float f4 = i43 * 2;
                    float f5 = f * f4;
                    float f6 = (height2 / height) * f4;
                    double d10 = location.f78066a;
                    double d15 = location.f78067b;
                    float f32 = 2;
                    double d41 = f6 / f32;
                    double d51 = f5 / f32;
                    dVar2.H2(yVar, new vvc.t(((com.revolut.core.mobile_services.impl.map.a) ((ah0.c) iVar2.f248595b)).a(new ah0.a((((-d41) / 6378137.0d) * 57.29577951308232d) + d10, (((-d51) / (Math.cos(Math.toRadians(location.f78066a)) * 6378137.0d)) * 57.29577951308232d) + d15), new ah0.a(((d41 / 6378137.0d) * 57.29577951308232d) + d10, ((d51 / (Math.cos(Math.toRadians(d10)) * 6378137.0d)) * 57.29577951308232d) + d15)), i43, 0));
                }
                return Unit.f186387a;
            case 10:
                do3.n nVar = (do3.n) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.security_hub.impl.ui.street_mode.set_trusted_location.d dVar3 = (com.revolut.feature.security_hub.impl.ui.street_mode.set_trusted_location.d) obj3;
                dVar3.H2(dVar3.f85693w, new a2f.j(nVar, i22));
                return Unit.f186387a;
            case 11:
                String id10 = (String) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                vw9.g gVarE3 = ((PaymentProfileFlow) obj3).R2();
                Intrinsics.h(id10);
                com.revolut.feature.payments.profile.impl.ui_kompot.flow.b bVar2 = (com.revolut.feature.payments.profile.impl.ui_kompot.flow.b) gVarE3;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                int iHashCode2 = id10.hashCode();
                if (iHashCode2 != -772215642) {
                    if (iHashCode2 != -249048343) {
                        if (iHashCode2 == 678659908 && id10.equals("LIST_ID_UPLOAD")) {
                            ((e60.s) bVar2.v).T(new e60.i(null, null, null, true, 0, 0, null, null, false, null, null, 16375));
                        }
                    } else if (id10.equals("LIST_ID_FLASHLIGHT")) {
                        bVar2.u.f292655a.k(Unit.f186387a);
                    }
                } else if (id10.equals("LIST_ID_SETTINGS")) {
                    j60.a aVar15 = bVar2.f79639r;
                    vw9.o oVar = bVar2.f79637p;
                    oVar.getClass();
                    List listK = zhm.v.k(vw9.o.a(oVar, com.revolut.feature.payments.profile.impl.R$string.payment_profile_edit_username, R$drawable.uikit_icn_24_pencil, vw9.i.EDIT_REVTAG), vw9.o.a(oVar, com.revolut.feature.payments.profile.impl.R$string.profile_settings_options_privacy, R$drawable.uikit_icn_24_shield, vw9.i.PRIVACY));
                    yp0.b.k(listK, 0, 0, 0, 0, 31);
                    aVar15.x(new rp0.y(listK, null, rp0.l.WINDOW, null, null, null, 1016));
                }
                return Unit.f186387a;
            case 12:
                ty0.a clickData2 = (ty0.a) this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                vwd.e eVar2 = (vwd.e) ((StakingDetailsController) obj3).P.getValue();
                Intrinsics.h(clickData2);
                com.revolut.feature.staking.impl.stakingdetails.v2.a aVar17 = (com.revolut.feature.staking.impl.stakingdetails.v2.a) eVar2;
                aVar17.getClass();
                Intrinsics.checkNotNullParameter(clickData2, "clickData");
                String str4 = clickData2.f275445a;
                if (Intrinsics.f(str4, "STAKING_DETAILS_TERMS_AND_CONDITIONS_LINK_ID")) {
                    aVar17.n2(new vwd.i(aVar17, objArr3 == true ? 1 : 0, i33), new whi.b(i21));
                } else if (Intrinsics.f(str4, "STAKING_DETAILS_RISK_DISCLOSURE_LINK_ID")) {
                    oki.h.v2(aVar17.f88160r, StakingDetailsControllerContract$ModalStep.RiskDisclosure.f88157a, ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
                }
                return Unit.f186387a;
            case 13:
                String label = (String) this.v;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                vy2.d dVar4 = (vy2.d) ((CardLabelScreen) obj3).f64759a0.getValue();
                Intrinsics.h(label);
                com.revolut.feature.card_label.ui.screen.card_label_screen.d dVar5 = (com.revolut.feature.card_label.ui.screen.card_label_screen.d) dVar4;
                dVar5.getClass();
                Intrinsics.checkNotNullParameter(label, "label");
                dVar5.x2(new vb2.r(label, i5));
                return Unit.f186387a;
            case 14:
                n1 n1Var = (n1) this.v;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (n1Var instanceof l1) {
                    com.revolut.feature.card_label.ui.screen.card_label_screen.d dVar6 = (com.revolut.feature.card_label.ui.screen.card_label_screen.d) obj3;
                    dVar6.l2(new vy2.f(dVar6, objArr4 == true ? 1 : 0, i33), new vx9.b(dVar6, 8));
                } else {
                    int i59 = jli.h.f175850a;
                }
                return Unit.f186387a;
            case 15:
                Data data3 = (Data) this.v;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((vzk.u) obj3).x2(new vo8.i0(data3, 17));
                return Unit.f186387a;
            case 16:
                FreelancerTerms terms = (FreelancerTerms) this.v;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                w07.n nVar2 = (w07.n) ((FreelancerTermsScreen) obj3).d();
                nVar2.getClass();
                Intrinsics.checkNotNullParameter(terms, "terms");
                nVar2.n2(new vnl.o(nVar2, terms, objArr5 == true ? 1 : 0, i22), new whi.b(i21));
                return Unit.f186387a;
            case 17:
                Data data4 = (Data) this.v;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                w07.n nVar3 = (w07.n) obj3;
                nVar3.H2(nVar3.f293663r, new vo8.i0(data4, i2));
                return Unit.f186387a;
            case 18:
                String itemId = (String) this.v;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                w1a.b bVar3 = (w1a.b) ((RecurringPaymentsManageSplitScreen) obj3).R.getValue();
                Intrinsics.h(itemId);
                com.revolut.feature.payments.splitbill.impl.ui_new.manage_split.b bVar4 = (com.revolut.feature.payments.splitbill.impl.ui_new.manage_split.b) bVar3;
                bVar4.getClass();
                Intrinsics.checkNotNullParameter(itemId, "itemId");
                if (itemId.equals("UPDATE_RECURRING_SPLIT_MENU_ITEM_ID")) {
                    oki.h.v2(bVar4.f79890r, RecurringPaymentsManageSplitContract$ModalStep.UpdateSplit.f79884a, ModalDestination.Style.FULLSCREEN_FADE.f98307a);
                } else {
                    hx7.e.h(new IllegalArgumentException("Menu item click is not handled"));
                }
                return Unit.f186387a;
            case 19:
                Data data5 = (Data) this.v;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.payments.splitbill.impl.ui_new.manage_split.b bVar5 = (com.revolut.feature.payments.splitbill.impl.ui_new.manage_split.b) obj3;
                cli.y yVar2 = bVar5.f79889q;
                a2a.d dVar7 = (a2a.d) data5.getContent();
                if ((dVar7 instanceof a2a.a ? (a2a.a) dVar7 : null) != null && (!r3.f714b.isEmpty())) {
                    bVar5.H2(yVar2, new vo8.i0(data5, 19));
                } else if (data5.getLoading() || dVar7 == null) {
                    bVar5.H2(yVar2, new vo8.i0(data5, 20));
                } else {
                    bVar5.H2(yVar2, new vz1.h(i3));
                }
                return Unit.f186387a;
            case 20:
                Data data6 = (Data) this.v;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                w2a.s sVar = (w2a.s) obj3;
                sVar.H2(sVar.f294007r, new vo8.i0(data6, i22));
                return Unit.f186387a;
            case 21:
                CfdOrderData cfdOrderData = (CfdOrderData) this.v;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.retail.cfd.impl.flows.order.c cVar = (com.revolut.feature.retail.cfd.impl.flows.order.c) obj3;
                cVar.H2(cVar.f82189t, new b4b.c0(cfdOrderData, 1));
                return Unit.f186387a;
            case 22:
                k4l.e0 e0Var = (k4l.e0) this.v;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                w2b.h hVar = (w2b.h) obj3;
                t2b.c cVar2 = hVar.f294021b;
                cVar2.getClass();
                return vkm.q.Q(new qij.s(cVar2, 16), new sdi.a(objArr6 == true ? 1 : 0, hVar, e0Var, i32));
            case 23:
                String menuItemId = (String) this.v;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                w2e.b bVarE3 = ((StoreBrandsFiltersScreen) obj3).d();
                Intrinsics.h(menuItemId);
                w2e.i iVar3 = (w2e.i) bVarE3;
                iVar3.getClass();
                Intrinsics.checkNotNullParameter(menuItemId, "menuItemId");
                if (menuItemId.equals("RESET_MENU_ITEM_ID")) {
                    iVar3.H2(iVar3.f294036r, new w29.a(7));
                }
                return Unit.f186387a;
            case 24:
                Data data7 = (Data) this.v;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.retail.cfd.impl.screens.margin.a aVar30 = (com.revolut.feature.retail.cfd.impl.screens.margin.a) obj3;
                aVar30.H2(aVar30.u, new vo8.i0(data7, i5));
                return Unit.f186387a;
            case 25:
                ty0.a aVar31 = (ty0.a) this.v;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Object obj4 = aVar31.d;
                if (obj4 instanceof w3c.j) {
                    w3c.i iVarE3 = ((CheckoutScreen) obj3).d();
                    String url2 = ((w3c.j) obj4).f294276a;
                    com.revolut.feature.revolut_shop.ui.screen.checkout.a aVar33 = (com.revolut.feature.revolut_shop.ui.screen.checkout.a) iVarE3;
                    aVar33.getClass();
                    Intrinsics.checkNotNullParameter(url2, "url");
                    aVar33.C1(new ExternalDestination.Browser(url2, null));
                }
                return Unit.f186387a;
            case 26:
                Data data8 = (Data) this.v;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                w4d.f fVar = (w4d.f) obj3;
                fVar.H2(fVar.f294546q, new vo8.i0(data8, 26));
                return Unit.f186387a;
            case 27:
                ty0.a aVar35 = (ty0.a) this.v;
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                w4i.b0 b0VarM3 = ((TransactionBreakdownScreen) obj3).R2();
                String url3 = aVar35.f275445a;
                w4i.d0 d0Var2 = (w4i.d0) b0VarM3;
                d0Var2.getClass();
                Intrinsics.checkNotNullParameter(url3, "url");
                d0Var2.C2(new w4i.t(url3));
                return Unit.f186387a;
            case 28:
                w4i.m mVar3 = (w4i.m) this.v;
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                w4i.d0 d0Var3 = (w4i.d0) obj3;
                d0Var3.H2(d0Var3.f294574s, new w3c.n(mVar3, i6));
                return Unit.f186387a;
            default:
                rp0.z zVar = (rp0.z) this.v;
                fim.a aVar38 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (Intrinsics.f(zVar.f256227a, "DESCRIPTION_HERE_BUTTON_ID")) {
                    w4k.p pVar = (w4k.p) obj3;
                    j60.a.v(pVar.f294623l, false, null, 3);
                    pVar.T2(new vmf.k(pVar, objArr7 == true ? 1 : 0, i32), new yi5.b(27));
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f291620w = obj2;
    }
}
