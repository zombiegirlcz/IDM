package qyb;

import com.revolut.feature.rev_points.api.navigation.RevPointsOptInNextDestination;
import com.revolut.feature.rev_points.models.RevPointsOptInSource;
import efm.d0;
import eub.i;
import kotlin.jvm.internal.Intrinsics;
import nyb.o;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements com.revolut.feature.rev_points.api.navigation.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f250267a;

    public a(i revPointsOptInInteractor) {
        Intrinsics.checkNotNullParameter(revPointsOptInInteractor, "revPointsOptInInteractor");
        this.f250267a = revPointsOptInInteractor;
    }

    public final ufm.i b(RevPointsOptInSource optInSource) {
        Intrinsics.checkNotNullParameter(optInSource, "optInSource");
        d0 d0VarE = ((o) this.f250267a).e(false);
        qsa.a aVar = new qsa.a(19, new qpb.a(optInSource, RevPointsOptInNextDestination.Default.f83526a, 24));
        d0VarE.getClass();
        ufm.i iVar = new ufm.i(d0VarE, aVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        ufm.i iVar2 = new ufm.i(iVar, new qsa.a(18, new qwd.o(28)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
        return iVar2;
    }
}
