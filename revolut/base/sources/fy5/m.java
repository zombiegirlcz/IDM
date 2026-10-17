package fy5;

import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.cryptocommodity_invest.impl.ui.collections_v2.collection_details.CryptoCollectionDetailsController;
import com.revolut.feature.cryptocommodity_invest.impl.ui.collections_v2.collection_details.CryptoCollectionDetailsControllerContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.q;
import xzg.o;
import yji.n;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d f138925m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final CryptoCollectionDetailsControllerContract$InputData f138926n;
    public final jy5.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x8h.g f138927p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f138928q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final jy5.d f138929r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a f138930s;

    public m(d view, CryptoCollectionDetailsControllerContract$InputData inputData, jy5.a chartInteractor, x8h.g collectionsInteractor, b mapper, jy5.d chartPerformanceInteractor) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(chartInteractor, "chartInteractor");
        Intrinsics.checkNotNullParameter(collectionsInteractor, "collectionsInteractor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(chartPerformanceInteractor, "chartPerformanceInteractor");
        this.f138925m = view;
        this.f138926n = inputData;
        this.o = chartInteractor;
        this.f138927p = collectionsInteractor;
        this.f138928q = mapper;
        this.f138929r = chartPerformanceInteractor;
        jy5.b bVar = (jy5.b) chartInteractor;
        this.f138930s = new a((qta.f) bVar.f179327a.f147831a.getValue(), (od0.i) bVar.f179327a.f147832b.getValue(), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // yji.n
    public final void H2() {
        CryptoCollectionDetailsController cryptoCollectionDetailsController = (CryptoCollectionDetailsController) this.f138925m;
        Continuation continuation = null;
        n.l2(this, rd0.e.b(((FixedTabsDelegate) cryptoCollectionDetailsController.P.getValue()).f52339c.f121375b), null, new f(this, continuation, 2), 3);
        n.l2(this, rd0.e.b(((TrendViewDelegate) cryptoCollectionDetailsController.S.getValue()).r()), null, new l(this, null), 3);
        n.l2(this, rd0.e.b(this.f138927p.b(this.f138926n.f71594a, o.CRYPTO)), null, new f(this, continuation, 1), 3);
        jy5.b bVar = (jy5.b) this.o;
        n.l2(this, q.Q(bVar.f179327a.f147831a, new f5h.b(continuation, this, 17)), null, new f(this, continuation, 0), 3);
        n.l2(this, bVar.f179327a.f147832b, null, new k(this, null), 3);
    }

    @Override // cki.a
    public final Object Z2() {
        return this.f138930s;
    }

    @Override // fy5.c
    public final i e3() {
        return new i(c3(), this, 0);
    }

    @Override // fy5.c
    public final Flow f3() {
        return new i(c3(), this, 1);
    }
}
