package qjj;

import com.revolut.retail.feature.esim.api.model.EsimCoverage;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.EsimMobilePlanCheckoutScreenContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class k {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimMobilePlanCheckoutScreenContract$InputData f246892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z80.b f246893b;

    public k(EsimMobilePlanCheckoutScreenContract$InputData inputData, z80.b phoneToolsProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        this.f246892a = inputData;
        this.f246893b = phoneToolsProvider;
    }

    public static String a(EsimCoverage esimCoverage) {
        if (esimCoverage instanceof EsimCoverage.Country) {
            return ((EsimCoverage.Country) esimCoverage).f100204a.f297794a;
        }
        if ((esimCoverage instanceof EsimCoverage.Global) || (esimCoverage instanceof EsimCoverage.Regional) || Intrinsics.f(esimCoverage, EsimCoverage.Undefined.f100211a)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
