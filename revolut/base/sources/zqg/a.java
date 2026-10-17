package zqg;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.ResourceId;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.vaults.R$string;
import dj0.d;
import hpg.b;
import kotlin.jvm.internal.Intrinsics;
import nii.z;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements b {
    public final z a(d limit, d limitLeft) {
        Intrinsics.checkNotNullParameter(limit, "limit");
        Intrinsics.checkNotNullParameter(limitLeft, "limitLeft");
        return new z(new TextLocalisedClause(R$string.vaults_us_crb_one_off_maxmimum_amount_limit_reached_title, null, null, 14), new TextLocalisedClause(new ResourceId.IntResourceId(com.revolut.core.strings_provider.R$string.error_api_11125), v.k(new MoneyClause(limit, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new MoneyClause(limitLeft, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), (Style) null, (Clause) null, 12), null, null, null, null, false, null, null, null, null, null, null, 32764);
    }
}
