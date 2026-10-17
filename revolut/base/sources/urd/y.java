package urd;

import android.content.Context;
import android.content.SharedPreferences;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import ip0.br;
import ip0.cr;
import ip0.hd0;
import ip0.nb0;
import ip0.pb0;
import ip0.sx;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import mx0.f3;
import mx0.h3;
import tof.a3;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class y implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f282302a;

    public /* synthetic */ y(int i) {
        this.f282302a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        pr6.e eVar;
        boolean z = false;
        switch (this.f282302a) {
            case 0:
                LocalDate currentDate = (LocalDate) obj2;
                Intrinsics.checkNotNullParameter(currentDate, "currentDate");
                return currentDate.plusMonths(1L);
            case 1:
                LocalDate currentDate2 = (LocalDate) obj2;
                Intrinsics.checkNotNullParameter(currentDate2, "currentDate");
                return currentDate2.plusDays(1L);
            case 2:
                ie3.a it8 = (ie3.a) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it8);
            case 3:
                trj.a it9 = (trj.a) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9.e;
            case 4:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                aim.e eVarB = zhm.u.b();
                eVarB.add(new hd0("main_budget", null, 6));
                eVarB.add(new pb0("SPENDINGS_BANNER_ID"));
                IntRange intRange = new IntRange(1, 3, 1);
                ArrayList arrayList = new ArrayList(zhm.w.t(intRange, 10));
                vim.f it10 = intRange.iterator();
                while (it10.f289625c) {
                    arrayList.add(new pb0(String.valueOf(it10.nextInt())));
                }
                int i = R$attr.uikit_dp16;
                yp0.b.k(arrayList, i, i, 0, 0, 28);
                eVarB.addAll(arrayList);
                return new urj.f(null, zhm.u.a(eVarB));
            case 5:
                us4.h it11 = (us4.h) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return (us4.g) it11.f282425a.getContent();
            case 6:
                ql4.d0 plan = (ql4.d0) obj2;
                Intrinsics.checkNotNullParameter(plan, "plan");
                od0.h hVar = od0.i.Companion;
                String str = plan.f;
                hVar.getClass();
                return od0.h.a(str);
            case 7:
                ql4.q instalment = (ql4.q) obj2;
                Intrinsics.checkNotNullParameter(instalment, "instalment");
                od0.h hVar2 = od0.i.Companion;
                String str2 = instalment.f247171s;
                hVar2.getClass();
                return od0.h.a(str2);
            case 8:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                us4.l lVar = new us4.l(null);
                aim.e eVarB2 = zhm.u.b();
                cr crVar = new cr("id_instalment_term_slider", br.CENTER);
                yp0.b.l(crVar, 0, 0, 0, 0, null, false, 63);
                nb0 nb0Var = pb0.Companion;
                List listK = zhm.v.k(nb0.b(nb0Var, "id_credit_card_instalment_repay_choose_instalments_amount_to_repay", false, 0, false, 30), nb0.b(nb0Var, "id_credit_card_instalment_repay_choose_instalments_interest_saved", false, 0, false, 30));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                eVarB2.add(crVar);
                eVarB2.addAll(listK);
                return new us4.m(lVar, zhm.u.a(eVarB2), new us4.k(null, false));
            case 9:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                bw0.m.Companion.getClass();
                return bw0.k.a();
            case 10:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new f3(null, null, null, false, h3.LOADING, false);
            case 11:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                amd.j[] elements = {(amd.j) rVar.f314201a, ((od0.i) rVar.f314202b).g(), ((od0.i) rVar.f314203c).g()};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return kotlin.collections.d.L(elements);
            case 12:
                List tickets = (List) obj2;
                Intrinsics.checkNotNullParameter(tickets, "tickets");
                List list = tickets;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it12 = list.iterator();
                    while (true) {
                        if (it12.hasNext()) {
                            if (((kse.a) it12.next()).f189439g == kse.e.RESOLVED) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 13:
                Throwable it13 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return new Data(null, it13, false, 5, null);
            case 14:
                tsk.d update = (tsk.d) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return tsk.d.a(update, null, tsk.h.a(update.f274147b, xsk.n.ANNUALLY, null, null, 6), 1);
            case 15:
                tsk.d update2 = (tsk.d) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return tsk.d.a(update2, null, tsk.h.a(update2.f274147b, xsk.n.QUARTERLY, null, null, 6), 1);
            case 16:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return "";
            case 17:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                List listC = zhm.u.c(new sx("price-target-chart-loading-listId"));
                yp0.b.k(listC, 0, 0, 0, 0, 31);
                return listC;
            case 18:
                InstrumentTicker ticker = (InstrumentTicker) obj2;
                Intrinsics.checkNotNullParameter(ticker, "ticker");
                return ticker.e;
            case 19:
                eel.e it14 = (eel.e) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return it14;
            case 20:
                yhm.r rVar2 = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar2, "<destruct>");
                return new utk.a((dj0.d) rVar2.f314202b, (eel.e) rVar2.f314203c, ((mel.f) rVar2.f314201a).f204745b);
            case 21:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return Boolean.valueOf(((koi.j) pair.f186386b) instanceof ListSubheaderDelegate.Model);
            case 22:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                return new Pair(Integer.valueOf(((Number) pair2.f186385a).intValue()), ((koi.j) pair2.f186386b).getF54946b());
            case 23:
                ListSubheaderDelegate.Model item = (ListSubheaderDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(item, "item");
                Object obj3 = item.f52715m;
                a3 a3Var = obj3 instanceof a3 ? (a3) obj3 : null;
                if (a3Var != null) {
                    return new Pair(item.f52708a, a3Var);
                }
                return null;
            case 24:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                return new Pair((String) pair3.f186385a, ((a3) pair3.f186386b).f272593h.toLocalDate());
            case 25:
                uu6.h update3 = (uu6.h) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return uu6.h.a(update3, null, !update3.f283143b, null, false, null, 29);
            case 26:
                uu6.h update4 = (uu6.h) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return uu6.h.a(update4, null, false, null, !update4.d, null, 23);
            case 27:
                uu6.h it15 = (uu6.h) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                od0.i iVar = (od0.i) it15.f283142a.getContent();
                if (iVar == null || (eVar = ((pr6.g) iVar.c()).f238951a) == null) {
                    return null;
                }
                return eVar.o;
            case 28:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new uu6.m((List) getDefaultLoadingItems.invoke());
            default:
                Context context = (Context) obj2;
                uv0.e eVar2 = uv0.e.d;
                Intrinsics.checkNotNullParameter(context, "context");
                SharedPreferences sharedPreferences = context.getSharedPreferences("keyboard_preferences", 0);
                Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
                return new uv0.d(sharedPreferences);
        }
    }

    public /* synthetic */ y(Object obj2, int i) {
        this.f282302a = i;
    }
}
