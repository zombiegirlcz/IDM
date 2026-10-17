package zzj;

import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f326777a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f326778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f326779c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f326780g;

    public /* synthetic */ i(j jVar, String str, long j2, long j3, String str2, int i) {
        this.f326778b = jVar;
        this.f326779c = str;
        this.d = j2;
        this.e = j3;
        this.f = str2;
        this.f326780g = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteStatement sQLiteStatementPrepare;
        int i;
        Integer numValueOf;
        int i2;
        int i3;
        Integer numValueOf2;
        switch (this.f326777a) {
            case 0:
                String str = this.f326779c;
                long j2 = this.d;
                long j3 = this.e;
                int i5 = this.f326780g;
                b21.a aVar = this.f326778b.f326783c;
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM wealth_news WHERE assetType = ? AND (relatedCurrencies LIKE '%' || ? || '%')AND publishedDate >= ? AND publishedDate < ? ORDER BY publishedDate DESC LIMIT ?");
                try {
                    sQLiteStatementPrepare.bindText(1, str);
                    String str2 = this.f;
                    if (str2 == null) {
                        sQLiteStatementPrepare.bindNull(2);
                    } else {
                        sQLiteStatementPrepare.bindText(2, str2);
                    }
                    sQLiteStatementPrepare.bindLong(3, j2);
                    sQLiteStatementPrepare.bindLong(4, j3);
                    sQLiteStatementPrepare.bindLong(5, i5);
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
                            i = columnIndexOrThrow;
                            numValueOf = null;
                        } else {
                            i = columnIndexOrThrow;
                            numValueOf = Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8));
                        }
                        boolean z = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9)) != 0;
                        List listK = b21.a.k(sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10));
                        List listK2 = b21.a.k(sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11));
                        List listK3 = b21.a.k(sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12));
                        if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow13)) {
                            text = sQLiteStatementPrepare.getText(columnIndexOrThrow13);
                        }
                        arrayList.add(new e(text2, text3, text4, text5, text6, dateTimeI, text7, numValueOf, z, listK, listK2, listK3, b21.a.k(text)));
                        columnIndexOrThrow = i;
                        break;
                    }
                    sQLiteStatementPrepare.close();
                    return arrayList;
                } finally {
                }
            default:
                String str3 = this.f326779c;
                long j5 = this.d;
                long j16 = this.e;
                int i6 = this.f326780g;
                b21.a aVar2 = this.f326778b.f326783c;
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM wealth_news WHERE assetType = ? AND isTopStory = ? AND publishedDate >= ? AND publishedDate < ? AND assetsFilters LIKE '%\"' || ? || '\"%' ORDER BY publishedDate DESC LIMIT ?");
                try {
                    sQLiteStatementPrepare.bindText(1, str3);
                    sQLiteStatementPrepare.bindLong(2, 1);
                    sQLiteStatementPrepare.bindLong(3, j5);
                    sQLiteStatementPrepare.bindLong(4, j16);
                    String str4 = this.f;
                    if (str4 == null) {
                        sQLiteStatementPrepare.bindNull(5);
                    } else {
                        sQLiteStatementPrepare.bindText(5, str4);
                    }
                    sQLiteStatementPrepare.bindLong(6, i6);
                    int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "assetType");
                    int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "title");
                    int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "imageUrl");
                    int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "htmlBody");
                    int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "publishedDate");
                    int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "source");
                    int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "lengthInMins");
                    int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isTopStory");
                    int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "relatedSymbols");
                    int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "relatedCurrencies");
                    int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "keywords");
                    int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "assetsFilters");
                    ArrayList arrayList2 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        String text8 = null;
                        String text9 = sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14);
                        String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow15) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow15);
                        String text11 = sQLiteStatementPrepare.isNull(columnIndexOrThrow16) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow16);
                        String text12 = sQLiteStatementPrepare.isNull(columnIndexOrThrow17) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow17);
                        String text13 = sQLiteStatementPrepare.isNull(columnIndexOrThrow18) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow18);
                        DateTime dateTimeI2 = b21.a.i(sQLiteStatementPrepare.isNull(columnIndexOrThrow19) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow19)));
                        String text14 = sQLiteStatementPrepare.isNull(columnIndexOrThrow20) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow20);
                        if (sQLiteStatementPrepare.isNull(columnIndexOrThrow21)) {
                            i2 = columnIndexOrThrow15;
                            i3 = columnIndexOrThrow16;
                            numValueOf2 = null;
                        } else {
                            i2 = columnIndexOrThrow15;
                            i3 = columnIndexOrThrow16;
                            numValueOf2 = Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow21));
                        }
                        boolean z3 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow22)) != 0;
                        List listK4 = b21.a.k(sQLiteStatementPrepare.isNull(columnIndexOrThrow23) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow23));
                        List listK5 = b21.a.k(sQLiteStatementPrepare.isNull(columnIndexOrThrow24) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow24));
                        List listK6 = b21.a.k(sQLiteStatementPrepare.isNull(columnIndexOrThrow25) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow25));
                        if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow26)) {
                            text8 = sQLiteStatementPrepare.getText(columnIndexOrThrow26);
                        }
                        arrayList2.add(new e(text9, text10, text11, text12, text13, dateTimeI2, text14, numValueOf2, z3, listK4, listK5, listK6, b21.a.k(text8)));
                        columnIndexOrThrow15 = i2;
                        columnIndexOrThrow16 = i3;
                        break;
                    }
                    sQLiteStatementPrepare.close();
                    return arrayList2;
                } finally {
                }
        }
    }

    public /* synthetic */ i(j jVar, String str, String str2, long j2, long j3, int i) {
        this.f326778b = jVar;
        this.f326779c = str;
        this.f = str2;
        this.d = j2;
        this.e = j3;
        this.f326780g = i;
    }
}
