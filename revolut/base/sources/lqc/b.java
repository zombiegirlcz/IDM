package lqc;

import com.revolut.feature.salary_switch.api.navigation.SalaryAccountDetailsDestination;
import com.revolut.feature.salary_switch.api.navigation.SalarySwitchDestination;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.d0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q06.h;
import sri.m;
import wp5.y;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements wpc.a {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f199307a;

    public b(m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f199307a = navigator;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "salary-switch");
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        ParcelableDestination salaryAccountDetailsDestination = Intrinsics.f(cVar.e(2), "account-details") ? new SalaryAccountDetailsDestination(null) : new SalarySwitchDestination(null, cVar.e(2));
        if (!(salaryAccountDetailsDestination instanceof SalarySwitchDestination)) {
            if (!(salaryAccountDetailsDestination instanceof SalaryAccountDetailsDestination)) {
                throw new IllegalStateException("Unexpected Salary Switch deeplink destination");
            }
            salaryAccountDetailsDestination = new BridgeDestination(new FeatureCommand(new KompotOverlayFeatureConfig(salaryAccountDetailsDestination, yhi.b.POPUP, (Integer) null, 12)));
        }
        return new h(salaryAccountDetailsDestination, null);
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        ufm.c cVar = new ufm.c(new a6j.b(this, deeplink, z, 10), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return cVar;
    }
}
