package mk3;

import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.data.model.Data;
import com.revolut.feature.crypto.remittance.api.navigation.CryptoRemittanceKompotFeatureConfig;
import com.revolut.feature.unified_transactions.models.UnifiedTransaction;
import com.revolut.feature.wealth.api.domain.model.transactions.InvestTransaction;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.management.FamilyPlanManagementScreen;
import ip0.nb0;
import ip0.pb0;
import ip0.x10;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import lha.g;
import ml3.o;
import ml3.p;
import od0.i;
import org.joda.time.DateTime;
import tof.a3;
import vf0.h;
import zhm.f0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f206176a;

    public /* synthetic */ c(int i) {
        this.f206176a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteStatement sQLiteStatementPrepare;
        switch (this.f206176a) {
            case 0:
                gk3.a it8 = (gk3.a) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(it8.f144316a != gk3.c.UNKNOWN);
            case 1:
                gk3.a it9 = (gk3.a) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9.f144316a;
            case 2:
                List it10 = (List) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return new CryptoRemittanceKompotFeatureConfig.CurrencyPickerDestination.InputData.Currencies.DefaultSorting(it10);
            case 3:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                Pair pair2 = (Pair) pair.f186385a;
                Pair pair3 = (Pair) pair.f186386b;
                return new h(pair2.f186385a, pair2.f186386b, pair3.f186385a, pair3.f186386b);
            case 4:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return new Data(f0.f322471a, null, false, 2, null);
            case 5:
                pd5.d it11 = (pd5.d) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return it11.f235097c;
            case 6:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return f0.f322471a;
            case 7:
                eda.e it12 = (eda.e) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return it12.f124961a.f163145a;
            case 8:
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                Iterator it13 = list.iterator();
                while (it13.hasNext()) {
                    arrayList.add(new UnifiedTransaction.Invest((InvestTransaction) it13.next()));
                }
                return arrayList;
            case 9:
                List transactions = (List) obj2;
                Intrinsics.checkNotNullParameter(transactions, "transactions");
                List list2 = transactions;
                ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                Iterator it14 = list2.iterator();
                while (it14.hasNext()) {
                    arrayList2.add(new UnifiedTransaction.Standard((a3) it14.next()));
                }
                return arrayList2;
            case 10:
                RowDelegate.Model it15 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr = FamilyPlanManagementScreen.U;
                Intrinsics.checkNotNullParameter(it15, "it");
                return it15.u;
            case 11:
                RowDelegate.Model it16 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr2 = FamilyPlanManagementScreen.U;
                Intrinsics.checkNotNullParameter(it16, "it");
                RowDelegate.Model.c cVar = it16.k;
                pf pfVar = cVar instanceof pf ? (pf) cVar : null;
                if (pfVar != null) {
                    return pfVar.f;
                }
                return null;
            case 12:
                CellDetailsChevronDelegate.Model it17 = (CellDetailsChevronDelegate.Model) obj2;
                KProperty[] kPropertyArr3 = FamilyPlanManagementScreen.U;
                Intrinsics.checkNotNullParameter(it17, "it");
                return it17.e;
            case 13:
                ListSubheaderDelegate.Model it18 = (ListSubheaderDelegate.Model) obj2;
                KProperty[] kPropertyArr4 = FamilyPlanManagementScreen.U;
                Intrinsics.checkNotNullParameter(it18, "it");
                return it18.f52715m;
            case 14:
                x10 it19 = (x10) obj2;
                KProperty[] kPropertyArr5 = FamilyPlanManagementScreen.U;
                Intrinsics.checkNotNullParameter(it19, "it");
                return it19.f167081a.i;
            case 15:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                nb0 nb0Var = pb0.Companion;
                List listK = v.k(nb0.b(nb0Var, "item_loading_1", false, 0, false, 30), nb0.b(nb0Var, "item_loading_2", false, 0, false, 30));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                return listK;
            case 16:
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT COUNT(*) FROM contact");
                try {
                    return Integer.valueOf(sQLiteStatementPrepare.step() ? (int) sQLiteStatementPrepare.getLong(0) : 0);
                } finally {
                }
            case 17:
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT COUNT(*) FROM contact");
                try {
                    return Integer.valueOf(sQLiteStatementPrepare.step() ? (int) sQLiteStatementPrepare.getLong(0) : 0);
                } finally {
                }
            case 18:
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM remote_contacts");
                try {
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "code");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "username");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "legalName");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "firstName");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "lastName");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "country");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "appMode");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "businessName");
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "transactionsCount");
                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timestamp");
                    ArrayList arrayList3 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList3.add(new o(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6), sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7), sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8), sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10), sQLiteStatementPrepare.getLong(columnIndexOrThrow11)));
                        break;
                    }
                    return arrayList3;
                } finally {
                }
            case 19:
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM remote_contacts WHERE timestamp IS NOT 0 AND type != 'JUNIOR' ORDER BY timestamp DESC");
                try {
                    int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "code");
                    int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "username");
                    int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "legalName");
                    int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "firstName");
                    int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "lastName");
                    int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "country");
                    int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "appMode");
                    int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
                    int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "businessName");
                    int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "transactionsCount");
                    int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timestamp");
                    ArrayList arrayList4 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList4.add(new o(sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12), sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13), sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14), sQLiteStatementPrepare.isNull(columnIndexOrThrow15) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow15), sQLiteStatementPrepare.isNull(columnIndexOrThrow16) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow16), sQLiteStatementPrepare.isNull(columnIndexOrThrow17) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow17), sQLiteStatementPrepare.isNull(columnIndexOrThrow18) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow18), sQLiteStatementPrepare.isNull(columnIndexOrThrow19) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow19), sQLiteStatementPrepare.isNull(columnIndexOrThrow20) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow20), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow21), sQLiteStatementPrepare.getLong(columnIndexOrThrow22)));
                        break;
                    }
                    return arrayList4;
                } finally {
                }
            case 20:
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM remote_contacts WHERE timestamp IS NOT 0 ORDER BY timestamp DESC");
                try {
                    int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "code");
                    int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "username");
                    int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "legalName");
                    int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "firstName");
                    int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "lastName");
                    int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "country");
                    int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "appMode");
                    int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
                    int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "businessName");
                    int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "transactionsCount");
                    int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timestamp");
                    ArrayList arrayList5 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList5.add(new o(sQLiteStatementPrepare.isNull(columnIndexOrThrow23) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow23), sQLiteStatementPrepare.isNull(columnIndexOrThrow24) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow24), sQLiteStatementPrepare.isNull(columnIndexOrThrow25) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow25), sQLiteStatementPrepare.isNull(columnIndexOrThrow26) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow26), sQLiteStatementPrepare.isNull(columnIndexOrThrow27) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow27), sQLiteStatementPrepare.isNull(columnIndexOrThrow28) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow28), sQLiteStatementPrepare.isNull(columnIndexOrThrow29) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow29), sQLiteStatementPrepare.isNull(columnIndexOrThrow30) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow30), sQLiteStatementPrepare.isNull(columnIndexOrThrow31) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow31), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow32), sQLiteStatementPrepare.getLong(columnIndexOrThrow33)));
                        break;
                    }
                    return arrayList5;
                } finally {
                }
            case 21:
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM remote_contacts_extra WHERE paidPlan IS NOT NULL");
                try {
                    int columnIndexOrThrow34 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "code");
                    int columnIndexOrThrow35 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "username");
                    int columnIndexOrThrow36 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paidPlan");
                    int columnIndexOrThrow37 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "birthday");
                    int columnIndexOrThrow38 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "legalName");
                    int columnIndexOrThrow39 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "firstName");
                    int columnIndexOrThrow40 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "lastName");
                    int columnIndexOrThrow41 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "businessName");
                    ArrayList arrayList6 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList6.add(new p(sQLiteStatementPrepare.isNull(columnIndexOrThrow34) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow34), sQLiteStatementPrepare.isNull(columnIndexOrThrow35) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow35), sQLiteStatementPrepare.isNull(columnIndexOrThrow36) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow36), sQLiteStatementPrepare.isNull(columnIndexOrThrow37) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow37), sQLiteStatementPrepare.isNull(columnIndexOrThrow38) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow38), sQLiteStatementPrepare.isNull(columnIndexOrThrow39) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow39), sQLiteStatementPrepare.isNull(columnIndexOrThrow40) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow40), sQLiteStatementPrepare.isNull(columnIndexOrThrow41) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow41)));
                        break;
                    }
                    return arrayList6;
                } finally {
                }
            case 22:
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM remote_contacts_extra");
                try {
                    int columnIndexOrThrow42 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "code");
                    int columnIndexOrThrow43 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "username");
                    int columnIndexOrThrow44 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paidPlan");
                    int columnIndexOrThrow45 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "birthday");
                    int columnIndexOrThrow46 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "legalName");
                    int columnIndexOrThrow47 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "firstName");
                    int columnIndexOrThrow48 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "lastName");
                    int columnIndexOrThrow49 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "businessName");
                    ArrayList arrayList7 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList7.add(new p(sQLiteStatementPrepare.isNull(columnIndexOrThrow42) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow42), sQLiteStatementPrepare.isNull(columnIndexOrThrow43) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow43), sQLiteStatementPrepare.isNull(columnIndexOrThrow44) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow44), sQLiteStatementPrepare.isNull(columnIndexOrThrow45) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow45), sQLiteStatementPrepare.isNull(columnIndexOrThrow46) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow46), sQLiteStatementPrepare.isNull(columnIndexOrThrow47) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow47), sQLiteStatementPrepare.isNull(columnIndexOrThrow48) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow48), sQLiteStatementPrepare.isNull(columnIndexOrThrow49) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow49)));
                        break;
                    }
                    return arrayList7;
                } finally {
                }
            case 23:
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM remote_contacts_extra");
                try {
                    int columnIndexOrThrow50 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "code");
                    int columnIndexOrThrow51 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "username");
                    int columnIndexOrThrow52 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paidPlan");
                    int columnIndexOrThrow53 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "birthday");
                    int columnIndexOrThrow54 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "legalName");
                    int columnIndexOrThrow55 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "firstName");
                    int columnIndexOrThrow56 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "lastName");
                    int columnIndexOrThrow57 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "businessName");
                    ArrayList arrayList8 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList8.add(new p(sQLiteStatementPrepare.isNull(columnIndexOrThrow50) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow50), sQLiteStatementPrepare.isNull(columnIndexOrThrow51) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow51), sQLiteStatementPrepare.isNull(columnIndexOrThrow52) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow52), sQLiteStatementPrepare.isNull(columnIndexOrThrow53) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow53), sQLiteStatementPrepare.isNull(columnIndexOrThrow54) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow54), sQLiteStatementPrepare.isNull(columnIndexOrThrow55) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow55), sQLiteStatementPrepare.isNull(columnIndexOrThrow56) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow56), sQLiteStatementPrepare.isNull(columnIndexOrThrow57) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow57)));
                        break;
                    }
                    return arrayList8;
                } finally {
                }
            case 24:
                Intrinsics.checkNotNullParameter((Pair) obj2, "it");
                return Boolean.TRUE;
            case 25:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                pb0 pb0Var = new pb0("selected-currency-is-loading-list-id");
                yp0.b.l(pb0Var, 0, 0, 0, 0, null, false, 63);
                return pb0Var;
            case 26:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.TRUE;
            case 27:
                qha.a it20 = (qha.a) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                DateTime dateTime = it20.f;
                Date date = dateTime != null ? dateTime.toDate() : null;
                iha.w wVar = it20.f246569h;
                return new mlk.w(date, wVar != null ? wVar.f161358a : null);
            case 28:
                qha.a it21 = (qha.a) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                DateTime dateTime2 = it21.f;
                Date date2 = dateTime2 != null ? dateTime2.toDate() : null;
                iha.w wVar2 = it21.f246569h;
                return new mlk.w(date2, wVar2 != null ? wVar2.f161358a : null);
            default:
                g it22 = (g) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                i.Companion.getClass();
                return od0.h.a(it22);
        }
    }
}
