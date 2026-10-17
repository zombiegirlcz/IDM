package a3i;

import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f1140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1141c;

    public h(a97.k kVar, FlowCollector flowCollector) {
        this.f1139a = 4;
        this.f1141c = kVar;
        this.f1140b = flowCollector;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a4, code lost:
    
        if (r2.emit(r13, r0) == r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r12, kotlin.coroutines.Continuation r13) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r13 instanceof as1.s
            if (r0 == 0) goto L13
            r0 = r13
            as1.s r0 = (as1.s) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            as1.s r0 = new as1.s
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L41
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r13)
            goto La7
        L2c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L34:
            int r12 = r0.f8778y
            kotlinx.coroutines.flow.FlowCollector r2 = r0.f8777x
            yhm.o.b(r13)     // Catch: java.lang.Throwable -> L3c java.util.concurrent.CancellationException -> L3e
            goto L79
        L3c:
            r13 = move-exception
            goto L86
        L3e:
            r12 = move-exception
            goto Laa
        L41:
            yhm.o.b(r13)
            kotlinx.coroutines.flow.FlowCollector r2 = r11.f1140b
            kotlin.Pair r12 = (kotlin.Pair) r12
            java.lang.Object r13 = r12.f186385a
            dj0.d r13 = (dj0.d) r13
            java.lang.Object r12 = r12.f186386b
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r6 = r11.f1141c
            as1.a0 r6 = (as1.a0) r6
            r7 = 0
            yhm.m$a r8 = yhm.m.INSTANCE     // Catch: java.util.concurrent.CancellationException -> L3e java.lang.Throwable -> L84
            tr1.g r6 = r6.f8758t     // Catch: java.util.concurrent.CancellationException -> L3e java.lang.Throwable -> L84
            r0.f8777x = r2     // Catch: java.util.concurrent.CancellationException -> L3e java.lang.Throwable -> L84
            r0.f8778y = r7     // Catch: java.util.concurrent.CancellationException -> L3e java.lang.Throwable -> L84
            r0.v = r4     // Catch: java.util.concurrent.CancellationException -> L3e java.lang.Throwable -> L84
            com.revolut.feature.apm.core.models.transfers.ApmPaymentMethod$TAPI r4 = com.revolut.feature.apm.core.models.transfers.ApmPaymentMethod.TAPI.f62176a     // Catch: java.util.concurrent.CancellationException -> L3e java.lang.Throwable -> L80
            yw1.b r6 = r6.f273636a     // Catch: java.util.concurrent.CancellationException -> L3e java.lang.Throwable -> L80
            t02.g r8 = new t02.g     // Catch: java.util.concurrent.CancellationException -> L3e java.lang.Throwable -> L80
            com.revolut.feature.apm.core.models.transfers.payments.ApmPaymentSource r9 = new com.revolut.feature.apm.core.models.transfers.payments.ApmPaymentSource     // Catch: java.util.concurrent.CancellationException -> L3e java.lang.Throwable -> L80
            t02.c r10 = t02.c.POCKET     // Catch: java.util.concurrent.CancellationException -> L3e java.lang.Throwable -> L80
            r9.<init>(r12, r10)     // Catch: java.util.concurrent.CancellationException -> L3e java.lang.Throwable -> L80
            r8.<init>(r9, r4, r13, r5)     // Catch: java.util.concurrent.CancellationException -> L3e java.lang.Throwable -> L80
            iz1.q r6 = (iz1.q) r6     // Catch: java.util.concurrent.CancellationException -> L3e java.lang.Throwable -> L80
            java.lang.Object r13 = r6.a(r8, r0)     // Catch: java.util.concurrent.CancellationException -> L3e java.lang.Throwable -> L80
            if (r13 != r1) goto L78
            goto La6
        L78:
            r12 = r7
        L79:
            com.revolut.feature.apm.core.models.transfers.payments.ApmQuote r13 = (com.revolut.feature.apm.core.models.transfers.payments.ApmQuote) r13     // Catch: java.lang.Throwable -> L3c java.util.concurrent.CancellationException -> L3e
            yhm.m$a r4 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L3c java.util.concurrent.CancellationException -> L3e
            goto L8c
        L7e:
            r13 = r12
            goto L82
        L80:
            r12 = move-exception
            goto L7e
        L82:
            r12 = r7
            goto L86
        L84:
            r13 = move-exception
            goto L82
        L86:
            yhm.m$a r4 = yhm.m.INSTANCE
            yhm.n r13 = yhm.o.a(r13)
        L8c:
            java.lang.Throwable r4 = yhm.m.a(r13)
            if (r4 == 0) goto L95
            hx7.e.n(r4)
        L95:
            boolean r4 = r13 instanceof yhm.n
            if (r4 == 0) goto L9a
            r13 = r5
        L9a:
            r0.f8777x = r5
            r0.f8778y = r12
            r0.v = r3
            java.lang.Object r12 = r2.emit(r13, r0)
            if (r12 != r1) goto La7
        La6:
            return r1
        La7:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        Laa:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: a3i.h.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof asa.j
            if (r0 == 0) goto L13
            r0 = r6
            asa.j r0 = (asa.j) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            asa.j r0 = new asa.j
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L49
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r6 = r4.f1141c
            asa.m r6 = (asa.m) r6
            asa.e r6 = r6.f8908j
            hrf.h r5 = r6.a(r5)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r6 = r4.f1140b
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L49
            return r1
        L49:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a3i.h.b(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof aw.t
            if (r0 == 0) goto L13
            r0 = r6
            aw.t r0 = (aw.t) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            aw.t r0 = new aw.t
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L48
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            kotlinx.coroutines.flow.FlowCollector r6 = r4.f1140b
            r2 = r5
            xv.n r2 = (xv.n) r2
            java.lang.Object r2 = r4.f1141c
            aw.u r2 = (aw.u) r2
            boolean r2 = r2.f10212c
            if (r2 != 0) goto L48
            r0.v = r3
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L48
            return r1
        L48:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a3i.h.c(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object d(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof b0a.l
            if (r0 == 0) goto L13
            r0 = r7
            b0a.l r0 = (b0a.l) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            b0a.l r0 = new b0a.l
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L7f
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            yhm.r r6 = (yhm.r) r6
            java.lang.Object r7 = r6.f314201a
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            java.lang.Object r2 = r6.f314202b
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            java.lang.Object r6 = r6.f314203c
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L5c
            java.lang.Object r6 = r5.f1141c
            zz9.s r6 = (zz9.s) r6
            zz9.s r4 = zz9.s.ENABLED
            if (r6 == r4) goto L5a
            zz9.s r4 = zz9.s.TEXT_NOT_SUPPORTED
            if (r6 != r4) goto L5c
        L5a:
            r6 = r3
            goto L5d
        L5c:
            r6 = 0
        L5d:
            if (r2 != 0) goto L66
            if (r7 == 0) goto L66
            if (r6 == 0) goto L66
            vz9.g r6 = vz9.g.f293429a
            goto L74
        L66:
            if (r2 != 0) goto L6d
            if (r6 == 0) goto L6d
            vz9.f r6 = vz9.f.f293428a
            goto L74
        L6d:
            if (r7 == 0) goto L72
            vz9.i r6 = vz9.i.f293431a
            goto L74
        L72:
            vz9.h r6 = vz9.h.f293430a
        L74:
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r7 = r5.f1140b
            java.lang.Object r6 = r7.emit(r6, r0)
            if (r6 != r1) goto L7f
            return r1
        L7f:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a3i.h.d(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object e(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof b8d.c0
            if (r0 == 0) goto L13
            r0 = r8
            b8d.c0 r0 = (b8d.c0) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            b8d.c0 r0 = new b8d.c0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L59
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            yhm.o.b(r8)
            com.revolut.data.model.Data r7 = (com.revolut.data.model.Data) r7
            b8d.d0 r8 = new b8d.d0
            r2 = 0
            r4 = 0
            r8.<init>(r2, r7, r4)
            b8d.e0 r2 = new b8d.e0
            java.lang.Object r4 = r6.f1141c
            com.revolut.feature.shared.help_centre.impl.faq.screens.article.c r4 = (com.revolut.feature.shared.help_centre.impl.faq.screens.article.c) r4
            r2.<init>(r4)
            b8d.f0 r4 = new b8d.f0
            r5 = 0
            r4.<init>(r7, r5)
            java.lang.Object r7 = iii.c.f(r7, r8, r2, r4)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r8 = r6.f1140b
            java.lang.Object r7 = r8.emit(r7, r0)
            if (r7 != r1) goto L59
            return r1
        L59:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a3i.h.e(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object f(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ba4.w
            if (r0 == 0) goto L13
            r0 = r6
            ba4.w r0 = (ba4.w) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            ba4.w r0 = new ba4.w
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L4f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r4.f1141c
            com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.document.a r6 = (com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.document.a) r6
            com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.document.UploadScreenContract$InputData r6 = r6.o
            ny3.f r6 = r6.f67577b
            java.lang.String r6 = r6.f220629a
            zhm.f0 r2 = zhm.f0.f322471a
            java.lang.Object r5 = r5.getOrDefault(r6, r2)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r6 = r4.f1140b
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L4f
            return r1
        L4f:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a3i.h.f(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object g(java.lang.Object r19, kotlin.coroutines.Continuation r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            boolean r2 = r1 instanceof bcj.j
            if (r2 == 0) goto L17
            r2 = r1
            bcj.j r2 = (bcj.j) r2
            int r3 = r2.v
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.v = r3
            goto L1c
        L17:
            bcj.j r2 = new bcj.j
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.u
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.v
            r5 = 1
            if (r4 == 0) goto L33
            if (r4 != r5) goto L2b
            yhm.o.b(r1)
            goto L88
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L33:
            yhm.o.b(r1)
            r1 = r19
            com.revolut.data.model.Data r1 = (com.revolut.data.model.Data) r1
            java.lang.Object r4 = r0.f1141c
            bcj.l r4 = (bcj.l) r4
            bcj.h r4 = r4.f14461l
            r4.getClass()
            java.lang.String r4 = "cryptoDepositAddressData"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r4)
            java.lang.Object r1 = r1.getContent()
            com.revolut.retail.feature.crypto_deposits.api.models.CryptoDepositAddress r1 = (com.revolut.retail.feature.crypto_deposits.api.models.CryptoDepositAddress) r1
            r4 = 0
            if (r1 == 0) goto L7d
            boolean r1 = r1.e
            if (r1 == 0) goto L7d
            com.revolut.core.ui_kit.delegates.CircleActionButtonsBarDelegate$CircleActionButton r6 = new com.revolut.core.ui_kit.delegates.CircleActionButtonsBarDelegate$CircleActionButton
            com.revolut.core.ui_kit.models.TextLocalisedClause r8 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r1 = com.revolut.retail.feature.crypto_deposits.impl.R$string.crypto_receive_screen_receive_direct_deposit_action
            r7 = 14
            r8.<init>(r1, r4, r4, r7)
            com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage r9 = new com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage
            int r10 = com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_auto_topup
            r16 = 0
            r17 = 254(0xfe, float:3.56E-43)
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            bcj.c r14 = bcj.c.f14452a
            r15 = 368(0x170, float:5.16E-43)
            java.lang.String r7 = "CryptoDirectDeposit_ActionButton_ListId"
            com.revolut.core.ui_kit.delegates.CircleActionButtonsBarDelegate$CircleActionButton$ButtonStyle$WhiteButton r10 = com.revolut.core.ui_kit.delegates.CircleActionButtonsBarDelegate.CircleActionButton.ButtonStyle.WhiteButton.f52098a
            r13 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r4 = r6
        L7d:
            r2.v = r5
            kotlinx.coroutines.flow.FlowCollector r1 = r0.f1140b
            java.lang.Object r1 = r1.emit(r4, r2)
            if (r1 != r3) goto L88
            return r3
        L88:
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a3i.h.g(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object j(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof beg.o
            if (r0 == 0) goto L13
            r0 = r6
            beg.o r0 = (beg.o) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            beg.o r0 = new beg.o
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L48
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            com.revolut.data.model.Data r5 = (com.revolut.data.model.Data) r5
            java.lang.Object r6 = r4.f1141c
            xag.c r6 = (xag.c) r6
            kotlin.Pair r2 = new kotlin.Pair
            r2.<init>(r5, r6)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r5 = r4.f1140b
            java.lang.Object r5 = r5.emit(r2, r0)
            if (r5 != r1) goto L48
            return r1
        L48:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a3i.h.j(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f1141c
            bg9.r r0 = (bg9.r) r0
            cli.y r1 = r0.f15154r
            boolean r2 = r9 instanceof bg9.n
            if (r2 == 0) goto L19
            r2 = r9
            bg9.n r2 = (bg9.n) r2
            int r3 = r2.v
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L19
            int r3 = r3 - r4
            r2.v = r3
            goto L1e
        L19:
            bg9.n r2 = new bg9.n
            r2.<init>(r7, r9)
        L1e:
            java.lang.Object r9 = r2.u
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.v
            r5 = 1
            if (r4 == 0) goto L35
            if (r4 != r5) goto L2d
            yhm.o.b(r9)
            goto L8c
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            yhm.o.b(r9)
            wi0.b r8 = (wi0.b) r8
            java.util.Map r9 = r0.f15152p
            java.lang.String r4 = r8.f297794a
            java.lang.Object r9 = r9.get(r4)
            xf9.a r9 = (xf9.a) r9
            if (r9 != 0) goto L48
            rf9.n r9 = r0.f15153q
        L48:
            java.lang.Object r4 = r1.f22677a
            vkm.j2 r4 = (vkm.j2) r4
            java.lang.Object r4 = r4.getValue()
            bg9.a r4 = (bg9.a) r4
            wi0.b r4 = r4.f15141c
            r9.getClass()
            java.lang.String r6 = "newCountry"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r6)
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r4, r8)
            if (r6 == 0) goto L63
            goto L77
        L63:
            if (r4 == 0) goto L6e
            boolean r6 = r9.Z2(r4)
            if (r6 == 0) goto L6e
            r9.n3(r4)
        L6e:
            boolean r4 = r9.Z2(r8)
            if (r4 == 0) goto L77
            r9.m3(r8)
        L77:
            a26.p r4 = new a26.p
            r6 = 8
            r4.<init>(r8, r6)
            r0.H2(r1, r4)
            r2.v = r5
            kotlinx.coroutines.flow.FlowCollector r8 = r7.f1140b
            java.lang.Object r8 = r8.emit(r9, r2)
            if (r8 != r3) goto L8c
            return r3
        L8c:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a3i.h.m(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x06e5  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x07ca  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0812  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x085a  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x08c9  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0933  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x0a50  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0acd  */
    /* JADX WARN: Removed duplicated region for block: B:559:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r13v24, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v14, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r30, kotlin.coroutines.Continuation r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2894
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a3i.h.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public /* synthetic */ h(FlowCollector flowCollector, Object obj2, int i) {
        this.f1139a = i;
        this.f1140b = flowCollector;
        this.f1141c = obj2;
    }
}
