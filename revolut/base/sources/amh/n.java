package amh;

import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.data.database.models.splitbill.SplitBillDao_Impl;
import com.revolut.feature.security_hub.impl.ui.transactions_limits.flow.TransactionsLimitsFlowContract$FlowState;
import com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountAvailableToOnboard;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccounts;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Instant;
import ueg.h0;
import v30.c0;
import yhm.m;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f6414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f6415c;

    public /* synthetic */ n(d1l.b bVar, List list, String str) {
        this.f6413a = 4;
        this.f6414b = list;
        this.f6415c = str;
    }

    /* JADX WARN: Finally extract failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        Object obj3;
        Object objA;
        Object next2;
        int i = this.f6413a;
        od0.i iVar = od0.i.f224256b;
        boolean z = false;
        int i2 = 1;
        List<String> list = this.f6414b;
        String str = this.f6415c;
        switch (i) {
            case 0:
                return h.a((h) obj2, null, this.f6414b, null, false, null, this.f6415c, 29);
            case 1:
                List cashHoldings = (List) obj2;
                Intrinsics.checkNotNullParameter(cashHoldings, "cashHoldings");
                Iterator it8 = cashHoldings.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (Intrinsics.f(((kel.b) next).f183150c, str)) {
                        }
                    } else {
                        next = null;
                    }
                }
                kel.b bVar = (kel.b) next;
                if (bVar == null) {
                    od0.i.Companion.getClass();
                    return iVar;
                }
                List list2 = list;
                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                Iterator it9 = list2.iterator();
                while (it9.hasNext()) {
                    arrayList.add((TradingAccount) ((Pair) it9.next()).f186385a);
                }
                Iterator it10 = arrayList.iterator();
                while (true) {
                    if (it10.hasNext()) {
                        Object next3 = it10.next();
                        List listJ = ((TradingAccount) next3).J();
                        if (!(listJ instanceof Collection) || !listJ.isEmpty()) {
                            Iterator it11 = listJ.iterator();
                            while (it11.hasNext()) {
                                if (Intrinsics.f(((TradingAccount.Portfolio) it11.next()).f105210a.toString(), bVar.f183148a.f183146b)) {
                                    obj3 = next3;
                                }
                            }
                        }
                    } else {
                        obj3 = null;
                    }
                }
                TradingAccount tradingAccount = (TradingAccount) obj3;
                if (tradingAccount == null) {
                    od0.i.Companion.getClass();
                    return iVar;
                }
                od0.h hVar = od0.i.Companion;
                Pair pair = new Pair(bVar, tradingAccount);
                hVar.getClass();
                return od0.h.a(pair);
            case 2:
                cab.g update = (cab.g) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return cab.g.a(update, this.f6415c, null, null, this.f6414b, 6);
            case 3:
                return SplitBillDao_Impl.lambda$deleteAllById$5(str, list, (SQLiteConnection) obj2);
            case 4:
                TradingAccounts tradingAccounts = (TradingAccounts) obj2;
                Intrinsics.checkNotNullParameter(tradingAccounts, "tradingAccounts");
                try {
                    m.Companion companion = yhm.m.INSTANCE;
                    objA = UUID.fromString(str);
                    break;
                } catch (Throwable th10) {
                    m.Companion companion2 = yhm.m.INSTANCE;
                    objA = yhm.o.a(th10);
                }
                if (objA instanceof yhm.n) {
                    objA = null;
                }
                UUID uuid = (UUID) objA;
                Iterator it12 = tradingAccounts.f105278a.iterator();
                while (true) {
                    if (it12.hasNext()) {
                        next2 = it12.next();
                        TradingAccount tradingAccount2 = (TradingAccount) next2;
                        if (tradingAccount2.getD() == cfl.b.TERMINATED || !Intrinsics.f(tradingAccount2.getF105262a(), uuid)) {
                        }
                    } else {
                        next2 = null;
                    }
                }
                TradingAccount tradingAccount3 = (TradingAccount) next2;
                List list3 = tradingAccounts.f105279b;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator it13 = list3.iterator();
                    while (true) {
                        if (it13.hasNext()) {
                            if (Intrinsics.f(((TradingAccountAvailableToOnboard) it13.next()).f105265a, str)) {
                                z = true;
                            }
                        }
                    }
                }
                if (tradingAccount3 != null) {
                    List list4 = list;
                    Object withTradingAccount = (list4 == null || list4.isEmpty()) ? new TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccount(tradingAccount3) : new TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccountAndProducts(tradingAccount3, list);
                    od0.i.Companion.getClass();
                    return od0.h.a(withTradingAccount);
                }
                if (!z) {
                    od0.i.Companion.getClass();
                    return iVar;
                }
                List list5 = list;
                Object withAvailableAccountId = (list5 == null || list5.isEmpty()) ? new TradingOnboardingFeatureConfig.TradingAccountOrType.WithAvailableAccountId(str, null) : new TradingOnboardingFeatureConfig.TradingAccountOrType.WithAvailableAccountIdAndProducts(str, null, list);
                od0.i.Companion.getClass();
                return od0.h.a(withAvailableAccountId);
            case 5:
                return TransactionsLimitsFlowContract$FlowState.a((TransactionsLimitsFlowContract$FlowState) obj2, str, list, 12);
            case 6:
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare(str);
                try {
                    for (String str2 : list) {
                        if (str2 == null) {
                            sQLiteStatementPrepare.bindNull(i2);
                        } else {
                            sQLiteStatementPrepare.bindText(i2, str2);
                        }
                        i2++;
                    }
                    sQLiteStatementPrepare.step();
                    Unit unit = Unit.f186387a;
                    sQLiteStatementPrepare.close();
                    return unit;
                } catch (Throwable th11) {
                    sQLiteStatementPrepare.close();
                    throw th11;
                }
            case 7:
                SQLiteStatement sQLiteStatementPrepare2 = ((SQLiteConnection) obj2).prepare(str);
                try {
                    for (String str3 : list) {
                        if (str3 == null) {
                            sQLiteStatementPrepare2.bindNull(i2);
                        } else {
                            sQLiteStatementPrepare2.bindText(i2, str3);
                        }
                        i2++;
                    }
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "recipientId");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "recipientType");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "itemId");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "itemType");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "unreadCounter");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "unreadSyncTimestamp");
                    ArrayList arrayList2 = new ArrayList();
                    while (sQLiteStatementPrepare2.step()) {
                        arrayList2.add(new nx9.b(sQLiteStatementPrepare2.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow), jx9.a.b(sQLiteStatementPrepare2.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow2)), sQLiteStatementPrepare2.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow3), jx9.a.a(sQLiteStatementPrepare2.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow4)), (int) sQLiteStatementPrepare2.getLong(columnIndexOrThrow5), sQLiteStatementPrepare2.getLong(columnIndexOrThrow6)));
                        break;
                    }
                    sQLiteStatementPrepare2.close();
                    return arrayList2;
                } catch (Throwable th12) {
                    sQLiteStatementPrepare2.close();
                    throw th12;
                }
            case 8:
                SQLiteStatement sQLiteStatementPrepare3 = ((SQLiteConnection) obj2).prepare(str);
                try {
                    for (String str4 : list) {
                        if (str4 == null) {
                            sQLiteStatementPrepare3.bindNull(i2);
                        } else {
                            sQLiteStatementPrepare3.bindText(i2, str4);
                        }
                        i2++;
                    }
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "code");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "username");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "legalName");
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "firstName");
                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "lastName");
                    int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "country");
                    int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "appMode");
                    int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "type");
                    int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "businessName");
                    int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "transactionsCount");
                    int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "timestamp");
                    ArrayList arrayList3 = new ArrayList();
                    while (sQLiteStatementPrepare3.step()) {
                        int i3 = columnIndexOrThrow8;
                        int i5 = columnIndexOrThrow9;
                        arrayList3.add(new ml3.o(sQLiteStatementPrepare3.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare3.getText(columnIndexOrThrow7), sQLiteStatementPrepare3.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare3.getText(columnIndexOrThrow8), sQLiteStatementPrepare3.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare3.getText(columnIndexOrThrow9), sQLiteStatementPrepare3.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare3.getText(columnIndexOrThrow10), sQLiteStatementPrepare3.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare3.getText(columnIndexOrThrow11), sQLiteStatementPrepare3.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare3.getText(columnIndexOrThrow12), sQLiteStatementPrepare3.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare3.getText(columnIndexOrThrow13), sQLiteStatementPrepare3.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare3.getText(columnIndexOrThrow14), sQLiteStatementPrepare3.isNull(columnIndexOrThrow15) ? null : sQLiteStatementPrepare3.getText(columnIndexOrThrow15), (int) sQLiteStatementPrepare3.getLong(columnIndexOrThrow16), sQLiteStatementPrepare3.getLong(columnIndexOrThrow17)));
                        columnIndexOrThrow8 = i3;
                        columnIndexOrThrow9 = i5;
                        break;
                    }
                    sQLiteStatementPrepare3.close();
                    return arrayList3;
                } catch (Throwable th13) {
                    sQLiteStatementPrepare3.close();
                    throw th13;
                }
            case 9:
                pqc.g update2 = (pqc.g) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return pqc.g.a(update2, null, list, str, 1);
            case 10:
                SQLiteStatement sQLiteStatementPrepare4 = ((SQLiteConnection) obj2).prepare(str);
                try {
                    Iterator it14 = list.iterator();
                    int i6 = 1;
                    while (it14.hasNext()) {
                        String strC = s10.a.c((UUID) it14.next());
                        if (strC == null) {
                            sQLiteStatementPrepare4.bindNull(i6);
                        } else {
                            sQLiteStatementPrepare4.bindText(i6, strC);
                        }
                        i6++;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    while (sQLiteStatementPrepare4.step()) {
                        arrayList4.add(new u10.q(s10.a.h(sQLiteStatementPrepare4.isNull(0) ? null : sQLiteStatementPrepare4.getText(0)), s10.a.e(sQLiteStatementPrepare4.isNull(1) ? null : sQLiteStatementPrepare4.getText(1)), s10.a.e(sQLiteStatementPrepare4.isNull(4) ? null : sQLiteStatementPrepare4.getText(4)), s10.a.h(sQLiteStatementPrepare4.isNull(2) ? null : sQLiteStatementPrepare4.getText(2)), s10.a.h(sQLiteStatementPrepare4.isNull(5) ? null : sQLiteStatementPrepare4.getText(5)), s10.a.d(sQLiteStatementPrepare4.isNull(3) ? null : sQLiteStatementPrepare4.getText(3)), s10.a.h(sQLiteStatementPrepare4.isNull(6) ? null : sQLiteStatementPrepare4.getText(6)), (int) sQLiteStatementPrepare4.getLong(7), (int) sQLiteStatementPrepare4.getLong(8), (int) sQLiteStatementPrepare4.getLong(9)));
                        break;
                    }
                    sQLiteStatementPrepare4.close();
                    return arrayList4;
                } catch (Throwable th14) {
                    sQLiteStatementPrepare4.close();
                    throw th14;
                }
            case 11:
                SQLiteStatement sQLiteStatementPrepare5 = ((SQLiteConnection) obj2).prepare(str);
                try {
                    Iterator it15 = list.iterator();
                    while (it15.hasNext()) {
                        String strC2 = s10.a.c((UUID) it15.next());
                        if (strC2 == null) {
                            sQLiteStatementPrepare5.bindNull(i2);
                        } else {
                            sQLiteStatementPrepare5.bindText(i2, strC2);
                        }
                        i2++;
                    }
                    int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare5, "id");
                    int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare5, "createdAt");
                    int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare5, "chatId");
                    int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare5, "data");
                    int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare5, "feedType");
                    int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare5, "ticketCreatedAt");
                    int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare5, "feedId");
                    int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare5, "serverId");
                    int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare5, "chatIdGroup");
                    int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare5, "feedIdGroup");
                    int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare5, "feedTypeGroup");
                    ArrayList arrayList5 = new ArrayList();
                    while (sQLiteStatementPrepare5.step()) {
                        UUID uuidH = s10.a.h(sQLiteStatementPrepare5.isNull(columnIndexOrThrow18) ? null : sQLiteStatementPrepare5.getText(columnIndexOrThrow18));
                        Instant instantE = s10.a.e(sQLiteStatementPrepare5.isNull(columnIndexOrThrow19) ? null : sQLiteStatementPrepare5.getText(columnIndexOrThrow19));
                        UUID uuidH2 = s10.a.h(sQLiteStatementPrepare5.isNull(columnIndexOrThrow20) ? null : sQLiteStatementPrepare5.getText(columnIndexOrThrow20));
                        String text = sQLiteStatementPrepare5.isNull(columnIndexOrThrow21) ? null : sQLiteStatementPrepare5.getText(columnIndexOrThrow21);
                        c0 c0VarD = s10.a.d(sQLiteStatementPrepare5.isNull(columnIndexOrThrow22) ? null : sQLiteStatementPrepare5.getText(columnIndexOrThrow22));
                        int i21 = columnIndexOrThrow22;
                        int i22 = columnIndexOrThrow19;
                        int i32 = columnIndexOrThrow20;
                        arrayList5.add(new u10.h(uuidH, instantE, uuidH2, text, c0VarD, s10.a.e(sQLiteStatementPrepare5.isNull(columnIndexOrThrow23) ? null : sQLiteStatementPrepare5.getText(columnIndexOrThrow23)), s10.a.h(sQLiteStatementPrepare5.isNull(columnIndexOrThrow24) ? null : sQLiteStatementPrepare5.getText(columnIndexOrThrow24)), s10.a.h(sQLiteStatementPrepare5.isNull(columnIndexOrThrow25) ? null : sQLiteStatementPrepare5.getText(columnIndexOrThrow25)), (int) sQLiteStatementPrepare5.getLong(columnIndexOrThrow26), (int) sQLiteStatementPrepare5.getLong(columnIndexOrThrow27), (int) sQLiteStatementPrepare5.getLong(columnIndexOrThrow28)));
                        columnIndexOrThrow19 = i22;
                        columnIndexOrThrow20 = i32;
                        columnIndexOrThrow22 = i21;
                        break;
                    }
                    sQLiteStatementPrepare5.close();
                    return arrayList5;
                } catch (Throwable th15) {
                    sQLiteStatementPrepare5.close();
                    throw th15;
                }
            case 12:
                SQLiteStatement sQLiteStatementPrepare6 = ((SQLiteConnection) obj2).prepare(str);
                try {
                    Iterator it16 = list.iterator();
                    while (it16.hasNext()) {
                        String strC3 = s10.a.c((UUID) it16.next());
                        if (strC3 == null) {
                            sQLiteStatementPrepare6.bindNull(i2);
                        } else {
                            sQLiteStatementPrepare6.bindText(i2, strC3);
                        }
                        i2++;
                    }
                    sQLiteStatementPrepare6.step();
                    Unit unit2 = Unit.f186387a;
                    sQLiteStatementPrepare6.close();
                    return unit2;
                } catch (Throwable th16) {
                    sQLiteStatementPrepare6.close();
                    throw th16;
                }
            case 13:
                SQLiteStatement sQLiteStatementPrepare7 = ((SQLiteConnection) obj2).prepare(str);
                try {
                    Iterator it17 = list.iterator();
                    while (it17.hasNext()) {
                        u10.o status = (u10.o) it17.next();
                        Intrinsics.checkNotNullParameter(status, "status");
                        String strName = status.name();
                        if (strName == null) {
                            sQLiteStatementPrepare7.bindNull(i2);
                        } else {
                            sQLiteStatementPrepare7.bindText(i2, strName);
                        }
                        i2++;
                    }
                    int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare7, "uploadCorrelationId");
                    int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare7, "ticketId");
                    int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare7, "messageId");
                    int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare7, "messageCorrelationId");
                    int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare7, "filePath");
                    int columnIndexOrThrow34 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare7, "contentType");
                    int columnIndexOrThrow35 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare7, "status");
                    int columnIndexOrThrow36 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare7, "createdAt");
                    ArrayList arrayList6 = new ArrayList();
                    while (sQLiteStatementPrepare7.step()) {
                        UUID uuidH3 = s10.a.h(sQLiteStatementPrepare7.isNull(columnIndexOrThrow29) ? null : sQLiteStatementPrepare7.getText(columnIndexOrThrow29));
                        UUID uuidH4 = s10.a.h(sQLiteStatementPrepare7.isNull(columnIndexOrThrow30) ? null : sQLiteStatementPrepare7.getText(columnIndexOrThrow30));
                        UUID uuidH5 = s10.a.h(sQLiteStatementPrepare7.isNull(columnIndexOrThrow31) ? null : sQLiteStatementPrepare7.getText(columnIndexOrThrow31));
                        UUID uuidH6 = s10.a.h(sQLiteStatementPrepare7.isNull(columnIndexOrThrow32) ? null : sQLiteStatementPrepare7.getText(columnIndexOrThrow32));
                        String text2 = sQLiteStatementPrepare7.isNull(columnIndexOrThrow33) ? null : sQLiteStatementPrepare7.getText(columnIndexOrThrow33);
                        String text3 = sQLiteStatementPrepare7.isNull(columnIndexOrThrow34) ? null : sQLiteStatementPrepare7.getText(columnIndexOrThrow34);
                        String value = sQLiteStatementPrepare7.isNull(columnIndexOrThrow35) ? null : sQLiteStatementPrepare7.getText(columnIndexOrThrow35);
                        Intrinsics.checkNotNullParameter(value, "value");
                        arrayList6.add(new u10.n(uuidH3, uuidH4, uuidH5, uuidH6, text2, text3, u10.o.valueOf(value), sQLiteStatementPrepare7.getLong(columnIndexOrThrow36)));
                        break;
                    }
                    sQLiteStatementPrepare7.close();
                    return arrayList6;
                } catch (Throwable th17) {
                    sQLiteStatementPrepare7.close();
                    throw th17;
                }
            default:
                ueg.v update3 = (ueg.v) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return ueg.v.a(update3, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, h0.IDLE, this.f6415c, null, this.f6414b, 2621439);
        }
    }

    public /* synthetic */ n(Object obj2, String str, List list, int i) {
        this.f6413a = i;
        this.f6415c = str;
        this.f6414b = list;
    }

    public /* synthetic */ n(String str, List list, int i) {
        this.f6413a = i;
        this.f6415c = str;
        this.f6414b = list;
    }

    public /* synthetic */ n(List list, String str, int i) {
        this.f6413a = i;
        this.f6414b = list;
        this.f6415c = str;
    }
}
