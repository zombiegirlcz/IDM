package z4i;

import com.revolut.feature_market_data_impl.ui.breakdown.kompot.screens.transaction.TransactionBreakdownScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import l5i.q;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransactionBreakdownScreenContract$InputData f319385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f319386b;

    public b(TransactionBreakdownScreenContract$InputData inputData, q mapperProvider, y4i.b quoteExtraDataResolver) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(mapperProvider, "mapperProvider");
        Intrinsics.checkNotNullParameter(quoteExtraDataResolver, "quoteExtraDataResolver");
        this.f319385a = inputData;
        this.f319386b = mapperProvider;
    }
}
