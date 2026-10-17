package c84;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$PluginConfigurationContract;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input;
import com.revolut.tracking.v3.CreditApplicationCommonContext;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends yji.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.revolut.kompot.navigable.a f22073c;
    public final b d;
    public final CreditApplicationPluginFlowContract$PluginConfigurationContract e;

    public a(com.revolut.kompot.navigable.a controller, b controllerModel, PluginFlowContract$Input pluginContract) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(controllerModel, "controllerModel");
        Intrinsics.checkNotNullParameter(pluginContract, "pluginContract");
        this.f22073c = controller;
        this.d = controllerModel;
        this.e = pluginContract;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // yji.d
    public final void M() {
        yji.d.H(this, vkm.q.q((MutableSharedFlow) this.d.f22075m.getValue()), new c1i.f(this, (Continuation) null, 19), 3);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // yji.d
    public final void onCreate() {
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        CreditApplicationCommonContext creditApplicationCommonContextN = t1.N(this.e.getF68187a());
        companion.getClass();
        AnalyticsContext analyticsContext = new AnalyticsContext(AnalyticsContext.Companion.a(creditApplicationCommonContextN));
        b bVar = this.d;
        ((MutableSharedFlow) bVar.f22075m.getValue()).k(analyticsContext);
        bVar.f22074l = analyticsContext;
    }
}
