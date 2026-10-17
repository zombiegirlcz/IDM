package n0c;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.rev_points.models.RevPointsTransactionExchangeAmount;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class y implements cli.n {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final whf.n f211008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final thf.m f211009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final thf.d f211010c;
    public final gte.a d;

    public y(whf.n transactionListMapper, thf.m transactionTextResourcesMapper, thf.d transactionIconResourcesMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(transactionListMapper, "transactionListMapper");
        Intrinsics.checkNotNullParameter(transactionTextResourcesMapper, "transactionTextResourcesMapper");
        Intrinsics.checkNotNullParameter(transactionIconResourcesMapper, "transactionIconResourcesMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f211008a = transactionListMapper;
        this.f211009b = transactionTextResourcesMapper;
        this.f211010c = transactionIconResourcesMapper;
        this.d = featureToggleInteractor;
    }

    public static Clause a(RevPointsTransactionExchangeAmount revPointsTransactionExchangeAmount) {
        String str;
        dj0.d dVar;
        return (revPointsTransactionExchangeAmount == null || (dVar = revPointsTransactionExchangeAmount.f84065a) == null) ? (revPointsTransactionExchangeAmount == null || (str = revPointsTransactionExchangeAmount.f84066b) == null) ? new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (n) iii.c.f(domainState.f210981a, new o(this, 1), new v(this), new m88.c(this, domainState, 15));
    }
}
