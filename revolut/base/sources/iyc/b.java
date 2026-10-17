package iyc;

import aii.e;
import aii.g;
import com.revolut.feature.selfserve.sot.api.declaration.SotApi$Toggles$SotKompotMigration;
import com.revolut.feature.selfserve.sot.api.navigation.SotDestination;
import com.revolut.feature.selfserve.sot.impl.ui.flow.SotFlow;
import java.util.List;
import jte.d;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements ohi.a, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f169647a;

    public b(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f169647a = featureToggleInteractor;
    }

    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return null;
    }

    @Override // nte.a
    public final List e() {
        return u.c(SotApi$Toggles$SotKompotMigration.f85858c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(aii.u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (((d) this.f169647a).c(SotApi$Toggles$SotKompotMigration.f85858c) && (destination instanceof SotDestination)) {
            return new SotFlow(((SotDestination) destination).f85898b);
        }
        return null;
    }
}
