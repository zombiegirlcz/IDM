package vne;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.tax_residency.impl.R$string;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.tax_exemption_description, u.c(new TextLocalisedClause(R$string.tax_exemption_description_learn_more, null, new Click(30, (Integer) null, (Object) null, "FAQ_LINK", false), 10)), null, 12);
        return (g) iii.c.f(domainState.f290797a, new aq4.i(6, textLocalisedClause), new aq4.j(3, textLocalisedClause), new vh2.o(this, textLocalisedClause, domainState));
    }
}
