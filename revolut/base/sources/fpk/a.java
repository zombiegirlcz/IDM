package fpk;

import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f137113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f137114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f137115c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ArrayList e;

    public /* synthetic */ a(ArrayList arrayList, ArrayList arrayList2, String str, int i, int i2) {
        this.f137113a = i2;
        this.f137114b = str;
        this.f137115c = arrayList;
        this.d = i;
        this.e = arrayList2;
    }

    /* JADX WARN: Finally extract failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f137113a) {
            case 0:
                ArrayList<String> arrayList = this.f137115c;
                int i = this.d;
                ArrayList<String> arrayList2 = this.e;
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare(this.f137114b);
                try {
                    int i2 = 1;
                    for (String str : arrayList) {
                        if (str == null) {
                            sQLiteStatementPrepare.bindNull(i2);
                        } else {
                            sQLiteStatementPrepare.bindText(i2, str);
                        }
                        i2++;
                    }
                    int i3 = i + 1;
                    for (String str2 : arrayList2) {
                        if (str2 == null) {
                            sQLiteStatementPrepare.bindNull(i3);
                        } else {
                            sQLiteStatementPrepare.bindText(i3, str2);
                        }
                        i3++;
                    }
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "from");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "to");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "askRate");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "bidRate");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "midRate");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "eodRate");
                    ArrayList arrayList3 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList3.add(new d(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6)));
                        break;
                    }
                    sQLiteStatementPrepare.close();
                    return arrayList3;
                } catch (Throwable th10) {
                    sQLiteStatementPrepare.close();
                    throw th10;
                }
            default:
                ArrayList<String> arrayList4 = this.f137115c;
                int i5 = this.d;
                ArrayList<String> arrayList5 = this.e;
                SQLiteStatement sQLiteStatementPrepare2 = ((SQLiteConnection) obj2).prepare(this.f137114b);
                try {
                    int i6 = 1;
                    for (String str3 : arrayList4) {
                        if (str3 == null) {
                            sQLiteStatementPrepare2.bindNull(i6);
                        } else {
                            sQLiteStatementPrepare2.bindText(i6, str3);
                        }
                        i6++;
                    }
                    int i21 = i5 + 1;
                    for (String str4 : arrayList5) {
                        if (str4 == null) {
                            sQLiteStatementPrepare2.bindNull(i21);
                        } else {
                            sQLiteStatementPrepare2.bindText(i21, str4);
                        }
                        i21++;
                    }
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "assetId");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "toCurrency");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "rate");
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "eodRate");
                    ArrayList arrayList6 = new ArrayList();
                    while (sQLiteStatementPrepare2.step()) {
                        String text = null;
                        String text2 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow7);
                        String text3 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow8);
                        String text4 = sQLiteStatementPrepare2.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow9);
                        if (!sQLiteStatementPrepare2.isNull(columnIndexOrThrow10)) {
                            text = sQLiteStatementPrepare2.getText(columnIndexOrThrow10);
                        }
                        arrayList6.add(new w46.b(text2, text3, text4, text));
                        break;
                    }
                    sQLiteStatementPrepare2.close();
                    return arrayList6;
                } catch (Throwable th11) {
                    sQLiteStatementPrepare2.close();
                    throw th11;
                }
        }
    }
}
