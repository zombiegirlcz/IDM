package vh8;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.junior_onboarding.impl.R$string;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements e {
    @Override // vh8.e
    public final TextLocalisedClause a() {
        return new TextLocalisedClause(R$string.rev_u18_signup_details_confirmation_subtitle, null, null, 14);
    }

    @Override // vh8.e
    public final TextLocalisedClause b() {
        return new TextLocalisedClause(R$string.junior_signup_account_match_redesigned_prompt_footnote, null, null, 14);
    }

    @Override // vh8.e
    public final TextLocalisedClause c(String firstName) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        return new TextLocalisedClause(R$string.youth_signup_invitation_revolut_message, u.c(firstName), null, 12);
    }

    @Override // vh8.e
    public final TextLocalisedClause d() {
        return new TextLocalisedClause(R$string.junior_signup_details_confirmation_action_create_account, null, null, 14);
    }

    @Override // vh8.e
    public final TextLocalisedClause e() {
        return new TextLocalisedClause(R$string.junior_signup_account_match_redesigned_prompt_action_new_account, null, null, 14);
    }

    @Override // vh8.e
    public final boolean f() {
        return true;
    }

    @Override // vh8.e
    public final d g() {
        return d.Footer;
    }
}
