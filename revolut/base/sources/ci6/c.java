package ci6;

import kotlin.jvm.internal.Intrinsics;
import nhe.p;
import yfe.h;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends yfe.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final com.revolut.feature.external_accounts.api.navigation.a f24391l;

    public c(com.revolut.feature.external_accounts.api.navigation.a externalPocketNavigationFactory) {
        Intrinsics.checkNotNullParameter(externalPocketNavigationFactory, "externalPocketNavigationFactory");
        this.f24391l = externalPocketNavigationFactory;
    }

    @Override // yfe.c
    public final /* bridge */ /* synthetic */ Object b3(h.c cVar, p pVar) {
        return d3(pVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d3(gim.c r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1 instanceof ci6.b
            if (r2 == 0) goto L17
            r2 = r1
            ci6.b r2 = (ci6.b) r2
            int r3 = r2.f24390x
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f24390x = r3
            goto L1c
        L17:
            ci6.b r2 = new ci6.b
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.v
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f24390x
            r5 = 1
            if (r4 == 0) goto L35
            if (r4 != r5) goto L2d
            ci6.c r2 = r2.u
            yhm.o.b(r1)
            goto L69
        L2d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L35:
            yhm.o.b(r1)
            com.revolut.feature.external_accounts.api.navigation.ExternalAccountsFeatureConfig$Configuration$DirectLink r6 = new com.revolut.feature.external_accounts.api.navigation.ExternalAccountsFeatureConfig$Configuration$DirectLink
            java.lang.Integer r7 = new java.lang.Integer
            r1 = 1337(0x539, float:1.874E-42)
            r7.<init>(r1)
            r11 = 0
            r12 = 126(0x7e, float:1.77E-43)
            r8 = 0
            r9 = 0
            r10 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            com.revolut.feature.external_accounts.api.navigation.ExternalAccountsFeatureConfig$Configuration$TrueLayer r7 = new com.revolut.feature.external_accounts.api.navigation.ExternalAccountsFeatureConfig$Configuration$TrueLayer
            r15 = 0
            r16 = 16381(0x3ffd, float:2.2955E-41)
            r12 = 0
            r13 = 0
            r14 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            com.revolut.feature.external_accounts.api.navigation.a r1 = r0.f24391l
            ym6.d r1 = (ym6.d) r1
            ufm.i r1 = r1.b(r7, r6, r5)
            r2.u = r0
            r2.f24390x = r5
            java.lang.Object r1 = nim.a.b(r1, r2)
            if (r1 != r3) goto L68
            return r3
        L68:
            r2 = r0
        L69:
            java.lang.String r3 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            com.revolut.retail.core.navigation.NaviCommand r1 = (com.revolut.retail.core.navigation.NaviCommand) r1
            com.revolut.kompot.bridge.navigation.BridgeDestination r3 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            r3.<init>(r1)
            r2.A2(r3)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ci6.c.d3(gim.c):java.lang.Object");
    }
}
