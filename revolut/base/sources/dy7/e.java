package dy7;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.AnimatedResourceImage;
import com.revolut.feature.insurance_pet.impl.R$string;
import ip0.tm0;
import ip0.um0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rp0.l;
import rp0.t;
import rp0.y;
import wm.b;
import zhm.u;
import zx7.j;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements mm.b {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wm.e f121075a;

    public e(wm.e expandableDialogActionDispatcher) {
        Intrinsics.checkNotNullParameter(expandableDialogActionDispatcher, "expandableDialogActionDispatcher");
        this.f121075a = expandableDialogActionDispatcher;
    }

    @Override // mm.b
    public final efm.b a3(mm.a aVar) {
        Object cVar;
        j action = (j) aVar;
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof j.a) {
            cVar = b.c.f298571a;
        } else {
            if (!(action instanceof j.b)) {
                throw new NoWhenBranchMatchedException();
            }
            String str = null;
            AnimatedResourceImage animatedResourceImage = null;
            AnimatedResourceImage animatedResourceImage2 = null;
            cVar = new wm.c(new y(u.c(new um0("REJECT_RENEWAL_DIALOG_TWIN_BUTTON_ID", new tm0(LargeActionButton.ButtonStyle.f58726b, animatedResourceImage, new TextLocalisedClause(R$string.pets_renewal_opt_out_dialog_secondary_button_title, null, null, 14), false, null, str, 56), new tm0(LargeActionButton.ButtonStyle.f58725a, animatedResourceImage2, new TextLocalisedClause(R$string.pets_renewal_opt_out_dialog_primary_button_title, null, null, 14), false, str, null, 56), (Object) null, (AnalyticsContext) null, (AnalyticsContext) null, 0, 0, 0, 1016)), new t(new TextLocalisedClause(R$string.pets_renewal_opt_out_dialog_title, null, null, 14), new TextLocalisedClause(R$string.pets_renewal_opt_out_dialog_subtitle, null, null, 14), null, 28), l.WINDOW, null, null, null, "REJECT_RENEWAL_DIALOG_DELEGATE_KEY", null, null, null, 3832));
        }
        return this.f121075a.c0(cVar);
    }
}
