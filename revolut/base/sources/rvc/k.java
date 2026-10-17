package rvc;

import androidx.content.internal.NavControllerImpl;
import androidx.room.util.SQLiteConnectionUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import aw0.o9;
import ba6.r;
import ce9.p;
import com.revolut.core.ui_kit.delegates.widgets.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ErrorWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.LineChartLoadingTileWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.LineChartTileWidgetDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.data.model.Data;
import com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBookingContactDetails;
import com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBookingQuestionAnswer;
import com.youTransactor.uCube.rpc.Constants;
import h93.f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import jq9.t;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import op0.q;
import org.jmrtd.cbeff.ISO781611;
import zhm.a0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f257749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f257750b;

    public /* synthetic */ k(int i, String str, Object obj2) {
        this.f257749a = i;
        this.f257750b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object model;
        Object next;
        int i;
        int i2;
        Long lValueOf;
        switch (this.f257749a) {
            case 0:
                f update = (f) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                Clause clause = update.f257744b;
                String locationName = this.f257750b;
                Intrinsics.checkNotNullParameter(locationName, "locationName");
                return new f(clause, locationName);
            case 1:
                rx6.m update2 = (rx6.m) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return rx6.m.a(update2, null, false, this.f257750b, null, false, 55);
            case 2:
                ry5.f update3 = (ry5.f) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                p pagingState = update3.f258227a;
                update3.getClass();
                Intrinsics.checkNotNullParameter(pagingState, "pagingState");
                String query = this.f257750b;
                Intrinsics.checkNotNullParameter(query, "query");
                return new ry5.f(pagingState, query);
            case 3:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                c71.b bVar = (c71.b) pair.f186385a;
                return new ryd.o(bVar, Intrinsics.f(bVar.f21829c, this.f257750b) && ((Boolean) pair.f186386b).booleanValue());
            case 4:
                s32.e update4 = (s32.e) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                List pagerItems = update4.f259398a;
                Clause scannerTabClause = update4.f259400c;
                Clause detailsTabClause = update4.d;
                Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
                String selectedPagerItemId = this.f257750b;
                Intrinsics.checkNotNullParameter(selectedPagerItemId, "selectedPagerItemId");
                Intrinsics.checkNotNullParameter(scannerTabClause, "scannerTabClause");
                Intrinsics.checkNotNullParameter(detailsTabClause, "detailsTabClause");
                return new s32.e(pagerItems, selectedPagerItemId, scannerTabClause, detailsTabClause);
            case 5:
                v1d.i data = (v1d.i) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                boolean z = data instanceof v1d.e;
                String str = this.f257750b;
                if (z) {
                    return LineChartTileWidgetDelegate.Model.Companion.b(LineChartTileWidgetDelegate.Model.INSTANCE, str, ((v1d.e) data).f285292a);
                }
                if (data instanceof v1d.f) {
                    v1d.f fVar = (v1d.f) data;
                    model = new ActionWidgetDelegate.Model(str, fVar.f285294b, fVar.f285293a);
                } else {
                    if (!(data instanceof v1d.g)) {
                        if (data instanceof v1d.h) {
                            return LineChartLoadingTileWidgetDelegate.Model.Companion.b(LineChartLoadingTileWidgetDelegate.Model.INSTANCE, str);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    v1d.g gVar = (v1d.g) data;
                    model = new ErrorWidgetDelegate.Model(str, null, gVar.f285295a, gVar.f285296b, q.SMALL, null, null, Constants.TAG_E2_CONFIGURATION_PAYMENT_SCHEME_CUSTOMIZATION);
                }
                return model;
            case 6:
                s3g.d updateState = (s3g.d) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return s3g.d.a(updateState, null, null, null, TravelExperiencesBookingContactDetails.a(updateState.f, this.f257750b, null, null, null, 14), 31);
            case 7:
                s3g.d updateState2 = (s3g.d) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return s3g.d.a(updateState2, null, null, null, TravelExperiencesBookingContactDetails.a(updateState2.f, null, this.f257750b, null, null, 13), 31);
            case 8:
                s3g.d updateState3 = (s3g.d) obj2;
                Intrinsics.checkNotNullParameter(updateState3, "$this$updateState");
                return s3g.d.a(updateState3, null, null, null, TravelExperiencesBookingContactDetails.a(updateState3.f, null, null, this.f257750b, null, 11), 31);
            case 9:
                s3g.d updateState4 = (s3g.d) obj2;
                Intrinsics.checkNotNullParameter(updateState4, "$this$updateState");
                return s3g.d.a(updateState4, null, null, null, TravelExperiencesBookingContactDetails.a(updateState4.f, null, null, null, this.f257750b, 7), 31);
            case 10:
                h3g.a updateAnswer = (h3g.a) obj2;
                Intrinsics.checkNotNullParameter(updateAnswer, "$this$updateAnswer");
                TravelExperiencesBookingQuestionAnswer travelExperiencesBookingQuestionAnswer = updateAnswer.f149114a;
                String str2 = this.f257750b;
                return h3g.a.a(updateAnswer, TravelExperiencesBookingQuestionAnswer.a(travelExperiencesBookingQuestionAnswer, str2, null, 29), new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, null, 12);
            case 11:
                return Boolean.valueOf(NavControllerImpl.restoreStateInternal$lambda$51(this.f257750b, (String) obj2));
            case 12:
                s6d.j update5 = (s6d.j) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                Data data2 = update5.f260240a;
                k6d.h hVar = (k6d.h) data2.getContent();
                return s6d.j.a(update5, Data.copy$default(data2, hVar != null ? k6d.h.a(hVar, this.f257750b, false, false, false, false, null, null, 509) : null, null, false, 6, null), false, null, null, null, null, ISO781611.SMT_TAG);
            case 13:
                return s6d.j.a((s6d.j) obj2, null, false, null, null, null, this.f257750b, 63);
            case 14:
                Pair pair2 = (Pair) obj2;
                od0.i iVar = (od0.i) pair2.f186385a;
                Map map = (Map) pair2.f186386b;
                f0 f0Var = (f0) iVar.g();
                return new h6e.d(f0Var != null ? new h6e.c(f0Var) : null, (h6e.b) map.get(this.f257750b));
            case 15:
                List<vf8.b> walletProfilesExtended = (List) obj2;
                Intrinsics.checkNotNullParameter(walletProfilesExtended, "walletProfilesExtended");
                for (vf8.b bVar2 : walletProfilesExtended) {
                    if (Intrinsics.f(bVar2.f288535a.f239485b, this.f257750b)) {
                        return bVar2;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 16:
                sa2.d update6 = (sa2.d) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return sa2.d.a(update6, 0L, this.f257750b, null, 11);
            case 17:
                return sa2.d.a((sa2.d) obj2, 0L, null, this.f257750b, 7);
            case 18:
                List campaigns = (List) obj2;
                Intrinsics.checkNotNullParameter(campaigns, "campaigns");
                Iterator it8 = campaigns.iterator();
                while (it8.hasNext()) {
                    Object next2 = it8.next();
                    r rVar = (r) next2;
                    if (Intrinsics.f(rVar.f13954a, this.f257750b)) {
                        Intrinsics.checkNotNullParameter(rVar, "<this>");
                        if (rVar.d != ba6.p.UNLOCKED) {
                            next2 = null;
                        }
                        return (r) next2;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 19:
                sai.f update7 = (sai.f) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                return sai.f.a(update7, this.f257750b, 0, null, false, 14);
            case 20:
                Map map2 = (Map) obj2;
                Intrinsics.checkNotNullParameter(map2, "map");
                ArrayList arrayList = new ArrayList();
                Iterator it9 = map2.entrySet().iterator();
                while (it9.hasNext()) {
                    a0.x((Iterable) ((Map.Entry) it9.next()).getValue(), arrayList);
                }
                Iterator it10 = arrayList.iterator();
                while (true) {
                    if (it10.hasNext()) {
                        next = it10.next();
                        if (Intrinsics.f(sc7.f.j((t) next), this.f257750b)) {
                        }
                    } else {
                        next = null;
                    }
                }
                return (t) next;
            case 21:
                return scc.d.a((scc.d) obj2, null, this.f257750b, 5);
            case 22:
                pd5.h currencyConfig = (pd5.h) obj2;
                Intrinsics.checkNotNullParameter(currencyConfig, "currencyConfig");
                return kotlin.text.a0.D(currencyConfig.f235108b, "%s", this.f257750b, false);
            case 23:
                pd5.h currencyConfig2 = (pd5.h) obj2;
                Intrinsics.checkNotNullParameter(currencyConfig2, "currencyConfig");
                return kotlin.text.a0.D(currencyConfig2.f235107a, "%s", this.f257750b, false);
            case 24:
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM moneybox_transactions WHERE id = ?");
                String str3 = this.f257750b;
                try {
                    if (str3 == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, str3);
                    }
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "accruesInterestSince");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "executedDate");
                    vdd.f fVar2 = null;
                    Long lValueOf2 = null;
                    if (sQLiteStatementPrepare.step()) {
                        String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        Long lValueOf3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow2));
                        if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow3)) {
                            lValueOf2 = Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow3));
                        }
                        fVar2 = new vdd.f(text, lValueOf3, lValueOf2);
                    }
                    sQLiteStatementPrepare.close();
                    return fVar2;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case 25:
                SQLiteStatement sQLiteStatementPrepare2 = ((SQLiteConnection) obj2).prepare("SELECT * FROM vaults WHERE accountType = ? ORDER BY createdDate DESC");
                String str4 = this.f257750b;
                try {
                    if (str4 == null) {
                        sQLiteStatementPrepare2.bindNull(1);
                    } else {
                        sQLiteStatementPrepare2.bindText(1, str4);
                    }
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "id");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "savingsAccountId");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "state");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "stateReason");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "type");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "ownerId");
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "goal");
                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "banner");
                    int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "underlyingId");
                    int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "pocketInfo");
                    int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "depositInfo");
                    int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "members");
                    int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "estimate");
                    int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "deadline");
                    int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "recurringPayments");
                    int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "accountType");
                    int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "createdDate");
                    int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "updatedDate");
                    int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "workflowId");
                    int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "pendingActivationReason");
                    ArrayList arrayList2 = new ArrayList();
                    while (sQLiteStatementPrepare2.step()) {
                        String text2 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow4);
                        String text3 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow5);
                        String text4 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow6);
                        vdd.e eVarA = vdd.n.a(sQLiteStatementPrepare2.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow7));
                        String text5 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow8);
                        String text6 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow9);
                        long j2 = sQLiteStatementPrepare2.getLong(columnIndexOrThrow10);
                        String text7 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow11);
                        String text8 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow12);
                        vdd.d dVarA = vdd.m.a(sQLiteStatementPrepare2.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow13));
                        vdd.a aVarA = vdd.h.a(sQLiteStatementPrepare2.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow14));
                        List listA = vdd.l.a(sQLiteStatementPrepare2.isNull(columnIndexOrThrow15) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow15));
                        Long lValueOf4 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow16) ? null : Long.valueOf(sQLiteStatementPrepare2.getLong(columnIndexOrThrow16));
                        if (sQLiteStatementPrepare2.isNull(columnIndexOrThrow17)) {
                            int i3 = columnIndexOrThrow4;
                            i = columnIndexOrThrow18;
                            i2 = i3;
                            lValueOf = null;
                        } else {
                            int i5 = columnIndexOrThrow4;
                            i = columnIndexOrThrow18;
                            i2 = i5;
                            lValueOf = Long.valueOf(sQLiteStatementPrepare2.getLong(columnIndexOrThrow17));
                        }
                        List listA2 = vdd.c.a(sQLiteStatementPrepare2.isNull(i) ? null : sQLiteStatementPrepare2.getText(i));
                        int i6 = i;
                        int i21 = columnIndexOrThrow19;
                        String text9 = sQLiteStatementPrepare2.isNull(i21) ? null : sQLiteStatementPrepare2.getText(i21);
                        columnIndexOrThrow19 = i21;
                        int i22 = columnIndexOrThrow20;
                        long j3 = sQLiteStatementPrepare2.getLong(i22);
                        columnIndexOrThrow20 = i22;
                        int i32 = columnIndexOrThrow21;
                        Long lValueOf5 = sQLiteStatementPrepare2.isNull(i32) ? null : Long.valueOf(sQLiteStatementPrepare2.getLong(i32));
                        columnIndexOrThrow21 = i32;
                        int i33 = columnIndexOrThrow22;
                        String text10 = sQLiteStatementPrepare2.isNull(i33) ? null : sQLiteStatementPrepare2.getText(i33);
                        columnIndexOrThrow22 = i33;
                        int i43 = columnIndexOrThrow23;
                        columnIndexOrThrow23 = i43;
                        arrayList2.add(new vdd.i(text2, text3, text4, eVarA, text5, text6, j2, text7, text8, dVarA, aVarA, listA, lValueOf4, lValueOf, listA2, text9, j3, lValueOf5, text10, sQLiteStatementPrepare2.isNull(i43) ? null : sQLiteStatementPrepare2.getText(i43)));
                        columnIndexOrThrow4 = i2;
                        columnIndexOrThrow18 = i6;
                        break;
                    }
                    sQLiteStatementPrepare2.close();
                    return arrayList2;
                } finally {
                    sQLiteStatementPrepare2.close();
                }
            case 26:
                SQLiteStatement sQLiteStatementPrepare3 = ((SQLiteConnection) obj2).prepare("SELECT EXISTS(SELECT 1 FROM vaults_account_type_states WHERE accountType = ?)");
                String str5 = this.f257750b;
                boolean z3 = true;
                try {
                    if (str5 == null) {
                        sQLiteStatementPrepare3.bindNull(1);
                    } else {
                        sQLiteStatementPrepare3.bindText(1, str5);
                    }
                    boolean z4 = false;
                    if (sQLiteStatementPrepare3.step()) {
                        if (((int) sQLiteStatementPrepare3.getLong(0)) == 0) {
                            z3 = false;
                        }
                        z4 = z3;
                    }
                    Boolean boolValueOf = Boolean.valueOf(z4);
                    sQLiteStatementPrepare3.close();
                    return boolValueOf;
                } finally {
                }
            case 27:
                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
                SQLiteStatement sQLiteStatementPrepare4 = sQLiteConnection.prepare("DELETE FROM vaults WHERE accountType = ?");
                String str6 = this.f257750b;
                try {
                    if (str6 == null) {
                        sQLiteStatementPrepare4.bindNull(1);
                    } else {
                        sQLiteStatementPrepare4.bindText(1, str6);
                    }
                    sQLiteStatementPrepare4.step();
                    Integer numValueOf = Integer.valueOf(SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection));
                    sQLiteStatementPrepare4.close();
                    return numValueOf;
                } finally {
                }
            case 28:
                lk0.e lowerPage = (lk0.e) obj2;
                Intrinsics.checkNotNullParameter(lowerPage, "lowerPage");
                List list = lowerPage.f196171a;
                if (list.size() < 25) {
                    list = null;
                }
                if (list != null) {
                    return new bgi.a(this.f257750b, lowerPage.f196171a.size() + ((bgi.a) lowerPage.f196172b).f15203b);
                }
                return null;
            default:
                se1.d updateState5 = (se1.d) obj2;
                Intrinsics.checkNotNullParameter(updateState5, "$this$updateState");
                return se1.d.a(updateState5, null, this.f257750b, false, null, null, 29);
        }
    }

    public /* synthetic */ k(String str, int i) {
        this.f257749a = i;
        this.f257750b = str;
    }
}
