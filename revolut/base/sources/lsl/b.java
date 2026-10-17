package lsl;

import com.revolut.core.ui_kit.internal.views.fanchart.CurvedFanChartView;
import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrderFilter;
import com.revolut.feature.freelancer.impl.ui.cashback.screen.booster.a;
import com.revolut.trading.orders.ui.invest.placement.models.OrderQuoteResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jsl.g0;
import jsl.j0;
import jsl.v;
import jsl.z0;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import lu5.r;
import lu6.s;
import zhm.a0;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f199695a;

    public /* synthetic */ b(int i) {
        this.f199695a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Set set;
        switch (this.f199695a) {
            case 0:
                v it8 = (v) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.f178243a;
            case 1:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                z0.Companion.getClass();
                return new j0(g0.f178213a, z0.f);
            case 2:
                CurvedFanChartView.Companion aVar = CurvedFanChartView.INSTANCE;
                return Unit.f186387a;
            case 3:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new lt7.k(null, null, null, (List) getDefaultLoadingItems.invoke(), true);
            case 4:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return d0.Q((List) pair.f186386b);
            case 5:
                io3.d it9 = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.valueOf(it9.f163149h == io3.i.INTERNAL);
            case 6:
                io3.d it10 = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                io3.l lVar = it10.e;
                return Boolean.valueOf(lVar == io3.l.REVX_FIAT || lVar == io3.l.CRYPTO_EXCHANGE || r6.b.B(xi0.b.Companion, it10.f163147c));
            case 7:
                io3.d it11 = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                r.Companion.getClass();
                Intrinsics.checkNotNullParameter(it11, "<this>");
                return Boolean.valueOf(r.e.contains(it11.e));
            case 8:
                io3.d it12 = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return Boolean.valueOf(r.f.contains(it12.f));
            case 9:
                io3.d it13 = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return Boolean.valueOf(it13.e != io3.l.LOCKED_GIFT);
            case 10:
                lu6.l update = (lu6.l) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                AcquiringOrderFilter acquiringOrderFilter = update.f200048b;
                return lu6.l.a(update, null, acquiringOrderFilter != null ? acquiringOrderFilter.j9(o0.f186429a.b(AcquiringOrderFilter.DateRange.class)) : null, 5);
            case 11:
                lu6.l handleSelectAllOrRemove = (lu6.l) obj2;
                Intrinsics.checkNotNullParameter(handleSelectAllOrRemove, "$this$handleSelectAllOrRemove");
                AcquiringOrderFilter acquiringOrderFilter2 = handleSelectAllOrRemove.f200048b;
                return lu6.l.a(handleSelectAllOrRemove, null, acquiringOrderFilter2 != null ? acquiringOrderFilter2.j9(o0.f186429a.b(AcquiringOrderFilter.Status.class)) : null, 5);
            case 12:
                lu6.l handleSelectAllOrRemove2 = (lu6.l) obj2;
                Intrinsics.checkNotNullParameter(handleSelectAllOrRemove2, "$this$handleSelectAllOrRemove");
                AcquiringOrderFilter acquiringOrderFilter3 = handleSelectAllOrRemove2.f200048b;
                s.Companion.getClass();
                return lu6.l.a(handleSelectAllOrRemove2, null, com.revolut.feature.freelancer.impl.ui.acquiring_order.filters.screen.a.J2(acquiringOrderFilter3, new AcquiringOrderFilter.Status(s.f)), 5);
            case 13:
                lu6.l handleSelectAllOrRemove3 = (lu6.l) obj2;
                Intrinsics.checkNotNullParameter(handleSelectAllOrRemove3, "$this$handleSelectAllOrRemove");
                AcquiringOrderFilter acquiringOrderFilter4 = handleSelectAllOrRemove3.f200048b;
                return lu6.l.a(handleSelectAllOrRemove3, null, acquiringOrderFilter4 != null ? acquiringOrderFilter4.j9(o0.f186429a.b(AcquiringOrderFilter.Channel.class)) : null, 5);
            case 14:
                lu6.l handleSelectAllOrRemove4 = (lu6.l) obj2;
                Intrinsics.checkNotNullParameter(handleSelectAllOrRemove4, "$this$handleSelectAllOrRemove");
                s.Companion.getClass();
                EnumEntries enumEntries = s.f200056g;
                ArrayList arrayList = new ArrayList();
                Iterator<E> it14 = enumEntries.iterator();
                while (it14.hasNext()) {
                    a0.x(((ju6.b) it14.next()).b(), arrayList);
                }
                return lu6.l.a(handleSelectAllOrRemove4, null, com.revolut.feature.freelancer.impl.ui.acquiring_order.filters.screen.a.J2(handleSelectAllOrRemove4.f200048b, new AcquiringOrderFilter.Channel(d0.i1(arrayList))), 5);
            case 15:
                lu6.l update2 = (lu6.l) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                AcquiringOrderFilter acquiringOrderFilter5 = update2.f200048b;
                return lu6.l.a(update2, null, acquiringOrderFilter5 != null ? acquiringOrderFilter5.j9(o0.f186429a.b(AcquiringOrderFilter.DateRange.class)) : null, 5);
            case 16:
                lu6.l update3 = (lu6.l) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return lu6.l.a(update3, null, null, 5);
            case 17:
                lu6.l update4 = (lu6.l) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return lu6.l.a(update4, null, null, 3);
            case 18:
                lu6.l update5 = (lu6.l) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                AcquiringOrderFilter acquiringOrderFilter6 = update5.f200048b;
                return lu6.l.a(update5, null, acquiringOrderFilter6 != null ? acquiringOrderFilter6.j9(o0.f186429a.b(AcquiringOrderFilter.FractionalAmount.class)) : null, 5);
            case 19:
                lu6.l handleSelectAllOrRemove5 = (lu6.l) obj2;
                Intrinsics.checkNotNullParameter(handleSelectAllOrRemove5, "$this$handleSelectAllOrRemove");
                AcquiringOrderFilter acquiringOrderFilter7 = handleSelectAllOrRemove5.f200048b;
                return lu6.l.a(handleSelectAllOrRemove5, null, acquiringOrderFilter7 != null ? acquiringOrderFilter7.j9(o0.f186429a.b(AcquiringOrderFilter.Currency.class)) : null, 5);
            case 20:
                lu6.l handleSelectAllOrRemove6 = (lu6.l) obj2;
                Intrinsics.checkNotNullParameter(handleSelectAllOrRemove6, "$this$handleSelectAllOrRemove");
                lu6.k kVar = (lu6.k) handleSelectAllOrRemove6.f200047a.getContent();
                if (kVar == null || (set = kVar.f200046a) == null) {
                    set = h0.f322473a;
                }
                return !set.isEmpty() ? lu6.l.a(handleSelectAllOrRemove6, null, com.revolut.feature.freelancer.impl.ui.acquiring_order.filters.screen.a.J2(handleSelectAllOrRemove6.f200048b, new AcquiringOrderFilter.Currency(set)), 5) : handleSelectAllOrRemove6;
            case 21:
                Function0 getDefaultLoadingItems2 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems2, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems2.invoke();
            case 22:
                hul.h it15 = (hul.h) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return it15.d;
            case 23:
                OrderQuoteResult it16 = (OrderQuoteResult) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return it16.f106859b;
            case 24:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                return new lv4.f((vl4.g) pair2.f186385a, (wi0.b) pair2.f186386b);
            case 25:
                lv4.g it17 = (lv4.g) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                lv4.f fVar = (lv4.f) it17.f200297a.getContent();
                if (fVar != null) {
                    return fVar.f200295a;
                }
                return null;
            case 26:
                lv4.g it18 = (lv4.g) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                lv4.f fVar2 = (lv4.f) it18.f200297a.getContent();
                if (fVar2 != null) {
                    return fVar2.f200295a;
                }
                return null;
            case 27:
                rr6.i it19 = (rr6.i) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return String.valueOf(it19.d);
            case 28:
                vf0.h hVar = (vf0.h) obj2;
                Intrinsics.checkNotNullParameter(hVar, "<destruct>");
                return new lv6.j((rr6.g) hVar.f288433a, (rr6.j) hVar.f288434b, (whf.p) hVar.f288435c, (whf.p) hVar.d);
            default:
                Function0 getDefaultLoadingItems3 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems3, "getDefaultLoadingItems");
                return new lv6.q((List) getDefaultLoadingItems3.invoke(), a.C0488a.f73750a);
        }
    }

    public /* synthetic */ b(Object obj2, int i) {
        this.f199695a = i;
    }
}
