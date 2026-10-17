package cib;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.retail.salary_account.impl.R$string;
import kotlin.jvm.internal.Intrinsics;
import nii.c0;
import nii.y0;
import nii.z;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    @NotNull
    public static final C0153a Companion = new C0153a();

    /* JADX INFO: renamed from: cib.a$a, reason: collision with other inner class name */
    public static final class C0153a {
        private C0153a() {
        }
    }

    public static y0 a(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return new y0(id10, new c0(null, null, null, false, null, false, false, null, 1919), false, 4);
    }

    public static y0 b(boolean z) {
        return new y0("ID_VERIFY_EMPLOYMENT_UNVERIFIED_ERROR", new z(new TextLocalisedClause(R$string.salaried_growth_work_email_verification_bottom_sheet_token_error_title, null, null, 14), new TextLocalisedClause(R$string.salaried_growth_work_email_verification_bottom_sheet_token_error_description, null, null, 14), z ? new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_retry, null, null, 14) : new TextLocalisedClause(R$string.salaried_growth_work_email_verification_bottom_sheet_token_error_action, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4);
    }
}
