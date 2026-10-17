package wjk;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import dlk.k;
import ffk.t;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t f298148l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f298149m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j60.a f298150n;
    public final LargeActionButtonDelegate o;

    public f(t pricingPlanInteractor, b cancelFreePlanDialogFactory, j60.a bottomExpandableExtension, LargeActionButtonDelegate largeActionButtonDelegate) {
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(cancelFreePlanDialogFactory, "cancelFreePlanDialogFactory");
        Intrinsics.checkNotNullParameter(bottomExpandableExtension, "bottomExpandableExtension");
        Intrinsics.checkNotNullParameter(largeActionButtonDelegate, "largeActionButtonDelegate");
        this.f298148l = pricingPlanInteractor;
        this.f298149m = cancelFreePlanDialogFactory;
        this.f298150n = bottomExpandableExtension;
        this.o = largeActionButtonDelegate;
    }

    @Override // yji.n
    public final void D2() {
        this.f298150n.d(u.c(this.o));
    }

    @Override // wjk.e
    public final void Z2(c inputData, k handleResult) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(handleResult, "handleResult");
        T2(new wih.c(this, handleResult, inputData, null, 2), new yi5.b(27));
    }
}
