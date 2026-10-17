package nvg;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.feature.wealth.analytics.data.database.WealthAnalyticsDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
public final class m extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f219645a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b21.a f219647c = new b21.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f219646b = new c(this, 4);

    public m(WealthAnalyticsDatabase wealthAnalyticsDatabase) {
        this.f219645a = wealthAnalyticsDatabase;
    }

    public static /* synthetic */ Unit e(m mVar, ArrayList arrayList, List list, eel.c cVar, iwg.c cVar2, boolean z, String str) {
        super.c(arrayList, list, cVar, cVar2, z, str);
        return Unit.f186387a;
    }

    @Override // nvg.i
    public final void a(final List list, final eel.c cVar, final iwg.c cVar2, final boolean z, final String str) {
        StringBuilder sbS = p.a.s("DELETE FROM `complex_analytics_combined_contributors` WHERE `asset_type` IN (");
        final int size = list.size();
        StringUtil.appendPlaceholders(sbS, size);
        sbS.append(") AND `time_span` = ");
        sbS.append("?");
        sbS.append(" AND `method` = ");
        j6.a.D(sbS, "?", " AND `sector` = ", "?", " AND `currency` = ");
        sbS.append("?");
        final String string = sbS.toString();
        DBUtil.performBlocking(this.f219645a, false, true, new Function1(this) { // from class: nvg.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                List list2 = list;
                int i = size;
                eel.c cVar3 = cVar;
                iwg.c cVar4 = cVar2;
                boolean z3 = z;
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare(string);
                try {
                    Iterator it8 = list2.iterator();
                    int i2 = 1;
                    while (it8.hasNext()) {
                        String strA = pvg.t.a((iwg.a) it8.next());
                        if (strA == null) {
                            sQLiteStatementPrepare.bindNull(i2);
                        } else {
                            sQLiteStatementPrepare.bindText(i2, strA);
                        }
                        i2++;
                    }
                    int i3 = i + 1;
                    String strC = pvg.t.c(cVar3);
                    if (strC == null) {
                        sQLiteStatementPrepare.bindNull(i3);
                    } else {
                        sQLiteStatementPrepare.bindText(i3, strC);
                    }
                    int i5 = i + 2;
                    String strB = pvg.t.b(cVar4);
                    if (strB == null) {
                        sQLiteStatementPrepare.bindNull(i5);
                    } else {
                        sQLiteStatementPrepare.bindText(i5, strB);
                    }
                    sQLiteStatementPrepare.bindLong(i + 3, z3 ? 1L : 0L);
                    int i6 = i + 4;
                    String str2 = str;
                    if (str2 == null) {
                        sQLiteStatementPrepare.bindNull(i6);
                    } else {
                        sQLiteStatementPrepare.bindText(i6, str2);
                    }
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.close();
                    return null;
                } catch (Throwable th10) {
                    sQLiteStatementPrepare.close();
                    throw th10;
                }
            }
        });
    }

    @Override // nvg.i
    public final void b(ArrayList arrayList) {
        DBUtil.performBlocking(this.f219645a, false, true, new no.e0(this, arrayList, 26));
    }

    @Override // nvg.i
    public final void c(ArrayList arrayList, List list, eel.c cVar, iwg.c cVar2, boolean z, String str) {
        DBUtil.performBlocking(this.f219645a, false, true, new l(this, arrayList, list, cVar, cVar2, z, str));
    }

    @Override // nvg.i
    public final List d(final List list, final eel.c cVar, final iwg.c cVar2, final boolean z, final String str) {
        StringBuilder sbS = p.a.s("SELECT * FROM `complex_analytics_combined_contributors` WHERE `asset_type` IN (");
        final int size = list.size();
        StringUtil.appendPlaceholders(sbS, size);
        sbS.append(") AND `time_span` = ");
        sbS.append("?");
        sbS.append(" AND `method` = ");
        j6.a.D(sbS, "?", " AND `sector` = ", "?", " AND `currency` = ");
        sbS.append("?");
        final String string = sbS.toString();
        return (List) DBUtil.performBlocking(this.f219645a, true, false, new Function1() { // from class: nvg.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                float f;
                Float fValueOf;
                List list2 = list;
                int i = size;
                eel.c cVar3 = cVar;
                iwg.c cVar4 = cVar2;
                boolean z3 = z;
                b21.a aVar = this.f219632a.f219647c;
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare(string);
                try {
                    Iterator it8 = list2.iterator();
                    int i2 = 1;
                    while (it8.hasNext()) {
                        String strA = pvg.t.a((iwg.a) it8.next());
                        if (strA == null) {
                            sQLiteStatementPrepare.bindNull(i2);
                        } else {
                            sQLiteStatementPrepare.bindText(i2, strA);
                        }
                        i2++;
                    }
                    int i3 = i + 1;
                    String strC = pvg.t.c(cVar3);
                    if (strC == null) {
                        sQLiteStatementPrepare.bindNull(i3);
                    } else {
                        sQLiteStatementPrepare.bindText(i3, strC);
                    }
                    int i5 = i + 2;
                    String strB = pvg.t.b(cVar4);
                    if (strB == null) {
                        sQLiteStatementPrepare.bindNull(i5);
                    } else {
                        sQLiteStatementPrepare.bindText(i5, strB);
                    }
                    sQLiteStatementPrepare.bindLong(i + 3, z3 ? 1L : 0L);
                    int i6 = i + 4;
                    String str2 = str;
                    if (str2 == null) {
                        sQLiteStatementPrepare.bindNull(i6);
                    } else {
                        sQLiteStatementPrepare.bindText(i6, str2);
                    }
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "asset_type");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "time_span");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "method");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sector");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "currency");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "asset");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pnl");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "returns");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "returnOnInitialMargin");
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "closedOn");
                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ref");
                    int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "openingPrice");
                    int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "positionId");
                    int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "quantity");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        iwg.a aVarE = pvg.t.e(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow));
                        eel.c cVarG = pvg.t.g(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                        iwg.c cVarF = pvg.t.f(sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                        int i21 = columnIndexOrThrow2;
                        int i22 = columnIndexOrThrow3;
                        boolean z4 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4)) != 0;
                        String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                        String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                        jo3.b bVarG = b21.a.g(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7));
                        float f4 = (float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow8);
                        if (sQLiteStatementPrepare.isNull(columnIndexOrThrow9)) {
                            f = f4;
                            fValueOf = null;
                        } else {
                            f = f4;
                            fValueOf = Float.valueOf((float) sQLiteStatementPrepare.getDouble(columnIndexOrThrow9));
                        }
                        String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10);
                        arrayList.add(new pvg.h(aVarE, cVarG, cVarF, z4, text, text2, bVarG, f, fValueOf, text3 != null ? LocalDate.parse(text3) : null, sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11), b21.a.e(sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12)), sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13), sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14)));
                        columnIndexOrThrow2 = i21;
                        columnIndexOrThrow3 = i22;
                    }
                    sQLiteStatementPrepare.close();
                    return arrayList;
                } catch (Throwable th10) {
                    sQLiteStatementPrepare.close();
                    throw th10;
                }
            }
        });
    }
}
