package mx0;

import com.revolut.feature.productintro.view.FullscreenProductIntroView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mx0.t1;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class o1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f209879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FullscreenProductIntroView f209880b;

    public /* synthetic */ o1(FullscreenProductIntroView fullscreenProductIntroView, int i) {
        this.f209879a = i;
        this.f209880b = fullscreenProductIntroView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f209879a) {
            case 0:
                return this.f209880b.f209813h;
            default:
                t1 event = (t1) obj2;
                FullscreenProductIntroView view = this.f209880b;
                ola.a aVar = view.f81295y;
                Intrinsics.h(event);
                wy0.a aVar2 = aVar.f226363a;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event.equals(t1.a.f210006a)) {
                    aVar2.n0().h(view);
                } else {
                    if (!(event instanceof u1)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    u1 u1Var = (u1) event;
                    aVar2.n0().d(view, u1Var.f210026a, "full.screen.product.intro", null, u1Var.f210027b);
                }
                return Unit.f186387a;
        }
    }
}
