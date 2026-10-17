package vsl;

import cli.y;
import com.revolut.feature.trading_orders.api.ui.details_pager.InvestOrderDetailsPagerFeatureContract$InputData;
import htl.l;
import kotlin.jvm.internal.Intrinsics;
import md6.s;
import org.jetbrains.annotations.NotNull;
import vkm.q;
import vrl.m;

/* JADX INFO: loaded from: classes12.dex */
public final class g extends oki.h implements ali.h {

    @NotNull
    public static final e Companion = new e();
    public final InvestOrderDetailsPagerFeatureContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vrl.g f291850p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l f291851q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f291852r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ali.b f291853s;

    public g(c initialState, i stateMapper, h saveStateDelegate, InvestOrderDetailsPagerFeatureContract$InputData inputData, vrl.g investOrdersInteractor, l commonNavigationProvider) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(saveStateDelegate, "saveStateDelegate");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(investOrdersInteractor, "investOrdersInteractor");
        Intrinsics.checkNotNullParameter(commonNavigationProvider, "commonNavigationProvider");
        this.o = inputData;
        this.f291850p = investOrdersInteractor;
        this.f291851q = commonNavigationProvider;
        this.f291852r = mra.d.b(this, initialState, stateMapper, saveStateDelegate, false, 8);
        this.f291853s = s.b(this, new vh9.b(this, 23));
    }

    @Override // ali.h
    public final ali.b I0() {
        return this.f291853s;
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, c8g.a.D(q.q(((m) this.f291850p).f(this.o.f91745b, w4l.h.f294642c))), null, null, new vrl.d(this, null, 2), 3);
    }

    @Override // ali.h, cli.z
    public final cli.g getState() {
        return this.f291852r;
    }
}
