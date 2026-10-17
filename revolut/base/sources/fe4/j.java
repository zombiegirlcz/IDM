package fe4;

import cli.y;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_offer.single_selection.SingleSelectionBottomSheetContract$InputData;
import cv3.t;
import cv3.u;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import wy3.q;

/* JADX INFO: loaded from: classes22.dex */
public final class j extends oki.h implements dli.b {
    public final iz3.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f134443p;

    public j(iz3.a linkNavigationControllerModelExtension, SingleSelectionBottomSheetContract$InputData inputData, k stateMapper) {
        Intrinsics.checkNotNullParameter(linkNavigationControllerModelExtension, "linkNavigationControllerModelExtension");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = linkNavigationControllerModelExtension;
        this.f134443p = mra.d.b(this, new a(inputData.f68001a), stateMapper, null, false, 12);
    }

    public final void I2(e event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof c) {
            this.o.Z2(((c) event).f134436a.f275445a);
            return;
        }
        boolean z = event instanceof b;
        y yVar = this.f134443p;
        if (!z) {
            if (!(event instanceof d)) {
                throw new NoWhenBranchMatchedException();
            }
            H2(yVar, new fca.d((d) event, 4));
        } else {
            q qVar = ((a) ((j2) yVar.f22677a).getValue()).f134434a;
            t tVar = u.Companion;
            String str = qVar.e;
            String str2 = qVar.a().f301086a;
            tVar.getClass();
            C2(new f(t.b(str2, str)));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f134443p;
    }
}
