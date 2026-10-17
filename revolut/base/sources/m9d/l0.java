package m9d;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.data.model.Data;
import ip0.s7;
import ip0.yl;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class l0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f203722a;

    public /* synthetic */ l0(int i) {
        this.f203722a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f203722a) {
            case 0:
                z updateState = (z) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return z.a(updateState, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, false, 245759);
            case 1:
                return ((Boolean) obj2).booleanValue() ? new x(0) : w.f203746a;
            case 2:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return w.f203746a;
            case 3:
                Throwable it9 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return w.f203746a;
            case 4:
                return z.a((z) obj2, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, true, 131071);
            case 5:
                return z.a((z) obj2, null, null, null, null, null, null, null, null, null, new Data(null, null, true, 3, null), null, false, false, null, null, null, false, 261631);
            case 6:
                Function0 it10 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return zhm.f0.f322471a;
            case 7:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return new g0(p9d.i.a(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
            case 8:
                Function0 it11 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return null;
            case 9:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return new f0(p9d.i.a(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
            case 10:
                Function0 it12 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return zhm.f0.f322471a;
            case 11:
                Function0 it13 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return zhm.f0.f322471a;
            case 12:
                Function0 it14 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return zhm.f0.f322471a;
            case 13:
                Function0 it15 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return zhm.f0.f322471a;
            case 14:
                Throwable it16 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 15:
                m9j.h update = (m9j.h) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return m9j.h.a(update, null, null, null, true, null, null, null, 495);
            case 16:
                vtd.c it17 = (vtd.c) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it17);
            case 17:
                Throwable it18 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 18:
                vf0.h hVar = (vf0.h) obj2;
                Intrinsics.checkNotNullParameter(hVar, "<destruct>");
                return new m9j.i((io3.g) hVar.f288433a, (ej0.b) ((od0.i) hVar.f288435c).f224257a, (ej0.b) ((od0.i) hVar.f288434b).f224257a, (vtd.c) ((od0.i) hVar.d).f224257a);
            case 19:
                List exchangeRates = (List) obj2;
                Intrinsics.checkNotNullParameter(exchangeRates, "exchangeRates");
                qta.c cVar = (qta.c) zhm.d0.d0(exchangeRates);
                if (cVar != null) {
                    return ofm.q.f0(cVar);
                }
                return null;
            case 20:
                n9l.a exchangeRate = (n9l.a) obj2;
                Intrinsics.checkNotNullParameter(exchangeRate, "exchangeRate");
                od0.h hVar2 = od0.i.Companion;
                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(exchangeRate.f213663c);
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
                ej0.b bVar = new ej0.b(bigDecimalValueOf, exchangeRate.f213662b);
                hVar2.getClass();
                return od0.h.a(bVar);
            case 21:
                Throwable it19 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 22:
                return m9j.h.a((m9j.h) obj2, null, null, null, false, null, null, null, 495);
            case 23:
                return m9j.h.a((m9j.h) obj2, null, null, null, true, null, null, null, 495);
            case 24:
                return m9j.h.a((m9j.h) obj2, null, null, null, false, null, null, null, 495);
            case 25:
                Function0 it20 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                s7 s7Var = new s7("FAQ_CELL_DETAILS_LOADING_LIST_ID", 0, 0, 0, 0, false, null, 126);
                yp0.b.l(s7Var, 0, 0, 0, 0, null, false, 63);
                List listK = zhm.v.k(new yl("HEADER_LOADING_LIST_ID", 0, 30), new s7("BALANCE_CELL_DETAILS_LOADING_LIST_ID", 0, 0, 0, 0, false, null, 126), new s7("UNREALISED_RETURN_CELL_DETAILS_LOADING_LIST_ID", 0, 0, 0, 0, false, null, 126));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                return i2b.a.p(listK, s7Var);
            case 26:
                List rates = (List) obj2;
                Intrinsics.checkNotNullParameter(rates, "rates");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : rates) {
                    if (((n9l.a) obj3).f213663c != -1.0d) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            case 27:
                Set currencyPairs = (Set) obj2;
                Intrinsics.checkNotNullParameter(currencyPairs, "currencyPairs");
                return zhm.d0.k0(currencyPairs, null, null, null, 0, null, 63);
            case 28:
                List listOfPairs = (List) obj2;
                Intrinsics.checkNotNullParameter(listOfPairs, "listOfPairs");
                return zhm.d0.i1(zhm.w.u(listOfPairs));
            default:
                List ratesDto = (List) obj2;
                Intrinsics.checkNotNullParameter(ratesDto, "ratesDto");
                return io3.h.F(ratesDto);
        }
    }
}
