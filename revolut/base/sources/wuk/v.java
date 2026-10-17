package wuk;

import com.revolut.trading.orders.domain.models.InvestOrdersParams;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.z0;

/* JADX INFO: loaded from: classes12.dex */
public final class v implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f300213a;

    public v(y yVar) {
        this.f300213a = yVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String str;
        od0.i optionalCfdInstrument = (od0.i) obj2;
        Intrinsics.checkNotNullParameter(optionalCfdInstrument, "optionalCfdInstrument");
        y yVar = this.f300213a;
        fsl.m mVar = yVar.C;
        xi0.a aVar = xi0.b.Companion;
        String str2 = yVar.o.f103901a;
        aVar.getClass();
        xi0.b bVarA = xi0.a.a(str2);
        nel.n nVar = (nel.n) optionalCfdInstrument.f224257a;
        return ((fsl.w) mVar).a(new InvestOrdersParams.OrdersByCurrencies(z0.i(bVarA, (nVar == null || (str = nVar.f214596b) == null) ? null : xi0.a.a(str)), null, 28));
    }
}
