package f08;

import com.google.firebase.messaging.t;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.insurance_pet.impl.R$string;
import efm.d0;
import f08.b;
import ip0.tm0;
import ip0.um0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pfm.z;
import rp0.y;
import wm.b;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements mm.b, g3l.d {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wm.e f131024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fx7.f f131025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f131026c;
    public final g3l.a d;
    public final ln.a e;
    public final tm.g f;

    public m(wm.e dialogActionDispatcher, t actionDelegateFactory, fx7.f interactor, c state, g3l.a statusDialogViewConfigurationDispatcher, ln.a navigationCommandsDispatcher) {
        Intrinsics.checkNotNullParameter(dialogActionDispatcher, "dialogActionDispatcher");
        Intrinsics.checkNotNullParameter(actionDelegateFactory, "actionDelegateFactory");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(statusDialogViewConfigurationDispatcher, "statusDialogViewConfigurationDispatcher");
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        this.f131024a = dialogActionDispatcher;
        this.f131025b = interactor;
        this.f131026c = state;
        this.d = statusDialogViewConfigurationDispatcher;
        this.e = navigationCommandsDispatcher;
        this.f = actionDelegateFactory.f(new eu7.c(this, 26));
    }

    @Override // mm.b
    public final efm.b a3(mm.a aVar) {
        b action = (b) aVar;
        Intrinsics.checkNotNullParameter(action, "action");
        boolean z = action instanceof b.C0768b;
        wm.e eVar = this.f131024a;
        if (z) {
            return eVar.c0(new wm.c(new y(u.c(new um0("twin.button.group", new tm0(LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.pets_profile_removal_dialog_secondary_button, null, null, 14), false, null, null, 56), new tm0(LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.pets_profile_removal_dialog_primary_button, null, null, 14), false, null, null, 56), (Object) null, (AnalyticsContext) null, (AnalyticsContext) null, 0, 0, 0, 1016)), new rp0.t(new TextLocalisedClause(R$string.pets_profile_removal_dialog_title, null, null, 14), new TextLocalisedClause(R$string.pets_profile_removal_dialog_subtitle, null, null, 14), null, 28), rp0.l.WINDOW, null, null, null, "DEFAULT_LEGACY_DIALOG_DELEGATES_KEY", null, null, null, 3832)));
        }
        if (Intrinsics.f(action, b.a.f131005a)) {
            return eVar.c0(b.c.f298571a);
        }
        if (action instanceof b.c) {
            return this.f.a(mm.e.f207100a);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // g3l.d
    public final d0 b(k3l.j result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (!Intrinsics.f(result.a().getF104385a(), "REMOVAL_SUCCESS_STATUS_SCREEN_ID")) {
            ufm.b bVarM = d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        if (result instanceof k3l.g) {
            z zVarD = okl.m.w(null, null, null, 7, this.e).D(Boolean.TRUE);
            Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
            return zVarD;
        }
        ufm.b bVarM2 = d0.m(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
        return bVarM2;
    }
}
