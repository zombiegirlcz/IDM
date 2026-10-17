package cvl;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l1j.a;
import nkm.y;
import zhm.a1;
import zhm.d0;
import zhm.y0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.trading.orders.ui.screens.pocket_picker.b f109485b;

    public /* synthetic */ g(com.revolut.trading.orders.ui.screens.pocket_picker.b bVar, int i) {
        this.f109484a = i;
        this.f109485b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f109484a) {
            case 0:
                l1j.a result = (l1j.a) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (!Intrinsics.f(result, a.C1086a.f191546a)) {
                    if (!(result instanceof l1j.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    xi0.a aVar = xi0.b.Companion;
                    String str = ((l1j.b) result).f191547a;
                    aVar.getClass();
                    xi0.b bVarA = xi0.a.a(str);
                    com.revolut.trading.orders.ui.screens.pocket_picker.b bVar = this.f109485b;
                    bVar.n2(new cuc.c(bVar, bVarA, bVarA, (Continuation) null, 7), new whi.b(6));
                }
                return Unit.f186387a;
            default:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List pocketSections = (List) pair.f186385a;
                Optional optional = (Optional) pair.f186386b;
                fvl.e eVar = this.f109485b.f107055r;
                xi0.b bVar2 = (xi0.b) gj7.b.m(optional);
                eVar.getClass();
                fvl.c cVar = fvl.e.f138491b;
                Intrinsics.checkNotNullParameter(pocketSections, "pocketSections");
                odf.f fVar = eVar.f138492a;
                odf.b bVar3 = fVar.e;
                if (bVar3 == null) {
                    return zi0.c.i(cVar);
                }
                Set set = bVar3.f224457a;
                if (set.isEmpty()) {
                    return zi0.c.i(cVar);
                }
                Set setL = y.L(y.z(y.F(y.t(y.t(d0.Q(pocketSections), new fv6.n(6)), new fv6.n(7)), new fvl.d()), new fv6.n(8)));
                xi0.b bVar4 = bVar3.f224458b;
                nel.n nVar = fVar.d.f224456a;
                xi0.b bVar5 = nVar != null ? nVar.i : null;
                aim.o oVar = new aim.o();
                oVar.add(bVar4);
                if (bVar5 != null) {
                    oVar.add(bVar5);
                }
                oVar.addAll(d0.P0(set, new e23.c(1, setL)));
                aim.o oVarA = y0.a(oVar);
                Set setL2 = y.L(y.H(y.n(y.o(d0.Q(oVarA), new fv6.n(9)), new fvl.a(bVar4, bVar5, setL)), 3));
                if (bVar2 != null && !setL2.contains(bVar2)) {
                    setL2 = a1.m(setL2, bVar2);
                }
                return zi0.c.i(new fvl.c(oVarA, setL2));
        }
    }
}
