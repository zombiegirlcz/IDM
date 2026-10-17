package wok;

import aw0.n6;
import aw0.o9;
import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import wk2.x;

/* JADX INFO: loaded from: classes11.dex */
public final class o implements cli.n {
    public static n6 a(gok.c cVar) {
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton;
        TextClause textClause = new TextClause(cVar.f145182a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        int i = n.f298958a[cVar.f145184c.ordinal()];
        if (i == 1) {
            defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            defaultFilledButton = LargeActionButton.ButtonStyle.f58726b;
        }
        return new n6(textClause, defaultFilledButton, null, null, false, null, cVar.f145183b, 508);
    }

    public static CompositeClause b(gok.d dVar) {
        if (dVar == null) {
            return null;
        }
        String str = dVar.f145185a;
        TextClause textClause = str != null ? new TextClause(str, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124) : null;
        gok.e eVar = dVar.f145186b;
        TextClause[] elements = {textClause, eVar != null ? new TextClause(eVar.f145188b, (Style) new Click(30, (Integer) null, (Object) null, eVar.f145187a, false), Integer.valueOf(R$attr.uikit_colorAccent), false, (o9) null, (List) null, SyslogConstants.LOG_CLOCK) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new CompositeClause(kotlin.collections.d.L(elements), new TextClause(m70.a.o(t0.f186434a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (k) iii.c.f(domainState.f298940a, new x(this, 22), new wm9.k(9), new vjh.c(this, domainState, 29));
    }
}
