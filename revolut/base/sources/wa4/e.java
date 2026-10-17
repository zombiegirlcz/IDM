package wa4;

import c84.t;
import com.revolut.feature.credit.application.plugins.impl.ui.emergency_payment.flow.EmergencyPaymentFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.emergency_payment.flow.EmergencyPaymentFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vvc.s;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends t implements a {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final EmergencyPaymentFlowContract$InputData f295812p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final hw3.c f295813q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final dx3.a f295814r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final zwc.a f295815s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final yki.a f295816t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(EmergencyPaymentFlowContract$InputData inputData, hw3.c emergencyPaymentInteractor, dx3.a linkCardInteractor, zwc.a selectPaymentFlowProvider, e84.e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(emergencyPaymentInteractor, "emergencyPaymentInteractor");
        Intrinsics.checkNotNullParameter(linkCardInteractor, "linkCardInteractor");
        Intrinsics.checkNotNullParameter(selectPaymentFlowProvider, "selectPaymentFlowProvider");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f295812p = inputData;
        this.f295813q = emergencyPaymentInteractor;
        this.f295814r = linkCardInteractor;
        this.f295815s = selectPaymentFlowProvider;
        s sVar = new s(this, 22);
        this.f295816t = cp5.d.a(this, EmergencyPaymentFlowContract$Step.f67644a, f0.f322471a, sVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f295816t;
    }
}
