package hje;

import com.revolut.feature.card_design.api.CardDesignFeatureConfig;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import e93.l0;
import efm.d0;
import java.util.HashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements cje.b, q06.k, ai5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ai5.b f152727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sri.m f152728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ld5.b f152729c;
    public final FeatureCommand d;

    public c(sri.m navigator, ai5.b cryptoNavigationInterceptor, ld5.b cryptoCardsAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(cryptoNavigationInterceptor, "cryptoNavigationInterceptor");
        Intrinsics.checkNotNullParameter(cryptoCardsAvailabilityInteractor, "cryptoCardsAvailabilityInteractor");
        this.f152727a = cryptoNavigationInterceptor;
        this.f152728b = navigator;
        this.f152729c = cryptoCardsAvailabilityInteractor;
        this.d = new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.b.f277278a, null, null, 6)));
    }

    public static FeatureCommand g(jf0.c cVar) {
        b93.e eVar = b93.e.VIRTUAL;
        xfa.b bVar = xfa.b.CARDS_TAB_FULL_SCREEN;
        l0 l0Var = l0.CRYPTO;
        h93.l0 l0Var2 = h93.l0.CRYPTO;
        String str = (String) cVar.d.get("groupCode");
        HashMap map = cVar.d;
        String str2 = (String) map.get("challengeCampaignId");
        String str3 = (String) map.get("designCode");
        return gc0.c.f(new CardDesignFeatureConfig(eVar, null, null, str3 != null ? new b93.b(str3) : null, null, false, null, true, false, null, bVar, null, null, null, str, null, l0Var, null, l0Var2, null, str2, false, false, null, 493612526));
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "crypto") && Intrinsics.f(cVar.e(2), "card-design-selection");
    }

    @Override // ai5.b
    public final d0 b(String deeplinkUri) {
        Intrinsics.checkNotNullParameter(deeplinkUri, "deeplinkUri");
        return this.f152727a.b(deeplinkUri);
    }

    @Override // ai5.b
    public final Object c(NaviCommand naviCommand, Continuation continuation) {
        return this.f152727a.c(naviCommand, continuation);
    }

    @Override // ai5.b
    public final Object d(String str, Continuation continuation) {
        return this.f152727a.d(str, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof hje.b
            if (r0 == 0) goto L13
            r0 = r7
            hje.b r0 = (hje.b) r0
            int r1 = r0.f152726x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f152726x = r1
            goto L1a
        L13:
            hje.b r0 = new hje.b
            gim.c r7 = (gim.c) r7
            r0.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f152726x
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L3c
            if (r2 == r3) goto L36
            if (r2 != r4) goto L2e
            jf0.c r6 = r0.u
            yhm.o.b(r7)
            goto L6d
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            jf0.c r6 = r0.u
            yhm.o.b(r7)
            goto L4e
        L3c:
            yhm.o.b(r7)
            java.lang.String r7 = r6.f173629c
            r0.u = r6
            r0.f152726x = r3
            ai5.b r2 = r5.f152727a
            java.lang.Object r7 = r2.d(r7, r0)
            if (r7 != r1) goto L4e
            goto L6c
        L4e:
            q06.j r7 = (q06.j) r7
            if (r7 == 0) goto L53
            return r7
        L53:
            ld5.b r7 = r5.f152729c
            efm.r r7 = r7.a()
            efm.d0 r7 = r7.firstOrError()
            java.lang.String r2 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r2)
            r0.u = r6
            r0.f152726x = r4
            java.lang.Object r7 = nim.a.b(r7, r0)
            if (r7 != r1) goto L6d
        L6c:
            return r1
        L6d:
            ed5.c r7 = (ed5.c) r7
            r7.getClass()
            boolean r7 = r7 instanceof ed5.a
            r0 = 0
            if (r7 != 0) goto L78
            return r0
        L78:
            q06.h r7 = new q06.h
            com.revolut.kompot.bridge.navigation.BridgeDestination r1 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            com.revolut.retail.core.navigation.FeatureCommand r6 = g(r6)
            r1.<init>(r6)
            q06.b r6 = new q06.b
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r2 = ibb.c.d
            r6.<init>(r2, r0)
            r7.<init>(r1, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: hje.c.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        d0 d0VarB = b(deeplink.f173629c);
        hae.k kVar = new hae.k(new a(this, z, deeplink, 0), 26);
        d0VarB.getClass();
        ufm.i iVar = new ufm.i(d0VarB, kVar, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }
}
