package n4d;

import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class w implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f212412a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f212413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f212414c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ w(String str, String str2, ArrayList arrayList) {
        this.f212413b = str;
        this.f212414c = str2;
        this.d = arrayList;
    }

    /* JADX WARN: Finally extract failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f212412a) {
            case 0:
                ArrayList<String> arrayList = this.d;
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare(this.f212413b);
                String str = this.f212414c;
                try {
                    if (str == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, str);
                    }
                    int i = 2;
                    for (String str2 : arrayList) {
                        if (str2 == null) {
                            sQLiteStatementPrepare.bindNull(i);
                        } else {
                            sQLiteStatementPrepare.bindText(i, str2);
                        }
                        i++;
                    }
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "watchlist_id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "asset_type_key");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "from_code");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "to_code");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "added_time");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sync_state");
                    ArrayList arrayList2 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                        String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                        String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                        Long lValueOf = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow5));
                        arrayList2.add(new o4d.d(text, text2, text3, text4, lValueOf != null ? Instant.ofEpochMilli(lValueOf.longValue()).atZone(ZoneOffset.UTC) : null, sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6)));
                        break;
                    }
                    sQLiteStatementPrepare.close();
                    return arrayList2;
                } catch (Throwable th10) {
                    sQLiteStatementPrepare.close();
                    throw th10;
                }
            default:
                ArrayList<String> arrayList3 = this.d;
                SQLiteStatement sQLiteStatementPrepare2 = ((SQLiteConnection) obj2).prepare(this.f212413b);
                String str3 = this.f212414c;
                try {
                    if (str3 == null) {
                        sQLiteStatementPrepare2.bindNull(1);
                    } else {
                        sQLiteStatementPrepare2.bindText(1, str3);
                    }
                    int i2 = 2;
                    for (String str4 : arrayList3) {
                        if (str4 == null) {
                            sQLiteStatementPrepare2.bindNull(i2);
                        } else {
                            sQLiteStatementPrepare2.bindText(i2, str4);
                        }
                        i2++;
                    }
                    sQLiteStatementPrepare2.step();
                    sQLiteStatementPrepare2.close();
                    return null;
                } catch (Throwable th11) {
                    sQLiteStatementPrepare2.close();
                    throw th11;
                }
        }
    }

    public /* synthetic */ w(x xVar, String str, String str2, ArrayList arrayList) {
        this.f212413b = str;
        this.f212414c = str2;
        this.d = arrayList;
    }
}
