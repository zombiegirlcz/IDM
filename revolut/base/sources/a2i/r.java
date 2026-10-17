package a2i;

import com.revolut.feature_exchange.impl.ui.exchange.order_summary.OrderSummaryContract$Configuration;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class r implements f {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OrderSummaryContract$Configuration f880a;

    public r(OrderSummaryContract$Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f880a = configuration;
    }
}
