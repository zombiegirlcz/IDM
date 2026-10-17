package wtc;

import com.revolut.feature.location.api.domain.models.location.LocationDomain;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vge.f1;

/* JADX INFO: loaded from: classes7.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cuc.e0 f299869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jla.h f299870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y80.a f299871c;
    public final tb4.t d;
    public final gte.a e;

    public g0(cuc.e0 streetModeRepository, jla.h productCatalogueInteractor, y80.a permissionProvider, tb4.t connectedWifiInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(streetModeRepository, "streetModeRepository");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
        Intrinsics.checkNotNullParameter(connectedWifiInteractor, "connectedWifiInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f299869a = streetModeRepository;
        this.f299870b = productCatalogueInteractor;
        this.f299871c = permissionProvider;
        this.d = connectedWifiInteractor;
        this.e = featureToggleInteractor;
    }

    public final Object a(String str, LocationDomain locationDomain, gim.i iVar) throws Throwable {
        cuc.e0 e0Var = this.f299869a;
        e0Var.getClass();
        cuc.c cVar = new cuc.c(4, e0Var, locationDomain, str, (Continuation) null);
        skm.p0 p0Var = skm.p0.f264001a;
        Object objJ = skm.e0.J(elm.f.f127540b, cVar, iVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof wtc.e0
            if (r0 == 0) goto L13
            r0 = r9
            wtc.e0 r0 = (wtc.e0) r0
            int r1 = r0.f299866w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f299866w = r1
            goto L18
        L13:
            wtc.e0 r0 = new wtc.e0
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f299866w
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L37
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r9)
            return r9
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L33:
            yhm.o.b(r9)
            goto L5d
        L37:
            yhm.o.b(r9)
            com.revolut.feature.security_hub.api.SecurityHubApi$Toggles$StreetModeWifi r9 = com.revolut.feature.security_hub.api.SecurityHubApi$Toggles.StreetModeWifi.f85371c
            gte.a r2 = r8.e
            jte.d r2 = (jte.d) r2
            boolean r9 = r2.c(r9)
            if (r9 != 0) goto L47
            goto L66
        L47:
            y80.a r9 = r8.f299871c
            java.lang.String r2 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r9 = r9.c(r2)
            if (r9 != 0) goto L52
            goto L66
        L52:
            r0.f299866w = r4
            tb4.t r9 = r8.d
            java.lang.Object r9 = r9.d(r0)
            if (r9 != r1) goto L5d
            goto L9e
        L5d:
            com.revolut.feature.security_hub.impl.interactor.ConnectedWifi r9 = (com.revolut.feature.security_hub.impl.interactor.ConnectedWifi) r9
            if (r9 != 0) goto L62
            goto L66
        L62:
            boolean r2 = r9.f85468b
            if (r2 == 0) goto L67
        L66:
            return r5
        L67:
            kotlinx.coroutines.flow.Flow r2 = r8.e()
            wsg.e r6 = new wsg.e
            r7 = 22
            r6.<init>(r7)
            jhi.b r2 = mo3.a.g(r2, r5, r6, r4)
            v0b.b r4 = new v0b.b
            r6 = 28
            r4.<init>(r2, r9, r6)
            vge.f1 r9 = new vge.f1
            r2 = 3
            r6 = 25
            r9.<init>(r2, r6, r5)
            zhm.h0 r2 = zhm.h0.f322473a
            vkm.y r9 = rd0.e.e(r4, r2, r9)
            wda.l r2 = new wda.l
            r4 = 3
            r2.<init>(r3, r4, r5)
            vkm.v r4 = new vkm.v
            r4.<init>(r9, r2)
            r0.f299866w = r3
            java.lang.Object r9 = vkm.q.x(r4, r0)
            if (r9 != r1) goto L9f
        L9e:
            return r1
        L9f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: wtc.g0.b(gim.c):java.lang.Object");
    }

    public final Object c(gim.c cVar) {
        return vkm.q.x(new vkm.v(mo3.a.h(e(), new w2a.o(24), new wsg.e(23), 2), new wda.l(2, 4, null)), cVar);
    }

    public final boolean d() {
        return this.f299870b.d("security_hub.street_mode", null) == bla.c.ENABLED;
    }

    public final Flow e() {
        if (!d()) {
            return vkm.i.f290039a;
        }
        cuc.e0 e0Var = this.f299869a;
        e0Var.getClass();
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return e0Var.d.b(Unit.f186387a, loadingStrategy);
    }

    public final Object f(gim.i iVar) {
        if (!d()) {
            return Unit.f186387a;
        }
        x4l.c cVar = this.f299869a.d;
        Unit unit = Unit.f186387a;
        Object objD = cVar.d(unit, false, iVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objD != aVar) {
            objD = unit;
        }
        return objD == aVar ? objD : unit;
    }

    public final Object g(gim.c cVar) {
        return vkm.q.x(new vkm.v(rd0.e.e(new vvh.e(mo3.a.g(e(), null, new wsg.e(21), 1), 5), zhm.h0.f322473a, new f1(3, 26, null)), new wda.l(2, 5, null)), cVar);
    }

    public final Object h(LocationDomain locationDomain, wj0.b bVar, gim.c cVar) throws Throwable {
        cuc.e0 e0Var = this.f299869a;
        e0Var.getClass();
        c5a.m0 m0Var = new c5a.m0(e0Var, locationDomain, bVar, null, 16);
        skm.p0 p0Var = skm.p0.f264001a;
        Object objJ = skm.e0.J(elm.f.f127540b, m0Var, cVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }

    public final Object i(String str, String str2, LocationDomain locationDomain, int i, gim.c cVar) throws Throwable {
        cuc.e0 e0Var = this.f299869a;
        e0Var.getClass();
        aie.v vVar = new aie.v(e0Var, str, locationDomain, str2, i, (Continuation) null, 3);
        skm.p0 p0Var = skm.p0.f264001a;
        Object objJ = skm.e0.J(elm.f.f127540b, vVar, cVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }
}
