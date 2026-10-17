package dx7;

import com.revolut.feature.insurance_pet.api.navigation.PetFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import dug.d;
import dv5.n;
import efm.d0;
import java.util.List;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import kw7.c;
import rd0.e;
import sri.m;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements ax7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f120912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f120913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f120914c;

    public b(m navigator, c insuranceAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(insuranceAvailabilityInteractor, "insuranceAvailabilityInteractor");
        this.f120912a = navigator;
        this.f120913b = insuranceAvailabilityInteractor;
        this.f120914c = u.c("pet-insurance");
    }

    public static FeatureCommand b(jf0.c cVar) {
        return Intrinsics.f(cVar.e(2), "pet") ? new FeatureCommand(new PetFeatureConfig.Profile(cVar.e(3))) : new FeatureCommand(new PetFeatureConfig.Hub(null));
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return this.f120914c.contains(deeplink.e(1));
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
            boolean r0 = r8 instanceof dx7.a
            if (r0 == 0) goto L13
            r0 = r8
            dx7.a r0 = (dx7.a) r0
            int r1 = r0.f120911x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f120911x = r1
            goto L1a
        L13:
            dx7.a r0 = new dx7.a
            gim.c r8 = (gim.c) r8
            r0.<init>(r6, r8)
        L1a:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f120911x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            jf0.c r7 = r0.u
            yhm.o.b(r8)
            goto L68
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            yhm.o.b(r8)
            kw7.c r8 = r6.f120913b
            gw7.a r2 = gw7.a.PET_INSURANCE
            akg.n r8 = r8.a(r2)
            zfd.e r8 = zi0.c.w(r8)
            dug.d r2 = new dug.d
            r5 = 11
            r2.<init>(r5)
            jhi.b r8 = mo3.a.g(r8, r4, r2, r3)
            kotlin.coroutines.g r2 = kotlin.coroutines.g.f186406a
            efm.r r8 = rd0.e.c(r8, r2)
            efm.d0 r8 = r8.firstOrError()
            java.lang.String r2 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r2)
            r0.u = r7
            r0.f120911x = r3
            java.lang.Object r8 = nim.a.b(r8, r0)
            if (r8 != r1) goto L68
            return r1
        L68:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L71
            return r4
        L71:
            q06.h r8 = new q06.h
            com.revolut.kompot.bridge.navigation.BridgeDestination r0 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            com.revolut.retail.core.navigation.FeatureCommand r7 = b(r7)
            r0.<init>(r7)
            r8.<init>(r0, r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: dx7.b.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        d0 d0VarFirstOrError = e.c(mo3.a.g(zi0.c.w(this.f120913b.a(gw7.a.PET_INSURANCE)), null, new d(11), 1), g.f186406a).flatMapSingle(new n(new doe.c(this, b(deeplink), 19), 21)).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }
}
