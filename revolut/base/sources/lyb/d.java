package lyb;

import a2c.e;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.rev_points.api.R$string;
import kotlin.jvm.internal.Intrinsics;
import mii.k;
import org.jetbrains.annotations.NotNull;
import yji.n;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends n implements dub.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f200776l;

    public d(e spareChangeNavigationResolver) {
        Intrinsics.checkNotNullParameter(spareChangeNavigationResolver, "spareChangeNavigationResolver");
        this.f200776l = spareChangeNavigationResolver;
    }

    public final void Z2() {
        L2(new k("DIALOG_REWARDS_ACTIVATED_ID", new TextLocalisedClause(R$string.rev_points_upsell_rewards_activated, null, null, 14), null, null, null, 28));
    }
}
