package e85;

import aw0.m6;
import aw0.n6;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.credit.core.R$string;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class r implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w80.b f123597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f123598b;

    public r(w80.b amountFormatter, gte.a featureToggleInteractor, s amountValidator, q footerMapper) {
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(amountValidator, "amountValidator");
        Intrinsics.checkNotNullParameter(footerMapper, "footerMapper");
        this.f123597a = amountFormatter;
        this.f123598b = featureToggleInteractor;
    }

    public static aw0.e a(Clause clause, boolean z) {
        return new aw0.e(false, clause, null, m6.c(n6.Companion, new TextLocalisedClause(R$string.credit_common_continue, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, z, null, null, null, 988), null, null, 53);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (l) iii.c.f(domainState.f123582b, new e4k.f(this, 24), new e6e.a(this, 2), new dn8.k(this, domainState, 12));
    }
}
