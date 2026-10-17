package r8h;

import aii.p;
import aii.u;
import com.revolut.feature.wealth.api.declaration.DetailDisclaimersDestination;
import com.revolut.feature.wealth.impl.ui.extensions.disclaimers.modal_disclaimer.WealthDisclaimerBottomSheet;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f252459a = 0;

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof DetailDisclaimersDestination) {
            return gc0.c.b(new WealthDisclaimerBottomSheet(new dah.g(((DetailDisclaimersDestination) destination).getF95193a())), new ogk.b(18));
        }
        return null;
    }
}
