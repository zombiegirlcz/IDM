package isf;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.transfer_reasons.api.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import nii.l0;
import nii.y0;
import nii.z;

/* JADX INFO: loaded from: classes9.dex */
public final class d {
    public static y0 a(d dVar) {
        dVar.getClass();
        return new y0("clear_selection_id", new l0(new TextLocalisedClause(R$string.transfer_reasons_clear_selection_title, null, null, 14), new TextLocalisedClause(R$string.transfer_reasons_clear_selection_description, null, null, 14), null, new TextLocalisedClause(R$string.transfer_reasons_clear_selection_continue, null, null, 14), new TextLocalisedClause(R$string.transfer_reasons_clear_selection_go_back, null, null, 14), null, false, null, 996), false, 4);
    }

    public static y0 b(d dVar) {
        dVar.getClass();
        return new y0("transfer_reasons_common_error_id", new z(new TextLocalisedClause(R.string.common_error_something_went_wrong, null, null, 14), new TextLocalisedClause(R.string.error_generic, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 4);
    }
}
