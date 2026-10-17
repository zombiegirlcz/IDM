package mwk;

import com.revolut.trading.orders.domain.models.InvestOrdersParams;
import fsl.w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.z0;

/* JADX INFO: loaded from: classes12.dex */
public final class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f209522a;

    public o(s sVar) {
        this.f209522a = sVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String str;
        od0.i optionalCfdInstrument = (od0.i) obj2;
        Intrinsics.checkNotNullParameter(optionalCfdInstrument, "optionalCfdInstrument");
        s sVar = this.f209522a;
        fsl.m mVar = sVar.z;
        xi0.a aVar = xi0.b.Companion;
        String str2 = sVar.o.f104061a;
        aVar.getClass();
        xi0.b bVarA = xi0.a.a(str2);
        nel.n nVar = (nel.n) optionalCfdInstrument.f224257a;
        return ((w) mVar).a(new InvestOrdersParams.OrdersByCurrencies(z0.i(bVarA, (nVar == null || (str = nVar.f214596b) == null) ? null : xi0.a.a(str)), null, 28));
    }
}
