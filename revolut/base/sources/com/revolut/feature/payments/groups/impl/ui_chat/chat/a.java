package com.revolut.feature.payments.groups.impl.ui_chat.chat;

import blh.g0;
import bq5.o0;
import bs9.a0;
import bs9.b0;
import bs9.c0;
import bs9.e0;
import bs9.v;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.backgroundpicker.models.RetailThemeAgnosticBackgroundKey;
import com.revolut.feature.payments.api.PaymentsToggles$AsyncListAndMappingForGroupChat;
import com.revolut.feature.payments.api.PaymentsToggles$GroupChatMessagesEligibility;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import cu9.o;
import efm.r;
import er9.x;
import j9i.d;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.flow.Flow;
import ks9.e;
import ks9.i;
import ks9.r0;
import ks9.s;
import ks9.s0;
import lr9.p;
import lz0.g;
import mx0.a4;
import n60.b;
import oki.h;
import os9.c;
import q03.m;
import tx9.f;
import vkm.j2;
import vkm.q;
import yji.l;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements v {
    public final f A;
    public final b B;
    public final d C;
    public final wu9.h D;
    public final jt0.b E;
    public final gte.a F;
    public final is9.a G;
    public final c H;
    public final ks9.f I;
    public final pu9.c J;
    public final g K;
    public final o L;
    public final GroupChatScreenContract$InputData M;
    public final zjh.f N;
    public final cw9.d O;
    public final qu9.b P;
    public final d8k.f Q;
    public volatile boolean R;
    public final ihm.b S;
    public final ihm.b T;
    public final ihm.f U;
    public final ihm.f V;
    public final y W;
    public final com.revolut.kompot.navigable.vc.modal.a X;
    public final b9k.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final mq9.f f79346p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ks9.c f79347q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f79348r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final r0 f79349s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final s0 f79350t;
    public final e u;
    public final ks9.g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final r10.f f79351w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final pu9.b f79352x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final iu9.b f79353y;
    public final ks9.a z;

    public a(b9k.f interactor, mq9.f paymentsGroupsInteractor, ks9.c appFraudExtension, i settlingExtension, r0 trustingExtension, s0 validationActionExtension, e messageActionsExtension, ks9.g paymentExtension, r10.f groupChatMessagesInteractor, pu9.b activeChatInteractor, iu9.b chatInputValidator, ks9.a disclaimerActionExtension, f recentTimestampManager, b keyboardViewExtension, d reactionsKeyboardViewExtension, wu9.h reactionsDelegate, jt0.b debtsInteractor, gte.a featureToggleInteractor, is9.a groupContactChooserScreenProvider, c groupChatMembersInteractor, ks9.f messageClicksExtension, pu9.c localMessageIdGenerator, g soundPlayer, o sendSoundUrlProvider, GroupChatScreenContract$InputData inputData, zjh.f groupChatBackgroundInteractor, cw9.d paymentsProductFeatureChecker, qu9.b chatBubbleClauseClickExtension, d8k.f mentionInputDetector, n stateMapper) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(paymentsGroupsInteractor, "paymentsGroupsInteractor");
        Intrinsics.checkNotNullParameter(appFraudExtension, "appFraudExtension");
        Intrinsics.checkNotNullParameter(settlingExtension, "settlingExtension");
        Intrinsics.checkNotNullParameter(trustingExtension, "trustingExtension");
        Intrinsics.checkNotNullParameter(validationActionExtension, "validationActionExtension");
        Intrinsics.checkNotNullParameter(messageActionsExtension, "messageActionsExtension");
        Intrinsics.checkNotNullParameter(paymentExtension, "paymentExtension");
        Intrinsics.checkNotNullParameter(groupChatMessagesInteractor, "groupChatMessagesInteractor");
        Intrinsics.checkNotNullParameter(activeChatInteractor, "activeChatInteractor");
        Intrinsics.checkNotNullParameter(chatInputValidator, "chatInputValidator");
        Intrinsics.checkNotNullParameter(disclaimerActionExtension, "disclaimerActionExtension");
        Intrinsics.checkNotNullParameter(recentTimestampManager, "recentTimestampManager");
        Intrinsics.checkNotNullParameter(keyboardViewExtension, "keyboardViewExtension");
        Intrinsics.checkNotNullParameter(reactionsKeyboardViewExtension, "reactionsKeyboardViewExtension");
        Intrinsics.checkNotNullParameter(reactionsDelegate, "reactionsDelegate");
        Intrinsics.checkNotNullParameter(debtsInteractor, "debtsInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(groupContactChooserScreenProvider, "groupContactChooserScreenProvider");
        Intrinsics.checkNotNullParameter(groupChatMembersInteractor, "groupChatMembersInteractor");
        Intrinsics.checkNotNullParameter(messageClicksExtension, "messageClicksExtension");
        Intrinsics.checkNotNullParameter(localMessageIdGenerator, "localMessageIdGenerator");
        Intrinsics.checkNotNullParameter(soundPlayer, "soundPlayer");
        Intrinsics.checkNotNullParameter(sendSoundUrlProvider, "sendSoundUrlProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(groupChatBackgroundInteractor, "groupChatBackgroundInteractor");
        Intrinsics.checkNotNullParameter(paymentsProductFeatureChecker, "paymentsProductFeatureChecker");
        Intrinsics.checkNotNullParameter(chatBubbleClauseClickExtension, "chatBubbleClauseClickExtension");
        Intrinsics.checkNotNullParameter(mentionInputDetector, "mentionInputDetector");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = interactor;
        this.f79346p = paymentsGroupsInteractor;
        this.f79347q = appFraudExtension;
        this.f79348r = settlingExtension;
        this.f79349s = trustingExtension;
        this.f79350t = validationActionExtension;
        this.u = messageActionsExtension;
        this.v = paymentExtension;
        this.f79351w = groupChatMessagesInteractor;
        this.f79352x = activeChatInteractor;
        this.f79353y = chatInputValidator;
        this.z = disclaimerActionExtension;
        this.A = recentTimestampManager;
        this.B = keyboardViewExtension;
        this.C = reactionsKeyboardViewExtension;
        this.D = reactionsDelegate;
        this.E = debtsInteractor;
        this.F = featureToggleInteractor;
        this.G = groupContactChooserScreenProvider;
        this.H = groupChatMembersInteractor;
        this.I = messageClicksExtension;
        this.J = localMessageIdGenerator;
        this.K = soundPlayer;
        this.L = sendSoundUrlProvider;
        this.M = inputData;
        this.N = groupChatBackgroundInteractor;
        this.O = paymentsProductFeatureChecker;
        this.P = chatBubbleClauseClickExtension;
        this.Q = mentionInputDetector;
        Boolean bool = Boolean.FALSE;
        ihm.b bVarE = ihm.b.e(bool);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.S = bVarE;
        ihm.b bVarE2 = ihm.b.e(bool);
        Intrinsics.checkNotNullExpressionValue(bVarE2, "createDefault(...)");
        this.T = bVarE2;
        this.U = v0.a.d("create(...)");
        this.V = v0.a.d("create(...)");
        boolean zC = ((jte.d) featureToggleInteractor).c(PaymentsToggles$AsyncListAndMappingForGroupChat.f79142c);
        PaymentGroup paymentGroup = inputData.f79335a;
        Data data = new Data(null, null, true, 3, null);
        m70.a.c(t0.f186434a);
        this.W = mra.d.b(this, new bs9.o(paymentGroup, data, false, false, false, new a4("", 0, 0), cs9.b.NONE, 0, inputData.f79337c, new Data(null, null, true, 3, null), zC, f0.f322471a, null), stateMapper, null, zC, 4);
        this.X = hx7.e.a(this, new bhi.c(this, 22));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.payments.groups.impl.ui_chat.chat.a r7, gim.c r8) {
        /*
            boolean r0 = r8 instanceof bs9.h0
            if (r0 == 0) goto L13
            r0 = r8
            bs9.h0 r0 = (bs9.h0) r0
            int r1 = r0.f18106y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18106y = r1
            goto L18
        L13:
            bs9.h0 r0 = new bs9.h0
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f18104w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f18106y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.util.List r1 = r0.v
            java.util.List r1 = (java.util.List) r1
            com.revolut.feature.payments.groups.api.models.PaymentGroup r0 = r0.u
            yhm.o.b(r8)
            goto L76
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            com.revolut.feature.payments.groups.api.models.PaymentGroup r2 = r0.u
            yhm.o.b(r8)
            goto L5b
        L3e:
            yhm.o.b(r8)
            bs9.o r8 = r7.J2()
            com.revolut.feature.payments.groups.api.models.PaymentGroup r8 = r8.f18116a
            os9.c r2 = r7.H
            rfm.f0 r2 = r2.a(r8)
            r0.u = r8
            r0.f18106y = r4
            java.lang.Object r2 = nim.a.b(r2, r0)
            if (r2 != r1) goto L58
            goto L72
        L58:
            r6 = r2
            r2 = r8
            r8 = r6
        L5b:
            java.util.List r8 = (java.util.List) r8
            b9k.f r4 = r7.o
            efm.d0 r4 = r4.p()
            r0.u = r2
            r5 = r8
            java.util.List r5 = (java.util.List) r5
            r0.v = r5
            r0.f18106y = r3
            java.lang.Object r0 = nim.a.b(r4, r0)
            if (r0 != r1) goto L73
        L72:
            return r1
        L73:
            r1 = r8
            r8 = r0
            r0 = r2
        L76:
            do3.n r8 = (do3.n) r8
            kotlin.jvm.internal.Intrinsics.h(r8)
            wi0.b r8 = do3.q.y(r8)
            com.revolut.kompot.navigable.vc.modal.a r7 = r7.X
            com.revolut.feature.payments.groups.impl.ui_chat.chat.GroupChatScreenContract$ModalSteps$InviteNewMembers r2 = new com.revolut.feature.payments.groups.impl.ui_chat.chat.GroupChatScreenContract$ModalSteps$InviteNewMembers
            kotlin.jvm.internal.Intrinsics.h(r1)
            java.lang.String r3 = r0.f79285a
            com.revolut.feature.payments.groups.models.GroupSettings r0 = r0.f79290j
            xi0.b r0 = r0.f79507b
            r2.<init>(r1, r3, r0, r8)
            com.revolut.kompot.common.ModalDestination$Style$FULLSCREEN_SLIDE_FROM_BOTTOM r8 = com.revolut.kompot.common.ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a
            oki.h.v2(r7, r2, r8)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.payments.groups.impl.ui_chat.chat.a.I2(com.revolut.feature.payments.groups.impl.ui_chat.chat.a, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        Flow flowV;
        this.A.c(J2().f18116a.f79285a);
        Continuation continuation = null;
        l2(new b0(this, continuation, 2), new yi5.b(26));
        l2(new b0(this, continuation, 3), new yi5.b(26));
        r rVarDistinctUntilChanged = this.C.d.o.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        l.a1(this, rd0.e.b(rVarDistinctUntilChanged), null, null, new a0(this, continuation, 0), 3);
        r rVarDistinctUntilChanged2 = this.B.d.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged2, "distinctUntilChanged(...)");
        l.a1(this, rd0.e.b(rVarDistinctUntilChanged2), null, null, new a0(this, continuation, 1), 3);
        PaymentGroup group = J2().f18116a;
        b9k.f fVar = this.o;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(group, "group");
        l.a1(this, rd0.e.b(ue0.e.E(m70.a.g(nim.a.w(((p) fVar.f13817b).c(group, mq9.b.LOCAL), new o0(25)), new bhi.c(group, 21), null, 2), group)), null, null, new a0(this, continuation, 4), 3);
        r rVarSwitchMap = this.S.switchMap(new g0(new bs9.y(this, 2), 29));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        l.a1(this, rd0.e.b(rVarSwitchMap), null, null, new a0(this, continuation, 5), 3);
        l.a1(this, ((ks9.b0) this.v).f189323n, null, null, new e0(this, continuation, 0), 3);
        String groupId = J2().f18116a.f79285a;
        r10.f fVar2 = this.f79351w;
        fVar2.getClass();
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        sfm.b bVar = new sfm.b(((ang.f) fVar2.c).f(false), new g0(new bs9.c(fVar2, groupId, 0), 21), 2);
        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
        l.a1(this, rd0.e.b(bVar), null, null, null, 7);
        l.a1(this, q.g(((s) this.u).v), null, null, new bs9.f0(this, null), 3);
        l2(new b0(this, continuation, 4), new yi5.b(26));
        boolean z = this.f226127l;
        GroupChatScreenContract$InputData groupChatScreenContract$InputData = this.M;
        if (!z && groupChatScreenContract$InputData.f79336b) {
            l2(new b0(this, continuation, 6), new yi5.b(26));
        }
        PaymentGroup group2 = groupChatScreenContract$InputData.f79335a;
        zjh.f fVar3 = this.N;
        fVar3.getClass();
        Intrinsics.checkNotNullParameter(group2, "group");
        q2a.f fVar4 = (q2a.f) fVar3.f322835b;
        String entityId = group2.f79285a;
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        l.a1(this, new a87.b(mo3.a.g(nim.a.v(nim.a.u(new m(fVar4, continuation, 5), fVar4.f241555a.g(new RetailThemeAgnosticBackgroundKey.Chat(entityId))), new eqd.h(16)), null, null, 3), 17), null, null, new a0(this, continuation, 6), 3);
        l.a1(this, this.W.B(new bs9.e(14)), null, null, new a0(this, continuation, 2), 3);
        cw9.d dVar = this.O;
        l.a1(this, dVar.h("MESSENGER.messages"), null, null, new c0(this, null, 0), 3);
        l.a1(this, dVar.h("MESSENGER.gifs_stickers"), null, null, new c0(this, null, 1), 3);
        String groupId2 = groupChatScreenContract$InputData.f79335a.f79285a;
        mr9.a aVar = (mr9.a) this.f79346p;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(groupId2, "groupId");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        if (((jte.d) aVar.f208083b).c(PaymentsToggles$GroupChatMessagesEligibility.f79150c)) {
            x xVar = (x) aVar.f208082a;
            xVar.getClass();
            Intrinsics.checkNotNullParameter(groupId2, "groupId");
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            flowV = nim.a.v(xVar.f128610w.b(groupId2, loadingStrategy), new mqg.b(5));
        } else {
            flowV = new go.g(new Data(st9.a.SUPPORTED, null, false, 6, null), 2);
        }
        l.a1(this, rd0.e.n(flowV, h0.f322473a), null, null, new a0(this, continuation, 3), 3);
    }

    public final bs9.o J2() {
        return (bs9.o) ((j2) this.W.f22677a).getValue();
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.X;
    }

    public final void K2() {
        if (J2().f18121j.getContent() == st9.a.SUPPORTED) {
            H2(this.W, new bs9.e(15));
        }
        l2(new e0(this, null, 1), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.W;
    }
}
