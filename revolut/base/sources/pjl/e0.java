package pjl;

import android.database.Cursor;
import android.graphics.drawable.Drawable;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.ParagraphInfo;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class e0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f236805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f236806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f236807c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e0(int i, int i2, Function1 function1) {
        this.f236805a = 1;
        this.f236806b = i;
        this.f236807c = i2;
        this.d = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i;
        int i2;
        Integer numValueOf;
        switch (this.f236805a) {
            case 0:
                Cursor cursor = (Cursor) this.d;
                Cursor it8 = (Cursor) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new Pair(cursor.getString(this.f236806b), cursor.getString(this.f236807c));
            case 1:
                Function1 function1 = (Function1) this.d;
                Drawable drawable = (Drawable) obj2;
                if (drawable != null) {
                    drawable.setBounds(0, 0, this.f236806b, this.f236807c);
                }
                if (function1 != null) {
                    function1.invoke(drawable);
                }
                return Unit.f186387a;
            case 2:
                return MultiParagraph.getPathForRange$lambda$1((Path) this.d, this.f236806b, this.f236807c, (ParagraphInfo) obj2);
            default:
                String str = (String) this.d;
                int i3 = this.f236806b;
                int i5 = this.f236807c;
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare(str);
                try {
                    sQLiteStatementPrepare.bindNull(1);
                    sQLiteStatementPrepare.bindLong(i3 + 1, i5);
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
                            i2 = columnIndexOrThrow2;
                            numValueOf = null;
                        } else {
                            i = columnIndexOrThrow;
                            i2 = columnIndexOrThrow2;
                            numValueOf = Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow8));
                        }
                        boolean z = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9)) != 0;
                        List listK = b21.a.k(sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10));
                        List listK2 = b21.a.k(sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11));
                        List listK3 = b21.a.k(sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12));
                        if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow13)) {
                            text = sQLiteStatementPrepare.getText(columnIndexOrThrow13);
                        }
                        arrayList.add(new zzj.e(text2, text3, text4, text5, text6, dateTimeI, text7, numValueOf, z, listK, listK2, listK3, b21.a.k(text)));
                        columnIndexOrThrow = i;
                        columnIndexOrThrow2 = i2;
                        break;
                    }
                    return arrayList;
                } finally {
                    sQLiteStatementPrepare.close();
                }
        }
    }

    public /* synthetic */ e0(Object obj2, int i, int i2, int i3) {
        this.f236805a = i3;
        this.d = obj2;
        this.f236806b = i;
        this.f236807c = i2;
    }

    public /* synthetic */ e0(zzj.j jVar, String str, int i, int i2) {
        this.f236805a = 3;
        this.d = str;
        this.f236806b = i;
        this.f236807c = i2;
    }
}
