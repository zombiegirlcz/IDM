package i6f;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class g0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f158931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.trading.managed_portfolios.impl.ui.details.c f158932b;

    public /* synthetic */ g0(com.revolut.feature.trading.managed_portfolios.impl.ui.details.c cVar, int i) {
        this.f158931a = i;
        this.f158932b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f158931a) {
            case 0:
                od0.i portfolioIdOptional = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(portfolioIdOptional, "portfolioIdOptional");
                String str = (String) portfolioIdOptional.f224257a;
                return str != null ? zjh.f.y(this.f158932b.G, str) : zi0.c.i(zhm.f0.f322471a);
            default:
                x6f.h result = (x6f.h) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                com.revolut.feature.trading.managed_portfolios.impl.ui.details.c cVar = this.f158932b;
                cVar.H2(cVar.I, new i30.a(result, 18));
                return Unit.f186387a;
        }
    }
}
