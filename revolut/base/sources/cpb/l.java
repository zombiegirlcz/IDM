package cpb;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements n {
    public static koi.j a(String str, boolean z) {
        t0 t0Var = t0.f186434a;
        m70.a.c(t0Var);
        TextClause textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        InputTextDelegate.Model model = new InputTextDelegate.Model("NAME_EDIT_DELEGATE_MODEL_ID", new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), textClause, null, null, true, 40, false, !z, 0, true, 0, true, true, true, m72.b.u(40), false, false, 0, false, z, null, 855195508, 130943);
        int i = R$attr.uikit_dp16;
        yp0.b.l(model, i, i, i, i, null, false, 48);
        return model;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (i) iii.c.f(domainState.f107915b, new com.revolut.feature.alipay_plus.mpm.webcontainer.a(this, 16), new clk.b(17), new cf1.h(this, domainState, 8));
    }
}
