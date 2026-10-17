package v97;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.globalsearch.api.R$string;
import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import o97.m;
import o97.r;
import o97.s;
import org.jetbrains.annotations.NotNull;
import te0.w;
import v6l.e0;
import zsc.h;
import zsc.p;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements z87.c {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f286985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t97.b f286986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f286987c;
    public final r d;
    public final TextLocalisedClause e;
    public final ihm.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final afa.a f286988g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f286989h;
    public final h i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c f286990j;

    public e(a uikitResources, t97.b productSearchDelegateMediator) {
        Intrinsics.checkNotNullParameter(uikitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(productSearchDelegateMediator, "productSearchDelegateMediator");
        this.f286985a = uikitResources;
        this.f286986b = productSearchDelegateMediator;
        this.f286987c = m.DEEPLINK;
        this.d = r.PRODUCTS;
        this.e = new TextLocalisedClause(R$string.search_block_products_title, null, null, 14);
        ihm.b bVarE = ihm.b.e(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.f = bVarE;
        this.f286988g = new afa.a(this, 10);
        Intrinsics.checkNotNullParameter(uikitResources, "uikitResources");
        oy9.d dVar = new oy9.d(uikitResources, 2);
        p pVar = p.WORD_PREFIX;
        Pair pair = new Pair(dVar, pVar);
        Intrinsics.checkNotNullParameter(uikitResources, "uikitResources");
        this.f286989h = new h(pair, new Pair(new oy9.d(uikitResources, 1), pVar));
        this.i = new h(new Pair(tz4.d.a(uikitResources, R$string.search_block_products_title), pVar));
        this.f286990j = new c();
    }

    @Override // z87.c
    public final m a() {
        return this.f286987c;
    }

    @Override // z87.f
    public final r h() {
        return this.d;
    }

    @Override // z87.c
    public final efm.r i(String searchQuery, GlobalSearchContext context, s blockConstraint, efm.r remoteObservable) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(blockConstraint, "blockConstraint");
        Intrinsics.checkNotNullParameter(remoteObservable, "remoteObservable");
        efm.r map = w.m(this.f, this.f286986b.b(), m70.a.g(remoteObservable, null, new v78.d(5), 1)).map(new e0(16, new uyh.w(this, 10, searchQuery, blockConstraint)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
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
            boolean r0 = r7 instanceof v97.d
            if (r0 == 0) goto L13
            r0 = r7
            v97.d r0 = (v97.d) r0
            int r1 = r0.f286984w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f286984w = r1
            goto L1a
        L13:
            v97.d r0 = new v97.d
            gim.c r7 = (gim.c) r7
            r0.<init>(r4, r7)
        L1a:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f286984w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r7)
            goto L6f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r7)
            java.lang.String r7 = "PRODUCTS_SEARCH_HEADER"
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r5, r7)
            o97.e r7 = o97.e.f223096a
            if (r5 == 0) goto L53
            ihm.b r5 = r4.f
            java.lang.Object r6 = r5.f()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = pd.b.j(r6)
            r6 = r6 ^ r3
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r5.onNext(r6)
            return r7
        L53:
            java.lang.Object r5 = r6.f223136b
            boolean r6 = r5 instanceof p97.a
            if (r6 == 0) goto L5c
            p97.a r5 = (p97.a) r5
            goto L5d
        L5c:
            r5 = 0
        L5d:
            if (r5 != 0) goto L60
            goto L71
        L60:
            t97.b r6 = r4.f286986b
            efm.d0 r5 = r6.a(r5)
            r0.f286984w = r3
            java.lang.Object r7 = nim.a.b(r5, r0)
            if (r7 != r1) goto L6f
            return r1
        L6f:
            o97.x r7 = (o97.x) r7
        L71:
            kotlin.jvm.internal.Intrinsics.h(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: v97.e.l(java.lang.String, o97.y, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
