package avj;

import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.google.protobuf.f3;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.database.models.statement.StatementTemplatesInfoDao_Impl;
import com.revolut.data.model.Data;
import com.revolut.feature.card_management.api.CardManagementKompotFeatureConfig;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.junior_transfer.impl.model.TransferSettingsNotFoundException;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import com.revolut.retail.feature.travel_status.impl.domain.model.TravelStatusLinkAccountInfo;
import com.revolut.sso.impl.ui.phone.change_flow.ChangePhoneFlowContract$State;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kl7.b0;
import kl7.z;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import qcl.r;
import tof.a3;
import tof.t3;
import yhm.m;
import zhm.f0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f10061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f10062c;

    public /* synthetic */ o(String str, String str2, int i) {
        this.f10060a = i;
        this.f10061b = str;
        this.f10062c = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws IOException {
        Object objA;
        Object next;
        Set set;
        i93.e eVar;
        i93.l lVar;
        int i = this.f10060a;
        int i2 = 0;
        Object obj3 = null;
        str = null;
        String str = null;
        boolValueOf = null;
        Boolean boolValueOf = null;
        boolValueOf = null;
        Boolean boolValueOf2 = null;
        String text = null;
        jcl.e eVar2 = null;
        String str2 = this.f10062c;
        String str3 = this.f10061b;
        switch (i) {
            case 0:
                a update = (a) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return Intrinsics.f(str3, "EVENT_NAME_LIST_ID") ? a.a(update, this.f10062c, null, null, null, 14) : update;
            case 1:
                bb8.f update2 = (bb8.f) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                if (str3 == null) {
                    str3 = update2.f14185b;
                }
                String str4 = str3;
                if (str2 == null) {
                    str2 = update2.f14186c;
                }
                String[] elements = {!d0.W(str4) ? str4 : null, d0.W(str2) ? null : str2};
                Intrinsics.checkNotNullParameter(elements, "elements");
                String strK0 = zhm.d0.k0(kotlin.collections.d.L(elements), " ", null, null, 0, null, 62);
                Set set2 = (Set) update2.f14184a.getContent();
                return bb8.f.a(update2, null, str4, str2, set2 != null && set2.contains(strK0), 1);
            case 2:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list = (List) pair.f186385a;
                List list2 = (List) pair.f186386b;
                List list3 = list;
                ArrayList arrayList = new ArrayList(w.t(list3, 10));
                Iterator it8 = list3.iterator();
                while (it8.hasNext()) {
                    arrayList.add(Long.valueOf(((zm3.f) it8.next()).f323346b));
                }
                Set setI1 = zhm.d0.i1(arrayList);
                List list4 = list;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : list2) {
                    if (!setI1.contains(Long.valueOf(((zm3.f) obj4).f323346b))) {
                        arrayList2.add(obj4);
                    }
                }
                return zhm.d0.P0(zhm.d0.E0(arrayList2, list4), new a9j.f(new a9j.f(new bm8.a(new a9j.f(str3, 4), str2, z ? 1 : 0), 5), 6));
            case 3:
                return StatementTemplatesInfoDao_Impl.lambda$getById$3(str3, str2, (SQLiteConnection) obj2);
            case 4:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                j61.c cVar = (j61.c) pair2.f186385a;
                qv0.i iVar = (qv0.i) pair2.f186386b;
                a3 a3Var = cVar.f171656a;
                t3 t3Var = cVar.f171657b;
                try {
                    m.Companion companion = yhm.m.INSTANCE;
                    objA = str2 != null ? Long.valueOf(Long.parseLong(str2)) : null;
                    break;
                } catch (Throwable th10) {
                    m.Companion companion2 = yhm.m.INSTANCE;
                    objA = yhm.o.a(th10);
                }
                return new crf.b(a3Var, t3Var, iVar, this.f10061b, (Long) (objA instanceof yhm.n ? null : objA));
            case 5:
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("DELETE FROM holdings WHERE id = ? AND portfolio_id=?");
                try {
                    if (str3 == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, str3);
                    }
                    if (str2 == null) {
                        sQLiteStatementPrepare.bindNull(2);
                    } else {
                        sQLiteStatementPrepare.bindText(2, str2);
                    }
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.close();
                    return null;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case 6:
                SQLiteStatement sQLiteStatementPrepare2 = ((SQLiteConnection) obj2).prepare("SELECT * FROM holdings WHERE portfolio_id = ? AND id = ?");
                try {
                    if (str3 == null) {
                        sQLiteStatementPrepare2.bindNull(1);
                    } else {
                        sQLiteStatementPrepare2.bindText(1, str3);
                    }
                    if (str2 == null) {
                        sQLiteStatementPrepare2.bindNull(2);
                    } else {
                        sQLiteStatementPrepare2.bindText(2, str2);
                    }
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "portfolio_id");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "creation_date");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "holding_state");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "name");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "currency");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "cash_holding");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "stock_holding");
                    if (sQLiteStatementPrepare2.step()) {
                        String text2 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow);
                        String text3 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow2);
                        Long lValueOf = sQLiteStatementPrepare2.isNull(columnIndexOrThrow3) ? null : Long.valueOf(sQLiteStatementPrepare2.getLong(columnIndexOrThrow3));
                        String text4 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow4);
                        String text5 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow5);
                        String text6 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow6);
                        jcl.a aVarA = r.a(sQLiteStatementPrepare2.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow7));
                        if (!sQLiteStatementPrepare2.isNull(columnIndexOrThrow8)) {
                            text = sQLiteStatementPrepare2.getText(columnIndexOrThrow8);
                        }
                        eVar2 = new jcl.e(text2, text3, lValueOf, text4, text5, text6, aVarA, r.b(text));
                    }
                    sQLiteStatementPrepare2.close();
                    return eVar2;
                } finally {
                    sQLiteStatementPrepare2.close();
                }
            case 7:
                SQLiteStatement sQLiteStatementPrepare3 = ((SQLiteConnection) obj2).prepare("DELETE FROM `candle_sticks` WHERE ref = ? AND period = ?");
                try {
                    if (str3 == null) {
                        sQLiteStatementPrepare3.bindNull(1);
                    } else {
                        sQLiteStatementPrepare3.bindText(1, str3);
                    }
                    if (str2 == null) {
                        sQLiteStatementPrepare3.bindNull(2);
                    } else {
                        sQLiteStatementPrepare3.bindText(2, str2);
                    }
                    sQLiteStatementPrepare3.step();
                    sQLiteStatementPrepare3.close();
                    return null;
                } finally {
                    sQLiteStatementPrepare3.close();
                }
            case 8:
                SQLiteStatement sQLiteStatementPrepare4 = ((SQLiteConnection) obj2).prepare("SELECT * FROM account_notification_info WHERE productId = ? AND accountId = ?");
                try {
                    if (str3 == null) {
                        sQLiteStatementPrepare4.bindNull(1);
                    } else {
                        sQLiteStatementPrepare4.bindText(1, str3);
                    }
                    if (str2 == null) {
                        sQLiteStatementPrepare4.bindNull(2);
                    } else {
                        sQLiteStatementPrepare4.bindText(2, str2);
                    }
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "accountId");
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "productId");
                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "lastSeenTimestamp");
                    int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "lastActionTimestamp");
                    int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "lastTransactionTimestamp");
                    int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "unreadCounter");
                    ArrayList arrayList3 = new ArrayList();
                    while (sQLiteStatementPrepare4.step()) {
                        arrayList3.add(new gge.a((int) sQLiteStatementPrepare4.getLong(columnIndexOrThrow14), sQLiteStatementPrepare4.getLong(columnIndexOrThrow11), sQLiteStatementPrepare4.getLong(columnIndexOrThrow12), sQLiteStatementPrepare4.getLong(columnIndexOrThrow13), sQLiteStatementPrepare4.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare4.getText(columnIndexOrThrow9), sQLiteStatementPrepare4.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare4.getText(columnIndexOrThrow10)));
                        break;
                    }
                    sQLiteStatementPrepare4.close();
                    return arrayList3;
                } finally {
                    sQLiteStatementPrepare4.close();
                }
            case 9:
                e2l.d update3 = (e2l.d) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                Map fieldValues = d0.W(str3) ? r0.l(str2, update3.f122142c) : r0.q(update3.f122142c, new Pair(str2, str3));
                String partnerId = update3.f122140a;
                TravelStatusLinkAccountInfo linkAccountInfo = update3.f122141b;
                Intrinsics.checkNotNullParameter(partnerId, "partnerId");
                Intrinsics.checkNotNullParameter(linkAccountInfo, "linkAccountInfo");
                Intrinsics.checkNotNullParameter(fieldValues, "fieldValues");
                return new e2l.d(partnerId, linkAccountInfo, fieldValues);
            case 10:
                BankTransferData updateTransferData = (BankTransferData) obj2;
                Intrinsics.checkNotNullParameter(updateTransferData, "$this$updateTransferData");
                LinkedHashMap linkedHashMapZ = r0.z(updateTransferData.f101931m);
                linkedHashMapZ.put(str3, str2);
                Unit unit = Unit.f186387a;
                return BankTransferData.a(updateTransferData, 0L, null, null, null, null, null, null, null, null, linkedHashMapZ, null, null, null, 1044479);
            case 11:
                SQLiteStatement sQLiteStatementPrepare5 = ((SQLiteConnection) obj2).prepare("SELECT EXISTS(SELECT 1 FROM air_tip_state WHERE air_tip_id = ? AND air_tip_type = ? AND has_animated = 1)");
                try {
                    if (str3 == null) {
                        sQLiteStatementPrepare5.bindNull(1);
                    } else {
                        sQLiteStatementPrepare5.bindText(1, str3);
                    }
                    if (str2 == null) {
                        sQLiteStatementPrepare5.bindNull(2);
                    } else {
                        sQLiteStatementPrepare5.bindText(2, str2);
                    }
                    if (sQLiteStatementPrepare5.step()) {
                        Integer numValueOf = sQLiteStatementPrepare5.isNull(0) ? null : Integer.valueOf((int) sQLiteStatementPrepare5.getLong(0));
                        if (numValueOf != null) {
                            boolValueOf2 = Boolean.valueOf(numValueOf.intValue() != 0);
                            break;
                        }
                    }
                    sQLiteStatementPrepare5.close();
                    return boolValueOf2;
                } finally {
                    sQLiteStatementPrepare5.close();
                }
            case 12:
                SQLiteStatement sQLiteStatementPrepare6 = ((SQLiteConnection) obj2).prepare("SELECT EXISTS(SELECT 1 FROM air_tip_state WHERE air_tip_id = ? AND air_tip_type = ? AND was_clicked = 1)");
                try {
                    if (str3 == null) {
                        sQLiteStatementPrepare6.bindNull(1);
                    } else {
                        sQLiteStatementPrepare6.bindText(1, str3);
                    }
                    if (str2 == null) {
                        sQLiteStatementPrepare6.bindNull(2);
                    } else {
                        sQLiteStatementPrepare6.bindText(2, str2);
                    }
                    if (sQLiteStatementPrepare6.step()) {
                        Integer numValueOf2 = sQLiteStatementPrepare6.isNull(0) ? null : Integer.valueOf((int) sQLiteStatementPrepare6.getLong(0));
                        if (numValueOf2 != null) {
                            boolValueOf = Boolean.valueOf(numValueOf2.intValue() != 0);
                            break;
                        }
                    }
                    sQLiteStatementPrepare6.close();
                    return boolValueOf;
                } finally {
                    sQLiteStatementPrepare6.close();
                }
            case 13:
                SQLiteStatement sQLiteStatementPrepare7 = ((SQLiteConnection) obj2).prepare("UPDATE payments_social_sent_message SET messageId = ? WHERE messageId = ?");
                try {
                    if (str3 == null) {
                        sQLiteStatementPrepare7.bindNull(1);
                    } else {
                        sQLiteStatementPrepare7.bindText(1, str3);
                    }
                    if (str2 == null) {
                        sQLiteStatementPrepare7.bindNull(2);
                    } else {
                        sQLiteStatementPrepare7.bindText(2, str2);
                    }
                    sQLiteStatementPrepare7.step();
                    sQLiteStatementPrepare7.close();
                    return null;
                } finally {
                    sQLiteStatementPrepare7.close();
                }
            case 14:
                SQLiteStatement sQLiteStatementPrepare8 = ((SQLiteConnection) obj2).prepare("DELETE FROM converter_items WHERE asset_type_key = ? AND asset_code = ?");
                try {
                    if (str3 == null) {
                        sQLiteStatementPrepare8.bindNull(1);
                    } else {
                        sQLiteStatementPrepare8.bindText(1, str3);
                    }
                    if (str2 == null) {
                        sQLiteStatementPrepare8.bindNull(2);
                    } else {
                        sQLiteStatementPrepare8.bindText(2, str2);
                    }
                    sQLiteStatementPrepare8.step();
                    sQLiteStatementPrepare8.close();
                    return null;
                } finally {
                    sQLiteStatementPrepare8.close();
                }
            case 15:
                return hu1.o.a((hu1.o) obj2, null, null, null, false, false, false, true, this.f10061b, this.f10062c, 63);
            case 16:
                String preferredName = (String) obj2;
                Intrinsics.checkNotNullParameter(preferredName, "preferredName");
                return a0.D(str3, str2, preferredName, false);
            case 17:
                SQLiteStatement sQLiteStatementPrepare9 = ((SQLiteConnection) obj2).prepare("UPDATE transactions SET fraud_state=? WHERE group_id=?");
                try {
                    if (str3 == null) {
                        sQLiteStatementPrepare9.bindNull(1);
                    } else {
                        sQLiteStatementPrepare9.bindText(1, str3);
                    }
                    if (str2 == null) {
                        sQLiteStatementPrepare9.bindNull(2);
                    } else {
                        sQLiteStatementPrepare9.bindText(2, str2);
                    }
                    sQLiteStatementPrepare9.step();
                    sQLiteStatementPrepare9.close();
                    return null;
                } finally {
                }
            case 18:
                mp7.h update4 = (mp7.h) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                Data data = update4.f207772a;
                Map map = update4.f207774c;
                Iterable iterable = (List) data.getContent();
                if (iterable == null) {
                    iterable = f0.f322471a;
                }
                Iterator it9 = iterable.iterator();
                while (true) {
                    if (it9.hasNext()) {
                        next = it9.next();
                        b0 b0Var = (b0) next;
                        if (b0Var.e != z.DRIVER_NUMBER || !Intrinsics.f(b0Var.f185294a, str3)) {
                        }
                    } else {
                        next = null;
                    }
                }
                b0 b0Var2 = (b0) next;
                return mp7.h.a(update4, null, r0.q(update4.f207773b, new Pair(str3, str2)), b0Var2 != null ? ue8.c.I(str2, b0Var2.e) : true ? r0.l(str3, map) : r0.q(map, new Pair(str3, new TextLocalisedClause(R$string.car_insurance_imid_cells_driver_number_error, null, null, 14))), null, 9);
            case 19:
                mr1.e update5 = (mr1.e) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                Map userInputs = r0.q(update5.f208041b, new Pair(str3, str2));
                List formFields = update5.f208040a;
                Intrinsics.checkNotNullParameter(formFields, "formFields");
                Intrinsics.checkNotNullParameter(userInputs, "userInputs");
                return new mr1.e(formFields, userInputs);
            case 20:
                Map it10 = (Map) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                ogd.k kVarG = n4d.m.g(str3, str2, it10);
                return kVarG == null ? n4d.m.f212374j : kVarG;
            case 21:
                na8.l update6 = (na8.l) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                if (str3 == null) {
                    str3 = update6.e;
                }
                if (str2 == null) {
                    str2 = update6.f213831g;
                }
                String str5 = (str3 == null || d0.W(str3)) ? null : str3;
                if (str2 != null && !d0.W(str2)) {
                    str = str2;
                }
                String[] elements2 = {str5, str};
                Intrinsics.checkNotNullParameter(elements2, "elements");
                String lowerCase = zhm.d0.k0(kotlin.collections.d.L(elements2), " ", null, null, 0, null, 62).toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                return na8.l.a(update6, null, null, null, null, str3, (str3 == null || str2 == null || (set = (Set) update6.f213829b.getContent()) == null || !set.contains(lowerCase)) ? false : true, str2, null, null, null, null, null, 3983);
            case 22:
                f3 buildStruct = (f3) obj2;
                Intrinsics.checkNotNullParameter(buildStruct, "$this$buildStruct");
                com.bumptech.glide.c.x(buildStruct, "packageName", str3);
                if (str2 != null) {
                    com.bumptech.glide.c.x(buildStruct, "sha256", str2);
                }
                return Unit.f186387a;
            case 23:
                return ChangePhoneFlowContract$State.a((ChangePhoneFlowContract$State) obj2, null, str3, str2, 1);
            case 24:
                List inputs = (List) obj2;
                Intrinsics.checkNotNullParameter(inputs, "inputs");
                return of9.d.c(str3, str2, inputs);
            case 25:
                od0.i location = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(location, "location");
                co3.a aVar = (co3.a) location.f224257a;
                String strValueOf = aVar != null ? String.valueOf(aVar.f25486a) : null;
                co3.a aVar2 = (co3.a) location.f224257a;
                return new oid.j(str3, str2, strValueOf, aVar2 != null ? String.valueOf(aVar2.f25487b) : null);
            case 26:
                qn9.f updateState = (qn9.f) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                xi0.b.Companion.getClass();
                return qn9.f.a(updateState, xi0.a.a(str3), 0L, null, this.f10062c, null, 22);
            case 27:
                List settings = (List) obj2;
                Intrinsics.checkNotNullParameter(settings, "settings");
                Iterator it11 = settings.iterator();
                while (true) {
                    if (it11.hasNext()) {
                        Object next2 = it11.next();
                        if (Intrinsics.f(((sq8.d) next2).f265025b, str2)) {
                            obj3 = next2;
                        }
                    }
                }
                sq8.d dVar = (sq8.d) obj3;
                if (dVar != null) {
                    return new kq8.e(dVar.f265024a, dVar.f265025b, dVar.f265027g);
                }
                throw new TransferSettingsNotFoundException(a0.d.s("No detailed settings found for juniorId = ", str3, " & counterpartyId = ", str2));
            case 28:
                SQLiteStatement sQLiteStatementPrepare10 = ((SQLiteConnection) obj2).prepare("DELETE FROM chat_drafts WHERE routingMode = ? AND routingKeyValue = ?");
                try {
                    if (str3 == null) {
                        sQLiteStatementPrepare10.bindNull(1);
                    } else {
                        sQLiteStatementPrepare10.bindText(1, str3);
                    }
                    if (str2 == null) {
                        sQLiteStatementPrepare10.bindNull(2);
                    } else {
                        sQLiteStatementPrepare10.bindText(2, str2);
                    }
                    sQLiteStatementPrepare10.step();
                    Unit unit2 = Unit.f186387a;
                    sQLiteStatementPrepare10.close();
                    return unit2;
                } finally {
                }
            default:
                h93.f0 card = (h93.f0) obj2;
                Intrinsics.checkNotNullParameter(card, "card");
                i93.e[] eVarArrValues = i93.e.values();
                int length = eVarArrValues.length;
                while (true) {
                    if (i2 < length) {
                        eVar = eVarArrValues[i2];
                        if (!a0.z(eVar.name(), str3, true)) {
                            i2++;
                        }
                    } else {
                        eVar = null;
                    }
                }
                if (eVar == null) {
                    throw new IllegalStateException("Unknown security option type");
                }
                i93.c cVar2 = card.f150113g;
                i93.k kVar = cVar2 != null ? cVar2.f159551c : null;
                i93.i iVarB = kVar != null ? kVar.b(eVar) : null;
                if (iVarB == null || (lVar = iVarB.d) == null) {
                    throw new IllegalStateException("Security option transactionLimit not configurable");
                }
                return new FeatureCommand(new CardManagementKompotFeatureConfig.SetTransactionLimit(str2, eVar, lVar));
        }
    }

    public /* synthetic */ o(String str, String str2, oki.h hVar, int i) {
        this.f10060a = i;
        this.f10061b = str;
        this.f10062c = str2;
    }

    public /* synthetic */ o(String str, r10.f fVar, String str2) {
        this.f10060a = 4;
        this.f10061b = str;
        this.f10062c = str2;
    }

    public /* synthetic */ o(n4d.m mVar, String str, String str2) {
        this.f10060a = 20;
        this.f10061b = str;
        this.f10062c = str2;
    }
}
