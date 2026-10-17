package rx5;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru5.m;
import ru6.r;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements n {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ny5.e f258035a;

    public k(ny5.e rateTilesMapper) {
        Intrinsics.checkNotNullParameter(rateTilesMapper, "rateTilesMapper");
        this.f258035a = rateTilesMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        TextLocalisedClause textLocalisedClause;
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) iii.c.f(domainState.f258026b, new r(19), new m(17), new rbe.c(this, domainState, 17));
        int i = j.f258034a[domainState.f258025a.ordinal()];
        if (i == 1) {
            textLocalisedClause = new TextLocalisedClause(R$string.wealth_trading_topMovers_filters_timeSpan_oneDay, null, null, 14);
        } else if (i == 2) {
            textLocalisedClause = new TextLocalisedClause(R$string.wealth_trading_topMovers_filters_timeSpan_oneWeek, null, null, 14);
        } else if (i == 3) {
            textLocalisedClause = new TextLocalisedClause(R$string.wealth_trading_topMovers_filters_timeSpan_oneMonth, null, null, 14);
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.wealth_trading_topMovers_filters_timeSpan_oneYear, null, null, 14);
        }
        return new c(textLocalisedClause, list);
    }
}
