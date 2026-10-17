package zx7;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.insurance_pet.impl.R$string;
import ip0.tm0;
import ip0.um0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import rp0.t;
import rp0.y;
import wm.b;
import zhm.u;
import zx7.g;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements mm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wm.e f326072a;

    public d(wm.e dialogActionDispatcher) {
        Intrinsics.checkNotNullParameter(dialogActionDispatcher, "dialogActionDispatcher");
        this.f326072a = dialogActionDispatcher;
    }

    @Override // mm.b
    public final efm.b a3(mm.a aVar) {
        Object cVar;
        g action = (g) aVar;
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof g.a) {
            cVar = b.c.f298571a;
        } else {
            if (!(action instanceof g.b)) {
                throw new NoWhenBranchMatchedException();
            }
            cVar = new wm.c(new y(u.c(new um0("twin.button.group", new tm0(LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.pets_cancellation_dialog_secondary_button, null, null, 14), false, null, null, 56), new tm0(LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.pets_cancellation_dialog_primary_button, null, null, 14), false, null, null, 56), (Object) null, (AnalyticsContext) null, (AnalyticsContext) null, 0, 0, 0, 1016)), new t(new TextLocalisedClause(R$string.pets_cancellation_dialog_title, null, null, 14), new TextLocalisedClause(R$string.pets_cancellation_dialog_subtitle, null, null, 14), null, 28), rp0.l.WINDOW, null, null, null, 1016));
        }
        return this.f326072a.c0(cVar);
    }
}
