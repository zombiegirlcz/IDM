package dnk;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.SplitColumnCellDelegate;
import com.revolut.core.ui_kit.delegates.fh;
import com.revolut.core.ui_kit.delegates.gh;
import com.revolut.core.ui_kit.delegates.hh;
import com.revolut.core.ui_kit.delegates.ih;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanPageLayoutAsset;
import ggk.p0;
import ggk.q0;
import ggk.r0;
import ggk.s0;
import ggk.t0;
import ggk.u0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f116358a;

    public c(l iconMapper) {
        Intrinsics.checkNotNullParameter(iconMapper, "iconMapper");
        this.f116358a = iconMapper;
    }

    public final SplitColumnCellDelegate.Model.a a(u0 u0Var) {
        if (u0Var instanceof p0) {
            return new hh(this.f116358a.c(((p0) u0Var).f143770a));
        }
        if (u0Var instanceof t0) {
            return new ih(new TextClause(((t0) u0Var).f143782a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        }
        if (u0Var instanceof q0) {
            return new fh(new TextClause(((q0) u0Var).f143771a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new ResourceImage(R$drawable.uikit_icn_16_link_external, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        }
        boolean z = u0Var instanceof s0;
        SplitColumnCellDelegate.Model.a.C0426a c0426a = SplitColumnCellDelegate.Model.a.C0426a.f53465a;
        if (z) {
            PlanPageLayoutAsset planPageLayoutAsset = ((s0) u0Var).f143777a;
            int i = b.f116357a[planPageLayoutAsset.f102709b.ordinal()];
            if (i == 1) {
                return new gh(new UrlImage(planPageLayoutAsset.f102708a, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, null, null, gz0.b.FitCenter, null, null, null, LDSFile.EF_SOD_TAG), null, null, false, false, 507902));
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        } else if (!(u0Var instanceof r0) && u0Var != null) {
            throw new NoWhenBranchMatchedException();
        }
        return c0426a;
    }
}
