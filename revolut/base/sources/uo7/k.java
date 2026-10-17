package uo7;

import androidx.compose.material.IconKt;
import androidx.compose.material.TextFieldImplKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.room.util.SQLiteConnectionUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.core.ui_kit.delegates.widgets.SimpleTileWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.c4;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.be_driven_design.models.domain.FincrimeHomeScreen$V2;
import com.revolut.feature.freelancer.common.models.sale.FreelancerSalesFilters$CompoundFreelancerSalesFilter;
import com.revolut.feature.retail.savings.api.R$string;
import com.revolut.feature.tickets.api.models.TicketDetails;
import com.revolut.feature.wealth.models.robo.RoboPortfolioInfo;
import d9.e1;
import h93.p0;
import h93.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.PassportService;
import org.jmrtd.cbeff.ISO781611;
import v0f.t;
import v0f.u;
import zhm.d0;
import zhm.v;
import zhm.w;
import zw7.h0;
import zw7.h1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f281580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f281581b;

    public /* synthetic */ k(String str, int i) {
        this.f281580a = i;
        this.f281581b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i;
        String str;
        Object obj3;
        Object next;
        Object next2;
        Object next3;
        SQLiteStatement sQLiteStatementPrepare;
        Object next4;
        switch (this.f281580a) {
            case 0:
                e updateState = (e) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                boolean z = updateState.f281573b;
                String registrationNumber = this.f281581b;
                Intrinsics.checkNotNullParameter(registrationNumber, "registrationNumber");
                return new e(registrationNumber, z);
            case 1:
                up9.b updateState2 = (up9.b) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return up9.b.a(updateState2, this.f281581b, 0L, null, 0, ISO781611.SMT_TAG);
            case 2:
                rpb.e interestEarned = (rpb.e) obj2;
                Intrinsics.checkNotNullParameter(interestEarned, "interestEarned");
                rpb.g gVar = interestEarned.f256312a;
                ej0.b bVar = interestEarned.f256314c;
                int i2 = upb.b.f281941a[gVar.f256315a.ordinal()];
                if (i2 == 1) {
                    i = R$string.savings_statistics_earning_monthly;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R$string.savings_statistics_earning_weekly;
                }
                return new SimpleTileWidgetDelegate.Model(this.f281581b, new MoneyClause(mif.a.Q(interestEarned.f256313b), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new TextLocalisedClause(i, null, null, 14), null, new c4(new TextLocalisedClause(R$string.savings_widget_performance_all_time, null, null, 14), new MoneyClause(mif.a.Q(bVar), new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(e1.G(bVar.f126703a) ? R$attr.uikit_colorPerformancePositive : R$attr.uikit_colorForeground_50), false, null, false, null, 254), null, 8)), interestEarned.d, 40);
            case 3:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list = (List) pair.f186385a;
                RoboPortfolioInfo roboPortfolioInfo = (RoboPortfolioInfo) pair.f186386b;
                List list2 = list;
                Iterator it8 = list2.iterator();
                while (true) {
                    boolean zHasNext = it8.hasNext();
                    str = this.f281581b;
                    obj3 = null;
                    if (zHasNext) {
                        next = it8.next();
                        yvh.b bVar2 = (yvh.b) next;
                        if (!Intrinsics.f(bVar2.f317178c, str) || bVar2.e != yvh.h.WEALTH_PORTFOLIO) {
                        }
                    } else {
                        next = null;
                    }
                }
                yvh.b bVar3 = (yvh.b) next;
                for (Object obj4 : list2) {
                    yvh.b bVar4 = (yvh.b) obj4;
                    if (bVar4.f317177b && (!Intrinsics.f(bVar4.f317178c, str) || bVar4.e != yvh.h.WEALTH_PORTFOLIO)) {
                        obj3 = obj4;
                        return new upc.e(str, bVar3, v.k(xdh.c.ACTIVE, xdh.c.SUSPENDED).contains(roboPortfolioInfo.f95704g), (yvh.b) obj3);
                    }
                }
                return new upc.e(str, bVar3, v.k(xdh.c.ACTIVE, xdh.c.SUSPENDED).contains(roboPortfolioInfo.f95704g), (yvh.b) obj3);
            case 4:
                List requests = (List) obj2;
                Intrinsics.checkNotNullParameter(requests, "requests");
                od0.h hVar = od0.i.Companion;
                Iterator it9 = requests.iterator();
                while (true) {
                    if (it9.hasNext()) {
                        next2 = it9.next();
                        if (Intrinsics.f(((mr8.b) next2).f208073a, this.f281581b)) {
                        }
                    } else {
                        next2 = null;
                    }
                }
                hVar.getClass();
                return od0.h.a(next2);
            case 5:
                List tickets = (List) obj2;
                Intrinsics.checkNotNullParameter(tickets, "tickets");
                ArrayList arrayList = new ArrayList();
                for (Object obj5 : tickets) {
                    ArrayList arrayList2 = ((kse.a) obj5).f;
                    if (!arrayList2.isEmpty()) {
                        Iterator it10 = arrayList2.iterator();
                        while (true) {
                            if (it10.hasNext()) {
                                kse.b bVar5 = (kse.b) it10.next();
                                if ((bVar5.f189442b instanceof kse.d) && Intrinsics.f(bVar5.f189441a, this.f281581b)) {
                                    arrayList.add(obj5);
                                }
                            }
                        }
                    }
                }
                return d0.P0(arrayList, new use.c());
            case 6:
                FincrimeHomeScreen$V2 details = (FincrimeHomeScreen$V2) obj2;
                Intrinsics.checkNotNullParameter(details, "details");
                return new TicketDetails(this.f281581b, details);
            case 7:
                ux6.j update = (ux6.j) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return ux6.j.a(update, null, this.f281581b, false, false, false, 29);
            case 8:
                uyc.j update2 = (uyc.j) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return uyc.j.a(update2, this.f281581b, null, 27);
            case 9:
                List plans = (List) obj2;
                Intrinsics.checkNotNullParameter(plans, "plans");
                Iterator it11 = plans.iterator();
                while (true) {
                    if (it11.hasNext()) {
                        next3 = it11.next();
                        ArrayList arrayList3 = ((h0) next3).e;
                        if (!arrayList3.isEmpty()) {
                            Iterator it12 = arrayList3.iterator();
                            while (it12.hasNext()) {
                                if (Intrinsics.f(((h1) it12.next()).f325791a, this.f281581b)) {
                                }
                            }
                        }
                    } else {
                        next3 = null;
                    }
                }
                return (h0) next3;
            case 10:
                u update3 = (u) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return u.a(update3, null, null, this.f281581b, null, null, t.POSTCODE, null, null, false, false, false, false, false, false, 16347);
            case 11:
                u update4 = (u) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return u.a(update4, null, null, this.f281581b, null, null, null, null, null, false, false, false, false, false, false, 16379);
            case 12:
                u update5 = (u) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return u.a(update5, null, null, null, this.f281581b, null, null, null, null, false, false, false, false, false, false, 16375);
            case 13:
                return IconKt.Icon_ww6aTOc$lambda$2$0(this.f281581b, (SemanticsPropertyReceiver) obj2);
            case 14:
                return TextFieldImplKt.defaultErrorSemantics$lambda$0(this.f281581b, (SemanticsPropertyReceiver) obj2);
            case 15:
                FreelancerSalesFilters$CompoundFreelancerSalesFilter updateFilter = (FreelancerSalesFilters$CompoundFreelancerSalesFilter) obj2;
                Intrinsics.checkNotNullParameter(updateFilter, "$this$updateFilter");
                return FreelancerSalesFilters$CompoundFreelancerSalesFilter.a(updateFilter, null, null, null, null, m70.a.l(this.f281581b), null, null, PassportService.DEFAULT_MAX_BLOCKSIZE);
            case 16:
                FreelancerSalesFilters$CompoundFreelancerSalesFilter updateFilter2 = (FreelancerSalesFilters$CompoundFreelancerSalesFilter) obj2;
                Intrinsics.checkNotNullParameter(updateFilter2, "$this$updateFilter");
                return FreelancerSalesFilters$CompoundFreelancerSalesFilter.a(updateFilter2, null, null, null, null, null, m70.a.l(this.f281581b), null, 191);
            case 17:
                v23.f update6 = (v23.f) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                List suggestedNames = update6.f285630a;
                Intrinsics.checkNotNullParameter(suggestedNames, "suggestedNames");
                return new v23.f(suggestedNames, this.f281581b);
            case 18:
                v4a.e updateState3 = (v4a.e) obj2;
                Intrinsics.checkNotNullParameter(updateState3, "$this$updateState");
                return v4a.e.a(updateState3, this.f281581b, null, null, null, false, false, null, 254);
            case 19:
                eel.e it13 = (eel.e) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return new Pair(this.f281581b, it13);
            case 20:
                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
                sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM auto_invests WHERE ownerId = ?");
                String str2 = this.f281581b;
                try {
                    if (str2 == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, str2);
                    }
                    sQLiteStatementPrepare.step();
                    Integer numValueOf = Integer.valueOf(SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection));
                    sQLiteStatementPrepare.close();
                    return numValueOf;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case 21:
                SQLiteStatement sQLiteStatementPrepare2 = ((SQLiteConnection) obj2).prepare("SELECT * FROM auto_invests WHERE ownerId = ?");
                String str3 = this.f281581b;
                try {
                    if (str3 == null) {
                        sQLiteStatementPrepare2.bindNull(1);
                    } else {
                        sQLiteStatementPrepare2.bindText(1, str3);
                    }
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "isEnabled");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "targetId");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "targetType");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "targetName");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "dailySpendAmount");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "dailySpendCcy");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "percentage");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "multiplier");
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "strategy");
                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "ownerId");
                    int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "scope");
                    int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "createdDate");
                    ArrayList arrayList4 = new ArrayList();
                    while (sQLiteStatementPrepare2.step()) {
                        int i3 = columnIndexOrThrow;
                        arrayList4.add(new w5d.a(sQLiteStatementPrepare2.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow), ((int) sQLiteStatementPrepare2.getLong(columnIndexOrThrow2)) != 0, sQLiteStatementPrepare2.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow3), sQLiteStatementPrepare2.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow4), sQLiteStatementPrepare2.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow5), sQLiteStatementPrepare2.isNull(columnIndexOrThrow6) ? null : Long.valueOf(sQLiteStatementPrepare2.getLong(columnIndexOrThrow6)), sQLiteStatementPrepare2.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow7), sQLiteStatementPrepare2.isNull(columnIndexOrThrow8) ? null : Float.valueOf((float) sQLiteStatementPrepare2.getDouble(columnIndexOrThrow8)), sQLiteStatementPrepare2.isNull(columnIndexOrThrow9) ? null : Float.valueOf((float) sQLiteStatementPrepare2.getDouble(columnIndexOrThrow9)), sQLiteStatementPrepare2.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow10), sQLiteStatementPrepare2.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow11), sQLiteStatementPrepare2.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow12), sQLiteStatementPrepare2.isNull(columnIndexOrThrow13) ? null : Long.valueOf(sQLiteStatementPrepare2.getLong(columnIndexOrThrow13))));
                        columnIndexOrThrow = i3;
                        break;
                    }
                    sQLiteStatementPrepare2.close();
                    return arrayList4;
                } finally {
                }
            case 22:
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM auto_invests WHERE id = ?");
                String str4 = this.f281581b;
                try {
                    if (str4 == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, str4);
                    }
                    int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isEnabled");
                    int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "targetId");
                    int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "targetType");
                    int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "targetName");
                    int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "dailySpendAmount");
                    int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "dailySpendCcy");
                    int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "percentage");
                    int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "multiplier");
                    int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "strategy");
                    int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ownerId");
                    int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "scope");
                    int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createdDate");
                    Object aVar = sQLiteStatementPrepare.step() ? new w5d.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow15)) != 0, sQLiteStatementPrepare.isNull(columnIndexOrThrow16) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow16), sQLiteStatementPrepare.isNull(columnIndexOrThrow17) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow17), sQLiteStatementPrepare.isNull(columnIndexOrThrow18) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow18), sQLiteStatementPrepare.isNull(columnIndexOrThrow19) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow19)), sQLiteStatementPrepare.isNull(columnIndexOrThrow20) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow20), sQLiteStatementPrepare.isNull(columnIndexOrThrow21) ? null : Float.valueOf((float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow21)), sQLiteStatementPrepare.isNull(columnIndexOrThrow22) ? null : Float.valueOf((float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow22)), sQLiteStatementPrepare.isNull(columnIndexOrThrow23) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow23), sQLiteStatementPrepare.isNull(columnIndexOrThrow24) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow24), sQLiteStatementPrepare.isNull(columnIndexOrThrow25) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow25), sQLiteStatementPrepare.isNull(columnIndexOrThrow26) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow26))) : null;
                    sQLiteStatementPrepare.close();
                    return aVar;
                } finally {
                }
            case 23:
                v6i.f update7 = (v6i.f) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                return v6i.f.a(update7, this.f281581b, null, 62);
            case 24:
                List cards = (List) obj2;
                Intrinsics.checkNotNullParameter(cards, "cards");
                List<p6l.j> list3 = cards;
                ArrayList arrayList5 = new ArrayList(w.t(list3, 10));
                for (p6l.j jVar : list3) {
                    Intrinsics.checkNotNullParameter(jVar, "<this>");
                    String fallbackTokenUniqueReference = this.f281581b;
                    Intrinsics.checkNotNullParameter(fallbackTokenUniqueReference, "fallbackTokenUniqueReference");
                    String cardId = jVar.getCardId();
                    String tokenUniqueReference = jVar.getTokenUniqueReference();
                    if (tokenUniqueReference != null) {
                        fallbackTokenUniqueReference = tokenUniqueReference;
                    }
                    p0 p0Var = q0.Companion;
                    String type = jVar.getTokenRequestor();
                    p0Var.getClass();
                    Intrinsics.checkNotNullParameter(type, "type");
                    Iterator<E> it14 = q0.a().iterator();
                    while (true) {
                        if (it14.hasNext()) {
                            next4 = it14.next();
                            if (Intrinsics.f(((q0) next4).name(), type)) {
                            }
                        } else {
                            next4 = null;
                        }
                    }
                    q0 q0Var = (q0) next4;
                    if (q0Var == null) {
                        q0Var = q0.UNKNOWN;
                    }
                    arrayList5.add(new h93.v(cardId, fallbackTokenUniqueReference, q0Var));
                }
                return arrayList5;
            case 25:
                u6l.j it15 = (u6l.j) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return Boolean.valueOf(Intrinsics.f(it15.getId(), this.f281581b));
            case 26:
                u6l.j it16 = (u6l.j) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return Boolean.valueOf(Intrinsics.f(it16.getWalletId(), this.f281581b));
            case 27:
                u6l.j it17 = (u6l.j) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return Boolean.valueOf(Intrinsics.f(it17.getId(), this.f281581b));
            case 28:
                v7e.g updateState4 = (v7e.g) obj2;
                Intrinsics.checkNotNullParameter(updateState4, "$this$updateState");
                return v7e.g.a(updateState4, kotlin.text.d0.F0(this.f281581b).toString(), null, null, null, 21);
            default:
                return v9f.g.a((v9f.g) obj2, this.f281581b, null, 2);
        }
    }

    public /* synthetic */ k(String str, rul.e eVar) {
        this.f281580a = 3;
        this.f281581b = str;
    }

    public /* synthetic */ k(upb.d dVar, String str) {
        this.f281580a = 2;
        this.f281581b = str;
    }
}
