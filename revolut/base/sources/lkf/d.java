package lkf;

import elf.s0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends yji.n implements s0 {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f196370l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a12.v f196371m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final vz1.a f196372n;

    public d(klf.h0 commonDataSource, a12.v apmTransactionChargebackMapper, vz1.a disputesRepository) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(apmTransactionChargebackMapper, "apmTransactionChargebackMapper");
        Intrinsics.checkNotNullParameter(disputesRepository, "disputesRepository");
        this.f196370l = commonDataSource;
        this.f196371m = apmTransactionChargebackMapper;
        this.f196372n = disputesRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(java.lang.Object r11, gim.c r12) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r12 instanceof lkf.c
            if (r0 == 0) goto L13
            r0 = r12
            lkf.c r0 = (lkf.c) r0
            int r1 = r0.f196368w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f196368w = r1
            goto L18
        L13:
            lkf.c r0 = new lkf.c
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f196368w
            r3 = 1
            r8 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r12)
            goto L5d
        L28:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L30:
            yhm.o.b(r12)
            boolean r12 = r11 instanceof lkf.b
            if (r12 == 0) goto L3a
            lkf.b r11 = (lkf.b) r11
            goto L3b
        L3a:
            r11 = r8
        L3b:
            if (r11 == 0) goto L6c
            java.lang.String r6 = r11.f196364a
            if (r6 != 0) goto L42
            goto L6c
        L42:
            f02.b r7 = f02.b.REDIRECT_URL
            r0.f196368w = r3
            vz1.a r5 = r10.f196372n
            r5.getClass()
            vq5.w r4 = new vq5.w
            r9 = 11
            r4.<init>(r5, r6, r7, r8, r9)
            skm.p0 r11 = skm.p0.f264001a
            elm.f r11 = elm.f.f127540b
            java.lang.Object r12 = skm.e0.J(r11, r4, r0)
            if (r12 != r1) goto L5d
            return r1
        L5d:
            f02.a r12 = (f02.a) r12
            com.revolut.kompot.common.ExternalDestination$Browser r11 = new com.revolut.kompot.common.ExternalDestination$Browser
            java.lang.String r12 = r12.f130992a
            r11.<init>(r12, r8)
            r10.A2(r11)
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            return r11
        L6c:
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: lkf.d.Z2(java.lang.Object, gim.c):java.lang.Object");
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        return Intrinsics.f(str, "CHARGEBACK_ITEM_LIST_ID") ? Z2(obj2, (gim.c) continuation) : Boolean.FALSE;
    }
}
