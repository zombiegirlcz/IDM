package elf;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h0 extends yji.n implements s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f127336l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final pff.a f127337m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final gte.a f127338n;

    public h0(klf.h0 commonDataSource, pff.a transactionTroubleshooterInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(transactionTroubleshooterInteractor, "transactionTroubleshooterInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f127336l = commonDataSource;
        this.f127337m = transactionTroubleshooterInteractor;
        this.f127338n = featureToggleInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(tof.a3 r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof elf.f0
            if (r0 == 0) goto L13
            r0 = r8
            elf.f0 r0 = (elf.f0) r0
            int r1 = r0.f127322w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f127322w = r1
            goto L18
        L13:
            elf.f0 r0 = new elf.f0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f127322w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L6f
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            yhm.o.b(r8)
            java.lang.String r7 = r7.f272581b
            zhm.f0 r8 = zhm.f0.f322471a
            com.revolut.feature.support.api.SupportApi$Toggles$ShowAllTroubleshooters r2 = com.revolut.feature.support.api.SupportApi$Toggles$ShowAllTroubleshooters.f89343a
            gte.a r4 = r6.f127338n
            jte.d r4 = (jte.d) r4
            boolean r2 = r4.c(r2)
            w4l.h r4 = w4l.h.f294642c
            pff.a r5 = r6.f127337m
            vkm.d r7 = r5.a(r7, r8, r2, r4)
            zfd.e r7 = zi0.c.w(r7)
            ej9.t r8 = new ej9.t
            r2 = 22
            r8.<init>(r2)
            r2 = 0
            jhi.b r7 = mo3.a.g(r7, r2, r8, r3)
            c9k.k r8 = new c9k.k
            r4 = 3
            r5 = 26
            r8.<init>(r4, r5, r2)
            zhm.h0 r2 = zhm.h0.f322473a
            vkm.y r7 = rd0.e.e(r7, r2, r8)
            r0.f127322w = r3
            java.lang.Object r8 = vkm.q.x(r7, r0)
            if (r8 != r1) goto L6f
            return r1
        L6f:
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r7 = r8.isEmpty()
            r7 = r7 ^ r3
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: elf.h0.Z2(tof.a3, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(gim.c r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof elf.g0
            if (r0 == 0) goto L13
            r0 = r10
            elf.g0 r0 = (elf.g0) r0
            int r1 = r0.f127329x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f127329x = r1
            goto L18
        L13:
            elf.g0 r0 = new elf.g0
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f127329x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            tof.a3 r0 = r0.u
            yhm.o.b(r10)
            goto L5a
        L2c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L34:
            yhm.o.b(r10)
            goto L4a
        L38:
            yhm.o.b(r10)
            klf.h0 r10 = r9.f127336l
            kotlinx.coroutines.flow.SharedFlow r10 = r10.d()
            r0.f127329x = r4
            java.lang.Object r10 = vkm.q.x(r10, r0)
            if (r10 != r1) goto L4a
            goto L56
        L4a:
            tof.a3 r10 = (tof.a3) r10
            r0.u = r10
            r0.f127329x = r3
            java.lang.Object r0 = r9.Z2(r10, r0)
            if (r0 != r1) goto L57
        L56:
            return r1
        L57:
            r8 = r0
            r0 = r10
            r10 = r8
        L5a:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L78
            com.revolut.feature.transaction.troubleshooter.api.navigation.TransactionTroubleshooterDestination r10 = new com.revolut.feature.transaction.troubleshooter.api.navigation.TransactionTroubleshooterDestination
            com.revolut.feature.transaction.troubleshooter.api.navigation.TransactionTroubleshooterDestination$TroubleshooterList r1 = new com.revolut.feature.transaction.troubleshooter.api.navigation.TransactionTroubleshooterDestination$TroubleshooterList
            java.lang.String r2 = r0.f272581b
            r6 = 0
            r7 = 112(0x70, float:1.57E-43)
            r3 = 0
            r4 = 0
            r5 = 1
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r10.<init>(r1)
            r9.A2(r10)
            goto L82
        L78:
            com.revolut.feature.shared.help_centre.api.main.SharedHelpDestination r10 = new com.revolut.feature.shared.help_centre.api.main.SharedHelpDestination
            r0 = 3
            r1 = 0
            r10.<init>(r1, r0)
            r9.A2(r10)
        L82:
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: elf.h0.b3(gim.c):java.lang.Object");
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        return Intrinsics.f(str, "ID_GET_HELP_CELL") ? b3((gim.c) continuation) : Boolean.FALSE;
    }
}
