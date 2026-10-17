package y20;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import v20.o2;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class k0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f310517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v20.n f310518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f310519c;

    public /* synthetic */ k0(v20.n nVar, b1 b1Var, int i) {
        this.f310517a = i;
        this.f310518b = nVar;
        this.f310519c = b1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f310517a) {
            case 0:
                i20.b0 b0Var = (i20.b0) obj2;
                if (this.f310518b instanceof o2) {
                    b1 b1Var = this.f310519c;
                    y10.h hVar = b1Var.d;
                    Intrinsics.h(b0Var);
                    v20.n nVarF = hVar.f(b0Var, zhm.r0.g(), b0Var.getReplyTo());
                    if (nVarF != null) {
                        b1Var.u.onNext(nVarF);
                    }
                }
                break;
            case 1:
                v20.n nVar = this.f310518b;
                if (nVar instanceof o2) {
                    this.f310519c.u.onNext(o2.r((o2) nVar, null, null, null, null, null, v20.b1.FAILURE, null, 260095));
                }
                break;
            default:
                this.f310519c.u.onNext(this.f310518b);
                break;
        }
        return Unit.f186387a;
    }

    public /* synthetic */ k0(b1 b1Var, v20.n nVar) {
        this.f310517a = 2;
        this.f310519c = b1Var;
        this.f310518b = nVar;
    }
}
