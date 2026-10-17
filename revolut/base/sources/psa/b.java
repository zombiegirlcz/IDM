package psa;

import kotlin.jvm.internal.Intrinsics;
import opf.z;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f239455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fk3.a f239456b;

    public b(z transferFundingSourceInteractor, fk3.a configurationInteractor) {
        Intrinsics.checkNotNullParameter(transferFundingSourceInteractor, "transferFundingSourceInteractor");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        this.f239455a = transferFundingSourceInteractor;
        this.f239456b = configurationInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(xpa.f r12, gim.c r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof psa.a
            if (r0 == 0) goto L13
            r0 = r13
            psa.a r0 = (psa.a) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            psa.a r0 = new psa.a
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.f239453x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L40
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            xpa.f r12 = r0.u
            yhm.o.b(r13)
            goto La1
        L2e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L36:
            com.revolut.feature.transfer.core.models.TransferMoneyPocket r12 = r0.f239452w
            opf.z r2 = r0.v
            xpa.f r4 = r0.u
            yhm.o.b(r13)
            goto L7b
        L40:
            yhm.o.b(r13)
            com.revolut.feature.transfer.core.models.TransferMoneyPocket r13 = new com.revolut.feature.transfer.core.models.TransferMoneyPocket
            dj0.d r2 = r12.f307923b
            com.revolut.feature.transfer.core.models.SourceAccount r6 = r12.f307924c
            if (r6 != 0) goto L4d
            com.revolut.feature.transfer.core.models.SourceAccount$Default r6 = com.revolut.feature.transfer.core.models.SourceAccount.Default.f92247a
        L4d:
            r13.<init>(r2, r6)
            fk3.a r2 = r11.f239456b
            ik3.c r2 = (ik3.c) r2
            efm.r r2 = r2.n()
            r6 = 3
            efm.r r2 = m70.a.g(r2, r5, r5, r6)
            efm.d0 r2 = r2.firstOrError()
            java.lang.String r6 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r6)
            r0.u = r12
            opf.z r6 = r11.f239455a
            r0.v = r6
            r0.f239452w = r13
            r0.z = r4
            java.lang.Object r2 = nim.a.b(r2, r0)
            if (r2 != r1) goto L77
            goto L9f
        L77:
            r4 = r12
            r12 = r13
            r13 = r2
            r2 = r6
        L7b:
            java.lang.String r6 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r6)
            java.util.Set r13 = (java.util.Set) r13
            com.revolut.feature.transfer.core.models.CurrencyFilteringPolicy$IncludeOnly r6 = new com.revolut.feature.transfer.core.models.CurrencyFilteringPolicy$IncludeOnly
            r6.<init>(r13)
            dj0.d r13 = r4.f307923b
            xi0.b r13 = r13.f115083b
            java.lang.String r13 = r13.f306286a
            java.util.List r13 = zhm.u.c(r13)
            r0.u = r4
            r0.v = r5
            r0.f239452w = r5
            r0.z = r3
            java.lang.Object r13 = xof.a.a(r2, r12, r6, r13, r0)
            if (r13 != r1) goto La0
        L9f:
            return r1
        La0:
            r12 = r4
        La1:
            r6 = r13
            com.revolut.feature.transfer.core.models.FundingSource r6 = (com.revolut.feature.transfer.core.models.FundingSource) r6
            com.revolut.feature.push_to_card.api.data.CardOwner r13 = r12.f307922a
            java.lang.String r1 = r13.f81490a
            dj0.d r13 = r12.f307923b
            long r2 = r13.f115082a
            xi0.b r4 = r13.f115083b
            xi0.b r5 = r6.f92241b
            com.revolut.core.model.account.AccountId r7 = r6.getK()
            xpa.e r12 = r12.d
            com.revolut.feature.transfer.models.tracking.TransferAppSource$AIR_WIDGET r10 = new com.revolut.feature.transfer.models.tracking.TransferAppSource$AIR_WIDGET
            java.lang.String r12 = r12.f307921a
            r10.<init>(r12)
            com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData r0 = new com.revolut.feature.push_to_card.api.navigation.PushToCardTransferData
            java.lang.String r8 = ""
            r9 = 0
            r0.<init>(r1, r2, r4, r5, r6, r7, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: psa.b.a(xpa.f, gim.c):java.lang.Object");
    }
}
