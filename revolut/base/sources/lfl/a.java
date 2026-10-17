package lfl;

import aab.b;
import aii.e;
import aii.g;
import aii.u;
import com.revolut.shared.feature.wealth.statements.api.navigation.CostChargesDestination;
import com.revolut.shared.feature.wealth.statements.impl.costchargesreport.CostChargesController;
import gc0.c;
import kotlin.jvm.internal.Intrinsics;
import mfl.i;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements ohi.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f195035a = 0;

    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return null;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof CostChargesDestination)) {
            return null;
        }
        CostChargesDestination costChargesDestination = (CostChargesDestination) destination;
        return c.b(new CostChargesController(new i(costChargesDestination.f105352a, costChargesDestination.f105353b)), new b(22));
    }
}
