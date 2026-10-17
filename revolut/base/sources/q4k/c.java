package q4k;

import kotlin.jvm.internal.Intrinsics;
import opf.z;
import wsg.n;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f242179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fk3.a f242180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f242181c;

    public c(z transferFundingSourceInteractor, fk3.a configurationInteractor, n walletInteractor) {
        Intrinsics.checkNotNullParameter(transferFundingSourceInteractor, "transferFundingSourceInteractor");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f242179a = transferFundingSourceInteractor;
        this.f242180b = configurationInteractor;
        this.f242181c = walletInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(a2k.b r26, gim.c r27) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            boolean r3 = r2 instanceof q4k.a
            if (r3 == 0) goto L19
            r3 = r2
            q4k.a r3 = (q4k.a) r3
            int r4 = r3.f242175x
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f242175x = r4
            goto L1e
        L19:
            q4k.a r3 = new q4k.a
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.v
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            int r5 = r3.f242175x
            r6 = 1
            if (r5 == 0) goto L37
            if (r5 != r6) goto L2f
            dj0.d r1 = r3.u
            yhm.o.b(r2)
            goto L4e
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L37:
            yhm.o.b(r2)
            dj0.d r2 = r1.f890b
            com.revolut.feature.transfer.core.models.SourceAccount r1 = r1.f891c
            r3.u = r2
            r3.f242175x = r6
            java.lang.Object r1 = r0.b(r2, r1, r3)
            if (r1 != r4) goto L49
            return r4
        L49:
            r24 = r2
            r2 = r1
            r1 = r24
        L4e:
            r8 = r2
            com.revolut.feature.transfer.core.models.FundingSource r8 = (com.revolut.feature.transfer.core.models.FundingSource) r8
            long r4 = r1.f115082a
            xi0.b r6 = r1.f115083b
            xi0.b r7 = r8.f92241b
            com.revolut.retail.feature.payments.bank_transfer.api.navigation.TransferNote$SimpleNote r10 = new com.revolut.retail.feature.payments.bank_transfer.api.navigation.TransferNote$SimpleNote
            java.lang.String r1 = ""
            r10.<init>(r1)
            m1l.a r12 = m1l.a.SCHEDULE_DISABLED
            com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData r13 = new com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData
            r1 = 0
            r2 = 7
            r14 = 0
            r13.<init>(r14, r1, r2)
            com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData r3 = new com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData
            r22 = 0
            r23 = 1046528(0xff800, float:1.466498E-39)
            com.revolut.core.model.account.AccountId$Personal r9 = com.revolut.core.model.account.AccountId.Personal.f51414a
            r11 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r3.<init>(r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: q4k.c.a(a2k.b, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(dj0.d r9, com.revolut.feature.transfer.core.models.SourceAccount r10, gim.c r11) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q4k.c.b(dj0.d, com.revolut.feature.transfer.core.models.SourceAccount, gim.c):java.lang.Object");
    }
}
