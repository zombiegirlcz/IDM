package buf;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.n1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a1 f18783b;

    public /* synthetic */ b0(a1 a1Var, int i) {
        this.f18782a = i;
        this.f18783b = a1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f18782a) {
            case 0:
                dii.g outputData = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (outputData instanceof dii.e) {
                    a1 a1Var = this.f18783b;
                    a1Var.l2(new n0(a1Var, null), new yi5.b(26));
                }
                return Unit.f186387a;
            case 1:
                n1 it8 = (n1) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                this.f18783b.v2(g.f18801a);
                return Unit.f186387a;
            case 2:
                n1 it9 = (n1) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                this.f18783b.v2(g.f18801a);
                return Unit.f186387a;
            case 3:
                ((Boolean) obj2).booleanValue();
                this.f18783b.v2(f.f18798a);
                return Unit.f186387a;
            default:
                g1j.b bVar = (g1j.b) obj2;
                if (bVar == null) {
                    throw new NoWhenBranchMatchedException();
                }
                j1j.d dVar = bVar.f139686a;
                String str = dVar.f170617a;
                k1j.a aVar = dVar.d;
                a1 a1Var2 = this.f18783b;
                a1Var2.l2(new a1a.c(25, a1Var2, dVar.f170619c, str, aVar, (Continuation) null), new yi5.b(26));
                return Unit.f186387a;
        }
    }
}
