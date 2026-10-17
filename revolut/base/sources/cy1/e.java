package cy1;

import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f110027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f110028c;

    public /* synthetic */ e(g gVar, String str, int i) {
        this.f110026a = i;
        this.f110027b = gVar;
        this.f110028c = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SQLiteStatement sQLiteStatementPrepare;
        switch (this.f110026a) {
            case 0:
                this.f110027b.getClass();
                SQLiteStatement sQLiteStatementPrepare2 = ((SQLiteConnection) obj2).prepare("SELECT * FROM spin_contacts WHERE descriptorValue = ?");
                String str = this.f110028c;
                try {
                    if (str == null) {
                        sQLiteStatementPrepare2.bindNull(1);
                    } else {
                        sQLiteStatementPrepare2.bindText(1, str);
                    }
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "idValue");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "descriptor");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "descriptorValue");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "contactName");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "alias");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "photoUri");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "state");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare2.step()) {
                        arrayList.add(new h(sQLiteStatementPrepare2.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow), sQLiteStatementPrepare2.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow2), sQLiteStatementPrepare2.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow3), sQLiteStatementPrepare2.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow4), sQLiteStatementPrepare2.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow5), sQLiteStatementPrepare2.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow6), sQLiteStatementPrepare2.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow7), g.j(sQLiteStatementPrepare2.getText(columnIndexOrThrow8))));
                        break;
                    }
                    sQLiteStatementPrepare2.close();
                    return arrayList;
                } finally {
                    sQLiteStatementPrepare2.close();
                }
            case 1:
                this.f110027b.getClass();
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM spin_contacts WHERE idValue = ?");
                String str2 = this.f110028c;
                try {
                    if (str2 == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, str2);
                    }
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "idValue");
                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "descriptor");
                    int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "descriptorValue");
                    int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "contactName");
                    int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "alias");
                    int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "photoUri");
                    int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
                    if (sQLiteStatementPrepare.step()) {
                        hVar = new h(sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9), sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10), sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11), sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12), sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13), sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow14), sQLiteStatementPrepare.isNull(columnIndexOrThrow15) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow15), g.j(sQLiteStatementPrepare.getText(columnIndexOrThrow16)));
                    }
                    sQLiteStatementPrepare.close();
                    return hVar;
                } finally {
                }
            default:
                this.f110027b.getClass();
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM spin_contacts WHERE idValue = ?");
                String str3 = this.f110028c;
                try {
                    if (str3 == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, str3);
                    }
                    int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "idValue");
                    int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "descriptor");
                    int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "descriptorValue");
                    int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "contactName");
                    int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "alias");
                    int columnIndexOrThrow23 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "photoUri");
                    int columnIndexOrThrow24 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
                    if (sQLiteStatementPrepare.step()) {
                        hVar = new h(sQLiteStatementPrepare.isNull(columnIndexOrThrow17) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow17), sQLiteStatementPrepare.isNull(columnIndexOrThrow18) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow18), sQLiteStatementPrepare.isNull(columnIndexOrThrow19) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow19), sQLiteStatementPrepare.isNull(columnIndexOrThrow20) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow20), sQLiteStatementPrepare.isNull(columnIndexOrThrow21) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow21), sQLiteStatementPrepare.isNull(columnIndexOrThrow22) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow22), sQLiteStatementPrepare.isNull(columnIndexOrThrow23) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow23), g.j(sQLiteStatementPrepare.getText(columnIndexOrThrow24)));
                    }
                    sQLiteStatementPrepare.close();
                    return hVar;
                } finally {
                }
        }
    }
}
