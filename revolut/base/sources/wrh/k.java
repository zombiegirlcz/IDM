package wrh;

import com.revolut.feature.web_sign_in.ui.screen.confirmation.WebSignInConfirmationScreenContract$InputData;
import java.util.concurrent.TimeUnit;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import pfm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class k extends bji.b implements g {
    public final long u;
    public final e v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(WebSignInConfirmationScreenContract$InputData inputData, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        long jCurrentTimeMillis = inputData.e - System.currentTimeMillis();
        this.u = jCurrentTimeMillis;
        this.v = new e(jCurrentTimeMillis, inputData);
    }

    @Override // yji.l
    public final void I1() {
        w wVarA = efm.b.A(this.u, TimeUnit.MILLISECONDS, hhm.f.f152430b);
        Intrinsics.checkNotNullExpressionValue(wVarA, "timer(...)");
        zii.i.G(this, wVarA, new wp0.b(this, 5), null, 4);
    }

    @Override // bji.b, jki.g
    public final jki.i r2() {
        return this.v;
    }
}
