package n09;

import androidx.collection.ArrayMap;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.time.LocalDate;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.json.Json;
import o45.b1;
import o45.f1;
import o45.p0;
import o45.v0;
import o45.w1;
import o45.y0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f210946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f210947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f210948c;

    public /* synthetic */ j0(Object obj2, Object obj3, int i) {
        this.f210946a = i;
        this.f210947b = obj2;
        this.f210948c = obj3;
    }

    private final Object a(Object obj2) {
        int i;
        q45.a aVar;
        f1 f1Var;
        v0 v0Var;
        o45.f0 f0Var;
        b1 b1Var;
        o45.c0 c0Var;
        y0 y0Var;
        p0 p0Var;
        o45.j0 j0Var;
        int i2;
        String text;
        n45.c cVar = (n45.c) this.f210947b;
        String str = (String) this.f210948c;
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        r45.a aVar2 = cVar.f212297c;
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM loans WHERE id = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.bindNull(1);
            } else {
                sQLiteStatementPrepare.bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "disbursalDate");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "finalRepaymentDate");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "currency");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "countryCode");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "principal");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "outstandingPrincipal");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "outstandingRescheduledPrincipal");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fixedOutstandingBalance");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "totalRepaid");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "totalToRepay");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "fractionRepaid");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "product");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "repaidCount");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "remainingTerm");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "interestRate");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "nextInstalment");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "lastPaidRepayment");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "config");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "refurbishment");
            int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "interestOnly");
            int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "insuranceState");
            ArrayMap arrayMap = new ArrayMap();
            while (true) {
                i = columnIndexOrThrow12;
                aVar = null;
                if (!sQLiteStatementPrepare.step()) {
                    break;
                }
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow)) {
                    i2 = columnIndexOrThrow11;
                    text = null;
                } else {
                    i2 = columnIndexOrThrow11;
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow);
                }
                if (text != null) {
                    arrayMap.put(text, null);
                }
                columnIndexOrThrow12 = i;
                columnIndexOrThrow11 = i2;
            }
            int i3 = columnIndexOrThrow11;
            sQLiteStatementPrepare.reset();
            cVar.a(sQLiteConnection, arrayMap);
            if (sQLiteStatementPrepare.step()) {
                String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                LocalDate localDateC = r45.a.c(sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                LocalDate localDateC2 = r45.a.c(sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                long j2 = sQLiteStatementPrepare.getLong(columnIndexOrThrow7);
                long j3 = sQLiteStatementPrepare.getLong(columnIndexOrThrow8);
                Long lValueOf = sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow9));
                Long lValueOf2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow10));
                long j5 = sQLiteStatementPrepare.getLong(i3);
                long j16 = sQLiteStatementPrepare.getLong(i);
                double d = sQLiteStatementPrepare.getDouble(columnIndexOrThrow13);
                String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14);
                if (text6 != null) {
                    Json jsonA = h55.b.a();
                    jsonA.getClass();
                    f1Var = (f1) jsonA.b(nlm.a.c(f1.INSTANCE.serializer()), text6);
                } else {
                    f1Var = null;
                }
                String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow15) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow15);
                int i5 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow16);
                int i6 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow17);
                String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow18) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow18);
                if (text8 != null) {
                    Json jsonA2 = h55.b.a();
                    jsonA2.getClass();
                    v0Var = (v0) jsonA2.b(nlm.a.c(v0.Companion.serializer()), text8);
                } else {
                    v0Var = null;
                }
                String text9 = sQLiteStatementPrepare.isNull(columnIndexOrThrow19) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow19);
                if (text9 != null) {
                    Json jsonA3 = h55.b.a();
                    jsonA3.getClass();
                    f0Var = (o45.f0) jsonA3.b(nlm.a.c(o45.f0.Companion.serializer()), text9);
                } else {
                    f0Var = null;
                }
                String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow20) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow20);
                if (text10 != null) {
                    Json jsonA4 = h55.b.a();
                    jsonA4.getClass();
                    b1Var = (b1) jsonA4.b(nlm.a.c(b1.Companion.serializer()), text10);
                } else {
                    b1Var = null;
                }
                String text11 = sQLiteStatementPrepare.isNull(columnIndexOrThrow21) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow21);
                if (text11 != null) {
                    Json jsonA5 = h55.b.a();
                    jsonA5.getClass();
                    c0Var = (o45.c0) jsonA5.b(nlm.a.c(o45.c0.Companion.serializer()), text11);
                } else {
                    c0Var = null;
                }
                String text12 = sQLiteStatementPrepare.isNull(columnIndexOrThrow22) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow22);
                if (text12 != null) {
                    Json jsonA6 = h55.b.a();
                    jsonA6.getClass();
                    y0Var = (y0) jsonA6.b(nlm.a.c(y0.Companion.serializer()), text12);
                } else {
                    y0Var = null;
                }
                String text13 = sQLiteStatementPrepare.isNull(columnIndexOrThrow23) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow23);
                if (text13 != null) {
                    Json jsonA7 = h55.b.a();
                    jsonA7.getClass();
                    p0Var = (p0) jsonA7.b(nlm.a.c(p0.Companion.serializer()), text13);
                } else {
                    p0Var = null;
                }
                String text14 = sQLiteStatementPrepare.isNull(columnIndexOrThrow24) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow24);
                if (text14 != null) {
                    Json jsonA8 = h55.b.a();
                    jsonA8.getClass();
                    j0Var = (o45.j0) jsonA8.b(nlm.a.c(o45.j0.INSTANCE.serializer()), text14);
                } else {
                    j0Var = null;
                }
                w1 w1Var = new w1(text2, text3, localDateC, localDateC2, text4, text5, j2, j3, lValueOf, lValueOf2, j5, j16, d, f1Var, text7, i5, i6, v0Var, f0Var, b1Var, c0Var, y0Var, p0Var, j0Var);
                String text15 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                aVar = new q45.a(w1Var, text15 != null ? (o45.z) arrayMap.get(text15) : null);
            }
            sQLiteStatementPrepare.close();
            return aVar;
        } catch (Throwable th10) {
            sQLiteStatementPrepare.close();
            throw th10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0274  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 2510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n09.j0.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ j0(n2j.c cVar, e16.g gVar, String str) {
        this.f210946a = 16;
        this.f210947b = gVar;
        this.f210948c = str;
    }
}
