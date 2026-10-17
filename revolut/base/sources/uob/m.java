package uob;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.retail.savings.api.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m implements n {
    public static TextLocalisedClause a(ncd.d dVar) {
        int i = l.f281602a[dVar.ordinal()];
        if (i == 1) {
            return new TextLocalisedClause(R$string.savings_mmf_sheets_next_interest_payment_title, null, null, 14);
        }
        if (i == 2) {
            return new TextLocalisedClause(R$string.savings_mmf_sheets_next_return_payment_title, null, null, 14);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (i) iii.c.f(domainState.f281595a, new umc.c(this, 15), new uj8.j(23), new u3b.h(this, 21));
    }
}
