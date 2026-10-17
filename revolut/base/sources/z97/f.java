package z97;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.globalsearch.api.R$string;
import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import jla.h;
import kotlin.Pair;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import o97.f0;
import o97.r;
import org.jetbrains.annotations.NotNull;
import zf8.k;
import zhm.h0;
import zhm.v;
import zsc.p;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements z87.d {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f320316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f320317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q78.e f320318c;
    public final r d;
    public final zsc.h e;

    public f(k juniorAccountInfoProvider, f01.c uiKitResources, h productCatalogueInteractor, q78.e juniorAccountDestinationResolver) {
        Intrinsics.checkNotNullParameter(juniorAccountInfoProvider, "juniorAccountInfoProvider");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(juniorAccountDestinationResolver, "juniorAccountDestinationResolver");
        this.f320316a = juniorAccountInfoProvider;
        this.f320317b = productCatalogueInteractor;
        this.f320318c = juniorAccountDestinationResolver;
        this.d = r.JUNIOR_ACCOUNTS;
        atc.d dVarA = tz4.d.a(uiKitResources, R$string.junior_search_product_keyword_18, R$string.junior_search_product_keyword_children, R$string.junior_search_product_keyword_junior, R$string.junior_search_product_keyword_kids, R$string.junior_search_product_keyword_lt18, R$string.junior_search_product_keyword_teens, R$string.junior_search_product_keyword_under, R$string.junior_search_product_keyword_youth);
        p pVar = p.WORD_PREFIX;
        this.e = new zsc.h(v.k(new Pair(dVarA, pVar), new Pair(new c(), pVar)));
    }

    @Override // z87.d
    public final efm.r f(String searchQuery, GlobalSearchContext context) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(context, "context");
        efm.r map = rd0.e.c(bla.b.b(this.f320317b, "YOUTH"), g.f186406a).map(new z3e.a(new z8h.b(7), 28));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        efm.r rVarStartWith = ue0.e.H(map, h0.f322473a, new z8h.b(8)).switchMap(new z3e.a(new a(this, searchQuery, 0), 26)).startWith(new Data(null, null, true, 3, null));
        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
        return ue0.e.E(rVarStartWith, zi0.c.P(v.k(new f0(new TextLocalisedClause(R$string.junior_search_product_accounts_section_title, null, null, 14), "JUNIOR_SECTION_LIST_ID"), o97.h0.f223107a), false, null, 3));
    }

    @Override // z87.f
    public final r h() {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // z87.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.String r8, o97.y r9, kotlin.coroutines.Continuation r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof z97.e
            if (r0 == 0) goto L14
            r0 = r10
            z97.e r0 = (z97.e) r0
            int r1 = r0.f320315w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f320315w = r1
        L12:
            r5 = r0
            goto L1c
        L14:
            z97.e r0 = new z97.e
            gim.c r10 = (gim.c) r10
            r0.<init>(r7, r10)
            goto L12
        L1c:
            java.lang.Object r10 = r5.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.f320315w
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            yhm.o.b(r10)
            goto L6e
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            yhm.o.b(r10)
            java.lang.Object r9 = r9.f223136b
            java.lang.String r10 = "JUNIOR_EMPTY_LIST_ID"
            boolean r10 = kotlin.jvm.internal.Intrinsics.f(r8, r10)
            if (r10 == 0) goto L4d
            o97.d r8 = new o97.d
            com.revolut.feature.junior_onboarding.api.navigation.JuniorOnboardingDestination$Creation r9 = new com.revolut.feature.junior_onboarding.api.navigation.JuniorOnboardingDestination$Creation
            r10 = 3
            r0 = 0
            r9.<init>(r0, r10)
            r8.<init>(r9)
            return r8
        L4d:
            java.lang.String r10 = "JUNIOR_ACCOUNT_LIST_ID_"
            r1 = 0
            boolean r8 = kotlin.text.a0.H(r8, r10, r1)
            if (r8 == 0) goto L76
            boolean r8 = r9 instanceof sf8.m
            if (r8 == 0) goto L76
            sf8.m r9 = (sf8.m) r9
            java.lang.String r8 = r9.f262361b
            r5.f320315w = r2
            q78.e r1 = r7.f320318c
            r3 = 0
            r4 = 0
            r6 = 14
            r2 = r8
            java.lang.Object r10 = u68.b.b(r1, r2, r3, r4, r5, r6)
            if (r10 != r0) goto L6e
            return r0
        L6e:
            com.revolut.retail.core.navigation.NaviCommand r10 = (com.revolut.retail.core.navigation.NaviCommand) r10
            o97.l r8 = new o97.l
            r8.<init>(r10)
            return r8
        L76:
            o97.e r8 = o97.e.f223096a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: z97.f.l(java.lang.String, o97.y, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
