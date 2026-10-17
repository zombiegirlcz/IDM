package m0a;

import cu8.r0;
import kotlin.jvm.internal.Intrinsics;
import vz9.o;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends yji.n implements g {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final q0a.b f201124l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final r0 f201125m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final iz9.c f201126n;
    public final g6k.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wz9.a f201127p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o f201128q;

    public k(q0a.b navigationProvider, r0 kycTransformer, iz9.c transactionsInteractor, g6k.a moneyRequestActionDelegate, wz9.a suspiciousTransactionsActionsExtension, o descriptorFactory) {
        Intrinsics.checkNotNullParameter(navigationProvider, "navigationProvider");
        Intrinsics.checkNotNullParameter(kycTransformer, "kycTransformer");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(moneyRequestActionDelegate, "moneyRequestActionDelegate");
        Intrinsics.checkNotNullParameter(suspiciousTransactionsActionsExtension, "suspiciousTransactionsActionsExtension");
        Intrinsics.checkNotNullParameter(descriptorFactory, "descriptorFactory");
        this.f201124l = navigationProvider;
        this.f201125m = kycTransformer;
        this.f201126n = transactionsInteractor;
        this.o = moneyRequestActionDelegate;
        this.f201127p = suspiciousTransactionsActionsExtension;
        this.f201128q = descriptorFactory;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
    
        if (r7 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z2(m0a.k r5, com.revolut.feature.payments.social.api.model.ChatTransferRecipient r6, gim.c r7) {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof m0a.h
            if (r0 == 0) goto L16
            r0 = r7
            m0a.h r0 = (m0a.h) r0
            int r1 = r0.f201117x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f201117x = r1
            goto L1b
        L16:
            m0a.h r0 = new m0a.h
            r0.<init>(r5, r7)
        L1b:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f201117x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            yhm.o.b(r7)
            goto L77
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            com.revolut.feature.payments.social.api.model.ChatTransferRecipient r6 = r0.u
            yhm.o.b(r7)
            goto L4b
        L3b:
            yhm.o.b(r7)
            cu8.r0 r7 = r5.f201125m
            r0.u = r6
            r0.f201117x = r4
            java.lang.Object r7 = ks8.m.b(r7, r0)
            if (r7 != r1) goto L4b
            goto L76
        L4b:
            ks8.j r7 = (ks8.j) r7
            boolean r2 = r7 instanceof ks8.i
            if (r2 == 0) goto L5b
            m0a.a r5 = new m0a.a
            ks8.i r7 = (ks8.i) r7
            com.revolut.retail.core.navigation.FeatureCommand r6 = r7.f189312a
            r5.<init>(r6)
            return r5
        L5b:
            ks8.j$a r2 = ks8.j.a.f189313a
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r7, r2)
            if (r7 == 0) goto L8e
            iz9.c r5 = r5.f201126n
            qz9.n r5 = (qz9.n) r5
            pfm.z r5 = r5.f(r6)
            r6 = 0
            r0.u = r6
            r0.f201117x = r3
            java.lang.Object r7 = nim.a.b(r5, r0)
            if (r7 != r1) goto L77
        L76:
            return r1
        L77:
            od0.i r7 = (od0.i) r7
            boolean r5 = r7.d()
            if (r5 == 0) goto L8b
            m0a.c r5 = new m0a.c
            java.lang.Object r6 = r7.c()
            java.lang.String r6 = (java.lang.String) r6
            r5.<init>(r6)
            return r5
        L8b:
            m0a.b r5 = m0a.b.f201112a
            return r5
        L8e:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: m0a.k.Z2(m0a.k, com.revolut.feature.payments.social.api.model.ChatTransferRecipient, gim.c):java.lang.Object");
    }
}
