package q97;

import com.revolut.feature.payments.who_to_transfer.api.transfer.TransferBridgeFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class o1 extends r97.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t97.d f243756b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(t97.c productCellProvider) {
        super(productCellProvider);
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        this.f243756b = t97.d.NEW_PAYMENT;
    }

    @Override // r97.b
    public final p97.b f() {
        return this.f243756b;
    }

    @Override // r97.b
    public final Object g(Continuation continuation) {
        return new o97.l(new FeatureCommand(new TransferBridgeFeatureConfig.NewTransfer(0)));
    }
}
