package w50;

import android.os.Parcelable;
import cli.y;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.chat.domain.model.Transcript;
import com.revolut.chat.ui.transcript.ChatTranscriptPeriodCalendarBottomSheetController;
import com.revolut.core.mobile_services.impl.map.GmsLatLngBounds;
import com.revolut.data.model.Data;
import com.revolut.feature.atm.api.model.Atm;
import com.revolut.feature.atm.impl.ui.redesign.v2.map.AtmMapScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.intro.CreditOfferTypeSelectionScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.repayment_method.SepaDirectDebitRepaymentMethodController;
import com.revolut.feature.credit.card.models.CreditCard;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.accounts.accounts_selection.AccountsSelectionScreen;
import com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.BrPaymentLimitsUpdateScreen;
import com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.BrPaymentLimitsUpdateScreenContract$OutputData;
import com.revolut.feature.pix.api.model.PixQrCodeDecodeData;
import com.revolut.feature.pix.screens.token_verification.TokenVerificationScreen;
import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import com.revolut.feature.subaccount.api.models.Subaccount;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.retail.feature.crypto_deposits.impl.ui.bottom_sheet.return_details.CryptoDepositReturnDetailsBottomSheetController;
import com.revolut.shared.feature.offboarding.impl.ui.home.OffboardingScreen;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import m9d.w0;
import nii.n1;
import rp0.b1;
import rp0.c1;
import rp0.d1;
import rp0.e1;
import s56.d0;
import vkm.j2;
import vkm.v1;
import wba.e0;
import wff.x;
import wk2.b0;
import wk2.c0;
import wk2.v;
import wk2.z;
import zhm.f0;
import zhm.h0;
import zhm.w;
import zhm.y0;

/* JADX INFO: loaded from: classes19.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f294659w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.c cVar, e93.f fVar, Continuation continuation) {
        super(2, continuation);
        this.u = 5;
        this.v = cVar;
        this.f294659w = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g((ChatTranscriptPeriodCalendarBottomSheetController) this.f294659w, continuation, 0);
                gVar.v = obj2;
                return gVar;
            case 1:
                g gVar2 = new g((o) this.f294659w, continuation, 1);
                gVar2.v = obj2;
                return gVar2;
            case 2:
                return new g(continuation, (w56.p) this.v, (i56.h) this.f294659w);
            case 3:
                g gVar3 = new g((w6h.e) this.f294659w, continuation, 3);
                gVar3.v = obj2;
                return gVar3;
            case 4:
                g gVar4 = new g((w75.l) this.f294659w, continuation, 4);
                gVar4.v = obj2;
                return gVar4;
            case 5:
                return new g((com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.c) this.v, (e93.f) this.f294659w, continuation);
            case 6:
                g gVar5 = new g((w7f.f) this.f294659w, continuation, 6);
                gVar5.v = obj2;
                return gVar5;
            case 7:
                g gVar6 = new g((w85.h) this.f294659w, continuation, 7);
                gVar6.v = obj2;
                return gVar6;
            case 8:
                g gVar7 = new g((w86.k) this.f294659w, continuation, 8);
                gVar7.v = obj2;
                return gVar7;
            case 9:
                g gVar8 = new g((OffboardingScreen) this.f294659w, continuation, 9);
                gVar8.v = obj2;
                return gVar8;
            case 10:
                g gVar9 = new g((w8l.j) this.f294659w, continuation, 10);
                gVar9.v = obj2;
                return gVar9;
            case 11:
                g gVar10 = new g((w9a.g) this.f294659w, continuation, 11);
                gVar10.v = obj2;
                return gVar10;
            case 12:
                g gVar11 = new g((wb3.m) this.f294659w, continuation, 12);
                gVar11.v = obj2;
                return gVar11;
            case 13:
                g gVar12 = new g((e0) this.f294659w, continuation, 13);
                gVar12.v = obj2;
                return gVar12;
            case 14:
                g gVar13 = new g((CryptoDepositReturnDetailsBottomSheetController) this.f294659w, continuation, 14);
                gVar13.v = obj2;
                return gVar13;
            case 15:
                g gVar14 = new g((wbj.f) this.f294659w, continuation, 15);
                gVar14.v = obj2;
                return gVar14;
            case 16:
                g gVar15 = new g((wbk.h) this.f294659w, continuation, 16);
                gVar15.v = obj2;
                return gVar15;
            case 17:
                g gVar16 = new g((TokenVerificationScreen) this.f294659w, continuation, 17);
                gVar16.v = obj2;
                return gVar16;
            case 18:
                g gVar17 = new g((toh.d) this.f294659w, continuation, 18);
                gVar17.v = obj2;
                return gVar17;
            case 19:
                g gVar18 = new g((CreditOfferTypeSelectionScreen) this.f294659w, continuation, 19);
                gVar18.v = obj2;
                return gVar18;
            case 20:
                g gVar19 = new g((x) this.f294659w, continuation, 20);
                gVar19.v = obj2;
                return gVar19;
            case 21:
                g gVar20 = new g((com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.flow.b) this.f294659w, continuation, 21);
                gVar20.v = obj2;
                return gVar20;
            case 22:
                g gVar21 = new g((SepaDirectDebitRepaymentMethodController) this.f294659w, continuation, 22);
                gVar21.v = obj2;
                return gVar21;
            case 23:
                g gVar22 = new g((com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.repayment_method.a) this.f294659w, continuation, 23);
                gVar22.v = obj2;
                return gVar22;
            case 24:
                g gVar23 = new g((AccountsSelectionScreen) this.f294659w, continuation, 24);
                gVar23.v = obj2;
                return gVar23;
            case 25:
                g gVar24 = new g((wi6.t) this.f294659w, continuation, 25);
                gVar24.v = obj2;
                return gVar24;
            case 26:
                g gVar25 = new g((BrPaymentLimitsUpdateScreen) this.f294659w, continuation, 26);
                gVar25.v = obj2;
                return gVar25;
            case 27:
                g gVar26 = new g((com.revolut.feature.insurance.impl.ui.cfac.claim.expense_details.b) this.f294659w, continuation, 27);
                gVar26.v = obj2;
                return gVar26;
            case 28:
                g gVar27 = new g((wj9.i) this.f294659w, continuation, 28);
                gVar27.v = obj2;
                return gVar27;
            default:
                g gVar28 = new g((AtmMapScreen) this.f294659w, continuation, 29);
                gVar28.v = obj2;
                return gVar28;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g) create((Date) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((g) create((e1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((g) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((g) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((g) create((w85.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((g) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                ((g) create((Throwable) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return Boolean.TRUE;
            case 11:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((g) create((e7l.f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((g) create((PixQrCodeDecodeData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((g) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((g) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((g) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((g) create((jg0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((g) create((cv3.h) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((g) create((dz3.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((g) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((g) create((wi6.p) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((g) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((g) create((e60.l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((g) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g) create((v) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v112, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v60, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v66, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v4 */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        wi6.q qVar;
        Collection collectionValues;
        int i = this.u;
        int i2 = 7;
        int i3 = 10;
        int i5 = 26;
        int i6 = 5;
        int i21 = 29;
        int i22 = 0;
        int i32 = 1;
        int i33 = 6;
        setI1 = null;
        Set setI1 = null;
        Object obj3 = this.f294659w;
        switch (i) {
            case 0:
                Date date = (Date) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i iVar = (i) ((ChatTranscriptPeriodCalendarBottomSheetController) obj3).S.getValue();
                Intrinsics.h(date);
                LocalDate selectedDate = ebm.a.N(date);
                iVar.getClass();
                Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
                iVar.H2(iVar.f294660p, new w38.v(iVar, selectedDate, i3));
                return Unit.f186387a;
            case 1:
                e1 e1Var = (e1) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVar = (o) obj3;
                if (!Intrinsics.f(e1Var.a(), oVar.f294668p)) {
                    return Unit.f186387a;
                }
                if (e1Var instanceof b1) {
                    oVar.f294668p = null;
                    String str = e1Var.a().f55716a;
                    if (Intrinsics.f(str, "shot_scheduled_pdf")) {
                        oVar.V2(new vmf.k(oVar, , i5), new yi5.b(i21));
                    } else if (Intrinsics.f(str, "shot_generated_pdf")) {
                        Parcelable parcelable = e1Var.a().f55719g;
                        Transcript transcript = parcelable instanceof Transcript ? (Transcript) parcelable : null;
                        if (transcript != null) {
                            oVar.V2(new w3k.i(oVar, transcript, , i33), new yi5.b(i21));
                        }
                    }
                } else if (e1Var instanceof c1) {
                    oVar.f294668p = null;
                } else if (!(e1Var instanceof d1)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((w56.p) this.v).C2(new w56.h(((i56.h) obj3).f158775b));
                return Unit.f186387a;
            case 3:
                Data data = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                w6h.e eVar = (w6h.e) obj3;
                eVar.X2(eVar.o, new w56.o(data, i32));
                return Unit.f186387a;
            case 4:
                Data data2 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                w75.l lVar = (w75.l) obj3;
                lVar.H2(lVar.f295482t, new w56.o(data2, 2));
                return Unit.f186387a;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.c) this.v).C2(new w7b.j((e93.f) obj3));
                return Unit.f186387a;
            case 6:
                Data data3 = (Data) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                w7f.f fVar = (w7f.f) obj3;
                fVar.X2(fVar.o, new w56.o(data3, 4));
                return Unit.f186387a;
            case 7:
                w85.d dVar = (w85.d) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((w85.h) obj3).x2(new w3c.n(dVar, 13));
                return Unit.f186387a;
            case 8:
                Data data4 = (Data) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                w86.k kVar = (w86.k) obj3;
                kVar.H2(kVar.f295598q, new w56.o(data4, i6));
                return Unit.f186387a;
            case 9:
                ty0.a data5 = (ty0.a) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                w8l.f fVarE3 = ((OffboardingScreen) obj3).R2();
                Intrinsics.h(data5);
                w8l.j jVar = (w8l.j) fVarE3;
                jVar.getClass();
                Intrinsics.checkNotNullParameter(data5, "data");
                jVar.C1(new ExternalDestination.Browser(data5.f275445a, null));
                return Unit.f186387a;
            case 10:
                Throwable th10 = (Throwable) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                w8l.j jVar2 = (w8l.j) obj3;
                jVar2.H2(jVar2.f295659q, new w56.o(new Data(null, th10, false, 5, null), i33));
                return Boolean.TRUE;
            case 11:
                Data data6 = (Data) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                w9a.g gVar = (w9a.g) obj3;
                gVar.H2(gVar.f295702p, new w56.o(data6, i2));
                return Unit.f186387a;
            case 12:
                e7l.f fVar2 = (e7l.f) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((wb3.m) obj3).x2(new lh6.k(fVar2, 1));
                return Unit.f186387a;
            case 13:
                PixQrCodeDecodeData pixQrCodeDecodeData = (PixQrCodeDecodeData) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e0 e0Var = (e0) obj3;
                e0Var.H2(e0Var.f296072t, new kba.d(pixQrCodeDecodeData, 1));
                return Unit.f186387a;
            case 14:
                ty0.a aVar15 = (ty0.a) this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (Intrinsics.f(aVar15.f275445a, "CryptoDepositReturnDetails_LearnMore_ClickId")) {
                    wbj.f fVar3 = (wbj.f) ((CryptoDepositReturnDetailsBottomSheetController) obj3).h3();
                    fVar3.getClass();
                    fVar3.C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit("question.retrieving-unsupported-returns-from-external-exchange", 6), (SharedFaqDestination.PassthroughData) null, false, 14));
                }
                return Unit.f186387a;
            case 15:
                Data data7 = (Data) this.v;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                wbj.f fVar4 = (wbj.f) obj3;
                fVar4.H2(fVar4.f296237r, new w56.o(data7, 15));
                return Unit.f186387a;
            case 16:
                String str2 = (String) this.v;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar = ((wbk.h) obj3).f296247c;
                String strQ = j6.a.q("KEY_RECEIVER_INTRO_", str2);
                wbk.h.Companion.getClass();
                vbk.f fVar5 = (vbk.f) cVar.T2(strQ, wbk.h.e);
                if (fVar5 != null) {
                    return ce9.m.J(fVar5);
                }
                return null;
            case 17:
                String inputText = (String) this.v;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                wca.l lVar2 = (wca.l) ((TokenVerificationScreen) obj3).P.getValue();
                Intrinsics.h(inputText);
                lVar2.getClass();
                Intrinsics.checkNotNullParameter(inputText, "inputText");
                lVar2.H2(lVar2.f296378r, new wb3.k(inputText, i32));
                if (inputText.length() == 6) {
                    lVar2.C2(new wca.f(inputText));
                }
                return Unit.f186387a;
            case 18:
                jg0.a aVar20 = (jg0.a) this.v;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return t1.E(new v1(new d0(aVar20, (toh.d) obj3, aVar20.f173892a, (Continuation) null, 18)));
            case 19:
                cv3.h type = (cv3.h) this.v;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                wf4.h hVar = (wf4.h) ((CreditOfferTypeSelectionScreen) obj3).O.getValue();
                hVar.getClass();
                Intrinsics.checkNotNullParameter(type, "type");
                hVar.l2(new w3k.i(hVar, type, , i5), new yi5.b(i5));
                return Unit.f186387a;
            case 20:
                Data data8 = (Data) this.v;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((x) obj3).x2(new w56.o(data8, 17));
                return Unit.f186387a;
            case 21:
                Data data9 = (Data) this.v;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.flow.b bVar = (com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.flow.b) obj3;
                bVar.H2(bVar.f86918s, new wgd.k(data9, i22));
                return Unit.f186387a;
            case 22:
                dz3.a aVar25 = (dz3.a) this.v;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.repayment_method.a) ((SepaDirectDebitRepaymentMethodController) obj3).R2()).J2(new wh4.e(aVar25));
                return Unit.f186387a;
            case 23:
                Data data10 = (Data) this.v;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.repayment_method.a aVar28 = (com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.repayment_method.a) obj3;
                aVar28.H2(aVar28.f68361q, new wgd.k(data10, i32));
                return Unit.f186387a;
            case 24:
                Pair pair = (Pair) this.v;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                wi6.t tVarE3 = ((AccountsSelectionScreen) obj3).d();
                String listId = (String) pair.f186385a;
                Object obj4 = pair.f186386b;
                y yVar = tVarE3.f297833t;
                Intrinsics.checkNotNullParameter(listId, "listId");
                if (a0.H(listId, "account_list_item_", false)) {
                    String str3 = (String) (obj4 instanceof String ? obj4 : null);
                    if (str3 != null) {
                        tVarE3.H2(yVar, new wb3.k(tVarE3, str3, i6));
                    }
                } else if (a0.H(listId, "credit_list_item_", false)) {
                    String str4 = (String) (obj4 instanceof String ? obj4 : null);
                    if (str4 != null) {
                        tVarE3.H2(yVar, new wb3.k(tVarE3, str4, i33));
                    }
                } else if (a0.H(listId, "vault_list_item_", false)) {
                    String str5 = (String) (obj4 instanceof String ? obj4 : null);
                    if (str5 != null) {
                        tVarE3.H2(yVar, new wb3.k(tVarE3, str5, i2));
                    }
                } else if (a0.H(listId, "junior_list_item_", false)) {
                    String str6 = (String) (obj4 instanceof String ? obj4 : 0);
                    if (str6 != null) {
                        tVarE3.H2(yVar, new wb3.k(tVarE3, str6, 8));
                    }
                }
                return Unit.f186387a;
            case 25:
                wi6.p pVar = (wi6.p) this.v;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                wi6.t tVar = (wi6.t) obj3;
                fi6.d dVar2 = (fi6.d) pVar.f297823a.getContent();
                if (dVar2 == null) {
                    h0 h0Var = h0.f322473a;
                    qVar = new wi6.q(h0Var, h0Var, h0Var, h0Var);
                } else {
                    aim.o oVar2 = new aim.o();
                    List list = (List) dVar2.f135297a.getContent();
                    if (list != null) {
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            oVar2.add(((io3.d) it8.next()).f163145a);
                        }
                    }
                    List list2 = (List) dVar2.f135299c.getContent();
                    if (list2 != null) {
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            oVar2.add(((io3.d) it9.next()).f163145a);
                        }
                    }
                    List list3 = (List) dVar2.f135298b.getContent();
                    if (list3 != null) {
                        Iterator it10 = list3.iterator();
                        while (it10.hasNext()) {
                            oVar2.add(((io3.d) it10.next()).f163145a);
                        }
                    }
                    aim.o oVarA = y0.a(oVar2);
                    List list4 = dVar2.d;
                    ArrayList arrayList = new ArrayList(w.t(list4, 10));
                    Iterator it11 = list4.iterator();
                    while (it11.hasNext()) {
                        arrayList.add(((CreditCard) it11.next()).f69793b);
                    }
                    Set setI12 = zhm.d0.i1(arrayList);
                    List list5 = (List) dVar2.f135301h.getContent();
                    if (list5 == null) {
                        list5 = f0.f322471a;
                    }
                    fi6.i iVarA = fi6.j.a(list5);
                    aim.o oVar3 = new aim.o();
                    Iterator it12 = zhm.d0.E0(iVarA.f135317c, zhm.d0.E0(iVarA.f135316b, iVarA.f135315a)).iterator();
                    while (it12.hasNext()) {
                        String pocketId = ((Subaccount) it12.next()).getPocketId();
                        if (pocketId != null) {
                            oVar3.add(pocketId);
                        }
                    }
                    List list6 = (List) dVar2.i.getContent();
                    if (list6 != null) {
                        Iterator it13 = list6.iterator();
                        while (it13.hasNext()) {
                            oVar3.add(((uc3.a) it13.next()).f278974b.f163145a);
                        }
                    }
                    aim.o oVarA2 = y0.a(oVar3);
                    Map map = (Map) dVar2.f135302j.getContent();
                    if (map != null && (collectionValues = map.values()) != null) {
                        ArrayList arrayListU = w.u(collectionValues);
                        ArrayList arrayList2 = new ArrayList(w.t(arrayListU, 10));
                        Iterator it14 = arrayListU.iterator();
                        while (it14.hasNext()) {
                            arrayList2.add(((bs8.a) it14.next()).f18076a);
                        }
                        setI1 = zhm.d0.i1(arrayList2);
                    }
                    if (setI1 == null) {
                        setI1 = h0.f322473a;
                    }
                    qVar = new wi6.q(oVarA, setI12, oVarA2, setI1);
                }
                tVar.H2(tVar.f297833t, new wg2.g(pVar, qVar, i6));
                return Unit.f186387a;
            case 26:
                String str7 = (String) this.v;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (Intrinsics.f(str7, "LIST_ID_RESET_BUTTON")) {
                    com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.a aVar32 = (com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.a) ((BrPaymentLimitsUpdateScreen) obj3).R2();
                    aVar32.getClass();
                    aVar32.C2(new BrPaymentLimitsUpdateScreenContract$OutputData.LimitUpdated(null));
                }
                return Unit.f186387a;
            case 27:
                com.revolut.feature.insurance.impl.ui.cfac.claim.expense_details.b bVar2 = (com.revolut.feature.insurance.impl.ui.cfac.claim.expense_details.b) obj3;
                y yVar2 = bVar2.f75086t;
                e60.l lVar3 = (e60.l) this.v;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (lVar3 instanceof e60.m) {
                    ArrayList arrayListF1 = zhm.d0.f1(((wj7.i) ((j2) yVar2.f22677a).getValue()).f297981g);
                    arrayListF1.add(((e60.m) lVar3).b());
                    bVar2.H2(yVar2, new ua2.r(11, arrayListF1));
                }
                return Unit.f186387a;
            case 28:
                Pair pair2 = (Pair) this.v;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((wj9.i) obj3).x2(new w0((Data) pair2.f186385a, (Data) pair2.f186386b, 22));
                return Unit.f186387a;
            default:
                v event = (v) this.v;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.atm.impl.ui.redesign.v2.map.a aVar36 = (com.revolut.feature.atm.impl.ui.redesign.v2.map.a) ((wk2.m) ((AtmMapScreen) obj3).R.getValue());
                y yVar3 = aVar36.C;
                tk2.p pVar2 = aVar36.o;
                Intrinsics.checkNotNullParameter(event, "event");
                if (event instanceof wk2.o) {
                    c0 c0Var = aVar36.B;
                    if ((c0Var instanceof z) || (c0Var instanceof b0)) {
                        aVar36.B = wk2.a0.f298173a;
                        aVar36.B2();
                        aVar36.C2(aii.q.f5292a);
                    } else {
                        aVar36.B2();
                    }
                } else if (event instanceof wk2.p) {
                    aVar36.I2();
                } else if (event instanceof wk2.u) {
                    aVar36.L2();
                } else if (event instanceof wk2.t) {
                    Object objA = ((wk2.t) event).f298222a.a();
                    Atm atm = objA instanceof Atm ? (Atm) objA : null;
                    if (atm != null) {
                        tk2.o source = tk2.o.MAP;
                        pVar2.getClass();
                        Intrinsics.checkNotNullParameter(atm, "atm");
                        Intrinsics.checkNotNullParameter(source, "source");
                        pVar2.i.k(new tk2.a(atm, source));
                    }
                } else if (event instanceof wk2.r) {
                    aVar36.H2(yVar3, new wje.m(9));
                    c0 c0Var2 = aVar36.B;
                    if (c0Var2 instanceof b0) {
                        pVar2.a(new tk2.e(zv0.b.COLLAPSED));
                    } else if (c0Var2 instanceof z) {
                        pVar2.a(new tk2.b(zv0.b.COLLAPSED));
                    }
                } else if (event instanceof wk2.s) {
                    aVar36.A = ((wk2.s) event).f298221a;
                    if (aVar36.f63189x) {
                        aVar36.f63189x = false;
                        aVar36.I2();
                    } else if (aVar36.f63188w) {
                        aVar36.f63188w = false;
                        aVar36.v = false;
                        aVar36.I2();
                    } else if (!aVar36.v) {
                        aVar36.I2();
                    }
                } else {
                    if (!(event instanceof wk2.q)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar36.H2(yVar3, new wdb.b(event, i21));
                    GmsLatLngBounds bounds = ((wk2.q) event).f298219a;
                    pVar2.getClass();
                    Intrinsics.checkNotNullParameter(bounds, "bounds");
                    j2 j2Var = pVar2.u;
                    j2Var.getClass();
                    j2Var.g(null, bounds);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f294659w = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Continuation continuation, w56.p pVar, i56.h hVar) {
        super(2, continuation);
        this.u = 2;
        this.v = pVar;
        this.f294659w = hVar;
    }
}
