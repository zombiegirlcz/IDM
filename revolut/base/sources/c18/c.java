package c18;

import androidx.collection.ArrayMap;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import androidx.viewpager2.widget.ViewPager2;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.wf;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.globalsearch.api.R$string;
import com.revolut.feature.insurance_car.impl.data.model.CarVariation;
import com.revolut.feature.rev_points.models.RevPoints;
import dcl.h0;
import e18.l;
import hcl.k0;
import hcl.x2;
import hcl.y2;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kl7.m2;
import kl7.s0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import krl.g;
import krl.k;
import krl.o;
import krl.p;
import o97.d0;
import o97.e0;
import o97.f0;
import o97.g0;
import o97.m0;
import o97.v;
import o97.y;
import or0.u;
import org.joda.time.DateTime;
import pig.j;
import v30.c0;
import vea.i;
import xl7.h;
import zhm.q0;
import zhm.w;
import zsc.m;
import zsc.q;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f20417c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c(RevPoints revPoints, String str, int i, com.revolut.feature.travel.miles.impl.ui.screen.transfer.a aVar) {
        this.f20415a = 5;
        this.d = revPoints;
        this.f20416b = str;
        this.f20417c = i;
        this.e = aVar;
    }

    private final Object a(Object obj2) {
        String str = (String) this.f20416b;
        int i = this.f20417c;
        c0 c0Var = (c0) this.d;
        ArrayList arrayList = (ArrayList) this.e;
        SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare(str);
        try {
            sQLiteStatementPrepare.bindLong(1, i);
            String strA = s10.a.a(c0Var);
            if (strA == null) {
                sQLiteStatementPrepare.bindNull(2);
            } else {
                sQLiteStatementPrepare.bindText(2, strA);
            }
            Iterator it8 = arrayList.iterator();
            int i2 = 3;
            while (it8.hasNext()) {
                if (((Integer) it8.next()) == null) {
                    sQLiteStatementPrepare.bindNull(i2);
                } else {
                    sQLiteStatementPrepare.bindLong(i2, r2.intValue());
                }
                i2++;
            }
            sQLiteStatementPrepare.step();
            Unit unit = Unit.f186387a;
            sQLiteStatementPrepare.close();
            return unit;
        } catch (Throwable th10) {
            sQLiteStatementPrepare.close();
            throw th10;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00df, code lost:
    
        if (r1.equals("WatchlistItems") != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f3, code lost:
    
        if (r1.equals("WatchlistMedium") != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f5, code lost:
    
        r15 = op0.q.MEDIUM;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference failed for: r7v1, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c18.c.b(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    private final Object c(Object obj2) {
        to7.c0 c0Var = (to7.c0) this.d;
        s0 s0Var = (s0) this.f20416b;
        m2 m2Var = (m2) this.e;
        int i = this.f20417c;
        List carVariations = (List) obj2;
        Intrinsics.checkNotNullParameter(carVariations, "carVariations");
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : carVariations) {
            CarVariation carVariation = (CarVariation) obj3;
            if (carVariation.f75195g == s0Var && carVariation.f75196h == m2Var) {
                int i2 = carVariation.i;
                Integer num = carVariation.f75197j;
                if (i <= (num != null ? num.intValue() : to7.c.f(c0Var.f272518b)) && i2 <= i) {
                    arrayList.add(obj3);
                }
            }
        }
        int iB = q0.b(w.t(arrayList, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (Object obj4 : arrayList) {
            linkedHashMap.put(c0Var.f272519c.b(h.d((CarVariation) obj4)).toString(), obj4);
        }
        c0Var.d = linkedHashMap;
        Set setKeySet = c0Var.d.keySet();
        ArrayList arrayList2 = new ArrayList(w.t(setKeySet, 10));
        Iterator it8 = setKeySet.iterator();
        while (it8.hasNext()) {
            arrayList2.add(to7.c.g((String) it8.next()));
        }
        return arrayList2;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v39 */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r25v12 */
    /* JADX WARN: Type inference failed for: r25v8 */
    /* JADX WARN: Type inference failed for: r25v9, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r31v3 */
    /* JADX WARN: Type inference failed for: r31v4, types: [com.revolut.core.ui_kit.delegates.RowDelegate$Model$c] */
    /* JADX WARN: Type inference failed for: r31v5 */
    /* JADX WARN: Type inference failed for: r49v0 */
    /* JADX WARN: Type inference failed for: r49v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r50v1 */
    /* JADX WARN: Type inference failed for: r50v2 */
    /* JADX WARN: Type inference failed for: r50v3 */
    /* JADX WARN: Type inference failed for: r5v49, types: [com.revolut.core.ui_kit.models.Style, java.lang.Throwable, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v50, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v51, types: [com.revolut.core.ui_kit.models.Style, java.lang.Object, java.lang.String, java.lang.Throwable, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v56 */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v9, types: [com.revolut.core.ui_kit.models.CurrencyClause$Format, com.revolut.core.ui_kit.models.Style, com.revolut.core.ui_kit.models.TextLocalisedClause, com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        l lVar;
        int i;
        int i2;
        Integer numValueOf;
        d0 f0Var;
        ?? r56;
        String str;
        ?? r502;
        CurrencyClause currencyClause;
        ?? B;
        ?? bVar;
        BigDecimal bigDecimal;
        List subEntities;
        int i3;
        q qVarA;
        int i5 = this.f20415a;
        ?? r87 = 0;
        int i6 = this.f20417c;
        int i21 = 1;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.f20416b;
        switch (i5) {
            case 0:
                String str2 = null;
                f fVar = (f) obj4;
                String str3 = (String) obj5;
                Instant instant = (Instant) obj3;
                f18.b bVar2 = fVar.f20426c;
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("\n            SELECT * FROM smart_notification_feed\n                WHERE ref = ?\n                    AND (? IS NULL OR date < ?)\n                ORDER BY date DESC\n            LIMIT ?\n        ");
                try {
                    if (str3 == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, str3);
                    }
                    Long lD = b21.a.d(instant);
                    if (lD == null) {
                        sQLiteStatementPrepare.bindNull(2);
                    } else {
                        sQLiteStatementPrepare.bindLong(2, lD.longValue());
                    }
                    Long lD2 = b21.a.d(instant);
                    if (lD2 == null) {
                        sQLiteStatementPrepare.bindNull(3);
                    } else {
                        sQLiteStatementPrepare.bindLong(3, lD2.longValue());
                    }
                    sQLiteStatementPrepare.bindLong(4, i6);
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "date");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "title");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "subtitle");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ref");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "assetType");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "priceImpact");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? str2 : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        Instant instantJ = b21.a.j(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? str2 : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow2)));
                        String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? str2 : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                        bVar2.getClass();
                        e18.f fVarB = f18.b.b(text2);
                        String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? str2 : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                        String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? str2 : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                        String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? str2 : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                        List listA = bVar2.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? str2 : sQLiteStatementPrepare.getText(columnIndexOrThrow7));
                        String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? str2 : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                        f18.c cVar = fVar.d;
                        if (text6 != null) {
                            lVar = (l) cVar.f131180a.b(l.Companion.serializer(), text6);
                        } else {
                            cVar.getClass();
                            lVar = null;
                        }
                        arrayList.add(new e18.e(text, instantJ, fVarB, text3, text4, text5, listA, lVar));
                        str2 = null;
                        break;
                    }
                    sQLiteStatementPrepare.close();
                    return arrayList;
                } catch (Throwable th10) {
                    sQLiteStatementPrepare.close();
                    throw th10;
                }
            case 1:
                h0 h0Var = (h0) obj4;
                List<String> list = (List) obj3;
                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
                SQLiteStatement sQLiteStatementPrepare2 = sQLiteConnection.prepare((String) obj5);
                try {
                    int i22 = 1;
                    for (String str4 : list) {
                        if (str4 == null) {
                            sQLiteStatementPrepare2.bindNull(i22);
                        } else {
                            sQLiteStatementPrepare2.bindText(i22, str4);
                        }
                        i22++;
                    }
                    sQLiteStatementPrepare2.bindLong(i6 + 1, 8);
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "ref");
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "last_seen");
                    ArrayMap arrayMap = new ArrayMap();
                    while (sQLiteStatementPrepare2.step()) {
                        String text7 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow9);
                        if (text7 != null) {
                            arrayMap.put(text7, null);
                        }
                    }
                    sQLiteStatementPrepare2.reset();
                    h0Var.i(sQLiteConnection, arrayMap);
                    ArrayList arrayList2 = new ArrayList();
                    while (sQLiteStatementPrepare2.step()) {
                        x2 x2Var = new x2(sQLiteStatementPrepare2.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow9), sQLiteStatementPrepare2.getLong(columnIndexOrThrow10));
                        String text8 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow9);
                        arrayList2.add(new y2(x2Var, text8 != null ? (k0) arrayMap.get(text8) : null));
                        break;
                    }
                    sQLiteStatementPrepare2.close();
                    return arrayList2;
                } catch (Throwable th11) {
                    sQLiteStatementPrepare2.close();
                    throw th11;
                }
            case 2:
                List<String> list2 = (List) obj4;
                List<String> list3 = (List) obj3;
                SQLiteStatement sQLiteStatementPrepare3 = ((SQLiteConnection) obj2).prepare((String) obj5);
                try {
                    int i32 = 1;
                    for (String str5 : list2) {
                        if (str5 == null) {
                            sQLiteStatementPrepare3.bindNull(i32);
                        } else {
                            sQLiteStatementPrepare3.bindText(i32, str5);
                        }
                        i32++;
                    }
                    int i33 = i6 + 1;
                    for (String str6 : list3) {
                        if (str6 == null) {
                            sQLiteStatementPrepare3.bindNull(i33);
                        } else {
                            sQLiteStatementPrepare3.bindText(i33, str6);
                        }
                        i33++;
                    }
                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "from");
                    int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "to");
                    int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "rate");
                    int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "last_available_rate");
                    int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "time_stamp");
                    int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "isWeekend");
                    int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "weekendStartTime");
                    int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "weekendEndTime");
                    ArrayList arrayList3 = new ArrayList();
                    while (sQLiteStatementPrepare3.step()) {
                        String text9 = sQLiteStatementPrepare3.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare3.getText(columnIndexOrThrow11);
                        String text10 = sQLiteStatementPrepare3.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare3.getText(columnIndexOrThrow12);
                        double d = sQLiteStatementPrepare3.getDouble(columnIndexOrThrow13);
                        Double dValueOf = sQLiteStatementPrepare3.isNull(columnIndexOrThrow14) ? null : Double.valueOf(sQLiteStatementPrepare3.getDouble(columnIndexOrThrow14));
                        long j2 = sQLiteStatementPrepare3.getLong(columnIndexOrThrow15);
                        Integer numValueOf2 = sQLiteStatementPrepare3.isNull(columnIndexOrThrow16) ? null : Integer.valueOf((int) sQLiteStatementPrepare3.getLong(columnIndexOrThrow16));
                        Boolean boolValueOf = numValueOf2 == null ? null : Boolean.valueOf(numValueOf2.intValue() != 0);
                        Long lValueOf = sQLiteStatementPrepare3.isNull(columnIndexOrThrow17) ? null : Long.valueOf(sQLiteStatementPrepare3.getLong(columnIndexOrThrow17));
                        DateTime dateTime = lValueOf != null ? new DateTime(lValueOf.longValue()) : null;
                        Long lValueOf2 = sQLiteStatementPrepare3.isNull(columnIndexOrThrow18) ? null : Long.valueOf(sQLiteStatementPrepare3.getLong(columnIndexOrThrow18));
                        arrayList3.add(new f9l.e(text9, text10, d, dValueOf, j2, boolValueOf, dateTime, lValueOf2 != null ? new DateTime(lValueOf2.longValue()) : null));
                        break;
                    }
                    sQLiteStatementPrepare3.close();
                    return arrayList3;
                } catch (Throwable th12) {
                    sQLiteStatementPrepare3.close();
                    throw th12;
                }
            case 3:
                ArrayList<String> arrayList4 = (ArrayList) obj3;
                rrl.a aVar = ((o) obj4).f189011c;
                SQLiteStatement sQLiteStatementPrepare4 = ((SQLiteConnection) obj2).prepare((String) obj5);
                try {
                    int i43 = 1;
                    for (String str7 : arrayList4) {
                        if (str7 == null) {
                            sQLiteStatementPrepare4.bindNull(i43);
                        } else {
                            sQLiteStatementPrepare4.bindText(i43, str7);
                        }
                        i43++;
                    }
                    int i59 = i6 + 1;
                    for (String str8 : arrayList4) {
                        if (str8 == null) {
                            sQLiteStatementPrepare4.bindNull(i59);
                        } else {
                            sQLiteStatementPrepare4.bindText(i59, str8);
                        }
                        i59++;
                    }
                    int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "id");
                    int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "account_type");
                    int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "compound_id");
                    int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "created_at");
                    int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "updated_at");
                    int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "completed_at");
                    int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "side");
                    int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "state");
                    int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "order_type");
                    int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "currency_pair_first");
                    int columnIndexOrThrow29 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "currency_pair_second");
                    int columnIndexOrThrow30 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "symbol");
                    int columnIndexOrThrow31 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "instrument_type");
                    int columnIndexOrThrow32 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "stock_order");
                    int columnIndexOrThrow33 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "tax_advantaged_order");
                    int columnIndexOrThrow34 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "commodity_order");
                    int columnIndexOrThrow35 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "margin_order");
                    int columnIndexOrThrow36 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "fund_order");
                    int columnIndexOrThrow37 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "mutual_fund_order");
                    int columnIndexOrThrow38 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "option_order");
                    int columnIndexOrThrow39 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "initiated_by");
                    int columnIndexOrThrow40 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "account_holder_type");
                    int columnIndexOrThrow41 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "blocking");
                    int columnIndexOrThrow42 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "portfolio_id");
                    ArrayList arrayList5 = new ArrayList();
                    while (sQLiteStatementPrepare4.step()) {
                        String text11 = sQLiteStatementPrepare4.isNull(columnIndexOrThrow19) ? null : sQLiteStatementPrepare4.getText(columnIndexOrThrow19);
                        String text12 = sQLiteStatementPrepare4.isNull(columnIndexOrThrow20) ? null : sQLiteStatementPrepare4.getText(columnIndexOrThrow20);
                        String text13 = sQLiteStatementPrepare4.isNull(columnIndexOrThrow21) ? null : sQLiteStatementPrepare4.getText(columnIndexOrThrow21);
                        long j3 = sQLiteStatementPrepare4.getLong(columnIndexOrThrow22);
                        long j5 = sQLiteStatementPrepare4.getLong(columnIndexOrThrow23);
                        Long lValueOf3 = sQLiteStatementPrepare4.isNull(columnIndexOrThrow24) ? null : Long.valueOf(sQLiteStatementPrepare4.getLong(columnIndexOrThrow24));
                        String text14 = sQLiteStatementPrepare4.isNull(columnIndexOrThrow25) ? null : sQLiteStatementPrepare4.getText(columnIndexOrThrow25);
                        String text15 = sQLiteStatementPrepare4.isNull(columnIndexOrThrow26) ? null : sQLiteStatementPrepare4.getText(columnIndexOrThrow26);
                        String text16 = sQLiteStatementPrepare4.isNull(columnIndexOrThrow27) ? null : sQLiteStatementPrepare4.getText(columnIndexOrThrow27);
                        String text17 = sQLiteStatementPrepare4.isNull(columnIndexOrThrow28) ? null : sQLiteStatementPrepare4.getText(columnIndexOrThrow28);
                        String text18 = sQLiteStatementPrepare4.isNull(columnIndexOrThrow29) ? null : sQLiteStatementPrepare4.getText(columnIndexOrThrow29);
                        String text19 = sQLiteStatementPrepare4.isNull(columnIndexOrThrow30) ? null : sQLiteStatementPrepare4.getText(columnIndexOrThrow30);
                        String text20 = sQLiteStatementPrepare4.isNull(columnIndexOrThrow31) ? null : sQLiteStatementPrepare4.getText(columnIndexOrThrow31);
                        p pVarG = rrl.a.g(sQLiteStatementPrepare4.isNull(columnIndexOrThrow32) ? null : sQLiteStatementPrepare4.getText(columnIndexOrThrow32));
                        int i66 = columnIndexOrThrow19;
                        int i74 = columnIndexOrThrow33;
                        krl.q qVarH = rrl.a.h(sQLiteStatementPrepare4.isNull(i74) ? null : sQLiteStatementPrepare4.getText(i74));
                        columnIndexOrThrow33 = i74;
                        int i92 = columnIndexOrThrow34;
                        krl.b bVarB = rrl.a.b(sQLiteStatementPrepare4.isNull(i92) ? null : sQLiteStatementPrepare4.getText(i92));
                        columnIndexOrThrow34 = i92;
                        int i96 = columnIndexOrThrow35;
                        krl.e eVarD = rrl.a.d(sQLiteStatementPrepare4.isNull(i96) ? null : sQLiteStatementPrepare4.getText(i96));
                        columnIndexOrThrow35 = i96;
                        int i99 = columnIndexOrThrow36;
                        krl.d dVarC = rrl.a.c(sQLiteStatementPrepare4.isNull(i99) ? null : sQLiteStatementPrepare4.getText(i99));
                        columnIndexOrThrow36 = i99;
                        int i100 = columnIndexOrThrow37;
                        g gVarE = rrl.a.e(sQLiteStatementPrepare4.isNull(i100) ? null : sQLiteStatementPrepare4.getText(i100));
                        columnIndexOrThrow37 = i100;
                        int i101 = columnIndexOrThrow38;
                        krl.h hVarF = rrl.a.f(sQLiteStatementPrepare4.isNull(i101) ? null : sQLiteStatementPrepare4.getText(i101));
                        columnIndexOrThrow38 = i101;
                        int i102 = columnIndexOrThrow39;
                        krl.a aVarA = rrl.a.a(sQLiteStatementPrepare4.isNull(i102) ? null : sQLiteStatementPrepare4.getText(i102));
                        columnIndexOrThrow39 = i102;
                        int i103 = columnIndexOrThrow40;
                        String text21 = sQLiteStatementPrepare4.isNull(i103) ? null : sQLiteStatementPrepare4.getText(i103);
                        columnIndexOrThrow40 = i103;
                        int i104 = columnIndexOrThrow41;
                        if (sQLiteStatementPrepare4.isNull(i104)) {
                            i = columnIndexOrThrow20;
                            i2 = columnIndexOrThrow32;
                            numValueOf = null;
                        } else {
                            i = columnIndexOrThrow20;
                            i2 = columnIndexOrThrow32;
                            numValueOf = Integer.valueOf((int) sQLiteStatementPrepare4.getLong(i104));
                        }
                        Boolean boolValueOf2 = numValueOf == null ? null : Boolean.valueOf(numValueOf.intValue() != 0);
                        int i105 = columnIndexOrThrow42;
                        arrayList5.add(new k(text11, text12, text13, j3, j5, lValueOf3, text14, text15, text16, text17, text18, text19, text20, pVarG, qVarH, bVarB, eVarD, dVarC, gVarE, hVarF, aVarA, text21, boolValueOf2, sQLiteStatementPrepare4.isNull(i105) ? null : sQLiteStatementPrepare4.getText(i105)));
                        columnIndexOrThrow42 = i105;
                        columnIndexOrThrow20 = i;
                        columnIndexOrThrow32 = i2;
                        columnIndexOrThrow41 = i104;
                        columnIndexOrThrow19 = i66;
                        break;
                    }
                    sQLiteStatementPrepare4.close();
                    return arrayList5;
                } catch (Throwable th13) {
                    sQLiteStatementPrepare4.close();
                    throw th13;
                }
            case 4:
                ViewPager2 viewPager2 = (ViewPager2) obj5;
                Float f = (Float) obj2;
                float fFloatValue = f.floatValue();
                float fFloatValue2 = ((Number) ((Function1) obj4).invoke(f)).floatValue();
                ls0.c cVar2 = ls0.d.Companion;
                float fFloatValue3 = ((Number) ((Function1) obj3).invoke(f)).floatValue();
                cVar2.getClass();
                Object obj6 = u.f228038a;
                Intrinsics.checkNotNullParameter(viewPager2, "<this>");
                return Float.valueOf((Math.signum(kotlin.ranges.f.f(fFloatValue, -1.0f, 1.0f)) * (((1.0f - fFloatValue3) * i6) / 2.0f) * (viewPager2.getLayoutDirection() == 1 ? 1 : -1)) + fFloatValue2);
            case 5:
                j update = (j) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                DecimalFormat decimalFormat = ((com.revolut.feature.travel.miles.impl.ui.screen.transfer.a) obj3).f94390s.f236476a;
                int i106 = this.f20417c;
                String str9 = decimalFormat.format(Integer.valueOf(i106));
                Intrinsics.checkNotNullExpressionValue(str9, "format(...)");
                return j.a(update, null, null, null, null, (RevPoints) obj4, (String) obj5, i106, str9, null, pig.q.POINTS, false, 2591);
            case 6:
                return a(obj2);
            case 7:
                return b(obj2);
            case 8:
                return c(obj2);
            default:
                vea.l lVar2 = (vea.l) obj4;
                AccountId accountId = (AccountId) obj3;
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                vea.g gVar = (vea.g) pair.f186385a;
                Boolean bool = (Boolean) pair.f186386b;
                Map map = gVar.f288191a;
                ?? r142 = gVar.f288192b;
                Object obj7 = gVar.f288193c;
                m.Companion.getClass();
                m query = zsc.l.a((String) obj5);
                ArrayList arrayList6 = new ArrayList();
                for (Map.Entry entry : map.entrySet()) {
                    xi0.b bVar3 = (xi0.b) entry.getKey();
                    vea.h hVar = (vea.h) entry.getValue();
                    if (cp5.d.A(bVar3)) {
                        v[] elements = {lVar2.u, lVar2.f288217t};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        subEntities = kotlin.collections.d.L(elements);
                    } else {
                        subEntities = zhm.v.l(lVar2.f288216s);
                    }
                    int i107 = i.f288197a[hVar.ordinal()];
                    if (i107 == i21) {
                        i3 = i21;
                        zsc.g gVar2 = lVar2.f288214q;
                        if (gVar2 == null) {
                            Intrinsics.r("searchProcessor");
                            throw null;
                        }
                        qVarA = gVar2.a(query, bVar3, subEntities);
                    } else {
                        if (i107 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        zsc.g gVar3 = lVar2.f288214q;
                        if (gVar3 == null) {
                            Intrinsics.r("searchProcessor");
                            throw null;
                        }
                        i3 = i21;
                        Intrinsics.checkNotNullParameter(query, "query");
                        Intrinsics.checkNotNullParameter(subEntities, "subEntities");
                        qVarA = new q(bVar3, subEntities, gVar3.b(subEntities, query));
                    }
                    if (qVarA != null) {
                        arrayList6.add(qVarA);
                    }
                    i21 = i3;
                }
                int i108 = i21;
                List listV0 = zhm.d0.V0(arrayList6, bool.booleanValue() ? Integer.MAX_VALUE : 3);
                ArrayList arrayList7 = new ArrayList(w.t(listV0, 10));
                Iterator it8 = listV0.iterator();
                ?? r2 = obj7;
                while (it8.hasNext()) {
                    q qVar = (q) it8.next();
                    xi0.b bVar4 = (xi0.b) qVar.f324880a;
                    Boolean bool2 = bool;
                    String str10 = bVar4.f306286a;
                    CurrencyImage currencyImage = new CurrencyImage(str10, (ImageTransformations) r87, (TextLocalisedClause) r87, 14);
                    Iterator it9 = it8;
                    CurrencyClause currencyClause2 = new CurrencyClause(bVar4, r87, r87, 6);
                    CurrencyClause currencyClause3 = new CurrencyClause(bVar4, CurrencyClause.Format.Ticker.f57756a, r87, 4);
                    if (accountId instanceof AccountId.Personal) {
                        str = "currency";
                    } else {
                        if (!(accountId instanceof AccountId.Joint)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = "joint_currency";
                    }
                    n9l.a aVar2 = (n9l.a) r142.get(str10);
                    ?? r492 = r87;
                    vel.a aVar3 = (vel.a) r2.get(str10);
                    if (aVar3 == null || (bigDecimal = aVar3.f288346c) == null) {
                        r502 = r2;
                        currencyClause = currencyClause3;
                        B = r492;
                    } else {
                        r502 = r2;
                        currencyClause = currencyClause3;
                        B = xqi.a.b(bigDecimal, false, 7);
                    }
                    if (!cp5.d.z(bVar4) || aVar2 == null) {
                        bVar = r492;
                    } else {
                        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(aVar2.f213663c);
                        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
                        bVar = new RowDelegate.Model.c.b(u5l.a.g(bigDecimalValueOf, aVar2.f213662b, bVar4), B, wf.REGULAR, false, 116);
                    }
                    String strO = com.google.android.gms.internal.mlkit_vision_face.a.o(str, "_", str10);
                    RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(currencyImage, null, null, false, null, false, 60);
                    m0 m0Var = lVar2.f288213p;
                    if (m0Var == null) {
                        Intrinsics.r("sourceIdentifier");
                        throw r492;
                    }
                    w0 w0VarA = o97.h.a(m0Var, str10);
                    m0 m0Var2 = lVar2.f288213p;
                    if (m0Var2 == null) {
                        Intrinsics.r("sourceIdentifier");
                        throw r492;
                    }
                    arrayList7.add(o97.w.a(new RowDelegate.Model(strO, image40, currencyClause2, null, 0, currencyClause, null, null, 0, bVar, false, null, false, null, null, null, null, null, null, new y(m0Var2, new vea.e(bVar4, accountId), "create", 56), new AnalyticsContext(w0VarA), 0, 0, 0, 0, 524286936), qVar.f324881b, qVar.f324882c));
                    bool = bool2;
                    it8 = it9;
                    r87 = r492;
                    r2 = r502;
                }
                Boolean bool3 = bool;
                ?? r493 = r87;
                yp0.b.k(arrayList7, 0, 0, 0, 0, 31);
                e0 e0Var = new e0(arrayList7);
                if (arrayList6.size() > 3) {
                    ?? r59 = r493;
                    TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i6, r59, r59, 14);
                    TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(bool3.booleanValue() ? R$string.search_block_header_show_less : R$string.search_block_header_show_more, r59, r59, 14);
                    String str11 = lVar2.o;
                    if (str11 == null) {
                        Intrinsics.r("sectionListId");
                        throw r59;
                    }
                    m0 m0Var3 = lVar2.f288213p;
                    if (m0Var3 == null) {
                        Intrinsics.r("sourceIdentifier");
                        throw r59;
                    }
                    f0Var = new g0(textLocalisedClause, textLocalisedClause2, str11, new y(m0Var3, r59, r59, 62));
                    r56 = r59;
                } else {
                    ?? r510 = r493;
                    TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(i6, r510, r510, 14);
                    String str12 = lVar2.o;
                    if (str12 == null) {
                        Intrinsics.r("sectionListId");
                        throw r510;
                    }
                    f0Var = new f0(textLocalisedClause3, str12);
                    r56 = r510;
                }
                d0[] d0VarArr = new d0[2];
                d0VarArr[0] = f0Var;
                d0VarArr[i108] = e0Var;
                return zi0.c.P(zhm.v.k(d0VarArr), false, r56, 3);
        }
    }

    public /* synthetic */ c(f9l.d dVar, String str, List list, int i, List list2) {
        this.f20415a = 2;
        this.f20416b = str;
        this.d = list;
        this.f20417c = i;
        this.e = list2;
    }

    public /* synthetic */ c(Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.f20415a = i2;
        this.d = obj2;
        this.f20416b = obj3;
        this.e = obj4;
        this.f20417c = i;
    }

    public /* synthetic */ c(String str, int i, vea.l lVar, AccountId accountId) {
        this.f20415a = 9;
        this.f20416b = str;
        this.f20417c = i;
        this.d = lVar;
        this.e = accountId;
    }

    public /* synthetic */ c(r10.q qVar, String str, int i, c0 c0Var, ArrayList arrayList) {
        this.f20415a = 6;
        this.f20416b = str;
        this.f20417c = i;
        this.d = c0Var;
        this.e = arrayList;
    }

    public /* synthetic */ c(s3d.d dVar, dsh.e eVar, String str, String str2, int i) {
        this.f20415a = 7;
        this.d = eVar;
        this.f20416b = str;
        this.e = str2;
        this.f20417c = i;
    }
}
