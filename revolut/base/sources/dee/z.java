package dee;

import com.revolut.data.model.Data;
import com.revolut.feature.support.impl.transfer_tracker.ui.inbound_swift_transfer_status.InboundSwiftTransferStatusScreenContract$InputData;
import dee.o;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class z extends oki.h implements q {
    public final InboundSwiftTransferStatusScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final sde.e f113429p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final wsg.b f113430q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final cli.y f113431r;

    public z(cli.n stateMapper, InboundSwiftTransferStatusScreenContract$InputData inputData, sde.e transferTrackerInteractor, wsg.b walletsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(transferTrackerInteractor, "transferTrackerInteractor");
        Intrinsics.checkNotNullParameter(walletsInteractor, "walletsInteractor");
        this.o = inputData;
        this.f113429p = transferTrackerInteractor;
        this.f113430q = walletsInteractor;
        this.f113431r = mra.d.b(this, new n(new Data(null, null, true, 3, null), null, null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        int i = 26;
        l2(new t(3, this, continuation), new yi5.b(i));
        l2(new t(2, this, continuation), new yi5.b(i));
        l2(new t(1, this, continuation), new yi5.b(26));
    }

    public final void I2(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        String str = clickData.f275445a;
        if (Intrinsics.f(str, "LEARN_MORE_CLICK_ID")) {
            C2(o.b.f113417a);
            return;
        }
        Continuation continuation = null;
        if (Intrinsics.f(str, "SEE_ACCOUNT_DETAILS_CLICK_ID")) {
            n2(new t(0, this, continuation), new whi.b(6));
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("InboundSwiftTransferStatus: Unexpected text clause click id: ", clickData.f275445a));
        zhm.h0 h0Var = zhm.h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f113431r;
    }
}
