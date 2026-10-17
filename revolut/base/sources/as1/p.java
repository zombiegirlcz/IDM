package as1;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f8772b;

    public /* synthetic */ p(a0 a0Var, int i) {
        this.f8771a = i;
        this.f8772b = a0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f8771a) {
            case 0:
                gpf.a output = (gpf.a) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                a0 a0Var = this.f8772b;
                a0Var.H2(a0Var.f8759w, new q(output, 0));
                break;
            default:
                h1j.b bVar = (h1j.b) obj2;
                if (bVar instanceof h1j.d) {
                    a0 a0Var2 = this.f8772b;
                    a0Var2.l2(new a1a.c((h1j.d) bVar, a0Var2, (Continuation) null, 11), new yi5.b(26));
                }
                break;
        }
        return Unit.f186387a;
    }
}
