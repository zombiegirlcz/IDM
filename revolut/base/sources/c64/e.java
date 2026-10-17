package c64;

import com.revolut.feature.credit.application.plugins.impl.ui.calculator.CalculatorFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.calculator.CalculatorFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends c84.t {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hw3.c f21623p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final CalculatorFlowContract$InputData f21624q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f21625r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(hw3.c interactor, CalculatorFlowContract$InputData inputData, e84.e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f21623p = interactor;
        this.f21624q = inputData;
        bwd.a aVar = new bwd.a(this, 22);
        this.f21625r = cp5.d.a(this, CalculatorFlowContract$Step.f67185a, f0.f322471a, aVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f21625r;
    }
}
