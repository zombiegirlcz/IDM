package s4f;

import ble.c1;
import cli.y;
import com.revolut.feature.trading.impl.ui.collections.CollectionScreenContract$Input;
import d9.e1;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import skm.a2;
import vkm.j2;
import vkm.v1;

/* JADX INFO: loaded from: classes8.dex */
public final class x extends oki.h implements dli.b {
    public final CollectionScreenContract$Input o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x8h.g f259870p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final u f259871q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l4f.a f259872r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final aah.h f259873s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ybl.b f259874t;
    public final o5d.a u;
    public final y v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j2 f259875w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Set f259876x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public a2 f259877y;

    public x(cq9.m mapper, CollectionScreenContract$Input input, x8h.g collectionsInteractor, u filteredInstrumentsProvider, l4f.a collectionsNaviCommandProvider, aah.h wealthDisclaimersControllerModelExtension, ybl.b instrumentTickerInteractor, o5d.a swipeAssetTradeActionsExtension) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(collectionsInteractor, "collectionsInteractor");
        Intrinsics.checkNotNullParameter(filteredInstrumentsProvider, "filteredInstrumentsProvider");
        Intrinsics.checkNotNullParameter(collectionsNaviCommandProvider, "collectionsNaviCommandProvider");
        Intrinsics.checkNotNullParameter(wealthDisclaimersControllerModelExtension, "wealthDisclaimersControllerModelExtension");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(swipeAssetTradeActionsExtension, "swipeAssetTradeActionsExtension");
        this.o = input;
        this.f259870p = collectionsInteractor;
        this.f259871q = filteredInstrumentsProvider;
        this.f259872r = collectionsNaviCommandProvider;
        this.f259873s = wealthDisclaimersControllerModelExtension;
        this.f259874t = instrumentTickerInteractor;
        this.u = swipeAssetTradeActionsExtension;
        this.v = mra.d.b(this, new f(0), mapper, null, false, 12);
        this.f259875w = vkm.q.c(null);
    }

    @Override // yji.l
    public final void P1() {
        this.f259876x = null;
    }

    @Override // yji.l
    public final void T1(long j2) {
        v1 v1VarN = e1.N(new rch.o(2, this, x.class, "tillHide", "tillHide(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", 0, 3), rd0.e.b(this.f259870p.b(this.o.f91216a, xzg.o.STOCKS)));
        Continuation continuation = null;
        yji.l.b1(this, yh5.b.d(v1VarN, this.f259875w), null, new w(this, continuation, 0), 3);
        yji.l.b1(this, nim.a.v(this.f259873s.f2828l.w0(), new s4b.e(9)), null, new w(this, continuation, 1), 3);
        yji.l.b1(this, this.u.Z2(new c1(v1VarN, 25)), null, new w(this, continuation, 2), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }
}
