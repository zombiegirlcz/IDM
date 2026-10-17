package dcl;

import androidx.collection.ArrayMap;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import hcl.a3;
import hcl.d3;
import hcl.x2;
import hcl.y2;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class e0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f113012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f113013b;

    public /* synthetic */ e0(h0 h0Var, int i) {
        this.f113012a = i;
        this.f113013b = h0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteStatement sQLiteStatementPrepare;
        int i;
        int i2;
        Integer numValueOf;
        int i3;
        int i5;
        Integer numValueOf2;
        switch (this.f113012a) {
            case 0:
                qcl.d dVar = this.f113013b.f113023b;
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM instruments");
                try {
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ref");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "symbol");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "stateDetails");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requiredProducts");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "typeSpecificProperties");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "currency");
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sortOrder");
                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isin");
                    int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "exchange");
                    int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "shortOverview");
                    int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "quantityDecimalPlaces");
                    int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "priceDecimalPlaces");
                    int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "allSymbols");
                    int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "underlying_currency");
                    int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "promotion_campaigns");
                    int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "list_status");
                    int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state_reason");
                    int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "delist_date");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                        String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                        String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                        String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                        hcl.n0 n0VarD = qcl.k.d(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                        a3 a3VarF = qcl.k.f(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7));
                        d3 d3VarG = qcl.k.g(sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8));
                        String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                        if (sQLiteStatementPrepare.isNull(columnIndexOrThrow10)) {
                            i = columnIndexOrThrow2;
                            i2 = columnIndexOrThrow3;
                            numValueOf = null;
                        } else {
                            i = columnIndexOrThrow2;
                            i2 = columnIndexOrThrow3;
                            numValueOf = Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10));
                        }
                        String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11);
                        String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                        String text9 = sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13);
                        int i6 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow14);
                        int i21 = columnIndexOrThrow15;
                        if (sQLiteStatementPrepare.isNull(i21)) {
                            i3 = columnIndexOrThrow4;
                            i5 = columnIndexOrThrow5;
                            numValueOf2 = null;
                        } else {
                            i3 = columnIndexOrThrow4;
                            i5 = columnIndexOrThrow5;
                            numValueOf2 = Integer.valueOf((int) sQLiteStatementPrepare.getLong(i21));
                        }
                        int i22 = columnIndexOrThrow16;
                        List listF = qcl.d.f(sQLiteStatementPrepare.isNull(i22) ? null : sQLiteStatementPrepare.getText(i22));
                        int i32 = columnIndexOrThrow17;
                        String text10 = sQLiteStatementPrepare.isNull(i32) ? null : sQLiteStatementPrepare.getText(i32);
                        int i33 = columnIndexOrThrow;
                        int i43 = columnIndexOrThrow18;
                        List listF2 = qcl.d.f(sQLiteStatementPrepare.isNull(i43) ? null : sQLiteStatementPrepare.getText(i43));
                        columnIndexOrThrow18 = i43;
                        int i59 = columnIndexOrThrow19;
                        hcl.l0 l0VarC = qcl.k.c(sQLiteStatementPrepare.isNull(i59) ? null : sQLiteStatementPrepare.getText(i59));
                        columnIndexOrThrow19 = i59;
                        int i66 = columnIndexOrThrow20;
                        String text11 = sQLiteStatementPrepare.isNull(i66) ? null : sQLiteStatementPrepare.getText(i66);
                        columnIndexOrThrow20 = i66;
                        int i74 = columnIndexOrThrow21;
                        arrayList.add(new hcl.k0(text, text2, text3, text4, text5, n0VarD, a3VarF, d3VarG, text6, numValueOf, text7, text8, text9, i6, numValueOf2, listF, text10, listF2, l0VarC, text11, sQLiteStatementPrepare.isNull(i74) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(i74))));
                        columnIndexOrThrow21 = i74;
                        columnIndexOrThrow17 = i32;
                        columnIndexOrThrow = i33;
                        columnIndexOrThrow2 = i;
                        columnIndexOrThrow5 = i5;
                        columnIndexOrThrow16 = i22;
                        columnIndexOrThrow4 = i3;
                        columnIndexOrThrow15 = i21;
                        columnIndexOrThrow3 = i2;
                        break;
                    }
                    return arrayList;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            default:
                h0 h0Var = this.f113013b;
                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
                sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT r.* FROM recently_viewed_instrument r JOIN instruments i ON r.ref = i.ref ORDER BY r.last_seen DESC LIMIT ?");
                try {
                    sQLiteStatementPrepare.bindLong(1, 8);
                    int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ref");
                    int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "last_seen");
                    ArrayMap arrayMap = new ArrayMap();
                    while (sQLiteStatementPrepare.step()) {
                        String text12 = sQLiteStatementPrepare.isNull(columnIndexOrThrow22) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow22);
                        if (text12 != null) {
                            arrayMap.put(text12, null);
                        }
                    }
                    sQLiteStatementPrepare.reset();
                    h0Var.i(sQLiteConnection, arrayMap);
                    ArrayList arrayList2 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        x2 x2Var = new x2(sQLiteStatementPrepare.isNull(columnIndexOrThrow22) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow22), sQLiteStatementPrepare.getLong(columnIndexOrThrow23));
                        String text13 = sQLiteStatementPrepare.isNull(columnIndexOrThrow22) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow22);
                        arrayList2.add(new y2(x2Var, text13 != null ? (hcl.k0) arrayMap.get(text13) : null));
                        break;
                    }
                    return arrayList2;
                } catch (Throwable th10) {
                    throw th10;
                }
        }
    }
}
