package com.revolut.feature.rev_points.api.navigation;

import com.revolut.feature.rev_points.api.navigation.RevPointsOptInNextDestination;
import com.revolut.feature.rev_points.models.RevPointsOptInSource;
import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import nyb.o;
import ufm.i;

/* JADX INFO: loaded from: classes6.dex */
public interface a {
    static i a(a aVar, RevPointsOptInSource optInSource) {
        qyb.a aVar2 = (qyb.a) aVar;
        aVar2.getClass();
        RevPointsOptInNextDestination.Default optInNextDestination = RevPointsOptInNextDestination.Default.f83526a;
        Intrinsics.checkNotNullParameter(optInNextDestination, "optInNextDestination");
        Intrinsics.checkNotNullParameter(optInSource, "optInSource");
        d0 d0VarE = ((o) aVar2.f250267a).e(false);
        qsa.a aVar3 = new qsa.a(19, new qpb.a(optInSource, optInNextDestination, 24));
        d0VarE.getClass();
        i iVar = new i(d0VarE, aVar3, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
