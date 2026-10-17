package ti9;

import dk9.t;
import efm.r;
import ej9.p;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tof.s9;
import zh9.i1;
import zh9.j1;
import zh9.r0;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f271449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f271450b;

    public /* synthetic */ a(g gVar, int i) {
        this.f271449a = i;
        this.f271450b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Pair pair = (Pair) obj2;
        switch (this.f271449a) {
            case 0:
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                j1 j1Var = (j1) pair.f186385a;
                j1 j1Var2 = (j1) pair.f186386b;
                aim.e eVarB = u.b();
                if ((j1Var instanceof i1) && !(j1Var2 instanceof i1)) {
                    g gVar = this.f271450b;
                    eVarB.add(ue0.e.v(((p) gVar.f271458c).b()));
                    eVarB.add(ue0.e.v(pd.b.n(kotlin.coroutines.g.f186406a, new f(gVar, null, 0))));
                }
                r rVarMergeWith = r.just(j1Var2).mergeWith(efm.b.o(u.a(eVarB)));
                Intrinsics.checkNotNullExpressionValue(rVarMergeWith, "mergeWith(...)");
                return rVarMergeWith;
            default:
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                r0 r0Var = (r0) pair.f186385a;
                List list = (List) pair.f186386b;
                whf.b bVar = this.f271450b.f271459g;
                r rVarJust = r.just(new s9(d0.i1(list)));
                Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
                return nim.a.w(whf.b.a(bVar, rVarJust, null, null, null, 14), new t(r0Var, 1));
        }
    }
}
