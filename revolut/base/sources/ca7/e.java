package ca7;

import c69.v;
import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import etj.l;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o97.r;
import org.jetbrains.annotations.NotNull;
import skm.p0;
import vkm.v1;
import xo.h;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements z87.d {

    @NotNull
    private static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t97.b f22530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f22531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f22532c;
    public final fa7.a d;
    public final r e;

    public e(t97.b productSearchDelegateMediator, h bugReportNavigationProvider, gte.a featureToggleInteractor, fa7.a productSuggestionsRepository) {
        Intrinsics.checkNotNullParameter(productSearchDelegateMediator, "productSearchDelegateMediator");
        Intrinsics.checkNotNullParameter(bugReportNavigationProvider, "bugReportNavigationProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(productSuggestionsRepository, "productSuggestionsRepository");
        this.f22530a = productSearchDelegateMediator;
        this.f22531b = bugReportNavigationProvider;
        this.f22532c = featureToggleInteractor;
        this.d = productSuggestionsRepository;
        this.e = r.SUGGESTIONS;
    }

    @Override // z87.d
    public final efm.r f(String searchQuery, GlobalSearchContext context) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(context, "context");
        fa7.e eVar = (fa7.e) this.d;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        efm.r rVarC = rd0.e.c(new v1(new l(context, eVar, (Continuation) null, 13)), p0.f264003c);
        efm.r map = this.f22530a.b().map(new c64.a(new c8i.c(13), 14));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return nim.a.w(kli.a.h(rVarC, map), new v(this, 16));
    }

    @Override // z87.f
    public final r h() {
        return this.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // z87.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.String r5, o97.y r6, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof ca7.d
            if (r0 == 0) goto L13
            r0 = r7
            ca7.d r0 = (ca7.d) r0
            int r1 = r0.f22529w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22529w = r1
            goto L1a
        L13:
            ca7.d r0 = new ca7.d
            gim.c r7 = (gim.c) r7
            r0.<init>(r4, r7)
        L1a:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f22529w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r7)
            goto L6b
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r7)
            java.lang.String r7 = "REPORT_BUG_ID"
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r5, r7)
            if (r5 == 0) goto L4d
            o97.l r5 = new o97.l
            com.revolut.retail.core.navigation.FeatureCommand r6 = new com.revolut.retail.core.navigation.FeatureCommand
            xo.h r7 = r4.f22531b
            com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig r7 = r7.b()
            r6.<init>(r7)
            r5.<init>(r6)
            return r5
        L4d:
            java.lang.Object r5 = r6.f223136b
            boolean r6 = r5 instanceof p97.a
            if (r6 == 0) goto L56
            p97.a r5 = (p97.a) r5
            goto L57
        L56:
            r5 = 0
        L57:
            if (r5 != 0) goto L5c
            o97.e r5 = o97.e.f223096a
            goto L6e
        L5c:
            t97.b r6 = r4.f22530a
            efm.d0 r5 = r6.a(r5)
            r0.f22529w = r3
            java.lang.Object r7 = nim.a.b(r5, r0)
            if (r7 != r1) goto L6b
            return r1
        L6b:
            r5 = r7
            o97.x r5 = (o97.x) r5
        L6e:
            kotlin.jvm.internal.Intrinsics.h(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ca7.e.l(java.lang.String, o97.y, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
