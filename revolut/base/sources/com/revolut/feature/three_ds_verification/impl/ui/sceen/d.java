package com.revolut.feature.three_ds_verification.impl.ui.sceen;

import a41.j1;
import cli.n;
import cli.y;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.error.data.model.ServerErrorException;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.domain.models.topup.methods.TopupMethod;
import com.revolut.domain.models.topup.methods.TopupMethodType;
import com.revolut.domain.models.transactions.InsufficientFunds;
import com.revolut.domain.models.transactions.ThreeDSTransaction;
import com.revolut.feature.cards_core.R$string;
import com.revolut.feature.checkout.add_money_methods.api.model.AddMoneyMethod;
import com.revolut.feature.three_ds_verification.impl.ui.sceen.ThreeDsVerificationScreenContract$ModalStep;
import com.revolut.feature.topup_screen.common.TopUpTarget;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.balance.picker.api.interactor.BalancesInteractor$InputData;
import g48.r0;
import ise.b0;
import ise.f0;
import ise.g0;
import ise.i0;
import ise.j0;
import ise.m0;
import ise.n0;
import ise.o;
import ise.p;
import ise.x;
import ise.z;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m2j.j;
import nii.y0;
import oki.h;
import org.jetbrains.annotations.NotNull;
import retrofit2.HttpException;
import rp0.t;
import vkm.j2;
import vkm.q;
import yji.l;
import zhm.h0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends h implements i0 {

    @NotNull
    public static final o Companion = new o();
    public final v8i.a A;
    public final v5i.b B;
    public final zte.b C;
    public final aue.d D;
    public final xye.d E;
    public final o7.b F;
    public final r10.d G;
    public final al4.b H;
    public final j2 I;
    public final j2 J;
    public final j2 K;
    public final j2 L;
    public final y M;
    public final com.revolut.kompot.navigable.vc.modal.a N;
    public final h61.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l93.f f90428p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final mt8.d f90429q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final hj8.a f90430r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b90.a f90431s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final r0 f90432t;
    public final f0 u;
    public final j60.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final lh3.a f90433w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final o8l.c f90434x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final w5i.d f90435y;
    public final z5i.c z;

    public d(n stateMapper, ThreeDsVerificationScreenContract$InputData inputData, h61.c threeDsInteractor, l93.f cardsInteractor, mt8.d kycInteractor, hj8.a juniorProfileInteractor, b90.a pushMessagesTools, r0 jointAccountsInteractor, f0 threeDsVerificationDialogProvider, j60.a bottomExpandableDialogExtension, lh3.a addMoneyMethodsInteractor, o8l.c moveMoneyInteractor, w5i.d moveMoneyQuoteInteractor, z5i.c moveMoneyExtraInfoProvider, v8i.a moveMoneyOrderQuoteMapper, v5i.b footerClicksControllerExtension, zte.b cardPaymentsTopUpDialogs, aue.d topUpLimitUiModelMapper, xye.d topUpLimitsControllerInputFactory, o7.b topUpLimitsErrorInteractor, r10.d threeDsTopUpDialogProvider, al4.b comboCardInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(threeDsInteractor, "threeDsInteractor");
        Intrinsics.checkNotNullParameter(cardsInteractor, "cardsInteractor");
        Intrinsics.checkNotNullParameter(kycInteractor, "kycInteractor");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(pushMessagesTools, "pushMessagesTools");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(threeDsVerificationDialogProvider, "threeDsVerificationDialogProvider");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogExtension, "bottomExpandableDialogExtension");
        Intrinsics.checkNotNullParameter(addMoneyMethodsInteractor, "addMoneyMethodsInteractor");
        Intrinsics.checkNotNullParameter(moveMoneyInteractor, "moveMoneyInteractor");
        Intrinsics.checkNotNullParameter(moveMoneyQuoteInteractor, "moveMoneyQuoteInteractor");
        Intrinsics.checkNotNullParameter(moveMoneyExtraInfoProvider, "moveMoneyExtraInfoProvider");
        Intrinsics.checkNotNullParameter(moveMoneyOrderQuoteMapper, "moveMoneyOrderQuoteMapper");
        Intrinsics.checkNotNullParameter(footerClicksControllerExtension, "footerClicksControllerExtension");
        Intrinsics.checkNotNullParameter(cardPaymentsTopUpDialogs, "cardPaymentsTopUpDialogs");
        Intrinsics.checkNotNullParameter(topUpLimitUiModelMapper, "topUpLimitUiModelMapper");
        Intrinsics.checkNotNullParameter(topUpLimitsControllerInputFactory, "topUpLimitsControllerInputFactory");
        Intrinsics.checkNotNullParameter(topUpLimitsErrorInteractor, "topUpLimitsErrorInteractor");
        Intrinsics.checkNotNullParameter(threeDsTopUpDialogProvider, "threeDsTopUpDialogProvider");
        Intrinsics.checkNotNullParameter(comboCardInteractor, "comboCardInteractor");
        this.o = threeDsInteractor;
        this.f90428p = cardsInteractor;
        this.f90429q = kycInteractor;
        this.f90430r = juniorProfileInteractor;
        this.f90431s = pushMessagesTools;
        this.f90432t = jointAccountsInteractor;
        this.u = threeDsVerificationDialogProvider;
        this.v = bottomExpandableDialogExtension;
        this.f90433w = addMoneyMethodsInteractor;
        this.f90434x = moveMoneyInteractor;
        this.f90435y = moveMoneyQuoteInteractor;
        this.z = moveMoneyExtraInfoProvider;
        this.A = moveMoneyOrderQuoteMapper;
        this.B = footerClicksControllerExtension;
        this.C = cardPaymentsTopUpDialogs;
        this.D = topUpLimitUiModelMapper;
        this.E = topUpLimitsControllerInputFactory;
        this.F = topUpLimitsErrorInteractor;
        this.G = threeDsTopUpDialogProvider;
        this.H = comboCardInteractor;
        this.I = m72.b.y(null, null, true, 3, null);
        this.J = m72.b.y(null, null, true, 3, null);
        this.K = m72.b.y(null, null, true, 3, null);
        this.L = m72.b.y(null, null, true, 3, null);
        this.M = mra.d.b(this, new j0(inputData.f90406a, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), m0.NOT_REQUESTED, AccountId.Personal.f51414a, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), null, false), stateMapper, null, false, 12);
        this.N = hx7.e.a(this, new in1.a(this, 13));
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x01d6, code lost:
    
        if (kotlin.Unit.f186387a == r4) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.three_ds_verification.impl.ui.sceen.d r16, gim.c r17) {
        /*
            Method dump skipped, instruction units count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.three_ds_verification.impl.ui.sceen.d.I2(com.revolut.feature.three_ds_verification.impl.ui.sceen.d, gim.c):java.lang.Object");
    }

    public static g0 K2(AddMoneyMethod addMoneyMethod, g0 g0Var) {
        List listC;
        if (addMoneyMethod instanceof AddMoneyMethod.MoveMoney) {
            listC = u.c("insufficient_balance_move_money");
        } else {
            if (!(addMoneyMethod instanceof AddMoneyMethod.TopUp)) {
                throw new NoWhenBranchMatchedException();
            }
            listC = u.c("insufficient_balance_topup");
        }
        if (g0Var != null) {
            return new g0(g0Var.f168195a, g0Var.f168196b, listC);
        }
        return null;
    }

    public static /* synthetic */ void Q2(d dVar, xi0.b bVar, Throwable th10, int i) {
        if ((i & 2) != 0) {
            th10 = null;
        }
        dVar.P2(null, th10, bVar);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l2(new ise.y(0, this, null), new yi5.b(26));
        x xVar = new x(0, this, continuation);
        j2 j2Var = this.I;
        l.a1(this, q.Q(j2Var, xVar), null, null, new z(0, this, null), 3);
        j2 j2Var2 = this.J;
        j2 j2Var3 = this.L;
        l.a1(this, q.Q(q.q(yh5.b.e(j2Var, j2Var2, j2Var3)), new x(1, this, continuation)), null, null, new z(1, this, null), 3);
        l.a1(this, q.Q(q.q(yh5.b.e(j2Var, this.K, j2Var3)), new x(2, this, continuation)), null, null, new b0(0, this, null), 3);
        l.a1(this, q.Q(j2Var3, new x(3, this, continuation)), null, null, new b0(1, this, null), 3);
        l.a1(this, ((om4.f) this.H).b(), null, null, new a2g.q(this, continuation, 28), 3);
    }

    public final void J2() {
        ThreeDSTransaction threeDSTransaction = (ThreeDSTransaction) ((j0) ((j2) this.M.f22677a).getValue()).f168201b.getContent();
        if (threeDSTransaction != null) {
            l2(new ikf.g(this, threeDSTransaction, null, 15), new yi5.b(26));
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.N;
    }

    public final wkm.l L2(InsufficientFunds insufficientFunds) {
        String pocketId = insufficientFunds.f60533c;
        oh3.f fVar = (oh3.f) this.f90433w;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        j jVar = fVar.f225284a;
        k1j.d dVar = k1j.d.RETAIL;
        k1j.a[] elements = {k1j.a.POCKETS, k1j.a.SAVINGS, k1j.a.VAULTS, k1j.a.CRYPTO, k1j.a.COMMODITIES, k1j.a.JOINT_ACCOUNT, k1j.a.JOINT_VAULTS, k1j.a.PRO, k1j.a.CREDIT_CARDS};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return q.Q(rd0.e.b(nim.a.w(jVar.e(new BalancesInteractor$InputData(dVar, io3.l.CURRENT, kotlin.collections.d.y0(elements), h0.f322473a, null, null, null, null, 240), null), new oh3.a(0))), new k25.o(null, pocketId, fVar, 25));
    }

    public final void M2() {
        y yVar = this.M;
        ThreeDSTransaction threeDSTransaction = (ThreeDSTransaction) ((j0) ((j2) yVar.f22677a).getValue()).f168201b.getContent();
        j2 j2Var = (j2) yVar.f22677a;
        n0 n0Var = (n0) ((j0) j2Var.getValue()).f168202c.getContent();
        AddMoneyMethod addMoneyMethod = (AddMoneyMethod) ((j0) j2Var.getValue()).f.getContent();
        AccountWrapper accountWrapper = (AccountWrapper) ((j0) j2Var.getValue()).f168204h.getContent();
        InsufficientFunds insufficientFunds = threeDSTransaction != null ? threeDSTransaction.o : null;
        if (threeDSTransaction != null) {
            List list = threeDSTransaction.f60544q;
            if (n0Var != null) {
                if (n0Var.e) {
                    J2();
                    return;
                }
                if ((addMoneyMethod instanceof AddMoneyMethod.MoveMoney) && insufficientFunds != null) {
                    dj0.d dVar = insufficientFunds.f60531a;
                    if (accountWrapper != null) {
                        if (!list.isEmpty()) {
                            l2(new j1(this, dVar, ((AddMoneyMethod.MoveMoney) addMoneyMethod).f65826b, accountWrapper, (Object) null, (Continuation) null, 14), new yi5.b(26));
                            return;
                        } else {
                            final int i = 1;
                            l2(new j1(this, dVar, ((AddMoneyMethod.MoveMoney) addMoneyMethod).f65826b, accountWrapper, new Function0(this) { // from class: ise.n

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ com.revolut.feature.three_ds_verification.impl.ui.sceen.d f168218b;

                                {
                                    this.f168218b = this;
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i) {
                                        case 0:
                                            com.revolut.feature.three_ds_verification.impl.ui.sceen.d dVar2 = this.f168218b;
                                            dVar2.H2(dVar2.M, new isd.a(2));
                                            break;
                                        case 1:
                                            this.f168218b.J2();
                                            break;
                                        default:
                                            com.revolut.feature.three_ds_verification.impl.ui.sceen.d dVar3 = this.f168218b;
                                            dVar3.H2(dVar3.M, new isd.a(7));
                                            break;
                                    }
                                    return Unit.f186387a;
                                }
                            }, (Continuation) null, 14), new yi5.b(26));
                            return;
                        }
                    }
                }
                if (!(addMoneyMethod instanceof AddMoneyMethod.TopUp) || insufficientFunds == null) {
                    O2();
                    return;
                } else if (list.isEmpty()) {
                    final int i2 = 2;
                    R2(insufficientFunds, (AddMoneyMethod.TopUp) addMoneyMethod, new Function0(this) { // from class: ise.n

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ com.revolut.feature.three_ds_verification.impl.ui.sceen.d f168218b;

                        {
                            this.f168218b = this;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i2) {
                                case 0:
                                    com.revolut.feature.three_ds_verification.impl.ui.sceen.d dVar2 = this.f168218b;
                                    dVar2.H2(dVar2.M, new isd.a(2));
                                    break;
                                case 1:
                                    this.f168218b.J2();
                                    break;
                                default:
                                    com.revolut.feature.three_ds_verification.impl.ui.sceen.d dVar3 = this.f168218b;
                                    dVar3.H2(dVar3.M, new isd.a(7));
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    });
                    return;
                } else {
                    final int i3 = 0;
                    R2(insufficientFunds, (AddMoneyMethod.TopUp) addMoneyMethod, new Function0(this) { // from class: ise.n

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ com.revolut.feature.three_ds_verification.impl.ui.sceen.d f168218b;

                        {
                            this.f168218b = this;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i3) {
                                case 0:
                                    com.revolut.feature.three_ds_verification.impl.ui.sceen.d dVar2 = this.f168218b;
                                    dVar2.H2(dVar2.M, new isd.a(2));
                                    break;
                                case 1:
                                    this.f168218b.J2();
                                    break;
                                default:
                                    com.revolut.feature.three_ds_verification.impl.ui.sceen.d dVar3 = this.f168218b;
                                    dVar3.H2(dVar3.M, new isd.a(7));
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    });
                    return;
                }
            }
        }
        IllegalStateException illegalStateException = new IllegalStateException("Pending 3DS transaction cannot be null");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        O2();
    }

    public final void N2() {
        this.u.getClass();
        t tVar = new t(new TextLocalisedClause(R$string.three_ds_verification_screen_reject_challenge_alert_title, null, null, 14), null, null, 30);
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("CANCEL_TRANSACTION_POSITIVE_BUTTON_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.three_ds_verification_screen_reject_challenge_alert_action_reject, null, null, 14), false, null, null, null, null, 1000);
        yp0.b.r(model, 0, 0, 0, 0, 15);
        LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("CANCEL_TRANSACTION_NEGATIVE_BUTTON_ID", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_cancel, null, null, 14), false, null, null, null, null, 1000);
        yp0.b.r(model2, 0, R$attr.uikit_dp24, 0, 0, 13);
        this.v.x(new rp0.y(v.k(model, model2), tVar, null, null, null, null, 1020));
    }

    public final void O2() {
        X1(new y0(null, new nii.z(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.error_generic, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5));
    }

    public final void P2(String str, Throwable error, xi0.b bVar) {
        int i;
        y yVar = this.M;
        m0 m0Var = ((j0) ((j2) yVar.f22677a).getValue()).d;
        H2(yVar, new isd.a(3));
        if (error == null) {
            int i2 = p.f168227c[m0Var.ordinal()];
            if (i2 == 1) {
                J2();
                return;
            } else {
                if (i2 != 2 && i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
        r10.d dVar = this.G;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(error, "error");
        Continuation continuation = null;
        ServerError serverErrorC = error instanceof HttpException ? ((sf0.h) dVar.f250818a).c((HttpException) error) : error instanceof ServerErrorException ? ((ServerErrorException) error).f : null;
        zte.e eVar = zte.e.f325101a;
        zte.c cVar = zte.c.f325099a;
        Object dVar2 = (serverErrorC == null || (i = serverErrorC.f51362a) == 1026 || i == 9038) ? cVar : i != 100010 ? new zte.d(new y0(null, ((c1f.a) ((zte.b) dVar.f250819b)).a(serverErrorC), false, 5)) : eVar;
        if (dVar2 instanceof zte.d) {
            X1(((zte.d) dVar2).f325100a);
            return;
        }
        if (!dVar2.equals(eVar)) {
            if (!dVar2.equals(cVar)) {
                throw new NoWhenBranchMatchedException();
            }
            O2();
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, error, h0Var);
            Unit unit = Unit.f186387a;
            return;
        }
        if (str != null) {
            n2(new hsd.c(this, str, bVar, continuation, 26), new whi.b(6));
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Card id should present once show unverified card limit error result received");
        h0 h0Var2 = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var2);
        O2();
    }

    public final void R2(InsufficientFunds insufficientFunds, AddMoneyMethod.TopUp topUp, Function0 function0) {
        FlowStep topUpWithGooglePay;
        TopupMethod topupMethod = topUp.f65827a;
        dj0.d dVar = insufficientFunds.f60531a;
        y yVar = this.M;
        Object content = ((j0) ((j2) yVar.f22677a).getValue()).f168204h.getContent();
        if (content == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        AccountId accountId = ((j0) ((j2) yVar.f22677a).getValue()).e;
        int i = p.f168225a[((AccountWrapper) content).f97224a.ordinal()];
        TopUpTarget joint = (i == 1 && (accountId instanceof AccountId.Joint)) ? new TopUpTarget.Joint((AccountId.Joint) accountId) : i == 2 ? TopUpTarget.Pro.f90574a : i == 3 ? TopUpTarget.Main.f90573a : null;
        if (joint == null) {
            IllegalStateException illegalStateException = new IllegalStateException("topUpTarget is null");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            O2();
            return;
        }
        Intrinsics.checkNotNullParameter(joint, "<this>");
        String str = joint instanceof TopUpTarget.Joint ? ((TopUpTarget.Joint) joint).f90572a.f51413b : null;
        if (topupMethod instanceof TopupMethod.StoredMethod.Card) {
            topUpWithGooglePay = new ThreeDsVerificationScreenContract$ModalStep.TopUpWithExistingCard(joint, dVar, ((TopupMethod.StoredMethod.Card) topupMethod).f60455a, str);
        } else {
            boolean z = topupMethod instanceof TopupMethod.OtherMethod;
            topUpWithGooglePay = (z && ((TopupMethod.OtherMethod) topupMethod).f60440a == TopupMethodType.GOOGLE_PAY) ? new ThreeDsVerificationScreenContract$ModalStep.TopUpWithGooglePay(dVar, joint, str) : (z && ((TopupMethod.OtherMethod) topupMethod).f60440a == TopupMethodType.CARD) ? new ThreeDsVerificationScreenContract$ModalStep.AddNewTopUpCard(dVar, joint, str) : null;
        }
        if (topUpWithGooglePay != null) {
            h.v2(this.N, topUpWithGooglePay, ModalDestination.Style.POPUP.f98311a);
            function0.invoke();
            return;
        }
        IllegalStateException illegalStateException2 = new IllegalStateException("Top-up method not supported");
        h0 h0Var2 = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
        O2();
    }

    @Override // yji.l
    public final void T1(long j2) {
        InsufficientFunds insufficientFunds;
        ThreeDSTransaction threeDSTransaction = (ThreeDSTransaction) ((j0) ((j2) this.M.f22677a).getValue()).f168201b.getContent();
        if (threeDSTransaction == null || (insufficientFunds = threeDSTransaction.o) == null) {
            return;
        }
        l.a1(this, L2(insufficientFunds), null, null, new i4g.d(insufficientFunds, threeDSTransaction, this, (Continuation) null, 6), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.M;
    }
}
