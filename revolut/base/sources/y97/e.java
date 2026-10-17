package y97;

import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import o97.e0;
import o97.r;
import org.jetbrains.annotations.NotNull;
import y66.p;
import zhm.f0;
import zhm.h0;
import zhm.u;
import zkh.l0;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements z87.d {

    @NotNull
    private static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f311758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f311759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t97.b f311760c;
    public final r39.a d;
    public final r e;

    public e(l0 recentlyViewedSearchDataProvider, b investSuggestionsMapper, t97.b productSearchDelegateMediator, p97.d defaultProductSuggestionsProvider, r39.a performanceAssetDestinationProvider) {
        Intrinsics.checkNotNullParameter(recentlyViewedSearchDataProvider, "recentlyViewedSearchDataProvider");
        Intrinsics.checkNotNullParameter(investSuggestionsMapper, "investSuggestionsMapper");
        Intrinsics.checkNotNullParameter(productSearchDelegateMediator, "productSearchDelegateMediator");
        Intrinsics.checkNotNullParameter(defaultProductSuggestionsProvider, "defaultProductSuggestionsProvider");
        Intrinsics.checkNotNullParameter(performanceAssetDestinationProvider, "performanceAssetDestinationProvider");
        this.f311758a = recentlyViewedSearchDataProvider;
        this.f311759b = investSuggestionsMapper;
        this.f311760c = productSearchDelegateMediator;
        this.d = performanceAssetDestinationProvider;
        this.e = r.SUGGESTIONS_INVEST;
    }

    @Override // z87.d
    public final efm.r f(String searchQuery, GlobalSearchContext context) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(context, "context");
        if (!d0.W(searchQuery)) {
            return zi0.c.j(u.c(new e0(f0.f322471a)));
        }
        efm.r rVarC = rd0.e.c(this.f311758a.a(), g.f186406a);
        p pVar = new p(24);
        h0 h0Var = h0.f322473a;
        efm.r rVarH = ue0.e.H(rVarC, h0Var, pVar);
        efm.r map = this.f311760c.b().map(new y25.c(new p(25), 12));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        efm.r rVarCombineLatest = efm.r.combineLatest(rVarH, ue0.e.H(map, h0Var, new p(26)), new y25.c(new u3a.p(this, context, 25), 11));
        Intrinsics.h(rVarCombineLatest);
        return rVarCombineLatest;
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
    public final java.lang.Object l(java.lang.String r4, o97.y r5, kotlin.coroutines.Continuation r6) {
        /*
            r3 = this;
            boolean r4 = r6 instanceof y97.d
            if (r4 == 0) goto L13
            r4 = r6
            y97.d r4 = (y97.d) r4
            int r0 = r4.f311757w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.f311757w = r0
            goto L1a
        L13:
            y97.d r4 = new y97.d
            gim.c r6 = (gim.c) r6
            r4.<init>(r3, r6)
        L1a:
            java.lang.Object r6 = r4.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r4.f311757w
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            yhm.o.b(r6)
            goto L4b
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r6)
            java.lang.Object r5 = r5.f223136b
            boolean r6 = r5 instanceof p97.a
            if (r6 == 0) goto L53
            p97.a r5 = (p97.a) r5
            t97.b r6 = r3.f311760c
            efm.d0 r5 = r6.a(r5)
            r4.f311757w = r2
            java.lang.Object r6 = nim.a.b(r5, r4)
            if (r6 != r0) goto L4b
            return r0
        L4b:
            java.lang.String r4 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r4)
            o97.x r6 = (o97.x) r6
            return r6
        L53:
            boolean r4 = r5 instanceof vel.f
            if (r4 == 0) goto L65
            o97.d r4 = new o97.d
            r39.a r6 = r3.d
            vel.f r5 = (vel.f) r5
            com.revolut.kompot.common.ParcelableDestination r5 = r6.d(r5)
            r4.<init>(r5)
            return r4
        L65:
            o97.e r4 = o97.e.f223096a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: y97.e.l(java.lang.String, o97.y, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
