package mi1;

import com.revolut.feature.permissions.flow.PermissionsController;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$InputData;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$Permission;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ma2.s;
import org.jetbrains.annotations.NotNull;
import vkm.z1;
import yji.n;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends n {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y80.a f205593l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final w39.b f205594m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final z1 f205595n;

    public d(y80.a permissionProvider, w39.b locationInteractor) {
        Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
        Intrinsics.checkNotNullParameter(locationInteractor, "locationInteractor");
        this.f205593l = permissionProvider;
        this.f205594m = locationInteractor;
        this.f205595n = ta6.a.a(1);
    }

    public static PermissionsController Z2(d dVar, Function0 onGranted) {
        mfl.b onNotGranted = new mfl.b(15);
        dVar.getClass();
        Intrinsics.checkNotNullParameter(onGranted, "onGranted");
        Intrinsics.checkNotNullParameter(onNotGranted, "onNotGranted");
        PermissionsController permissionsController = new PermissionsController(new PermissionsControllerContract$InputData(u.c(new PermissionsControllerContract$Permission("android.permission.ACCESS_FINE_LOCATION", null, null, true, 6))));
        s block = new s(dVar, onGranted, onNotGranted);
        Intrinsics.checkNotNullParameter(block, "block");
        permissionsController.H = block;
        return permissionsController;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof mi1.c
            if (r0 == 0) goto L13
            r0 = r7
            mi1.c r0 = (mi1.c) r0
            int r1 = r0.f205592w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f205592w = r1
            goto L18
        L13:
            mi1.c r0 = new mi1.c
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f205592w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L4a
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            yhm.o.b(r7)
            java.lang.Long r7 = new java.lang.Long
            r4 = 5000(0x1388, double:2.4703E-320)
            r7.<init>(r4)
            w39.b r2 = r6.f205594m
            z39.b r2 = (z39.b) r2
            ufm.i r7 = r2.c(r7)
            r0.f205592w = r3
            java.lang.Object r7 = nim.a.b(r7, r0)
            if (r7 != r1) goto L4a
            return r1
        L4a:
            od0.i r7 = (od0.i) r7
            java.lang.Object r7 = r7.f224257a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: mi1.d.b3(gim.c):java.lang.Object");
    }

    public final boolean c3() {
        boolean zC = this.f205593l.c("android.permission.ACCESS_FINE_LOCATION");
        if (zC) {
            this.f205595n.k(a.GRANTED);
        }
        return zC;
    }
}
