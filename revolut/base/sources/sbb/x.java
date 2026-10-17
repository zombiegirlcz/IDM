package sbb;

import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.retail.main_screen.container.impl.R$string;
import com.revolut.feature.retail.main_screen.container.models.action_payload.SeasonalThemeUpdateActionPayload;
import com.revolut.feature.rev10_main_screen.api.action.MainScreenContainerActionData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class x extends yji.n implements etb.a {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static t f261563m = t.Default;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ekg.g f261564l;

    public x(ekg.g uiPersonalisationInteractor) {
        Intrinsics.checkNotNullParameter(uiPersonalisationInteractor, "uiPersonalisationInteractor");
        this.f261564l = uiPersonalisationInteractor;
    }

    @Override // yji.n
    public final void D2() {
        t tVar;
        int i = u.f261559a[f261563m.ordinal()];
        if (i != 1) {
            tVar = i != 2 ? f261563m : t.Default;
        } else {
            yji.n.j2(this, L2(te0.w.a("themeAppliedMsg", new TextLocalisedClause(R$string.seasonal_theme_status_success, null, null, 14), new TextLocalisedClause(R$string.seasonal_theme_status_undo, null, null, 14), null, null, null, SyslogConstants.LOG_CLOCK)), null, new w(this, null, 0), 3);
            tVar = t.Default;
        }
        f261563m = tVar;
    }

    @Override // etb.a
    public final void E(MainScreenContainerActionData actionData) {
        Intrinsics.checkNotNullParameter(actionData, "actionData");
        T2(new s09.c(actionData, this, null, 29), new yi5.b(27));
    }

    @Override // yji.n
    public final void E2() {
        f261563m = u.f261559a[f261563m.ordinal()] == 3 ? t.ThemeUpdateNotificationScheduled : f261563m;
    }

    @Override // etb.a
    public final boolean i2(MainScreenContainerActionData actionData) {
        Intrinsics.checkNotNullParameter(actionData, "actionData");
        return actionData.f83422b instanceof SeasonalThemeUpdateActionPayload;
    }
}
