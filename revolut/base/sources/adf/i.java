package adf;

import a2f.q;
import a9d.p;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.trading_asset_quotes.impl.R$string;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements n {
    @Override // cli.n
    public final o c(j jVar) {
        cii.b bVar;
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f3328b;
        return (data == null || (bVar = (cii.b) iii.c.f(data, new a9h.b(this, 28), new p(16), new q(this, domainState, 9))) == null) ? new cii.b(null, f0.f322471a, new lw0.a(new TextLocalisedClause(R$string.trading_asset_quotes_total_exchange_fees_title, null, null, 14), null, null, null, false, 30)) : bVar;
    }
}
