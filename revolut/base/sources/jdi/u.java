package jdi;

import com.revolut.feature_rev_points_pocket_impl.network.RevPointsPocketService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class u implements e4m.e {
    public static RevPointsPocketService a(t tVar, ik0.b retrofitFactory, ek.a converterFactory) {
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
        Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(RevPointsPocketService.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
        RevPointsPocketService revPointsPocketService = (RevPointsPocketService) objCreate;
        vc.s.k(revPointsPocketService);
        return revPointsPocketService;
    }
}
