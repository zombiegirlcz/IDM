package rc0;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import grl.k9;
import grl.od;
import grl.q6;
import grl.w2;
import grl.x0;
import no.m;

/* JADX INFO: loaded from: classes19.dex */
public abstract class a implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsProduct.Shared f253184a = new AnalyticsProduct.Shared(k9.Forms, x0.Forms, q6.Forms, w2.Forms, od.Terminal);

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getX() {
        AnalyticsProduct analyticsProductA = a();
        return analyticsProductA == null ? this.f253184a : analyticsProductA;
    }

    public abstract AnalyticsProduct a();
}
