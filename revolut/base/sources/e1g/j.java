package e1g;

import c1g.k;
import c1g.m;
import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import com.revolut.feature.travel.experiences.api.models.search.TravelSearchAttraction;
import com.revolut.feature.travel.experiences.api.models.search.TravelSearchDestination;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o97.r;
import o97.x;
import o97.y;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements z87.d {

    @NotNull
    private static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hyf.a f121988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hyf.d f121989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f121990c;
    public final a d;
    public final r e;

    public j(hyf.a experiencesFeatureInteractor, hyf.d experiencesSearchInteractor, k experiencesConfigInteractor, a experiencesSearchMapper) {
        Intrinsics.checkNotNullParameter(experiencesFeatureInteractor, "experiencesFeatureInteractor");
        Intrinsics.checkNotNullParameter(experiencesSearchInteractor, "experiencesSearchInteractor");
        Intrinsics.checkNotNullParameter(experiencesConfigInteractor, "experiencesConfigInteractor");
        Intrinsics.checkNotNullParameter(experiencesSearchMapper, "experiencesSearchMapper");
        this.f121988a = experiencesFeatureInteractor;
        this.f121989b = experiencesSearchInteractor;
        this.f121990c = experiencesConfigInteractor;
        this.d = experiencesSearchMapper;
        this.e = r.EXPERIENCES;
    }

    @Override // z87.d
    public final efm.r f(String searchQuery, GlobalSearchContext context) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(context, "context");
        efm.r rVarFlatMap = ((m) this.f121988a).b().flatMap(new e0f.k(new e1.b(this, searchQuery, 5), 20));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMap, "flatMap(...)");
        return rVarFlatMap;
    }

    @Override // z87.f
    public final r h() {
        return this.e;
    }

    @Override // z87.f
    public final Object l(String str, y yVar, Continuation continuation) throws Throwable {
        Object obj2 = yVar.f223136b;
        if (obj2 instanceof TravelSearchDestination) {
            p0 p0Var = p0.f264001a;
            Object objJ = e0.J(elm.f.f127540b, new h(this, obj2, null), continuation);
            return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : (x) objJ;
        }
        if (!(obj2 instanceof TravelSearchAttraction)) {
            return o97.e.f223096a;
        }
        p0 p0Var2 = p0.f264001a;
        Object objJ2 = e0.J(elm.f.f127540b, new i(this, obj2, null), continuation);
        return objJ2 == fim.a.COROUTINE_SUSPENDED ? objJ2 : (x) objJ2;
    }
}
