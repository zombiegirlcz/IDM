package mx4;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ms0.h4;
import ms0.j4;

/* JADX INFO: loaded from: classes22.dex */
public final class a {
    public static List a(dx4.m item) {
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f120670a;
        h4 h4Var = h4.SEMIACCENT;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_application_constructor_action_button_title, zhm.u.c(item.f120671b), null, 12);
        dx4.a1 a1Var = item.f120672c;
        Image imageT1 = a1Var != null ? a1Var.T1() : null;
        com.google.protobuf.w0 w0VarA = zw4.a.a(item.f120670a);
        dx4.l lVar = item.d;
        int i = R$attr.uikit_dp8;
        int i2 = R$attr.uikit_dp16;
        return zhm.u.c(new SmallActionButtonDelegate.Model(str, h4Var, imageT1, null, textLocalisedClause, null, j4.f208300a, lVar, new AnalyticsContext(w0VarA), i, i2, i2, i2, 344));
    }
}
