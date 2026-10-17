package wtc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import org.jetbrains.annotations.NotNull;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class k0 {

    @NotNull
    public static final h0 Companion = new h0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y80.a f299876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tb4.t f299877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g0 f299878c;
    public final gte.a d;
    public final ue0.c e;
    public final j2 f;

    public k0(y80.a permissionProvider, tb4.t connectedWifiInteractor, g0 streetModeInteractor, gte.a featureToggleInteractor, ue0.c storage) {
        Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
        Intrinsics.checkNotNullParameter(connectedWifiInteractor, "connectedWifiInteractor");
        Intrinsics.checkNotNullParameter(streetModeInteractor, "streetModeInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f299876a = permissionProvider;
        this.f299877b = connectedWifiInteractor;
        this.f299878c = streetModeInteractor;
        this.d = featureToggleInteractor;
        this.e = storage;
        this.f = vkm.q.c(storage.v0(zhm.f0.f322471a, "KEY_DISMISSED_STREET_MODE_WIFI_SSIDS", kii.e.o(String.class, KTypeProjection.INSTANCE, List.class)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(wtc.k0 r4, gim.c r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof wtc.i0
            if (r0 == 0) goto L16
            r0 = r5
            wtc.i0 r0 = (wtc.i0) r0
            int r1 = r0.f299873w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f299873w = r1
            goto L1b
        L16:
            wtc.i0 r0 = new wtc.i0
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f299873w
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r5)
            goto L4b
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            yhm.o.b(r5)
            y80.a r5 = r4.f299876a
            java.lang.String r2 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r5 = r5.c(r2)
            if (r5 != 0) goto L40
            goto L54
        L40:
            tb4.t r4 = r4.f299877b
            r0.f299873w = r3
            java.lang.Object r5 = r4.d(r0)
            if (r5 != r1) goto L4b
            return r1
        L4b:
            com.revolut.feature.security_hub.impl.interactor.ConnectedWifi r5 = (com.revolut.feature.security_hub.impl.interactor.ConnectedWifi) r5
            if (r5 == 0) goto L54
            boolean r4 = r5.f85468b
            if (r4 != 0) goto L54
            return r5
        L54:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: wtc.k0.a(wtc.k0, gim.c):java.lang.Object");
    }

    public final Object b(String str, gim.i iVar) throws Throwable {
        j2 j2Var = this.f;
        ArrayList arrayListF0 = zhm.d0.F0(str, (Collection) j2Var.getValue());
        j2Var.getClass();
        j2Var.g(null, arrayListF0);
        wka.e eVar = new wka.e(this, arrayListF0, null, 27);
        skm.p0 p0Var = skm.p0.f264001a;
        Object objJ = skm.e0.J(elm.f.f127540b, eVar, iVar);
        return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
    }
}
