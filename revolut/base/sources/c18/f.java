package c18;

import a82.r;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.revolut.feature.invest.smart_notifications.impl.data.database.SmartNotificationsDatabase;
import e18.l;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rlm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f20424a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f18.b f20426c = new f18.b();
    public final f18.c d = new f18.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f20425b = new e(this, 0);
    public final e e = new e(this, 1);

    public f(SmartNotificationsDatabase smartNotificationsDatabase) {
        this.f20424a = smartNotificationsDatabase;
    }

    public static /* synthetic */ Unit h(f fVar, ArrayList arrayList) {
        super.a(arrayList);
        return Unit.f186387a;
    }

    public static /* synthetic */ Unit i(f fVar, ArrayList arrayList) {
        super.g(arrayList);
        return Unit.f186387a;
    }

    @Override // c18.a
    public final void a(ArrayList arrayList) {
        DBUtil.performBlocking(this.f20424a, false, true, new b(this, arrayList, 0));
    }

    @Override // c18.a
    public final void b(long j2) {
        DBUtil.performBlocking(this.f20424a, false, true, new r(j2, 6));
    }

    @Override // c18.a
    public final List c(final int i, final Instant instant, final ArrayList arrayList, final boolean z) {
        StringBuilder sbS = p.a.s("\n            SELECT DISTINCT feed.* FROM smart_notification_feed AS feed\n                LEFT JOIN feed_asset_types AS types ON feed.id = types.feedId\n                WHERE \n                    (? IS NULL OR feed.date < ?)\n                    AND (? = 1 OR types.type IN (");
        final int size = arrayList.size();
        StringUtil.appendPlaceholders(sbS, size);
        sbS.append("))");
        sbS.append("\n");
        sbS.append("                ORDER BY feed.date DESC");
        j6.a.D(sbS, "\n", "            LIMIT ", "?", "\n");
        sbS.append("        ");
        final String string = sbS.toString();
        return (List) DBUtil.performBlocking(this.f20424a, true, false, new Function1() { // from class: c18.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Instant instant2 = instant;
                boolean z3 = z;
                ArrayList<e18.b> arrayList2 = arrayList;
                int i2 = size;
                int i3 = i;
                f fVar = this.f20418a;
                f18.b bVar = fVar.f20426c;
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare(string);
                try {
                    Long lD = b21.a.d(instant2);
                    if (lD == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindLong(1, lD.longValue());
                    }
                    Long lD2 = b21.a.d(instant2);
                    if (lD2 == null) {
                        sQLiteStatementPrepare.bindNull(2);
                    } else {
                        sQLiteStatementPrepare.bindLong(2, lD2.longValue());
                    }
                    sQLiteStatementPrepare.bindLong(3, z3 ? 1L : 0L);
                    int i5 = 4;
                    for (e18.b assetFilter : arrayList2) {
                        bVar.getClass();
                        Intrinsics.checkNotNullParameter(assetFilter, "assetFilter");
                        o oVar = bVar.f131179a;
                        oVar.getClass();
                        sQLiteStatementPrepare.bindText(i5, oVar.c(e18.b.Companion.serializer(), assetFilter));
                        i5++;
                    }
                    sQLiteStatementPrepare.bindLong(i2 + 4, i3);
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "date");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "title");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "subtitle");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ref");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "assetType");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "priceImpact");
                    ArrayList arrayList3 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        l lVar = null;
                        String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        Instant instantJ = b21.a.j(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow2)));
                        String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                        bVar.getClass();
                        e18.f fVarB = f18.b.b(text2);
                        String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                        String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                        String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                        List listA = bVar.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7));
                        String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                        f18.c cVar = fVar.d;
                        if (text6 != null) {
                            lVar = (l) cVar.f131180a.b(l.Companion.serializer(), text6);
                        } else {
                            cVar.getClass();
                        }
                        arrayList3.add(new e18.e(text, instantJ, fVarB, text3, text4, text5, listA, lVar));
                    }
                    sQLiteStatementPrepare.close();
                    return arrayList3;
                } catch (Throwable th10) {
                    sQLiteStatementPrepare.close();
                    throw th10;
                }
            }
        });
    }

    @Override // c18.a
    public final List d(int i, String str, Instant instant) {
        return (List) DBUtil.performBlocking(this.f20424a, true, false, new c(this, str, instant, i, 0));
    }

    @Override // c18.a
    public final void e(ArrayList arrayList) {
        DBUtil.performBlocking(this.f20424a, false, true, new b(this, arrayList, 1));
    }

    @Override // c18.a
    public final void f(ArrayList arrayList) {
        DBUtil.performBlocking(this.f20424a, false, true, new b(this, arrayList, 2));
    }

    @Override // c18.a
    public final void g(ArrayList arrayList) {
        DBUtil.performBlocking(this.f20424a, false, true, new b(this, arrayList, 3));
    }
}
