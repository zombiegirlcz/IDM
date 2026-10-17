package s7a;

import android.graphics.Bitmap;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jmrtd.lds.LDSFile;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class l0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f260616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f260617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f260618c;

    public /* synthetic */ l0(String str, String str2, int i) {
        this.f260616a = i;
        this.f260617b = str;
        this.f260618c = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f260616a) {
            case 0:
                r update = (r) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return r.a(update, null, null, null, this.f260617b, false, this.f260618c, LDSFile.EF_SOD_TAG);
            case 1:
                List list = (List) obj2;
                Intrinsics.checkNotNullParameter(list, "list");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    kr2.e eVar = (kr2.e) obj3;
                    String str = this.f260617b;
                    String str2 = this.f260618c;
                    boolean zF = true;
                    boolean z = str == null || str.equals(str2);
                    String str3 = eVar.f188644b;
                    if (str3 != null || !z) {
                        if (str == null) {
                            Intrinsics.h(str2);
                            str = str2;
                        }
                        zF = Intrinsics.f(str3, str);
                    }
                    if (zF) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            case 2:
                Bitmap avatarBitmap = (Bitmap) obj2;
                Intrinsics.checkNotNullParameter(avatarBitmap, "avatarBitmap");
                return new ipa.n(avatarBitmap, this.f260617b, this.f260618c);
            case 3:
                Long contactId = (Long) obj2;
                Intrinsics.checkNotNullParameter(contactId, "contactId");
                long jLongValue = contactId.longValue();
                t0 t0Var = t0.f186434a;
                m70.a.c(t0Var);
                Intrinsics.checkNotNullParameter(t0Var, "<this>");
                return new zm3.e(this.f260617b, jLongValue, this.f260618c, "", "", null, 0L, 0);
            case 4:
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM travel_document WHERE product = ? AND type = ?");
                String str4 = this.f260617b;
                try {
                    if (str4 == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, str4);
                    }
                    String str5 = this.f260618c;
                    if (str5 == null) {
                        sQLiteStatementPrepare.bindNull(2);
                    } else {
                        sQLiteStatementPrepare.bindText(2, str5);
                    }
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "product");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "uri");
                    qxf.a aVar = null;
                    String text = null;
                    if (sQLiteStatementPrepare.step()) {
                        String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                        if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow3)) {
                            text = sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                        }
                        aVar = new qxf.a(text2, text3, text);
                    }
                    sQLiteStatementPrepare.close();
                    return aVar;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case 5:
                SQLiteStatement sQLiteStatementPrepare2 = ((SQLiteConnection) obj2).prepare("SELECT * FROM light_faq WHERE `type` = ? AND language = ? AND title LIKE '%' || ? || '%' ORDER BY `index` ASC");
                try {
                    sQLiteStatementPrepare2.bindText(1, "FAQ");
                    String str6 = this.f260617b;
                    if (str6 == null) {
                        sQLiteStatementPrepare2.bindNull(2);
                    } else {
                        sQLiteStatementPrepare2.bindText(2, str6);
                    }
                    String str7 = this.f260618c;
                    if (str7 == null) {
                        sQLiteStatementPrepare2.bindNull(3);
                    } else {
                        sQLiteStatementPrepare2.bindText(3, str7);
                    }
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "type");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "key");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "title");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "parentKey");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "contentStyle");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "deeplink");
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "language");
                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "index");
                    int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "iconUri");
                    ArrayList arrayList2 = new ArrayList();
                    while (sQLiteStatementPrepare2.step()) {
                        arrayList2.add(new zf0.f((int) sQLiteStatementPrepare2.getLong(columnIndexOrThrow11), sQLiteStatementPrepare2.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow4), sQLiteStatementPrepare2.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow5), sQLiteStatementPrepare2.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow6), sQLiteStatementPrepare2.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow7), sQLiteStatementPrepare2.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow8), sQLiteStatementPrepare2.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow9), sQLiteStatementPrepare2.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow10), sQLiteStatementPrepare2.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow12)));
                        break;
                    }
                    sQLiteStatementPrepare2.close();
                    return arrayList2;
                } finally {
                    sQLiteStatementPrepare2.close();
                }
            case 6:
                SQLiteStatement sQLiteStatementPrepare3 = ((SQLiteConnection) obj2).prepare("SELECT * FROM pigeon_node_details WHERE language = ? AND `key` = ?");
                String str8 = this.f260617b;
                try {
                    if (str8 == null) {
                        sQLiteStatementPrepare3.bindNull(1);
                    } else {
                        sQLiteStatementPrepare3.bindText(1, str8);
                    }
                    String str9 = this.f260618c;
                    if (str9 == null) {
                        sQLiteStatementPrepare3.bindNull(2);
                    } else {
                        sQLiteStatementPrepare3.bindText(2, str9);
                    }
                    int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "key");
                    int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "language");
                    int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "json");
                    zf0.g gVar = null;
                    String text4 = null;
                    if (sQLiteStatementPrepare3.step()) {
                        String text5 = sQLiteStatementPrepare3.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare3.getText(columnIndexOrThrow13);
                        String text6 = sQLiteStatementPrepare3.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare3.getText(columnIndexOrThrow14);
                        if (!sQLiteStatementPrepare3.isNull(columnIndexOrThrow15)) {
                            text4 = sQLiteStatementPrepare3.getText(columnIndexOrThrow15);
                        }
                        gVar = new zf0.g(text5, text6, text4);
                    }
                    sQLiteStatementPrepare3.close();
                    return gVar;
                } finally {
                }
            case 7:
                yb4.f update2 = (yb4.f) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return yb4.f.a(update2, null, foh.i.w(this.f260617b, this.f260618c, update2.f312185b), 1);
            default:
                SQLiteStatement sQLiteStatementPrepare4 = ((SQLiteConnection) obj2).prepare("SELECT * FROM crypto_positions WHERE type = ? AND baseCurrency = ?");
                String str10 = this.f260617b;
                try {
                    if (str10 == null) {
                        sQLiteStatementPrepare4.bindNull(1);
                    } else {
                        sQLiteStatementPrepare4.bindText(1, str10);
                    }
                    String str11 = this.f260618c;
                    if (str11 == null) {
                        sQLiteStatementPrepare4.bindNull(2);
                    } else {
                        sQLiteStatementPrepare4.bindText(2, str11);
                    }
                    int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "type");
                    int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "currency");
                    int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "baseCurrency");
                    int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "investment");
                    int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "lastTransactionDate");
                    int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare4, "averagePrice");
                    ArrayList arrayList3 = new ArrayList();
                    while (sQLiteStatementPrepare4.step()) {
                        String text7 = null;
                        String text8 = sQLiteStatementPrepare4.isNull(columnIndexOrThrow16) ? null : sQLiteStatementPrepare4.getText(columnIndexOrThrow16);
                        String text9 = sQLiteStatementPrepare4.isNull(columnIndexOrThrow17) ? null : sQLiteStatementPrepare4.getText(columnIndexOrThrow17);
                        String text10 = sQLiteStatementPrepare4.isNull(columnIndexOrThrow18) ? null : sQLiteStatementPrepare4.getText(columnIndexOrThrow18);
                        jo3.b bVarG = b21.a.g(sQLiteStatementPrepare4.isNull(columnIndexOrThrow19) ? null : sQLiteStatementPrepare4.getText(columnIndexOrThrow19));
                        DateTime dateTimeI = b21.a.i(sQLiteStatementPrepare4.isNull(columnIndexOrThrow20) ? null : Long.valueOf(sQLiteStatementPrepare4.getLong(columnIndexOrThrow20)));
                        if (!sQLiteStatementPrepare4.isNull(columnIndexOrThrow21)) {
                            text7 = sQLiteStatementPrepare4.getText(columnIndexOrThrow21);
                        }
                        arrayList3.add(new cu5.a(text8, text9, text10, bVarG, dateTimeI, b21.a.e(text7)));
                        break;
                    }
                    sQLiteStatementPrepare4.close();
                    return arrayList3;
                } finally {
                }
        }
    }

    public /* synthetic */ l0(zt5.a aVar, String str, String str2) {
        this.f260616a = 8;
        this.f260617b = str;
        this.f260618c = str2;
    }
}
