package lvf;

import com.revolut.kompot.common.flow.permissions.PermissionsFlow;
import com.revolut.kompot.common.flow.permissions.PermissionsFlowContract$Explanation;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lul.d;
import ukm.f;
import vkm.q;
import vkm.z1;
import yji.n;
import zhm.q0;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends n implements a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ouf.a f200373l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final w39.b f200374m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final y80.a f200375n;
    public final s70.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z1 f200376p;

    public c(ouf.a transportInteractor, w39.b locationInteractor, y80.a permissionProvider, s70.a intentProvider) {
        Intrinsics.checkNotNullParameter(transportInteractor, "transportInteractor");
        Intrinsics.checkNotNullParameter(locationInteractor, "locationInteractor");
        Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        this.f200373l = transportInteractor;
        this.f200374m = locationInteractor;
        this.f200375n = permissionProvider;
        this.o = intentProvider;
        this.f200376p = q.b(0, 2, f.DROP_OLDEST);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0094, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof lvf.b
            if (r0 == 0) goto L13
            r0 = r8
            lvf.b r0 = (lvf.b) r0
            int r1 = r0.f200372x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f200372x = r1
            goto L18
        L13:
            lvf.b r0 = new lvf.b
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f200372x
            w39.b r3 = r7.f200374m
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3a
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            yhm.o.b(r8)
            goto L97
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L34:
            boolean r2 = r0.u
            yhm.o.b(r8)
            goto L59
        L3a:
            yhm.o.b(r8)
            y80.a r8 = r7.f200375n
            java.lang.String r2 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r2 = r8.c(r2)
            r8 = r3
            z39.b r8 = (z39.b) r8
            c49.d r8 = r8.f319221b
            ufm.c r8 = r8.f()
            r0.u = r2
            r0.f200372x = r5
            java.lang.Object r8 = nim.a.b(r8, r0)
            if (r8 != r1) goto L59
            goto L96
        L59:
            x39.b r8 = (x39.b) r8
            if (r2 == 0) goto La0
            x39.b r5 = x39.b.ENABLED
            if (r8 != r5) goto La0
            z39.b r3 = (z39.b) r3
            c49.d r8 = r3.f319221b
            ufm.n r8 = r8.e()
            lv9.c r3 = new lv9.c
            r5 = 3
            r3.<init>(r5)
            lr9.m r5 = new lr9.m
            r6 = 21
            r5.<init>(r3, r6)
            ufm.i r3 = new ufm.i
            r6 = 1
            r3.<init>(r8, r5, r6)
            java.lang.String r8 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r8)
            od0.h r8 = od0.i.Companion
            r8.getClass()
            od0.i r8 = od0.i.f224256b
            pfm.z r8 = ue0.e.F(r3, r8)
            r0.u = r2
            r0.f200372x = r4
            java.lang.Object r8 = nim.a.b(r8, r0)
            if (r8 != r1) goto L97
        L96:
            return r1
        L97:
            od0.i r8 = (od0.i) r8
            java.lang.Object r8 = r8.g()
            com.revolut.feature.location.api.domain.models.location.LocationDomain r8 = (com.revolut.feature.location.api.domain.models.location.LocationDomain) r8
            return r8
        La0:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: lvf.c.Z2(gim.c):java.lang.Object");
    }

    public final void b3(Function1 onResult) {
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        n.Q2(this, new PermissionsFlow(q0.c(new Pair("android.permission.ACCESS_COARSE_LOCATION", PermissionsFlowContract$Explanation.None.f98339a))), null, new d(this, onResult, 1), 1);
    }
}
