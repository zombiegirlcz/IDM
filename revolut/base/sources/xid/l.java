package xid;

import bbg.c0;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.shops.api.declaration.ShopsApi$Toggles$AuctionsCustomBid;
import com.revolut.feature.shops.impl.ui.bid_screen.ShopsItemsBidScreenContract$InputData;
import jid.p;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.q;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class l extends oki.h implements h {
    public final ShopsItemsBidScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p f306337p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final wid.c f306338q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.b f306339r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f306340s;

    public l(ShopsItemsBidScreenContract$InputData inputData, p interactor, wid.c auctionCountdownTicker, cli.n stateMapper, h4g.g shopsFeatureAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(auctionCountdownTicker, "auctionCountdownTicker");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(shopsFeatureAvailabilityInteractor, "shopsFeatureAvailabilityInteractor");
        this.o = inputData;
        this.f306337p = interactor;
        this.f306338q = auctionCountdownTicker;
        this.f306339r = new vii.b();
        this.f306340s = mra.d.b(this, new c(((jte.d) shopsFeatureAvailabilityInteractor.f149364a).c(ShopsApi$Toggles$AuctionsCustomBid.f86996c), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), null, f0.f322471a, 0L), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, q.Q(this.f306339r, new x18.e((Continuation) null, this, 11)), null, null, new i(this, null), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        Flow nearestEndTimeFlow = this.f306340s.B(new xd2.n(27));
        wid.c cVar = this.f306338q;
        Continuation continuation = null;
        yji.l.b1(this, cVar.a(nearestEndTimeFlow), null, new x64.b(this, continuation, 26), 3);
        Intrinsics.checkNotNullParameter(nearestEndTimeFlow, "nearestEndTimeFlow");
        yji.l.b1(this, q.Q(q.q(nearestEndTimeFlow), new c0(continuation, false, (Object) cVar, 8)), null, new x0f.g(this, continuation, 20), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f306340s;
    }
}
