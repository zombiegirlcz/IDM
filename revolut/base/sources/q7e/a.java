package q7e;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.retail.common.ui.R$string;
import ip0.tm0;
import ip0.um0;
import k6e.f;
import kotlin.jvm.internal.Intrinsics;
import rp0.t;
import rp0.y;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public abstract class a {
    public static y a(TextLocalisedClause title, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, TextLocalisedClause positiveButton, String str, f fVar, int i) {
        TextLocalisedClause negativeButton = (i & 4) != 0 ? new TextLocalisedClause(R$string.common_action_cancel, null, null, 14) : textLocalisedClause2;
        String listId = (i & 16) != 0 ? "TWIN_HORIZONTAL_BUTTON_LIST_ID" : str;
        f fVar2 = (i & 32) != 0 ? null : fVar;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(negativeButton, "negativeButton");
        Intrinsics.checkNotNullParameter(positiveButton, "positiveButton");
        Intrinsics.checkNotNullParameter(listId, "listId");
        return new y(u.c(new um0(listId, new tm0(LargeActionButton.ButtonStyle.f58726b, null, negativeButton, false, null, null, 56), new tm0(LargeActionButton.ButtonStyle.f58725a, null, positiveButton, false, null, null, 56), (Object) fVar2, (AnalyticsContext) null, (AnalyticsContext) null, 0, 0, 0, 1008)), new t(title, textLocalisedClause, null, 28), null, null, null, null, "CONFIRM_DIALOG_ID", null, null, null, 3836);
    }
}
