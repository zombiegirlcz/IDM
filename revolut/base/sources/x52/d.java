package x52;

import com.revolut.feature.apm.iris.api.navigation.IrisNavigation$Destination;
import com.revolut.feature.apm.iris.api.navigation.IrisNavigation$StartType;
import efm.d0;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sri.m;
import ufm.i;
import wp5.y;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements p52.b {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f302904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uw1.c f302905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fn2.c f302906c;

    public d(m navigator, uw1.c apmFeatureChecker, fn2.c productCatalogueLoader) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(apmFeatureChecker, "apmFeatureChecker");
        Intrinsics.checkNotNullParameter(productCatalogueLoader, "productCatalogueLoader");
        this.f302904a = navigator;
        this.f302905b = apmFeatureChecker;
        this.f302906c = productCatalogueLoader;
    }

    public static IrisNavigation$Destination b(jf0.c cVar) {
        return new IrisNavigation$Destination(Intrinsics.f(cVar.e(2), "p2m") ? new IrisNavigation$StartType.Pay.Deeplink(cVar.f173627a) : IrisNavigation$StartType.Area.f62485a, null, 2);
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "iris");
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
            boolean r0 = r8 instanceof x52.c
            if (r0 == 0) goto L13
            r0 = r8
            x52.c r0 = (x52.c) r0
            int r1 = r0.f302903x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f302903x = r1
            goto L1a
        L13:
            x52.c r0 = new x52.c
            gim.c r8 = (gim.c) r8
            r0.<init>(r6, r8)
        L1a:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f302903x
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            jf0.c r7 = r0.u
            yhm.o.b(r8)
            goto L62
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            yhm.o.b(r8)
            uw1.c r8 = r6.f302905b
            ty1.b r8 = (ty1.b) r8
            ufm.c r8 = r8.e()
            x0b.c r2 = new x0b.c
            r4 = 18
            r2.<init>(r6, r4)
            x0i.i r4 = new x0i.i
            r5 = 19
            r4.<init>(r2, r5)
            ufm.i r2 = new ufm.i
            r5 = 0
            r2.<init>(r8, r4, r5)
            java.lang.String r8 = "flatMap(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r8)
            r0.u = r7
            r0.f302903x = r3
            java.lang.Object r8 = nim.a.b(r2, r0)
            if (r8 != r1) goto L62
            return r1
        L62:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L7c
            q06.h r8 = new q06.h
            com.revolut.feature.apm.iris.api.navigation.IrisNavigation$Destination r7 = b(r7)
            q06.b r0 = new q06.b
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r1 = ibb.c.f160140a
            r2 = 0
            r0.<init>(r1, r2)
            r8.<init>(r7, r0)
            return r8
        L7c:
            q06.i r7 = new q06.i
            q06.a r8 = new q06.a
            com.revolut.feature.rev10_main_screen.api.action.MainScreenContainerActionData r0 = new com.revolut.feature.rev10_main_screen.api.action.MainScreenContainerActionData
            com.revolut.feature.rev10_main_screen.api.action.MainScreenContainerActionId r1 = new com.revolut.feature.rev10_main_screen.api.action.MainScreenContainerActionId
            java.lang.String r2 = "APM_DEEPLINK"
            r1.<init>(r2)
            com.revolut.feature.retail.main_screen.container.models.action_payload.ApmDeeplinkPayload$Unavailable r2 = new com.revolut.feature.retail.main_screen.container.models.action_payload.ApmDeeplinkPayload$Unavailable
            com.revolut.feature.retail.main_screen.container.models.action_payload.ApmDeeplinkPayload$Apm$IRIS r3 = com.revolut.feature.retail.main_screen.container.models.action_payload.ApmDeeplinkPayload.Apm.IRIS.f82733b
            r2.<init>(r3)
            r0.<init>(r1, r2)
            r8.<init>(r0)
            r7.<init>(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: x52.d.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullExpressionValue("d", "TAG");
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.b(rd0.c.INFO, "d", j6.a.q("IRIS Deeplink uri: ", deeplink.f173629c), null, null, 16);
        i iVar = new i(((ty1.b) this.f302905b).e(), new x0i.i(new x0b.c(this, 18), 19), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        i iVar2 = new i(iVar, new x0i.i(new a(this, deeplink, 0), 18), 1);
        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
        return iVar2;
    }
}
