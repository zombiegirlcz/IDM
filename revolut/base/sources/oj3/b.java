package oj3;

import android.os.Parcelable;
import cli.g;
import cli.k;
import cli.y;
import cli.z;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.common.R$string;
import mra.d;
import nii.e0;
import nii.y0;
import oki.h;
import yji.l;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends h implements z {
    public final y o = d.b(this, k.f25028a, new a54.b(22), null, false, 12);

    @Override // yji.l
    public final void I1() {
        l.a1(this, X1(new y0(null, new e0((Clause) new TextLocalisedClause(R$string.common_offline_state_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.common_offline_state_description, null, null, 14), new TextLocalisedClause(com.revolut.error_handling.R$string.common_action_got_it, null, null, 14), (Parcelable) null, false, (AnalyticsProduct) null, 1012), false, 5)), null, null, new ocb.d(this, null, 8), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.o;
    }
}
