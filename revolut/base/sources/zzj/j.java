package zzj;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.retail.feature.marketnews.impl.data.database.MarketNewsDatabase;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.joda.time.DateTime;
import pjl.e0;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f326781a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b21.a f326783c = new b21.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z8g.i f326782b = new z8g.i(this, 12);

    public j(MarketNewsDatabase marketNewsDatabase) {
        this.f326781a = marketNewsDatabase;
    }

    public static /* synthetic */ Unit j(j jVar, ArrayList arrayList) {
        super.a(arrayList);
        return Unit.f186387a;
    }

    @Override // zzj.f
    public final void a(ArrayList arrayList) {
        DBUtil.performBlocking(this.f326781a, false, true, new g(this, arrayList, 1));
    }

    @Override // zzj.f
    public final void b(long j2) {
        DBUtil.performBlocking(this.f326781a, false, true, new nxc.a(j2, 26));
    }

    @Override // zzj.f
    public final e c(String str, boolean z) {
        return (e) DBUtil.performBlocking(this.f326781a, true, false, new wo5.a(this, str, z, 11));
    }

    @Override // zzj.f
    public final List d(final String str, final boolean z, final long j2, final long j3, final int i) {
        return (List) DBUtil.performBlocking(this.f326781a, true, false, new Function1() { // from class: zzj.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i2;
                Integer numValueOf;
                String str2 = str;
                boolean z3 = z;
                long j5 = j3;
                long j16 = j2;
                int i3 = i;
                b21.a aVar = this.f326774a.f326783c;
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM wealth_news WHERE assetType = ? AND isTopStory = ? AND publishedDate >= ? AND publishedDate < ? ORDER BY publishedDate DESC LIMIT ?");
                try {
                    sQLiteStatementPrepare.bindText(1, str2);
                    sQLiteStatementPrepare.bindLong(2, z3 ? 1L : 0L);
                    sQLiteStatementPrepare.bindLong(3, j5);
                    sQLiteStatementPrepare.bindLong(4, j16);
                    sQLiteStatementPrepare.bindLong(5, i3);
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "assetType");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "title");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "imageUrl");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "htmlBody");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "publishedDate");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "source");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "lengthInMins");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isTopStory");
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "relatedSymbols");
                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "relatedCurrencies");
                    int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "keywords");
                    int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "assetsFilters");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        String text = null;
                        String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                        String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                        String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                        String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                        DateTime dateTimeI = b21.a.i(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow6)));
                        String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                        if (sQLiteStatementPrepare.isNull(columnIndexOrThrow8)) {
                            i2 = columnIndexOrThrow;
                            numValueOf = null;
                        } else {
                            i2 = columnIndexOrThrow;
                            numValueOf = Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8));
                        }
                        boolean z4 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9)) != 0;
                        List listK = b21.a.k(sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10));
                        List listK2 = b21.a.k(sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11));
                        List listK3 = b21.a.k(sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12));
                        if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow13)) {
                            text = sQLiteStatementPrepare.getText(columnIndexOrThrow13);
                        }
                        arrayList.add(new e(text2, text3, text4, text5, text6, dateTimeI, text7, numValueOf, z4, listK, listK2, listK3, b21.a.k(text)));
                        columnIndexOrThrow = i2;
                    }
                    return arrayList;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            }
        });
    }

    @Override // zzj.f
    public final List e(int i, long j2, long j3, String str, String str2) {
        return (List) DBUtil.performBlocking(this.f326781a, true, false, new i(this, str, j3, j2, str2, i));
    }

    @Override // zzj.f
    public final List f(int i) {
        StringBuilder sb6 = new StringBuilder();
        sb6.append("SELECT * FROM wealth_news WHERE keywords = ");
        StringUtil.appendPlaceholders(sb6, 1);
        sb6.append(" ORDER BY publishedDate DESC LIMIT ");
        sb6.append("?");
        return (List) DBUtil.performBlocking(this.f326781a, true, false, new e0(this, sb6.toString(), 1, i));
    }

    @Override // zzj.f
    public final List g(int i, long j2, long j3, String str, String str2) {
        return (List) DBUtil.performBlocking(this.f326781a, true, false, new i(this, str, str2, j3, j2, i));
    }

    @Override // zzj.f
    public final void h(ArrayList arrayList) {
        DBUtil.performBlocking(this.f326781a, false, true, new g(this, arrayList, 0));
    }

    @Override // zzj.f
    public final void i(e eVar) {
        DBUtil.performBlocking(this.f326781a, false, true, new zp5.f(this, eVar, 29));
    }
}
