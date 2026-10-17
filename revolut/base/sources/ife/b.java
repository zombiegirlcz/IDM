package ife;

import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import k7c.d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements cal.a {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q06.d f161005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e8c.a f161006b;

    public b(q06.d deeplinkParser, e8c.a revolutPayFlowProvider) {
        Intrinsics.checkNotNullParameter(deeplinkParser, "deeplinkParser");
        Intrinsics.checkNotNullParameter(revolutPayFlowProvider, "revolutPayFlowProvider");
        this.f161005a = deeplinkParser;
        this.f161006b = revolutPayFlowProvider;
    }

    public final BridgeDestination a(String transactionId, boolean z) {
        d0 d0Var = this.f161006b.f123630a;
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        if (!z || !Intrinsics.f(d0Var.f181950a.get("PENDING_PAYMENT_TOKEN_EXISTS_MEMORY_CACHE_ID"), Boolean.TRUE)) {
            return new BridgeDestination(com.revolut.retail.core.navigation.a.c(new FinishCommand(-1, null, null, 6), new FeatureCommand(new TransactionsFeatureConfig.Details(new k71.c(transactionId), null, null, null, 126))));
        }
        d0Var.f181950a.remove("PENDING_PAYMENT_TOKEN_EXISTS_MEMORY_CACHE_ID");
        return new BridgeDestination(new FinishCommand(-1, null, null, 6));
    }
}
