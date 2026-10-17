package qoc;

import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import ms0.h4;
import ms0.j4;

/* JADX INFO: loaded from: classes6.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f248120a;

    public f0(j0 inputValidationConfig) {
        Intrinsics.checkNotNullParameter(inputValidationConfig, "inputValidationConfig");
        this.f248120a = inputValidationConfig;
    }

    public final SmallActionButtonDelegate.Model a(int i, u uVar) throws Throwable {
        if (!this.f248120a.f248126c) {
            hx7.e.n(new IllegalStateException(p.a.p("Action buttons are not supported in this screen but button for ", uVar.getClass().getSimpleName(), " mapping requested")));
            return null;
        }
        h4 h4Var = h4.SEMIACCENT;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
        int i2 = R$attr.uikit_dp16;
        return new SmallActionButtonDelegate.Model("set-goal-action-button", h4Var, null, null, textLocalisedClause, null, j4.f208300a, uVar, null, 0, i2, i2, i2, 3416);
    }
}
