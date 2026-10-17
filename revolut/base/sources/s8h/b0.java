package s8h;

import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class b0 implements jf0.d, q06.k {

    @NotNull
    public static final y Companion = new y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ugl.c f260995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sri.m f260996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f260997c;

    public b0(ugl.c screenerInteractor, sri.m navigator) {
        Intrinsics.checkNotNullParameter(screenerInteractor, "screenerInteractor");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f260995a = screenerInteractor;
        this.f260996b = navigator;
        this.f260997c = yhm.j.b(new s8f.h(3));
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return wp5.y.D(cVar, "deeplink", 1, "instruments") && Intrinsics.f(cVar.e(2), "collection");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof s8h.a0
            if (r0 == 0) goto L13
            r0 = r7
            s8h.a0 r0 = (s8h.a0) r0
            int r1 = r0.f260992w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f260992w = r1
            goto L1a
        L13:
            s8h.a0 r0 = new s8h.a0
            gim.c r7 = (gim.c) r7
            r0.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f260992w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L4b
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r7)
            r7 = 3
            java.lang.String r6 = r6.e(r7)
            s8h.z r7 = new s8h.z
            r2 = 1
            r7.<init>(r5, r6, r4, r2)
            r0.f260992w = r3
            r2 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r7 = skm.h2.b(r2, r7, r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            com.revolut.shared.feature.wealth.models.screener.ScreenerCollection r7 = (com.revolut.shared.feature.wealth.models.screener.ScreenerCollection) r7
            if (r7 != 0) goto L52
            com.revolut.feature.wealth_discovery.api.declaration.ScreenerRedesignAllCollectionsDestination r6 = com.revolut.feature.wealth_discovery.api.declaration.ScreenerRedesignAllCollectionsDestination.f96104a
            goto L59
        L52:
            com.revolut.feature.wealth_discovery.api.declaration.ScreenerCollectionDestination r6 = new com.revolut.feature.wealth_discovery.api.declaration.ScreenerCollectionDestination
            java.lang.String r7 = r7.f105154a
            r6.<init>(r7, r4)
        L59:
            q06.h r7 = new q06.h
            q06.b r0 = new q06.b
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r1 = ibb.c.f160141b
            r0.<init>(r1, r4)
            r7.<init>(r6, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: s8h.b0.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final efm.d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return ue0.e.F(te0.w.o0(kotlin.coroutines.g.f186406a, new l10.m(this, z, deeplink.e(3), (Continuation) null, 19)), Boolean.FALSE);
    }
}
