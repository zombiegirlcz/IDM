package k0h;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.global_markets.impl.ui.screen.index_overview.IndexOverviewScreen;
import efm.r;
import jyk.d0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import u3a.q;
import u4e.i;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public interface g extends rri.a {
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    default r u0() {
        IndexOverviewScreen indexOverviewScreen = (IndexOverviewScreen) this;
        ihm.f fVar = indexOverviewScreen.T.d;
        ihm.f fVar2 = indexOverviewScreen.R.f52707c;
        ihm.f fVar3 = indexOverviewScreen.S.d.f121375b;
        ihm.f fVar4 = ((RowDelegate) indexOverviewScreen.N.getValue()).f53218h;
        r map = indexOverviewScreen.U.f.map(new q(new i(28), 17));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        r rVarMerge = r.merge(v.k(fVar, fVar2, fVar3, fVar4, map));
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        return w.a0(rVarMerge, new d0(22));
    }
}
