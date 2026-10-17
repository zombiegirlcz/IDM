package ikk;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.decline_invitation.DeclineFamilyPlanInvitationScreenContract$InputData;
import ffk.t;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yji.l;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends oki.h implements g {
    public final t o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f161998p;

    public i(n stateMapper, DeclineFamilyPlanInvitationScreenContract$InputData inputData, t pricingPlanInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        this.o = pricingPlanInteractor;
        this.f161998p = mra.d.b(this, new e(inputData.f103396a, inputData.f103397b, new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        if (((e) ((j2) this.f161998p.f22677a).getValue()).f161993b) {
            l.a1(this, rd0.e.b(this.o.v(w4l.h.f294642c)), null, null, new ibg.g(this, null, 13), 3);
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f161998p;
    }
}
