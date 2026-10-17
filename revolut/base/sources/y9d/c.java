package y9d;

import androidx.room.util.SQLiteConnectionUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import ar9.s;
import ar9.t;
import ar9.u;
import ba6.l;
import com.revolut.core.ui_kit.delegates.widgets.QuickActionWidgetLoadingDelegate;
import com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo;
import com.revolut.feature.staking.api.model.StakingProduct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import koi.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import prk.o;
import xq9.g;
import ya5.f;
import yai.k;
import yfd.m;
import yo7.h;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f311835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f311836b;

    public /* synthetic */ c(int i, String str, Object obj2) {
        this.f311835a = i;
        this.f311836b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        SQLiteStatement sQLiteStatementPrepare;
        int i;
        Integer numValueOf;
        int i2;
        Integer numValueOf2;
        SQLiteStatement sQLiteStatementPrepare2;
        switch (this.f311835a) {
            case 0:
                String str = (String) obj2;
                return o.m(str, "templateId", str, this.f311836b);
            case 1:
                f update = (f) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return f.a(update, null, this.f311836b, 1);
            case 2:
                return f.a((f) obj2, null, this.f311836b, 1);
            case 3:
                List list = (List) obj2;
                Intrinsics.checkNotNullParameter(list, "list");
                Iterator it8 = list.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (Intrinsics.f(((l) next).f13938a, this.f311836b)) {
                        }
                    } else {
                        next = null;
                    }
                }
                return (l) next;
            case 4:
                k update2 = (k) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return k.a(update2, this.f311836b, null, false, null, null, 62);
            case 5:
                yb0.d update3 = (yb0.d) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return yb0.d.a(update3, null, this.f311836b, null, null, 13);
            case 6:
                Function0 it9 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new QuickActionWidgetLoadingDelegate.Model(this.f311836b);
            case 7:
                Throwable it10 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return this.f311836b;
            case 8:
                return yed.o.a((yed.o) obj2, null, this.f311836b, null, null, false, false, null, null, null, null, false, null, false, null, null, null, 1048571);
            case 9:
                m updateState = (m) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                String str2 = this.f311836b;
                if (str2 == null) {
                    str2 = "";
                }
                return m.a(updateState, null, null, str2, true, null, 39);
            case 10:
                List events = (List) obj2;
                Intrinsics.checkNotNullParameter(events, "events");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : events) {
                    if (obj3 instanceof bfl.f) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : arrayList) {
                    if (Intrinsics.f(((bfl.f) obj4).e, this.f311836b)) {
                        arrayList2.add(obj4);
                    }
                }
                return arrayList2;
            case 11:
                ym5.e update4 = (ym5.e) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                update4.getClass();
                String legalEntityId = this.f311836b;
                Intrinsics.checkNotNullParameter(legalEntityId, "legalEntityId");
                return new ym5.e(legalEntityId);
            case 12:
                List<PaymentCounterpartyInfo> counterparties = (List) obj2;
                Intrinsics.checkNotNullParameter(counterparties, "counterparties");
                for (PaymentCounterpartyInfo paymentCounterpartyInfo : counterparties) {
                    if (Intrinsics.f(paymentCounterpartyInfo.f79060a, this.f311836b)) {
                        return paymentCounterpartyInfo;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 13:
                return yna.a.a((yna.a) obj2, null, null, this.f311836b, null, null, null, null, false, false, null, false, null, null, null, null, 65531);
            case 14:
                h updateState2 = (h) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return h.a(updateState2, this.f311836b, null, null, null, null, null, null, null, null, null, null, null, null, 16381);
            case 15:
                h updateState3 = (h) obj2;
                Intrinsics.checkNotNullParameter(updateState3, "$this$updateState");
                return h.a(updateState3, null, this.f311836b, null, null, null, null, null, null, null, null, null, null, null, 16379);
            case 16:
                j it11 = (j) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return Boolean.valueOf(Intrinsics.f(it11.getF51573a(), this.f311836b));
            case 17:
                SQLiteStatement sQLiteStatementPrepare3 = ((SQLiteConnection) obj2).prepare("DELETE FROM payments_groups_bills WHERE groupId = ?");
                String str3 = this.f311836b;
                try {
                    if (str3 == null) {
                        sQLiteStatementPrepare3.bindNull(1);
                    } else {
                        sQLiteStatementPrepare3.bindText(1, str3);
                    }
                    sQLiteStatementPrepare3.step();
                    sQLiteStatementPrepare3.close();
                    return null;
                } finally {
                    sQLiteStatementPrepare3.close();
                }
            case 18:
                SQLiteStatement sQLiteStatementPrepare4 = ((SQLiteConnection) obj2).prepare("SELECT * FROM payments_groups_bills WHERE groupId = ?");
                String str4 = this.f311836b;
                try {
                    if (str4 == null) {
                        sQLiteStatementPrepare4.bindNull(1);
                    } else {
                        sQLiteStatementPrepare4.bindText(1, str4);
                    }
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "groupId");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "ownerId");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "createdBy");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "type");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "title");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "amount");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "currencyCode");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "exchangedAmount");
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "createdDate");
                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "transactionId");
                    int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "transactionCategory");
                    int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "transactionLogo");
                    int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "lineItems");
                    int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "receiptImageUri");
                    ArrayList arrayList3 = new ArrayList();
                    while (sQLiteStatementPrepare4.step()) {
                        String text = sQLiteStatementPrepare4.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare4.getText(columnIndexOrThrow);
                        int i3 = columnIndexOrThrow;
                        int i5 = columnIndexOrThrow15;
                        columnIndexOrThrow15 = i5;
                        arrayList3.add(new ar9.j(text, sQLiteStatementPrepare4.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare4.getText(columnIndexOrThrow2), sQLiteStatementPrepare4.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare4.getText(columnIndexOrThrow3), sQLiteStatementPrepare4.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare4.getText(columnIndexOrThrow4), xq9.d.a(sQLiteStatementPrepare4.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare4.getText(columnIndexOrThrow5)), sQLiteStatementPrepare4.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare4.getText(columnIndexOrThrow6), sQLiteStatementPrepare4.getLong(columnIndexOrThrow7), sQLiteStatementPrepare4.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare4.getText(columnIndexOrThrow8), b21.a.g(sQLiteStatementPrepare4.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare4.getText(columnIndexOrThrow9)), sQLiteStatementPrepare4.getLong(columnIndexOrThrow10), sQLiteStatementPrepare4.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare4.getText(columnIndexOrThrow11), sQLiteStatementPrepare4.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare4.getText(columnIndexOrThrow12), sQLiteStatementPrepare4.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare4.getText(columnIndexOrThrow13), xq9.c.a(sQLiteStatementPrepare4.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare4.getText(columnIndexOrThrow14)), sQLiteStatementPrepare4.isNull(i5) ? null : sQLiteStatementPrepare4.getText(i5)));
                        columnIndexOrThrow = i3;
                        break;
                    }
                    sQLiteStatementPrepare4.close();
                    return arrayList3;
                } finally {
                    sQLiteStatementPrepare4.close();
                }
            case 19:
                SQLiteStatement sQLiteStatementPrepare5 = ((SQLiteConnection) obj2).prepare("DELETE FROM payments_groups_bills_splits WHERE groupId = ?");
                String str5 = this.f311836b;
                try {
                    if (str5 == null) {
                        sQLiteStatementPrepare5.bindNull(1);
                    } else {
                        sQLiteStatementPrepare5.bindText(1, str5);
                    }
                    sQLiteStatementPrepare5.step();
                    sQLiteStatementPrepare5.close();
                    return null;
                } finally {
                    sQLiteStatementPrepare5.close();
                }
            case 20:
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("DELETE FROM payments_groups WHERE id = ?");
                String str6 = this.f311836b;
                try {
                    if (str6 == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, str6);
                    }
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.close();
                    return null;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case 21:
                SQLiteStatement sQLiteStatementPrepare6 = ((SQLiteConnection) obj2).prepare("DELETE FROM payments_groups_debts WHERE groupId = ?");
                String str7 = this.f311836b;
                try {
                    if (str7 == null) {
                        sQLiteStatementPrepare6.bindNull(1);
                    } else {
                        sQLiteStatementPrepare6.bindText(1, str7);
                    }
                    sQLiteStatementPrepare6.step();
                    sQLiteStatementPrepare6.close();
                    return null;
                } finally {
                    sQLiteStatementPrepare6.close();
                }
            case 22:
                SQLiteStatement sQLiteStatementPrepare7 = ((SQLiteConnection) obj2).prepare("SELECT * FROM payments_groups_members WHERE groupId = ?");
                String str8 = this.f311836b;
                try {
                    if (str8 == null) {
                        sQLiteStatementPrepare7.bindNull(1);
                    } else {
                        sQLiteStatementPrepare7.bindText(1, str8);
                    }
                    int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare7, "memberId");
                    int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare7, "groupId");
                    int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare7, "inviterId");
                    int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare7, "contactId");
                    int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare7, "type");
                    int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare7, "firstName");
                    int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare7, "lastName");
                    int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare7, "countryCode");
                    int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare7, "isRevolut");
                    ArrayList arrayList4 = new ArrayList();
                    while (sQLiteStatementPrepare7.step()) {
                        String text2 = sQLiteStatementPrepare7.isNull(columnIndexOrThrow16) ? null : sQLiteStatementPrepare7.getText(columnIndexOrThrow16);
                        String text3 = sQLiteStatementPrepare7.isNull(columnIndexOrThrow17) ? null : sQLiteStatementPrepare7.getText(columnIndexOrThrow17);
                        s sVarA = g.a(sQLiteStatementPrepare7.isNull(columnIndexOrThrow18) ? null : sQLiteStatementPrepare7.getText(columnIndexOrThrow18));
                        s sVarA2 = g.a(sQLiteStatementPrepare7.isNull(columnIndexOrThrow19) ? null : sQLiteStatementPrepare7.getText(columnIndexOrThrow19));
                        u uVarA = xq9.h.a(sQLiteStatementPrepare7.isNull(columnIndexOrThrow20) ? null : sQLiteStatementPrepare7.getText(columnIndexOrThrow20));
                        String text4 = sQLiteStatementPrepare7.isNull(columnIndexOrThrow21) ? null : sQLiteStatementPrepare7.getText(columnIndexOrThrow21);
                        String text5 = sQLiteStatementPrepare7.isNull(columnIndexOrThrow22) ? null : sQLiteStatementPrepare7.getText(columnIndexOrThrow22);
                        String text6 = sQLiteStatementPrepare7.isNull(columnIndexOrThrow23) ? null : sQLiteStatementPrepare7.getText(columnIndexOrThrow23);
                        if (sQLiteStatementPrepare7.isNull(columnIndexOrThrow24)) {
                            i = columnIndexOrThrow17;
                            numValueOf = null;
                        } else {
                            i = columnIndexOrThrow17;
                            numValueOf = Integer.valueOf((int) sQLiteStatementPrepare7.getLong(columnIndexOrThrow24));
                        }
                        arrayList4.add(new t(text2, text3, sVarA, sVarA2, uVarA, text4, text5, text6, numValueOf != null ? Boolean.valueOf(numValueOf.intValue() != 0) : null));
                        columnIndexOrThrow17 = i;
                        break;
                    }
                    sQLiteStatementPrepare7.close();
                    return arrayList4;
                } finally {
                    sQLiteStatementPrepare7.close();
                }
            case 23:
                SQLiteStatement sQLiteStatementPrepare8 = ((SQLiteConnection) obj2).prepare("DELETE FROM payments_groups_members WHERE groupId = ?");
                String str9 = this.f311836b;
                try {
                    if (str9 == null) {
                        sQLiteStatementPrepare8.bindNull(1);
                    } else {
                        sQLiteStatementPrepare8.bindText(1, str9);
                    }
                    sQLiteStatementPrepare8.step();
                    sQLiteStatementPrepare8.close();
                    return null;
                } finally {
                    sQLiteStatementPrepare8.close();
                }
            case 24:
                SQLiteStatement sQLiteStatementPrepare9 = ((SQLiteConnection) obj2).prepare("SELECT * FROM payments_groups_members WHERE groupId = ?");
                String str10 = this.f311836b;
                try {
                    if (str10 == null) {
                        sQLiteStatementPrepare9.bindNull(1);
                    } else {
                        sQLiteStatementPrepare9.bindText(1, str10);
                    }
                    int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare9, "memberId");
                    int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare9, "groupId");
                    int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare9, "inviterId");
                    int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare9, "contactId");
                    int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare9, "type");
                    int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare9, "firstName");
                    int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare9, "lastName");
                    int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare9, "countryCode");
                    int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare9, "isRevolut");
                    ArrayList arrayList5 = new ArrayList();
                    while (sQLiteStatementPrepare9.step()) {
                        String text7 = sQLiteStatementPrepare9.isNull(columnIndexOrThrow25) ? null : sQLiteStatementPrepare9.getText(columnIndexOrThrow25);
                        String text8 = sQLiteStatementPrepare9.isNull(columnIndexOrThrow26) ? null : sQLiteStatementPrepare9.getText(columnIndexOrThrow26);
                        s sVarA3 = g.a(sQLiteStatementPrepare9.isNull(columnIndexOrThrow27) ? null : sQLiteStatementPrepare9.getText(columnIndexOrThrow27));
                        s sVarA4 = g.a(sQLiteStatementPrepare9.isNull(columnIndexOrThrow28) ? null : sQLiteStatementPrepare9.getText(columnIndexOrThrow28));
                        u uVarA2 = xq9.h.a(sQLiteStatementPrepare9.isNull(columnIndexOrThrow29) ? null : sQLiteStatementPrepare9.getText(columnIndexOrThrow29));
                        String text9 = sQLiteStatementPrepare9.isNull(columnIndexOrThrow30) ? null : sQLiteStatementPrepare9.getText(columnIndexOrThrow30);
                        String text10 = sQLiteStatementPrepare9.isNull(columnIndexOrThrow31) ? null : sQLiteStatementPrepare9.getText(columnIndexOrThrow31);
                        String text11 = sQLiteStatementPrepare9.isNull(columnIndexOrThrow32) ? null : sQLiteStatementPrepare9.getText(columnIndexOrThrow32);
                        if (sQLiteStatementPrepare9.isNull(columnIndexOrThrow33)) {
                            i2 = columnIndexOrThrow26;
                            numValueOf2 = null;
                        } else {
                            i2 = columnIndexOrThrow26;
                            numValueOf2 = Integer.valueOf((int) sQLiteStatementPrepare9.getLong(columnIndexOrThrow33));
                        }
                        arrayList5.add(new t(text7, text8, sVarA3, sVarA4, uVarA2, text9, text10, text11, numValueOf2 != null ? Boolean.valueOf(numValueOf2.intValue() != 0) : null));
                        columnIndexOrThrow26 = i2;
                        break;
                    }
                    sQLiteStatementPrepare9.close();
                    return arrayList5;
                } finally {
                    sQLiteStatementPrepare9.close();
                }
            case 25:
                SQLiteStatement sQLiteStatementPrepare10 = ((SQLiteConnection) obj2).prepare("DELETE FROM payments_groups_settlements WHERE groupId = ?");
                String str11 = this.f311836b;
                try {
                    if (str11 == null) {
                        sQLiteStatementPrepare10.bindNull(1);
                    } else {
                        sQLiteStatementPrepare10.bindText(1, str11);
                    }
                    sQLiteStatementPrepare10.step();
                    sQLiteStatementPrepare10.close();
                    return null;
                } finally {
                    sQLiteStatementPrepare10.close();
                }
            case 26:
                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
                sQLiteStatementPrepare2 = sQLiteConnection.prepare("DELETE FROM budget_entity WHERE id = ?");
                String str12 = this.f311836b;
                try {
                    if (str12 == null) {
                        sQLiteStatementPrepare2.bindNull(1);
                    } else {
                        sQLiteStatementPrepare2.bindText(1, str12);
                    }
                    sQLiteStatementPrepare2.step();
                    Integer numValueOf3 = Integer.valueOf(SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection));
                    sQLiteStatementPrepare2.close();
                    return numValueOf3;
                } finally {
                    sQLiteStatementPrepare2.close();
                }
            case 27:
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("DELETE FROM budget_entity WHERE walletId = ?");
                String str13 = this.f311836b;
                try {
                    if (str13 == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, str13);
                    }
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.close();
                    return null;
                } finally {
                }
            case 28:
                sQLiteStatementPrepare2 = ((SQLiteConnection) obj2).prepare("SELECT * FROM budget_entity WHERE walletId = ?");
                String str14 = this.f311836b;
                try {
                    if (str14 == null) {
                        sQLiteStatementPrepare2.bindNull(1);
                    } else {
                        sQLiteStatementPrepare2.bindText(1, str14);
                    }
                    int columnIndexOrThrow34 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "id");
                    int columnIndexOrThrow35 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "type");
                    int columnIndexOrThrow36 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "amount");
                    int columnIndexOrThrow37 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "walletId");
                    int columnIndexOrThrow38 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "currency");
                    int columnIndexOrThrow39 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "startDate");
                    int columnIndexOrThrow40 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "endDate");
                    int columnIndexOrThrow41 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "categoryTag");
                    ArrayList arrayList6 = new ArrayList();
                    while (sQLiteStatementPrepare2.step()) {
                        arrayList6.add(new arj.a(sQLiteStatementPrepare2.getLong(columnIndexOrThrow36), sQLiteStatementPrepare2.isNull(columnIndexOrThrow34) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow34), sQLiteStatementPrepare2.isNull(columnIndexOrThrow35) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow35), sQLiteStatementPrepare2.isNull(columnIndexOrThrow37) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow37), sQLiteStatementPrepare2.isNull(columnIndexOrThrow38) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow38), sQLiteStatementPrepare2.isNull(columnIndexOrThrow39) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow39), sQLiteStatementPrepare2.isNull(columnIndexOrThrow40) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow40), sQLiteStatementPrepare2.isNull(columnIndexOrThrow41) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow41)));
                        break;
                    }
                    sQLiteStatementPrepare2.close();
                    return arrayList6;
                } finally {
                }
            default:
                List<StakingProduct> stakingProducts = (List) obj2;
                Intrinsics.checkNotNullParameter(stakingProducts, "stakingProducts");
                for (StakingProduct stakingProduct : stakingProducts) {
                    if (Intrinsics.f(stakingProduct.f88086a, this.f311836b)) {
                        return stakingProduct;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    public /* synthetic */ c(String str, int i) {
        this.f311835a = i;
        this.f311836b = str;
    }
}
