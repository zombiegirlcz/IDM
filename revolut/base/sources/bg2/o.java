package bg2;

import cli.y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f15071b;

    public /* synthetic */ o(x xVar, int i) {
        this.f15070a = i;
        this.f15071b = xVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f15070a) {
            case 0:
                h1j.b output = (h1j.b) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof h1j.d) {
                    h1j.d dVar = (h1j.d) output;
                    x xVar = this.f15071b;
                    xVar.l2(new b96.d(xVar, dVar.f148580a, dVar.f148582c, null, 12), new yi5.b(26));
                }
                return Unit.f186387a;
            default:
                x xVar2 = this.f15071b;
                y yVar = xVar2.z;
                dpf.c output2 = (dpf.c) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (!(output2 instanceof dpf.a)) {
                    if (!(output2 instanceof dpf.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    xVar2.H2(yVar, new p(output2, 0));
                    if (((g) ((j2) yVar.f22677a).getValue()).k.f62987b) {
                        xVar2.I2(null);
                    }
                }
                return Unit.f186387a;
        }
    }
}
