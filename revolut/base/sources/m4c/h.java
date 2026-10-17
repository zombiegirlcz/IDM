package m4c;

import cli.n;
import cli.y;
import com.revolut.feature.revolut_shop.ui.screen.payment_method.PaymentMethodScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends oki.h implements dli.b {

    @NotNull
    public static final g Companion = new g();
    public final y o;

    public h(PaymentMethodScreenContract$InputData inputData, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mra.d.b(this, new d(inputData.f84243b), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}
