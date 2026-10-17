package skf;

import elf.s0;
import klf.m1;
import klf.z2;
import kotlin.jvm.internal.Intrinsics;
import yji.n;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends n implements s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final z2 f263942l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m1 f263943m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c9e.c f263944n;
    public final d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g f263945p;

    public f(z2 subscriptionDataSource, m1 juniorDataSource, c9e.c subscriptionNavigationProvider, d availabilityChecker, g mapper) {
        Intrinsics.checkNotNullParameter(subscriptionDataSource, "subscriptionDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(subscriptionNavigationProvider, "subscriptionNavigationProvider");
        Intrinsics.checkNotNullParameter(availabilityChecker, "availabilityChecker");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f263942l = subscriptionDataSource;
        this.f263943m = juniorDataSource;
        this.f263944n = subscriptionNavigationProvider;
        this.o = availabilityChecker;
        this.f263945p = mapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // elf.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.Object r5, java.lang.String r6, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof skf.e
            if (r0 == 0) goto L13
            r0 = r7
            skf.e r0 = (skf.e) r0
            int r1 = r0.f263941x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f263941x = r1
            goto L1a
        L13:
            skf.e r0 = new skf.e
            gim.c r7 = (gim.c) r7
            r0.<init>(r4, r7)
        L1a:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f263941x
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            skf.f r5 = r0.u
            yhm.o.b(r7)
            goto L5d
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r7)
            java.lang.String r7 = "ID_GO_TO_EXCHANGE_AUTOMATION"
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r6, r7)
            r7 = 0
            if (r6 == 0) goto L74
            boolean r6 = r5 instanceof qua.p
            if (r6 == 0) goto L46
            qua.p r5 = (qua.p) r5
            goto L47
        L46:
            r5 = 0
        L47:
            if (r5 == 0) goto L6c
            c9e.c r6 = r4.f263944n
            rae.c r6 = (rae.c) r6
            efm.d0 r5 = r6.c(r5, r7)
            r0.u = r4
            r0.f263941x = r3
            java.lang.Object r7 = nim.a.b(r5, r0)
            if (r7 != r1) goto L5c
            return r1
        L5c:
            r5 = r4
        L5d:
            java.lang.String r6 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r6)
            com.revolut.retail.core.navigation.NaviCommand r7 = (com.revolut.retail.core.navigation.NaviCommand) r7
            com.revolut.kompot.bridge.navigation.BridgeDestination r6 = zh9.u0.b(r7)
            r5.A2(r6)
            goto L75
        L6c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "ID_GO_TO_EXCHANGE_AUTOMATION clicked, but no recurring payment found in the parcel"
            r5.<init>(r6)
            throw r5
        L74:
            r3 = r7
        L75:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: skf.f.c(java.lang.Object, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
