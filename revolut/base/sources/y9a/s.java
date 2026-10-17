package y9a;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.pix.impl.R$string;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import y99.x;

/* JADX INFO: loaded from: classes5.dex */
public final class s implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static CellDetailsChevronDelegate.Model a() {
        CellDetailsChevronDelegate.Model model = new CellDetailsChevronDelegate.Model("PAST_AUTHORISATIONS_LIST_ID", new TextLocalisedClause(R$string.pix_automatico_recurring_payments_see_past_authorisations, null, null, 14), 0, false, null, null, null, 2044);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (o) iii.c.f(domainState.f311816a, new x(this, 1), new y65.n(this, 11), new y5g.l(this, 2));
    }
}
