package fo1;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class x implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f136777b;

    public /* synthetic */ x(e0 e0Var, int i) {
        this.f136776a = i;
        this.f136777b = e0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f136776a) {
            case 0:
                e0 e0Var = this.f136777b;
                cli.y yVar = e0Var.B;
                dpf.c output = (dpf.c) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof dpf.b) {
                    e0Var.H2(yVar, new bg2.p(output, 4));
                    if (((g) ((j2) yVar.f22677a).getValue()).f136753g.f61206b) {
                        e0Var.l2(new dp4.p(e0Var, null, 29), new yi5.b(26));
                    }
                }
                break;
            default:
                h1j.b bVar = (h1j.b) obj2;
                if (bVar instanceof h1j.d) {
                    e0 e0Var2 = this.f136777b;
                    e0Var2.l2(new dp4.p((h1j.d) bVar, e0Var2, (Continuation) null, 28), new yi5.b(26));
                }
                break;
        }
        return Unit.f186387a;
    }
}
