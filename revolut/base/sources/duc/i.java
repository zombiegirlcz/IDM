package duc;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.security_hub.impl.ui.add_to_click_to_pay.AddToClickToPayScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import yji.l;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends oki.h implements g {
    public final AddToClickToPayScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ja3.f f117964p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f117965q;

    public i(n stateMapper, AddToClickToPayScreenContract$InputData inputData, ja3.f cardBitmapDisplayer) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cardBitmapDisplayer, "cardBitmapDisplayer");
        this.o = inputData;
        this.f117964p = cardBitmapDisplayer;
        this.f117965q = mra.d.b(this, new e(inputData.f85505a, new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, rd0.e.b(this.f117964p.c(this.o.f85505a.f150110a)), null, null, new dob.c(this, null, 18), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f117965q;
    }
}
