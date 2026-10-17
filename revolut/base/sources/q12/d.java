package q12;

import com.revolut.feature.transfer.core.models.CurrencyFilteringPolicy;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import kotlin.jvm.internal.Intrinsics;
import opf.z;
import zhm.u;
import zhm.y0;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements x02.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f241317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final opf.b f241318b;

    public d(z fundingSourceInteractor, opf.b pocketInteractor) {
        Intrinsics.checkNotNullParameter(fundingSourceInteractor, "fundingSourceInteractor");
        Intrinsics.checkNotNullParameter(pocketInteractor, "pocketInteractor");
        this.f241317a = fundingSourceInteractor;
        this.f241318b = pocketInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        if (r10 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(k1j.a r6, com.revolut.core.model.account.AccountId r7, java.lang.String r8, xi0.b r9, kotlin.coroutines.Continuation r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof q12.b
            if (r0 == 0) goto L13
            r0 = r10
            q12.b r0 = (q12.b) r0
            int r1 = r0.f241314y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f241314y = r1
            goto L18
        L13:
            q12.b r0 = new q12.b
            r0.<init>(r5, r10)
        L18:
            java.lang.Object r10 = r0.f241312w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f241314y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r10)
            goto L5e
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            xi0.b r9 = r0.v
            com.revolut.core.model.account.AccountId r7 = r0.u
            yhm.o.b(r10)
            goto L4c
        L3a:
            yhm.o.b(r10)
            r0.u = r7
            r0.v = r9
            r0.f241314y = r4
            opf.z r10 = r5.f241317a
            java.lang.Object r10 = r10.d(r7, r0, r8, r6)
            if (r10 != r1) goto L4c
            goto L5d
        L4c:
            com.revolut.feature.transfer.core.models.FundingSource r10 = (com.revolut.feature.transfer.core.models.FundingSource) r10
            if (r10 != 0) goto L60
            r6 = 0
            r0.u = r6
            r0.v = r6
            r0.f241314y = r3
            java.lang.Object r10 = r5.c(r7, r0, r9)
            if (r10 != r1) goto L5e
        L5d:
            return r1
        L5e:
            com.revolut.feature.transfer.core.models.FundingSource r10 = (com.revolut.feature.transfer.core.models.FundingSource) r10
        L60:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: q12.d.a(k1j.a, com.revolut.core.model.account.AccountId, java.lang.String, xi0.b, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object b(TransferMoneyPocket transferMoneyPocket, xi0.b bVar, gim.c cVar) {
        return xof.a.a(this.f241317a, transferMoneyPocket, new CurrencyFilteringPolicy.IncludeOnly(y0.b(bVar.f306286a)), u.c(bVar.f306286a), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.revolut.core.model.account.AccountId r6, gim.c r7, xi0.b r8) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof q12.c
            if (r0 == 0) goto L13
            r0 = r7
            q12.c r0 = (q12.c) r0
            int r1 = r0.f241316x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f241316x = r1
            goto L18
        L13:
            q12.c r0 = new q12.c
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f241316x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.core.model.account.AccountId r6 = r0.u
            yhm.o.b(r7)
            goto L58
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            yhm.o.b(r7)
            com.revolut.feature.transfer.core.models.CurrencyFilteringPolicy$IncludeOnly r7 = new com.revolut.feature.transfer.core.models.CurrencyFilteringPolicy$IncludeOnly
            java.lang.String r2 = r8.f306286a
            java.util.Set r2 = zhm.y0.b(r2)
            r7.<init>(r2)
            java.lang.String r8 = r8.f306286a
            java.util.List r8 = zhm.u.c(r8)
            opf.b r2 = r5.f241318b
            io3.l r4 = io3.l.CURRENT
            ufm.i r7 = r2.a(r7, r8, r4, r6)
            r0.u = r6
            r0.f241316x = r3
            java.lang.Object r7 = nim.a.b(r7, r0)
            if (r7 != r1) goto L58
            return r1
        L58:
            io3.d r7 = (io3.d) r7
            com.revolut.feature.transfer.core.models.PocketSource r8 = new com.revolut.feature.transfer.core.models.PocketSource
            kotlin.jvm.internal.Intrinsics.h(r7)
            r0 = 0
            r8.<init>(r7, r6, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: q12.d.c(com.revolut.core.model.account.AccountId, gim.c, xi0.b):java.lang.Object");
    }
}
