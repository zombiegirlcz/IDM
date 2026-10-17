package k97;

import b97.h;
import b97.l;
import com.revolut.data.model.Data;
import com.revolut.feature.globalsearch.api.GlobalSearchApi$Toggles$GlobalSearchRecentQueries;
import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import go.g;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o97.r;
import org.jetbrains.annotations.NotNull;
import rd0.e;
import skm.p0;
import w4l.j;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements z87.d {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i97.a f182290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f182291b;

    public d(i97.a recentQueriesInteractor) {
        Intrinsics.checkNotNullParameter(recentQueriesInteractor, "recentQueriesInteractor");
        this.f182290a = recentQueriesInteractor;
        this.f182291b = r.RECENT_QUERIES;
    }

    @Override // z87.d
    public final efm.r f(String searchQuery, GlobalSearchContext context) {
        Object objN;
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(context, "context");
        if (searchQuery.length() > 0) {
            efm.r rVarJust = efm.r.just(new Data(f0.f322471a, null, false, 6, null));
            Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
            return rVarJust;
        }
        i97.a aVar = this.f182290a;
        if (((jte.d) aVar.f159583b).c(GlobalSearchApi$Toggles$GlobalSearchRecentQueries.f74615c)) {
            l lVar = (l) aVar.f159582a;
            objN = e.n(nim.a.v(lVar.f13697g.b(Unit.f186387a, j.f294644c), new h(lVar, 0)), h0.f322473a);
        } else {
            objN = new g(new Data(f0.f322471a, null, false, 6, null), 2);
        }
        return e.c(new ie7.h(objN, this, 29), p0.f264003c);
    }

    @Override // z87.f
    public final r h() {
        return this.f182291b;
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
            boolean r5 = r7 instanceof k97.b
            if (r5 == 0) goto L13
            r5 = r7
            k97.b r5 = (k97.b) r5
            int r0 = r5.f182288w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r5.f182288w = r0
            goto L1a
        L13:
            k97.b r5 = new k97.b
            gim.c r7 = (gim.c) r7
            r5.<init>(r4, r7)
        L1a:
            java.lang.Object r7 = r5.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.f182288w
            r2 = 1
            o97.e r3 = o97.e.f223096a
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            yhm.o.b(r7)
            return r3
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r7)
            java.lang.Object r7 = r6.f223136b
            boolean r1 = r7 instanceof java.lang.String
            if (r1 == 0) goto L3f
            java.lang.String r7 = (java.lang.String) r7
            goto L40
        L3f:
            r7 = 0
        L40:
            if (r7 != 0) goto L43
            goto L77
        L43:
            boolean r1 = kotlin.text.d0.W(r7)
            if (r1 == 0) goto L4a
            goto L77
        L4a:
            java.lang.String r6 = r6.f223137c
            java.lang.String r1 = "delete_recent_query"
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r6, r1)
            if (r6 == 0) goto L78
            r5.f182288w = r2
            i97.a r6 = r4.f182290a
            gte.a r1 = r6.f159583b
            com.revolut.feature.globalsearch.api.GlobalSearchApi$Toggles$GlobalSearchRecentQueries r2 = com.revolut.feature.globalsearch.api.GlobalSearchApi$Toggles$GlobalSearchRecentQueries.f74615c
            jte.d r1 = (jte.d) r1
            boolean r1 = r1.c(r2)
            if (r1 != 0) goto L67
            kotlin.Unit r5 = kotlin.Unit.f186387a
            goto L74
        L67:
            b97.g r6 = r6.f159582a
            b97.l r6 = (b97.l) r6
            java.lang.Object r5 = r6.e(r7, r5)
            if (r5 != r0) goto L72
            goto L74
        L72:
            kotlin.Unit r5 = kotlin.Unit.f186387a
        L74:
            if (r5 != r0) goto L77
            return r0
        L77:
            return r3
        L78:
            o97.o0 r5 = new o97.o0
            r5.<init>(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: k97.d.l(java.lang.String, o97.y, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
