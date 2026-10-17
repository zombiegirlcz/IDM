package q97;

import com.revolut.feature.topup_screen.api.config.TopUpConfig;
import com.revolut.feature.topup_screen.api.destination.InitTopUpDestination;
import com.revolut.feature.topup_screen.common.TopUpTarget;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k3 extends r97.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t97.d f243726b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(t97.c productCellProvider) {
        super(productCellProvider);
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        this.f243726b = t97.d.TOP_UP;
    }

    @Override // r97.b
    public final p97.b f() {
        return this.f243726b;
    }

    @Override // r97.b
    public final Object g(Continuation continuation) {
        return new o97.d(new InitTopUpDestination(TopUpConfig.Companion.c(TopUpConfig.INSTANCE, null, null, TopUpTarget.Main.f90573a, null, 27)));
    }
}
