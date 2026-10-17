package jt2;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.SmallStockCardDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.crypto_investments.models.SplitAccountsItemGroup;
import com.revolut.feature.toggles.models.FeatureDefinition;
import com.revolut.feature.transport.impl.ui.hub.transit.TransportHubTransitScreen;
import com.revolut.feature.transport.models.transit.TransitTicket;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import hxb.c0;
import ip0.gu;
import ip0.s7;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import kotlin.text.a0;
import m1c.a1;
import m1c.b1;
import wp5.y;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178318a;

    public /* synthetic */ d(int i) {
        this.f178318a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        m1c.r rVar;
        m1c.r rVar2;
        boolean z = true;
        switch (this.f178318a) {
            case 0:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return f0.f322471a;
            case 1:
                Function0 it9 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new jt4.c(null, zhm.v.k(new s7("id_credit_card_bottom_sheet_loading_1", 0, 0, 0, 0, false, null, 126), new s7("id_credit_card_bottom_sheet_loading_2", 0, 0, 0, 0, false, null, 126)), new lw0.h(lw0.i.TITLE_SUBTITLE));
            case 2:
                String name = ((FeatureDefinition) obj2).getClass().getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                return name;
            case 3:
                Function0 it10 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return f0.f322471a;
            case 4:
                nel.n it11 = (nel.n) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return zi0.c.P(it11, false, null, 3);
            case 5:
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("DELETE FROM staking_pockets");
                try {
                    sQLiteStatementPrepare.step();
                    return null;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case 6:
                Function0 it12 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return juk.j.a();
            case 7:
                Function0 it13 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return juk.j.a();
            case 8:
                Function0 it14 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return null;
            case 9:
                Function0 it15 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 10:
                Function0 it16 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return null;
            case 11:
                Function0 it17 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return new hul.q(45, jul.m.a());
            case 12:
                IntRange intRange = new IntRange(1, 3, 1);
                ArrayList arrayList = new ArrayList(zhm.w.t(intRange, 10));
                vim.f it18 = intRange.iterator();
                while (it18.f289625c) {
                    arrayList.add(new SplitAccountsItemGroup.LoadingItem(a0.d.n("LOADING_EARN_ITEM_", it18.nextInt()), true, true));
                }
                return new SplitAccountsItemGroup.LoadingGroup(arrayList);
            case 13:
                List it19 = (List) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return d0.I0(it19);
            case 14:
                yoj.a aVar = (yoj.a) obj2;
                return y.s(aVar, "it", aVar);
            case 15:
                NaviCommand it20 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return Boolean.TRUE;
            case 16:
                NaviCommand command = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(command, "command");
                return new q06.h(new BridgeDestination(command), null);
            case 17:
                jvc.i update = (jvc.i) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return jvc.i.a(update, false, null, null, null, null, null, false, null, Boolean.FALSE, false, null, 64511);
            case 18:
                return jvc.i.a((jvc.i) obj2, false, null, null, null, null, null, false, null, null, false, null, 65471);
            case 19:
                return jvc.i.a((jvc.i) obj2, false, null, null, null, null, null, false, null, null, false, null, 65519);
            case 20:
                return ((Boolean) obj2).booleanValue() ? new b39.a(b39.d.REV_POINTS_GIFT_CARDS) : b39.b.f12015a;
            case 21:
                CellDetailsChevronDelegate.Model it21 = (CellDetailsChevronDelegate.Model) obj2;
                KProperty[] kPropertyArr = TransportHubTransitScreen.f92543e0;
                Intrinsics.checkNotNullParameter(it21, "it");
                return Boolean.valueOf(Intrinsics.f(it21.f51822a, "GET_HELP_ITEM_ID"));
            case 22:
                ListSubheaderDelegate.Model it22 = (ListSubheaderDelegate.Model) obj2;
                KProperty[] kPropertyArr2 = TransportHubTransitScreen.f92543e0;
                Intrinsics.checkNotNullParameter(it22, "it");
                Object obj3 = it22.f52715m;
                if (obj3 instanceof jwf.h) {
                    return (jwf.h) obj3;
                }
                return null;
            case 23:
                SmallStockCardDelegate.Model it23 = (SmallStockCardDelegate.Model) obj2;
                KProperty[] kPropertyArr3 = TransportHubTransitScreen.f92543e0;
                Intrinsics.checkNotNullParameter(it23, "it");
                Object obj4 = it23.f53388p;
                if (obj4 instanceof TransitTicket) {
                    return (TransitTicket) obj4;
                }
                return null;
            case 24:
                FullScreenStateDelegate.Model it24 = (FullScreenStateDelegate.Model) obj2;
                KProperty[] kPropertyArr4 = TransportHubTransitScreen.f92543e0;
                Intrinsics.checkNotNullParameter(it24, "it");
                Object obj5 = it24.k;
                if (obj5 instanceof jwf.d) {
                    return (jwf.d) obj5;
                }
                return null;
            case 25:
                jwf.e updateState = (jwf.e) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return jwf.e.a(updateState, null, false, Data.copy$default(updateState.f178979c, null, null, true, 3, null), 3);
            case 26:
                Function0 it25 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it25, "it");
                return zhm.v.k(new gu("LOADING_HEADER", 0, 0, 30), nvf.h.a(3));
            case 27:
                yoj.f features = (yoj.f) obj2;
                Intrinsics.checkNotNullParameter(features, "features");
                List list = jwg.h.f;
                if ((list instanceof Collection) && list.isEmpty()) {
                    z = false;
                } else {
                    Iterator it26 = list.iterator();
                    while (it26.hasNext()) {
                        if (hx7.l.q(features, (yoj.c) it26.next())) {
                        }
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 28:
                List rates = (List) obj2;
                Intrinsics.checkNotNullParameter(rates, "rates");
                List<c0> list2 = rates;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                for (c0 c0Var : list2) {
                    Intrinsics.checkNotNullParameter(c0Var, "<this>");
                    String tier = c0Var.getTier();
                    m1c.r[] rVarArrValues = m1c.r.values();
                    int length = rVarArrValues.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            rVar = rVarArrValues[i];
                            if (!a0.z(rVar.name(), tier, true)) {
                                i++;
                            }
                        } else {
                            rVar = null;
                        }
                    }
                    if (rVar == null) {
                        rVar = m1c.r.UNKNOWN;
                    }
                    arrayList2.add(new a1(rVar, c0Var.getBaseRate()));
                }
                return arrayList2;
            default:
                List rates2 = (List) obj2;
                Intrinsics.checkNotNullParameter(rates2, "rates");
                List<hxb.d0> list3 = rates2;
                ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
                for (hxb.d0 d0Var : list3) {
                    Intrinsics.checkNotNullParameter(d0Var, "<this>");
                    String planTier = d0Var.getPlanTier();
                    m1c.r[] rVarArrValues2 = m1c.r.values();
                    int length2 = rVarArrValues2.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length2) {
                            rVar2 = rVarArrValues2[i2];
                            if (!a0.z(rVar2.name(), planTier, true)) {
                                i2++;
                            }
                        } else {
                            rVar2 = null;
                        }
                    }
                    if (rVar2 == null) {
                        rVar2 = m1c.r.UNKNOWN;
                    }
                    arrayList3.add(new b1(rVar2, d0Var.getReward(), mo3.a.o(d0Var.getAmountToSpend())));
                }
                return arrayList3;
        }
    }

    public /* synthetic */ d(Object obj2, int i) {
        this.f178318a = i;
    }
}
