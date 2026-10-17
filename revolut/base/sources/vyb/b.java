package vyb;

import android.os.Parcelable;
import cli.g;
import cli.k;
import cli.y;
import cli.z;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.rev_points.api.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.w1;
import nii.y0;
import oki.h;
import vge.z1;
import yji.l;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends h implements z {
    public final y o;

    public b(c stateMapper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = d.b(this, k.f25028a, stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, X1(new y0(null, new j0((Clause) new TextLocalisedClause(R$string.rev_points_advent_calendar_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.rev_points_advent_calendar_subtitle, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) new w1(6, new TextLocalisedClause(R$string.rev_points_advent_calendar_cta, null, null, 14), null), false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, h0.CONFETTI, (ResourceImage) null, 3052), false, 5)), null, null, new z1(this, null, 21), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.o;
    }
}
