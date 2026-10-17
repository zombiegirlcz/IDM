package yc9;

import cli.y;
import com.revolut.core.ui_kit_core.displayers.image.models.TextImage;
import com.revolut.data.model.Data;
import com.revolut.feature.onboarding.impl.revolut_card_ready.screen.RevolutCardReadyScreenContract$InputData;
import efm.r;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import y65.n;
import ybh.a0;
import yji.l;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends oki.h implements dli.b {
    public final RevolutCardReadyScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ja3.f f312575p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final li0.b f312576q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TextImage f312577r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f312578s;

    public g(h stateMapper, RevolutCardReadyScreenContract$InputData inputData, ja3.f cardBitmapDisplayer, li0.b tapAndPayClient) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cardBitmapDisplayer, "cardBitmapDisplayer");
        Intrinsics.checkNotNullParameter(tapAndPayClient, "tapAndPayClient");
        this.o = inputData;
        this.f312575p = cardBitmapDisplayer;
        this.f312576q = tapAndPayClient;
        m70.a.c(t0.f186434a);
        this.f312577r = new TextImage("", 0, 0, 0, 0, 0, 206);
        this.f312578s = mra.d.b(this, new d(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        r map = m70.a.g(this.f312575p.c(this.o.f78577a.f150110a), null, new n(28), 1).map(new ya6.f(new a0(19), 11));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        l.b1(this, rd0.e.b(ue0.e.E(map, this.f312577r)), null, new y83.d(this, (Continuation) null, 12), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f312578s;
    }
}
