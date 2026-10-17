package kqh;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import koe.x;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class r implements cli.n {
    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        TextLocalisedClause textLocalisedClause;
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        int i = q.f188419a[domainState.f188409a.ordinal()];
        if (i == 1) {
            textLocalisedClause = new TextLocalisedClause(R$string.screener_picker_header_filters_title, null, null, 14);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.screener_picker_header_title, null, null, 14);
        }
        return new m(textLocalisedClause, (List) iii.c.f(domainState.f188410b, new kpj.a(6), new x(24), new kcg.j(domainState, this)));
    }
}
