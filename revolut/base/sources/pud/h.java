package pud;

import aii.u;
import com.revolut.feature.product_article.api.ProductArticleApi$Toggles;
import com.revolut.feature.product_article.api.flow.ProductArticleFlowContract$InputData;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.ProductArticleDestination;
import com.revolut.feature.product_article.impl.ui.flow.ProductArticleFlow;
import com.revolut.feature.staking.api.StakingApi$FeatureToggles;
import com.revolut.feature.staking.api.navigation.destination.StakeFeatureDestination;
import com.revolut.feature.staking.api.navigation.destination.TiersDialogDestination;
import com.revolut.feature.staking.api.navigation.destination.UnstakeFeatureDestination;
import com.revolut.feature.staking.impl.flow.stake.v2.StakingController;
import com.revolut.feature.staking.impl.unstake.v2.UnstakeController;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class h implements ohi.a, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f239873a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f239874b;

    public h(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f239874b = featureToggleInteractor;
    }

    @Override // nhi.f
    public final aii.g c(aii.e descriptor) {
        switch (this.f239873a) {
            case 0:
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                if (descriptor instanceof ytd.d) {
                    ytd.d dVar = (ytd.d) descriptor;
                    return dVar.a(new UnstakeController(dVar.b()));
                }
                if (descriptor instanceof ytd.a) {
                    ytd.a aVar = (ytd.a) descriptor;
                    return aVar.a(new StakingController(aVar.b(), aVar.d(), aVar.c()));
                }
                super.c(descriptor);
                return null;
            default:
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                if (!(descriptor instanceof ProductArticleDescriptor)) {
                    return null;
                }
                ProductArticleDescriptor productArticleDescriptor = (ProductArticleDescriptor) descriptor;
                return productArticleDescriptor.a(new ProductArticleFlow(new ProductArticleFlowContract$InputData(productArticleDescriptor.getF81278a(), productArticleDescriptor.getF81279b(), productArticleDescriptor.getF81280c(), productArticleDescriptor.getD(), productArticleDescriptor.getE(), productArticleDescriptor.getF()), (gte.a) this.f239874b));
        }
    }

    @Override // nte.a
    public final List e() {
        switch (this.f239873a) {
            case 0:
                return StakingApi$FeatureToggles.a();
            default:
                return ProductArticleApi$Toggles.a();
        }
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        switch (this.f239873a) {
            case 0:
                Intrinsics.checkNotNullParameter(destination, "destination");
                Intrinsics.checkNotNullParameter(flowModel, "flowModel");
                if (destination instanceof StakeFeatureDestination) {
                    StakeFeatureDestination stakeFeatureDestination = (StakeFeatureDestination) destination;
                    return new StakingController(stakeFeatureDestination.getF88095a(), stakeFeatureDestination.getF88096b(), stakeFeatureDestination.getF88097c());
                }
                if (destination instanceof UnstakeFeatureDestination) {
                    return new UnstakeController(((UnstakeFeatureDestination) destination).getF88099a());
                }
                if (destination instanceof TiersDialogDestination) {
                    return ((sud.b) this.f239874b).a(((TiersDialogDestination) destination).getF88098a());
                }
                return null;
            default:
                Intrinsics.checkNotNullParameter(destination, "destination");
                Intrinsics.checkNotNullParameter(flowModel, "flowModel");
                if (!(destination instanceof ProductArticleDestination)) {
                    return null;
                }
                ProductArticleDestination productArticleDestination = (ProductArticleDestination) destination;
                return gc0.c.b(new ProductArticleFlow((ProductArticleFlowContract$InputData) productArticleDestination.f98300a, (gte.a) this.f239874b), new qka.b(productArticleDestination.getD(), productArticleDestination.getE()));
        }
    }

    public h(sud.b earnRateBottomSheetResolver) {
        Intrinsics.checkNotNullParameter(earnRateBottomSheetResolver, "earnRateBottomSheetResolver");
        this.f239874b = earnRateBottomSheetResolver;
    }
}
