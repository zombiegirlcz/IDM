package vhc;

import com.revolut.feature.rewards.api.navigation.ExternalRewardRegistration;
import com.revolut.feature.rewards.api.navigation.PerkAccessDestination;
import com.revolut.feature.shops.api.config.ShopsFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.HashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import q06.h;
import q06.k;
import sri.m;
import te0.w;
import ufm.i;
import vf0.n;
import wp5.y;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements jf0.d, k {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f289465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h4g.g f289466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nid.d f289467c;

    public g(m navigator, h4g.g shopsFeatureAvailabilityInteractor, nid.d shopsNavigationCommandProvider) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(shopsFeatureAvailabilityInteractor, "shopsFeatureAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(shopsNavigationCommandProvider, "shopsNavigationCommandProvider");
        this.f289465a = navigator;
        this.f289466b = shopsFeatureAvailabilityInteractor;
        this.f289467c = shopsNavigationCommandProvider;
    }

    public static FeatureCommand b(jf0.c cVar, boolean z) {
        return (z && Intrinsics.f(cVar.e(2), "map")) ? new FeatureCommand(new ShopsFeatureConfig.Map(null)) : new FeatureCommand(new ShopsFeatureConfig.Home(null));
    }

    public static boolean c(jf0.c cVar) {
        return Intrinsics.f(cVar.e(1), "rewards") && Intrinsics.f(cVar.e(3), "registration") && Intrinsics.f(cVar.e(4), "callback");
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "rewards");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0096, code lost:
    
        if (r11 != r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(jf0.c r10, gim.c r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof vhc.f
            if (r0 == 0) goto L13
            r0 = r11
            vhc.f r0 = (vhc.f) r0
            int r1 = r0.f289464x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f289464x = r1
            goto L18
        L13:
            vhc.f r0 = new vhc.f
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f289464x
            java.lang.String r3 = "firstOrError(...)"
            h4g.g r4 = r9.f289466b
            r5 = 3
            r6 = 1
            r7 = 2
            r8 = 0
            if (r2 == 0) goto L46
            if (r2 == r6) goto L40
            if (r2 == r7) goto L3a
            if (r2 != r5) goto L32
            yhm.o.b(r11)
            goto L99
        L32:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3a:
            jf0.c r10 = r0.u
            yhm.o.b(r11)
            goto L7e
        L40:
            jf0.c r10 = r0.u
            yhm.o.b(r11)
            goto L5f
        L46:
            yhm.o.b(r11)
            efm.r r11 = r4.c()
            efm.d0 r11 = r11.firstOrError()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r3)
            r0.u = r10
            r0.f289464x = r6
            java.lang.Object r11 = nim.a.b(r11, r0)
            if (r11 != r1) goto L5f
            goto L98
        L5f:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto L68
            return r8
        L68:
            efm.r r11 = r4.d()
            efm.d0 r11 = r11.firstOrError()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r3)
            r0.u = r10
            r0.f289464x = r7
            java.lang.Object r11 = nim.a.b(r11, r0)
            if (r11 != r1) goto L7e
            goto L98
        L7e:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            kotlin.jvm.internal.Intrinsics.h(r11)
            boolean r11 = r11.booleanValue()
            com.revolut.retail.core.navigation.FeatureCommand r10 = b(r10, r11)
            r0.u = r8
            r0.f289464x = r5
            nid.d r11 = r9.f289467c
            r2 = 0
            java.lang.Object r11 = r11.a(r10, r2, r0)
            if (r11 != r1) goto L99
        L98:
            return r1
        L99:
            com.revolut.retail.core.navigation.NaviCommand r11 = (com.revolut.retail.core.navigation.NaviCommand) r11
            q06.h r10 = new q06.h
            com.revolut.kompot.bridge.navigation.BridgeDestination r0 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            r0.<init>(r11)
            r10.<init>(r0, r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: vhc.g.d(jf0.c, gim.c):java.lang.Object");
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        boolean zC = c(cVar);
        HashMap map = cVar.d;
        if (zC) {
            return new h(new BridgeDestination(vhi.c.c(new ExternalRewardRegistration(cVar.e(2), map), yhi.b.SOLID, null, false, 12)), null);
        }
        if (!Intrinsics.f(cVar.e(1), "rewards") || !Intrinsics.f(cVar.e(2), "activate")) {
            return d(cVar, (gim.c) continuation);
        }
        String str = (String) map.get("merchant");
        String str2 = (String) map.get("planTier");
        if (str == null || d0.W(str) || str2 == null || d0.W(str2)) {
            return null;
        }
        return new h(new BridgeDestination(vhi.c.c(new PerkAccessDestination(str, str2), yhi.b.SOLID, null, false, 12)), null);
    }

    @Override // jf0.d
    public final efm.d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        boolean zC = c(deeplink);
        HashMap map = deeplink.d;
        if (zC) {
            ufm.c cVar = new ufm.c(new to7.f(deeplink, this, 16), 2);
            Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
            return ue0.e.F(cVar, Boolean.FALSE);
        }
        if (!Intrinsics.f(deeplink.e(1), "rewards") || !Intrinsics.f(deeplink.e(2), "activate")) {
            h4g.g gVar = this.f289466b;
            efm.d0 d0VarFirstOrError = gVar.c().firstOrError();
            Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
            efm.d0 d0VarFirstOrError2 = gVar.d().firstOrError();
            Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError2, "firstOrError(...)");
            i iVar = new i(w.H0(d0VarFirstOrError, d0VarFirstOrError2), new n(new pud.b((Object) this, deeplink, z, 23), 29), 0);
            Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
            return ue0.e.I(iVar, h0.f322473a, new vgk.g(8));
        }
        String str = (String) map.get("merchant");
        String str2 = (String) map.get("planTier");
        if (str == null || d0.W(str) || str2 == null || d0.W(str2)) {
            ufm.b bVarM = efm.d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        ufm.c cVar2 = new ufm.c(new tif.e(str, 6, str2, this), 2);
        Intrinsics.checkNotNullExpressionValue(cVar2, "fromCallable(...)");
        return ue0.e.F(cVar2, Boolean.FALSE);
    }
}
