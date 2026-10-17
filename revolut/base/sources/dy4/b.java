package dy4;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import grl.k9;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import mp.p;
import rp0.l;
import rp0.m;
import rp0.t;
import rp0.y;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public abstract class b {
    public static y a(m.b creditModel, TextLocalisedClause title, TextLocalisedClause textLocalisedClause, p pVar, p pVar2, List list, int i) {
        LargeActionButtonDelegate.Model model;
        LargeActionButtonDelegate.Model model2;
        TextLocalisedClause textLocalisedClause2 = (i & 2) != 0 ? null : textLocalisedClause;
        p pVar3 = (i & 8) != 0 ? null : pVar;
        p pVar4 = (i & 16) != 0 ? null : pVar2;
        List items = (i & 32) != 0 ? f0.f322471a : list;
        Intrinsics.checkNotNullParameter(creditModel, "$this$creditModel");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        t tVar = new t(title, textLocalisedClause2, null, 24);
        List list2 = items;
        if (pVar3 != null) {
            model = new LargeActionButtonDelegate.Model((String) pVar3.f207709b, LargeActionButton.ButtonStyle.f58725a, null, (TextLocalisedClause) pVar3.f207710c, false, null, null, pVar3.d, null, 744);
            yp0.b.r(model, R$attr.uikit_dp16, pVar4 != null ? R$attr.uikit_dp8 : R$attr.uikit_dp24, 0, 0, 12);
        } else {
            model = null;
        }
        if (pVar4 != null) {
            model2 = new LargeActionButtonDelegate.Model((String) pVar4.f207709b, LargeActionButton.ButtonStyle.f58726b, null, (TextLocalisedClause) pVar4.f207710c, false, null, null, pVar4.d, null, 744);
            yp0.b.r(model2, pVar3 != null ? R$attr.uikit_dp8 : R$attr.uikit_dp16, R$attr.uikit_dp24, 0, 0, 12);
        } else {
            model2 = null;
        }
        Object[] elements = {null, model, model2};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return b(creditModel, d0.E0(d.L(elements), list2), tVar, l.WINDOW, null, null, null, 760);
    }

    public static y b(m.b creditModel, List items, t tVar, l lVar, String str, AnalyticsContext analyticsContext, TextLocalisedClause textLocalisedClause, int i) {
        t tVar2 = (i & 2) != 0 ? null : tVar;
        l background = (i & 4) != 0 ? l.WINDOW : lVar;
        String str2 = (i & 128) != 0 ? null : str;
        AnalyticsContext analyticsContext2 = (i & 256) != 0 ? null : analyticsContext;
        TextLocalisedClause textLocalisedClause2 = (i & 512) != 0 ? null : textLocalisedClause;
        Intrinsics.checkNotNullParameter(creditModel, "$this$creditModel");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(background, "background");
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new y(items, tVar2, background, null, null, null, str2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), analyticsContext2, textLocalisedClause2, 128);
    }
}
