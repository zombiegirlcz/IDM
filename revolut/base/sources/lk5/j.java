package lk5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sd5.b f196228a;

    public j(sd5.b blockchainExplorerUrlResolver) {
        Intrinsics.checkNotNullParameter(blockchainExplorerUrlResolver, "blockchainExplorerUrlResolver");
        this.f196228a = blockchainExplorerUrlResolver;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature.crypto.remittance.api.models.BlockchainExplorerTarget r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof lk5.g
            if (r0 == 0) goto L13
            r0 = r7
            lk5.g r0 = (lk5.g) r0
            int r1 = r0.f196223w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f196223w = r1
            goto L18
        L13:
            lk5.g r0 = new lk5.g
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f196223w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L7c
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            boolean r7 = r6 instanceof com.revolut.feature.crypto.remittance.api.models.BlockchainExplorerTarget.DirectUrl
            sd5.b r2 = r5.f196228a
            if (r7 == 0) goto L41
            com.revolut.feature.crypto.remittance.api.models.BlockchainExplorerTarget$DirectUrl r6 = (com.revolut.feature.crypto.remittance.api.models.BlockchainExplorerTarget.DirectUrl) r6
            java.lang.String r6 = r6.f70930a
            java.lang.String r6 = r2.b(r6)
            return r6
        L41:
            boolean r7 = r6 instanceof com.revolut.feature.crypto.remittance.api.models.BlockchainExplorerTarget.Config
            if (r7 == 0) goto L85
            com.revolut.feature.crypto.remittance.api.models.BlockchainExplorerTarget$Config r6 = (com.revolut.feature.crypto.remittance.api.models.BlockchainExplorerTarget.Config) r6
            xi0.b r7 = r6.f70928a
            wk5.a r6 = r6.f70929b
            java.lang.String r4 = "currency"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r4)
            java.lang.String r4 = "blockchain"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r4)
            java.lang.String r4 = "thisWillBeIgnored"
            ufm.i r6 = r2.a(r7, r6, r4)
            scl.e r7 = new scl.e
            r4 = 3
            r7.<init>(r2, r4)
            sc7.g r2 = new sc7.g
            r4 = 16
            r2.<init>(r7, r4)
            ufm.i r7 = new ufm.i
            r4 = 1
            r7.<init>(r6, r2, r4)
            java.lang.String r6 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r6)
            r0.f196223w = r3
            java.lang.Object r7 = nim.a.b(r7, r0)
            if (r7 != r1) goto L7c
            return r1
        L7c:
            od0.i r7 = (od0.i) r7
            java.lang.Object r6 = r7.g()
            java.lang.String r6 = (java.lang.String) r6
            return r6
        L85:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: lk5.j.a(com.revolut.feature.crypto.remittance.api.models.BlockchainExplorerTarget, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.feature.crypto.remittance.api.models.TransactionCryptoRemittanceAction r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof lk5.h
            if (r0 == 0) goto L13
            r0 = r6
            lk5.h r0 = (lk5.h) r0
            int r1 = r0.f196225x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f196225x = r1
            goto L18
        L13:
            lk5.h r0 = new lk5.h
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f196225x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.crypto.remittance.api.models.TransactionCryptoRemittanceAction r5 = r0.u
            yhm.o.b(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            com.revolut.feature.crypto.remittance.api.models.BlockchainExplorerTarget r6 = r5.f70931a
            r0.u = r5
            r0.f196225x = r3
            java.lang.Object r6 = r4.a(r6, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            java.lang.String r6 = (java.lang.String) r6
            com.revolut.feature.crypto.remittance.impl.ui.commonfields.CommonRemittanceFieldDialogContract$DomainState r0 = new com.revolut.feature.crypto.remittance.impl.ui.commonfields.CommonRemittanceFieldDialogContract$DomainState
            r0.<init>(r5, r6)
            lk5.d r5 = new lk5.d
            r5.<init>(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: lk5.j.b(com.revolut.feature.crypto.remittance.api.models.TransactionCryptoRemittanceAction, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.revolut.feature.crypto.remittance.api.models.TransactionCryptoRemittanceAction r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof lk5.i
            if (r0 == 0) goto L13
            r0 = r8
            lk5.i r0 = (lk5.i) r0
            int r1 = r0.f196227x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f196227x = r1
            goto L18
        L13:
            lk5.i r0 = new lk5.i
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f196227x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.crypto.remittance.api.models.TransactionCryptoRemittanceAction r7 = r0.u
            yhm.o.b(r8)
            goto L5c
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            yhm.o.b(r8)
            com.revolut.feature.crypto.remittance.api.models.BlockchainExplorerTarget r8 = r7.f70931a
            boolean r2 = r8 instanceof com.revolut.feature.crypto.remittance.api.models.BlockchainExplorerTarget.DirectUrl
            if (r2 == 0) goto L3f
            com.revolut.feature.crypto.remittance.api.models.BlockchainExplorerTarget$DirectUrl r8 = (com.revolut.feature.crypto.remittance.api.models.BlockchainExplorerTarget.DirectUrl) r8
            java.lang.String r8 = r8.f70930a
            goto L64
        L3f:
            boolean r2 = r8 instanceof com.revolut.feature.crypto.remittance.api.models.BlockchainExplorerTarget.Config
            if (r2 == 0) goto L6f
            com.revolut.feature.crypto.remittance.api.models.BlockchainExplorerTarget$Config r8 = (com.revolut.feature.crypto.remittance.api.models.BlockchainExplorerTarget.Config) r8
            xi0.b r2 = r8.f70928a
            wk5.a r8 = r8.f70929b
            java.lang.String r4 = r7.f70932b
            sd5.b r5 = r6.f196228a
            ufm.i r8 = r5.a(r2, r8, r4)
            r0.u = r7
            r0.f196227x = r3
            java.lang.Object r8 = nim.a.b(r8, r0)
            if (r8 != r1) goto L5c
            return r1
        L5c:
            od0.i r8 = (od0.i) r8
            java.lang.Object r8 = r8.g()
            java.lang.String r8 = (java.lang.String) r8
        L64:
            com.revolut.feature.crypto.remittance.impl.ui.commonfields.CommonRemittanceFieldDialogContract$DomainState r0 = new com.revolut.feature.crypto.remittance.impl.ui.commonfields.CommonRemittanceFieldDialogContract$DomainState
            r0.<init>(r7, r8)
            lk5.c r7 = new lk5.c
            r7.<init>(r0)
            return r7
        L6f:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: lk5.j.c(com.revolut.feature.crypto.remittance.api.models.TransactionCryptoRemittanceAction, gim.c):java.lang.Object");
    }
}
