package h3a;

import com.revolut.feature.apm.core.models.recipients.ApmRecipient;
import com.revolut.feature.donations.api.navigation.DonationsKompotFeatureConfig;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import com.revolut.feature.payments.social.api.navigation.SocialPaymentsFeatureConfig;
import com.revolut.feature.payments.social.api.navigation.TransferOnlyChatDestination;
import com.revolut.feature.push_to_card.api.data.CardOwner;
import com.revolut.feature.push_to_card.api.feature_config.PushToCardCardTransferFeatureConfig;
import com.revolut.feature.transfer.core.models.SourceAccount;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.retail.core.navigation.FeatureCommand;
import cu8.r0;
import jq9.a0;
import jq9.b0;
import jq9.v;
import jq9.w;
import jq9.x;
import jq9.y;
import jq9.z;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0 f149059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fx9.a f149060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x2k.e f149061c;
    public final y8k.b d;
    public final rq9.a e;
    public final oy1.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final un9.a f149062g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p38.a f149063h;
    public final lo5.p i;

    public l(r0 kycTransformer, fx9.a recipientNaviCommandProvider, x2k.e bankTransferNaviCommandProvider, y8k.b peerToPeerNaviCommandProvider, rq9.a groupBillsNaviCommandProvider, oy1.b apmNavigationProvider, un9.a paymentCounterpartyNavigationProvider, p38.a jointAccountsProductFeatureChecker, lo5.p cryptoSendNaviCommandProvider) {
        Intrinsics.checkNotNullParameter(kycTransformer, "kycTransformer");
        Intrinsics.checkNotNullParameter(recipientNaviCommandProvider, "recipientNaviCommandProvider");
        Intrinsics.checkNotNullParameter(bankTransferNaviCommandProvider, "bankTransferNaviCommandProvider");
        Intrinsics.checkNotNullParameter(peerToPeerNaviCommandProvider, "peerToPeerNaviCommandProvider");
        Intrinsics.checkNotNullParameter(groupBillsNaviCommandProvider, "groupBillsNaviCommandProvider");
        Intrinsics.checkNotNullParameter(apmNavigationProvider, "apmNavigationProvider");
        Intrinsics.checkNotNullParameter(paymentCounterpartyNavigationProvider, "paymentCounterpartyNavigationProvider");
        Intrinsics.checkNotNullParameter(jointAccountsProductFeatureChecker, "jointAccountsProductFeatureChecker");
        Intrinsics.checkNotNullParameter(cryptoSendNaviCommandProvider, "cryptoSendNaviCommandProvider");
        this.f149059a = kycTransformer;
        this.f149060b = recipientNaviCommandProvider;
        this.f149061c = bankTransferNaviCommandProvider;
        this.d = peerToPeerNaviCommandProvider;
        this.e = groupBillsNaviCommandProvider;
        this.f = apmNavigationProvider;
        this.f149062g = paymentCounterpartyNavigationProvider;
        this.f149063h = jointAccountsProductFeatureChecker;
        this.i = cryptoSendNaviCommandProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(g5a.n r14, gim.c r15) {
        /*
            Method dump skipped, instruction units count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h3a.l.a(g5a.n, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(jq9.k r5, dj0.d r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof h3a.c
            if (r0 == 0) goto L13
            r0 = r7
            h3a.c r0 = (h3a.c) r0
            int r1 = r0.f149046w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f149046w = r1
            goto L18
        L13:
            h3a.c r0 = new h3a.c
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f149046w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r7)
            fx9.a r7 = r4.f149060b
            rx9.c r7 = (rx9.c) r7
            efm.d0 r5 = r7.b(r5, r6)
            r0.f149046w = r3
            java.lang.Object r7 = nim.a.b(r5, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: h3a.l.b(jq9.k, dj0.d, gim.c):java.lang.Object");
    }

    public final Object c(jq9.t tVar, TransferFlowType transferFlowType, TransferMoneyPocket transferMoneyPocket, gim.c cVar) {
        TransferMoneyPocket transferMoneyPocket2 = transferMoneyPocket;
        boolean z = transferFlowType instanceof TransferFlowType.JointAccountFlow;
        if (z && !(tVar instanceof v) && !(tVar instanceof y) && (!(tVar instanceof w) || !((j48.c) this.f149063h).b())) {
            throw new IllegalStateException(("current PaymentTransferFlowType: " + transferFlowType + " doesn't support paymentRecipient: " + tVar).toString());
        }
        if (tVar instanceof v) {
            f5j.a aVar = ((v) tVar).f177523a;
            boolean z3 = transferFlowType instanceof TransferFlowType.Pro;
            x2k.e eVar = this.f149061c;
            if (z3) {
                return d2k.g.a(eVar, aVar, null, new TransferFlowType.Pro(((TransferFlowType.Pro) transferFlowType).f92260b), transferMoneyPocket2 == null ? new TransferMoneyPocket(null, null, 3) : transferMoneyPocket2, null, null, null, null, 1010);
            }
            if (z) {
                if (transferMoneyPocket2 == null) {
                    transferMoneyPocket2 = new TransferMoneyPocket(null, new SourceAccount.Pocket(null, null, ((TransferFlowType.JointAccountFlow) transferFlowType).f92258b, 2), 1);
                }
                return d2k.g.a(eVar, aVar, null, transferFlowType, transferMoneyPocket2, null, null, null, null, 1010);
            }
            if ((transferFlowType instanceof TransferFlowType.Default) || (transferFlowType instanceof TransferFlowType.Crypto)) {
                return new FeatureCommand(new SocialPaymentsFeatureConfig.TransferOnlyChat(new ChatTransferRecipient.BeneficiaryRecipient(aVar, transferMoneyPocket2)));
            }
            throw new NoWhenBranchMatchedException();
        }
        if (tVar instanceof w) {
            CardOwner cardOwner = ((w) tVar).f177524a.f81495a;
            if (z) {
                return new FeatureCommand(new PushToCardCardTransferFeatureConfig(cardOwner, transferFlowType, transferMoneyPocket2 == null ? new TransferMoneyPocket(null, new SourceAccount.Pocket(null, null, ((TransferFlowType.JointAccountFlow) transferFlowType).f92258b, 2), 1) : transferMoneyPocket2, null, 8));
            }
            return new FeatureCommand(new SocialPaymentsFeatureConfig.TransferOnlyChat(new ChatTransferRecipient.CardRecipient(cardOwner)));
        }
        if (tVar instanceof a0) {
            return new FeatureCommand(new SocialPaymentsFeatureConfig.TransferOnlyChat(new ChatTransferRecipient.CryptoAddressRecipient(((a0) tVar).f177495a, jz9.a.PAYMENTS, 2)));
        }
        if (tVar instanceof y) {
            return d(((y) tVar).f177526a, transferFlowType, transferMoneyPocket2, cVar);
        }
        if (tVar instanceof b0) {
            return g(((b0) tVar).f177496a, cVar);
        }
        if (tVar instanceof x) {
            ba6.l lVar = ((x) tVar).f177525a;
            return new FeatureCommand(lVar.i.f115082a > 0 ? new SocialPaymentsFeatureConfig.TransferOnlyChat(new ChatTransferRecipient.CharityRecipient(lVar)) : new DonationsKompotFeatureConfig.Charity(lVar.f13938a, null));
        }
        if (tVar instanceof jq9.u) {
            ApmRecipient recipient = ((jq9.u) tVar).f177522a;
            Intrinsics.checkNotNullParameter(recipient, "recipient");
            return u0.f(new TransferOnlyChatDestination(new ChatTransferRecipient.ApmTransferRecipient(recipient)));
        }
        if (tVar instanceof z) {
            return gc0.c.f(new SocialPaymentsFeatureConfig.TransferOnlyChat(new ChatTransferRecipient.PaymentCounterpartyRecipient(((z) tVar).f177527a)));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cc, code lost:
    
        if (r1 == r3) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0111, code lost:
    
        if (r1 == r3) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0152, code lost:
    
        if (r1 == r3) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(zm3.a r19, com.revolut.feature.transfer.core.models.TransferFlowType r20, com.revolut.feature.transfer.core.models.TransferMoneyPocket r21, gim.c r22) {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h3a.l.d(zm3.a, com.revolut.feature.transfer.core.models.TransferFlowType, com.revolut.feature.transfer.core.models.TransferMoneyPocket, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(zm3.a r9, gim.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof h3a.e
            if (r0 == 0) goto L13
            r0 = r10
            h3a.e r0 = (h3a.e) r0
            int r1 = r0.f149051x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f149051x = r1
            goto L18
        L13:
            h3a.e r0 = new h3a.e
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f149051x
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            zm3.a r9 = r0.u
            yhm.o.b(r10)
        L28:
            r3 = r9
            goto L42
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L32:
            yhm.o.b(r10)
            r0.u = r9
            r0.f149051x = r3
            cu8.r0 r10 = r8.f149059a
            java.lang.Object r10 = ks8.m.b(r10, r0)
            if (r10 != r1) goto L28
            return r1
        L42:
            ks8.j r10 = (ks8.j) r10
            boolean r9 = r10 instanceof ks8.i
            if (r9 == 0) goto L4d
            ks8.i r10 = (ks8.i) r10
            com.revolut.retail.core.navigation.FeatureCommand r9 = r10.f189312a
            return r9
        L4d:
            ks8.j$a r9 = ks8.j.a.f189313a
            boolean r9 = kotlin.jvm.internal.Intrinsics.f(r10, r9)
            if (r9 == 0) goto L65
            com.revolut.retail.core.navigation.FeatureCommand r9 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.payments.social.api.navigation.SocialPaymentsFeatureConfig$PaymentsProfileChat r2 = new com.revolut.feature.payments.social.api.navigation.SocialPaymentsFeatureConfig$PaymentsProfileChat
            r6 = 0
            r7 = 30
            r4 = 0
            r5 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            r9.<init>(r2)
            return r9
        L65:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: h3a.l.e(zm3.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.revolut.feature.payments.groups.api.models.PaymentGroup r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof h3a.f
            if (r0 == 0) goto L13
            r0 = r6
            h3a.f r0 = (h3a.f) r0
            int r1 = r0.f149052w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f149052w = r1
            goto L18
        L13:
            h3a.f r0 = new h3a.f
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f149052w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L45
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            java.lang.String r5 = r5.f79285a
            rq9.a r6 = r4.e
            zr9.a r6 = (zr9.a) r6
            ufm.i r5 = r6.a(r5)
            r0.f149052w = r3
            java.lang.Object r6 = nim.a.b(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: h3a.l.f(com.revolut.feature.payments.groups.api.models.PaymentGroup, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        if (r7 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(com.revolut.feature.payments.groups.api.models.PaymentGroup r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof h3a.g
            if (r0 == 0) goto L13
            r0 = r7
            h3a.g r0 = (h3a.g) r0
            int r1 = r0.f149054x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f149054x = r1
            goto L18
        L13:
            h3a.g r0 = new h3a.g
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f149054x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L6f
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            com.revolut.feature.payments.groups.api.models.PaymentGroup r6 = r0.u
            yhm.o.b(r7)
            goto L48
        L38:
            yhm.o.b(r7)
            r0.u = r6
            r0.f149054x = r4
            cu8.r0 r7 = r5.f149059a
            java.lang.Object r7 = ks8.m.b(r7, r0)
            if (r7 != r1) goto L48
            goto L6e
        L48:
            ks8.j r7 = (ks8.j) r7
            boolean r2 = r7 instanceof ks8.i
            if (r2 == 0) goto L53
            ks8.i r7 = (ks8.i) r7
            com.revolut.retail.core.navigation.FeatureCommand r6 = r7.f189312a
            return r6
        L53:
            ks8.j$a r2 = ks8.j.a.f189313a
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r7, r2)
            if (r7 == 0) goto L75
            rq9.a r7 = r5.e
            zr9.a r7 = (zr9.a) r7
            ufm.b r6 = r7.d(r6)
            r7 = 0
            r0.u = r7
            r0.f149054x = r3
            java.lang.Object r7 = nim.a.b(r6, r0)
            if (r7 != r1) goto L6f
        L6e:
            return r1
        L6f:
            kotlin.jvm.internal.Intrinsics.h(r7)
            com.revolut.retail.core.navigation.NaviCommand r7 = (com.revolut.retail.core.navigation.NaviCommand) r7
            return r7
        L75:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: h3a.l.g(com.revolut.feature.payments.groups.api.models.PaymentGroup, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(com.revolut.feature.payments.groups.api.models.PaymentGroup r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof h3a.h
            if (r0 == 0) goto L13
            r0 = r6
            h3a.h r0 = (h3a.h) r0
            int r1 = r0.f149055w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f149055w = r1
            goto L18
        L13:
            h3a.h r0 = new h3a.h
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f149055w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L45
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            java.lang.String r5 = r5.f79285a
            rq9.a r6 = r4.e
            zr9.a r6 = (zr9.a) r6
            ufm.i r5 = r6.f(r5)
            r0.f149055w = r3
            java.lang.Object r6 = nim.a.b(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: h3a.l.h(com.revolut.feature.payments.groups.api.models.PaymentGroup, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(zm3.a r6, dj0.d r7, gim.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof h3a.i
            if (r0 == 0) goto L13
            r0 = r8
            h3a.i r0 = (h3a.i) r0
            int r1 = r0.f149056w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f149056w = r1
            goto L18
        L13:
            h3a.i r0 = new h3a.i
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f149056w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L44
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r8)
            r8 = 0
            r2 = 12
            y8k.b r4 = r5.d
            ufm.b r6 = q8k.g.a(r4, r6, r7, r8, r2)
            r0.f149056w = r3
            java.lang.Object r8 = nim.a.b(r6, r0)
            if (r8 != r1) goto L44
            return r1
        L44:
            java.lang.String r6 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r6)
            com.revolut.retail.core.navigation.feature.FeatureConfig r8 = (com.revolut.retail.core.navigation.feature.FeatureConfig) r8
            com.revolut.retail.core.navigation.FeatureCommand r6 = new com.revolut.retail.core.navigation.FeatureCommand
            r6.<init>(r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: h3a.l.i(zm3.a, dj0.d, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(zm3.a r15, dj0.d r16, gim.c r17) {
        /*
            r14 = this;
            r0 = r17
            boolean r1 = r0 instanceof h3a.j
            if (r1 == 0) goto L15
            r1 = r0
            h3a.j r1 = (h3a.j) r1
            int r2 = r1.f149057w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f149057w = r2
            goto L1a
        L15:
            h3a.j r1 = new h3a.j
            r1.<init>(r14, r0)
        L1a:
            java.lang.Object r0 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f149057w
            r4 = 1
            if (r3 == 0) goto L31
            if (r3 != r4) goto L29
            yhm.o.b(r0)
            goto L55
        L29:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L31:
            yhm.o.b(r0)
            com.revolut.feature.transfer.core.models.TransferMoneyPocket r9 = new com.revolut.feature.transfer.core.models.TransferMoneyPocket
            r0 = 2
            r3 = 0
            r5 = r16
            r9.<init>(r5, r3, r0)
            com.revolut.feature.transfer.core.models.TransferFlowType$Default r8 = com.revolut.feature.transfer.core.models.TransferFlowType.Default.f92257b
            r12 = 0
            r13 = 242(0xf2, float:3.39E-43)
            y8k.b r5 = r14.d
            r7 = 0
            r10 = 0
            r11 = 0
            r6 = r15
            ufm.b r15 = q8k.g.b(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r1.f149057w = r4
            java.lang.Object r0 = nim.a.b(r15, r1)
            if (r0 != r2) goto L55
            return r2
        L55:
            java.lang.String r15 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r15)
            com.revolut.retail.core.navigation.feature.FeatureConfig r0 = (com.revolut.retail.core.navigation.feature.FeatureConfig) r0
            com.revolut.retail.core.navigation.FeatureCommand r15 = new com.revolut.retail.core.navigation.FeatureCommand
            r15.<init>(r0)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: h3a.l.j(zm3.a, dj0.d, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(com.revolut.feature.crypto.withdraw.api.models.CryptoAddress r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof h3a.k
            if (r0 == 0) goto L13
            r0 = r9
            h3a.k r0 = (h3a.k) r0
            int r1 = r0.f149058w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f149058w = r1
            goto L18
        L13:
            h3a.k r0 = new h3a.k
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f149058w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r9)
            goto L64
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            yhm.o.b(r9)
            com.revolut.feature.payments.social.api.model.ChatTransferRecipient$CryptoAddressRecipient r9 = new com.revolut.feature.payments.social.api.model.ChatTransferRecipient$CryptoAddressRecipient
            jz9.a r2 = jz9.a.PAYMENTS
            r4 = 2
            r9.<init>(r8, r2, r4)
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r2 = ibb.c.f160142c
            r4 = 14
            r5 = 0
            com.revolut.retail.core.navigation.FeatureCommand r2 = jbb.a.a(r2, r5, r5, r5, r4)
            com.revolut.retail.core.navigation.FeatureCommand r4 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.payments.social.api.navigation.SocialPaymentsFeatureConfig$TransferOnlyChat r6 = new com.revolut.feature.payments.social.api.navigation.SocialPaymentsFeatureConfig$TransferOnlyChat
            r6.<init>(r9)
            r4.<init>(r6)
            com.revolut.retail.core.navigation.CompositeCommand r9 = com.revolut.retail.core.navigation.a.c(r2, r4)
            lo5.n r2 = lo5.p.Companion
            lo5.p r2 = r7.i
            fp5.f r2 = (fp5.f) r2
            ufm.i r8 = r2.a(r8, r5, r9)
            r0.f149058w = r3
            java.lang.Object r9 = nim.a.b(r8, r0)
            if (r9 != r1) goto L64
            return r1
        L64:
            java.lang.String r8 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: h3a.l.k(com.revolut.feature.crypto.withdraw.api.models.CryptoAddress, gim.c):java.lang.Object");
    }
}
