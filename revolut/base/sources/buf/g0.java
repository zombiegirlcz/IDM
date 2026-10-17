package buf;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yhm.m;

/* JADX INFO: loaded from: classes9.dex */
public final class g0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a1 f18802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eim.c f18803b;

    public g0(a1 a1Var, eim.c cVar) {
        this.f18802a = a1Var;
        this.f18803b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        boolean z;
        bpf.c outputData = (bpf.c) obj2;
        Intrinsics.checkNotNullParameter(outputData, "outputData");
        if (outputData instanceof bpf.a) {
            z = false;
        } else {
            if (!(outputData instanceof bpf.b)) {
                throw new NoWhenBranchMatchedException();
            }
            a1 a1Var = this.f18802a;
            a1Var.x2(new bnj.n(new bq7.j(outputData, 12), a1Var, 25));
            z = true;
        }
        m.Companion companion = yhm.m.INSTANCE;
        this.f18803b.resumeWith(Boolean.valueOf(z));
        return Unit.f186387a;
    }
}
