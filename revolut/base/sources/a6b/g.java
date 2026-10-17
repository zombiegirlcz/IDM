package a6b;

import a08.o;
import a09.r;
import a5g.h;
import c6b.j;
import c6b.p;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import efm.d0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import pfm.z;
import skm.p0;
import sri.m;
import te0.w;
import ufm.i;
import wp5.y;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements p5b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f1594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f1595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q5b.c f1596c;
    public final c6b.m d;
    public final q06.b e;

    public g(m navigator, j promoCodeInteractor, q5b.c productAvailabilityInteractor, c6b.m userStateInteractor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(promoCodeInteractor, "promoCodeInteractor");
        Intrinsics.checkNotNullParameter(productAvailabilityInteractor, "productAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(userStateInteractor, "userStateInteractor");
        this.f1594a = navigator;
        this.f1595b = promoCodeInteractor;
        this.f1596c = productAvailabilityInteractor;
        this.d = userStateInteractor;
        this.e = new q06.b(ibb.c.f160140a, null);
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "co-brands");
    }

    public final z b(FeatureConfig featureConfig) {
        i iVar = new i(new ufm.c(new r(this, featureConfig, 1), 2), new a31.e(new h(9), 29), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return ue0.e.F(iVar, Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable c(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof a6b.c
            if (r0 == 0) goto L13
            r0 = r5
            a6b.c r0 = (a6b.c) r0
            int r1 = r0.f1587w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1587w = r1
            goto L18
        L13:
            a6b.c r0 = new a6b.c
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f1587w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r5)     // Catch: java.lang.Throwable -> L27
            goto L43
        L27:
            r5 = move-exception
            goto L4b
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            yhm.o.b(r5)
            yhm.m$a r5 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27
            q5b.c r5 = r4.f1596c     // Catch: java.lang.Throwable -> L27
            r0.f1587w = r3     // Catch: java.lang.Throwable -> L27
            c6b.p r5 = (c6b.p) r5     // Catch: java.lang.Throwable -> L27
            java.lang.Object r5 = r5.b(r0)     // Catch: java.lang.Throwable -> L27
            if (r5 != r1) goto L43
            return r1
        L43:
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L27
            r5.getClass()     // Catch: java.lang.Throwable -> L27
            yhm.m$a r0 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27
            goto L51
        L4b:
            yhm.m$a r0 = yhm.m.INSTANCE
            yhm.n r5 = yhm.o.a(r5)
        L51:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r1 = r5 instanceof yhm.n
            if (r1 == 0) goto L58
            r5 = r0
        L58:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a6b.g.c(gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof a6b.d
            if (r0 == 0) goto L13
            r0 = r6
            a6b.d r0 = (a6b.d) r0
            int r1 = r0.f1589x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1589x = r1
            goto L18
        L13:
            a6b.d r0 = new a6b.d
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f1589x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.u
            yhm.o.b(r6)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            r0.u = r5
            r0.f1589x = r3
            q5b.c r6 = r4.f1596c
            c6b.p r6 = (c6b.p) r6
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r0 = 0
            if (r6 == 0) goto L57
            q06.h r5 = new q06.h
            com.revolut.feature.retail.cobranded_cards.api.navigation.CobrandedCardsFeatureConfig$PlanHubDestination r6 = new com.revolut.feature.retail.cobranded_cards.api.navigation.CobrandedCardsFeatureConfig$PlanHubDestination
            r6.<init>(r0)
            r5.<init>(r6, r0)
            return r5
        L57:
            q06.h r6 = new q06.h
            com.revolut.feature.retail.cobranded_cards.api.navigation.CobrandedCardsFeatureConfig$CardSelectionDestination$Default r1 = new com.revolut.feature.retail.cobranded_cards.api.navigation.CobrandedCardsFeatureConfig$CardSelectionDestination$Default
            r2 = 2
            r1.<init>(r5, r2)
            r6.<init>(r1, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a6b.g.d(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007f, code lost:
    
        if (r11 == r1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a5, code lost:
    
        if (r11 == r1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0105, code lost:
    
        if (r11 == r1) goto L69;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0107 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r10, kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a6b.g.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        if (!((p) this.f1596c).a()) {
            ufm.b bVarM = d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        Continuation continuation = null;
        if (Intrinsics.f(deeplink.e(2), "promo")) {
            return ue0.e.F(w.o0(p0.f264003c, new f(this, deeplink.e(3), (String) deeplink.d.get("brand"), null)), Boolean.TRUE);
        }
        if (!Intrinsics.f(deeplink.e(2), "onboarding")) {
            i iVar = new i(ue0.e.F(w.o0(kotlin.coroutines.g.f186406a, new a01.e(this, continuation, 9)), Boolean.FALSE), new a31.e(new o(this, deeplink, 11), 28), 0);
            Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
            return iVar;
        }
        String strE = deeplink.e(3);
        i iVar2 = new i(ue0.e.F(w.o0(kotlin.coroutines.g.f186406a, new a01.e(this, continuation, 9)), Boolean.FALSE), new a(new o(this, strE, 12), 0), 0);
        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
        return iVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0083, code lost:
    
        if (r10 == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r8, java.lang.String r9, gim.c r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof a6b.e
            if (r0 == 0) goto L13
            r0 = r10
            a6b.e r0 = (a6b.e) r0
            int r1 = r0.f1591x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1591x = r1
            goto L18
        L13:
            a6b.e r0 = new a6b.e
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f1591x
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L46
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.String r8 = r0.u
            yhm.o.b(r10)
            goto L86
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            java.lang.String r8 = r0.u
            yhm.o.b(r10)
            goto L73
        L3e:
            java.lang.String r9 = r0.u
            yhm.o.b(r10)     // Catch: java.lang.Exception -> L44
            goto L59
        L44:
            r8 = move-exception
            goto L5c
        L46:
            yhm.o.b(r10)
            c6b.j r10 = r7.f1595b
            r10.b(r8)
            r0.u = r9     // Catch: java.lang.Exception -> L44
            r0.f1591x = r5     // Catch: java.lang.Exception -> L44
            java.lang.Object r8 = r10.a(r0)     // Catch: java.lang.Exception -> L44
            if (r8 != r1) goto L59
            goto L85
        L59:
            kotlin.Unit r8 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L44
            goto L65
        L5c:
            zhm.h0 r10 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r2 = rd0.d.f253311a
            rd0.c r2 = rd0.c.ERROR
            rd0.d.a(r2, r6, r6, r8, r10)
        L65:
            r0.u = r9
            r0.f1591x = r4
            c6b.m r8 = r7.d
            java.lang.Object r10 = r8.a(r0)
            if (r10 != r1) goto L72
            goto L85
        L72:
            r8 = r9
        L73:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r9 = r10.booleanValue()
            if (r9 == 0) goto La7
            r0.u = r8
            r0.f1591x = r3
            java.io.Serializable r10 = r7.c(r0)
            if (r10 != r1) goto L86
        L85:
            return r1
        L86:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r9 = r10.booleanValue()
            q06.b r10 = r7.e
            if (r9 == 0) goto L9c
            q06.h r8 = new q06.h
            com.revolut.feature.retail.cobranded_cards.api.navigation.CobrandedCardsFeatureConfig$PlanHubDestination r9 = new com.revolut.feature.retail.cobranded_cards.api.navigation.CobrandedCardsFeatureConfig$PlanHubDestination
            r9.<init>(r6)
            r8.<init>(r9, r10)
            r6 = r8
            goto La7
        L9c:
            q06.h r9 = new q06.h
            com.revolut.feature.retail.cobranded_cards.api.navigation.CobrandedCardsFeatureConfig$CardSelectionDestination$Default r0 = new com.revolut.feature.retail.cobranded_cards.api.navigation.CobrandedCardsFeatureConfig$CardSelectionDestination$Default
            r0.<init>(r8, r4)
            r9.<init>(r0, r10)
            r6 = r9
        La7:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a6b.g.g(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }
}
