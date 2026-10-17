package i9g;

import com.revolut.feature.travel.hotels.api.TravelHotelsApi$Toggles;
import fag.t0;
import fag.z0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class a0 implements p8g.d {

    @NotNull
    private static final z Companion = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f159777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z0 f159778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f159779c;
    public final fag.j0 d;
    public final p8g.c e;

    public a0(t0 repository, z0 searchRepository, gte.a featureToggleInteractor, fag.j0 recentSmartSearchesRepository, p8g.c travelHotelsFeatureInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(searchRepository, "searchRepository");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(recentSmartSearchesRepository, "recentSmartSearchesRepository");
        Intrinsics.checkNotNullParameter(travelHotelsFeatureInteractor, "travelHotelsFeatureInteractor");
        this.f159777a = repository;
        this.f159778b = searchRepository;
        this.f159779c = featureToggleInteractor;
        this.d = recentSmartSearchesRepository;
        this.e = travelHotelsFeatureInteractor;
    }

    public final ufm.n a(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        String str = ((jte.d) this.f159779c).c(TravelHotelsApi$Toggles.StaysSmartSearch.f93619c) ? "PROPERTY,LOCATION,SMART_SEARCH" : null;
        z0 z0Var = this.f159778b;
        z0Var.getClass();
        Intrinsics.checkNotNullParameter(query, "query");
        efm.d0<dag.b> staysSearch = z0Var.f133406a.getStaysSearch(query, str);
        fag.m0 m0Var = new fag.m0(new f2i.x(1, z0Var.f133407b, j9g.m.class, "toDomain", "toDomain(Lcom/revolut/feature/travel/hotels/impl/network/model/search/HotelsSearchResultsDto;)Ljava/util/List;", 0, 10), 18);
        staysSearch.getClass();
        ufm.i iVar = new ufm.i(staysSearch, m0Var, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return te0.w.i0(iVar);
    }

    public final pfm.r b(String prompt) {
        Intrinsics.checkNotNullParameter(prompt, "prompt");
        fag.j0 j0Var = this.d;
        j0Var.getClass();
        Intrinsics.checkNotNullParameter(prompt, "prompt");
        pfm.h hVar = new pfm.h(new f0d.m(j0Var, prompt, 4), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return te0.w.g0(hVar);
    }
}
