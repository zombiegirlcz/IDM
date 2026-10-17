package g8i;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class x implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f141401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f141402b;

    public /* synthetic */ x(e0 e0Var, int i) {
        this.f141401a = i;
        this.f141402b = e0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f141401a) {
            case 0:
                dpf.c output = (dpf.c) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (!Intrinsics.f(output, dpf.a.f116875a)) {
                    if (!(output instanceof dpf.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f141402b.x2(new bg2.p(output, 5));
                }
                return Unit.f186387a;
            default:
                j8i.g output2 = (j8i.g) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (!(output2 instanceof j8i.f)) {
                    throw new NoWhenBranchMatchedException();
                }
                e0 e0Var = this.f141402b;
                e0Var.x2(new g48.j(e0Var, output2, 16));
                return Unit.f186387a;
        }
    }
}
