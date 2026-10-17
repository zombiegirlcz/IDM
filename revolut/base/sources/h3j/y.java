package h3j;

import android.os.Parcelable;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.retail.feature.beneficiary.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import grl.k9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class y {
    public final dii.a a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.bank_transfer_delete_account_dialog, zhm.u.c(name), null, 12), null, null, null, false, 30);
        aw0.g gVar = new aw0.g(new n6(new TextLocalisedClause(R.string.common_action_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R.string.common_action_delete, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), (Clause) null, (aw0.f) null, 25);
        k9 k9Var = k9.Payments;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new dii.a(aVar, gVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24);
    }
}
