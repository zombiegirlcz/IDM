package elf;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class e1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f127319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n1 f127320b;

    public /* synthetic */ e1(n1 n1Var, int i) {
        this.f127319a = i;
        this.f127320b = n1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        dii.g result = (dii.g) obj2;
        switch (this.f127319a) {
            case 0:
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof dii.f) {
                    n1 n1Var = this.f127320b;
                    n1Var.T2(new i1(n1Var, null, 1), new yi5.b(27));
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof dii.f) {
                    n1 n1Var2 = this.f127320b;
                    n1Var2.T2(new i1(n1Var2, null, 0), new yi5.b(27));
                }
                break;
        }
        return Unit.f186387a;
    }
}
