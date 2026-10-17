package unj;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import nii.e0;
import nii.g0;
import nii.y0;
import nii.z;

/* JADX INFO: loaded from: classes11.dex */
public final class j {
    public static y0 a() {
        return new y0("esimContractGenerationGenericError", new z(new TextLocalisedClause(R.string.common_error_something_went_wrong, null, null, 14), new TextLocalisedClause(R.string.common_action_try_again, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 4);
    }

    public static y0 b() {
        return new y0("esimContractGenerationPending", new g0(new TextLocalisedClause(R$string.esim_statement_in_preparation_title, null, null, 14), new TextLocalisedClause(R$string.esim_statement_in_preparation_subtitle, null, null, 14), null, null, null, null, null, null, false, null, false, null, 16380), false, 4);
    }

    public static y0 c() {
        return new y0("esimNoConnectionError", new e0((Clause) new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_description, null, null, 14), (TextLocalisedClause) null, (Parcelable) null, false, (AnalyticsProduct) null, 1020), false, 4);
    }
}
