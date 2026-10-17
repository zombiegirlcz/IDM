package aab;

import aii.p;
import aii.u;
import com.revolut.feature.retail.goals.api.navigation.GoalsDestination;
import com.revolut.feature.retail.goals.impl.ui.GoalsController;
import com.revolut.feature.retail.goals.impl.ui.GoalsControllerContract$InputData;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f2797a = 0;

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof GoalsDestination) {
            return gc0.c.b(new GoalsController(new GoalsControllerContract$InputData(((GoalsDestination) destination).f82650a)), new b(0));
        }
        return null;
    }
}
