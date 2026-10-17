package oij;

import com.revolut.retail.feature.esim.api.model.EsimDataPlanCoverageCode;
import com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.EsimGetPlanScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f225693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cej.b f225694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EsimDataPlanCoverageCode f225695c;

    public b(cej.b mobilePlansFeatureAvailabilityInteractor, EsimGetPlanScreenContract$InputData inputData, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(mobilePlansFeatureAvailabilityInteractor, "mobilePlansFeatureAvailabilityInteractor");
        this.f225693a = featureToggleInteractor;
        this.f225694b = mobilePlansFeatureAvailabilityInteractor;
        String str = inputData.f100993a;
        this.f225695c = str != null ? new EsimDataPlanCoverageCode(str) : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x01db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList a(java.util.Map r17, java.util.Map r18, java.util.Map r19) {
        /*
            Method dump skipped, instruction units count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oij.b.a(java.util.Map, java.util.Map, java.util.Map):java.util.ArrayList");
    }
}
