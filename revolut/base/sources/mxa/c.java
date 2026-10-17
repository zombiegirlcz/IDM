package mxa;

import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import mx0.bc;
import pwa.i;
import sri.m;
import te0.w;
import wp5.y;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements vva.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wwa.b f210237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f210238b;

    public c(wwa.b inviteCampaignHomeInteractor, m navigator) {
        Intrinsics.checkNotNullParameter(inviteCampaignHomeInteractor, "inviteCampaignHomeInteractor");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f210237a = inviteCampaignHomeInteractor;
        this.f210238b = navigator;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "support") && Intrinsics.f(cVar.e(2), "invite-details") && cVar.e(3).length() > 0;
    }

    public final d0 b() {
        i iVar = i.ACTIVE;
        wwa.b bVar = this.f210237a;
        d0 d0VarFirst = m70.a.g(w.v(wwa.b.a(bVar, iVar, null, 14), wwa.b.a(bVar, i.PAST, null, 14), new mv5.h(16)), null, null, 3).first(f0.f322471a);
        Intrinsics.checkNotNullExpressionValue(d0VarFirst, "first(...)");
        return d0VarFirst;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r11, kotlin.coroutines.Continuation r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof mxa.b
            if (r0 == 0) goto L13
            r0 = r12
            mxa.b r0 = (mxa.b) r0
            int r1 = r0.f210236x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f210236x = r1
            goto L1a
        L13:
            mxa.b r0 = new mxa.b
            gim.c r12 = (gim.c) r12
            r0.<init>(r10, r12)
        L1a:
            java.lang.Object r12 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f210236x
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.String r11 = r0.u
            yhm.o.b(r12)
            goto L4a
        L2b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L33:
            yhm.o.b(r12)
            r12 = 3
            java.lang.String r11 = r11.e(r12)
            efm.d0 r12 = r10.b()
            r0.u = r11
            r0.f210236x = r3
            java.lang.Object r12 = nim.a.b(r12, r0)
            if (r12 != r1) goto L4a
            return r1
        L4a:
            java.util.List r12 = (java.util.List) r12
            kotlin.jvm.internal.Intrinsics.h(r12)
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.Iterator r12 = r12.iterator()
        L55:
            boolean r0 = r12.hasNext()
            r1 = 0
            if (r0 == 0) goto L6c
            java.lang.Object r0 = r12.next()
            r2 = r0
            com.revolut.feature.referrals.common.data.api.domain.model.common.ActiveOrPastInviteeDetails r2 = (com.revolut.feature.referrals.common.data.api.domain.model.common.ActiveOrPastInviteeDetails) r2
            java.lang.String r2 = r2.e
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r2, r11)
            if (r2 == 0) goto L55
            goto L6d
        L6c:
            r0 = r1
        L6d:
            com.revolut.feature.referrals.common.data.api.domain.model.common.ActiveOrPastInviteeDetails r0 = (com.revolut.feature.referrals.common.data.api.domain.model.common.ActiveOrPastInviteeDetails) r0
            if (r0 != 0) goto L72
            return r1
        L72:
            q06.h r11 = new q06.h
            com.revolut.kompot.bridge.navigation.BridgeDestination r12 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            com.revolut.retail.core.navigation.FeatureCommand r2 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig r3 = new com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
            com.revolut.feature.referrals.shared.ui.api.navigation.InvitesDetailsDestination$ByInviteeDetails r5 = new com.revolut.feature.referrals.shared.ui.api.navigation.InvitesDetailsDestination$ByInviteeDetails
            pwa.n r4 = pwa.n.STANDARD
            r5.<init>(r0, r4)
            r8 = 0
            r9 = 61
            r4 = 0
            r6 = 0
            r7 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r2.<init>(r3)
            r12.<init>(r2)
            r11.<init>(r12, r1)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: mxa.c.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        String strE = deeplink.e(3);
        d0 d0VarB = b();
        bc bcVar = new bc(new mt9.c(this, strE, 16), 9);
        d0VarB.getClass();
        ufm.i iVar = new ufm.i(d0VarB, bcVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
