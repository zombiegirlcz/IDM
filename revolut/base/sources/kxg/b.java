package kxg;

import aw0.bb;
import aw0.cb;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.wealth.analytics.R$string;
import com.revolut.feature.wealth.analytics.WealthAnalyticsApi$Toggles;
import com.youTransactor.uCube.rpc.Constants;
import ip0.jm0;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f190571a;

    public b(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f190571a = featureToggleInteractor;
    }

    public final int a() {
        if (((jte.d) this.f190571a).c(WealthAnalyticsApi$Toggles.AnalyticsUiImprovements.f94964c)) {
            return 280;
        }
        return Constants.TAG_EMV_L2_CHECKSUM;
    }

    public final List b(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        cb.Companion.getClass();
        return u.c(new jm0(listId, bb.c(), null, false, null, null, 0, false, a(), new Pair(Float.valueOf(BitmapDescriptorFactory.HUE_RED), Float.valueOf(1.0f)), false, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, -968));
    }

    public final List c(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        return u.c(new FullScreenStateDelegate.Model(listId, new TextLocalisedClause(R$string.wealth_analytics_error_state_title, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), null, new TextLocalisedClause(R$string.wealth_analytics_error_state_action_try_again, null, null, 14), false, null, a.f190570a, false, 0, 0, 32212));
    }

    public final List d(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        cb.Companion.getClass();
        return u.c(new jm0(listId, bb.c(), null, false, null, null, 0, true, a(), new Pair(Float.valueOf(BitmapDescriptorFactory.HUE_RED), Float.valueOf(1.0f)), false, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, -968));
    }
}
