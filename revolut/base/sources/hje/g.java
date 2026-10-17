package hje;

import com.revolut.feature.card_design.api.CardDesignFeatureConfig;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import e93.v;
import efm.d0;
import h93.l0;
import java.util.HashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements jf0.d, q06.k, ai5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ai5.b f152737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sri.m f152738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ld5.b f152739c;
    public final FeatureCommand d;

    public g(sri.m navigator, ai5.b cryptoNavigationInterceptor, ld5.b cryptoCardsAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(cryptoNavigationInterceptor, "cryptoNavigationInterceptor");
        Intrinsics.checkNotNullParameter(cryptoCardsAvailabilityInteractor, "cryptoCardsAvailabilityInteractor");
        this.f152737a = cryptoNavigationInterceptor;
        this.f152738b = navigator;
        this.f152739c = cryptoCardsAvailabilityInteractor;
        this.d = new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.b.f277278a, null, null, 6)));
    }

    public static FeatureCommand g(jf0.c cVar) {
        String str = (String) cVar.d.get("groupCode");
        b93.e eVar = b93.e.PHYSICAL;
        xfa.b bVar = xfa.b.CARDS_TAB_FULL_SCREEN;
        v vVar = v.DEEPLINK_PHYSICAL;
        l0 l0Var = l0.CRYPTO;
        HashMap map = cVar.d;
        String str2 = (String) map.get("challengeCampaignId");
        String str3 = (String) map.get("designCode");
        return gc0.c.f(new CardDesignFeatureConfig(eVar, null, null, str3 != null ? new b93.b(str3) : null, null, false, null, false, false, null, bVar, null, null, vVar, str, null, null, null, l0Var, null, str2, false, str != null, null, 360312814));
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "crypto") && Intrinsics.f(cVar.e(2), "physical-card-design-selection");
    }

    @Override // ai5.b
    public final d0 b(String deeplinkUri) {
        Intrinsics.checkNotNullParameter(deeplinkUri, "deeplinkUri");
        return this.f152737a.b(deeplinkUri);
    }

    @Override // ai5.b
    public final Object c(NaviCommand naviCommand, Continuation continuation) {
        return this.f152737a.c(naviCommand, continuation);
    }

    @Override // ai5.b
    public final Object d(String str, Continuation continuation) {
        return this.f152737a.d(str, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof hje.f
            if (r0 == 0) goto L13
            r0 = r8
            hje.f r0 = (hje.f) r0
            int r1 = r0.f152736x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f152736x = r1
            goto L1a
        L13:
            hje.f r0 = new hje.f
            gim.c r8 = (gim.c) r8
            r0.<init>(r6, r8)
        L1a:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f152736x
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r3) goto L37
            if (r2 != r4) goto L2f
            jf0.c r7 = r0.u
            yhm.o.b(r8)
            goto L74
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            jf0.c r7 = r0.u
            yhm.o.b(r8)
            goto L51
        L3d:
            yhm.o.b(r8)
            java.lang.String r8 = r7.f173629c
            efm.d0 r8 = r6.b(r8)
            r0.u = r7
            r0.f152736x = r3
            java.lang.Object r8 = nim.a.b(r8, r0)
            if (r8 != r1) goto L51
            goto L73
        L51:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L5a
            goto L7d
        L5a:
            ld5.b r8 = r6.f152739c
            efm.r r8 = r8.a()
            efm.d0 r8 = r8.firstOrError()
            java.lang.String r2 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r2)
            r0.u = r7
            r0.f152736x = r4
            java.lang.Object r8 = nim.a.b(r8, r0)
            if (r8 != r1) goto L74
        L73:
            return r1
        L74:
            ed5.c r8 = (ed5.c) r8
            r8.getClass()
            boolean r8 = r8 instanceof ed5.a
            if (r8 != 0) goto L7e
        L7d:
            return r5
        L7e:
            q06.h r8 = new q06.h
            com.revolut.kompot.bridge.navigation.BridgeDestination r0 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            com.revolut.retail.core.navigation.FeatureCommand r7 = g(r7)
            r0.<init>(r7)
            q06.b r7 = new q06.b
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r1 = ibb.c.d
            r7.<init>(r1, r5)
            r8.<init>(r0, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: hje.g.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        d0 d0VarB = b(deeplink.f173629c);
        hae.k kVar = new hae.k(new d(this, z, deeplink, 0), 29);
        d0VarB.getClass();
        ufm.i iVar = new ufm.i(d0VarB, kVar, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }
}
