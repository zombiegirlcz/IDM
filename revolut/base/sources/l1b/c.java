package l1b;

import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;
import sri.m;
import te0.w;
import wp5.y;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements h1b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f191512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lg0.b f191513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f191514c;
    public final m d;

    public c(i deeplinkParser, lg0.b deeplinkHandler, l appsFlyerRepository, m navigator) {
        Intrinsics.checkNotNullParameter(deeplinkParser, "deeplinkParser");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(appsFlyerRepository, "appsFlyerRepository");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f191512a = deeplinkParser;
        this.f191513b = deeplinkHandler;
        this.f191514c = appsFlyerRepository;
        this.d = navigator;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c5 A[Catch: all -> 0x0030, TRY_LEAVE, TryCatch #0 {all -> 0x0030, blocks: (B:13:0x002b, B:38:0x00bd, B:40:0x00c5), top: B:49:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(l1b.c r9, jf0.c r10, gim.c r11) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l1b.c.b(l1b.c, jf0.c, gim.c):java.lang.Object");
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "apps-flyer");
    }

    public final void c() {
        this.d.c(gc0.c.f(new MainScreenFeatureConfig.JustShow(s49.a.AS_TOP)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r4, kotlin.coroutines.Continuation r5) {
        /*
            r3 = this;
            boolean r4 = r5 instanceof l1b.b
            if (r4 == 0) goto L13
            r4 = r5
            l1b.b r4 = (l1b.b) r4
            int r0 = r4.f191511w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.f191511w = r0
            goto L1a
        L13:
            l1b.b r4 = new l1b.b
            gim.c r5 = (gim.c) r5
            r4.<init>(r3, r5)
        L1a:
            java.lang.Object r5 = r4.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r4.f191511w
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            yhm.o.b(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r5)
            r4.f191511w = r2
            l1b.l r5 = r3.f191514c
            java.lang.Object r5 = r5.a(r4)
            if (r5 != r0) goto L3f
            return r0
        L3f:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r4 = r5.booleanValue()
            r5 = 0
            if (r4 == 0) goto L5e
            q06.h r4 = new q06.h
            com.revolut.kompot.bridge.navigation.BridgeDestination r0 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig$JustShow r1 = new com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig$JustShow
            s49.a r2 = s49.a.AS_TOP
            r1.<init>(r2)
            com.revolut.retail.core.navigation.FeatureCommand r1 = gc0.c.f(r1)
            r0.<init>(r1)
            r4.<init>(r0, r5)
            return r4
        L5e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l1b.c.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        p0 p0Var = p0.f264001a;
        return w.o0(elm.f.f127540b, new kq5.d(this, deeplink, null, 25));
    }
}
