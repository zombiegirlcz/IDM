package sbb;

import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.retail.main_screen.container.impl.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rla.a;

/* JADX INFO: loaded from: classes6.dex */
public final class d0 extends yji.n {

    @NotNull
    public static final b0 Companion = new b0();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final rla.c f261539l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a5h.g f261540m;

    public d0(rla.c appearanceSettingsInteractor, a5h.g planChangeAppThemeManager) {
        Intrinsics.checkNotNullParameter(appearanceSettingsInteractor, "appearanceSettingsInteractor");
        Intrinsics.checkNotNullParameter(planChangeAppThemeManager, "planChangeAppThemeManager");
        this.f261539l = appearanceSettingsInteractor;
        this.f261540m = planChangeAppThemeManager;
    }

    public static final void Z2(d0 d0Var, rla.a aVar) {
        d0Var.getClass();
        if (aVar instanceof rla.b) {
            yji.n.j2(d0Var, d0Var.L2(new mii.f("PREMIUM_THEME_MIGRATED_ID", new TextLocalisedClause(R$string.seasonal_theme_status_success, null, null, 14), new TextLocalisedClause(R$string.seasonal_theme_status_undo, null, null, 14), null, null, null, SyslogConstants.LOG_CLOCK)), null, new rhl.b(d0Var, (rla.b) aVar, null, 24), 3);
        } else {
            if (!Intrinsics.f(aVar, a.C1407a.f254940a)) {
                throw new NoWhenBranchMatchedException();
            }
            int i = jli.h.f175850a;
        }
    }

    @Override // yji.n
    public final void H2() {
        V2(new c0(this, null), new yi5.b(29));
    }
}
