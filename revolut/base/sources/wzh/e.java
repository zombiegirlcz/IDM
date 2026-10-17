package wzh;

import cli.g;
import cli.n;
import cli.y;
import com.revolut.feature_crypto_order_flow.impl.order_summary.extensions.price.screen.OrderPriceScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends h implements dli.b {
    public final mre.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f301425p;

    public e(n stateMapper, OrderPriceScreenContract$InputData inputData, mre.c termsNavigationFactory) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        this.o = termsNavigationFactory;
        this.f301425p = mra.d.b(this, new c(inputData.f96795a, inputData.f96796b, inputData.f96797c), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.f301425p;
    }
}
