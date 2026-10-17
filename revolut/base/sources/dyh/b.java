package dyh;

import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n14.k;
import wd6.e;
import zhm.d0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f121132b;

    public /* synthetic */ b(e eVar, int i) {
        this.f121131a = i;
        this.f121132b = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List exchangeRates = (List) obj2;
        switch (this.f121131a) {
            case 0:
                Intrinsics.checkNotNullParameter(exchangeRates, "exchangeRates");
                qta.a aVar = (qta.a) d0.d0(exchangeRates);
                if (aVar != null) {
                    return this.f121132b == e.BUY ? n9l.a.a(k.I(aVar), aVar.f249041c.doubleValue()) : k.I(aVar);
                }
                return null;
            case 1:
                Intrinsics.checkNotNullParameter(exchangeRates, "exchangeRates");
                qta.a aVar2 = (qta.a) d0.d0(exchangeRates);
                if (aVar2 != null) {
                    BigDecimal bigDecimal = this.f121132b == e.BUY ? aVar2.f249041c : aVar2.d;
                    if (bigDecimal != null) {
                        return bigDecimal;
                    }
                }
                return null;
            default:
                Intrinsics.checkNotNullParameter(exchangeRates, "exchangeRates");
                qta.a aVar3 = (qta.a) d0.d0(exchangeRates);
                if (aVar3 != null) {
                    return this.f121132b == e.BUY ? n9l.a.a(k.I(aVar3), aVar3.f249041c.doubleValue()) : k.I(aVar3);
                }
                return null;
        }
    }
}
