package pyb;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.rev_points.api.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements fub.a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e1l.a f240739a;

    public c(e1l.a errorDialogMapper) {
        Intrinsics.checkNotNullParameter(errorDialogMapper, "errorDialogMapper");
        this.f240739a = errorDialogMapper;
    }

    public final y0 a(String reward) {
        Intrinsics.checkNotNullParameter(reward, "reward");
        return new y0("CLAIM_REWARD_DIALOG_ID", new j0((Clause) new TextLocalisedClause(R$string.rev_points_challenges_v3_success_title, u.c(new TextClause(reward, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124)), null, 12), (Clause) new TextLocalisedClause(R$string.rev_points_challenges_v3_success_subtitle, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) new StatusViewContract$Duration.Custom(4000L), h0.CONFETTI, (ResourceImage) null, 2556), false, 4);
    }
}
