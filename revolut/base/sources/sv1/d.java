package sv1;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.NoWhenBranchMatchedException;
import mii.k;
import nii.g0;
import nii.j;
import nii.y0;
import nii.z;
import tji.l;
import zz1.e;

/* JADX INFO: loaded from: classes20.dex */
public final class d {
    public static y0 a() {
        return new y0(null, new z(new TextLocalisedClause(R.string.common_error_something_went_wrong, null, null, 14), new TextLocalisedClause(R.string.error_generic, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 5);
    }

    public static l b(e eVar, int i) {
        int i2 = eVar == null ? -1 : c.f265826a[eVar.ordinal()];
        if (i2 != -1) {
            if (i2 == 1) {
                return new k("SUCCESS_SHOT_MODEL_DIALOG_ID", new TextLocalisedClause(i, null, null, 14), null, null, null, 28);
            }
            if (i2 == 2 || i2 == 3) {
                return new y0(null, new g0(new TextLocalisedClause(R$string.apm_registration_pending_dialog_title, null, null, 14), new TextLocalisedClause(R$string.apm_registration_pending_dialog_subtitle, null, null, 14), null, null, null, null, null, j.b.f216170a, false, null, false, null, 16252), false, 5);
            }
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return a();
    }
}
