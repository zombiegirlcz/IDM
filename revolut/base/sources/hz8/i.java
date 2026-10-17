package hz8;

import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.ArrayList;
import jz8.n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import u09.v;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f157074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f157075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f157076c;

    public /* synthetic */ i(k kVar, v vVar, int i) {
        this.f157074a = i;
        this.f157075b = kVar;
        this.f157076c = vVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteStatement sQLiteStatementPrepare;
        switch (this.f157074a) {
            case 0:
                v domain = this.f157076c;
                gz8.c cVar = this.f157075b.f157080c;
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM glossary_terms WHERE `productDomain` = ?");
                try {
                    Intrinsics.checkNotNullParameter(domain, "domain");
                    String strName = domain.name();
                    if (strName == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, strName);
                    }
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "glossaryItemId");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "term");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "definition");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "productDomain");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "index");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        String text = null;
                        String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                        String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                        if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow4)) {
                            text = sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                        }
                        arrayList.add(new n(text2, text3, text4, gz8.c.b(text), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5)));
                        break;
                    }
                    return arrayList;
                } catch (Throwable th10) {
                    throw th10;
                }
            default:
                v vVar = this.f157076c;
                this.f157075b.getClass();
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("DELETE FROM glossary_terms WHERE `productDomain` = ?");
                try {
                    sQLiteStatementPrepare.bindText(1, k.a(vVar));
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.close();
                    return null;
                } finally {
                    sQLiteStatementPrepare.close();
                }
        }
    }
}
