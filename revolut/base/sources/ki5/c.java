package ki5;

import efm.d0;
import g48.r;
import ji5.m;
import kotlin.Lazy;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import rd0.e;
import te0.w;
import ufm.i;
import yhm.j;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements ai5.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f184183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sri.m f184184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f184185c;

    public c(m cryptoPreferencesInteractor, sri.m navigator) {
        Intrinsics.checkNotNullParameter(cryptoPreferencesInteractor, "cryptoPreferencesInteractor");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f184183a = cryptoPreferencesInteractor;
        this.f184184b = navigator;
        this.f184185c = j.b(new ka9.b(18));
    }

    @Override // ai5.b
    public final d0 b(String deeplinkUri) {
        Intrinsics.checkNotNullParameter(deeplinkUri, "deeplinkUri");
        m mVar = this.f184183a;
        r rVarA = mVar.a();
        g gVar = g.f186406a;
        d0 d0VarFirst = e.c(rVarA, gVar).first(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(d0VarFirst, "first(...)");
        d0 d0VarFirst2 = e.c(mVar.b(), gVar).first(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(d0VarFirst2, "first(...)");
        i iVar = new i(w.H0(d0VarFirst, d0VarFirst2), new kce.c(new k79.b(this, deeplinkUri, 16), 13), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [int] */
    @Override // ai5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.revolut.retail.core.navigation.NaviCommand r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof ki5.b
            if (r0 == 0) goto L13
            r0 = r9
            ki5.b r0 = (ki5.b) r0
            int r1 = r0.f184182y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f184182y = r1
            goto L18
        L13:
            ki5.b r0 = new ki5.b
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f184180w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f184182y
            ji5.m r3 = r7.f184183a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3e
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            int r8 = r0.v
            com.revolut.retail.core.navigation.NaviCommand r0 = r0.u
            yhm.o.b(r9)
            goto L6f
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            com.revolut.retail.core.navigation.NaviCommand r8 = r0.u
            yhm.o.b(r9)
            goto L50
        L3e:
            yhm.o.b(r9)
            g48.r r9 = r3.a()
            r0.u = r8
            r0.f184182y = r5
            java.lang.Object r9 = vkm.q.z(r9, r0)
            if (r9 != r1) goto L50
            goto L6a
        L50:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            if (r9 == 0) goto L59
            boolean r9 = r9.booleanValue()
            goto L5a
        L59:
            r9 = 0
        L5a:
            vkm.y r2 = r3.b()
            r0.u = r8
            r0.v = r9
            r0.f184182y = r4
            java.lang.Object r0 = vkm.q.z(r2, r0)
            if (r0 != r1) goto L6b
        L6a:
            return r1
        L6b:
            r6 = r0
            r0 = r8
            r8 = r9
            r9 = r6
        L6f:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            if (r9 == 0) goto L77
            boolean r5 = r9.booleanValue()
        L77:
            if (r8 == 0) goto L7c
            if (r5 == 0) goto L7c
            return r0
        L7c:
            if (r8 == 0) goto L9c
            com.revolut.retail.feature.crypto.navigation.api.interceptor.CryptoNavigationMainContainerActionExtensionPayload$Navigation r8 = new com.revolut.retail.feature.crypto.navigation.api.interceptor.CryptoNavigationMainContainerActionExtensionPayload$Navigation
            r8.<init>(r0)
            com.revolut.retail.core.navigation.FeatureCommand r9 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig$WithAction r0 = new com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig$WithAction
            s49.a r1 = s49.a.SINGLE_TOP
            com.revolut.feature.mainscreen.core.api.navigation.action.MainContainerActionData r2 = new com.revolut.feature.mainscreen.core.api.navigation.action.MainContainerActionData
            com.revolut.feature.mainscreen.core.api.navigation.action.MainContainerActionId r3 = new com.revolut.feature.mainscreen.core.api.navigation.action.MainContainerActionId
            java.lang.String r4 = "CRYPTO_NAVIGATION_INTERCEPTOR"
            r3.<init>(r4)
            r2.<init>(r3, r8)
            r0.<init>(r1, r2)
            r9.<init>(r0)
            return r9
        L9c:
            kotlin.Lazy r8 = r7.f184185c
            java.lang.Object r8 = r8.getValue()
            com.revolut.retail.core.navigation.FeatureCommand r8 = (com.revolut.retail.core.navigation.FeatureCommand) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ki5.c.c(com.revolut.retail.core.navigation.NaviCommand, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [int] */
    @Override // ai5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof ki5.a
            if (r0 == 0) goto L13
            r0 = r9
            ki5.a r0 = (ki5.a) r0
            int r1 = r0.f184179y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f184179y = r1
            goto L18
        L13:
            ki5.a r0 = new ki5.a
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f184177w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f184179y
            ji5.m r3 = r7.f184183a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3e
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            int r8 = r0.v
            java.lang.String r0 = r0.u
            yhm.o.b(r9)
            goto L6f
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            java.lang.String r8 = r0.u
            yhm.o.b(r9)
            goto L50
        L3e:
            yhm.o.b(r9)
            g48.r r9 = r3.a()
            r0.u = r8
            r0.f184179y = r5
            java.lang.Object r9 = vkm.q.z(r9, r0)
            if (r9 != r1) goto L50
            goto L6a
        L50:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            if (r9 == 0) goto L59
            boolean r9 = r9.booleanValue()
            goto L5a
        L59:
            r9 = 0
        L5a:
            vkm.y r2 = r3.b()
            r0.u = r8
            r0.v = r9
            r0.f184179y = r4
            java.lang.Object r0 = vkm.q.z(r2, r0)
            if (r0 != r1) goto L6b
        L6a:
            return r1
        L6b:
            r6 = r0
            r0 = r8
            r8 = r9
            r9 = r6
        L6f:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            if (r9 == 0) goto L77
            boolean r5 = r9.booleanValue()
        L77:
            r9 = 0
            if (r8 == 0) goto L7d
            if (r5 == 0) goto L7d
            return r9
        L7d:
            if (r8 == 0) goto L9b
            q06.i r8 = new q06.i
            q06.a r9 = new q06.a
            com.revolut.feature.rev10_main_screen.api.action.MainScreenContainerActionData r1 = new com.revolut.feature.rev10_main_screen.api.action.MainScreenContainerActionData
            com.revolut.feature.rev10_main_screen.api.action.MainScreenContainerActionId r2 = new com.revolut.feature.rev10_main_screen.api.action.MainScreenContainerActionId
            java.lang.String r3 = "CRYPTO_NAVIGATION_INTERCEPTOR"
            r2.<init>(r3)
            com.revolut.retail.feature.crypto.navigation.api.interceptor.CryptoNavigationMainContainerActionExtensionPayload$Deeplink r3 = new com.revolut.retail.feature.crypto.navigation.api.interceptor.CryptoNavigationMainContainerActionExtensionPayload$Deeplink
            r3.<init>(r0)
            r1.<init>(r2, r3)
            r9.<init>(r1)
            r8.<init>(r9)
            return r8
        L9b:
            q06.i r8 = new q06.i
            q06.b r0 = new q06.b
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r1 = ibb.c.f160140a
            r0.<init>(r1, r9)
            r8.<init>(r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ki5.c.d(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
