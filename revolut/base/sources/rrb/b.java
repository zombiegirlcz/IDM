package rrb;

import aii.e;
import aii.g;
import aii.u;
import android.os.Parcelable;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.retail.common.ui.R$string;
import grl.k9;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements ohi.a, nte.a {
    /* JADX WARN: Type inference failed for: r5v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof a)) {
            super.c(descriptor);
            return null;
        }
        a aVar = (a) descriptor;
        lw0.a aVar2 = new lw0.a(aVar.f256747a, aVar.f256748b, null, null, false, 28);
        aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
        k9 k9Var = k9.Wealth;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return aVar.a(new ActionsBottomSheetController(new dii.a(aVar2, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24)));
    }

    @Override // nte.a
    public final List e() {
        return f0.f322471a;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        return null;
    }
}
