package i7g;

import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.travel.flights.api.R$string;
import i2l.n0;
import i6j.p;
import i6j.q;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import l7g.b0;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements n {

    @NotNull
    private static final h Companion = new h();

    public i(k7g.a itemMapper) {
        Intrinsics.checkNotNullParameter(itemMapper, "itemMapper");
    }

    @Override // cli.n
    public final o c(j jVar) {
        l7g.o oVar;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.travel_flights_ticket_rules_title, null, null, 14);
        b0 b0Var = (b0) domainState.f159294b.getContent();
        String str = (b0Var == null || (oVar = b0Var.f192592m) == null) ? null : oVar.f192629a.f192626a;
        return new f(new a(str != null ? new CompositeClause(v.k(new TextLocalisedClause(R$string.travel_flights_ticket_rules_fare, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new DotDividerClause((Integer) null), null, null, 12) : null, textLocalisedClause), (List) iii.c.f(domainState.f159294b, new p(this, 7), new n0(29), new q(this, 1)));
    }
}
