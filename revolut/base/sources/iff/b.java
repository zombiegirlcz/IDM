package iff;

import com.revolut.core.model.account.AccountId;
import efm.d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import tof.a9;
import tof.fc;
import tof.i7;
import tof.ob;
import tof.v6;
import tof.y6;
import ufm.i;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f161009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f161010b;

    public /* synthetic */ b(d dVar, int i) {
        this.f161009a = i;
        this.f161010b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f161009a;
        int i2 = 2;
        d dVar = this.f161010b;
        switch (i) {
            case 0:
                dj0.d it8 = (dj0.d) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                dj0.d.Companion.getClass();
                if (!Intrinsics.f(it8, dj0.d.d)) {
                    return d0.m(it8);
                }
                i iVar = new i(dVar.f161016c.x(AccountId.Personal.f51414a), new icc.c(new b(dVar, i2), 27), 0);
                Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                return iVar;
            case 1:
                dj0.d money = (dj0.d) obj2;
                a aVar = dVar.f161014a;
                Intrinsics.h(money);
                aVar.getClass();
                Intrinsics.checkNotNullParameter(money, "money");
                aVar.f161008a.onNext(money);
                return Unit.f186387a;
            default:
                xi0.b baseCurrency = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
                long jK = cp5.d.k(baseCurrency);
                long millis = new DateTime().minusMonths(3).getMillis();
                String str = baseCurrency.f306286a;
                com.revolut.domain.interactors.transactions.a aVar2 = dVar.f161015b;
                i7.c cVar = i7.Companion;
                ob obVar = new ob(new DateTime(millis), true);
                xi0.b.Companion.getClass();
                a9 a9Var = new a9(xi0.a.a(str));
                y6[] y6VarArr = {y6.CARD_PAYMENT};
                cVar.getClass();
                return new i(com.revolut.domain.interactors.transactions.a.b(aVar2, i7.c.a(obVar, a9Var, i7.c.d(y6VarArr), fc.b(i7.c.c(v6.DECLINED, v6.FAILED))), null, null, null, null, 30), new icc.c(new c(jK, baseCurrency, 0), 28), 1);
        }
    }
}
