package kl;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes17.dex */
public final class g0 extends kotlin.jvm.internal.u implements Function0 {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c2 f185181h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(c2 c2Var, int i) {
        super(0);
        this.f = i;
        this.f185181h = c2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f) {
            case 0:
                return this.f185181h.f185159y.f152970a;
            default:
                c2 c2Var = this.f185181h;
                c2Var.f185157w.trackFlowCancellation();
                c2Var.D.onNext(new ml.k(ml.j.USER_EXIT_FLOW));
                return Unit.f186387a;
        }
    }
}
