package ebi;

import aw0.m6;
import aw0.n6;
import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.z3;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.user_declarations.shared.R$string;
import com.revolut.feature_retail_user_declarations.email_verification.otp_bottomsheet.EmailVerificationOtpBottomSheetContract$InputData;
import ip0.ab;
import ip0.bb;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class l implements n {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EmailVerificationOtpBottomSheetContract$InputData f124377a;

    public l(EmailVerificationOtpBottomSheetContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f124377a = inputData;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.email_verify_otp_dialog_title, null, null, 14), new CompositeClause(v.k(new TextLocalisedClause(R$string.email_verify_otp_dialog_subtitle_main, u.c(this.f124377a.f97615a), null, 12), new TextLocalisedClause(R$string.email_verify_otp_dialog_subtitle_update_email, null, new Click(30, (Integer) null, (Object) null, "UPDATE_EMAIL_CLICK_ID", false), 10)), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), null, null, false, 28);
        String str = domainState.f124366a;
        ab abVar = ab.DIGITS_6;
        boolean z = domainState.f124368c;
        int i = R$attr.uikit_dp8;
        int i2 = R$attr.uikit_dp16;
        return new cii.b(new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R$string.signup_main_form_email_verify_prompt_inbox_button, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), null, null, 55), u.c(new z3("CODE_LIST_ID", str, abVar, null, z, bb.CENTER_HORIZONTAL, true, domainState.f124367b, i, i, i2, i2, 8)), aVar);
    }
}
