package zka;

import aw0.o9;
import aw0.v1;
import bka.g0;
import bka.j0;
import bka.k0;
import bka.l0;
import com.revolut.core.ui_kit.delegates.LightPromptDelegate;
import com.revolut.core.ui_kit.delegates.t7;
import com.revolut.core.ui_kit.delegates.u7;
import com.revolut.core.ui_kit.delegates.v7;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.media.models.UrlMedia;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h {
    public static LightPromptDelegate.Model a(l0 heroItem, boolean z, String str) {
        v7 u7Var;
        v1 v1Var;
        Intrinsics.checkNotNullParameter(heroItem, "heroItem");
        g0 g0Var = heroItem.f16325a;
        boolean z3 = g0Var.e;
        String str2 = g0Var.f16312a;
        if (z3) {
            u7Var = t7.f54744a;
        } else {
            k0 k0Var = g0Var.f16315g;
            j0 j0Var = k0Var != null ? k0Var.f16323a : null;
            int i = j0Var == null ? -1 : g.f322932a[j0Var.ordinal()];
            if (i == -1) {
                v1Var = v1.LIGHT;
            } else if (i == 1) {
                v1Var = v1.DARK;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                v1Var = v1.LIGHT;
            }
            u7Var = new u7(v1Var);
        }
        v7 v7Var = u7Var;
        String strQ = str == null ? j6.a.q("HeroItem_", str2) : str;
        TextClause textClause = str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
        String str3 = g0Var.f16313b;
        LightPromptDelegate.Model model = new LightPromptDelegate.Model(strQ, textClause, str3 != null ? new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, new UrlMedia(g0Var.f), z, v7Var);
        if (!g0Var.e) {
            yp0.b.l(model, R$attr.uikit_dp0, R$attr.uikit_dp16, 0, 0, null, false, 60);
            return model;
        }
        int i2 = R$attr.uikit_dp0;
        yp0.b.r(model, i2, i2, 0, 0, 12);
        return model;
    }
}
