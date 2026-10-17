package gq2;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.bank_account_switching.api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class o implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static Clause a(h hVar) {
        if (hVar.f145529h < 2) {
            return new TextLocalisedClause(R$string.account_switch_terms_action_accept, null, null, 14);
        }
        List listK = v.k(new TextLocalisedClause(R$string.account_switch_terms_action_accept, null, null, 14), new TextLocalisedClause(R$string.account_switch_terms_action_accept_count, v.k(new TextClause(String.valueOf(hVar.f145528g), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(String.valueOf(hVar.f145529h), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12));
        m70.a.a(t0.f186434a);
        return new CompositeClause(listK, new TextClause(" · ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }

    public static TextClause b(h hVar) {
        String str = hVar.e.f64077b;
        if (str != null) {
            return new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        return null;
    }

    public static TextClause d(h hVar) {
        return new TextClause(hVar.e.f64076a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (k) iii.c.f(domainState.d, new gmk.j(this, domainState), new ghl.c(this, domainState), new gna.i(this, domainState, 5));
    }
}
