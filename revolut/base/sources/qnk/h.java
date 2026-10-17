package qnk;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        TextLocalisedClause textLocalisedClause;
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.student_plans_email_verification_resend_sheet_title, null, null, 14), new TextLocalisedClause(R$string.student_plans_email_verification_resend_sheet_subtitle, null, null, 14), null, null, false, 28);
        int i = domainState.f247960a;
        if (i > 0) {
            int i2 = R$string.student_plans_verification_email_prompt_action_resend_email_in;
            String str = String.format("%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i / 60), Integer.valueOf(i % 60)}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            textLocalisedClause = new TextLocalisedClause(i2, u.c(str), null, 12);
        } else {
            textLocalisedClause = new TextLocalisedClause(R$string.student_plans_email_verification_resend_sheet_action_resend, null, null, 14);
        }
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("LIST_ID_STUDENT_EMAIL_RESEND", LargeActionButton.ButtonStyle.f58725a, null, textLocalisedClause, domainState.f247960a == 0, "STUDENT_EMAIL_RESEND_BUTTON_TAG", null, null, null, 904);
        yp0.b.r(model, 0, 0, 0, 0, 15);
        return new cii.b(null, u.c(model), aVar);
    }
}
