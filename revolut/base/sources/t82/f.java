package t82;

import com.revolut.feature.apm.multibanco.api.navigation.MultibancoWithdrawalInputData;
import kotlin.jvm.internal.Intrinsics;
import l72.i;
import opf.c0;

/* JADX INFO: loaded from: classes20.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MultibancoWithdrawalInputData f268807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d92.b f268808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f268809c;
    public final x02.a d;
    public final c0 e;

    public f(MultibancoWithdrawalInputData inputData, d92.b validator, i withdrawalInteractor, x02.a apmPocketInteractor, c0 transferSuggestedAmountsInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(validator, "validator");
        Intrinsics.checkNotNullParameter(withdrawalInteractor, "withdrawalInteractor");
        Intrinsics.checkNotNullParameter(apmPocketInteractor, "apmPocketInteractor");
        Intrinsics.checkNotNullParameter(transferSuggestedAmountsInteractor, "transferSuggestedAmountsInteractor");
        this.f268807a = inputData;
        this.f268808b = validator;
        this.f268809c = withdrawalInteractor;
        this.d = apmPocketInteractor;
        this.e = transferSuggestedAmountsInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof t82.d
            if (r0 == 0) goto L13
            r0 = r9
            t82.d r0 = (t82.d) r0
            int r1 = r0.f268805y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f268805y = r1
            goto L18
        L13:
            t82.d r0 = new t82.d
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f268803w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f268805y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            long r1 = r0.u
            com.revolut.feature.transfer.core.models.FundingSource r0 = r0.v
            yhm.o.b(r9)
            r4 = r0
            r2 = r1
            goto L8a
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L38:
            long r4 = r0.u
            yhm.o.b(r9)
            goto L66
        L3e:
            yhm.o.b(r9)
            com.revolut.feature.apm.multibanco.api.navigation.MultibancoWithdrawalInputData r9 = r8.f268807a
            com.revolut.feature.transfer.core.models.TransferMoneyPocket r9 = r9.f62554a
            dj0.d r2 = r9.f92261a
            if (r2 == 0) goto L4c
            long r5 = r2.f115082a
            goto L4e
        L4c:
            r5 = 0
        L4e:
            if (r2 == 0) goto L54
            xi0.b r2 = r2.f115083b
            if (r2 != 0) goto L56
        L54:
            xi0.b r2 = w62.a.f295373a
        L56:
            r0.u = r5
            r0.f268805y = r4
            x02.a r4 = r8.d
            q12.d r4 = (q12.d) r4
            java.lang.Object r9 = r4.b(r9, r2, r0)
            if (r9 != r1) goto L65
            goto L86
        L65:
            r4 = r5
        L66:
            com.revolut.feature.transfer.core.models.FundingSource r9 = (com.revolut.feature.transfer.core.models.FundingSource) r9
            r0.v = r9
            r0.u = r4
            r0.f268805y = r3
            l72.i r2 = r8.f268809c
            a72.i r2 = r2.f192514a
            a72.m r2 = (a72.m) r2
            a01.e r3 = new a01.e
            r6 = 11
            r7 = 0
            r3.<init>(r2, r7, r6)
            skm.p0 r2 = skm.p0.f264001a
            elm.f r2 = elm.f.f127540b
            java.lang.Object r0 = skm.e0.J(r2, r3, r0)
            if (r0 != r1) goto L87
        L86:
            return r1
        L87:
            r2 = r4
            r4 = r9
            r9 = r0
        L8a:
            r1 = r9
            h02.g r1 = (h02.g) r1
            t82.a r0 = new t82.a
            com.revolut.core.model.account.AccountId$Personal r5 = com.revolut.core.model.account.AccountId.Personal.f51414a
            r0.<init>(r1, r2, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t82.f.a(gim.c):java.lang.Object");
    }
}
