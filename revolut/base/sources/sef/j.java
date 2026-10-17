package sef;

import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.loan.api.models.rev10.Loan;
import com.revolut.feature.credit.loan.api.models.rev10.LoanBackupCard;
import com.revolut.feature.credit.loan.api.navigation.LoanKompotFeatureConfig;
import com.revolut.feature.crypto.config.api.models.CryptoAddressHostingProviderType;
import com.revolut.feature.freelancer.impl.ui.onboarding.validation.OnboardingInputDataValidator$ValidationState;
import com.revolut.retail.core.navigation.DummyCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import ml3.o;
import ml3.p;
import nkm.y;
import smd.u;
import zhm.a1;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f262193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f262194b;

    public /* synthetic */ j(String str, int i) {
        this.f262193a = i;
        this.f262194b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws Throwable {
        String str;
        Object next;
        Object next2;
        dj0.d dVar;
        SQLiteStatement sQLiteStatement;
        long j2;
        Integer numValueOf;
        int i;
        String text;
        String text2;
        switch (this.f262193a) {
            case 0:
                f updateState = (f) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                String transactionId = updateState.f262187a;
                Data noteData = updateState.f262189c;
                Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                String message = this.f262194b;
                Intrinsics.checkNotNullParameter(message, "message");
                Intrinsics.checkNotNullParameter(noteData, "noteData");
                return new f(noteData, transactionId, message);
            case 1:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list = (List) pair.f186385a;
                Map map = (Map) pair.f186386b;
                ArrayList<o> arrayList = new ArrayList();
                for (Object obj3 : list) {
                    o oVar = (o) obj3;
                    Intrinsics.checkNotNullParameter(oVar, "<this>");
                    String str2 = this.f262194b;
                    if (str2 != null && !d0.W(str2)) {
                        String strO = com.google.android.gms.internal.mlkit_vision_face.a.o(oVar.d, " ", oVar.e);
                        String string = d0.F0(str2).toString();
                        if (d0.J(strO, string, true) || d0.J(oVar.f206610b, string, true) || d0.J(oVar.f206611c, string, true)) {
                        }
                    }
                    arrayList.add(obj3);
                }
                ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                for (o oVar2 : arrayList) {
                    arrayList2.add(pyd.c.e0(oVar2, (p) map.get(oVar2.f206609a)));
                }
                return arrayList2;
            case 2:
                sm6.j update = (sm6.j) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return sm6.j.a(update, null, this.f262194b, 1);
            case 3:
                sm9.e update2 = (sm9.e) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return sm9.e.a(update2, null, this.f262194b, 1);
            case 4:
                smd.j update3 = (smd.j) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                Data data = update3.f264423a;
                Map map2 = update3.f264424b;
                smd.h hVar = (smd.h) data.getContent();
                if (hVar == null) {
                    return update3;
                }
                List list2 = hVar.f264419c;
                List list3 = list2;
                Iterator it8 = list3.iterator();
                while (true) {
                    boolean zHasNext = it8.hasNext();
                    str = this.f262194b;
                    if (zHasNext) {
                        next = it8.next();
                        if (Intrinsics.f(((smd.g) next).f264414a.getId(), str)) {
                        }
                    } else {
                        next = null;
                    }
                }
                smd.g gVar = (smd.g) next;
                if (gVar != null) {
                    dj0.d dVar2 = gVar.d;
                    if (dVar2 == null) {
                        return update3;
                    }
                    Data data2 = update3.f264423a;
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj4 : list3) {
                        if (!Intrinsics.f(((smd.g) obj4).f264414a.getId(), str)) {
                            arrayList3.add(obj4);
                        }
                    }
                    return smd.j.c(update3, Data.copy$default(data2, smd.h.a(hVar, null, arrayList3, 11), null, false, 6, null), r0.q(map2, new Pair(str, new smd.b(dVar2))), 4);
                }
                Iterator it9 = hVar.f264418b.iterator();
                while (true) {
                    if (it9.hasNext()) {
                        next2 = it9.next();
                        if (Intrinsics.f(((smd.g) next2).f264414a.getId(), str)) {
                        }
                    } else {
                        next2 = null;
                    }
                }
                smd.g gVar2 = (smd.g) next2;
                if (gVar2 == null) {
                    return update3;
                }
                Object obj5 = map2.get(str);
                smd.b bVar = obj5 instanceof smd.b ? (smd.b) obj5 : null;
                if (bVar == null || (dVar = bVar.f264409a) == null) {
                    dVar = gVar2.f264415b;
                }
                return smd.j.c(update3, Data.copy$default(update3.f264423a, smd.h.a(hVar, null, zhm.d0.F0(smd.g.a(gVar2, dVar), list2), 11), null, false, 6, null), u.I2(gVar2, new smd.a(dVar), map2), 4);
            case 5:
                snk.f update4 = (snk.f) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return snk.f.a(update4, this.f262194b, false, 4);
            case 6:
                sog.a model = (sog.a) obj2;
                Intrinsics.checkNotNullParameter(model, "model");
                return a0.H(model.f264824a.f297794a, this.f262194b, true) ? 0 : 1;
            case 7:
                sog.a model2 = (sog.a) obj2;
                Intrinsics.checkNotNullParameter(model2, "model");
                return a0.H(model2.f264825b, this.f262194b, true) ? 0 : 1;
            case 8:
                sog.a model3 = (sog.a) obj2;
                Intrinsics.checkNotNullParameter(model3, "model");
                return a0.H(model3.f264826c, this.f262194b, true) ? 0 : 1;
            case 9:
                sog.a model4 = (sog.a) obj2;
                Intrinsics.checkNotNullParameter(model4, "model");
                String str3 = model4.f264825b;
                String str4 = this.f262194b;
                Integer[] elements = {Integer.valueOf(d0.T(str3, str4, 0, true, 2)), Integer.valueOf(d0.T(model4.f264826c, str4, 0, true, 2))};
                Intrinsics.checkNotNullParameter(elements, "elements");
                Integer num = (Integer) y.B(y.n(kotlin.collections.d.E(elements), new sl3.i(29)));
                if (num != null) {
                    return num;
                }
                return Integer.MAX_VALUE;
            case 10:
                sq5.c update5 = (sq5.c) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return sq5.c.a(update5, CryptoAddressHostingProviderType.valueOf(this.f262194b), null, null, null, false, null, null, 126);
            case 11:
                sqf.d dVar3 = (sqf.d) obj2;
                Clause title = dVar3.f265084a;
                Clause label = dVar3.f265085b;
                int i2 = dVar3.f265086c;
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(label, "label");
                String reference = this.f262194b;
                Intrinsics.checkNotNullParameter(reference, "reference");
                return new sqf.d(i2, title, label, reference);
            case 12:
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM referrals_invitation WHERE id = ?");
                String str5 = this.f262194b;
                try {
                    if (str5 == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, str5);
                    }
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "emptyChat_title");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "emptyChat_description");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "emptyChat_darkImage");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "emptyChat_lightImage");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "emptyChat_acceptButton");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chat_description");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chat_darkImage");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chat_lightImage");
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chat_acceptButton");
                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chat_declineButton");
                    int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "beneficiaryProfile_title");
                    int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "beneficiaryProfile_description");
                    int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "transactionDetails_title");
                    int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "transactionDetails_description");
                    int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "transactionFee_title");
                    int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "transactionFee_description");
                    Object fVar = sQLiteStatementPrepare.step() ? new sxa.f(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), new sxa.b(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6)), new sxa.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7), sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8), sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9), sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10), sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11)), new sxa.c(sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12), sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13)), new sxa.c(sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14), sQLiteStatementPrepare.isNull(columnIndexOrThrow15) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow15)), new sxa.c(sQLiteStatementPrepare.isNull(columnIndexOrThrow16) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow16), sQLiteStatementPrepare.isNull(columnIndexOrThrow17) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow17))) : null;
                    sQLiteStatementPrepare.close();
                    return fVar;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case 13:
                sy6.f update6 = (sy6.f) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return sy6.f.a(update6, sr6.a.valueOf(this.f262194b), null, null, 13);
            case 14:
                sy6.f update7 = (sy6.f) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                return sy6.f.a(update7, null, sr6.a.valueOf(this.f262194b), null, 11);
            case 15:
                sy6.f update8 = (sy6.f) obj2;
                Intrinsics.checkNotNullParameter(update8, "$this$update");
                return sy6.f.a(update8, null, null, sr6.b.valueOf(this.f262194b), 7);
            case 16:
                List validationMessages = (List) obj2;
                Intrinsics.checkNotNullParameter(validationMessages, "validationMessages");
                boolean zIsEmpty = validationMessages.isEmpty();
                String str6 = this.f262194b;
                return zIsEmpty ? new OnboardingInputDataValidator$ValidationState.Valid(str6) : new OnboardingInputDataValidator$ValidationState.NotValid(new TextClause(((vr6.c) zhm.d0.b0(validationMessages)).f291512b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), str6);
            case 17:
                SQLiteStatement sQLiteStatementPrepare2 = ((SQLiteConnection) obj2).prepare("SELECT * FROM travel_experiences_reviews WHERE experienceId = ?");
                String str7 = this.f262194b;
                try {
                    if (str7 == null) {
                        sQLiteStatementPrepare2.bindNull(1);
                    } else {
                        sQLiteStatementPrepare2.bindText(1, str7);
                    }
                    int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "id");
                    int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "experienceId");
                    int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "publishedDate");
                    int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "userName");
                    int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "rating");
                    int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "title");
                    int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "text");
                    int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "provider");
                    int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "light");
                    int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "dark");
                    ArrayList arrayList4 = new ArrayList();
                    while (sQLiteStatementPrepare2.step()) {
                        long j3 = sQLiteStatementPrepare2.getLong(columnIndexOrThrow18);
                        String text3 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow19) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow19);
                        String text4 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow20) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow20);
                        String text5 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow21) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow21);
                        if (sQLiteStatementPrepare2.isNull(columnIndexOrThrow22)) {
                            j2 = j3;
                            numValueOf = null;
                        } else {
                            j2 = j3;
                            numValueOf = Integer.valueOf((int) sQLiteStatementPrepare2.getLong(columnIndexOrThrow22));
                        }
                        String text6 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow23) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow23);
                        String text7 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow24) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow24);
                        String text8 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow25) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow25);
                        if (sQLiteStatementPrepare2.isNull(columnIndexOrThrow26)) {
                            i = columnIndexOrThrow18;
                            text = null;
                        } else {
                            i = columnIndexOrThrow18;
                            text = sQLiteStatementPrepare2.getText(columnIndexOrThrow26);
                        }
                        if (sQLiteStatementPrepare2.isNull(columnIndexOrThrow27)) {
                            sQLiteStatement = sQLiteStatementPrepare2;
                            text2 = null;
                        } else {
                            sQLiteStatement = sQLiteStatementPrepare2;
                            text2 = sQLiteStatementPrepare2.getText(columnIndexOrThrow27);
                        }
                        int i3 = columnIndexOrThrow19;
                        try {
                            arrayList4.add(new u0g.b(j2, text3, text4, text5, numValueOf, text6, text7, new u0g.d(text8, new u0g.c(text, text2))));
                            sQLiteStatementPrepare2 = sQLiteStatement;
                            columnIndexOrThrow18 = i;
                            columnIndexOrThrow19 = i3;
                        } catch (Throwable th10) {
                            th = th10;
                            sQLiteStatement.close();
                            throw th;
                        }
                        break;
                    }
                    sQLiteStatementPrepare2.close();
                    return arrayList4;
                } catch (Throwable th11) {
                    th = th11;
                    sQLiteStatement = sQLiteStatementPrepare2;
                }
                break;
            case 18:
                SQLiteStatement sQLiteStatementPrepare3 = ((SQLiteConnection) obj2).prepare("SELECT * FROM travel_experiences_reviews_summary WHERE experienceId = ?");
                String str8 = this.f262194b;
                try {
                    if (str8 == null) {
                        sQLiteStatementPrepare3.bindNull(1);
                    } else {
                        sQLiteStatementPrepare3.bindText(1, str8);
                    }
                    int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "experienceId");
                    int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "count");
                    int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "averageScore");
                    u0g.e eVar = null;
                    String text9 = null;
                    if (sQLiteStatementPrepare3.step()) {
                        if (!sQLiteStatementPrepare3.isNull(columnIndexOrThrow28)) {
                            text9 = sQLiteStatementPrepare3.getText(columnIndexOrThrow28);
                        }
                        eVar = new u0g.e(sQLiteStatementPrepare3.getDouble(columnIndexOrThrow30), (int) sQLiteStatementPrepare3.getLong(columnIndexOrThrow29), text9);
                    }
                    sQLiteStatementPrepare3.close();
                    return eVar;
                } finally {
                }
            case 19:
                SQLiteStatement sQLiteStatementPrepare4 = ((SQLiteConnection) obj2).prepare("DELETE FROM travel_experiences_reviews WHERE experienceId = ?");
                String str9 = this.f262194b;
                try {
                    if (str9 == null) {
                        sQLiteStatementPrepare4.bindNull(1);
                    } else {
                        sQLiteStatementPrepare4.bindText(1, str9);
                    }
                    sQLiteStatementPrepare4.step();
                    sQLiteStatementPrepare4.close();
                    return null;
                } finally {
                }
            case 20:
                t2a.f update9 = (t2a.f) obj2;
                Intrinsics.checkNotNullParameter(update9, "$this$update");
                update9.getClass();
                String selectedTabId = this.f262194b;
                Intrinsics.checkNotNullParameter(selectedTabId, "selectedTabId");
                return new t2a.f(selectedTabId);
            case 21:
                t2e.g update10 = (t2e.g) obj2;
                Intrinsics.checkNotNullParameter(update10, "$this$update");
                Set set = update10.d;
                String str10 = this.f262194b;
                return t2e.g.a(update10, null, null, null, set.contains(str10) ? a1.j(set, str10) : a1.m(set, str10), null, null, 55);
            case 22:
                LoanBackupCard card = (LoanBackupCard) obj2;
                Intrinsics.checkNotNullParameter(card, "card");
                return new FeatureCommand(new LoanKompotFeatureConfig.SelectBackupCardFlow(this.f262194b, card));
            case 23:
                Loan it10 = (Loan) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return t45.c.f267895a[it10.f.f241820c.ordinal()] == 1 ? DummyCommand.f98635a : new FeatureCommand(new LoanKompotFeatureConfig.Statements(this.f262194b, it10.f.f241820c));
            case 24:
                return t6f.h.a((t6f.h) obj2, null, this.f262194b, 1);
            case 25:
                t6g.d update11 = (t6g.d) obj2;
                Intrinsics.checkNotNullParameter(update11, "$this$update");
                List pagerItems = update11.f268347a;
                Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
                return new t6g.d(pagerItems, this.f262194b);
            case 26:
                ta4.e update12 = (ta4.e) obj2;
                Intrinsics.checkNotNullParameter(update12, "$this$update");
                return ta4.e.a(update12, this.f262194b, false, 2);
            case 27:
                ta4.e eVar2 = (ta4.e) obj2;
                String str11 = this.f262194b;
                if (str11 != null) {
                    return ta4.e.a(eVar2, str11, false, 2);
                }
                throw new IllegalArgumentException("Required value was null.");
            case 28:
                tcg.f update13 = (tcg.f) obj2;
                Intrinsics.checkNotNullParameter(update13, "$this$update");
                return tcg.f.a(update13, this.f262194b, new Data(null, null, false, 7, null), null, null, null, null, 60);
            default:
                Map map3 = (Map) obj2;
                Intrinsics.checkNotNullParameter(map3, "map");
                mf8.e eVar3 = (mf8.e) map3.get(this.f262194b);
                if (eVar3 != null) {
                    return eVar3;
                }
                mf8.e.Companion.getClass();
                return mf8.e.e;
        }
    }

    public /* synthetic */ j(String str, u uVar) {
        this.f262193a = 4;
        this.f262194b = str;
    }
}
