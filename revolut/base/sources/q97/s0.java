package q97;

import com.revolut.feature.insurance_car.api.navigation.InsuranceCarFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes21.dex */
public final class s0 extends r97.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rl7.e f243781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t97.d f243782c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(t97.c productCellProvider, rl7.e availabilityInteractor) {
        super(productCellProvider);
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(availabilityInteractor, "availabilityInteractor");
        this.f243781b = availabilityInteractor;
        this.f243782c = t97.d.INSURANCE_CAR;
    }

    @Override // r97.b
    public final Flow d() {
        return rd0.e.b(ue0.e.E(rd0.e.c(mo3.a.g(zi0.c.w(this.f243781b.f254928c.a(gw7.a.CAR_INSURANCE)), null, new rhj.m(15), 1), kotlin.coroutines.g.f186406a), Boolean.FALSE));
    }

    @Override // r97.b
    public final p97.b f() {
        return this.f243782c;
    }

    @Override // r97.b
    public final Object g(Continuation continuation) {
        return new o97.l(new FeatureCommand(new InsuranceCarFeatureConfig.Home(null)));
    }
}
