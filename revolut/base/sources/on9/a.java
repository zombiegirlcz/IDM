package on9;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.payinstore.impl.R$string;
import nii.y0;
import nii.z;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    @NotNull
    public static final C1257a Companion = new C1257a();

    /* JADX INFO: renamed from: on9.a$a, reason: collision with other inner class name */
    public static final class C1257a {
        private C1257a() {
        }
    }

    public static y0 a() {
        return new y0("REJECTING_PAYMENT_DIALOG_ID", new z(new TextLocalisedClause(R$string.retail_pay_in_store_common_error_title, null, null, 14), new TextLocalisedClause(R$string.retail_pay_in_store_flow_payment_screen_payment_status_error_subtitle, null, null, 14), null, null, null, null, true, null, null, null, null, null, null, 32508), false, 4);
    }
}
