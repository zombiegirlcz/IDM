package ypd;

import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import ar9.r;
import ar9.s;
import ar9.t;
import ar9.u;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.BlockMerchantFlowContract$Step;
import com.revolut.feature.push_to_card.impl.ui.amount.PushToCardTransferAmountScreen;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.flow.TotalWealthFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.stockdetails.impl.ui.activities.statements.models.StockFinancialsStatementPeriodState;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import nel.n;
import ofm.q;
import yrb.x;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f315841a;

    public /* synthetic */ i(int i) {
        this.f315841a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteStatement sQLiteStatementPrepare;
        int i;
        ar9.a aVar;
        int i2;
        Integer numValueOf;
        qrb.k kVar;
        switch (this.f315841a) {
            case 0:
                return a.a((a) obj2, null, null, 29);
            case 1:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return d0.E0((List) pair.f186385a, (List) pair.f186386b);
            case 2:
                io3.d it8 = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.f163145a;
            case 3:
                qta.d midRatesPlot = (qta.d) obj2;
                Intrinsics.checkNotNullParameter(midRatesPlot, "midRatesPlot");
                List<Pair> list = midRatesPlot.e;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                for (Pair pair2 : list) {
                    arrayList.add(new Pair(Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(((Number) pair2.f186385a).longValue())), Double.valueOf(((Number) pair2.f186386b).doubleValue())));
                }
                return qta.d.a(midRatesPlot, arrayList);
            case 4:
                List it9 = (List) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return q.f0((qta.c) d0.b0(it9));
            case 5:
                io3.d dVar = (io3.d) obj2;
                Intrinsics.h(dVar);
                return z92.f.j(dVar);
            case 6:
                try {
                    ((SQLiteConnection) obj2).prepare("DELETE FROM payments_groups").step();
                    return null;
                } finally {
                }
            case 7:
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM payments_groups ORDER BY updatedDate DESC");
                try {
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "imageUrl");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "currencyCode");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "balance");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isTrusted");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updatedDate");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "lastFullSettlementDate");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "settings_calculationType");
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "settings_baseCurrency");
                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "analytics_totalSpentByGroup");
                    int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "analytics_totalSpentByCurrentMember");
                    int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "analytics_currency");
                    int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "analytics_totalSpentByGroupByCurrency");
                    int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "analytics_totalSpentByCurrentMemberByCurrency");
                    ArrayList arrayList2 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                        String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                        String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                        ar9.e eVarA = xq9.b.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                        int i3 = columnIndexOrThrow2;
                        int i5 = columnIndexOrThrow3;
                        boolean z = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6)) != 0;
                        long j2 = sQLiteStatementPrepare.getLong(columnIndexOrThrow7);
                        Long lValueOf = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow8));
                        int i6 = columnIndexOrThrow;
                        ar9.d dVar2 = new ar9.d(yq9.h.a(sQLiteStatementPrepare.getText(columnIndexOrThrow9)), sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10));
                        if (sQLiteStatementPrepare.isNull(columnIndexOrThrow11) && sQLiteStatementPrepare.isNull(columnIndexOrThrow12) && sQLiteStatementPrepare.isNull(columnIndexOrThrow13) && sQLiteStatementPrepare.isNull(columnIndexOrThrow14)) {
                            i = columnIndexOrThrow15;
                            if (sQLiteStatementPrepare.isNull(i)) {
                                aVar = null;
                                arrayList2.add(new r(text, text2, text3, text4, eVarA, z, j2, lValueOf, dVar2, aVar));
                                columnIndexOrThrow15 = i;
                                columnIndexOrThrow2 = i3;
                                columnIndexOrThrow3 = i5;
                                columnIndexOrThrow = i6;
                            }
                        } else {
                            i = columnIndexOrThrow15;
                        }
                        aVar = new ar9.a(sQLiteStatementPrepare.getLong(columnIndexOrThrow11), sQLiteStatementPrepare.getLong(columnIndexOrThrow12), sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13), xq9.a.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14)), xq9.a.a(sQLiteStatementPrepare.isNull(i) ? null : sQLiteStatementPrepare.getText(i)));
                        arrayList2.add(new r(text, text2, text3, text4, eVarA, z, j2, lValueOf, dVar2, aVar));
                        columnIndexOrThrow15 = i;
                        columnIndexOrThrow2 = i3;
                        columnIndexOrThrow3 = i5;
                        columnIndexOrThrow = i6;
                        break;
                    }
                    return arrayList2;
                } catch (Throwable th10) {
                    throw th10;
                }
            case 8:
                try {
                    ((SQLiteConnection) obj2).prepare("DELETE FROM payments_groups_members").step();
                    return null;
                } finally {
                }
            case 9:
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM payments_groups_members");
                try {
                    int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "memberId");
                    int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "groupId");
                    int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "inviterId");
                    int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "contactId");
                    int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
                    int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "firstName");
                    int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "lastName");
                    int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "countryCode");
                    int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isRevolut");
                    ArrayList arrayList3 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow16) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow16);
                        String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow17) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow17);
                        s sVarA = xq9.g.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow18) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow18));
                        s sVarA2 = xq9.g.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow19) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow19));
                        u uVarA = xq9.h.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow20) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow20));
                        String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow21) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow21);
                        String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow22) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow22);
                        String text9 = sQLiteStatementPrepare.isNull(columnIndexOrThrow23) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow23);
                        if (sQLiteStatementPrepare.isNull(columnIndexOrThrow24)) {
                            i2 = columnIndexOrThrow19;
                            numValueOf = null;
                        } else {
                            i2 = columnIndexOrThrow19;
                            numValueOf = Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow24));
                        }
                        arrayList3.add(new t(text5, text6, sVarA, sVarA2, uVarA, text7, text8, text9, numValueOf == null ? null : Boolean.valueOf(numValueOf.intValue() != 0)));
                        columnIndexOrThrow19 = i2;
                        break;
                    }
                    return arrayList3;
                } finally {
                }
            case 10:
                try {
                    ((SQLiteConnection) obj2).prepare("DELETE FROM cached_budget").step();
                    return null;
                } finally {
                }
            case 11:
                FlowStep it10 = (FlowStep) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Boolean.valueOf(it10 instanceof BlockMerchantFlowContract$Step.BlockedPaymentsList);
            case 12:
                FlowStep step = (FlowStep) obj2;
                Intrinsics.checkNotNullParameter(step, "step");
                return Boolean.valueOf(step instanceof BlockMerchantFlowContract$Step.BlockedPaymentsList);
            case 13:
                yr5.f updateState = (yr5.f) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return yr5.f.a(updateState, null, null, null, null, 31);
            case 14:
                CenteredAmountDelegate.Model it11 = (CenteredAmountDelegate.Model) obj2;
                KProperty[] kPropertyArr = PushToCardTransferAmountScreen.p0;
                Intrinsics.checkNotNullParameter(it11, "it");
                Object obj3 = it11.f51981p;
                if (obj3 instanceof yof.b) {
                    return (yof.b) obj3;
                }
                return null;
            case 15:
                x it12 = (x) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return it12.f316256j;
            case 16:
                x it13 = (x) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return new Pair(it13.f316257l, it13.k);
            case 17:
                x state = (x) obj2;
                Intrinsics.checkNotNullParameter(state, "state");
                Data data = state.k;
                if (data == null || (kVar = (qrb.k) data.getContent()) == null) {
                    return null;
                }
                return new Pair(kVar.a(), Integer.valueOf(kVar.n().f214602m));
            case 18:
                x it14 = (x) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                bfl.g gVar = it14.f316252b;
                Data data2 = it14.k;
                return new yhm.r(gVar, data2 != null ? (qrb.k) data2.getContent() : null, it14.d);
            case 19:
                x it15 = (x) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return new Pair(it15.f316252b, it15.f316256j);
            case 20:
                x state2 = (x) obj2;
                Intrinsics.checkNotNullParameter(state2, "state");
                return state2.f316251a;
            case 21:
                x update = (x) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                String str = update.f316251a;
                Data data3 = update.f316255h;
                bfl.g gVar2 = bfl.g.BUY;
                BigDecimal ZERO = BigDecimal.ZERO;
                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                return x.a(update, str, gVar2, null, ZERO, ZERO, null, false, data3, null, null, null, null, new Data(null, null, true, 3, null), j0b.e.COLLAPSED, null, 18724);
            case 22:
                return ((x) obj2).f316258m;
            case 23:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return Boolean.TRUE;
            case 24:
                TotalWealthFlowContract$Step it16 = (TotalWealthFlowContract$Step) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return Boolean.valueOf(it16 instanceof TotalWealthFlowContract$Step.TotalWealth);
            case 25:
                List it17 = (List) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                if (it17.isEmpty()) {
                    return it17;
                }
                if (it17.size() >= 5) {
                    return it17.size() > 5 ? d0.W0(5, yrk.a.a(it17)) : yrk.a.a(it17);
                }
                List list2 = it17;
                boolean z3 = list2 instanceof Collection;
                if (!z3 || !list2.isEmpty()) {
                    Iterator it18 = list2.iterator();
                    while (it18.hasNext()) {
                        if (((uqk.d) it18.next()).f282209c != null) {
                            if (!z3 || !list2.isEmpty()) {
                                Iterator it19 = list2.iterator();
                                while (it19.hasNext()) {
                                    if (((uqk.d) it19.next()).f282209c == null) {
                                        return it17;
                                    }
                                }
                            }
                            List listA = yrk.a.a(it17);
                            uqk.d dVar3 = (uqk.d) d0.b0(listA);
                            int i21 = dVar3.f282208b;
                            Integer num = dVar3.f282209c;
                            int iIntValue = num != null ? num.intValue() : 0;
                            IntRange intRange = new IntRange(1, 5 - listA.size(), 1);
                            ArrayList arrayList4 = new ArrayList(w.t(intRange, 10));
                            vim.f it20 = intRange.iterator();
                            while (it20.f289625c) {
                                it20.nextInt();
                                iIntValue--;
                                if (iIntValue <= 0) {
                                    i21--;
                                    iIntValue = 4;
                                }
                                arrayList4.add(uqk.d.a(dVar3, i21, Integer.valueOf(iIntValue), 1));
                            }
                            return d0.E0(listA, yrk.a.a(arrayList4));
                        }
                    }
                }
                List listA2 = yrk.a.a(it17);
                uqk.d dVar4 = (uqk.d) d0.b0(listA2);
                IntRange intRange2 = new IntRange(1, 5 - listA2.size(), 1);
                ArrayList arrayList5 = new ArrayList(w.t(intRange2, 10));
                vim.f it21 = intRange2.iterator();
                while (it21.f289625c) {
                    arrayList5.add(uqk.d.a(dVar4, dVar4.f282208b - it21.nextInt(), null, 5));
                }
                return d0.E0(listA2, yrk.a.a(arrayList5));
            case 26:
                StockFinancialsStatementPeriodState stockFinancialsStatementPeriodState = (StockFinancialsStatementPeriodState) obj2;
                Integer num2 = stockFinancialsStatementPeriodState.f103797a;
                Integer num3 = stockFinancialsStatementPeriodState.f103798b;
                if (num2 != null) {
                    return new esk.b(num2.intValue(), true, num3);
                }
                return null;
            case 27:
                n instrument = (n) obj2;
                Intrinsics.checkNotNullParameter(instrument, "instrument");
                return instrument.e;
            case 28:
                xsk.c update2 = (xsk.c) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return xsk.c.a(update2, null, xsk.g.a(update2.f308555b, xsk.n.ANNUALLY, null, null, 6), 1);
            default:
                xsk.c update3 = (xsk.c) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return xsk.c.a(update3, null, xsk.g.a(update3.f308555b, xsk.n.QUARTERLY, null, null, 6), 1);
        }
    }

    public /* synthetic */ i(Object obj2, int i) {
        this.f315841a = i;
    }
}
