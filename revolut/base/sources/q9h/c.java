package q9h;

import efm.r;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import q0h.i;
import q2g.h;
import q56.o;
import xzg.e0;
import xzg.w;
import xzg.x;
import xzg.y;
import xzg.z;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final su9.c f243896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d9h.a f243897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e9h.d f243898c;

    public c(su9.c mostTradedAssetsInteractor, d9h.a mostTradedAssetsRateProvider, e9h.d performanceAssetsTransformer) {
        Intrinsics.checkNotNullParameter(mostTradedAssetsInteractor, "mostTradedAssetsInteractor");
        Intrinsics.checkNotNullParameter(mostTradedAssetsRateProvider, "mostTradedAssetsRateProvider");
        Intrinsics.checkNotNullParameter(performanceAssetsTransformer, "performanceAssetsTransformer");
        this.f243896a = mostTradedAssetsInteractor;
        this.f243897b = mostTradedAssetsRateProvider;
        this.f243898c = performanceAssetsTransformer;
    }

    public final r a(i config) {
        z yVar;
        Intrinsics.checkNotNullParameter(config, "config");
        int i = d.f243899a[config.a().ordinal()];
        if (i == 1) {
            yVar = new y(null);
        } else if (i == 2) {
            yVar = new y(x.CFD);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            yVar = w.f310036a;
        }
        return pd.b.r(nim.a.w(this.f243896a.i(yVar, czi.c.g(config.c()), config.a() == q0h.e.CFD ? e0.IGNORE_EMPTY : e0.ALLOW_EMPTY), new o(config, 28)), new h(config, this, 9));
    }
}
