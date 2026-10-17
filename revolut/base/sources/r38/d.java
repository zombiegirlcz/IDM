package r38;

import efm.r;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import wsg.n;
import zhm.d0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f251204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f251205b;

    public /* synthetic */ d(l lVar, int i) {
        this.f251204a = i;
        this.f251205b = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f251204a) {
            case 0:
                io3.d pocket = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(pocket, "pocket");
                return new nce.b(this.f251205b.f251218g.b(new h9e.b(pocket)), pocket.f163147c);
            case 1:
                List pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                return this.f251205b.f251219h.d(pockets);
            case 2:
                e loadingParams = (e) obj2;
                Intrinsics.checkNotNullParameter(loadingParams, "loadingParams");
                r rVarDistinctUntilChanged = this.f251205b.f251216b.J(loadingParams.f251206a, loadingParams.f251207b).distinctUntilChanged();
                Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
                return rVarDistinctUntilChanged;
            case 3:
                e loadingParams2 = (e) obj2;
                Intrinsics.checkNotNullParameter(loadingParams2, "loadingParams");
                l lVar = this.f251205b;
                n nVar = lVar.f251216b;
                w4l.k kVar = loadingParams2.f251207b;
                io3.i iVar = io3.i.INTERNAL;
                io3.k[] elements = {io3.k.ACTIVE, io3.k.INACTIVE, io3.k.DELISTED};
                Intrinsics.checkNotNullParameter(elements, "elements");
                r rVarCompose = pd.b.r(nVar.S(kVar, kotlin.collections.d.y0(elements), null, iVar, loadingParams2.f251206a), new d(lVar, 1)).compose(new kp0.b(lVar, loadingParams2.f251206a, 29));
                Intrinsics.checkNotNullExpressionValue(rVarCompose, "compose(...)");
                r rVarDistinctUntilChanged2 = nim.a.w(w.v0(rVarCompose), new d(lVar, 5)).distinctUntilChanged();
                Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged2, "distinctUntilChanged(...)");
                return rVarDistinctUntilChanged2;
            case 4:
                e loadingParams3 = (e) obj2;
                Intrinsics.checkNotNullParameter(loadingParams3, "loadingParams");
                l lVar2 = this.f251205b;
                r rVarDistinctUntilChanged3 = pd.b.r(kli.a.i(lVar2.d(loadingParams3), lVar2.k.a(loadingParams3), rd0.e.c(new ahe.l(lVar2.i.k(), 13), kotlin.coroutines.g.f186406a)), new r10.b(lVar2, loadingParams3, 24)).distinctUntilChanged();
                Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged3, "distinctUntilChanged(...)");
                return rVarDistinctUntilChanged3;
            default:
                List pockets2 = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets2, "pockets");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : pockets2) {
                    io3.d dVar = (io3.d) obj3;
                    io3.k[] elements2 = {io3.k.ACTIVE, io3.k.DELISTED};
                    Intrinsics.checkNotNullParameter(elements2, "elements");
                    if (kotlin.collections.d.y0(elements2).contains(dVar.f) || (!z92.f.j(dVar).k() && dVar.f == io3.k.INACTIVE)) {
                        if (h30.l.D(xi0.b.Companion, dVar.f163147c)) {
                            arrayList.add(obj3);
                        }
                    }
                }
                return d0.P0(arrayList, this.f251205b.d);
        }
    }
}
