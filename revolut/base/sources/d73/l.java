package d73;

import a83.j0;
import ahe.m0;
import cie.l1;
import d27.g0;
import g48.r0;
import ha3.x;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import om4.m4;
import tfm.n4;

/* JADX INFO: loaded from: classes21.dex */
public final class l implements l63.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l93.f f111790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hy2.f f111791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r0 f111792c;
    public final zf8.k d;
    public final jla.h e;
    public final m4 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zjh.j f111793g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f111794h;

    public l(l93.f revolutCardsInteractor, hy2.f cardDesignInteractor, r0 jointAccountsInteractor, zf8.k juniorAccountInfoProvider, jla.h productCatalogueInteractor, m4 familyCreditCardWalletInteractor, zjh.j revolutPayCardInteractor) {
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(cardDesignInteractor, "cardDesignInteractor");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(juniorAccountInfoProvider, "juniorAccountInfoProvider");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(familyCreditCardWalletInteractor, "familyCreditCardWalletInteractor");
        Intrinsics.checkNotNullParameter(revolutPayCardInteractor, "revolutPayCardInteractor");
        this.f111790a = revolutCardsInteractor;
        this.f111791b = cardDesignInteractor;
        this.f111792c = jointAccountsInteractor;
        this.d = juniorAccountInfoProvider;
        this.e = productCatalogueInteractor;
        this.f = familyCreditCardWalletInteractor;
        this.f111793g = revolutPayCardInteractor;
        this.f111794h = new LinkedHashMap();
    }

    public final efm.r a(String str, b93.d cardScope) {
        Intrinsics.checkNotNullParameter(cardScope, "cardScope");
        c cVar = new c(str, cardScope);
        LinkedHashMap linkedHashMap = this.f111794h;
        if (linkedHashMap.containsKey(cVar)) {
            efm.r rVarMergeWith = ((efm.r) zhm.r0.h(cVar, linkedHashMap)).mergeWith(((x) this.f111790a).E());
            Intrinsics.h(rVarMergeWith);
            return rVarMergeWith;
        }
        akg.n nVarC = this.f111792c.c();
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f186406a;
        efm.r map = rd0.e.c(nVarC, gVar).filter(new d2i.a(new d6j.b(6), 21)).map(new d2i.a(new d6j.b(7), 22));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        efm.r rVarSwitchMap = rd0.e.c(bla.b.b(this.e, "YOUTH"), gVar).map(new d2i.a(new d6j.b(8), 27)).switchMap(new d2i.a(new b(this, 1), 28));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        n4 n4VarE = efm.r.combineLatest(map, rVarSwitchMap, rd0.e.c(new j0(new m0(this.f.a(), 2), 19), gVar), new d2i.a(new l1(20), 23)).distinctUntilChanged().flatMap(new d2i.a(new g0(this, 3, cardScope, str), 26)).replay(1).e();
        Intrinsics.checkNotNullExpressionValue(n4VarE, "refCount(...)");
        linkedHashMap.put(cVar, n4VarE);
        return n4VarE;
    }
}
