package cul;

import com.revolut.feature.trading_orders.common.models.FrequencySettings;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.revolut.trading.orders.ui.invest.placement.models.FiatExchangeOrderQuoteResult;
import com.revolut.trading.orders.ui.invest.placement.models.InvestInputValue;
import com.revolut.trading.orders.ui.invest.placement.models.InvestOutputValue;
import com.revolut.trading.orders.ui.invest.placement.models.OrderQuoteResult;
import java.util.Iterator;
import java.util.Optional;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class p0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109150a;

    public /* synthetic */ p0(int i) {
        this.f109150a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        switch (this.f109150a) {
            case 0:
                OrderQuoteResult it8 = (OrderQuoteResult) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.f106859b;
            case 1:
                v it9 = (v) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                aul.b bVar = it9.d;
                if (bVar != null) {
                    return zi0.c.P(bVar, false, null, 3);
                }
                return null;
            case 2:
                v it10 = (v) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return it10.f109176b;
            case 3:
                FiatExchangeOrderQuoteResult it11 = (FiatExchangeOrderQuoteResult) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return (OrderQuote) zhm.d0.b0(it11.f106843b.f91686a);
            case 4:
                v update = (v) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return v.a(update, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, true, false, null, null, null, null, null, null, null, null, null, null, null, null, Integer.MAX_VALUE, 8191);
            case 5:
                k4l.e0 e0Var = (k4l.e0) obj2;
                Intrinsics.checkNotNullParameter(e0Var, "<this>");
                k4l.j0 j0VarI = n14.k.i(e0Var, k4l.r0.RECURRING);
                k4l.h0 h0Var = j0VarI instanceof k4l.h0 ? (k4l.h0) j0VarI : null;
                return h0Var != null ? h0Var.d : zhm.f0.f322471a;
            case 6:
                return zi0.c.P(((v) obj2).f109175a, false, null, 3);
            case 7:
                k4l.e0 e0Var2 = (k4l.e0) obj2;
                Intrinsics.checkNotNullParameter(e0Var2, "<this>");
                Iterator it12 = e0Var2.f180958j.iterator();
                while (true) {
                    if (it12.hasNext()) {
                        next = it12.next();
                        if (next instanceof k4l.f0) {
                        }
                    } else {
                        next = null;
                    }
                }
                k4l.f0 f0Var = (k4l.f0) next;
                return Boolean.valueOf(f0Var != null ? f0Var.d : false);
            case 8:
                k4l.e0 e0Var3 = (k4l.e0) obj2;
                Intrinsics.checkNotNullParameter(e0Var3, "<this>");
                return Boolean.valueOf(n14.k.n(e0Var3, k4l.r0.RECURRING));
            case 9:
                return ((v) obj2).f109180j;
            case 10:
                k4l.b0 b0Var = ((k4l.e0) obj2).f180961n;
                if (b0Var != null) {
                    return b0Var.f180947a;
                }
                return null;
            case 11:
                return ((v) obj2).f109186r;
            case 12:
                return v.a((v) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, true, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, -524289, 8191);
            case 13:
                return ((v) obj2).N;
            case 14:
                return v.a((v) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, true, null, null, null, null, null, null, null, null, null, null, null, null, -1, 8190);
            case 15:
                return zi0.c.P(((v) obj2).f109175a, false, null, 3);
            case 16:
                return zi0.c.P(((v) obj2).f109176b, false, null, 3);
            case 17:
                return ((v) obj2).f109187s;
            case 18:
                v vVar = (v) obj2;
                aul.b bVar2 = vVar.d;
                if (bVar2 != null) {
                    return v.a(vVar, null, null, bVar2.a(), InvestInputValue.a(vVar.e, vVar.f109179h.f106856a, null, false, true, 6), null, null, new InvestOutputValue(vVar.e.f106844a, null), null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, -153, 8191);
                }
                throw new IllegalArgumentException("Current input mode is not set");
            case 19:
                return ((v) obj2).e;
            case 20:
                return zi0.c.P(((v) obj2).f109175a, false, null, 3);
            case 21:
                return Optional.of((FrequencySettings) obj2);
            case 22:
                return ((v) obj2).f109180j;
            case 23:
                return ((v) obj2).k;
            case 24:
                return ((v) obj2).f109186r;
            case 25:
                return ((v) obj2).z;
            case 26:
                return v.a((v) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, true, false, null, null, null, null, null, null, null, null, null, null, null, null, Integer.MAX_VALUE, 8191);
            case 27:
                return zi0.c.P(((v) obj2).f109175a, false, null, 3);
            case 28:
                return zi0.c.P(((v) obj2).f109176b, false, null, 3);
            default:
                return ((OrderQuoteResult) obj2).f106859b;
        }
    }
}
