package rk9;

import ael.h0;
import android.view.View;
import aw0.n6;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.data.model.Data;
import com.revolut.feature.bank_account_switching.impl.ui.payments_review.payment_schedule.BankAccountSwitchingPaymentScheduleScreen;
import com.revolut.feature.core.model.domain.wallet.openbanking.ExternalInstitution;
import com.revolut.feature.credit.card.impl.ui.credit_limit_cap.CreditLimitCapChangeScreen;
import com.revolut.feature.credit.card.impl.ui.credit_limit_cap.CreditLimitCapChangeScreenContract$ModalStep;
import com.revolut.feature.credit.card.impl.ui.limit_hub.limit_settings.CreditCardLimitSettingsController;
import com.revolut.feature.freelancer.common.models.FreelancerAccountOnboardingState;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.summary.PolicySummaryScreen;
import com.revolut.feature.salary_switch.impl.R$string;
import com.revolut.feature.salary_switch.impl.ui.screen.share_details.ShareSalaryDetailsScreen;
import com.revolut.feature.slot_manager.impl.ui.screen.prompt.SlotManagerPromptController;
import com.revolut.feature.view.image.impl.ui.gallery.ImageGalleryScreen;
import com.revolut.feature.wealth.ui.api.WealthUiApi$Toggles;
import com.revolut.feature.wealth_discovery.api.declaration.ScreenerCollectionDestination;
import com.revolut.feature.wealth_discovery.api.declaration.ScreenerRedesignAllCollectionsDestination;
import com.revolut.feature.wealth_discovery.impl.screener.domain.model.ScreenerFilterInfo;
import com.revolut.feature.wealth_discovery.impl.screener.screens.stats_filters.ScreenerStatsFiltersController;
import com.revolut.feature.wealth_discovery.impl.screener.screens.stats_filters.ScreenerStatsFiltersControllerContract$ModalStep;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.revolut.sso.api.exceptions.RevolutSSOException;
import com.revolut.sso.impl.ui.merchant_permissions.merchant_permissions_screen.MerchantPermissionsScreen;
import com.revolut.sso.impl.ui.revolut_id.documents.document_photo.DocumentPhotoScreen;
import ip0.t5;
import ip0.vd;
import java.time.Instant;
import java.time.LocalDate;
import java.util.concurrent.CopyOnWriteArrayList;
import jlh.v;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import nii.n1;
import rnd.y;
import vkm.j2;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f254771w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
        this.f254771w = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d((TwinVerticalButton) this.f254771w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            case 1:
                d dVar2 = new d((com.revolut.feature.pay_later.impl.ui.right_to_cancel.summary.a) this.f254771w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
            case 2:
                d dVar3 = new d((rkh.m) this.f254771w, continuation, 2);
                dVar3.v = obj2;
                return dVar3;
            case 3:
                d dVar4 = new d((SlotManagerPromptController) this.f254771w, continuation, 3);
                dVar4.v = obj2;
                return dVar4;
            case 4:
                d dVar5 = new d((rle.g) this.f254771w, continuation, 4);
                dVar5.v = obj2;
                return dVar5;
            case 5:
                d dVar6 = new d((rlh.j) this.f254771w, continuation, 5);
                dVar6.v = obj2;
                return dVar6;
            case 6:
                d dVar7 = new d((aah.g) this.f254771w, continuation, 6);
                dVar7.v = obj2;
                return dVar7;
            case 7:
                d dVar8 = new d((rn6.i) this.f254771w, continuation, 7);
                dVar8.v = obj2;
                return dVar8;
            case 8:
                d dVar9 = new d((rna.i) this.f254771w, continuation, 8);
                dVar9.v = obj2;
                return dVar9;
            case 9:
                d dVar10 = new d((y) this.f254771w, continuation, 9);
                dVar10.v = obj2;
                return dVar10;
            case 10:
                d dVar11 = new d((MerchantPermissionsScreen) this.f254771w, continuation, 10);
                dVar11.v = obj2;
                return dVar11;
            case 11:
                d dVar12 = new d((BankAccountSwitchingPaymentScheduleScreen) this.f254771w, continuation, 11);
                dVar12.v = obj2;
                return dVar12;
            case 12:
                d dVar13 = new d((rob.l) this.f254771w, continuation, 12);
                dVar13.v = obj2;
                return dVar13;
            case 13:
                return new d((mn2.a) this.v, (com.revolut.feature.bank_account_switching.impl.ui.switch_out.a) this.f254771w, continuation, 13);
            case 14:
                d dVar14 = new d((rp9.m) this.f254771w, continuation, 14);
                dVar14.v = obj2;
                return dVar14;
            case 15:
                d dVar15 = new d((rpd.k) this.f254771w, continuation, 15);
                dVar15.v = obj2;
                return dVar15;
            case 16:
                d dVar16 = new d((DocumentPhotoScreen) this.f254771w, continuation, 16);
                dVar16.v = obj2;
                return dVar16;
            case 17:
                return new d((View) this.v, (CreditLimitCapChangeScreen) this.f254771w, continuation, 17);
            case 18:
                d dVar17 = new d((com.revolut.feature.credit.card.impl.ui.credit_limit_cap.c) this.f254771w, continuation, 18);
                dVar17.v = obj2;
                return dVar17;
            case 19:
                d dVar18 = new d((PolicySummaryScreen) this.f254771w, continuation, 19);
                dVar18.v = obj2;
                return dVar18;
            case 20:
                d dVar19 = new d((ScreenerStatsFiltersController) this.f254771w, continuation, 20);
                dVar19.v = obj2;
                return dVar19;
            case 21:
                d dVar20 = new d((com.revolut.feature.wealth_discovery.impl.screener.screens.stats_filters.a) this.f254771w, continuation, 21);
                dVar20.v = obj2;
                return dVar20;
            case 22:
                return new d((rqk.k) this.v, (String) this.f254771w, continuation, 22);
            case 23:
                d dVar21 = new d((ShareSalaryDetailsScreen) this.f254771w, continuation, 23);
                dVar21.v = obj2;
                return dVar21;
            case 24:
                d dVar22 = new d((ImageGalleryScreen) this.f254771w, continuation, 24);
                dVar22.v = obj2;
                return dVar22;
            case 25:
                d dVar23 = new d((rrj.o) this.f254771w, continuation, 25);
                dVar23.v = obj2;
                return dVar23;
            case 26:
                d dVar24 = new d((rs2.n) this.f254771w, continuation, 26);
                dVar24.v = obj2;
                return dVar24;
            case 27:
                d dVar25 = new d((rsk.j) this.f254771w, continuation, 27);
                dVar25.v = obj2;
                return dVar25;
            case 28:
                d dVar26 = new d((rsl.a) this.f254771w, continuation, 28);
                dVar26.v = obj2;
                return dVar26;
            default:
                d dVar27 = new d((CreditCardLimitSettingsController) this.f254771w, continuation, 29);
                dVar27.v = obj2;
                return dVar27;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((Boolean) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((d) create((TradingLegalEntityInformation) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((d) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((d) create((rle.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((d) create((rmh.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((d) create((ExternalInstitution) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((d) create((FreelancerAccountOnboardingState) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((d) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((d) create((vd) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((d) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((d) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((d) create((Boolean) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((d) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((d) create((qph.o) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((d) create((t5) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((d) create((Integer) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((d) create((rsk.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((d) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((yx4.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v44, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v62, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v85, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        aii.u screenerCollectionDestination;
        String str;
        String str2;
        rt4.d dVar;
        xp3.c cVar;
        int i = this.u;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        int i2 = 14;
        int i3 = 3;
        int i5 = 26;
        int i6 = 1;
        int i21 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object obj3 = this.f254771w;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((TwinVerticalButton) obj3).setSecondaryButtonVisible(!bool.booleanValue());
                return Unit.f186387a;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.pay_later.impl.ui.right_to_cancel.summary.a aVar3 = (com.revolut.feature.pay_later.impl.ui.right_to_cancel.summary.a) obj3;
                aVar3.H2(aVar3.f78931q, new rj9.i(data, i3));
                return Unit.f186387a;
            case 2:
                rkh.m mVar = (rkh.m) obj3;
                jlh.p pVar = mVar.f254884b;
                TradingLegalEntityInformation tradingLegalEntityInformation = (TradingLegalEntityInformation) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                hel.b bVar = tradingLegalEntityInformation.f105106a;
                switch (bVar == null ? -1 : rkh.l.f254882a[bVar.ordinal()]) {
                    case -1:
                        return zi0.c.i(f0.f322471a);
                    case 0:
                    default:
                        throw new NoWhenBranchMatchedException();
                    case 1:
                        ((v) pVar).getClass();
                        Pair[] elements = {jlh.u.f175829a, jlh.u.f175830b, jlh.u.f175831c, jlh.u.d, jlh.u.e, jlh.u.f, jlh.u.f175832g, jlh.u.f175833h, jlh.u.i, jlh.u.f175834j};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        return zi0.c.i(v.a(kotlin.collections.d.L(elements)));
                    case 2:
                        ((v) pVar).getClass();
                        Pair[] elements2 = {jlh.t.f175821a, jlh.t.f175822b, jlh.t.f175823c, jlh.t.d, jlh.t.e, jlh.t.f, jlh.t.f175824g, jlh.t.f175825h, jlh.t.i, jlh.t.f175826j, jlh.t.k, jlh.t.f175827l, jlh.t.f175828m};
                        Intrinsics.checkNotNullParameter(elements2, "elements");
                        return zi0.c.i(v.a(kotlin.collections.d.L(elements2)));
                    case 3:
                        Pair[] elements3 = {((jte.d) ((v) pVar).f175835a).c(WealthUiApi$Toggles.InvestDisclaimersUpdateAu.f95857c) ? jlh.q.f175790b : jlh.q.f175789a, jlh.q.f175791c, jlh.q.d, jlh.q.e, jlh.q.f, jlh.q.f175792g, jlh.q.f175793h, jlh.q.i, jlh.q.f175794j, jlh.q.k};
                        Intrinsics.checkNotNullParameter(elements3, "elements");
                        return zi0.c.i(v.a(kotlin.collections.d.L(elements3)));
                    case 4:
                        return xam.a.h(new rkh.k(mVar, null), ((h0) mVar.f254885c).d());
                    case 5:
                    case 6:
                    case 7:
                        ((v) pVar).getClass();
                        Pair[] elements4 = {jlh.s.f175812a, jlh.s.f175813b, jlh.s.f175814c, jlh.s.d, jlh.s.e, jlh.s.f, jlh.s.f175815g, jlh.s.f175816h, jlh.s.i, jlh.s.f175817j, jlh.s.k, jlh.s.f175818l, jlh.s.f175819m, jlh.s.f175820n};
                        Intrinsics.checkNotNullParameter(elements4, "elements");
                        return zi0.c.i(v.a(kotlin.collections.d.L(elements4)));
                }
            case 3:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                rld.m mVarD3 = ((SlotManagerPromptController) obj3).R2();
                Intrinsics.h(clickData);
                mVarD3.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                mVarD3.l2(new r83.g(mVarD3, clickData, objArr == true ? 1 : 0, 25), new yi5.b(i5));
                return Unit.f186387a;
            case 4:
                rle.c cVar2 = (rle.c) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((rle.g) obj3).d.S0(cVar2.f255031a);
                return Unit.f186387a;
            case 5:
                Data data2 = (Data) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                rlh.j jVar = (rlh.j) obj3;
                jVar.H2(jVar.v, new rgf.m(data2, jVar, 8));
                return Unit.f186387a;
            case 6:
                rmh.i parcel = (rmh.i) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                rmh.b bVar2 = (rmh.b) ((aah.g) obj3).e;
                Intrinsics.h(parcel);
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                if (parcel instanceof rmh.h) {
                    screenerCollectionDestination = ScreenerRedesignAllCollectionsDestination.f96104a;
                } else {
                    if (!(parcel instanceof rmh.g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    screenerCollectionDestination = new ScreenerCollectionDestination(((rmh.g) parcel).f255329a.f105154a, null);
                }
                bVar2.A2(screenerCollectionDestination);
                return Unit.f186387a;
            case 7:
                ExternalInstitution externalInstitution = (ExternalInstitution) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                rn6.i iVar = (rn6.i) obj3;
                iVar.H2(iVar.f255511q, new gn6.h(externalInstitution, 1));
                return Unit.f186387a;
            case 8:
                Data data3 = (Data) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                rna.i iVar2 = (rna.i) obj3;
                iVar2.H2(iVar2.f255544s, new rj9.i(data3, 7));
                return Unit.f186387a;
            case 9:
                FreelancerAccountOnboardingState freelancerAccountOnboardingState = (FreelancerAccountOnboardingState) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return freelancerAccountOnboardingState instanceof FreelancerAccountOnboardingState.Onboarded ? nim.a.v(((le3.f) ((y) obj3).i).f(io3.l.MERCHANT, io3.i.INTERNAL, AccountId.Personal.f51414a), new rnd.k(4)) : zi0.c.i(f0.f322471a);
            case 10:
                ty0.a aVar12 = (ty0.a) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                rnl.d dVarE3 = ((MerchantPermissionsScreen) obj3).e3();
                Object obj4 = aVar12.d;
                rnl.g gVar = (rnl.g) dVarE3;
                gVar.getClass();
                String str3 = obj4 instanceof String ? (String) obj4 : null;
                if (str3 != null) {
                    gVar.C1(new ExternalDestination.Browser(str3, null));
                }
                return Unit.f186387a;
            case 11:
                vd vdVar = (vd) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ro2.k kVarE3 = ((BankAccountSwitchingPaymentScheduleScreen) obj3).R2();
                LocalDate selectedDate = vdVar.f166807b;
                kVarE3.getClass();
                Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
                j60.a.v(kVarE3.o, false, null, 3);
                kVarE3.H2(kVarE3.f255818q, new a15.l(i5, selectedDate));
                return Unit.f186387a;
            case 12:
                Data data4 = (Data) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                rob.l lVar = (rob.l) obj3;
                lVar.H2(lVar.f255961s, new rj9.i(data4, 11));
                return Unit.f186387a;
            case 13:
                com.revolut.feature.bank_account_switching.impl.ui.switch_out.a aVar16 = (com.revolut.feature.bank_account_switching.impl.ui.switch_out.a) obj3;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                int i22 = rp2.f.f256254a[((mn2.a) this.v).ordinal()];
                if (i22 == 1) {
                    str = "revolut://app/form/cass-switch-out";
                } else if (i22 == 2) {
                    str = "revolut://app/form/mobility-switch-out";
                } else {
                    if (i22 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "revolut://app/form/overstap-switch-out";
                }
                aVar16.l2(new rm6.c(aVar16, str, objArr2 == true ? 1 : 0, 15), new yi5.b(i5));
                oki.h.D2(aVar16.f64052s);
                return Unit.f186387a;
            case 14:
                Data data5 = (Data) this.v;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((rp9.m) obj3).x2(new rj9.i(data5, 12));
                return Unit.f186387a;
            case 15:
                Data data6 = (Data) this.v;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                rpd.k kVar = (rpd.k) obj3;
                kVar.H2(kVar.f256374r, new rj9.i(data6, 13));
                return Unit.f186387a;
            case 16:
                String menuItemId = (String) this.v;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                rpl.f fVar = (rpl.f) ((DocumentPhotoScreen) obj3).P.getValue();
                Intrinsics.h(menuItemId);
                rpl.h hVar = (rpl.h) fVar;
                hVar.getClass();
                Intrinsics.checkNotNullParameter(menuItemId, "menuItemId");
                if (menuItemId.equals("SHARE_MENU_ITEM")) {
                    hVar.l2(new rbh.k(hVar, objArr3 == true ? 1 : 0, i2), new yi5.b(i5));
                } else {
                    RevolutSSOException.IllegalState illegalState = new RevolutSSOException.IllegalState(p.a.p("Handling of ", menuItemId, " menu item id is not supported"));
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalState, h0Var);
                }
                return Unit.f186387a;
            case 17:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                kli.c.c((View) this.v, false);
                com.revolut.feature.credit.card.impl.ui.credit_limit_cap.c cVar3 = (com.revolut.feature.credit.card.impl.ui.credit_limit_cap.c) ((CreditLimitCapChangeScreen) obj3).e3();
                cli.y yVar = cVar3.C;
                j2 j2Var = (j2) yVar.f22677a;
                j2 j2Var2 = (j2) yVar.f22677a;
                Long l2 = ((rq4.j) j2Var.getValue()).f256467c;
                if (l2 != null) {
                    long jLongValue = l2.longValue();
                    dj0.d dVar2 = ((rq4.i) zi0.c.I(((rq4.j) j2Var2.getValue()).f256465a)).f256462a.f175593g;
                    Long lValueOf = dVar2 != null ? Long.valueOf(dVar2.f115082a) : null;
                    if (jLongValue <= ((rq4.i) zi0.c.I(((rq4.j) j2Var2.getValue()).f256465a)).f256463b.f115082a) {
                        oki.h.v2(cVar3.B, CreditLimitCapChangeScreenContract$ModalStep.AvailableLessThanZero.f69174a, bottom_dialog);
                    } else {
                        int i32 = 6;
                        if (lValueOf == null || jLongValue >= lValueOf.longValue()) {
                            cVar3.n2(new rq4.o(cVar3, objArr4 == true ? 1 : 0, i6), new whi.b(i32));
                        } else {
                            cVar3.n2(new rq4.o(cVar3, objArr5 == true ? 1 : 0, i21), new whi.b(i32));
                        }
                    }
                }
                return Unit.f186387a;
            case 18:
                Boolean bool2 = (Boolean) this.v;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.credit.card.impl.ui.credit_limit_cap.c cVar4 = (com.revolut.feature.credit.card.impl.ui.credit_limit_cap.c) obj3;
                cVar4.H2(cVar4.C, new aqd.n1(20, bool2));
                return Unit.f186387a;
            case 19:
                ty0.a aVar23 = (ty0.a) this.v;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((rq7.s) ((PolicySummaryScreen) obj3).T2()).y2(aVar23.d, aVar23.f275445a);
                return Unit.f186387a;
            case 20:
                qph.o oVar = (qph.o) this.v;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                rqh.g gVarE3 = ((ScreenerStatsFiltersController) obj3).d();
                ScreenerFilterInfo dialog = oVar.f248413a;
                com.revolut.kompot.navigable.vc.modal.a aVar26 = ((com.revolut.feature.wealth_discovery.impl.screener.screens.stats_filters.a) gVarE3).v;
                Intrinsics.checkNotNullParameter(dialog, "dialog");
                if (dialog instanceof ScreenerFilterInfo.Destination) {
                    oki.h.v2(aVar26, new ScreenerStatsFiltersControllerContract$ModalStep.ControllerDialog(((ScreenerFilterInfo.Destination) dialog).f96158a), ModalDestination.Style.POPUP.f98311a);
                } else {
                    if (!(dialog instanceof ScreenerFilterInfo.Dialog)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.v2(aVar26, new ScreenerStatsFiltersControllerContract$ModalStep.InfoDialog((ScreenerFilterInfo.Dialog) dialog), bottom_dialog);
                }
                return Unit.f186387a;
            case 21:
                Data data7 = (Data) this.v;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.wealth_discovery.impl.screener.screens.stats_filters.a aVar28 = (com.revolut.feature.wealth_discovery.impl.screener.screens.stats_filters.a) obj3;
                aVar28.H2(aVar28.u, new rj9.i(data7, 17));
                return Unit.f186387a;
            case 22:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((cn0.g) ((rqk.k) this.v).k).l(new mm0.h((String) obj3));
                return Unit.f186387a;
            case 23:
                t5 model = (t5) this.v;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                rrc.f0 f0VarE3 = ((ShareSalaryDetailsScreen) obj3).R2();
                Intrinsics.h(model);
                f0VarE3.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                Object obj5 = model.e;
                if (obj5 != null) {
                    if (!(obj5 instanceof dda.h)) {
                        obj5 = null;
                    }
                    dda.h hVar2 = (dda.h) obj5;
                    if (hVar2 != null && (str2 = hVar2.f113179b) != null) {
                        f0VarE3.o.a(null, str2, false);
                        if (!c70.a.g()) {
                            f0VarE3.X1(new mii.k("SHOT_DIALOG_ID_COPIED_TO_CLIPBOARD", new TextLocalisedClause(R$string.salary_switch_share_details_action_clipboard_copy, null, null, 14), null, null, null, 28));
                        }
                    }
                }
                return Unit.f186387a;
            case 24:
                Integer num = (Integer) this.v;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                rrg.d dVar3 = (rrg.d) ((ImageGalleryScreen) obj3).Q.getValue();
                Intrinsics.h(num);
                int iIntValue = num.intValue();
                dVar3.getClass();
                dVar3.x2(new l2c.l(iIntValue, 16));
                return Unit.f186387a;
            case 25:
                Data data8 = (Data) this.v;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((rrj.o) obj3).x2(new rj9.i(data8, 18));
                return Unit.f186387a;
            case 26:
                String str4 = (String) this.v;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                tu.a aVar34 = (tu.a) ((rs2.n) obj3).f256955b.T2(rs2.n.c(str4), tu.a.class);
                if (aVar34 != null) {
                    return hx7.q.f0(aVar34);
                }
                return null;
            case 27:
                rsk.c cVar5 = (rsk.c) this.v;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                rsk.j jVar2 = (rsk.j) obj3;
                jVar2.X2(jVar2.f257119s, new rsk.h(cVar5, i21));
                return Unit.f186387a;
            case 28:
                rsl.j jVar3 = ((rsl.a) obj3).d;
                Object obj6 = this.v;
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                String f55189b = ((koi.j) obj6).getF55009b();
                switch (f55189b.hashCode()) {
                    case -647460256:
                        if (f55189b.equals("LIST_ID_ORDER_CANCELLATION_DEADLINE")) {
                            Object f55191g = ((qv0.p) obj6).getF55012h();
                            Instant instant = f55191g instanceof Instant ? (Instant) f55191g : null;
                            if (instant != null) {
                                jVar3.c3(new rsl.k(instant));
                            }
                        }
                        break;
                    case 133550893:
                        if (f55189b.equals("LIST_ID_ORDER_NOTE_ISSUE_DATE")) {
                            jVar3.c3(rsl.m.f257139a);
                        }
                        break;
                    case 565848450:
                        if (f55189b.equals("LIST_ID_ORDER_NOTE_TRADE_DATE")) {
                            jVar3.c3(rsl.n.f257140a);
                        }
                        break;
                    case 1513672630:
                        if (f55189b.equals("LIST_ID_UNIFIED_FEE")) {
                            jVar3.c3(rsl.l.f257138a);
                        }
                        break;
                }
                return Unit.f186387a;
            default:
                yx4.b click = (yx4.b) this.v;
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                rt4.p pVar2 = (rt4.p) ((CreditCardLimitSettingsController) obj3).S.getValue();
                pVar2.getClass();
                Intrinsics.checkNotNullParameter(click, "click");
                String str5 = click.f317544a;
                switch (str5.hashCode()) {
                    case -1891481995:
                        if (str5.equals("decrease_limit_item_list_id")) {
                            pVar2.C2(rt4.g.f257174a);
                        }
                        break;
                    case -1724701466:
                        if (str5.equals("LIMIT_INCREASE_PREFERENCE_ID") && (dVar = (rt4.d) ((rt4.e) ((j2) pVar2.f257186t.f22677a).getValue()).f257171b.getContent()) != null && (cVar = dVar.d) != null) {
                            pVar2.C2(new rt4.f(cVar.f307885a, cVar.f307886b));
                        }
                        break;
                    case 1222565006:
                        if (str5.equals("SEE_FULL_LIMIT_HISTORY_ID")) {
                            pVar2.C2(rt4.h.f257175a);
                        }
                        break;
                    case 1918729248:
                        if (str5.equals("ERROR_STATE_ID")) {
                            pVar2.f257185s.a();
                        }
                        break;
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f254771w = obj2;
    }
}
