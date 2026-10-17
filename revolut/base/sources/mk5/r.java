package mk5;

import com.revolut.data.model.Data;
import com.revolut.feature.crypto.remittance.api.navigation.CryptoRemittanceKompotFeatureConfig;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f206196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.crypto.remittance.impl.ui.currency_picker.a f206197b;

    public /* synthetic */ r(com.revolut.feature.crypto.remittance.impl.ui.currency_picker.a aVar, int i) {
        this.f206196a = i;
        this.f206197b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        l lVar;
        switch (this.f206196a) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                String str = (String) pair.f186385a;
                wk5.a aVar = (wk5.a) pair.f186386b;
                fbj.a aVar2 = this.f206197b.u;
                Intrinsics.h(str);
                return aVar2.d(str, aVar, true);
            case 1:
                CryptoRemittanceKompotFeatureConfig.CurrencyPickerDestination.InputData.Currencies currencies = (CryptoRemittanceKompotFeatureConfig.CurrencyPickerDestination.InputData.Currencies) obj2;
                Intrinsics.checkNotNullParameter(currencies, "currencies");
                com.revolut.feature.crypto.remittance.impl.ui.currency_picker.a aVar3 = this.f206197b;
                efm.r rVarE = osg.b.e(aVar3.f70962q, false, io3.l.CURRENT, null, io3.i.INTERNAL, io3.j.PERSONAL, qsg.a.RECENT_FIRST, null, 68);
                efm.r rVarFlatMap = xv5.c.b(aVar3.A).flatMap(new mhd.c(new s(currencies.getF70950a(), aVar3, 1), 17));
                Intrinsics.checkNotNullExpressionValue(rVarFlatMap, "flatMap(...)");
                return nim.a.w(nim.a.w(kli.a.h(kli.a.h(rVarE, ue0.e.H(rVarFlatMap, h0.f322473a, new mk3.c(4))), kli.a.h(nim.a.z(nim.a.w(aVar3.f70968y.a(false), new mk3.c(5)), new mk3.c(6)), aVar3.o.e == pj5.a.MARKET_CAP ? aVar3.z.a(false) : zi0.c.j(f0.f322471a))), new mk3.c(3)), new s(currencies, aVar3, 0));
            default:
                Data data = (Data) obj2;
                com.revolut.feature.crypto.remittance.impl.ui.currency_picker.a aVar4 = this.f206197b;
                if (aVar4.D == null) {
                    List list = (List) data.getContent();
                    aVar4.D = (list == null || (lVar = (l) d0.d0(list)) == null) ? null : lVar.f206187b;
                }
                return Unit.f186387a;
        }
    }
}
