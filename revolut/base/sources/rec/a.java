package rec;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.revolutpay.shared.R$string;
import nii.y0;
import nii.z;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    @NotNull
    public static final C1400a Companion = new C1400a();

    /* JADX INFO: renamed from: rec.a$a, reason: collision with other inner class name */
    public static final class C1400a {
        private C1400a() {
        }
    }

    public static y0 a() {
        return new y0("FAILURE_LOADING_DIALOG_ID", new z(new TextLocalisedClause(R$string.revolut_pay_common_error_widget_title, null, null, 14), new TextLocalisedClause(R$string.revolut_pay_common_loading_error_subtitle, null, null, 14), new TextLocalisedClause(R$string.revolut_pay_common_error_widget_retry, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4);
    }
}
