package qsa;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f248779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f248780b;

    public /* synthetic */ o(u uVar, int i) {
        this.f248779a = i;
        this.f248780b = uVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f248779a) {
            case 0:
                gpf.a output = (gpf.a) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                as1.q qVar = new as1.q(output, 4);
                u uVar = this.f248780b;
                uVar.H2(uVar.C, new qpb.a(qVar, uVar, 6));
                break;
            default:
                this.f248780b.C2(cqa.b.f108061a);
                break;
        }
        return Unit.f186387a;
    }
}
