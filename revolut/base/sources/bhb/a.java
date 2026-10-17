package bhb;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.retail.salary_account.impl.R$string;
import nii.y0;
import nii.z;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    @NotNull
    public static final C0099a Companion = new C0099a();

    /* JADX INFO: renamed from: bhb.a$a, reason: collision with other inner class name */
    public static final class C0099a {
        private C0099a() {
        }
    }

    public static y0 a() {
        return new y0("GET_CURRENT_STATUS_ERROR_DIALOG", new z(new TextLocalisedClause(R$string.salary_switch_assistant_current_request_status_error_title, null, null, 14), new TextLocalisedClause(R$string.salary_switch_assistant_current_request_status_error_description, null, null, 14), new TextLocalisedClause(R$string.salary_switch_assistant_current_request_status_error_primary_button, null, null, 14), new TextLocalisedClause(R$string.salary_switch_assistant_current_request_status_error_secondary_button, null, null, 14), null, null, false, null, null, null, null, null, null, 32724), false, 4);
    }
}
