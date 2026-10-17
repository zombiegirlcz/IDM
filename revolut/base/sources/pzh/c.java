package pzh;

import be5.e;
import com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import pnf.f;
import prl.k;
import vkm.v1;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CryptoOrderDraft f241007l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e f241008m;

    public c(CryptoOrderDraft draft, e delegate) {
        Intrinsics.checkNotNullParameter(draft, "draft");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f241007l = draft;
        this.f241008m = delegate;
    }

    @Override // pzh.a
    public final Flow Z2() {
        return new v1(new k(this, null, 9));
    }

    @Override // pzh.a
    public final void b3(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        V2(new f(this, clickData, null, 28), new yi5.b(29));
    }
}
