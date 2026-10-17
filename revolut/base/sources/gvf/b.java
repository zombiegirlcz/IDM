package gvf;

import efm.d0;
import gm6.j;
import jf0.c;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import sri.m;
import te0.w;
import wp5.y;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements nuf.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final puf.a f147153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final quf.b f147154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f147155c;

    public b(puf.a navigationProvider, quf.b featureChecker, m navigator) {
        Intrinsics.checkNotNullParameter(navigationProvider, "navigationProvider");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f147153a = navigationProvider;
        this.f147154b = featureChecker;
        this.f147155c = navigator;
    }

    @Override // jf0.d, q06.k
    public final boolean a(c cVar) {
        return y.D(cVar, "deeplink", 1, "transport");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof gvf.a
            if (r0 == 0) goto L13
            r0 = r8
            gvf.a r0 = (gvf.a) r0
            int r1 = r0.f147152w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f147152w = r1
            goto L1a
        L13:
            gvf.a r0 = new gvf.a
            gim.c r8 = (gim.c) r8
            r0.<init>(r6, r8)
        L1a:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f147152w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            goto L6f
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            yhm.o.b(r8)
            quf.b r8 = r6.f147154b
            boolean r8 = r8.a()
            if (r8 != 0) goto L3e
            return r4
        L3e:
            com.revolut.retail.core.navigation.FeatureCommand r8 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.transport.api.navigation.TransportFlowDestination r2 = new com.revolut.feature.transport.api.navigation.TransportFlowDestination
            r5 = 2
            java.lang.String r7 = r7.e(r5)
            java.lang.String r5 = "tickets"
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r7, r5)
            if (r7 == 0) goto L56
            com.revolut.feature.transport.api.navigation.TransportStartType$Hub$Ticket r7 = new com.revolut.feature.transport.api.navigation.TransportStartType$Hub$Ticket
            r5 = 0
            r7.<init>(r5)
            goto L58
        L56:
            com.revolut.feature.transport.api.navigation.TransportStartType$Hub$Transit r7 = com.revolut.feature.transport.api.navigation.TransportStartType.Hub.Transit.f92499a
        L58:
            r2.<init>(r7)
            com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig r7 = zh9.u0.d(r2)
            r8.<init>(r7)
            r0.f147152w = r3
            puf.a r7 = r6.f147153a
            ovf.b r7 = (ovf.b) r7
            java.lang.Object r8 = r7.a(r8, r0)
            if (r8 != r1) goto L6f
            return r1
        L6f:
            com.revolut.retail.core.navigation.NaviCommand r8 = (com.revolut.retail.core.navigation.NaviCommand) r8
            q06.h r7 = new q06.h
            com.revolut.kompot.bridge.navigation.BridgeDestination r0 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            r0.<init>(r8)
            r7.<init>(r0, r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: gvf.b.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        if (this.f147154b.a()) {
            return w.o0(g.f186406a, new j(this, deeplink, null, 17));
        }
        ufm.b bVarM = d0.m(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }
}
