package sqb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final toa.a f265040a;

    public d(toa.a notificationSettingsInteractor) {
        Intrinsics.checkNotNullParameter(notificationSettingsInteractor, "notificationSettingsInteractor");
        this.f265040a = notificationSettingsInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof sqb.a
            if (r0 == 0) goto L13
            r0 = r6
            sqb.a r0 = (sqb.a) r0
            int r1 = r0.f265037w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f265037w = r1
            goto L18
        L13:
            sqb.a r0 = new sqb.a
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f265037w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L55
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            toa.a r6 = r5.f265040a
            efm.r r6 = r6.b()
            vkm.d r6 = rd0.e.b(r6)
            zfd.e r6 = zi0.c.w(r6)
            hy9.b r2 = new hy9.b
            r4 = 2
            r2.<init>(r6, r4)
            zhm.h0 r6 = zhm.h0.f322473a
            vkm.y r6 = rd0.e.d(r2, r6)
            r0.f265037w = r3
            java.lang.Object r6 = vkm.q.z(r6, r0)
            if (r6 != r1) goto L55
            return r1
        L55:
            soa.b r6 = (soa.b) r6
            if (r6 != 0) goto L5b
            r6 = 0
            return r6
        L5b:
            com.revolut.feature.profile.api.navigation.KompotProfileFeatureConfig$NotificationSettingDetailsDestination r0 = new com.revolut.feature.profile.api.navigation.KompotProfileFeatureConfig$NotificationSettingDetailsDestination
            r0.<init>(r6)
            com.revolut.retail.core.navigation.FeatureCommand r6 = zh9.u0.f(r0)
            com.revolut.kompot.bridge.navigation.BridgeDestination r6 = zh9.u0.b(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: sqb.d.a(gim.c):java.lang.Object");
    }
}
