package y99;

import com.revolut.data.model.Data;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class y implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f311809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f311810b;

    public /* synthetic */ y(e0 e0Var, int i) {
        this.f311809a = i;
        this.f311810b = e0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f311809a) {
            case 0:
                Pair positions = (Pair) obj2;
                Intrinsics.checkNotNullParameter(positions, "positions");
                int iIntValue = ((Number) positions.f186385a).intValue();
                int iIntValue2 = ((Number) positions.f186386b).intValue();
                e0 e0Var = this.f311810b;
                efm.k kVarFirstElement = ((o) e0Var.f311772c).k3().firstElement();
                y25.c cVar = new y25.c(new x(e0Var, 0), 22);
                kVarFirstElement.getClass();
                return new rfm.m(new rfm.m(kVarFirstElement, cVar, 0), new y25.c(new meb.f(iIntValue, iIntValue2, 2), 23), 1);
            case 1:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                Data data = (Data) pair.f186385a;
                boolean zBooleanValue = ((Boolean) pair.f186386b).booleanValue();
                boolean zE = zi0.c.E(data);
                final e0 e0Var2 = this.f311810b;
                if (zE && zBooleanValue) {
                    final int i = 0;
                    return new pfm.h(new kfm.a() { // from class: y99.z
                        @Override // kfm.a
                        public final void run() {
                            switch (i) {
                                case 0:
                                    e0 e0Var3 = e0Var2;
                                    v60.i iVar = e0Var3.e;
                                    g0 g0Var = (g0) e0Var3.f311771b;
                                    te0.j jVar = g0Var.e;
                                    KProperty[] kPropertyArr = g0.f311775p;
                                    List list = (List) te0.w.O(jVar.getValue(g0Var, kPropertyArr[3]));
                                    iVar.onNext(com.revolut.retail.core.navigation.a.c(new FinishCommand(-1, foh.i.q(new Pair("EXTRAS_PURPOSE_OF_ACCOUNT", list != null ? zhm.d0.d1(list) : null)), null, 4), (NaviCommand) te0.w.O(g0Var.f.getValue(g0Var, kPropertyArr[4]))));
                                    break;
                                default:
                                    e0Var2.e.onNext(new FinishCommand(null, null, null, 7));
                                    break;
                            }
                        }
                    }, 2);
                }
                if (!zi0.c.E(data)) {
                    return pfm.m.f235744a;
                }
                o oVar = (o) e0Var2.f311772c;
                g0 g0Var = (g0) oVar.f;
                te0.e eVarW0 = g0Var.w0();
                te0.s sVar = te0.s.f270018a;
                efm.k kVarFirstElement2 = te0.w.l(eVarW0.c(sVar), g0Var.z0().c(sVar)).firstElement();
                y25.c cVar2 = new y25.c(new m(oVar, 3), 19);
                kVarFirstElement2.getClass();
                pfm.a aVar = new pfm.a(kVarFirstElement2, cVar2, 3);
                Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                return aVar;
            case 2:
                Boolean firstStep = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(firstStep, "firstStep");
                return !firstStep.booleanValue() ? ((o) this.f311810b.f311772c).j3() : pfm.m.f235744a;
            default:
                Boolean firstStep2 = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(firstStep2, "firstStep");
                boolean zBooleanValue2 = firstStep2.booleanValue();
                final e0 e0Var3 = this.f311810b;
                if (!zBooleanValue2) {
                    return ((o) e0Var3.f311772c).j3();
                }
                final int i2 = 1;
                return new pfm.h(new kfm.a() { // from class: y99.z
                    @Override // kfm.a
                    public final void run() {
                        switch (i2) {
                            case 0:
                                e0 e0Var32 = e0Var3;
                                v60.i iVar = e0Var32.e;
                                g0 g0Var2 = (g0) e0Var32.f311771b;
                                te0.j jVar = g0Var2.e;
                                KProperty[] kPropertyArr = g0.f311775p;
                                List list = (List) te0.w.O(jVar.getValue(g0Var2, kPropertyArr[3]));
                                iVar.onNext(com.revolut.retail.core.navigation.a.c(new FinishCommand(-1, foh.i.q(new Pair("EXTRAS_PURPOSE_OF_ACCOUNT", list != null ? zhm.d0.d1(list) : null)), null, 4), (NaviCommand) te0.w.O(g0Var2.f.getValue(g0Var2, kPropertyArr[4]))));
                                break;
                            default:
                                e0Var3.e.onNext(new FinishCommand(null, null, null, 7));
                                break;
                        }
                    }
                }, 2);
        }
    }
}
