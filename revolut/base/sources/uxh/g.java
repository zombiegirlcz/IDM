package uxh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends h {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final mde.e f284010l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final fk3.a f284011m;

    public g(mde.e sharedHelpDestinationProvider, fk3.a configurationInteractor) {
        Intrinsics.checkNotNullParameter(sharedHelpDestinationProvider, "sharedHelpDestinationProvider");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        this.f284010l = sharedHelpDestinationProvider;
        this.f284011m = configurationInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // uxh.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof uxh.f
            if (r0 == 0) goto L13
            r0 = r5
            uxh.f r0 = (uxh.f) r0
            int r1 = r0.f284009w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f284009w = r1
            goto L18
        L13:
            uxh.f r0 = new uxh.f
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f284009w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            fk3.a r5 = r4.f284011m
            ik3.c r5 = (ik3.c) r5
            efm.d0 r5 = r5.p()
            r0.f284009w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            e7l.f r5 = (e7l.f) r5
            com.revolut.kompot.common.ExternalDestination$Browser r0 = new com.revolut.kompot.common.ExternalDestination$Browser
            java.lang.String r5 = r5.f123401x
            if (r5 != 0) goto L4d
            java.lang.String r5 = "https://www.revolut.com/legal/fees"
        L4d:
            r1 = 0
            r0.<init>(r5, r1)
            r4.A2(r0)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: uxh.g.Z2(gim.c):java.lang.Object");
    }

    @Override // uxh.h
    public final void b3() {
        A2(this.f284010l.c());
    }
}
