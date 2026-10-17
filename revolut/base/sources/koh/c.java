package koh;

import aii.g;
import aii.p;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.wealth_discovery.api.CollectionUIApi$Toggles$MostTradedKompotMigration;
import com.revolut.feature.wealth_discovery.api.declaration.collection.MostTradedAssetsDestination;
import com.revolut.feature.wealth_discovery.api.declaration.collection.PopularFirstBuyDestination;
import com.revolut.feature.wealth_discovery.api.declaration.collection.TopMoversDestination;
import com.revolut.feature.wealth_discovery.impl.collection.most_traded.MostTradedAssetsScreen;
import com.revolut.feature.wealth_discovery.impl.collection.most_traded.MostTradedAssetsScreenContract$InputData;
import com.revolut.feature.wealth_discovery.impl.collection.popular_first_buy.PopularFirstBuyScreen;
import com.revolut.feature.wealth_discovery.impl.collection.popular_first_buy.PopularFirstBuyScreenContract$Input;
import com.revolut.feature.wealth_discovery.impl.collection.top_movers.TopMoversScreen;
import com.revolut.feature.wealth_discovery.impl.collection.top_movers.TopMoversScreenContract$InputData;
import com.revolut.kompot.common.flow.WrapperFlowImpl;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements ohi.a, nte.a, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f186366a;

    public c(ImmutableSet deeplinkGateways) {
        Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
        this.f186366a = deeplinkGateways;
    }

    @Override // ohi.a, nhi.h, aii.p
    public final void b() {
    }

    @Override // nhi.f
    public final g c(aii.e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return null;
    }

    @Override // nte.a
    public final List e() {
        return u.c(CollectionUIApi$Toggles$MostTradedKompotMigration.f96090c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(aii.u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof TopMoversDestination) {
            return gc0.c.b(new TopMoversScreen(new TopMoversScreenContract$InputData((TopMoversDestination) destination)), new aab.b(18));
        }
        if (destination instanceof MostTradedAssetsDestination) {
            return gc0.c.b(new MostTradedAssetsScreen(new MostTradedAssetsScreenContract$InputData((MostTradedAssetsDestination) destination)), new aab.b(19));
        }
        if (!(destination instanceof PopularFirstBuyDestination)) {
            return null;
        }
        PopularFirstBuyScreen controller = new PopularFirstBuyScreen(new PopularFirstBuyScreenContract$Input(((PopularFirstBuyDestination) destination).f96119a));
        aab.b resultHandler = new aab.b(20);
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(resultHandler, "resultHandler");
        return new WrapperFlowImpl(controller, resultHandler);
    }

    @Override // aii.p
    public final Set h() {
        return this.f186366a;
    }
}
