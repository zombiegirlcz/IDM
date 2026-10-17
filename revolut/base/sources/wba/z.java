package wba;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class z implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f296095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f296096b;

    public /* synthetic */ z(e0 e0Var, int i) {
        this.f296095a = i;
        this.f296096b = e0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f296095a) {
            case 0:
                dpf.c output = (dpf.c) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (!(output instanceof dpf.a)) {
                    if (!(output instanceof dpf.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    e0 e0Var = this.f296096b;
                    e0Var.l2(new w3k.i(e0Var, ((dpf.b) output).f116876a, null, 18), new yi5.b(26));
                }
                return Unit.f186387a;
            default:
                gpf.a output2 = (gpf.a) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                e0 e0Var2 = this.f296096b;
                e0Var2.H2(e0Var2.f296072t, new as1.q(output2, 6));
                return Unit.f186387a;
        }
    }
}
