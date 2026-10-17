package cab;

import aw0.m6;
import aw0.n6;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.vaults.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w80.b f22597a;

    public n(u80.o moneyPrefixFormatter, w80.b amountFormatter) {
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(moneyPrefixFormatter, "moneyPrefixFormatter");
        this.f22597a = amountFormatter;
    }

    public static aw0.g a(boolean z, boolean z3) {
        m6 m6Var = n6.Companion;
        yy0.h hVar = new yy0.h(new TextLocalisedClause(R$string.vaults_set_goal_date_picker_title, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_calendar, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        return new aw0.g(m6.b(m6Var, hVar, defaultFilledButton, null, z3, null, 492), m6.c(m6Var, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_confirm, null, null, 14), defaultFilledButton, null, "GOALS_CTA_BUTTON_ID", z, null, null, null, 972), (Clause) null, aw0.f.SMALL_PRIMARY_BUTTON, 8);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (h) iii.c.f(domainState.f22584c, new c8i.c(this, 14), new c2f.m(this, 25), new m(this, domainState, 0));
    }
}
