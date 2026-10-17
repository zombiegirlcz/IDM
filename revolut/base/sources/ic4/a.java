package ic4;

import c84.t;
import com.revolut.feature.credit.application.plugins.impl.ui.how_it_works.flow.HowItWorksFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.how_it_works.flow.HowItWorksFlowContract$Step;
import cp5.d;
import e84.e;
import i69.p;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends t {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final HowItWorksFlowContract$InputData f160211p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f160212q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(HowItWorksFlowContract$InputData inputData, e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f160211p = inputData;
        p pVar = new p(this, 11);
        this.f160212q = d.a(this, HowItWorksFlowContract$Step.f67789a, f0.f322471a, pVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f160212q;
    }
}
