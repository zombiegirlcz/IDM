package vh8;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.junior_onboarding.impl.R$string;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f289343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f289344b;

    public a(b gmUiConfiguration, int i) {
        this.f289343a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(gmUiConfiguration, "gmUiConfiguration");
                this.f289344b = gmUiConfiguration;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(gmUiConfiguration, "gmUiConfiguration");
                this.f289344b = gmUiConfiguration;
                break;
            case 3:
                Intrinsics.checkNotNullParameter(gmUiConfiguration, "gmUiConfiguration");
                this.f289344b = gmUiConfiguration;
                break;
            default:
                Intrinsics.checkNotNullParameter(gmUiConfiguration, "gmUiConfiguration");
                this.f289344b = gmUiConfiguration;
                break;
        }
    }

    @Override // vh8.e
    public final TextLocalisedClause a() {
        switch (this.f289343a) {
            case 0:
                return this.f289344b.a();
            case 1:
                return this.f289344b.a();
            case 2:
                return new TextLocalisedClause(R$string.rev_u18_signup_details_confirmation_subtitle_prepaid_card, null, null, 14);
            default:
                return this.f289344b.a();
        }
    }

    @Override // vh8.e
    public final TextLocalisedClause b() {
        switch (this.f289343a) {
            case 0:
                return this.f289344b.b();
            case 1:
                return this.f289344b.b();
            case 2:
                return new TextLocalisedClause(R$string.junior_signup_account_match_redesigned_prompt_footnote_sub_accounts, null, null, 14);
            default:
                return this.f289344b.b();
        }
    }

    @Override // vh8.e
    public final TextLocalisedClause c(String firstName) {
        switch (this.f289343a) {
            case 0:
                Intrinsics.checkNotNullParameter(firstName, "firstName");
                return this.f289344b.c(firstName);
            case 1:
                Intrinsics.checkNotNullParameter(firstName, "firstName");
                return this.f289344b.c(firstName);
            case 2:
                Intrinsics.checkNotNullParameter(firstName, "firstName");
                return new TextLocalisedClause(R$string.youth_signup_invitation_revolut_message_sub_accounts, u.c(firstName), null, 12);
            default:
                Intrinsics.checkNotNullParameter(firstName, "firstName");
                return this.f289344b.c(firstName);
        }
    }

    @Override // vh8.e
    public final TextLocalisedClause d() {
        switch (this.f289343a) {
            case 0:
                return this.f289344b.d();
            case 1:
                return this.f289344b.d();
            case 2:
                return new TextLocalisedClause(R$string.junior_signup_details_confirmation_action_create_sub_account, null, null, 14);
            default:
                return new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14);
        }
    }

    @Override // vh8.e
    public final TextLocalisedClause e() {
        switch (this.f289343a) {
            case 0:
                return this.f289344b.e();
            case 1:
                return this.f289344b.e();
            case 2:
                return new TextLocalisedClause(R$string.junior_signup_account_match_redesigned_prompt_action_new_sub_account, null, null, 14);
            default:
                return this.f289344b.e();
        }
    }

    @Override // vh8.e
    public final boolean f() {
        switch (this.f289343a) {
            case 0:
                return false;
            case 1:
                return false;
            case 2:
                this.f289344b.getClass();
                return true;
            default:
                this.f289344b.getClass();
                return true;
        }
    }

    @Override // vh8.e
    public final d g() {
        switch (this.f289343a) {
            case 1:
                this.f289344b.getClass();
                break;
        }
        return d.Hidden;
    }
}
