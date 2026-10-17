package com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot;

import boh.f;
import cli.n;
import cli.y;
import com.google.common.collect.ImmutableMap;
import com.revolut.data.model.Data;
import dce.l0;
import dce.m0;
import dce.o;
import dce.p;
import g48.r0;
import gaf.l;
import gce.m;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import mde.e;
import mra.d;
import oki.h;
import qua.u;
import skm.a2;
import vkm.q;
import vz1.g;
import w4l.j;
import wli.x;
import zh9.u0;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends h implements o {
    public final t70.b A;
    public final r0 B;
    public final d3j.b C;
    public final cl3.a D;
    public final ppg.b E;
    public final kpg.a F;
    public final oce.h G;
    public final ur2.c H;
    public final v8i.c I;
    public final co9.b J;
    public final g K;
    public a2 L;
    public a2 M;
    public final y N;
    public final com.revolut.kompot.navigable.vc.modal.a O;
    public final SubscriptionDetailsControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Map f89264p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m f89265q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final twg.c f89266r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c70.a f89267s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final x f89268t;
    public final z8e.a u;
    public final e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final k1a.g f89269w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ob2.h f89270x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final j60.a f89271y;
    public final f01.a z;

    public c(n stateMapper, SubscriptionDetailsControllerContract$InputData inputData, ImmutableMap contentProviders, m subscriptionDetailsScreenContentInteractor, twg.c subscriptionActionsInteractor, c70.a clipboard, x deeplinkHandler, z8e.a subscriptionsAppNavigationProvider, e sharedHelpDestinationProvider, k1a.g recurringSplitInteractor, ob2.h payToDialogProvider, j60.a bottomDialog, f01.a uiKitResources, t70.b currenciesLocalization, r0 jointAccountsInteractor, d3j.b beneficiaryInteractor, cl3.a contactsInteractor, ppg.b vaultsInteractor, kpg.a vaultProductAccountsNavigationProvider, oce.h unblockMerchantDialogProvider, ur2.c blockedMerchantsInteractor, v8i.c moveMoneyRecurringPaymentMapper, co9.b paymentCounterpartyInteractor, g apmPaymentsAuthorisationsRepository) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(contentProviders, "contentProviders");
        Intrinsics.checkNotNullParameter(subscriptionDetailsScreenContentInteractor, "subscriptionDetailsScreenContentInteractor");
        Intrinsics.checkNotNullParameter(subscriptionActionsInteractor, "subscriptionActionsInteractor");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(subscriptionsAppNavigationProvider, "subscriptionsAppNavigationProvider");
        Intrinsics.checkNotNullParameter(sharedHelpDestinationProvider, "sharedHelpDestinationProvider");
        Intrinsics.checkNotNullParameter(recurringSplitInteractor, "recurringSplitInteractor");
        Intrinsics.checkNotNullParameter(payToDialogProvider, "payToDialogProvider");
        Intrinsics.checkNotNullParameter(bottomDialog, "bottomDialog");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(beneficiaryInteractor, "beneficiaryInteractor");
        Intrinsics.checkNotNullParameter(contactsInteractor, "contactsInteractor");
        Intrinsics.checkNotNullParameter(vaultsInteractor, "vaultsInteractor");
        Intrinsics.checkNotNullParameter(vaultProductAccountsNavigationProvider, "vaultProductAccountsNavigationProvider");
        Intrinsics.checkNotNullParameter(unblockMerchantDialogProvider, "unblockMerchantDialogProvider");
        Intrinsics.checkNotNullParameter(blockedMerchantsInteractor, "blockedMerchantsInteractor");
        Intrinsics.checkNotNullParameter(moveMoneyRecurringPaymentMapper, "moveMoneyRecurringPaymentMapper");
        Intrinsics.checkNotNullParameter(paymentCounterpartyInteractor, "paymentCounterpartyInteractor");
        Intrinsics.checkNotNullParameter(apmPaymentsAuthorisationsRepository, "apmPaymentsAuthorisationsRepository");
        this.o = inputData;
        this.f89264p = contentProviders;
        this.f89265q = subscriptionDetailsScreenContentInteractor;
        this.f89266r = subscriptionActionsInteractor;
        this.f89267s = clipboard;
        this.f89268t = deeplinkHandler;
        this.u = subscriptionsAppNavigationProvider;
        this.v = sharedHelpDestinationProvider;
        this.f89269w = recurringSplitInteractor;
        this.f89270x = payToDialogProvider;
        this.f89271y = bottomDialog;
        this.z = uiKitResources;
        this.A = currenciesLocalization;
        this.B = jointAccountsInteractor;
        this.C = beneficiaryInteractor;
        this.D = contactsInteractor;
        this.E = vaultsInteractor;
        this.F = vaultProductAccountsNavigationProvider;
        this.G = unblockMerchantDialogProvider;
        this.H = blockedMerchantsInteractor;
        this.I = moveMoneyRecurringPaymentMapper;
        this.J = paymentCounterpartyInteractor;
        this.K = apmPaymentsAuthorisationsRepository;
        this.N = d.b(this, new p(inputData.f89247a, inputData.f89248b, inputData.f89249c, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.O = hx7.e.a(this, new cwj.h(this, 22));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
    
        if (r5.O2(r6, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c r5, qua.p r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof dce.n0
            if (r0 == 0) goto L13
            r0 = r7
            dce.n0 r0 = (dce.n0) r0
            int r1 = r0.f112879x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f112879x = r1
            goto L18
        L13:
            dce.n0 r0 = new dce.n0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f112879x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L62
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            qua.p r6 = r0.u
            yhm.o.b(r7)
            goto L48
        L38:
            yhm.o.b(r7)
            twg.c r7 = r5.f89266r
            r0.u = r6
            r0.f112879x = r4
            java.lang.Enum r7 = r7.r(r6, r0)
            if (r7 != r1) goto L48
            goto L61
        L48:
            qua.q r7 = (qua.q) r7
            int[] r2 = dce.m0.f112875a
            int r7 = r7.ordinal()
            r7 = r2[r7]
            if (r7 == r4) goto L6b
            if (r7 != r3) goto L65
            r7 = 0
            r0.u = r7
            r0.f112879x = r3
            java.lang.Object r5 = r5.O2(r6, r0)
            if (r5 != r1) goto L62
        L61:
            return r1
        L62:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L65:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L6b:
            r5.B2()
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c.I2(com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c, qua.p, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c r4, qua.p r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof dce.o0
            if (r0 == 0) goto L13
            r0 = r6
            dce.o0 r0 = (dce.o0) r0
            int r1 = r0.f112881x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f112881x = r1
            goto L18
        L13:
            dce.o0 r0 = new dce.o0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f112881x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            qua.p r5 = r0.u
            yhm.o.b(r6)
            goto L47
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r6)
            g48.r0 r4 = r4.B
            w4l.j r6 = w4l.j.f294644c
            cxe.u r4 = r4.h(r6)
            r0.u = r5
            r0.f112881x = r3
            java.lang.Object r6 = vkm.q.x(r4, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            com.revolut.data.model.Data r6 = (com.revolut.data.model.Data) r6
            java.lang.Object r4 = r6.getContent()
            od0.i r4 = (od0.i) r4
            r6 = 0
            if (r4 == 0) goto L57
            java.lang.Object r4 = r4.f224257a
            n38.a r4 = (n38.a) r4
            goto L58
        L57:
            r4 = r6
        L58:
            if (r4 == 0) goto L6f
            com.revolut.core.model.account.AccountId$Joint r4 = l38.a.c(r4)
            java.lang.String r0 = r4.f51413b
            java.lang.String r5 = r5.L
            if (r5 != 0) goto L65
            r5 = r6
        L65:
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r0, r5)
            if (r5 == 0) goto L6c
            r6 = r4
        L6c:
            if (r6 == 0) goto L6f
            return r6
        L6f:
            com.revolut.core.model.account.AccountId$Personal r4 = com.revolut.core.model.account.AccountId.Personal.f51414a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c.J2(com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c, qua.p, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        M2();
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.O;
    }

    public final abe.a K2(hce.c cVar) {
        String str;
        hce.b bVar = cVar.f150886a;
        hce.b bVar2 = cVar.f150886a;
        switch (m0.f112876b[bVar.f150883a.f249314a.f160152c.ordinal()]) {
            case 1:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
                str = "BASIC";
                break;
            case 2:
            case 6:
                str = "SAVINGS_VAULTS";
                break;
            case 3:
                str = "JUNIOR_ALLOWANCE";
                break;
            case 4:
                str = "CREDIT_SCHEDULED_PAYMENTS";
                break;
            case 5:
                str = "BILL_ACCOUNTS";
                break;
            case 7:
                str = "BANK_TRANSFER";
                break;
            case 8:
                str = "INTERNAL_TRANSFER";
                break;
            case 9:
                str = "WALLET";
                break;
            case 10:
            case 11:
            case 21:
                str = "BILLS_AND_TAXES";
                break;
            case 12:
                str = "UPI";
                break;
            case 13:
                str = "GIRO_DIRECT_DEBIT";
                break;
            case 14:
                str = "MASAV_DIRECT_DEBIT";
                break;
            case 15:
                str = !u.x(bVar2.f150883a) ? "DIRECT_DEBIT" : "PAYTO_MANDATE";
                break;
            case 16:
            case 17:
            case 18:
            case 19:
                str = "CARD_MANDATE";
                break;
            case 20:
                str = !u.m(bVar2.f150883a) ? "BILL" : "BILL_BOLETO";
                break;
            case 22:
                str = "QR_CODE";
                break;
            case 23:
                str = "PIX_MANDATE";
                break;
            case 24:
                str = "UPI_MANDATE";
                break;
            case 25:
                str = "MOBILE_PLAN_SUBSCRIPTION";
                break;
            case 26:
                str = "PAID_PLAN";
                break;
            case 27:
                str = "REFUND";
                break;
            case 38:
                str = "COBRANDS";
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        abe.a aVar = (abe.a) this.f89264p.get(str);
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("No provider registered for key ".concat(str));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02ea  */
    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L2(dce.y r19) {
        /*
            Method dump skipped, instruction units count: 2370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c.L2(dce.y):void");
    }

    public final void M2() {
        Flow flowE;
        a2 a2Var = this.L;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        SubscriptionDetailsControllerContract$InputData subscriptionDetailsControllerContract$InputData = this.o;
        String subscriptionId = subscriptionDetailsControllerContract$InputData.f89247a;
        f9e.b mode = subscriptionDetailsControllerContract$InputData.f89248b;
        boolean z = subscriptionDetailsControllerContract$InputData.f89249c;
        m mVar = this.f89265q;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        Intrinsics.checkNotNullParameter(mode, "mode");
        int i = gce.h.f142425a[mode.ordinal()];
        if (i == 1) {
            int i2 = 1;
            flowE = f.e(q.r(new gcc.c(i2), u0.m(mVar.f142435g.h(j.f294644c), rd0.e.b(mVar.f142432a.k(subscriptionId)))), new gae.a(mVar, z, i2));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            flowE = nim.a.v(mVar.f142436h.B0(subscriptionId), new l(16));
        }
        this.L = yji.l.a1(this, c6d.b.i(q.q(flowE), new l0(this, 0)), null, null, new d8j.c(this, continuation, 11), 3);
    }

    public final void N2(Flow flow) {
        a2 a2Var = this.M;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.M = yji.l.a1(this, flow, null, null, new d3i.g(this, continuation, 17), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e7, code lost:
    
        if (vkm.q.x(r1, r2) != r3) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O2(qua.p r26, gim.c r27) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c.O2(qua.p, gim.c):java.lang.Object");
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.N;
    }
}
