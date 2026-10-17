package in1;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f162605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f162606b;

    public /* synthetic */ o(s sVar, int i) {
        this.f162605a = i;
        this.f162606b = sVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f162605a) {
            case 0:
                dpf.c output = (dpf.c) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (!(output instanceof dpf.a)) {
                    if (!(output instanceof dpf.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f162606b.o.f162593h.setValue(((dpf.b) output).f116876a);
                }
                return Unit.f186387a;
            default:
                h1j.b bVar = (h1j.b) obj2;
                if (bVar instanceof h1j.d) {
                    s sVar = this.f162606b;
                    sVar.l2(new hsd.c((h1j.d) bVar, sVar, (Continuation) null, 20), new yi5.b(26));
                }
                return Unit.f186387a;
        }
    }
}
