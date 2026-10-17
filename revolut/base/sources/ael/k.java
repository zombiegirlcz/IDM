package ael;

import com.revolut.data.model.Data;
import com.revolut.shared.feature.wealth.domain.api.interactors.InstrumentTickerInteractor$Companion;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nel.m0;

/* JADX INFO: loaded from: classes12.dex */
public final class k implements ybl.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xbl.c f3633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f3634b;

    public k(xbl.c repository, e instrumentComparatorProvider) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(instrumentComparatorProvider, "instrumentComparatorProvider");
        this.f3633a = repository;
        this.f3634b = instrumentComparatorProvider;
    }

    public final ufm.i e(String ref2) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        efm.d0 d0VarFirstOrError = m70.a.g(((vdl.y) this.f3633a).a(), null, new v78.d(26), 1).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        aed.f fVar = new aed.f(new a31.g(ref2, 13), 3);
        d0VarFirstOrError.getClass();
        ufm.i iVar = new ufm.i(d0VarFirstOrError, fVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    public final efm.r f(String securityRef) {
        Intrinsics.checkNotNullParameter(securityRef, "securityRef");
        vdl.y yVar = (vdl.y) this.f3633a;
        yVar.getClass();
        Intrinsics.checkNotNullParameter(securityRef, "securityRef");
        return yVar.k.e(new vdl.v(securityRef), w4l.h.f294642c);
    }

    public final vkm.d g(String ref2) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        return rd0.e.b(nim.a.w(ybl.b.d(this, zhm.u.c(ref2)), new a31.g(ref2, 14)));
    }

    public final efm.r h(Function1 predicate, n9l.b bVar, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        efm.r rVarJust = efm.r.just(new Data(new a31.k(2, predicate), null, false, 6, null));
        Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
        return j(rVarJust, bVar, loadingStrategy);
    }

    public final efm.r i(List refs, n9l.b updatePeriod) {
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(updatePeriod, "updatePeriod");
        if (!refs.isEmpty()) {
            return ((vdl.y) this.f3633a).c(refs, w4l.i.f294643c, updatePeriod.a());
        }
        efm.r rVarJust = efm.r.just(new Data(zhm.f0.f322471a, null, false, 6, null));
        Intrinsics.h(rVarJust);
        return rVarJust;
    }

    public final efm.r j(efm.r rVar, n9l.b bVar, w4l.k kVar) {
        efm.r rVarA = ((vdl.y) this.f3633a).a();
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        efm.r rVarSubscribeOn = rVar.subscribeOn(hhm.f.f152430b);
        Intrinsics.checkNotNullExpressionValue(rVarSubscribeOn, "subscribeOn(...)");
        return pd.b.s(kli.a.h(rVarA, rVarSubscribeOn), new a31.m(this, 7, bVar, kVar));
    }

    public final efm.r k(List refs, n9l.b updatePeriod) {
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(updatePeriod, "updatePeriod");
        if (refs.isEmpty()) {
            efm.r rVarJust = efm.r.just(new Data(zhm.f0.f322471a, null, false, 6, null));
            Intrinsics.h(rVarJust);
            return rVarJust;
        }
        efm.r rVarC = rd0.e.c(l(zhm.d0.i1(refs)), kotlin.coroutines.g.f186406a);
        long jA = updatePeriod.a();
        return nim.a.w(kli.a.h(rVarC, ((vdl.y) this.f3633a).c(refs, w4l.h.f294642c, jA)), new aed.a(10));
    }

    public final akg.n l(Set securityRefs) {
        Intrinsics.checkNotNullParameter(securityRefs, "securityRefs");
        return nim.a.v(rd0.e.b(ybl.b.c(this)), new a83.d0(1, securityRefs));
    }

    public final efm.r m(final nel.m0 m0Var, w4l.k loadingStrategy, Function1 predicate) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        if (m0Var == null) {
            return h(predicate, null, loadingStrategy);
        }
        final int i = 1;
        efm.r rVarW = nim.a.w(nim.a.w(ybl.b.b(this, null, loadingStrategy, predicate, 1), new Function1(this) { // from class: ael.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f3621b;

            {
                this.f3621b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                List instrumentRatesGroups = (List) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(instrumentRatesGroups, "instrumentRatesGroups");
                        List<List> list = instrumentRatesGroups;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (List list2 : list) {
                            e eVar = this.f3621b.f3634b;
                            nel.k0 sortingOptions = m0Var.a().f214591a;
                            g gVar = (g) eVar;
                            gVar.getClass();
                            Intrinsics.checkNotNullParameter(sortingOptions, "sortingOptions");
                            arrayList.add(zhm.d0.P0(list2, new f(gVar, sortingOptions)));
                        }
                        return zhm.w.u(arrayList);
                    default:
                        Intrinsics.checkNotNullParameter(instrumentRatesGroups, "instrumentRates");
                        this.f3621b.getClass();
                        if (m0Var instanceof m0.a) {
                            return instrumentRatesGroups;
                        }
                        throw new NoWhenBranchMatchedException();
                }
            }
        }), new a7b.r(this, m0Var));
        final int i2 = 0;
        return nim.a.w(rVarW, new Function1(this) { // from class: ael.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f3621b;

            {
                this.f3621b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                List instrumentRatesGroups = (List) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(instrumentRatesGroups, "instrumentRatesGroups");
                        List<List> list = instrumentRatesGroups;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (List list2 : list) {
                            e eVar = this.f3621b.f3634b;
                            nel.k0 sortingOptions = m0Var.a().f214591a;
                            g gVar = (g) eVar;
                            gVar.getClass();
                            Intrinsics.checkNotNullParameter(sortingOptions, "sortingOptions");
                            arrayList.add(zhm.d0.P0(list2, new f(gVar, sortingOptions)));
                        }
                        return zhm.w.u(arrayList);
                    default:
                        Intrinsics.checkNotNullParameter(instrumentRatesGroups, "instrumentRates");
                        this.f3621b.getClass();
                        if (m0Var instanceof m0.a) {
                            return instrumentRatesGroups;
                        }
                        throw new NoWhenBranchMatchedException();
                }
            }
        });
    }

    public final efm.r n(List securityRefs, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(securityRefs, "securityRefs");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        if (!securityRefs.isEmpty()) {
            return ((vdl.y) this.f3633a).b(securityRefs, loadingStrategy);
        }
        efm.r rVarJust = efm.r.just(new Data(zhm.f0.f322471a, null, false, 6, null));
        Intrinsics.h(rVarJust);
        return rVarJust;
    }

    public final akg.n o(String securityRef, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(securityRef, "securityRef");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(rd0.e.b(((vdl.y) this.f3633a).b(zhm.u.c(securityRef), loadingStrategy)), new aed.a(8));
    }

    public final akg.n p(String securityRef, w4l.k loadingStrategy, long j2) {
        Intrinsics.checkNotNullParameter(securityRef, "securityRef");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(rd0.e.b(((vdl.y) this.f3633a).c(zhm.u.c(securityRef), loadingStrategy, j2)), new a31.g(securityRef, 15));
    }

    public final efm.b q(List refs) {
        Intrinsics.checkNotNullParameter(refs, "refs");
        if (refs.isEmpty()) {
            return pfm.m.f235744a;
        }
        ybl.b.Companion.getClass();
        long jA = InstrumentTickerInteractor$Companion.f105074b.a();
        vdl.y yVar = (vdl.y) this.f3633a;
        yVar.getClass();
        Intrinsics.checkNotNullParameter(refs, "refs");
        efm.b bVarIgnoreElements = m70.a.g(yVar.c(refs, w4l.i.f294643c, jA), null, null, 3).doOnNext(new vdl.s(4, new v73.c(refs, yVar, 12))).ignoreElements();
        Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
        return bVarIgnoreElements;
    }
}
