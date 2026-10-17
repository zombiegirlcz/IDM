package mif;

import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.json.Json;
import nif.c3;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f205801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f205802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f205803c;

    public /* synthetic */ i(j jVar, String str, int i) {
        this.f205801a = i;
        this.f205802b = jVar;
        this.f205803c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteStatement sQLiteStatementPrepare;
        SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
        switch (this.f205801a) {
            case 0:
                this.f205802b.getClass();
                sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM transaction_details WHERE group_id=?");
                String str = this.f205803c;
                try {
                    if (str == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, str);
                    }
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "leg_id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "group_id");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "response");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        yhf.v vVar = null;
                        String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                        String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                        if (text3 != null) {
                            Json jsonA = af0.b.a();
                            jsonA.getClass();
                            vVar = (yhf.v) jsonA.b(nlm.a.c(yhf.v.INSTANCE.serializer()), text3);
                        }
                        arrayList.add(new c3(text, text2, vVar));
                        break;
                    }
                    sQLiteStatementPrepare.close();
                    return arrayList;
                } finally {
                }
            default:
                this.f205802b.getClass();
                sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM transaction_details WHERE group_id=?");
                String str2 = this.f205803c;
                try {
                    if (str2 == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, str2);
                    }
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "leg_id");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "group_id");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "response");
                    ArrayList arrayList2 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        yhf.v vVar2 = null;
                        String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                        String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                        String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                        if (text6 != null) {
                            Json jsonA2 = af0.b.a();
                            jsonA2.getClass();
                            vVar2 = (yhf.v) jsonA2.b(nlm.a.c(yhf.v.INSTANCE.serializer()), text6);
                        }
                        arrayList2.add(new c3(text4, text5, vVar2));
                        break;
                    }
                    sQLiteStatementPrepare.close();
                    return arrayList2;
                } finally {
                }
        }
    }
}
