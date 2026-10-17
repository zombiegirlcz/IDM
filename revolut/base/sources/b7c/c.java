package b7c;

import com.revolut.feature.revolutpay.api.config.RevolutPayFeatureConfig$RevolutPayNewOrderSummaryDestination;
import com.revolut.feature.revolutpay.api.domain.models.order.RevolutPayOrderSummaryContract$InputData;
import com.revolut.feature.revolutpay.api.shared.deeplink.RevolutPayOrderParameters;
import com.revolut.feature.revolutpay.impl.external.RevolutPayKompotLauncherActivity;
import com.revolut.kompot.bridge.impl.rootflow.KompotFlowContract$Configuration;
import com.revolut.kompot.common.ExternalDestination;
import efm.d0;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import q06.d;
import zhm.q0;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements j6c.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f12992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xcc.b f12993b;

    public c(d deeplinkParser, xcc.b orderParametersParser) {
        Intrinsics.checkNotNullParameter(deeplinkParser, "deeplinkParser");
        Intrinsics.checkNotNullParameter(orderParametersParser, "orderParametersParser");
        this.f12992a = deeplinkParser;
        this.f12993b = orderParametersParser;
    }

    public static RevolutPayOrderSummaryContract$InputData.Standard c(c cVar, RevolutPayOrderParameters revolutPayOrderParameters, boolean z, String str, f6c.a aVar, boolean z3, int i) {
        f6c.a aVar2 = (i & 8) != 0 ? f6c.a.REGULAR : aVar;
        boolean z4 = (i & 16) != 0 ? false : z3;
        cVar.getClass();
        return new RevolutPayOrderSummaryContract$InputData.Standard(revolutPayOrderParameters.f84316a, revolutPayOrderParameters.f84317b, revolutPayOrderParameters.f84318c, revolutPayOrderParameters.d, revolutPayOrderParameters.e, revolutPayOrderParameters.f, revolutPayOrderParameters.f84319g, revolutPayOrderParameters.f84320h, revolutPayOrderParameters.i, revolutPayOrderParameters.f84321j, revolutPayOrderParameters.k, z, z4, revolutPayOrderParameters.f84322l, str, aVar2);
    }

    public final d0 a(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        RevolutPayOrderParameters revolutPayOrderParametersA = this.f12993b.a(deeplink.d);
        if (revolutPayOrderParametersA == null || !revolutPayOrderParametersA.a()) {
            ufm.c cVarL = d0.l(new IllegalArgumentException("Required parameters for RevPay order is missing"));
            Intrinsics.checkNotNullExpressionValue(cVarL, "error(...)");
            return cVarL;
        }
        ufm.c cVar = new ufm.c(new b(this, revolutPayOrderParametersA, deeplink, z, 0), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return cVar;
    }

    public final ExternalDestination.ExplicitActivity b(jf0.c deeplink, f6c.a flowSource) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(flowSource, "flowSource");
        RevolutPayOrderParameters revolutPayOrderParametersA = this.f12993b.a(deeplink.d);
        if (revolutPayOrderParametersA == null) {
            throw new IllegalArgumentException("Required parameters for RevPay order is missing");
        }
        if (revolutPayOrderParametersA.a()) {
            return new ExternalDestination.ExplicitActivity(RevolutPayKompotLauncherActivity.class, q0.c(new Pair("CONFIGURATION_ARG", new KompotFlowContract$Configuration.Standalone(new RevolutPayFeatureConfig$RevolutPayNewOrderSummaryDestination(c(this, revolutPayOrderParametersA, true, deeplink.f173627a, flowSource, false, 16)), true, false))), 12);
        }
        throw new IllegalArgumentException("Required parameters for RevPay order is missing");
    }
}
