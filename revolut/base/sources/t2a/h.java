package t2a;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.payments.transfers.personalisation.impl.R$string;
import kotlin.jvm.internal.Intrinsics;
import mx0.q3;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements n {
    @Override // cli.n
    public final o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new g(new com.revolut.core.ui_kit.views.navbar.d(v.k(new q3(new TextLocalisedClause(R$string.payments_transfers_personalisation_tab_style, null, null, 14), e.STYLE.getId()), new q3(new TextLocalisedClause(R$string.payments_transfers_personalisation_tab_gif, null, null, 14), e.GIF.getId())), domainState.f267521a, false));
    }
}
