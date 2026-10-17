package olg;

import com.revolut.core.model.account.AccountId;
import efm.d0;
import eli.j;
import kotlin.jvm.internal.Intrinsics;
import oid.y;
import ufm.i;
import yji.n;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends n implements hlg.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j f226401l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final hlg.b f226402m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final y1k.a f226403n;
    public final wsg.n o;

    public c(j twoFaErrorHandler, hlg.b sendChecksInteractor, y1k.a bankTransferInteractor, wsg.n walletInteractor) {
        Intrinsics.checkNotNullParameter(twoFaErrorHandler, "twoFaErrorHandler");
        Intrinsics.checkNotNullParameter(sendChecksInteractor, "sendChecksInteractor");
        Intrinsics.checkNotNullParameter(bankTransferInteractor, "bankTransferInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f226401l = twoFaErrorHandler;
        this.f226402m = sendChecksInteractor;
        this.f226403n = bankTransferInteractor;
        this.o = walletInteractor;
    }

    public final Object Z2(d0 d0Var, AccountId accountId, gim.c cVar) {
        i iVar = new i(d0Var.g(sjg.a.a(this.f226401l)), new y(new ofg.a(this, accountId, 20), 4), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return nim.a.b(iVar, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(f5j.a r22, com.revolut.core.model.account.AccountId r23, com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData r24, gim.c r25) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: olg.c.b3(f5j.a, com.revolut.core.model.account.AccountId, com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c3(f5j.a r29, com.revolut.core.model.account.AccountId r30, com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData r31, dj0.d r32, gim.c r33) {
        /*
            r28 = this;
            r0 = r28
            r1 = r31
            r2 = r32
            r3 = r33
            boolean r4 = r3 instanceof olg.b
            if (r4 == 0) goto L1b
            r4 = r3
            olg.b r4 = (olg.b) r4
            int r5 = r4.f226400w
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L1b
            int r5 = r5 - r6
            r4.f226400w = r5
            goto L20
        L1b:
            olg.b r4 = new olg.b
            r4.<init>(r0, r3)
        L20:
            java.lang.Object r3 = r4.u
            fim.a r5 = fim.a.COROUTINE_SUSPENDED
            int r6 = r4.f226400w
            r7 = 1
            if (r6 == 0) goto L38
            if (r6 != r7) goto L30
            yhm.o.b(r3)
            goto L96
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L38:
            yhm.o.b(r3)
            qua.p r3 = r1.f101929j
            com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData r6 = r1.i
            if (r3 == 0) goto L49
            ibd.e r3 = r3.f249314a
            java.lang.String r3 = r3.f160150a
        L45:
            r9 = r3
            r3 = r29
            goto L4b
        L49:
            r3 = 0
            goto L45
        L4b:
            java.lang.String r10 = r3.f132329a
            xi0.b r11 = r1.f101926c
            xi0.b r12 = r1.f101925b
            long r13 = r1.f101924a
            if (r2 == 0) goto L59
            long r2 = r2.f115082a
        L57:
            r15 = r2
            goto L5c
        L59:
            r2 = 0
            goto L57
        L5c:
            long r2 = r6.f104285a
            jli.c r8 = r6.f104286b
            com.revolut.retail.feature.payments.bank_transfer.api.navigation.TransferNote r7 = r1.f
            java.lang.String r21 = com.revolut.retail.feature.payments.bank_transfer.api.navigation.b.b(r7)
            com.revolut.feature.bank_transfer.models.UltimateDebtor r7 = r1.o
            r17 = r2
            rtf.c r2 = r1.f101927g
            java.util.Map r3 = r1.f101931m
            r24 = r2
            com.revolut.feature.transfer.core.models.FundingSource r2 = r1.d
            kq2.c r1 = r1.k
            com.revolut.retail.feature.transfer.schedule.models.TransferScheduleEndsOn r6 = r6.f104287c
            r22 = 0
            r19 = r8
            y1k.a r8 = r0.f226403n
            r25 = r1
            r27 = r2
            r26 = r3
            r20 = r6
            r23 = r7
            ufm.i r1 = y1k.a.a(r8, r9, r10, r11, r12, r13, r15, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r2 = 1
            r4.f226400w = r2
            r2 = r30
            java.lang.Object r3 = r0.Z2(r1, r2, r4)
            if (r3 != r5) goto L96
            return r5
        L96:
            java.lang.String r1 = "handlePostTransferActions(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: olg.c.c3(f5j.a, com.revolut.core.model.account.AccountId, com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData, dj0.d, gim.c):java.lang.Object");
    }
}
