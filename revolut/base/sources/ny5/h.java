package ny5;

import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.core.ui_kit.models.Clause;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Instant;
import v30.c0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f220672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f220673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f220674c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f220675g;

    public /* synthetic */ h(i iVar, Clause clause, Clause clause2, gw5.a aVar, int i, List list) {
        this.f220672a = 0;
        this.d = iVar;
        this.e = clause;
        this.f = clause2;
        this.f220675g = aVar;
        this.f220674c = i;
        this.f220673b = list;
    }

    /* JADX WARN: Finally extract failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f220672a) {
            case 0:
                i iVar = (i) this.d;
                Clause clause = (Clause) this.e;
                Clause clause2 = (Clause) this.f;
                gw5.a aVar = (gw5.a) this.f220675g;
                cw5.a ratesItems = (cw5.a) obj2;
                Intrinsics.checkNotNullParameter(ratesItems, "ratesItems");
                return gw5.b.a(iVar.i, clause, clause2, ratesItems, aVar, this.f220674c, null, "RatesListSubheader", this.f220673b, null, null, null, 7680);
            case 1:
                String str = (String) this.d;
                c0 c0Var = (c0) this.e;
                List<String> list = this.f220673b;
                int i = this.f220674c;
                Instant instant = (Instant) this.f;
                Instant instant2 = (Instant) this.f220675g;
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare(str);
                try {
                    String strA = s10.a.a(c0Var);
                    if (strA == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, strA);
                    }
                    int i2 = 2;
                    for (String str2 : list) {
                        if (str2 == null) {
                            sQLiteStatementPrepare.bindNull(i2);
                        } else {
                            sQLiteStatementPrepare.bindText(i2, str2);
                        }
                        i2++;
                    }
                    int i3 = i + 2;
                    String strB = s10.a.b(instant);
                    if (strB == null) {
                        sQLiteStatementPrepare.bindNull(i3);
                    } else {
                        sQLiteStatementPrepare.bindText(i3, strB);
                    }
                    int i5 = i + 3;
                    String strB2 = s10.a.b(instant2);
                    if (strB2 == null) {
                        sQLiteStatementPrepare.bindNull(i5);
                    } else {
                        sQLiteStatementPrepare.bindText(i5, strB2);
                    }
                    sQLiteStatementPrepare.bindLong(i + 4, 100);
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createdAt");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "chatId");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "data");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "feedType");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ticketCreatedAt");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "feedId");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "serverId");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "uploadType");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList.add(new u10.i(s10.a.h(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow)), s10.a.e(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2)), s10.a.h(sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3)), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), s10.a.d(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5)), s10.a.e(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6)), s10.a.h(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7)), s10.a.h(sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8)), sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9)));
                        break;
                    }
                    sQLiteStatementPrepare.close();
                    return arrayList;
                } catch (Throwable th10) {
                    sQLiteStatementPrepare.close();
                    throw th10;
                }
            default:
                String str3 = (String) this.d;
                UUID uuid = (UUID) this.e;
                List<String> list2 = this.f220673b;
                int i6 = this.f220674c;
                Instant instant3 = (Instant) this.f;
                Instant instant4 = (Instant) this.f220675g;
                SQLiteStatement sQLiteStatementPrepare2 = ((SQLiteConnection) obj2).prepare(str3);
                try {
                    String strC = s10.a.c(uuid);
                    if (strC == null) {
                        sQLiteStatementPrepare2.bindNull(1);
                    } else {
                        sQLiteStatementPrepare2.bindText(1, strC);
                    }
                    int i21 = 2;
                    for (String str4 : list2) {
                        if (str4 == null) {
                            sQLiteStatementPrepare2.bindNull(i21);
                        } else {
                            sQLiteStatementPrepare2.bindText(i21, str4);
                        }
                        i21++;
                    }
                    int i22 = i6 + 2;
                    String strB3 = s10.a.b(instant3);
                    if (strB3 == null) {
                        sQLiteStatementPrepare2.bindNull(i22);
                    } else {
                        sQLiteStatementPrepare2.bindText(i22, strB3);
                    }
                    int i32 = i6 + 3;
                    String strB4 = s10.a.b(instant4);
                    if (strB4 == null) {
                        sQLiteStatementPrepare2.bindNull(i32);
                    } else {
                        sQLiteStatementPrepare2.bindText(i32, strB4);
                    }
                    sQLiteStatementPrepare2.bindLong(i6 + 4, 100);
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "id");
                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "createdAt");
                    int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "chatId");
                    int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "data");
                    int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "feedType");
                    int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "ticketCreatedAt");
                    int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "feedId");
                    int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "serverId");
                    int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "uploadType");
                    ArrayList arrayList2 = new ArrayList();
                    while (sQLiteStatementPrepare2.step()) {
                        arrayList2.add(new u10.i(s10.a.h(sQLiteStatementPrepare2.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow10)), s10.a.e(sQLiteStatementPrepare2.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow11)), s10.a.h(sQLiteStatementPrepare2.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow12)), sQLiteStatementPrepare2.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow13), s10.a.d(sQLiteStatementPrepare2.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow14)), s10.a.e(sQLiteStatementPrepare2.isNull(columnIndexOrThrow15) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow15)), s10.a.h(sQLiteStatementPrepare2.isNull(columnIndexOrThrow16) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow16)), s10.a.h(sQLiteStatementPrepare2.isNull(columnIndexOrThrow17) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow17)), sQLiteStatementPrepare2.isNull(columnIndexOrThrow18) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow18)));
                        break;
                    }
                    sQLiteStatementPrepare2.close();
                    return arrayList2;
                } catch (Throwable th11) {
                    sQLiteStatementPrepare2.close();
                    throw th11;
                }
        }
    }

    public /* synthetic */ h(r10.r rVar, String str, Object obj2, List list, int i, Instant instant, Instant instant2, int i2) {
        this.f220672a = i2;
        this.d = str;
        this.e = obj2;
        this.f220673b = list;
        this.f220674c = i;
        this.f = instant;
        this.f220675g = instant2;
    }
}
