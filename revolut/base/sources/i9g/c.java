package i9g;

import com.revolut.data.model.Data;
import dgi.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fag.i f159781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f159782b;

    public c(fag.i repository, a appliedFiltersProvider, h0 searchParamsInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(appliedFiltersProvider, "appliedFiltersProvider");
        Intrinsics.checkNotNullParameter(searchParamsInteractor, "searchParamsInteractor");
        this.f159781a = repository;
        this.f159782b = searchParamsInteractor;
    }

    public final efm.r a() {
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        fag.i iVar = this.f159781a;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return iVar.f.e(Unit.f186387a, loadingStrategy);
    }

    public final efm.r b() {
        fag.i iVar = this.f159781a;
        iVar.getClass();
        efm.r rVarMergeWith = efm.r.defer(new fag.f(iVar, 0)).mergeWith(iVar.e);
        Intrinsics.checkNotNullExpressionValue(rVarMergeWith, "mergeWith(...)");
        efm.r map = rVarMergeWith.map(new i52.j(14, new i6j.p(21)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return ue0.e.E(map, new Data(zhm.f0.f322471a, null, false, 6, null));
    }

    public final efm.r c(dgi.h params) {
        fag.b params2;
        Intrinsics.checkNotNullParameter(params, "params");
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        efm.r rVarA = a();
        dgi.g gVar = params.f114690c;
        String str = params.f114689b;
        String str2 = params.f114688a;
        if (Intrinsics.f(gVar, g.a.f114687a)) {
            params2 = new fag.b(str2, str, null, null);
        } else {
            if (!(gVar instanceof dgi.f)) {
                throw new NoWhenBranchMatchedException();
            }
            params2 = new fag.b(str2, str, ((dgi.f) gVar).f114686a, fag.a.FILTERS);
        }
        fag.i iVar = this.f159781a;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(params2, "params");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return o70.a.f(pd.b.t(te0.w.v0(kli.a.h(rVarA, iVar.f133333g.e(params2, loadingStrategy))), new i9e.a(this, 1)));
    }

    public final pfm.a d(zfi.a appliedFilters) {
        Intrinsics.checkNotNullParameter(appliedFilters, "appliedFilters");
        efm.d0 d0VarFirstOrError = m70.a.g(kli.a.h(b(), a()), null, null, 3).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        Intrinsics.checkNotNullParameter(d0VarFirstOrError, "<this>");
        ufm.n nVarN = d0VarFirstOrError.n(hhm.f.f152430b);
        Intrinsics.checkNotNullExpressionValue(nVarN, "observeOn(...)");
        pfm.a aVar = new pfm.a(nVarN, new i52.j(17, new i25.e(this, appliedFilters, 9)), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return ue0.e.v(o70.a.g(aVar));
    }
}
