package xf0;

import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.core.faq.data.db.typeconverters.FaqListConverter;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f304743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f304744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f304745c;

    public /* synthetic */ b(c cVar, String str, int i) {
        this.f304743a = i;
        this.f304744b = cVar;
        this.f304745c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteStatement sQLiteStatementPrepare;
        String text;
        int i;
        int i2;
        String text2;
        int i3;
        int i5;
        switch (this.f304743a) {
            case 0:
                c cVar = this.f304744b;
                FaqListConverter faqListConverter = cVar.f304748c;
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM faq WHERE language = ? ORDER BY key ASC");
                String str = this.f304745c;
                try {
                    if (str == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, str);
                    }
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "key");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "title");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "content");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "plane_content");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "placement");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "weight");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "relatedItems");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "language");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "userCountry");
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "actions");
                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "specialisationQueue");
                    int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chatEntrySuggestions");
                    int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "contentStyle");
                    int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                        String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                        String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                        if (sQLiteStatementPrepare.isNull(columnIndexOrThrow5)) {
                            text = null;
                            i2 = columnIndexOrThrow2;
                            i = columnIndexOrThrow3;
                        } else {
                            text = sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                            i = columnIndexOrThrow3;
                            i2 = columnIndexOrThrow2;
                        }
                        int i6 = columnIndexOrThrow;
                        int i21 = columnIndexOrThrow13;
                        zf0.b bVar = new zf0.b(text3, text4, text5, text6, text, (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6), faqListConverter.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7)), sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8), sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9), cVar.d.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10)), sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11), faqListConverter.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12)), sQLiteStatementPrepare.isNull(i21) ? null : sQLiteStatementPrepare.getText(i21));
                        FaqListConverter faqListConverter2 = faqListConverter;
                        int i22 = columnIndexOrThrow14;
                        c cVar2 = cVar;
                        bVar.o(sQLiteStatementPrepare.getLong(i22));
                        arrayList.add(bVar);
                        columnIndexOrThrow13 = i21;
                        cVar = cVar2;
                        columnIndexOrThrow2 = i2;
                        faqListConverter = faqListConverter2;
                        columnIndexOrThrow = i6;
                        columnIndexOrThrow14 = i22;
                        columnIndexOrThrow3 = i;
                        break;
                    }
                    sQLiteStatementPrepare.close();
                    return arrayList;
                } finally {
                }
            default:
                c cVar3 = this.f304744b;
                FaqListConverter faqListConverter3 = cVar3.f304748c;
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM faq WHERE placement NOT LIKE '%.%' AND language = ? ORDER BY placement ASC");
                String str2 = this.f304745c;
                try {
                    if (str2 == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, str2);
                    }
                    int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "key");
                    int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "title");
                    int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "content");
                    int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "plane_content");
                    int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "placement");
                    int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "weight");
                    int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "relatedItems");
                    int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "language");
                    int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "userCountry");
                    int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "actions");
                    int columnIndexOrThrow25 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "specialisationQueue");
                    int columnIndexOrThrow26 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chatEntrySuggestions");
                    int columnIndexOrThrow27 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "contentStyle");
                    int columnIndexOrThrow28 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    ArrayList arrayList2 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow15) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow15);
                        String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow16) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow16);
                        String text9 = sQLiteStatementPrepare.isNull(columnIndexOrThrow17) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow17);
                        String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow18) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow18);
                        if (sQLiteStatementPrepare.isNull(columnIndexOrThrow19)) {
                            text2 = null;
                            i5 = columnIndexOrThrow16;
                            i3 = columnIndexOrThrow17;
                        } else {
                            text2 = sQLiteStatementPrepare.getText(columnIndexOrThrow19);
                            i3 = columnIndexOrThrow17;
                            i5 = columnIndexOrThrow16;
                        }
                        int i32 = columnIndexOrThrow15;
                        int i33 = columnIndexOrThrow27;
                        zf0.b bVar2 = new zf0.b(text7, text8, text9, text10, text2, (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow20), faqListConverter3.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow21) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow21)), sQLiteStatementPrepare.isNull(columnIndexOrThrow22) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow22), sQLiteStatementPrepare.isNull(columnIndexOrThrow23) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow23), cVar3.d.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow24) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow24)), sQLiteStatementPrepare.isNull(columnIndexOrThrow25) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow25), faqListConverter3.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow26) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow26)), sQLiteStatementPrepare.isNull(i33) ? null : sQLiteStatementPrepare.getText(i33));
                        FaqListConverter faqListConverter4 = faqListConverter3;
                        int i43 = columnIndexOrThrow28;
                        c cVar4 = cVar3;
                        bVar2.o(sQLiteStatementPrepare.getLong(i43));
                        arrayList2.add(bVar2);
                        columnIndexOrThrow27 = i33;
                        cVar3 = cVar4;
                        columnIndexOrThrow16 = i5;
                        faqListConverter3 = faqListConverter4;
                        columnIndexOrThrow15 = i32;
                        columnIndexOrThrow28 = i43;
                        columnIndexOrThrow17 = i3;
                        break;
                    }
                    sQLiteStatementPrepare.close();
                    return arrayList2;
                } finally {
                }
        }
    }
}
