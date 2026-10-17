package ink;

import android.net.Uri;
import cli.g;
import cli.y;
import com.revolut.core.ui_kit_core.displayers.video.models.UriVideo;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_referrals_invite_video.PlanReferralsInviteVideoScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends h implements d {
    public final y o;

    public f(PlanReferralsInviteVideoScreenContract$InputData inputData, f80.a uriHelper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        this.o = mra.d.b(this, new e(new UriVideo(((f80.b) uriHelper).f(inputData.f103627a), (Uri) null, false, oz0.b.CENTER_CROP, (Boolean) null, oz0.c.DISABLED, 50)), new a54.b(13), null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.o;
    }
}
