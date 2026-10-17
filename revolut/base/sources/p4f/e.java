package p4f;

import com.revolut.feature.wealth.models.addmoney.TransferSubjectId;
import iah.h;
import kotlin.jvm.internal.Intrinsics;
import ybl.k;
import ybl.l;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements m1h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f232922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kpj.f f232923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f232924c;

    public e(l tradingConfigInteractor, kpj.f wealthAccountHeaderUiMapper, k tradingAccountsInteractor) {
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(wealthAccountHeaderUiMapper, "wealthAccountHeaderUiMapper");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        this.f232922a = tradingConfigInteractor;
        this.f232923b = wealthAccountHeaderUiMapper;
        this.f232924c = tradingAccountsInteractor;
    }

    @Override // m1h.a
    public final Object a() {
        throw new IllegalStateException("Recurring add money feature is not available for stocks");
    }

    @Override // m1h.a
    public final Object b(TransferSubjectId transferSubjectId, dj0.d dVar, h hVar) {
        throw new IllegalStateException("Recurring add money feature is not available for stocks");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // m1h.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.revolut.feature.wealth.models.addmoney.TransferSubjectId r15, dj0.d r16, kotlin.coroutines.Continuation r17) {
        /*
            r14 = this;
            r0 = r17
            boolean r1 = r0 instanceof p4f.c
            if (r1 == 0) goto L15
            r1 = r0
            p4f.c r1 = (p4f.c) r1
            int r2 = r1.f232918w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f232918w = r2
            goto L1c
        L15:
            p4f.c r1 = new p4f.c
            gim.c r0 = (gim.c) r0
            r1.<init>(r14, r0)
        L1c:
            java.lang.Object r0 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f232918w
            r4 = 1
            if (r3 == 0) goto L33
            if (r3 != r4) goto L2b
            yhm.o.b(r0)
            goto L41
        L2b:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L33:
            yhm.o.b(r0)
            r1.f232918w = r4
            r0 = r16
            java.lang.Object r0 = r14.d(r15, r0, r1)
            if (r0 != r2) goto L41
            return r2
        L41:
            r2 = r0
            com.revolut.core.ui_kit.models.Clause r2 = (com.revolut.core.ui_kit.models.Clause) r2
            nii.j0 r1 = new nii.j0
            r7 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 4094(0xffe, float:5.737E-42)
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p4f.e.c(com.revolut.feature.wealth.models.addmoney.TransferSubjectId, dj0.d, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.revolut.feature.wealth.models.addmoney.TransferSubjectId r21, dj0.d r22, gim.c r23) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p4f.e.d(com.revolut.feature.wealth.models.addmoney.TransferSubjectId, dj0.d, gim.c):java.lang.Object");
    }
}
