package lu6;

import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.core.model.faq.FaqMetaData;
import com.revolut.core.model.faq.PigeonNode;
import com.revolut.core.ui_kit.delegates.widgets.ErrorWidgetDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.domain.models.beneficiary.BankFieldDefinition;
import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrderFilter;
import com.revolut.feature.identity.auth.domain.model.RegisteredIdentityId;
import com.revolut.feature.selfserve.sot.api.models.SubmissionEvidence;
import com.revolut.feature.selfserve.sot.api.models.SubmissionState;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.teen_profile.api.models.TeenProfile;
import com.revolut.kompot.common.R$string;
import com.youTransactor.uCube.rpc.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.text.d0;
import nif.m2;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.LDSFile;
import zhm.a1;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f200053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f200054b;

    public /* synthetic */ p(int i, String str, Object obj2) {
        this.f200053a = i;
        this.f200054b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        Object next2;
        Long l2;
        switch (this.f200053a) {
            case 0:
                l update = (l) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                AcquiringOrderFilter acquiringOrderFilter = update.f200048b;
                String strL = m70.a.l(this.f200054b);
                String strW2 = acquiringOrderFilter != null ? acquiringOrderFilter.W2() : null;
                return l.a(update, null, (strW2 == null && strL == null) ? acquiringOrderFilter != null ? acquiringOrderFilter.j9(o0.f186429a.b(AcquiringOrderFilter.FractionalAmount.class)) : null : com.revolut.feature.freelancer.impl.ui.acquiring_order.filters.screen.a.J2(acquiringOrderFilter, new AcquiringOrderFilter.FractionalAmount(strW2, strL)), 5);
            case 1:
                SubmissionState state = (SubmissionState) obj2;
                Intrinsics.checkNotNullParameter(state, "state");
                Iterator it8 = state.f85893c.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (Intrinsics.f(((SubmissionEvidence) next).f85881a, this.f200054b)) {
                        }
                    } else {
                        next = null;
                    }
                }
                return (SubmissionEvidence) next;
            case 2:
                lyi.a update2 = (lyi.a) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                String string = d0.F0(this.f200054b).toString();
                List list = (List) update2.f200829a.getContent();
                if (list == null) {
                    list = f0.f322471a;
                }
                return lyi.a.a(update2, null, string, null, lyi.m.I2(string, update2.f200831c, list), 5);
            case 3:
                lyi.a update3 = (lyi.a) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                String string2 = d0.F0(this.f200054b).toString();
                List list2 = (List) update3.f200829a.getContent();
                if (list2 == null) {
                    list2 = f0.f322471a;
                }
                return lyi.a.a(update3, null, null, string2, lyi.m.I2(update3.f200830b, string2, list2), 3);
            case 4:
                m1e.f update4 = (m1e.f) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                Set set = update4.f201480b;
                String str = this.f200054b;
                return m1e.f.a(update4, null, set.contains(str) ? a1.j(set, str) : a1.m(set, str), 1);
            case 5:
                return m2f.l.a((m2f.l) obj2, null, null, 0.0d, null, 0, this.f200054b, null, null, null, false, false, 8063);
            case 6:
                return m2f.l.a((m2f.l) obj2, null, null, 0.0d, null, 0, this.f200054b, null, null, null, false, false, 8063);
            case 7:
                return m2f.l.a((m2f.l) obj2, null, null, 0.0d, this.f200054b, 0, null, null, null, null, false, false, 8159);
            case 8:
                return m2f.l.a((m2f.l) obj2, null, null, 0.0d, this.f200054b, 0, null, null, null, null, false, false, 8159);
            case 9:
                Map profilesMap = (Map) obj2;
                Intrinsics.checkNotNullParameter(profilesMap, "profilesMap");
                String str2 = this.f200054b;
                if (str2 == null) {
                    return zhm.d0.d1(profilesMap.values());
                }
                Set setEntrySet = profilesMap.entrySet();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : setEntrySet) {
                    if (Intrinsics.f(((RegisteredIdentityId) ((Map.Entry) obj3).getKey()).f74764a, str2)) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                Iterator it9 = arrayList.iterator();
                while (it9.hasNext()) {
                    arrayList2.add((TeenProfile) ((Map.Entry) it9.next()).getValue());
                }
                return arrayList2;
            case 10:
                ((m4c.d) obj2).getClass();
                String selectedAccountId = this.f200054b;
                Intrinsics.checkNotNullParameter(selectedAccountId, "selectedAccountId");
                return new m4c.d(selectedAccountId);
            case 11:
                m4j.f update5 = (m4j.f) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                List searchItems = update5.f202734b;
                Clause title = update5.f202735c;
                BankFieldDefinition bankFieldDefinition = update5.d;
                String searchQuery = this.f200054b;
                Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
                Intrinsics.checkNotNullParameter(searchItems, "searchItems");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(bankFieldDefinition, "bankFieldDefinition");
                return new m4j.f(searchQuery, searchItems, title, bankFieldDefinition);
            case 12:
                List accountIds = (List) obj2;
                Intrinsics.checkNotNullParameter(accountIds, "accountIds");
                od0.h hVar = od0.i.Companion;
                Iterator it10 = accountIds.iterator();
                while (true) {
                    if (it10.hasNext()) {
                        next2 = it10.next();
                        if (Intrinsics.f(((ProductAccountId) next2).f89729a, this.f200054b)) {
                        }
                    } else {
                        next2 = null;
                    }
                }
                hVar.getClass();
                return od0.h.a(next2);
            case 13:
                List tree = (List) obj2;
                Intrinsics.checkNotNullParameter(tree, "tree");
                Iterable iterableS = k18.c.s(this.f200054b, tree);
                if (iterableS == null) {
                    iterableS = f0.f322471a;
                }
                List<PigeonNode> listI0 = zhm.d0.I0(iterableS);
                ArrayList arrayList3 = new ArrayList(w.t(listI0, 10));
                for (PigeonNode pigeonNode : listI0) {
                    arrayList3.add(new FaqMetaData(pigeonNode.f51434a, pigeonNode.f51435b));
                }
                return arrayList3;
            case 14:
                m87.c update6 = (m87.c) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                List pagerItems = update6.f203440a;
                Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
                return new m87.c(pagerItems, this.f200054b);
            case 15:
                ea1.b.a("Payment for order " + this.f200054b + " started", fa1.k.INFO);
                return Unit.f186387a;
            case 16:
                Throwable it11 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return new ErrorWidgetDelegate.Model(this.f200054b, null, new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), new TextLocalisedClause(R$string.common_error_state_action, null, null, 14), op0.q.SMALL, null, null, Constants.TAG_E2_CONFIGURATION_PAYMENT_SCHEME_CUSTOMIZATION);
            case 17:
                mhd.n updateState = (mhd.n) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return mhd.n.a(updateState, null, null, null, null, this.f200054b, false, null, LDSFile.EF_DG15_TAG);
            case 18:
                mhd.n updateState2 = (mhd.n) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return mhd.n.a(updateState2, null, null, null, this.f200054b, null, false, null, LDSFile.EF_SOD_TAG);
            case 19:
                mib.c update7 = (mib.c) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                return new mib.c(update7.f205636a, this.f200054b);
            case 20:
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT value FROM loading_state WHERE id = ?");
                String str3 = this.f200054b;
                try {
                    if (str3 == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, str3);
                    }
                    if (sQLiteStatementPrepare.step()) {
                        l2 = new Long(sQLiteStatementPrepare.getLong(0));
                        break;
                    } else {
                        l2 = null;
                    }
                    sQLiteStatementPrepare.close();
                    return l2;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case 21:
                SQLiteStatement sQLiteStatementPrepare2 = ((SQLiteConnection) obj2).prepare("DELETE FROM loading_state WHERE id = ?");
                String str4 = this.f200054b;
                try {
                    if (str4 == null) {
                        sQLiteStatementPrepare2.bindNull(1);
                    } else {
                        sQLiteStatementPrepare2.bindText(1, str4);
                    }
                    sQLiteStatementPrepare2.step();
                    sQLiteStatementPrepare2.close();
                    return null;
                } finally {
                    sQLiteStatementPrepare2.close();
                }
            case 22:
                SQLiteStatement sQLiteStatementPrepare3 = ((SQLiteConnection) obj2).prepare("SELECT * FROM search_index_state WHERE id = ?");
                String str5 = this.f200054b;
                try {
                    if (str5 == null) {
                        sQLiteStatementPrepare3.bindNull(1);
                    } else {
                        sQLiteStatementPrepare3.bindText(1, str5);
                    }
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "value");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "value_string");
                    m2 m2Var = null;
                    String text = null;
                    if (sQLiteStatementPrepare3.step()) {
                        String text2 = sQLiteStatementPrepare3.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare3.getText(columnIndexOrThrow);
                        Long lValueOf = sQLiteStatementPrepare3.isNull(columnIndexOrThrow2) ? null : Long.valueOf(sQLiteStatementPrepare3.getLong(columnIndexOrThrow2));
                        if (!sQLiteStatementPrepare3.isNull(columnIndexOrThrow3)) {
                            text = sQLiteStatementPrepare3.getText(columnIndexOrThrow3);
                        }
                        m2Var = new m2(text2, lValueOf, text);
                    }
                    sQLiteStatementPrepare3.close();
                    return m2Var;
                } finally {
                    sQLiteStatementPrepare3.close();
                }
            case 23:
                mk5.m update8 = (mk5.m) obj2;
                Intrinsics.checkNotNullParameter(update8, "$this$update");
                return mk5.m.a(update8, mk5.o.valueOf(this.f200054b), null, null, null, false, 126);
            case 24:
                mk5.m update9 = (mk5.m) obj2;
                Intrinsics.checkNotNullParameter(update9, "$this$update");
                return mk5.m.a(update9, null, this.f200054b, null, null, false, ISO781611.SMT_TAG);
            case 25:
                SQLiteStatement sQLiteStatementPrepare4 = ((SQLiteConnection) obj2).prepare("SELECT * FROM remote_contacts WHERE code = ? AND type != 'JUNIOR'");
                String str6 = this.f200054b;
                try {
                    if (str6 == null) {
                        sQLiteStatementPrepare4.bindNull(1);
                    } else {
                        sQLiteStatementPrepare4.bindText(1, str6);
                    }
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "code");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "username");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "legalName");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "firstName");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "lastName");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "country");
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "appMode");
                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "type");
                    int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "businessName");
                    Object oVar = sQLiteStatementPrepare4.step() ? new ml3.o(sQLiteStatementPrepare4.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare4.getText(columnIndexOrThrow4), sQLiteStatementPrepare4.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare4.getText(columnIndexOrThrow5), sQLiteStatementPrepare4.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare4.getText(columnIndexOrThrow6), sQLiteStatementPrepare4.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare4.getText(columnIndexOrThrow7), sQLiteStatementPrepare4.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare4.getText(columnIndexOrThrow8), sQLiteStatementPrepare4.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare4.getText(columnIndexOrThrow9), sQLiteStatementPrepare4.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare4.getText(columnIndexOrThrow10), sQLiteStatementPrepare4.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare4.getText(columnIndexOrThrow11), sQLiteStatementPrepare4.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare4.getText(columnIndexOrThrow12), (int) sQLiteStatementPrepare4.getLong(SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "transactionsCount")), sQLiteStatementPrepare4.getLong(SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "timestamp"))) : null;
                    sQLiteStatementPrepare4.close();
                    return oVar;
                } finally {
                    sQLiteStatementPrepare4.close();
                }
            case 26:
                SQLiteStatement sQLiteStatementPrepare5 = ((SQLiteConnection) obj2).prepare("DELETE FROM remote_contacts WHERE username = ?");
                String str7 = this.f200054b;
                try {
                    if (str7 == null) {
                        sQLiteStatementPrepare5.bindNull(1);
                    } else {
                        sQLiteStatementPrepare5.bindText(1, str7);
                    }
                    sQLiteStatementPrepare5.step();
                    Unit unit = Unit.f186387a;
                    sQLiteStatementPrepare5.close();
                    return unit;
                } finally {
                    sQLiteStatementPrepare5.close();
                }
            case 27:
                SQLiteStatement sQLiteStatementPrepare6 = ((SQLiteConnection) obj2).prepare("SELECT * FROM remote_contacts_extra WHERE code = ?");
                String str8 = this.f200054b;
                try {
                    if (str8 == null) {
                        sQLiteStatementPrepare6.bindNull(1);
                    } else {
                        sQLiteStatementPrepare6.bindText(1, str8);
                    }
                    int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare6, "code");
                    int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare6, "username");
                    int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare6, "paidPlan");
                    int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare6, "birthday");
                    int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare6, "legalName");
                    int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare6, "firstName");
                    int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare6, "lastName");
                    int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare6, "businessName");
                    Object pVar = sQLiteStatementPrepare6.step() ? new ml3.p(sQLiteStatementPrepare6.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare6.getText(columnIndexOrThrow13), sQLiteStatementPrepare6.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare6.getText(columnIndexOrThrow14), sQLiteStatementPrepare6.isNull(columnIndexOrThrow15) ? null : sQLiteStatementPrepare6.getText(columnIndexOrThrow15), sQLiteStatementPrepare6.isNull(columnIndexOrThrow16) ? null : sQLiteStatementPrepare6.getText(columnIndexOrThrow16), sQLiteStatementPrepare6.isNull(columnIndexOrThrow17) ? null : sQLiteStatementPrepare6.getText(columnIndexOrThrow17), sQLiteStatementPrepare6.isNull(columnIndexOrThrow18) ? null : sQLiteStatementPrepare6.getText(columnIndexOrThrow18), sQLiteStatementPrepare6.isNull(columnIndexOrThrow19) ? null : sQLiteStatementPrepare6.getText(columnIndexOrThrow19), sQLiteStatementPrepare6.isNull(columnIndexOrThrow20) ? null : sQLiteStatementPrepare6.getText(columnIndexOrThrow20)) : null;
                    sQLiteStatementPrepare6.close();
                    return pVar;
                } finally {
                    sQLiteStatementPrepare6.close();
                }
            case 28:
                SQLiteStatement sQLiteStatementPrepare7 = ((SQLiteConnection) obj2).prepare("DELETE FROM remote_contacts_extra  WHERE username = ?");
                String str9 = this.f200054b;
                try {
                    if (str9 == null) {
                        sQLiteStatementPrepare7.bindNull(1);
                    } else {
                        sQLiteStatementPrepare7.bindText(1, str9);
                    }
                    sQLiteStatementPrepare7.step();
                    Unit unit2 = Unit.f186387a;
                    sQLiteStatementPrepare7.close();
                    return unit2;
                } finally {
                }
            default:
                SQLiteStatement sQLiteStatementPrepare8 = ((SQLiteConnection) obj2).prepare("DELETE FROM virtual_contacts WHERE point = ?");
                String str10 = this.f200054b;
                try {
                    if (str10 == null) {
                        sQLiteStatementPrepare8.bindNull(1);
                    } else {
                        sQLiteStatementPrepare8.bindText(1, str10);
                    }
                    sQLiteStatementPrepare8.step();
                    Unit unit3 = Unit.f186387a;
                    sQLiteStatementPrepare8.close();
                    return unit3;
                } finally {
                }
        }
    }

    public /* synthetic */ p(String str, int i) {
        this.f200053a = i;
        this.f200054b = str;
    }

    public /* synthetic */ p(String str, lyi.m mVar, int i) {
        this.f200053a = i;
        this.f200054b = str;
    }
}
