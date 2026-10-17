package p7f;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class q implements cli.n {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r7f.b f233770a;

    public q(r7f.b investorUpdateSectionMapper) {
        Intrinsics.checkNotNullParameter(investorUpdateSectionMapper, "investorUpdateSectionMapper");
        this.f233770a = investorUpdateSectionMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        n nVar;
        i domainState = (i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f233762a;
        return (data == null || (nVar = (n) iii.c.f(data, new p5a.m(this, 11), new p4a.g(this, 20), new p40.n(this, 3))) == null) ? new n(new k(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.wealth_robo_investor_update_strategy_report_title, null, null, 14)), f0.f322471a) : nVar;
    }
}
