package qc6;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.donations.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import q97.q2;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sc6.a f244574a;

    public i(sc6.a transactionItemMapper) {
        Intrinsics.checkNotNullParameter(transactionItemMapper, "transactionItemMapper");
        this.f244574a = transactionItemMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new c(new TextLocalisedClause(R$string.donations_details_transactions_header_title, null, null, 14), (List) iii.c.g(domainState.f244568a, new qb5.a(24), new q2(28), new qbg.j(this, 1)));
    }
}
