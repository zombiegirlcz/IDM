package dki;

import com.revolut.kompot.navigable.flow.BaseFlow;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f115521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseFlow f115522b;

    public /* synthetic */ b(BaseFlow baseFlow, int i) {
        this.f115521a = i;
        this.f115522b = baseFlow;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f115521a;
        BaseFlow baseFlow = this.f115522b;
        switch (i) {
            case 0:
                BaseFlow baseFlow2 = this.f115522b;
                Object objS2 = baseFlow2.S2();
                Intrinsics.i(objS2, "null cannot be cast to non-null type com.revolut.kompot.navigable.ControllerModel");
                return new r(baseFlow2, (yji.l) objS2, new d8e.a(baseFlow2, 7), new e(3, 0, BaseFlow.class, baseFlow2, "onActivityResultInternal", "onActivityResultInternal(IILandroid/content/Intent;)V"));
            case 1:
                BaseFlow baseFlow3 = this.f115522b;
                Object objS22 = baseFlow3.S2();
                Intrinsics.i(objS22, "null cannot be cast to non-null type com.revolut.kompot.navigable.ControllerModel");
                return new x(baseFlow3, (yji.l) objS22, baseFlow3.f98405m, baseFlow3.y2(), baseFlow3.D2());
            case 2:
                return baseFlow.Q2().g();
            default:
                if (!((g) baseFlow.S2()).B2(true)) {
                    rd0.e.o(baseFlow, pd.b.e(baseFlow).R, true);
                }
                return Unit.f186387a;
        }
    }
}
