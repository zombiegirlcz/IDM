package com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount;

import aw0.f4;
import c9k.l;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.payments.api.mapper.PaymentPocketInfo;
import com.revolut.feature.payments.transfers.personalisation.api.TransfersPersonalisationToggles$GalleryStylePicker;
import com.revolut.feature.payments.transfers.personalisation.api.navigation.StyleScreenInput;
import com.revolut.feature.payments.transfers.personalisation.api.navigation.TransfersPersonalisationInputData;
import com.revolut.feature.transfer.core.api.R$string;
import com.revolut.feature.transfer.core.api.interactor.ReferenceData;
import com.revolut.feature.transfer.core.api.schedule.ScheduleTransferInputData;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerCustomization;
import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerTransferInputData;
import com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.PeerToPeerAmountScreenContract$InputData;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import com.revolut.revolut.feature_fourthline_impl.R;
import d9k.j;
import gs.n;
import h2a.c;
import hrf.h;
import j9i.d;
import java.time.LocalDate;
import java.util.List;
import jki.g;
import jki.i;
import jki.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import org.jetbrains.annotations.NotNull;
import q8k.f;
import r9k.k;
import vkm.q;
import vkm.z1;
import z8k.d0;
import z8k.e0;
import z8k.i0;
import z8k.k0;
import z8k.l0;
import z8k.m0;
import z8k.n0;
import z8k.o0;
import z8k.p0;
import z8k.t;
import z8k.u;
import z8k.v0;
import z8k.x;
import z8k.x0;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends g implements e0 {

    @NotNull
    public static final k0 Companion = new k0();
    public final r9k.b A;
    public final n5k.b B;
    public final s5k.a C;
    public final j60.a D;
    public final n60.a E;
    public final d F;
    public final l2j.a G;
    public final w80.b H;
    public final e I;
    public final ldd.b J;
    public final to9.a K;
    public final c9k.a L;
    public final f M;
    public final aqf.b N;
    public final gte.a O;
    public final z1 P;
    public final t Q;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final PeerToPeerAmountScreenContract$InputData f102333p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l f102334q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a f102335r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p9k.a f102336s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final c f102337t;
    public final j u;
    public final d9k.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final zof.f f102338w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final b9k.d f102339x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final PeerToPeerTransferInputData f102340y;
    public final b9k.t z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(PeerToPeerAmountScreenContract$InputData inputData, l interactor, a router, p9k.a transferDataObserver, c personalisationAnimationChecker, j p2pNoteTypeMapper, d9k.b footerMapper, zof.f transferFeatureScreensProvider, b9k.d extraDataExtension, PeerToPeerTransferInputData peerToPeerTransferInputData, b9k.t reviewRequirementResolver, r9k.b validatorExtension, n5k.b paymentFeesDialogExtension, s5k.a transferWalletLimitsExtension, j60.a bottomDialogExtension, n60.a keyboardExtension, d reactionsKeyboardViewExtension, l2j.a currencyChooserFlowFactory, w80.b amountFormatter, e dateProvider, ldd.b focusRequesterDelegate, to9.a schedulePaymentChecksExtension, p stateMapper, c9k.a peerToPeerAmountBalancesFilterInteractor, f peerToPeerChecksExtension, aqf.b transferExecutionLoadingController, gte.a featureToggleInteractor) {
        Pair pair;
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(transferDataObserver, "transferDataObserver");
        Intrinsics.checkNotNullParameter(personalisationAnimationChecker, "personalisationAnimationChecker");
        Intrinsics.checkNotNullParameter(p2pNoteTypeMapper, "p2pNoteTypeMapper");
        Intrinsics.checkNotNullParameter(footerMapper, "footerMapper");
        Intrinsics.checkNotNullParameter(transferFeatureScreensProvider, "transferFeatureScreensProvider");
        Intrinsics.checkNotNullParameter(extraDataExtension, "extraDataExtension");
        Intrinsics.checkNotNullParameter(peerToPeerTransferInputData, "peerToPeerTransferInputData");
        Intrinsics.checkNotNullParameter(reviewRequirementResolver, "reviewRequirementResolver");
        Intrinsics.checkNotNullParameter(validatorExtension, "validatorExtension");
        Intrinsics.checkNotNullParameter(paymentFeesDialogExtension, "paymentFeesDialogExtension");
        Intrinsics.checkNotNullParameter(transferWalletLimitsExtension, "transferWalletLimitsExtension");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(keyboardExtension, "keyboardExtension");
        Intrinsics.checkNotNullParameter(reactionsKeyboardViewExtension, "reactionsKeyboardViewExtension");
        Intrinsics.checkNotNullParameter(currencyChooserFlowFactory, "currencyChooserFlowFactory");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(focusRequesterDelegate, "focusRequesterDelegate");
        Intrinsics.checkNotNullParameter(schedulePaymentChecksExtension, "schedulePaymentChecksExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(peerToPeerAmountBalancesFilterInteractor, "peerToPeerAmountBalancesFilterInteractor");
        Intrinsics.checkNotNullParameter(peerToPeerChecksExtension, "peerToPeerChecksExtension");
        Intrinsics.checkNotNullParameter(transferExecutionLoadingController, "transferExecutionLoadingController");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f102333p = inputData;
        this.f102334q = interactor;
        this.f102335r = router;
        this.f102336s = transferDataObserver;
        this.f102337t = personalisationAnimationChecker;
        this.u = p2pNoteTypeMapper;
        this.v = footerMapper;
        this.f102338w = transferFeatureScreensProvider;
        this.f102339x = extraDataExtension;
        this.f102340y = peerToPeerTransferInputData;
        this.z = reviewRequirementResolver;
        this.A = validatorExtension;
        this.B = paymentFeesDialogExtension;
        this.C = transferWalletLimitsExtension;
        this.D = bottomDialogExtension;
        this.E = keyboardExtension;
        this.F = reactionsKeyboardViewExtension;
        this.G = currencyChooserFlowFactory;
        this.H = amountFormatter;
        this.I = dateProvider;
        this.J = focusRequesterDelegate;
        this.K = schedulePaymentChecksExtension;
        this.L = peerToPeerAmountBalancesFilterInteractor;
        this.M = peerToPeerChecksExtension;
        this.N = transferExecutionLoadingController;
        this.O = featureToggleInteractor;
        this.P = q.b(1, 5, null);
        if (inputData instanceof PeerToPeerAmountScreenContract$InputData.NewTransfer) {
            pair = new Pair(null, Boolean.FALSE);
        } else {
            if (!(inputData instanceof PeerToPeerAmountScreenContract$InputData.WithTransferData)) {
                throw new NoWhenBranchMatchedException();
            }
            PeerToPeerAmountScreenContract$InputData.WithTransferData withTransferData = (PeerToPeerAmountScreenContract$InputData.WithTransferData) inputData;
            pair = new Pair(withTransferData.f102327l, Boolean.valueOf(withTransferData.f102329n));
        }
        PeerToPeerTransferData peerToPeerTransferData = (PeerToPeerTransferData) pair.f186385a;
        boolean zBooleanValue = ((Boolean) pair.f186386b).booleanValue();
        PeerToPeerRecipient f102321a = inputData.getF102321a();
        hrf.f f102322b = inputData.getF102322b();
        TransferFlowType f102323c = inputData.getF102323c();
        f0 f0Var = f0.f322471a;
        u uVar = new u(null, 0L, null, f0Var, new h(f0Var, f0Var, null), zBooleanValue);
        ReferenceData.INSTANCE.getClass();
        this.Q = new t(f102321a, f102322b, f102323c, peerToPeerTransferData, uVar, 0, new d0(ReferenceData.f92119c, null), false, false, inputData.getF102325h(), inputData.getI(), inputData.getF102326j(), inputData.getO());
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
    
        if (r5.D2(r6, r2, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A2(com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof z8k.a1
            if (r0 == 0) goto L13
            r0 = r6
            z8k.a1 r0 = (z8k.a1) r0
            int r1 = r0.f320156w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f320156w = r1
            goto L18
        L13:
            z8k.a1 r0 = new z8k.a1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f320156w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            goto L63
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            yhm.o.b(r6)
            goto L42
        L36:
            yhm.o.b(r6)
            r0.f320156w = r4
            java.lang.Object r6 = r5.E2(r0)
            if (r6 != r1) goto L42
            goto L62
        L42:
            dpf.c r6 = (dpf.c) r6
            dpf.a r2 = dpf.a.f116875a
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r6, r2)
            if (r2 != 0) goto L6c
            boolean r6 = r6 instanceof dpf.b
            if (r6 == 0) goto L66
            com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData r6 = r5.G2()
            com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.PeerToPeerAmountScreenContract$InputData r2 = r5.f102333p
            com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient r2 = r2.getF102321a()
            r0.f320156w = r3
            java.lang.Object r5 = r5.D2(r6, r2, r0)
            if (r5 != r1) goto L63
        L62:
            return r1
        L63:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L66:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L6c:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b.A2(com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b, gim.c):java.lang.Object");
    }

    public static final dj0.d y2(b bVar, String str) {
        PeerToPeerTransferData peerToPeerTransferDataG2 = bVar.G2();
        long jK = peerToPeerTransferDataG2.f102244a;
        xi0.b bVar2 = peerToPeerTransferDataG2.f102245b;
        xi0.b.Companion.getClass();
        xi0.b bVarA = xi0.a.a(str);
        if (bVar2.c() != bVarA.c()) {
            jK = (jK / cp5.d.k(bVar2)) * cp5.d.k(bVarA);
        }
        return new dj0.d(jK, bVarA);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object z2(com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b r9, com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData r10, gim.c r11) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b.z2(com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b, com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData, gim.c):java.lang.Object");
    }

    public final Object B2(gim.c cVar) {
        PeerToPeerTransferData peerToPeerTransferDataG2 = G2();
        hrf.c cVar2 = ((t) t2()).e.f320218a;
        long j2 = ((t) t2()).e.f320219b;
        PeerToPeerAmountScreenContract$InputData peerToPeerAmountScreenContract$InputData = this.f102333p;
        return q.x(((k) this.A).c(peerToPeerTransferDataG2, cVar2, j2, peerToPeerAmountScreenContract$InputData.getF102321a(), peerToPeerAmountScreenContract$InputData.getF102323c(), peerToPeerAmountScreenContract$InputData.getF102322b(), peerToPeerAmountScreenContract$InputData.getF102326j()), cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C2() {
        PeerToPeerTransferData peerToPeerTransferDataG2 = G2();
        Object[] objArr = 0;
        if (!peerToPeerTransferDataG2.f102258w) {
            l2(new o0(this, objArr == true ? 1 : 0, 1), new yi5.b(26));
            return;
        }
        this.E.R();
        PaymentPocketInfo paymentPocketInfo = ((t) t2()).e.f320220c;
        if (paymentPocketInfo == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        PeerToPeerTransferData peerToPeerTransferData = ((t) t2()).d;
        dj0.d dVar = peerToPeerTransferData != null ? peerToPeerTransferData.f102256s : null;
        if (dVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Image image = paymentPocketInfo.f79169a;
        Clause clause = paymentPocketInfo.f79170b;
        String str = peerToPeerTransferDataG2.v;
        TransfersPersonalisationToggles$GalleryStylePicker transfersPersonalisationToggles$GalleryStylePicker = TransfersPersonalisationToggles$GalleryStylePicker.f79955c;
        jte.d dVar2 = (jte.d) this.O;
        StyleScreenInput styleScreenInput = new StyleScreenInput(dVar, image, clause, str, dVar2.c(transfersPersonalisationToggles$GalleryStylePicker) ? g2a.a.GALLERY : g2a.a.HORIZONTAL_LIST);
        if (dVar2.c(transfersPersonalisationToggles$GalleryStylePicker)) {
            v2(new x(styleScreenInput, peerToPeerTransferDataG2, F2().f320165a, ((t) t2()).e.f));
        } else {
            f2(e1(new g2a.b(new TransfersPersonalisationInputData(styleScreenInput))), ModalDestination.Style.POPUP.f98311a, new z8g.q(peerToPeerTransferDataG2, this, 4));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D2(com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData r9, com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient r10, gim.c r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof z8k.r0
            if (r0 == 0) goto L13
            r0 = r11
            z8k.r0 r0 = (z8k.r0) r0
            int r1 = r0.f320205y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f320205y = r1
            goto L18
        L13:
            z8k.r0 r0 = new z8k.r0
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f320203w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f320205y
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient r10 = r0.v
            com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData r9 = r0.u
            yhm.o.b(r11)
        L2a:
            r4 = r9
            r5 = r10
            goto L45
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            yhm.o.b(r11)
            r0.u = r9
            r0.v = r10
            r0.f320205y = r3
            java.lang.Object r11 = r8.B2(r0)
            if (r11 != r1) goto L2a
            return r1
        L45:
            hrf.h r11 = (hrf.h) r11
            java.util.List r9 = r11.f154817a
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L6d
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.util.List r10 = r11.f154817a
            boolean r10 = r10.isEmpty()
            java.lang.String r11 = "Unhandled errors when trying to submit PTP scheduled transfer: isScheduleValid="
            java.lang.String r10 = com.google.android.gms.internal.mlkit_vision_face.a.r(r11, r10)
            r9.<init>(r10)
            zhm.h0 r10 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r11 = rd0.d.f253311a
            rd0.c r11 = rd0.c.ERROR
            r0 = 0
            rd0.d.a(r11, r0, r0, r9, r10)
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L6d:
            z8k.i0 r6 = new z8k.i0
            r9 = 4
            r6.<init>(r8, r9)
            z8k.p0 r2 = new z8k.p0
            r7 = 0
            r3 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            yi5.b r9 = new yi5.b
            r10 = 26
            r9.<init>(r10)
            r8.l2(r2, r9)
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b.D2(com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData, com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient, gim.c):java.lang.Object");
    }

    public final Object E2(gim.c frame) {
        eim.c cVar = new eim.c(fim.h.b(frame));
        PeerToPeerTransferData transferData = G2();
        this.f102335r.getClass();
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        TransferScheduleData transferScheduleData = transferData.f102252n;
        m1l.a aVar = transferData.f102251m;
        yji.l.g2(this, ((qpf.h) this.f102338w).d(new ScheduleTransferInputData((TextLocalisedClause) null, transferScheduleData, aVar, aVar == m1l.a.SCHEDULE_REQUIRED ? new TextLocalisedClause(R.string.common_action_schedule, null, null, 14) : new TextLocalisedClause(R$string.payments_transfer_schedule_action_set_schedule, null, null, 14), (List) null, false, (AnalyticsContext) null, (LocalDate) null, (LocalDate) null, false, false, false, 8177)), null, new xnd.c(this, cVar, 9), 1);
        Object objB = cVar.b();
        if (objB == fim.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objB;
    }

    public final d0 F2() {
        d0 d0Var = ((t) t2()).f320210g;
        if (d0Var != null) {
            return d0Var;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final PeerToPeerTransferData G2() {
        PeerToPeerTransferData peerToPeerTransferData = ((t) t2()).d;
        if (peerToPeerTransferData != null) {
            return peerToPeerTransferData;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void H2(Function1 function1) {
        x2(new z8g.q(function1, this, 5));
    }

    @Override // yji.l
    public final void I1() {
        ldd.b bVar = this.J;
        bVar.f194072c = false;
        PeerToPeerAmountScreenContract$InputData peerToPeerAmountScreenContract$InputData = this.f102333p;
        Continuation continuation = null;
        if ((peerToPeerAmountScreenContract$InputData instanceof PeerToPeerAmountScreenContract$InputData.WithTransferData) && (((PeerToPeerAmountScreenContract$InputData.WithTransferData) peerToPeerAmountScreenContract$InputData).f102327l.f102249j instanceof PeerToPeerCustomization.Personalisation)) {
            l2(new n0(this, null), new yi5.b(26));
        } else {
            bVar.b(new f4("ITEM_AMOUNT_INPUT_ID", true));
        }
        l2(new p0(this, null), new i0(this, 1));
        yji.l.a1(this, q.q(new v0(q2(), this, 1)), null, null, new x0(this, continuation, 1), 3);
    }

    @Override // yji.l
    public final void P1() {
        x2(new i0(this, 3));
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, q.Q(q.q(new y5j.e(q2(), 26)), new n(continuation, this, 6)), null, new l0(this, continuation, 1), 3);
        yji.l.b1(this, rd0.e.d(q.q(new v0(q.q(new y5j.e(q2(), 25)), this, 0)), h0.f322473a), null, new x0(this, continuation, 0), 3);
        PeerToPeerTransferData peerToPeerTransferData = ((t) t2()).d;
        if ((peerToPeerTransferData != null ? peerToPeerTransferData.f102249j : null) != null) {
            return;
        }
        n2(new m0(this, continuation, 0), new whi.b(6));
    }

    @Override // jki.g
    public final i r2() {
        return this.Q;
    }
}
