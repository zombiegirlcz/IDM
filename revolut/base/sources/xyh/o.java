package xyh;

import cli.y;
import com.revolut.feature_crypto_order_flow.impl.exchange.extensions.dialog.OrderTypeDialogContract$Input;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class o extends oki.h implements e {
    public final czh.l o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f309735p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f309736q;

    public o(OrderTypeDialogContract$Input input, m stateMapper, czh.l takeProfitStopLossUpdateProvider) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(takeProfitStopLossUpdateProvider, "takeProfitStopLossUpdateProvider");
        this.o = takeProfitStopLossUpdateProvider;
        wd6.h hVar = input.f96753a;
        boolean z = input.f96754b;
        boolean z3 = input.f;
        this.f309735p = mra.d.b(this, new b(hVar, z, input.f96755c, input.d, input.e, z3, input.f96756g), stateMapper, null, false, 12);
        this.f309736q = hx7.e.a(this, new xx9.e(23));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f309736q;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f309735p;
    }
}
