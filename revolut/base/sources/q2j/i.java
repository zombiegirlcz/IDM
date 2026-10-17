package q2j;

import com.revolut.core.ui_kit.models.CurrencyClause;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f241681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f241682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f241683c;

    public /* synthetic */ i(List list, x xVar, int i) {
        this.f241681a = i;
        this.f241682b = list;
        this.f241683c = xVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        switch (this.f241681a) {
            case 0:
                String currency = (String) obj2;
                Intrinsics.checkNotNullParameter(currency, "currency");
                Iterator it8 = this.f241682b.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (Intrinsics.f(((io3.d) next).f163147c, currency)) {
                        }
                    } else {
                        next = null;
                    }
                }
                a aVar = this.f241683c.f241703s;
                xi0.b.Companion.getClass();
                xi0.b currency2 = xi0.a.a(currency);
                aVar.getClass();
                Intrinsics.checkNotNullParameter(currency2, "currency");
                return new c(currency2, aVar.f241662b.b(new CurrencyClause(currency2, null, null, 6)).toString(), (io3.d) next, null);
            default:
                xi0.b baseCurrency = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
                List list = this.f241682b;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                Iterator it9 = list.iterator();
                while (it9.hasNext()) {
                    v1.c.A(arrayList, (xi0.b) it9.next(), baseCurrency);
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : arrayList) {
                    Pair pair = (Pair) obj3;
                    if (!Intrinsics.f(pair.f186385a, pair.f186386b)) {
                        arrayList2.add(obj3);
                    }
                }
                return this.f241683c.f241697l.e(arrayList2, n9l.b.SEC_3);
        }
    }
}
