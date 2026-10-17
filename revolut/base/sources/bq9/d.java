package bq9;

import android.os.Parcelable;
import aw0.f;
import aw0.g;
import aw0.m6;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.payments.groups.api.R$string;
import grl.k9;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class d {
    public static dii.a a(String itemName) {
        Intrinsics.checkNotNullParameter(itemName, "itemName");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.split_bill_itemize_remove_dialog_title, u.c(itemName), null, 12), null, null, null, false, 30);
        m6 m6Var = n6.Companion;
        g gVar = new g(m6.c(m6Var, new TextLocalisedClause(R$string.split_bill_itemize_remove_dialog_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), m6.c(m6Var, new TextLocalisedClause(R$string.split_bill_itemize_remove_dialog_confirm, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), (Clause) null, (f) null, 25);
        k9 k9Var = k9.Payments;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new dii.a(aVar, gVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24);
    }
}
