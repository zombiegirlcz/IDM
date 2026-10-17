package z0k;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.marketnews.impl.ui.instrument_news_controller.InstrumentNewsControllerContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import yy9.s;

/* JADX INFO: loaded from: classes11.dex */
public final class o extends oki.h implements j {
    public final InstrumentNewsControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final puk.d f318637p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ybl.b f318638q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final aah.h f318639r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final m0k.e f318640s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f318641t;

    public o(InstrumentNewsControllerContract$InputData inputData, kxk.o stateMapper, puk.d instrumentNewsNavigationInterceptor, ybl.b instrumentTickerInteractor, aah.h wealthDisclaimersControllerModelExtension, m0k.e wealthNewsInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(instrumentNewsNavigationInterceptor, "instrumentNewsNavigationInterceptor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(wealthDisclaimersControllerModelExtension, "wealthDisclaimersControllerModelExtension");
        Intrinsics.checkNotNullParameter(wealthNewsInteractor, "wealthNewsInteractor");
        this.o = inputData;
        this.f318637p = instrumentNewsNavigationInterceptor;
        this.f318638q = instrumentTickerInteractor;
        this.f318639r = wealthDisclaimersControllerModelExtension;
        this.f318640s = wealthNewsInteractor;
        this.f318641t = mra.d.b(this, new k(new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        InstrumentNewsControllerContract$InputData instrumentNewsControllerContract$InputData = this.o;
        String str = instrumentNewsControllerContract$InputData.f101857a;
        yji.l.b1(this, rd0.e.b(m0k.e.a(this.f318640s, instrumentNewsControllerContract$InputData.f101858b, str, null, true)), null, new m(this, null, 1), 3);
        n2(new n(this, null, 0), new whi.b(6));
        yji.l.b1(this, nim.a.v(this.f318639r.f2828l.w0(), new s(26)), null, new m(this, null, 0), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f318641t;
    }
}
