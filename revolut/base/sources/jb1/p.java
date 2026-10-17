package jb1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f172562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f172563b;

    public /* synthetic */ p(x xVar, int i) {
        this.f172562a = i;
        this.f172563b = xVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f172562a) {
            case 0:
                g updateState = (g) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return this.f172563b.v;
            case 1:
                hb1.e output = (hb1.e) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof hb1.d) {
                    x xVar = this.f172563b;
                    if (!Intrinsics.f(((g) xVar.t2()).d, ((hb1.d) output).f150551a)) {
                        xVar.x2(new j87.m(output, 8));
                        xVar.A2();
                        xVar.l2(new q(2, xVar, null), new yi5.b(26));
                    }
                }
                return Unit.f186387a;
            default:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                this.f172563b.z2();
                return Boolean.FALSE;
        }
    }
}
