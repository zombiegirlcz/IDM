package com.revolut.feature.junior_settings.impl.ui_kompot.logout_confirmation;

import aim.e;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.junior_settings.impl.R$string;
import com.revolut.feature.junior_settings.impl.ui_kompot.logout_confirmation.LogoutConfirmationControllerContract$PhoneNumberRemovalAction;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import no8.f;
import no8.l;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z80.b f77304a;

    public a(z80.b phoneToolsProvider) {
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        this.f77304a = phoneToolsProvider;
    }

    @Override // cli.n
    public final o c(j jVar) {
        Boolean bool;
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        e eVarB = u.b();
        LogoutConfirmationControllerContract$PhoneNumberRemovalAction logoutConfirmationControllerContract$PhoneNumberRemovalAction = domainState.d;
        String str = domainState.f217949b;
        if (Intrinsics.f(logoutConfirmationControllerContract$PhoneNumberRemovalAction, LogoutConfirmationControllerContract$PhoneNumberRemovalAction.Remove.f77303a)) {
            bool = Boolean.TRUE;
        } else if (Intrinsics.f(logoutConfirmationControllerContract$PhoneNumberRemovalAction, LogoutConfirmationControllerContract$PhoneNumberRemovalAction.Keep.f77301a)) {
            bool = Boolean.FALSE;
        } else {
            if (!Intrinsics.f(logoutConfirmationControllerContract$PhoneNumberRemovalAction, LogoutConfirmationControllerContract$PhoneNumberRemovalAction.NotApplicable.f77302a)) {
                throw new NoWhenBranchMatchedException();
            }
            bool = null;
        }
        if (bool != null) {
            List listK = v.k(new CellDetailsSwitcherDelegate.Model("ID_PHONE_NUMBER_REMOVAL_SWITCHER", new TextLocalisedClause(R$string.junior_logout_confirmation_phone_title, u.c(z80.b.b(this.f77304a, domainState.f217950c, null, null, 6)), null, 12), bool.booleanValue(), true, 0, null, null, null, 4080), new CellDetailsStandaloneNoteDelegate.Model("ID_PHONE_NUMBER_REMOVAL_DESCRIPTION", null, new TextLocalisedClause(R$string.junior_logout_confirmation_phone_subtitle, u.c(str), null, 12), null, null, false, null, 0, 0, 2042));
            yp0.b.k(listK, 0, R$attr.uikit_dp0, 0, 0, 29);
            eVarB.addAll(listK);
        }
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("ID_LOG_OUT_ACTION", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.junior_logout_confirmation_button_log_out, null, null, 14), false, "LOADING_TAG_LOG_OUT_ACTION", null, null, null, 936);
        yp0.b.r(model, R$attr.uikit_dp24, 0, 0, 0, 14);
        LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("ID_CANCEL_ACTION", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.junior_logout_confirmation_button_cancel, null, null, 14), false, null, null, null, null, 1000);
        yp0.b.r(model2, 0, 0, 0, 0, 15);
        eVarB.addAll(v.k(model, model2));
        return new l(u.a(eVarB), new TextLocalisedClause(R$string.junior_logout_confirmation_title, u.c(str), null, 12));
    }
}
