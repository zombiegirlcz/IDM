package cu8;

import com.revolut.data.model.Data;
import com.revolut.feature.exchange.models.ExchangeResult;
import com.revolut.retail.core.navigation.NaviCommand;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class u0 implements kfm.p, kfm.o, kfm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f108902b;

    public /* synthetic */ u0(int i, Function1 function1) {
        this.f108901a = i;
        this.f108902b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f108901a) {
            case 4:
                ((t0) this.f108902b).invoke(obj2);
                break;
            case 12:
                ((cwl.a) this.f108902b).invoke(obj2);
                break;
            default:
                ((d0d.g) this.f108902b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f108901a) {
            case 1:
                t0 t0Var = (t0) this.f108902b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) t0Var.invoke(p0);
            case 2:
                t0 t0Var2 = (t0) this.f108902b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) t0Var2.invoke(p0);
            case 3:
                a5b.b bVar = (a5b.b) this.f108902b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) bVar.invoke(p0);
            case 4:
            case 12:
            case 23:
            case 24:
            default:
                d27.d0 d0Var = (d27.d0) this.f108902b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Pair) d0Var.invoke(p0);
            case 5:
                cul.l0 l0Var = (cul.l0) this.f108902b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) l0Var.invoke(p0);
            case 6:
                cw7.j jVar = (cw7.j) this.f108902b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Pair) jVar.invoke(p0);
            case 7:
                cul.n0 n0Var = (cul.n0) this.f108902b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) n0Var.invoke(p0);
            case 8:
                cw7.j jVar2 = (cw7.j) this.f108902b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) jVar2.invoke(p0);
            case 9:
                cw7.j jVar3 = (cw7.j) this.f108902b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) jVar3.invoke(p0);
            case 10:
                cw7.j jVar4 = (cw7.j) this.f108902b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) jVar4.invoke(p0);
            case 11:
                cwl.b bVar2 = (cwl.b) this.f108902b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) bVar2.invoke(p0);
            case 13:
                cul.n0 n0Var2 = (cul.n0) this.f108902b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) n0Var2.invoke(p0);
            case 14:
                cwl.b bVar3 = (cwl.b) this.f108902b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) bVar3.invoke(p0);
            case 15:
                cw7.j jVar5 = (cw7.j) this.f108902b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) jVar5.invoke(p0);
            case 16:
                c86.c cVar = (c86.c) this.f108902b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (cx2.a) cVar.invoke(p0);
            case 17:
                c86.c cVar2 = (c86.c) this.f108902b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) cVar2.invoke(p0);
            case 18:
                cw7.j jVar6 = (cw7.j) this.f108902b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) jVar6.invoke(p0);
            case 19:
                cui.v vVar = (cui.v) this.f108902b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) vVar.invoke(p0);
            case 20:
                cw7.j jVar7 = (cw7.j) this.f108902b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) jVar7.invoke(p0);
            case 21:
                d0d.g gVar = (d0d.g) this.f108902b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) gVar.invoke(p0);
            case 22:
                d0d.g gVar2 = (d0d.g) this.f108902b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Pair) gVar2.invoke(p0);
            case 25:
                d0d.g gVar3 = (d0d.g) this.f108902b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) gVar3.invoke(p0);
            case 26:
                cw7.j jVar8 = (cw7.j) this.f108902b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) jVar8.invoke(p0);
            case 27:
                cul.n0 n0Var3 = (cul.n0) this.f108902b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) n0Var3.invoke(p0);
            case 28:
                cui.v vVar2 = (cui.v) this.f108902b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (ExchangeResult) vVar2.invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        switch (this.f108901a) {
            case 0:
                cs.a aVar = (cs.a) this.f108902b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) aVar.invoke(p0)).booleanValue();
            default:
                cw7.j jVar = (cw7.j) this.f108902b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) jVar.invoke(p0)).booleanValue();
        }
    }
}
