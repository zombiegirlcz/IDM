package cnk;

import cli.y;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$InfoBottomSheet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class m extends oki.h implements j {
    public final dgk.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f25462p;

    public m(o stateMapper, dgk.a footerExtension) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(footerExtension, "footerExtension");
        this.o = footerExtension;
        this.f25462p = mra.d.b(this, cli.k.f25028a, stateMapper, null, false, 12);
    }

    public final void I2(PlansDashboardLayout$PlanPageLayout$InfoBottomSheet.Action action) {
        Intrinsics.checkNotNullParameter(action, "action");
        int i = l.f25461a[action.f102781a.ordinal()];
        if (i == 1) {
            C2(a.f25452a);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            C2(b.f25453a);
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f25462p;
    }
}
