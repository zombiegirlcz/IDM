package jd3;

import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier;
import efm.r;
import jcj.n;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import skm.p0;
import te0.w;

/* JADX INFO: loaded from: classes21.dex */
public final class l implements z5e.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f172972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f172973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bd3.a f172974c;

    public l(k productAccountProvider, c itemsProvider, bd3.a cashbackInteractor) {
        Intrinsics.checkNotNullParameter(productAccountProvider, "productAccountProvider");
        Intrinsics.checkNotNullParameter(itemsProvider, "itemsProvider");
        Intrinsics.checkNotNullParameter(cashbackInteractor, "cashbackInteractor");
        this.f172972a = productAccountProvider;
        this.f172973b = itemsProvider;
        this.f172974c = cashbackInteractor;
    }

    @Override // z5e.c
    public final Object d(ProductAccountId productAccountId, Continuation continuation) {
        Object objA = nim.a.a(this.f172974c.b(), continuation);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
    }

    @Override // z5e.c
    public final Flow f(ProductSpaceIdentifier productSpaceIdentifier, sfe.a dataLoadingMode) {
        Intrinsics.checkNotNullParameter(productSpaceIdentifier, "productSpaceIdentifier");
        Intrinsics.checkNotNullParameter(dataLoadingMode, "dataLoadingMode");
        return rd0.e.b(nim.a.w(this.f172972a.c(c8g.c.C(dataLoadingMode)), new n(24)));
    }

    @Override // z5e.c
    public final Flow h(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        kotlinx.coroutines.d dVar = p0.f264003c;
        c cVar = this.f172973b;
        sfm.b bVar = new sfm.b(w.o0(dVar, new j2c.b(cVar, null, 15)), new j6k.g(new a(cVar, 1), 24), 2);
        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
        r rVarFlatMap = cVar.e.b(uc3.d.PLAN).flatMap(new j6k.g(new a(cVar, 2), 25));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMap, "flatMap(...)");
        r map = w.m(bVar, rVarFlatMap, ((gd3.g) cVar.f172953a.f14523a).f143058h.f(Unit.f186387a, true)).map(new j6k.g(new a(cVar, 0), 23));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return rd0.e.b(map);
    }

    @Override // z5e.c
    public final Flow j(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        r map = this.f172972a.c(w4l.h.f294642c).map(new j6k.g(new n(25), 26));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return rd0.e.b(map);
    }
}
