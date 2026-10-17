package ll2;

import aii.p;
import aii.u;
import an4.b;
import com.revolut.feature.backend_driven_limits.api.BackendDrivenLimitsApi$Toggles;
import com.revolut.feature.backend_driven_limits.api.navigation.BackendDrivenLimitsDestination;
import com.revolut.feature.backend_driven_limits.impl.v2.ui.list.RestrictionsScreen;
import com.revolut.feature.backend_driven_limits.impl.v2.ui.list.RestrictionsScreenContract$InputData;
import dki.g;
import gc0.c;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements p, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final emg.a f196495a;

    public a(emg.a fincrimeChecklistInteractor) {
        Intrinsics.checkNotNullParameter(fincrimeChecklistInteractor, "fincrimeChecklistInteractor");
        this.f196495a = fincrimeChecklistInteractor;
    }

    @Override // nte.a
    public final List e() {
        return BackendDrivenLimitsApi$Toggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof BackendDrivenLimitsDestination)) {
            return null;
        }
        BackendDrivenLimitsDestination backendDrivenLimitsDestination = (BackendDrivenLimitsDestination) destination;
        return c.b(new RestrictionsScreen(new RestrictionsScreenContract$InputData(backendDrivenLimitsDestination.getF63204a(), backendDrivenLimitsDestination.getF63205b())), new b(this, 6));
    }
}
