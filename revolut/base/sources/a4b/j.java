package a4b;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.cfd.impl.flows.order.CfdOrderData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b4b.p f1243a;

    public j(b4b.p inputData, l4i.a amountConverter) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        this.f1243a = inputData;
    }

    public final r a(Data orderLimits, Data unrealisedPerformance, Data portfolio, Data marginQuote, CfdOrderData cfdOrderData, boolean z) {
        Intrinsics.checkNotNullParameter(orderLimits, "orderLimits");
        Intrinsics.checkNotNullParameter(unrealisedPerformance, "unrealisedPerformance");
        Intrinsics.checkNotNullParameter(portfolio, "portfolio");
        Intrinsics.checkNotNullParameter(marginQuote, "marginQuote");
        Intrinsics.checkNotNullParameter(cfdOrderData, "cfdOrderData");
        return (r) iii.c.f(t1.v(orderLimits, unrealisedPerformance, portfolio, marginQuote), new a35.b(19), new a08.n(24), new i(this, cfdOrderData, z, 0));
    }
}
