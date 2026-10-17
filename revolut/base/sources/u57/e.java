package u57;

import com.revolut.core.ui_kit.delegates.widgets.ErrorWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.freelancer.impl.R$string;
import com.youTransactor.uCube.rpc.Constants;
import ct6.w;
import jr6.g;
import kotlin.jvm.internal.Intrinsics;
import op0.q;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f277393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f277394b;

    public e(w clauseFactory, g cashbackItemMapper) {
        Intrinsics.checkNotNullParameter(clauseFactory, "clauseFactory");
        Intrinsics.checkNotNullParameter(cashbackItemMapper, "cashbackItemMapper");
        this.f277393a = clauseFactory;
        this.f277394b = cashbackItemMapper;
    }

    public final ErrorWidgetDelegate.Model a(String widgetId) {
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        return new ErrorWidgetDelegate.Model(widgetId, null, new TextLocalisedClause(R$string.freelancer_widget_cashback_error_title, null, null, 14), w.b(), q.MEDIUM, null, null, Constants.TAG_E2_CONFIGURATION_PAYMENT_SCHEME_CUSTOMIZATION);
    }
}
