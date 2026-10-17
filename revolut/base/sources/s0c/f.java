package s0c;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.feature.rev_points.impl.ui.transactions.related.RevPointsRelatedTransactionsBottomSheetControllerContract$InputData;
import fub.k;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lw0.m;
import ryd.l;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsRelatedTransactionsBottomSheetControllerContract$InputData f258936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f258937b;

    public f(RevPointsRelatedTransactionsBottomSheetControllerContract$InputData inputData, k revPointsTransactionMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(revPointsTransactionMapper, "revPointsTransactionMapper");
        this.f258936a = inputData;
        this.f258937b = revPointsTransactionMapper;
    }

    @Override // cli.n
    public final o c(j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        int i = 21;
        return new cii.b(null, (List) iii.c.f(domainState.f258927a, new ryd.k(23), new l(22), new rbe.c(domainState, this, i)), (m) iii.c.f(domainState.f258927a, new ryd.k(22), new l(i), new ri4.o(domainState, 20)));
    }
}
