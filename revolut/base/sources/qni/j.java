package qni;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.otp.input.R$string;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        LargeActionButtonDelegate.Model model;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.revolut_sso_email_verification_no_email_received_dialog_title, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_email_verification_no_email_received_dialog_description, null, null, 14), null, null, false, 28);
        long j2 = domainState.f247952a;
        LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("LIST_ID_NO_EMAIL_DIALOG_RESEND", LargeActionButton.ButtonStyle.f58725a, null, j2 > 0 ? new TextLocalisedClause(R$string.revolut_sso_email_verification_no_email_received_dialog_action_resend_in, u.c(uc0.b.e(j2)), null, 12) : new TextLocalisedClause(R$string.revolut_sso_email_verification_no_email_received_dialog_action_resend, null, null, 14), domainState.f247953b, null, null, null, null, 968);
        yp0.b.r(model2, 0, 0, 0, 0, 15);
        if (domainState.f247954c) {
            model = new LargeActionButtonDelegate.Model("LIST_ID_NO_EMAIL_DIALOG_CHOOSE_ANOTHER_METHOD", LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.revolut_sso_email_verification_no_email_received_dialog_action_choose_another_method, null, null, 14), false, null, null, null, null, 1000);
            yp0.b.r(model, 0, R$attr.uikit_dp24, 0, 0, 13);
        } else {
            model = null;
        }
        LargeActionButtonDelegate.Model[] elements = {model2, model};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new cii.b(null, kotlin.collections.d.L(elements), aVar);
    }
}
