package t42;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f267861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c f267862b;

    public /* synthetic */ q(com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c cVar, int i) {
        this.f267861a = i;
        this.f267862b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f267861a) {
            case 0:
                x42.b result = (x42.b) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                this.f267862b.O2(new sx8.a(result, 20));
                return Unit.f186387a;
            case 1:
                dpf.c output = (dpf.c) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (!(output instanceof dpf.a)) {
                    if (!(output instanceof dpf.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f267862b.O2(new bg2.p(output, 12));
                }
                return Unit.f186387a;
            case 2:
                h1j.b output2 = (h1j.b) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c cVar = this.f267862b;
                cVar.H2(cVar.G, new t3b.g(8));
                if (output2 instanceof h1j.d) {
                    cVar.l2(new sx2.r(cVar, (h1j.d) output2, null, 11), new yi5.b(26));
                }
                return Unit.f186387a;
            default:
                b update = (b) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return b.a(update, null, null, ((b) ((j2) this.f267862b.G.f22677a).getValue()).f267840g + 1, null, 191);
        }
    }
}
