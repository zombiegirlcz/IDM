package yq9;

import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f315996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f315997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f315998c;

    public /* synthetic */ d(e eVar, String str, int i) {
        this.f315996a = i;
        this.f315997b = eVar;
        this.f315998c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteStatement sQLiteStatementPrepare;
        switch (this.f315996a) {
            case 0:
                this.f315997b.getClass();
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM payments_groups_bills_splits WHERE groupId = ?");
                String str = this.f315998c;
                try {
                    if (str == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, str);
                    }
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "billId");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "groupId");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ownerId");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "amount");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "currencyCode");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "exchangedAmount");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        String text = null;
                        String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                        String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                        String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                        long j2 = sQLiteStatementPrepare.getLong(columnIndexOrThrow5);
                        String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                        if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow7)) {
                            text = sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                        }
                        arrayList.add(new ar9.m(text2, text3, text4, text5, j2, text6, b21.a.g(text)));
                        break;
                    }
                    sQLiteStatementPrepare.close();
                    return arrayList;
                } finally {
                }
            default:
                this.f315997b.getClass();
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM payments_groups_bills_splits WHERE groupId = ?");
                String str2 = this.f315998c;
                try {
                    if (str2 == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, str2);
                    }
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "billId");
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "groupId");
                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ownerId");
                    int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "amount");
                    int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "currencyCode");
                    int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "exchangedAmount");
                    ArrayList arrayList2 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        String text7 = null;
                        String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                        String text9 = sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                        String text10 = sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10);
                        String text11 = sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11);
                        long j3 = sQLiteStatementPrepare.getLong(columnIndexOrThrow12);
                        String text12 = sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13);
                        if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow14)) {
                            text7 = sQLiteStatementPrepare.getText(columnIndexOrThrow14);
                        }
                        arrayList2.add(new ar9.m(text8, text9, text10, text11, j3, text12, b21.a.g(text7)));
                        break;
                    }
                    sQLiteStatementPrepare.close();
                    return arrayList2;
                } finally {
                }
        }
    }
}
