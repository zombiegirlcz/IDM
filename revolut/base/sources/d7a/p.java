package d7a;

import androidx.compose.foundation.ImageKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.feature.bank_account_switching.impl.ui.form.domain.FormState;
import com.revolut.feature.esim.instructions.domain.EsimInstructionType;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.payments.splitbill.models.splitbilllink.SplitBillLink;
import com.revolut.retail.feature.esim.api.model.EsimDataPlan;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.feature.esim.api.model.EsimProfile;
import dcf.x;
import dej.t1;
import dfj.b3;
import dfj.c3;
import dfj.d3;
import dfj.e3;
import dfj.f3;
import dfj.g3;
import dwi.k0;
import dwi.n0;
import hcl.q0;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.PassportService;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f111909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f111910b;

    public /* synthetic */ p(int i, String str, Object obj2) {
        this.f111909a = i;
        this.f111910b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        d3 b3Var;
        Object next2;
        int i = this.f111909a;
        boolean z = false;
        e3 e3Var = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        String text = null;
        q0 q0Var = null;
        String input = this.f111910b;
        switch (i) {
            case 0:
                return e.a((e) obj2, null, null, this.f111910b, null, 11);
            case 1:
                d8f.i update = (d8f.i) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return d8f.i.a(update, input);
            case 2:
                d8f.i update2 = (d8f.i) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return d8f.i.a(update2, input);
            case 3:
                daa.f update3 = (daa.f) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                update3.getClass();
                Intrinsics.checkNotNullParameter(input, "input");
                return new daa.f(input);
            case 4:
                db.l update4 = (db.l) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                String str = this.f111910b;
                return db.l.a(update4, null, str, str, null, null, null, 57);
            case 5:
                return db.l.a((db.l) obj2, null, null, null, null, this.f111910b, null, 47);
            case 6:
                return x.a((x) obj2, null, null, null, null, null, this.f111910b, null, PassportService.DEFAULT_MAX_BLOCKSIZE);
            case 7:
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM cfd_details WHERE ref = ?");
                try {
                    if (input == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, input);
                    }
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ref");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "symbol");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "stock_exchange_code");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "description");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "kidUrl");
                    hcl.k kVar = sQLiteStatementPrepare.step() ? new hcl.k(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5)) : null;
                    sQLiteStatementPrepare.close();
                    return kVar;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case 8:
                SQLiteStatement sQLiteStatementPrepare2 = ((SQLiteConnection) obj2).prepare("SELECT * FROM holdings WHERE portfolio_id=?");
                try {
                    if (input == null) {
                        sQLiteStatementPrepare2.bindNull(1);
                    } else {
                        sQLiteStatementPrepare2.bindText(1, input);
                    }
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "id");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "portfolio_id");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "creation_date");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "holding_state");
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "name");
                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "currency");
                    int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "cash_holding");
                    int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "stock_holding");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare2.step()) {
                        arrayList.add(new jcl.e(sQLiteStatementPrepare2.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow6), sQLiteStatementPrepare2.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow7), sQLiteStatementPrepare2.isNull(columnIndexOrThrow8) ? null : Long.valueOf(sQLiteStatementPrepare2.getLong(columnIndexOrThrow8)), sQLiteStatementPrepare2.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow9), sQLiteStatementPrepare2.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow10), sQLiteStatementPrepare2.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow11), qcl.r.a(sQLiteStatementPrepare2.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow12)), qcl.r.b(sQLiteStatementPrepare2.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow13))));
                        break;
                    }
                    sQLiteStatementPrepare2.close();
                    return arrayList;
                } finally {
                    sQLiteStatementPrepare2.close();
                }
            case 9:
                SQLiteStatement sQLiteStatementPrepare3 = ((SQLiteConnection) obj2).prepare("SELECT id FROM holdings WHERE portfolio_id = ?");
                try {
                    if (input == null) {
                        sQLiteStatementPrepare3.bindNull(1);
                    } else {
                        sQLiteStatementPrepare3.bindText(1, input);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    while (sQLiteStatementPrepare3.step()) {
                        arrayList2.add(sQLiteStatementPrepare3.isNull(0) ? null : sQLiteStatementPrepare3.getText(0));
                        break;
                    }
                    sQLiteStatementPrepare3.close();
                    return arrayList2;
                } finally {
                    sQLiteStatementPrepare3.close();
                }
            case 10:
                SQLiteStatement sQLiteStatementPrepare4 = ((SQLiteConnection) obj2).prepare("SELECT * FROM instrument_governance WHERE ref = ?");
                try {
                    if (input == null) {
                        sQLiteStatementPrepare4.bindNull(1);
                    } else {
                        sQLiteStatementPrepare4.bindText(1, input);
                    }
                    int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "ref");
                    int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "targetMarket");
                    if (sQLiteStatementPrepare4.step()) {
                        String text2 = sQLiteStatementPrepare4.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare4.getText(columnIndexOrThrow14);
                        if (!sQLiteStatementPrepare4.isNull(columnIndexOrThrow15)) {
                            text = sQLiteStatementPrepare4.getText(columnIndexOrThrow15);
                        }
                        q0Var = new q0(text2, text);
                    }
                    sQLiteStatementPrepare4.close();
                    return q0Var;
                } finally {
                }
            case 11:
                de9.h updateState = (de9.h) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return de9.h.a(updateState, this.f111910b, 0L, false, null, null, 30);
            case 12:
                List mobilePlans = (List) obj2;
                Intrinsics.checkNotNullParameter(mobilePlans, "mobilePlans");
                Iterator it8 = mobilePlans.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        Object next3 = it8.next();
                        if (Intrinsics.f(((EsimDataPlan) next3).f100212a, input)) {
                            obj6 = next3;
                        }
                    }
                }
                return (EsimDataPlan) obj6;
            case 13:
                List dataPlans = (List) obj2;
                Intrinsics.checkNotNullParameter(dataPlans, "dataPlans");
                Iterator it9 = dataPlans.iterator();
                while (true) {
                    if (it9.hasNext()) {
                        Object next4 = it9.next();
                        if (Intrinsics.f(((EsimDataPlan) next4).f100212a, input)) {
                            obj5 = next4;
                        }
                    }
                }
                return (EsimDataPlan) obj5;
            case 14:
                Map idToProfile = (Map) obj2;
                Intrinsics.checkNotNullParameter(idToProfile, "idToProfile");
                Iterator it10 = idToProfile.values().iterator();
                while (true) {
                    if (it10.hasNext()) {
                        next = it10.next();
                        JuniorBankingProfile juniorBankingProfile = (JuniorBankingProfile) next;
                        String str2 = juniorBankingProfile.f77102h;
                        if (str2 == null) {
                            str2 = juniorBankingProfile.f77101g;
                        }
                        if (Intrinsics.f(str2, input)) {
                        }
                    } else {
                        next = null;
                    }
                }
                JuniorBankingProfile juniorBankingProfile2 = (JuniorBankingProfile) next;
                return Optional.ofNullable(juniorBankingProfile2 != null ? new EsimGiftRecipient(juniorBankingProfile2.f77103j, juniorBankingProfile2.f77102h, juniorBankingProfile2.f77101g, juniorBankingProfile2.f77099b, juniorBankingProfile2.f77100c, juniorBankingProfile2.f) : null);
            case 15:
                List instructions = (List) obj2;
                Intrinsics.checkNotNullParameter(instructions, "instructions");
                Iterator it11 = instructions.iterator();
                while (true) {
                    if (it11.hasNext()) {
                        Object next5 = it11.next();
                        String str3 = ((rd6.b) next5).f253349b;
                        EsimInstructionType.Companion companion = EsimInstructionType.INSTANCE;
                        if (Intrinsics.f(str3, input)) {
                            obj4 = next5;
                        }
                    }
                }
                return (rd6.b) obj4;
            case 16:
                List profiles = (List) obj2;
                Intrinsics.checkNotNullParameter(profiles, "profiles");
                Iterator it12 = profiles.iterator();
                while (true) {
                    if (it12.hasNext()) {
                        Object next6 = it12.next();
                        if (Intrinsics.f(((EsimProfile) next6).f100423a, input)) {
                            obj3 = next6;
                        }
                    }
                }
                return (EsimProfile) obj3;
            case 17:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                Pair pair2 = (Pair) pair.f186385a;
                Iterator it13 = ((List) pair.f186386b).iterator();
                Object obj7 = null;
                while (true) {
                    if (it13.hasNext()) {
                        Object next7 = it13.next();
                        t1 t1Var = (t1) next7;
                        if (Intrinsics.f(t1Var.e.f100440a, input) && gj7.b.B(t1Var)) {
                            if (!z) {
                                z = true;
                                obj7 = next7;
                            }
                        }
                    } else if (!z) {
                    }
                }
                obj7 = null;
                t1 t1Var2 = (t1) obj7;
                i80.a aVar = (i80.a) pair2.f186385a;
                String str4 = (String) pair2.f186386b;
                if (t1Var2 != null) {
                    g3.Companion.getClass();
                    dej.m mVar = t1Var2.f113653g;
                    if (mVar == null) {
                        mVar = dej.m.DATA_PLAN;
                    }
                    if (t1Var2.z) {
                        b3Var = c3.f113932a;
                    } else {
                        Long l2 = t1Var2.f113666y;
                        b3Var = new b3(l2 != null ? l2.longValue() : 0L);
                    }
                    Period period = Period.parse(t1Var2.f113665x);
                    Intrinsics.checkNotNullExpressionValue(period, "parse(...)");
                    e3Var = new e3(mVar, b3Var, period, t1Var2.d);
                }
                return new f3(aVar, str4, e3Var);
            case 18:
                List<EsimGiftRecipient> giftRecipients = (List) obj2;
                Intrinsics.checkNotNullParameter(giftRecipients, "giftRecipients");
                for (EsimGiftRecipient esimGiftRecipient : giftRecipients) {
                    String str5 = esimGiftRecipient.f100269b;
                    if (str5 == null) {
                        str5 = esimGiftRecipient.f100270c;
                    }
                    if (Intrinsics.f(input, str5)) {
                        return esimGiftRecipient.d;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 19:
                SQLiteStatement sQLiteStatementPrepare5 = ((SQLiteConnection) obj2).prepare("SELECT * FROM account_notification_info WHERE productId = ?");
                try {
                    if (input == null) {
                        sQLiteStatementPrepare5.bindNull(1);
                    } else {
                        sQLiteStatementPrepare5.bindText(1, input);
                    }
                    int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare5, "accountId");
                    int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare5, "productId");
                    int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare5, "lastSeenTimestamp");
                    int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare5, "lastActionTimestamp");
                    int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare5, "lastTransactionTimestamp");
                    int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare5, "unreadCounter");
                    ArrayList arrayList3 = new ArrayList();
                    while (sQLiteStatementPrepare5.step()) {
                        arrayList3.add(new gge.a((int) sQLiteStatementPrepare5.getLong(columnIndexOrThrow21), sQLiteStatementPrepare5.getLong(columnIndexOrThrow18), sQLiteStatementPrepare5.getLong(columnIndexOrThrow19), sQLiteStatementPrepare5.getLong(columnIndexOrThrow20), sQLiteStatementPrepare5.isNull(columnIndexOrThrow16) ? null : sQLiteStatementPrepare5.getText(columnIndexOrThrow16), sQLiteStatementPrepare5.isNull(columnIndexOrThrow17) ? null : sQLiteStatementPrepare5.getText(columnIndexOrThrow17)));
                        break;
                    }
                    sQLiteStatementPrepare5.close();
                    return arrayList3;
                } finally {
                }
            case 20:
                dl6.d update5 = (dl6.d) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                update5.getClass();
                Intrinsics.checkNotNullParameter(input, "email");
                return new dl6.d(input);
            case 21:
                do2.g update6 = (do2.g) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return do2.g.a(update6, null, FormState.a(update6.f116375b, null, input, 1), null, 5);
            case 22:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                PaymentGroup paymentGroup = (PaymentGroup) rVar.f314201a;
                List list = (List) rVar.f314202b;
                do3.n nVar = (do3.n) rVar.f314203c;
                Iterator it14 = list.iterator();
                while (true) {
                    if (it14.hasNext()) {
                        next2 = it14.next();
                        if (Intrinsics.f(((oq9.i) next2).getId(), input)) {
                        }
                    } else {
                        next2 = null;
                    }
                }
                oq9.i iVar = (oq9.i) next2;
                if (iVar != null) {
                    return new bt9.k(paymentGroup, iVar, nVar, ofm.q.s(iVar, paymentGroup));
                }
                return null;
            case 23:
                dvk.g update7 = (dvk.g) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                return dvk.g.a(update7, null, null, this.f111910b, null, 23);
            case 24:
                List lounges = (List) obj2;
                Intrinsics.checkNotNullParameter(lounges, "lounges");
                List list2 = lounges;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it15 = list2.iterator();
                    while (true) {
                        if (it15.hasNext()) {
                            if (Intrinsics.f(((svi.b) it15.next()).f265874a, input)) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 25:
                k0 wrapper = (k0) obj2;
                Intrinsics.checkNotNullParameter(wrapper, "wrapper");
                return new Pair(wrapper, Integer.valueOf(n0.a(wrapper.d, input) + n0.a(wrapper.f120438c, input) + n0.a(wrapper.f120437b, input) + n0.a(wrapper.f120436a.f265869b, input)));
            case 26:
                dyg.h update8 = (dyg.h) obj2;
                Intrinsics.checkNotNullParameter(update8, "$this$update");
                return dyg.h.a(update8, null, vyg.a.valueOf(input), null, null, null, 439);
            case 27:
                t61.b result = (t61.b) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                return Boolean.valueOf(Intrinsics.f(result.f268129a.f268137a, input));
            case 28:
                return ImageKt.Image$lambda$0$0(input, (SemanticsPropertyReceiver) obj2);
            default:
                List links = (List) obj2;
                Intrinsics.checkNotNullParameter(links, "links");
                ArrayList arrayList4 = new ArrayList();
                for (Object obj8 : links) {
                    if (Intrinsics.f(((SplitBillLink) obj8).f79941c, input)) {
                        arrayList4.add(obj8);
                    }
                }
                return arrayList4;
        }
    }

    public /* synthetic */ p(String str, int i) {
        this.f111909a = i;
        this.f111910b = str;
    }
}
