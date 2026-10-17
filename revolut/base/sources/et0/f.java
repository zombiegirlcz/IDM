package et0;

import android.content.Context;
import android.view.View;
import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f {
    private f() {
    }

    public static void a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ty0.c cVarB0 = or0.u.k(view).b0();
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.common_accessibility_label_media, null, null, 14);
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        view.setContentDescription(ty0.c.a(cVarB0, textLocalisedClause, context, null, null, null, null, Constants.TAG_FC_SPEED_MODE));
    }
}
