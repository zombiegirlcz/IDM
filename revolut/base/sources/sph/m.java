package sph;

import android.os.Parcelable;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.wealth_discovery.impl.screener.domain.model.ScreenerFilterInfo;
import com.revolut.retail.wealth.resources.R$string;
import grl.k9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class m {
    public static dii.a a(ScreenerFilterInfo.Dialog dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        lw0.a aVar = new lw0.a(dialog.f96159a, dialog.f96160b, null, null, false, 28);
        Clause clause = dialog.f96161c;
        dii.i iVar = clause != null ? new dii.i(clause) : null;
        aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.screener_info_dialog_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 53);
        k9 k9Var = k9.Wealth;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new dii.a(aVar, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, iVar, 8);
    }
}
