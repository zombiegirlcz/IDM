package prl;

import com.revolut.core.ui_kit.internal.views.stackedchart.StackedChartWithHeaderAndLegendView;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.retail.core.navigation.NaviCommand;
import efm.h0;
import efm.w;
import java.util.List;
import k4l.e0;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import om4.l0;
import pqg.v;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class n implements kfm.o, kfm.g, kfm.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f239342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f239343b;

    public /* synthetic */ n(int i, Function1 function1) {
        this.f239342a = i;
        this.f239343b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        int i = this.f239342a;
        Function1 function1 = this.f239343b;
        switch (i) {
            case 5:
                int i2 = StackedChartWithHeaderAndLegendView.f57573h;
                ((plc.i) function1).invoke(obj2);
                break;
            default:
                ((pu5.b) function1).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f239342a) {
            case 0:
                v vVar = (v) this.f239343b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (e0) vVar.invoke(p0);
            case 1:
                l3d.f fVar = (l3d.f) this.f239343b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) fVar.invoke(p0);
            case 2:
                l0 l0Var = (l0) this.f239343b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) l0Var.invoke(p0);
            case 3:
                v vVar2 = (v) this.f239343b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) vVar2.invoke(p0);
            case 4:
                return (j61.c) ((psl.e) this.f239343b).invoke(p0);
            case 5:
            case 7:
            case 10:
            case 12:
            case 26:
            default:
                plc.i iVar = (plc.i) this.f239343b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) iVar.invoke(p0);
            case 6:
                pu5.b bVar = (pu5.b) this.f239343b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) bVar.invoke(p0);
            case 8:
                psl.e eVar = (psl.e) this.f239343b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                eVar.invoke(p0);
                return Boolean.TRUE;
            case 9:
                pth.m mVar = (pth.m) this.f239343b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) mVar.invoke(p0);
            case 11:
                psl.e eVar2 = (psl.e) this.f239343b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (yhm.r) eVar2.invoke(p0);
            case 13:
                psl.e eVar3 = (psl.e) this.f239343b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (StakingPocket) eVar3.invoke(p0);
            case 14:
                pud.b bVar2 = (pud.b) this.f239343b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) bVar2.invoke(p0);
            case 15:
                pud.c cVar = (pud.c) this.f239343b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) cVar.invoke(p0);
            case 16:
                pud.c cVar2 = (pud.c) this.f239343b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) cVar2.invoke(p0);
            case 17:
                pud.c cVar3 = (pud.c) this.f239343b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) cVar3.invoke(p0);
            case 18:
                pud.c cVar4 = (pud.c) this.f239343b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) cVar4.invoke(p0);
            case 19:
                pv9.g gVar = (pv9.g) this.f239343b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) gVar.invoke(p0);
            case 20:
                pv9.h hVar = (pv9.h) this.f239343b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (kv9.e) hVar.invoke(p0);
            case 21:
                pv9.h hVar2 = (pv9.h) this.f239343b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Pair) hVar2.invoke(p0);
            case 22:
                pth.l lVar = (pth.l) this.f239343b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) lVar.invoke(p0);
            case 23:
                pui.a aVar = (pui.a) this.f239343b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) aVar.invoke(p0);
            case 24:
                pv9.g gVar2 = (pv9.g) this.f239343b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) gVar2.invoke(p0);
            case 25:
                l0 l0Var2 = (l0) this.f239343b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) l0Var2.invoke(p0);
            case 27:
                n68.w wVar = (n68.w) this.f239343b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) wVar.invoke(p0);
            case 28:
                pth.m mVar2 = (pth.m) this.f239343b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) mVar2.invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        switch (this.f239342a) {
            case 10:
                psl.e eVar = (psl.e) this.f239343b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) eVar.invoke(p0)).booleanValue();
            case 11:
            default:
                pth.l lVar = (pth.l) this.f239343b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) lVar.invoke(p0)).booleanValue();
            case 12:
                psl.e eVar2 = (psl.e) this.f239343b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) eVar2.invoke(p0)).booleanValue();
        }
    }
}
