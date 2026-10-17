package bi2;

import au0.j4;
import aw0.t2;
import aw0.u2;
import aw0.v2;
import aw0.w2;
import be7.s;
import bij.e;
import blh.y;
import bmb.u;
import bn2.j0;
import bo8.b0;
import bq5.d0;
import bt9.w;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.data.model.Data;
import com.revolut.feature.business.referrals.ui.screens.referral_account.ReferralAccountScreen;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.cancellation.refund.CancellationRefundScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.upload_documents.files.UploadFilesListScreen;
import com.revolut.feature.junior_payment_links.api.model.PaymentLinkCustomAmountBundle;
import com.revolut.feature.junior_settings.impl.ui_kompot.account_details.screen.JuniorAccountDetailsController;
import com.revolut.feature.tax_residency.api.stamp_duty.models.StampDutyAccount;
import com.revolut.feature.tax_residency.impl.stamp_duty.ui.pay.PayStampDutyScreen;
import com.revolut.feature.transfer.core.impl.ui.troubleshooter.TransferTroubleshooterScreen;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.esim.impl.ui.screens.help_legacy.EsimHelpScreen;
import com.revolut.sso.api.R$string;
import com.revolut.sso.impl.domain.models.UserInfoAccount;
import ip0.f30;
import ip0.g30;
import ip0.h30;
import ip0.i30;
import ip0.j30;
import ip0.k30;
import ip0.l30;
import ip0.m30;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import nii.j1;
import nii.k1;
import nii.l1;
import nii.m1;
import nii.n1;
import nii.y0;
import nii.z;
import rnb.r;
import skm.a2;
import skm.e0;
import skm.p0;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f15387w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
        this.f15387w = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                n nVar = new n((o) this.f15387w, continuation, 0);
                nVar.v = obj2;
                return nVar;
            case 1:
                n nVar2 = new n((EsimHelpScreen) this.f15387w, continuation, 1);
                nVar2.v = obj2;
                return nVar2;
            case 2:
                n nVar3 = new n((com.revolut.feature.junior_payment_links.impl.ui.screen.card_profile.a) this.f15387w, continuation, 2);
                nVar3.v = obj2;
                return nVar3;
            case 3:
                n nVar4 = new n((bk9.j) this.f15387w, continuation, 3);
                nVar4.v = obj2;
                return nVar4;
            case 4:
                n nVar5 = new n((bl6.l) this.f15387w, continuation, 4);
                nVar5.v = obj2;
                return nVar5;
            case 5:
                n nVar6 = new n((com.revolut.feature.tab.invest.impl.ui.home.f) this.f15387w, continuation, 5);
                nVar6.v = obj2;
                return nVar6;
            case 6:
                n nVar7 = new n((com.revolut.sso.impl.ui.card_pin.card_pin.a) this.f15387w, continuation, 6);
                nVar7.v = obj2;
                return nVar7;
            case 7:
                n nVar8 = new n((com.revolut.feature.pay_with_smile.impl.ui.flow.enrollment.c) this.f15387w, continuation, 7);
                nVar8.v = obj2;
                return nVar8;
            case 8:
                n nVar9 = new n((u) this.f15387w, continuation, 8);
                nVar9.v = obj2;
                return nVar9;
            case 9:
                n nVar10 = new n((bmj.h) this.f15387w, continuation, 9);
                nVar10.v = obj2;
                return nVar10;
            case 10:
                n nVar11 = new n((j0) this.f15387w, continuation, 10);
                nVar11.v = obj2;
                return nVar11;
            case 11:
                n nVar12 = new n((bn8.d) this.f15387w, continuation, 11);
                nVar12.v = obj2;
                return nVar12;
            case 12:
                n nVar13 = new n((JuniorAccountDetailsController) this.f15387w, continuation, 12);
                nVar13.v = obj2;
                return nVar13;
            case 13:
                n nVar14 = new n((b0) this.f15387w, continuation, 13);
                nVar14.v = obj2;
                return nVar14;
            case 14:
                n nVar15 = new n((com.revolut.feature.tax_residency.impl.flows.missing.b) this.f15387w, continuation, 14);
                nVar15.v = obj2;
                return nVar15;
            case 15:
                n nVar16 = new n((bpc.c) this.f15387w, continuation, 15);
                nVar16.v = obj2;
                return nVar16;
            case 16:
                n nVar17 = new n((bpd.e) this.f15387w, continuation, 16);
                nVar17.v = obj2;
                return nVar17;
            case 17:
                n nVar18 = new n((PayStampDutyScreen) this.f15387w, continuation, 17);
                nVar18.v = obj2;
                return nVar18;
            case 18:
                n nVar19 = new n((bpl.j) this.f15387w, continuation, 18);
                nVar19.v = obj2;
                return nVar19;
            case 19:
                return new n((com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a) this.v, (CryptoAddress) this.f15387w, continuation, 19);
            case 20:
                n nVar20 = new n((CancellationRefundScreen) this.f15387w, continuation, 20);
                nVar20.v = obj2;
                return nVar20;
            case 21:
                n nVar21 = new n((UploadFilesListScreen) this.f15387w, continuation, 21);
                nVar21.v = obj2;
                return nVar21;
            case 22:
                n nVar22 = new n((br7.m) this.f15387w, continuation, 22);
                nVar22.v = obj2;
                return nVar22;
            case 23:
                n nVar23 = new n((com.revolut.feature.salary_switch.impl.ui.brazil.screen.status.a) this.f15387w, continuation, 23);
                nVar23.v = obj2;
                return nVar23;
            case 24:
                n nVar24 = new n((TransferTroubleshooterScreen) this.f15387w, continuation, 24);
                nVar24.v = obj2;
                return nVar24;
            case 25:
                n nVar25 = new n((brf.f) this.f15387w, continuation, 25);
                nVar25.v = obj2;
                return nVar25;
            case 26:
                n nVar26 = new n((bse.e) this.f15387w, continuation, 26);
                nVar26.v = obj2;
                return nVar26;
            case 27:
                return new n((ReferralAccountScreen) this.v, (NavBarWithToolbar) this.f15387w, continuation, 27);
            case 28:
                n nVar27 = new n((ReferralAccountScreen) this.f15387w, continuation, 28);
                nVar27.v = obj2;
                return nVar27;
            default:
                n nVar28 = new n((w) this.f15387w, continuation, 29);
                nVar28.v = obj2;
                return nVar28;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((n) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((n) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((n) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((n) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((n) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((n) create((NaviCommand) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((n) create((tll.m) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((n) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((n) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((n) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((n) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((n) create((Map) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((n) create((m30) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((n) create((vf0.h) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((n) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((n) create((bpc.n) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((n) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((n) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((n) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((n) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((n) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((n) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((n) create((e60.l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((n) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((n) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((n) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((n) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((n) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((n) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((n) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v67, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v76, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v93, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        int i = this.u;
        int i2 = 18;
        int i3 = 8;
        int i5 = 17;
        int i6 = 12;
        int i21 = 2;
        int i22 = 26;
        int i32 = 1;
        int i33 = 3;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Continuation continuation = null;
        Object obj3 = this.f15387w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVar = (o) obj3;
                oVar.H2(oVar.f15392t, new beb.p(data, i3));
                return Unit.f186387a;
            case 1:
                ty0.a aVar2 = (ty0.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bij.f fVar = (bij.f) ((EsimHelpScreen) obj3).R.getValue();
                String id10 = aVar2.f275445a;
                bij.k kVar = (bij.k) fVar;
                kVar.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                if (Intrinsics.f(id10, "ID_TERMS_URL")) {
                    kVar.C2(e.f.f15516a);
                }
                return Unit.f186387a;
            case 2:
                Data data2 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.junior_payment_links.impl.ui.screen.card_profile.a aVar5 = (com.revolut.feature.junior_payment_links.impl.ui.screen.card_profile.a) obj3;
                aVar5.H2(aVar5.v, new beb.p(data2, 11));
                return Unit.f186387a;
            case 3:
                Data data3 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bk9.j jVar = (bk9.j) obj3;
                jVar.H2(jVar.f16292q, new beb.p(data3, 15));
                return Unit.f186387a;
            case 4:
                Data data4 = (Data) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bl6.l lVar = (bl6.l) obj3;
                lVar.H2(lVar.f16485p, new beb.p(data4, 19));
                return Unit.f186387a;
            case 5:
                NaviCommand naviCommand = (NaviCommand) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.tab.invest.impl.ui.home.f fVar2 = (com.revolut.feature.tab.invest.impl.ui.home.f) obj3;
                fVar2.g0 = true;
                fVar2.C1(new BridgeDestination(naviCommand));
                return Unit.f186387a;
            case 6:
                tll.m mVar = (tll.m) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (Intrinsics.f(mVar, tll.i.f272113a)) {
                    com.revolut.sso.impl.ui.card_pin.card_pin.a aVar10 = (com.revolut.sso.impl.ui.card_pin.card_pin.a) obj3;
                    yji.l.b1(aVar10, aVar10.X1(new y0("DIALOG_ID_VERIFICATION_ATTEMPT_REJECTED", new z(new TextLocalisedClause(R$string.revolut_sso_login_cardpin_rejection_attempt_popup_title, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_login_cardpin_rejection_attempt_popup_description, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_login_cardpin_rejection_attempt_popup_primary_button, null, null, 14), null, null, null, true, null, null, null, null, null, null, 32500), false, 4)), null, new bf5.a(aVar10, continuation, 16), 3);
                } else if (!Intrinsics.f(mVar, tll.h.f272112a) && !Intrinsics.f(mVar, tll.k.f272115a) && !Intrinsics.f(mVar, tll.j.f272114a) && !Intrinsics.f(mVar, tll.l.f272116a) && !(mVar instanceof tll.g)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 7:
                n1 n1Var = (n1) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if ((n1Var instanceof l1) || (n1Var instanceof m1) || (n1Var instanceof j1)) {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Result = " + n1Var + " isn't supported by the flow");
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                } else {
                    if (!(n1Var instanceof k1)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((com.revolut.feature.pay_with_smile.impl.ui.flow.enrollment.c) obj3).C2(aii.q.f5292a);
                }
                return Unit.f186387a;
            case 8:
                Data data5 = (Data) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u uVar = (u) obj3;
                uVar.H2(uVar.f16808w, new beb.p(data5, 29));
                return Unit.f186387a;
            case 9:
                Data data6 = (Data) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bmj.h hVar = (bmj.h) obj3;
                hVar.H2(hVar.f16844r, new bmj.g(data6, objArr == true ? 1 : 0));
                return Unit.f186387a;
            case 10:
                Data data7 = (Data) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return (Map) iii.c.f(data7, new y(i5), new bk6.n(i2), new b88.o((j0) obj3, i6));
            case 11:
                Map map = (Map) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return nim.a.v(((bn8.d) obj3).d.c(map.keySet(), w4l.h.f294642c, null), new y(i22));
            case 12:
                m30 model = (m30) this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bo8.m mVarD3 = ((JuniorAccountDetailsController) obj3).R2();
                Intrinsics.h(model);
                b0 b0Var = (b0) mVarD3;
                xi8.b bVar = b0Var.f17304w;
                Intrinsics.checkNotNullParameter(model, "model");
                if (model instanceof j30) {
                    b0Var.l2(new bo8.u(b0Var, continuation, i32), new yi5.b(i22));
                } else if (model instanceof f30) {
                    Object obj4 = ((f30) model).f164188a.f58324n;
                    if (obj4 instanceof ri8.b) {
                        b0Var.C2(new bo8.e(((ri8.b) obj4).f254567a));
                    } else if (obj4 instanceof ri8.a) {
                        b0Var.C2(bo8.f.f17314a);
                    } else if (obj4 instanceof ri8.c) {
                        ri8.c cVar = (ri8.c) obj4;
                        b0Var.C1(bVar.b(cVar.f254568a, cVar.f254569b));
                    }
                } else if (model instanceof i30) {
                    w2 w2Var = ((i30) model).f164635a;
                    Object content = ((bo8.b) ((j2) b0Var.z.f22677a).getValue()).f17296a.getContent();
                    if (content == null) {
                        throw new IllegalArgumentException("JuniorAccountDetailsControllerModel::onContentClick cannot be called on null DomainState::juniorInfo::content");
                    }
                    bo8.d dVar = (bo8.d) content;
                    PaymentLinkCustomAmountBundle paymentLinkCustomAmountBundle = dVar.f;
                    if (w2Var instanceof v2) {
                        b0Var.v.c(null, paymentLinkCustomAmountBundle.a() ? j6.a.q("@", dVar.d) : bVar.a(dVar.e, paymentLinkCustomAmountBundle), false, new bc1.b(b0Var, i2));
                    } else if (w2Var instanceof t2) {
                        b0Var.C2(new bo8.e(paymentLinkCustomAmountBundle));
                    } else if (!(w2Var instanceof u2)) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (!(model instanceof g30) && !(model instanceof h30) && !(model instanceof k30) && !(model instanceof l30)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 13:
                vf0.h hVar2 = (vf0.h) this.v;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b0 b0Var2 = (b0) obj3;
                b0Var2.H2(b0Var2.z, new a5b.b((Data) hVar2.f288433a, (Data) hVar2.f288434b, (od0.i) hVar2.f288435c, (bo8.a) hVar2.d, 8));
                return Unit.f186387a;
            case 14:
                CoroutineScope coroutineScope = (CoroutineScope) this.v;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                p0 p0Var = p0.f264001a;
                return e0.C(coroutineScope, zkm.o.f323119a, null, new bf5.a((com.revolut.feature.tax_residency.impl.flows.missing.b) obj3, continuation, 21), 2);
            case 15:
                bpc.n parcel = (bpc.n) this.v;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bpc.g gVar = ((bpc.c) obj3).f17576c;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                if (parcel instanceof bpc.m) {
                    int i43 = bpc.e.f17577a[((bpc.m) parcel).f17588a.ordinal()];
                    if (i43 == 1) {
                        gVar.A2(new ExternalDestination.Browser("https://www.sipc.org/", null));
                    } else if (i43 == 2 || i43 == 3) {
                        gVar.A2(new BridgeDestination(new FeatureCommand(new FaqFeatureConfig.Starter("question.how-are-my-investments-with-revolut-protected", 2))));
                    } else {
                        if (i43 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Unit unit = Unit.f186387a;
                    }
                } else {
                    if (!(parcel instanceof bpc.l)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    j60.a.v(gVar.f17579l, false, null, 3);
                }
                return Unit.f186387a;
            case 16:
                Pair pair = (Pair) this.v;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return ((r) ((bpd.e) obj3).f17601b).g((List) pair.f186385a, (xi0.b) pair.f186386b, null);
            case 17:
                ty0.a aVar21 = (ty0.a) this.v;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bpe.g gVar2 = (bpe.g) ((PayStampDutyScreen) obj3).P.getValue();
                String listId = aVar21.f275445a;
                Object obj5 = aVar21.d;
                bpe.k kVar2 = (bpe.k) gVar2;
                kVar2.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                if (!Intrinsics.f(listId, "FAQ_LINK")) {
                    throw new IllegalArgumentException("unknown item: " + listId + " ; " + obj5);
                }
                StampDutyAccount stampDutyAccount = kVar2.o.f90146b;
                if (stampDutyAccount instanceof StampDutyAccount.Personal) {
                    str = "question.stamp-duty-for-retail-account-jnte";
                } else {
                    if (!(stampDutyAccount instanceof StampDutyAccount.Joint) && !Intrinsics.f(stampDutyAccount, StampDutyAccount.Pro.f89993a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "question.stamp-duty-for-retail-account-specific-scenarios-gGfb";
                }
                kVar2.C2(new bpe.f(str));
                return Unit.f186387a;
            case 18:
                Data data8 = (Data) this.v;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                UserInfoAccount userInfoAccount = (UserInfoAccount) data8.component1();
                if (userInfoAccount != null) {
                    bpl.j jVar2 = (bpl.j) obj3;
                    jVar2.H2(jVar2.f17643r, new bhl.g(userInfoAccount, 23));
                }
                return Unit.f186387a;
            case 19:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a) this.v).C2(new d0((CryptoAddress) obj3));
                return Unit.f186387a;
            case 20:
                ty0.a aVar25 = (ty0.a) this.v;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((bq7.l) ((bq7.h) ((CancellationRefundScreen) obj3).Z.getValue())).y2(aVar25.d, aVar25.f275445a);
                return Unit.f186387a;
            case 21:
                ty0.a aVar27 = (ty0.a) this.v;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((br7.m) ((UploadFilesListScreen) obj3).T2()).y2(aVar27.d, aVar27.f275445a);
                return Unit.f186387a;
            case 22:
                e60.l lVar2 = (e60.l) this.v;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                br7.m mVar2 = (br7.m) obj3;
                if ((lVar2 instanceof e60.m) && !((br7.e) mVar2.t2()).f17937c.contains(((e60.m) lVar2).b())) {
                    mVar2.x2(new br7.k(lVar2, objArr2 == true ? 1 : 0));
                }
                return Unit.f186387a;
            case 23:
                Data data9 = (Data) this.v;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.salary_switch.impl.ui.brazil.screen.status.a aVar31 = (com.revolut.feature.salary_switch.impl.ui.brazil.screen.status.a) obj3;
                aVar31.H2(aVar31.f85306s, new bmj.g(data9, 7));
                return Unit.f186387a;
            case 24:
                Object parcel2 = this.v;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                brf.f fVar3 = (brf.f) ((TransferTroubleshooterScreen) obj3).Z.getValue();
                Intrinsics.h(parcel2);
                fVar3.getClass();
                Intrinsics.checkNotNullParameter(parcel2, "parcel");
                fVar3.l2(new s(fVar3, parcel2, (Continuation) null), new yi5.b(i22));
                return Unit.f186387a;
            case 25:
                Data data10 = (Data) this.v;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((brf.f) obj3).x2(new bmj.g(data10, i3));
                return Unit.f186387a;
            case 26:
                Data data11 = (Data) this.v;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bse.e eVar = (bse.e) obj3;
                eVar.H2(eVar.f18180q, new bmj.g(data11, i6));
                return Unit.f186387a;
            case 27:
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ReferralAccountScreen referralAccountScreen = (ReferralAccountScreen) this.v;
                NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) obj3;
                Intrinsics.h(navBarWithToolbar);
                ReferralAccountScreen.Companion aVar36 = ReferralAccountScreen.INSTANCE;
                referralAccountScreen.getClass();
                navBarWithToolbar.m0(j4.FADE);
                navBarWithToolbar.i0();
                return Unit.f186387a;
            case 28:
                String query = (String) this.v;
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bt2.h hVarE3 = ((ReferralAccountScreen) obj3).R2();
                Intrinsics.h(query);
                bt2.k kVar3 = (bt2.k) hVarE3;
                kVar3.getClass();
                Intrinsics.checkNotNullParameter(query, "query");
                a2 a2Var = kVar3.f18270r;
                if (a2Var != null) {
                    a2Var.f(null);
                }
                String query2 = kotlin.text.d0.e0(query, "@");
                boolean z = query2.length() >= 3;
                kVar3.H2(kVar3.f18269q, new a31.i(query, z, i21));
                if (z) {
                    rs2.n nVar = (rs2.n) kVar3.o;
                    nVar.getClass();
                    Intrinsics.checkNotNullParameter(query2, "query");
                    kVar3.f18270r = yji.l.b1(kVar3, new amh.w(vkm.q.Q(nVar.k.c(query2, true), new r3k.c(continuation, nVar, i6)), i22), null, new bt2.j(kVar3, continuation, i33), 3);
                }
                return Unit.f186387a;
            default:
                Data data12 = (Data) this.v;
                fim.a aVar38 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((w) obj3).x2(new bmj.g(data12, i5));
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f15387w = obj2;
    }
}
