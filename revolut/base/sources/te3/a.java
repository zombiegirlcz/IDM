package te3;

import aii.p;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.category_boost.api.CategoryBoostApi$Toggles$CategoryBoost;
import com.revolut.feature.category_boost.api.navigation.CategoryBoostDestination;
import com.revolut.feature.category_boost.impl.ui.flow.CategoryBoostFlow;
import com.revolut.retail.feature.travel_status.api.TravelStatusApi$Toggles$TravelStatus;
import com.revolut.retail.feature.travel_status.api.navigation.TravelStatusEntryDestination;
import com.revolut.retail.feature.travel_status.impl.ui.flow.TravelStatusFlow;
import com.revolut.retail.feature.travel_status.impl.ui.flow.TravelStatusFlowContract$InputData;
import dki.g;
import java.util.List;
import java.util.Set;
import jte.d;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements p, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f270027a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f270028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f270029c;

    public a(Set deeplinkGateways, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f270028b = deeplinkGateways;
        this.f270029c = featureToggleInteractor;
    }

    @Override // nte.a
    public final List e() {
        switch (this.f270027a) {
            case 0:
                return u.c(CategoryBoostApi$Toggles$CategoryBoost.f65755c);
            default:
                return u.c(TravelStatusApi$Toggles$TravelStatus.f104290c);
        }
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(aii.u destination, g flowModel) {
        switch (this.f270027a) {
            case 0:
                Intrinsics.checkNotNullParameter(destination, "destination");
                Intrinsics.checkNotNullParameter(flowModel, "flowModel");
                if (destination instanceof CategoryBoostDestination) {
                    if (((d) this.f270029c).c(CategoryBoostApi$Toggles$CategoryBoost.f65755c)) {
                        return new CategoryBoostFlow();
                    }
                }
                return null;
            default:
                Intrinsics.checkNotNullParameter(destination, "destination");
                Intrinsics.checkNotNullParameter(flowModel, "flowModel");
                if (!this.f270029c.a(TravelStatusApi$Toggles$TravelStatus.f104290c) && (destination instanceof TravelStatusEntryDestination)) {
                    return new TravelStatusFlow(new TravelStatusFlowContract$InputData(((TravelStatusEntryDestination) destination).f104291a));
                }
                return null;
        }
    }

    @Override // aii.p
    public final Set h() {
        switch (this.f270027a) {
        }
        return this.f270028b;
    }

    public a(ImmutableSet deeplinkGateways, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f270028b = deeplinkGateways;
        this.f270029c = featureToggleInteractor;
    }
}
