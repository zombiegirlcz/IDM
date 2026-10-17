package ir9;

import com.revolut.feature.payments.groups.api.navigation.PaymentsGroupsRedesignFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.d0;
import ip0.w10;
import kotlin.jvm.internal.Intrinsics;
import sri.m;
import wp5.y;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements jf0.d, q06.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f168031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rq9.a f168032b;

    public g(m navigator, rq9.a groupBillsNaviCommandProvider) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(groupBillsNaviCommandProvider, "groupBillsNaviCommandProvider");
        this.f168031a = navigator;
        this.f168032b = groupBillsNaviCommandProvider;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "groups");
    }

    public final d0 b(jf0.c cVar) {
        if (!Intrinsics.f(cVar.e(3), "join")) {
            return ((zr9.a) this.f168032b).c();
        }
        String groupInvitationCode = cVar.e(2);
        Intrinsics.checkNotNullParameter(groupInvitationCode, "groupInvitationCode");
        PaymentsGroupsRedesignFeatureConfig.JoinGroup joinGroup = new PaymentsGroupsRedesignFeatureConfig.JoinGroup(groupInvitationCode);
        ufm.b bVarM = d0.m(new FeatureCommand(new KompotOverlayFeatureConfig(joinGroup.f98274b, yhi.b.SOLID, (Integer) null, 12)));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return new ufm.i(bVarM, new a(new ip4.m(11), 3), 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ir9.f
            if (r0 == 0) goto L13
            r0 = r6
            ir9.f r0 = (ir9.f) r0
            int r1 = r0.f168030w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f168030w = r1
            goto L1a
        L13:
            ir9.f r0 = new ir9.f
            gim.c r6 = (gim.c) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f168030w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            efm.d0 r5 = r4.b(r5)
            r0.f168030w = r3
            java.lang.Object r6 = nim.a.b(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            com.revolut.retail.core.navigation.NaviCommand r6 = (com.revolut.retail.core.navigation.NaviCommand) r6
            com.revolut.kompot.bridge.navigation.BridgeDestination r5 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            r5.<init>(r6)
            q06.h r6 = new q06.h
            r0 = 0
            r6.<init>(r5, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ir9.g.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        ufm.i iVar = new ufm.i(new ufm.f(b(deeplink), new a(new w10(this, 29), 4), 3), new a(new ip4.m(12), 5), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return ue0.e.F(iVar, Boolean.TRUE);
    }
}
