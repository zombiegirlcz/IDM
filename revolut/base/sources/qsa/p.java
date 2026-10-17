package qsa;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.blik.impl.ui.settings.BlikSettingsScreen;
import com.revolut.feature.apm.breb.impl.ui.register.BrebRegisterScreen;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.transfer.models.transfer.TransferTrustData;
import com.revolut.feature.transfer_reasons.impl.flow.TransferReasonsFlowContract$State;
import ip0.nb0;
import ip0.pb0;
import ip0.qi;
import ip0.v7;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import retrofit2.HttpException;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f248781a;

    public /* synthetic */ p(int i) {
        this.f248781a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        boolean z = false;
        Long lValueOf = null;
        switch (this.f248781a) {
            case 0:
                i it8 = (i) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.f248770b;
            case 1:
                i it9 = (i) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new Pair(it9.f248770b, it9.f248771c);
            case 2:
                j updateExtraData = (j) obj2;
                Intrinsics.checkNotNullParameter(updateExtraData, "$this$updateExtraData");
                TransferTrustData trustData = com.revolut.feature.transfer.models.transfer.a.b(updateExtraData.f248773b);
                kqa.a aVar = updateExtraData.f248772a;
                Intrinsics.checkNotNullParameter(trustData, "trustData");
                return new j(aVar, trustData);
            case 3:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                String id10 = (String) pair.f186385a;
                String type = (String) pair.f186386b;
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(type, "type");
                return a0.d.u(new StringBuilder("TICKETS_"), id10, "_", type);
            case 4:
                Throwable it10 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                if ((it10 instanceof HttpException) && ((HttpException) it10).code() == 422) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 5:
                Data data = (Data) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                return Boolean.valueOf(!Intrinsics.f(data, new Data(null, null, false, 7, null)));
            case 6:
                TransferReasonsFlowContract$State it11 = (TransferReasonsFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return it11.f92332a;
            case 7:
                TransferReasonsFlowContract$State update = (TransferReasonsFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                h0 h0Var = h0.f322473a;
                f0 f0Var = f0.f322471a;
                return TransferReasonsFlowContract$State.a(update, null, h0Var, f0Var, f0Var, false, null, 32);
            case 8:
                TransferReasonsFlowContract$State it12 = (TransferReasonsFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return it12.f92333b;
            case 9:
                od0.i it13 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return (g0j.a) it13.c();
            case 10:
                com.revolut.core.ui_kit.delegates.t it14 = (com.revolut.core.ui_kit.delegates.t) obj2;
                KProperty[] kPropertyArr = BlikSettingsScreen.S;
                Intrinsics.checkNotNullParameter(it14, "it");
                return Boolean.valueOf(Intrinsics.f(it14.f54722b.f51590a, "ID_ITEM_REGISTER_PROMPT"));
            case 11:
                RowDelegate.Model it15 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr2 = BlikSettingsScreen.S;
                Intrinsics.checkNotNullParameter(it15, "it");
                return Boolean.valueOf(Intrinsics.f(it15.f53228a, "ID_ITEM_REGISTERED_PHONE"));
            case 12:
                return qu1.a.a((qu1.a) obj2, null);
            case 13:
                qu4.i it16 = (qu4.i) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return it16.f249223a;
            case 14:
                qu8.d update2 = (qu8.d) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                boolean z3 = update2.f249264b;
                update2.getClass();
                return new qu8.d(true, z3);
            case 15:
                qu8.d update3 = (qu8.d) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                boolean z4 = update3.f249263a;
                update3.getClass();
                return new qu8.d(z4, true);
            case 16:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 17:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 18:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return Boolean.FALSE;
            case 19:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                m70.a.c(t0.f186434a);
                return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            case 20:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                bw0.m.Companion.getClass();
                return bw0.k.a();
            case 21:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                m70.a.c(t0.f186434a);
                return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            case 22:
                List statements = (List) obj2;
                Intrinsics.checkNotNullParameter(statements, "statements");
                List listK = v.k(vl4.c.ONGOING, vl4.c.CLOSED, vl4.c.FUTURE);
                List listC = zhm.u.c(vl4.c.PAST);
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : statements) {
                    vl4.i iVar = (vl4.i) obj3;
                    if (listC.contains(iVar.f) || listK.contains(iVar.f)) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : arrayList) {
                    if (listK.contains(((vl4.i) obj4).f)) {
                        arrayList2.add(obj4);
                    } else {
                        arrayList3.add(obj4);
                    }
                }
                List listP0 = d0.P0(arrayList2, new qv4.l());
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj5 : listP0) {
                    Integer numValueOf = Integer.valueOf(((vl4.i) obj5).f290263a.getYear());
                    Object objU = linkedHashMap.get(numValueOf);
                    if (objU == null) {
                        objU = v7.u(linkedHashMap, numValueOf);
                    }
                    ((List) objU).add(obj5);
                }
                List listP02 = d0.P0(arrayList3, new qv4.m());
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Object obj6 : listP02) {
                    Integer numValueOf2 = Integer.valueOf(((vl4.i) obj6).f290263a.getYear());
                    Object objU2 = linkedHashMap2.get(numValueOf2);
                    if (objU2 == null) {
                        objU2 = v7.u(linkedHashMap2, numValueOf2);
                    }
                    ((List) objU2).add(obj6);
                }
                return new qv4.e(linkedHashMap, linkedHashMap2);
            case 23:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                List list = (List) getDefaultLoadingItems.invoke();
                aim.e eVarB = zhm.u.b();
                eVarB.add(new qi("id_credit_card_statement_hub_tab_loading", qv4.f.a().size()));
                eVarB.addAll(list);
                return new qv4.j(zhm.u.a(eVarB));
            case 24:
                aii.q outputData = (aii.q) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                System.out.println((Object) ("[TRANSPORT][HUB] " + outputData));
                return Unit.f186387a;
            case 25:
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT lastModified FROM trips_metadata WHERE id = 0");
                try {
                    if (sQLiteStatementPrepare.step() && !sQLiteStatementPrepare.isNull(0)) {
                        lValueOf = Long.valueOf(sQLiteStatementPrepare.getLong(0));
                        break;
                    }
                    return lValueOf;
                } finally {
                }
            case 26:
                try {
                    ((SQLiteConnection) obj2).prepare("DELETE FROM trips_metadata").step();
                    return null;
                } finally {
                }
            case 27:
                try {
                    ((SQLiteConnection) obj2).prepare("DELETE FROM trips").step();
                    return null;
                } finally {
                }
            case 28:
                SelectableDelegate.Model it17 = (SelectableDelegate.Model) obj2;
                KProperty[] kPropertyArr3 = BrebRegisterScreen.R;
                Intrinsics.checkNotNullParameter(it17, "it");
                Object obj7 = it17.k;
                if (obj7 instanceof Alias) {
                    return (Alias) obj7;
                }
                return null;
            default:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                pb0 pb0VarB = nb0.b(pb0.Companion, "STREET_MODE_LOADING_LIST_ID", false, 0, false, 30);
                yp0.b.l(pb0VarB, 0, 0, 0, 0, null, false, 63);
                return zhm.u.c(pb0VarB);
        }
    }
}
