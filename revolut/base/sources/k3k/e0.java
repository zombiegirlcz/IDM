package k3k;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l1j.e;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class e0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f180759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0 f180760b;

    public /* synthetic */ e0(t0 t0Var, int i) {
        this.f180759a = i;
        this.f180760b = t0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f180759a) {
            case 0:
                h1j.b output = (h1j.b) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof h1j.d) {
                    h1j.d dVar = (h1j.d) output;
                    String str = dVar.f148581b.f306286a;
                    String str2 = dVar.f148580a;
                    t0 t0Var = this.f180760b;
                    t0Var.l2(new s0(t0Var, dVar.f148582c, str2, str, dVar.d, null, 1), new yi5.b(26));
                }
                return Unit.f186387a;
            case 1:
                w updateState = (w) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return w.a(updateState, null, null, null, ((w) this.f180760b.t2()).f + 1, 31);
            default:
                l1j.e output2 = (l1j.e) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (!(output2 instanceof e.a)) {
                    if (!(output2 instanceof l1j.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    l1j.f fVar = (l1j.f) output2;
                    String str3 = fVar.e;
                    String str4 = fVar.f191552a;
                    t0 t0Var2 = this.f180760b;
                    t0Var2.l2(new s0(t0Var2, fVar.f191554c, str4, str3, fVar.d, null, 0), new yi5.b(26));
                }
                return Unit.f186387a;
        }
    }
}
