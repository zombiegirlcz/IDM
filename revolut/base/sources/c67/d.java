package c67;

import com.revolut.core.ui_kit.delegates.widgets.ErrorWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.freelancer.impl.R$string;
import com.youTransactor.uCube.rpc.Constants;
import ct6.w;
import gr6.e;
import kotlin.jvm.internal.Intrinsics;
import op0.q;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f21693a;

    public d(w freelancerClauseFactory, e freelancerAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(freelancerAvailabilityInteractor, "freelancerAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(freelancerClauseFactory, "freelancerClauseFactory");
        this.f21693a = freelancerAvailabilityInteractor;
    }

    public final ErrorWidgetDelegate.Model a(String widgetId) {
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        return new ErrorWidgetDelegate.Model(widgetId, null, new TextLocalisedClause(R$string.freelancer_vat_reminder_widget_error_title, null, null, 14), w.b(), q.MEDIUM, null, null, Constants.TAG_E2_CONFIGURATION_PAYMENT_SCHEME_CUSTOMIZATION);
    }
}
