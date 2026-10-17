package my9;

import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import kotlin.jvm.internal.Intrinsics;
import om4.t3;
import org.jetbrains.annotations.NotNull;
import ox5.t0;

/* JADX INFO: loaded from: classes5.dex */
public final class y implements z87.d {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oy9.j f210440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ly9.l f210441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o97.r f210442c;

    public y(oy9.j searchDelegate, ly9.l mapper) {
        Intrinsics.checkNotNullParameter(searchDelegate, "searchDelegate");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f210440a = searchDelegate;
        this.f210441b = mapper;
        this.f210442c = o97.r.USERNAME;
    }

    @Override // z87.d
    public final efm.r f(String searchQuery, GlobalSearchContext context) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        String strE = g4i.a.e(searchQuery);
        oy9.j jVar = this.f210440a;
        efm.r rVarDistinctUntilChanged = jVar.f230926c.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        efm.r map = jVar.f230925b.q(searchQuery).map(new oy9.b(new t0(20), 13));
        Intrinsics.checkNotNullExpressionValue(map, "observeSearchResult(...)");
        efm.r map2 = te0.w.m(rVarDistinctUntilChanged, map, jVar.f230924a.a(strE)).map(new oy9.b(new t3(strE, 13), 11)).map(new oy9.b(new t0(19), 12));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        return nim.a.w(map2, new v(this, 0));
    }

    @Override // z87.f
    public final o97.r h() {
        return this.f210442c;
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
            boolean r5 = r7 instanceof my9.x
            if (r5 == 0) goto L13
            r5 = r7
            my9.x r5 = (my9.x) r5
            int r0 = r5.f210439w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r5.f210439w = r0
            goto L1a
        L13:
            my9.x r5 = new my9.x
            gim.c r7 = (gim.c) r7
            r5.<init>(r4, r7)
        L1a:
            java.lang.Object r7 = r5.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.f210439w
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            yhm.o.b(r7)
            goto L56
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r7)
            java.lang.String r7 = "searchPayload"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r7)
            m1i.t r7 = new m1i.t
            r1 = 21
            oy9.j r3 = r4.f210440a
            r7.<init>(r6, r3, r1)
            ufm.c r6 = new ufm.c
            r1 = 2
            r6.<init>(r7, r1)
            java.lang.String r7 = "fromCallable(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            r5.f210439w = r2
            java.lang.Object r7 = nim.a.b(r6, r5)
            if (r7 != r0) goto L56
            return r0
        L56:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: my9.y.l(java.lang.String, o97.y, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
