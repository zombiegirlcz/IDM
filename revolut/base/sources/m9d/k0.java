package m9d;

import com.revolut.data.model.Data;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class k0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f203720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f203721b;

    public /* synthetic */ k0(g1 g1Var, int i) {
        this.f203720a = i;
        this.f203721b = g1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f203720a) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                y yVar = (y) pair.f186385a;
                y yVar2 = (y) pair.f186386b;
                this.f203721b.getClass();
                boolean z = yVar instanceof x;
                if (!z && !(yVar2 instanceof x)) {
                    return w.f203746a;
                }
                x xVar = z ? (x) yVar : null;
                int i = xVar != null ? xVar.f203750a : 0;
                x xVar2 = yVar2 instanceof x ? (x) yVar2 : null;
                return new x(i + (xVar2 != null ? xVar2.f203750a : 0));
            case 1:
                if (((Integer) obj2).intValue() <= 0) {
                    return new go.g(new Data(w.f203746a, null, false, 6, null), 2);
                }
                v20.f0 f0Var = (v20.f0) this.f203721b.v.f211647a;
                j30.c cVar = f0Var.f285388j;
                return new ahe.m0(rd0.e.e(rd0.e.b(rd0.e.c(nim.a.v(f0Var.m(w4l.h.f294642c), new v20.s(1)), kotlin.coroutines.g.f186406a)), zhm.h0.f322473a, new im2.b(3, 14, null)), 11);
            case 2:
                z updateState = (z) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return z.a(updateState, null, null, null, null, null, null, null, null, null, null, null, !((z) this.f203721b.t2()).f203758l, false, null, null, null, false, 260095);
            default:
                z updateState2 = (z) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return z.a(updateState2, null, null, null, null, null, null, null, null, null, null, null, false, !((z) this.f203721b.t2()).f203759m, null, null, null, false, 258047);
        }
    }
}
