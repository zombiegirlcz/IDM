package fx6;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.freelancer.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements n {
    public static MoneyClause a(long j2, String str) {
        xi0.b.Companion.getClass();
        return new MoneyClause(new dj0.d(j2, xi0.a.a(str)), new MoneyClause.Format.Shorts(false, 63), null, null, 12);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new g(new TextLocalisedClause(R$string.freelancer_annual_inbound_volume_header_title, null, null, 14), new TextLocalisedClause(R$string.freelancer_common_action_continue, null, null, 14), (List) iii.c.f(domainState.f138748a, new fwf.n(5), new fv0.c(7), new fnk.o(this, domainState, 8)), domainState.f138749b != null);
    }
}
