package d27;

import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.model.faq.FaqNode;
import com.revolut.core.model.faq.FaqNodeBase;
import com.revolut.core.model.faq.PigeonNode;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth.impl.data.network.eodrates.EodRatesService;
import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorter;
import hcl.r0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f110745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f110746c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g0(dcl.v vVar, String str, String str2, eel.i iVar) {
        this.f110744a = 13;
        this.f110745b = str;
        this.f110746c = str2;
        this.d = iVar;
    }

    private final Object a(Object obj2) {
        int i;
        int i2;
        Integer numValueOf;
        int i3;
        Integer numValueOf2;
        int i5;
        Integer numValueOf3;
        int i6;
        int i21;
        Integer numValueOf4;
        int i22;
        int i32;
        dcl.c0 c0Var = (dcl.c0) this.f110745b;
        String str = (String) this.f110746c;
        Set<String> set = (Set) this.d;
        qcl.d dVar = c0Var.f113008c;
        SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare(str);
        try {
            int i33 = 1;
            for (String str2 : set) {
                if (str2 == null) {
                    sQLiteStatementPrepare.bindNull(i33);
                } else {
                    sQLiteStatementPrepare.bindText(i33, str2);
                }
                i33++;
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ref");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "symbol");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "price");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pricePrecise");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "lastClean");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "halted");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "status");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "delayed");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "previous");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "previousPrecise");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "next_open_utc_timestamp");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updatedAt");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "previousClose");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "previousClosePrecise");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "baseline");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "lastClose");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "lastClosePrecise");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "lastBid");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "lastAsk");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tradingSession");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "lastYtm");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "lastCloseYtm");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "previousYtm");
            int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "previousCloseYtm");
            int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "tickerType");
            int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "lastFmv");
            int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fmvUpdatedAt");
            int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "lastMid");
            int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "lastBidSize");
            int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "lastAskSize");
            int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "dayVolume");
            int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "openInterest");
            int columnIndexOrThrow34 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "impliedVolatility");
            int columnIndexOrThrow35 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "delta");
            int columnIndexOrThrow36 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "gamma");
            int columnIndexOrThrow37 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "theta");
            int columnIndexOrThrow38 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "vega");
            int columnIndexOrThrow39 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "probabilityOfProfit");
            int columnIndexOrThrow40 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "breakEven");
            int columnIndexOrThrow41 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "effectiveLeverage");
            int columnIndexOrThrow42 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "contractSize");
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                Integer numValueOf5 = null;
                String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                jo3.b bVarD = qcl.d.d(sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                ko3.b bVarC = qcl.d.c(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                ko3.b bVarC2 = qcl.d.c(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                int i43 = columnIndexOrThrow2;
                int i59 = columnIndexOrThrow3;
                boolean z = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow7)) != 0;
                String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                int i66 = columnIndexOrThrow4;
                boolean z3 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9)) != 0;
                jo3.b bVarD2 = qcl.d.d(sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10));
                ko3.b bVarC3 = qcl.d.c(sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11));
                Long lValueOf = sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow12));
                long j2 = sQLiteStatementPrepare.getLong(columnIndexOrThrow13);
                jo3.b bVarD3 = qcl.d.d(sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14));
                int i74 = columnIndexOrThrow15;
                ko3.b bVarC4 = qcl.d.c(sQLiteStatementPrepare.isNull(i74) ? null : sQLiteStatementPrepare.getText(i74));
                int i92 = columnIndexOrThrow16;
                jo3.b bVarD4 = qcl.d.d(sQLiteStatementPrepare.isNull(i92) ? null : sQLiteStatementPrepare.getText(i92));
                int i96 = columnIndexOrThrow;
                int i99 = columnIndexOrThrow17;
                jo3.b bVarD5 = qcl.d.d(sQLiteStatementPrepare.isNull(i99) ? null : sQLiteStatementPrepare.getText(i99));
                columnIndexOrThrow17 = i99;
                int i100 = columnIndexOrThrow18;
                ko3.b bVarC5 = qcl.d.c(sQLiteStatementPrepare.isNull(i100) ? null : sQLiteStatementPrepare.getText(i100));
                columnIndexOrThrow18 = i100;
                int i101 = columnIndexOrThrow19;
                ko3.b bVarC6 = qcl.d.c(sQLiteStatementPrepare.isNull(i101) ? null : sQLiteStatementPrepare.getText(i101));
                columnIndexOrThrow19 = i101;
                int i102 = columnIndexOrThrow20;
                ko3.b bVarC7 = qcl.d.c(sQLiteStatementPrepare.isNull(i102) ? null : sQLiteStatementPrepare.getText(i102));
                columnIndexOrThrow20 = i102;
                int i103 = columnIndexOrThrow21;
                String text5 = sQLiteStatementPrepare.isNull(i103) ? null : sQLiteStatementPrepare.getText(i103);
                columnIndexOrThrow21 = i103;
                int i104 = columnIndexOrThrow22;
                String text6 = sQLiteStatementPrepare.isNull(i104) ? null : sQLiteStatementPrepare.getText(i104);
                columnIndexOrThrow22 = i104;
                int i105 = columnIndexOrThrow23;
                String text7 = sQLiteStatementPrepare.isNull(i105) ? null : sQLiteStatementPrepare.getText(i105);
                columnIndexOrThrow23 = i105;
                int i106 = columnIndexOrThrow24;
                String text8 = sQLiteStatementPrepare.isNull(i106) ? null : sQLiteStatementPrepare.getText(i106);
                columnIndexOrThrow24 = i106;
                int i107 = columnIndexOrThrow25;
                String text9 = sQLiteStatementPrepare.isNull(i107) ? null : sQLiteStatementPrepare.getText(i107);
                columnIndexOrThrow25 = i107;
                int i108 = columnIndexOrThrow26;
                String text10 = sQLiteStatementPrepare.isNull(i108) ? null : sQLiteStatementPrepare.getText(i108);
                columnIndexOrThrow26 = i108;
                int i109 = columnIndexOrThrow27;
                ko3.b bVarC8 = qcl.d.c(sQLiteStatementPrepare.isNull(i109) ? null : sQLiteStatementPrepare.getText(i109));
                columnIndexOrThrow27 = i109;
                int i110 = columnIndexOrThrow28;
                Long lValueOf2 = sQLiteStatementPrepare.isNull(i110) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(i110));
                columnIndexOrThrow28 = i110;
                int i111 = columnIndexOrThrow29;
                ko3.b bVarC9 = qcl.d.c(sQLiteStatementPrepare.isNull(i111) ? null : sQLiteStatementPrepare.getText(i111));
                columnIndexOrThrow29 = i111;
                int i112 = columnIndexOrThrow30;
                if (sQLiteStatementPrepare.isNull(i112)) {
                    i = columnIndexOrThrow14;
                    i2 = i66;
                    numValueOf = null;
                } else {
                    i = columnIndexOrThrow14;
                    i2 = i66;
                    numValueOf = Integer.valueOf((int) sQLiteStatementPrepare.getLong(i112));
                }
                int i113 = columnIndexOrThrow31;
                if (sQLiteStatementPrepare.isNull(i113)) {
                    i3 = i74;
                    numValueOf2 = null;
                } else {
                    i3 = i74;
                    numValueOf2 = Integer.valueOf((int) sQLiteStatementPrepare.getLong(i113));
                }
                int i114 = columnIndexOrThrow32;
                if (sQLiteStatementPrepare.isNull(i114)) {
                    i5 = i92;
                    numValueOf3 = null;
                } else {
                    i5 = i92;
                    numValueOf3 = Integer.valueOf((int) sQLiteStatementPrepare.getLong(i114));
                }
                int i115 = columnIndexOrThrow33;
                if (sQLiteStatementPrepare.isNull(i115)) {
                    i6 = i113;
                    i21 = i114;
                    numValueOf4 = null;
                } else {
                    i6 = i113;
                    i21 = i114;
                    numValueOf4 = Integer.valueOf((int) sQLiteStatementPrepare.getLong(i115));
                }
                int i116 = columnIndexOrThrow34;
                String text11 = sQLiteStatementPrepare.isNull(i116) ? null : sQLiteStatementPrepare.getText(i116);
                int i117 = columnIndexOrThrow35;
                String text12 = sQLiteStatementPrepare.isNull(i117) ? null : sQLiteStatementPrepare.getText(i117);
                int i118 = columnIndexOrThrow36;
                String text13 = sQLiteStatementPrepare.isNull(i118) ? null : sQLiteStatementPrepare.getText(i118);
                columnIndexOrThrow36 = i118;
                int i119 = columnIndexOrThrow37;
                String text14 = sQLiteStatementPrepare.isNull(i119) ? null : sQLiteStatementPrepare.getText(i119);
                columnIndexOrThrow37 = i119;
                int i120 = columnIndexOrThrow38;
                String text15 = sQLiteStatementPrepare.isNull(i120) ? null : sQLiteStatementPrepare.getText(i120);
                columnIndexOrThrow38 = i120;
                int i121 = columnIndexOrThrow39;
                String text16 = sQLiteStatementPrepare.isNull(i121) ? null : sQLiteStatementPrepare.getText(i121);
                columnIndexOrThrow39 = i121;
                int i122 = columnIndexOrThrow40;
                ko3.b bVarC10 = qcl.d.c(sQLiteStatementPrepare.isNull(i122) ? null : sQLiteStatementPrepare.getText(i122));
                columnIndexOrThrow40 = i122;
                int i123 = columnIndexOrThrow41;
                String text17 = sQLiteStatementPrepare.isNull(i123) ? null : sQLiteStatementPrepare.getText(i123);
                columnIndexOrThrow41 = i123;
                int i124 = columnIndexOrThrow42;
                if (sQLiteStatementPrepare.isNull(i124)) {
                    i22 = i116;
                    i32 = i117;
                } else {
                    i22 = i116;
                    i32 = i117;
                    numValueOf5 = Integer.valueOf((int) sQLiteStatementPrepare.getLong(i124));
                }
                arrayList.add(new r0(text, text2, text3, bVarD, bVarC, bVarC2, z, text4, z3, bVarD2, bVarC3, lValueOf, j2, bVarD3, bVarC4, bVarD4, bVarD5, bVarC5, bVarC6, bVarC7, text5, text6, text7, text8, text9, text10, bVarC8, lValueOf2, bVarC9, numValueOf, numValueOf2, numValueOf3, numValueOf4, text11, text12, text13, text14, text15, text16, bVarC10, text17, numValueOf5));
                int i125 = i32;
                columnIndexOrThrow42 = i124;
                columnIndexOrThrow = i96;
                columnIndexOrThrow15 = i3;
                columnIndexOrThrow31 = i6;
                columnIndexOrThrow4 = i2;
                columnIndexOrThrow30 = i112;
                columnIndexOrThrow34 = i22;
                columnIndexOrThrow35 = i125;
                columnIndexOrThrow14 = i;
                columnIndexOrThrow16 = i5;
                columnIndexOrThrow32 = i21;
                columnIndexOrThrow2 = i43;
                columnIndexOrThrow33 = i115;
                columnIndexOrThrow3 = i59;
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th10) {
            sQLiteStatementPrepare.close();
            throw th10;
        }
    }

    private final Object b(Object obj2) {
        String strPrint;
        b9h.a aVar = (b9h.a) this.f110745b;
        Map map = (Map) this.f110746c;
        com.google.firebase.messaging.t tVar = (com.google.firebase.messaging.t) this.d;
        Map storageHits = (Map) obj2;
        Intrinsics.checkNotNullParameter(storageHits, "storageHits");
        List listB0 = zhm.d0.B0(zhm.d0.B0(aVar.f13780a, storageHits.keySet()), map.keySet());
        ArrayList arrayListE0 = zhm.d0.E0(map.values(), storageHits.values());
        if (listB0.isEmpty()) {
            return efm.d0.m(arrayListE0);
        }
        EodRatesService eodRatesService = (EodRatesService) tVar.f49543b;
        List list = listB0;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(cp5.d.d((Pair) it8.next()));
        }
        DateTime dateTime = aVar.f13781b;
        if (dateTime != null) {
            DateTimeFormatter dateTimeFormatterDate = ISODateTimeFormat.date();
            Intrinsics.checkNotNullExpressionValue(dateTimeFormatterDate, "date(...)");
            strPrint = dateTimeFormatterDate.print(dateTime);
        } else {
            strPrint = null;
        }
        efm.d0<List<r7h.a>> eodRates = eodRatesService.getEodRates(arrayList, strPrint);
        e8h.c cVar = new e8h.c(5, new e8e.y(7));
        eodRates.getClass();
        return new ufm.i(new ufm.i(eodRates, cVar, 1), new e8h.c(6, new a83.c0(17, arrayListE0)), 1);
    }

    private final Object c(Object obj2) {
        Data data;
        Object obj3;
        Data data2 = (Data) this.f110745b;
        Data transactions = (Data) this.f110746c;
        e9d.z zVar = (e9d.z) this.d;
        e9d.k kVar = (e9d.k) obj2;
        FaqNodeBase faqNodeBase = (FaqNodeBase) data2.getContent();
        zVar.getClass();
        try {
            Object content = data2.getContent();
            if (content != null) {
                FaqNodeBase faqNodeBase2 = (FaqNodeBase) content;
                obj3 = faqNodeBase2 instanceof FaqNode.Category ? ((FaqNode.Category) faqNodeBase2).d : faqNodeBase2 instanceof FaqNode.Topic ? ((FaqNode.Topic) faqNodeBase2).e : faqNodeBase2 instanceof PigeonNode ? ((PigeonNode) faqNodeBase2).f51438h : zhm.f0.f322471a;
            } else {
                obj3 = null;
            }
            data = new Data(obj3, data2.getError(), data2.getLoading());
        } catch (Throwable th10) {
            data = new Data(null, th10, data2.getLoading());
        }
        Data faqActions = data;
        boolean z = zVar.f123972p.d;
        j7d.a type = kVar.d;
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(faqActions, "faqActions");
        Intrinsics.checkNotNullParameter(type, "type");
        return new e9d.k(faqNodeBase, transactions, faqActions, type, z);
    }

    private final Object d(Object obj2) {
        Data data;
        ec8.f fVarI2;
        Data data2 = (Data) this.f110745b;
        Data data3 = (Data) this.f110746c;
        com.revolut.feature.junior_allowance.impl.ui.screen.list.a aVar = (com.revolut.feature.junior_allowance.impl.ui.screen.list.a) this.d;
        ec8.g gVar = (ec8.g) obj2;
        Data dataT = t1.t(data3, data2);
        try {
            Object content = dataT.getContent();
            if (content != null) {
                Pair pair = (Pair) content;
                fVarI2 = com.revolut.feature.junior_allowance.impl.ui.screen.list.a.I2(aVar, (List) pair.f186385a, ((do3.n) pair.f186386b).f116408a);
            } else {
                fVarI2 = null;
            }
            data = new Data(fVarI2, dataT.getError(), dataT.getLoading());
        } catch (Throwable th10) {
            data = new Data(null, th10, dataT.getLoading());
        }
        return ec8.g.a(gVar, data2, null, null, data, 6);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02cf  */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41, types: [com.revolut.data.model.Data, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v43 */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r36) {
        /*
            Method dump skipped, instruction units count: 2740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d27.g0.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ g0(dqd.j jVar, xi0.b bVar, IncomeSorter incomeSorter) {
        this.f110744a = 21;
        this.f110745b = jVar;
        this.d = bVar;
        this.f110746c = incomeSorter;
    }

    public /* synthetic */ g0(Object obj2, int i, Object obj3, Object obj4) {
        this.f110744a = i;
        this.f110745b = obj2;
        this.f110746c = obj3;
        this.d = obj4;
    }
}
