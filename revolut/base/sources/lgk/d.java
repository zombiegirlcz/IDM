package lgk;

import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.feature.add.new_product.api.AddNewProductFeatureAvailabilityApi$Toggles$P4URevamp;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PlanChangeSuccessActionStrategy;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PricingPlanFeatureConfig;
import com.youTransactor.uCube.rpc.Constants;
import ffk.t;
import go.g;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kx4.f0;
import lfg.z;
import org.jetbrains.annotations.NotNull;
import rd0.e;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements mf1.c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final qf1.a f195129c = new qf1.a(new CdnImage("plan_premium", "mobile/cross_sell/products_for_you", null, null, null, null, Constants.TAG_FC_SPEED_MODE));
    public static final qf1.a d = new qf1.a(new CdnImage("plan_metal", "mobile/cross_sell/products_for_you", null, null, null, null, Constants.TAG_FC_SPEED_MODE));
    public static final qf1.a e = new qf1.a(new CdnImage("plan_ultra", "mobile/cross_sell/products_for_you", null, null, null, null, Constants.TAG_FC_SPEED_MODE));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f195130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f195131b;

    public d(t pricingPlanInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f195130a = pricingPlanInteractor;
        this.f195131b = featureToggleInteractor;
    }

    @Override // mf1.c
    public final Flow a() {
        return nim.a.v(e.b(this.f195130a.o()), new z(this));
    }

    @Override // mf1.c
    public final Object c(Continuation continuation) {
        return new of1.e(new FeatureCommand(new PricingPlanFeatureConfig.UpgradeToAnyPlan(xfa.b.PRODUCTS_FOR_YOU, new PlanChangeSuccessActionStrategy.CardOrderIfNeeded(null), 6)));
    }

    @Override // mf1.c
    public final Flow isAvailable() {
        return ((jte.d) this.f195131b).c(AddNewProductFeatureAvailabilityApi$Toggles$P4URevamp.f60848c) ? new f0(e.b(this.f195130a.o()), 20) : new g(Boolean.FALSE, 2);
    }
}
