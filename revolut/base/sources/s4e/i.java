package s4e;

import ael.d0;
import com.revolut.feature.structured_note.details.impl.ui.screens.about_issuer.AboutIssuerScreenContract$Destination;
import com.revolut.feature.structured_note.details.impl.ui.screens.about_issuer.AboutIssuerScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f259840l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d0 f259841m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final vki.a f259842n;

    public i(e inputData, d0 stocksInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stocksInteractor, "stocksInteractor");
        this.f259840l = inputData;
        this.f259841m = stocksInteractor;
        this.f259842n = pyd.c.a(this, new d(null));
    }

    @Override // yji.n
    public final void H2() {
        V2(new s1k.b(this, null, 6), new yi5.b(29));
    }

    @Override // s4e.b
    public final void Z2() {
        A2(new AboutIssuerScreenContract$Destination(new AboutIssuerScreenContract$InputData(this.f259840l.f259837a)));
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.f259842n;
    }
}
