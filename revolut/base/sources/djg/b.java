package djg;

import com.revolut.feature.trusted_merchants.api.TrustedMerchantsApi$Toggles$TrustedMerchantsFlowKompotMigration;
import com.revolut.feature.trusted_merchants.api.navigation.TrustedMerchantsFlowDestination;
import com.revolut.feature.trusted_merchants.impl.ui.kompot.TrustedMerchantsFlow;
import com.revolut.feature.trusted_merchants.impl.ui.kompot.TrustedMerchantsFlowContract$InputData;
import dki.g;
import java.util.List;
import jte.d;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements ohi.a, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f115384a;

    public b(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f115384a = featureToggleInteractor;
    }

    @Override // nte.a
    public final List e() {
        return u.c(TrustedMerchantsApi$Toggles$TrustedMerchantsFlowKompotMigration.f94401c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(aii.u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (((d) this.f115384a).c(TrustedMerchantsApi$Toggles$TrustedMerchantsFlowKompotMigration.f94401c) && (destination instanceof TrustedMerchantsFlowDestination)) {
            return new TrustedMerchantsFlow(new TrustedMerchantsFlowContract$InputData(((TrustedMerchantsFlowDestination) destination).f94413b));
        }
        return null;
    }
}
