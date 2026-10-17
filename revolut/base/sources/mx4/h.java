package mx4;

import aw0.n6;
import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.core.R$string;
import dx4.o1;
import dx4.r1;
import dx4.t1;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h {
    public static n6 c(o1 o1Var, LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton) {
        return new n6(new TextLocalisedClause(R$string.credit_application_constructor_info_action, zhm.u.c(new TextClause(o1Var.f120699a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), defaultFilledButton, null, null, false, null, null, 1020);
    }

    public final aw0.e a(fx4.c actionFooter, boolean z) {
        Intrinsics.checkNotNullParameter(actionFooter, "actionFooter");
        fx4.b bVar = actionFooter.f138721a;
        return new aw0.e(false, bVar != null ? new TextLocalisedClause(R$string.credit_application_constructor_action_footer_disclaimer, zhm.u.c(bVar.f138720a), null, 12) : null, null, new n6(new TextLocalisedClause(R$string.credit_application_constructor_action_footer_primary_button, zhm.u.c(actionFooter.f138722b.f138719a), null, 12), LargeActionButton.ButtonStyle.f58725a, null, null, z, null, null, 988), null, null, 53);
    }

    public final aw0.i b(t1 actionFooter) {
        Clause htmlClause;
        List listK;
        Intrinsics.checkNotNullParameter(actionFooter, "actionFooter");
        n6 n6VarC = c(actionFooter.f120774b, LargeActionButton.ButtonStyle.f58725a);
        o1 o1Var = actionFooter.f120775c;
        ImageClauseTint.Color color = null;
        n6 n6VarC2 = o1Var != null ? c(o1Var, LargeActionButton.ButtonStyle.f58726b) : null;
        String str = actionFooter.d;
        if (str == null) {
            htmlClause = null;
        } else {
            r1 r1Var = actionFooter.e;
            htmlClause = new HtmlClause(0, 30, (Integer) null, (Object) null, str);
            if (r1Var != null) {
                Float fValueOf = Float.valueOf(12.0f);
                int iC = r1Var.f120740a.c();
                int i = g.f210179c[r1Var.f120742c.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    color = new ImageClauseTint.Color(R$attr.uikit_colorAccent);
                }
                ImageClause imageClause = new ImageClause(iC, color, fValueOf, fValueOf, 16);
                int i2 = g.f210178b[r1Var.f120741b.ordinal()];
                if (i2 == 1) {
                    listK = zhm.v.k(imageClause, htmlClause);
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    listK = zhm.v.k(htmlClause, imageClause);
                }
                List list = listK;
                m70.a.t(kotlin.jvm.internal.t0.f186434a);
                htmlClause = new CompositeClause(list, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
            }
        }
        if (n6VarC2 == null) {
            return new aw0.e(false, htmlClause, null, n6VarC, null, null, 53);
        }
        int i3 = g.f210177a[actionFooter.f120773a.ordinal()];
        if (i3 == 1) {
            return new aw0.g(n6VarC, n6VarC2, htmlClause, (aw0.f) null, 17);
        }
        if (i3 == 2) {
            return new aw0.h(false, n6VarC, n6VarC2, htmlClause, null, null, 113);
        }
        throw new NoWhenBranchMatchedException();
    }
}
