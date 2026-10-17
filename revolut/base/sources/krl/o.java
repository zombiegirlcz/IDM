package krl;

import androidx.room.RoomDatabase;
import androidx.room.RoomRawQuery;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SimpleSQLiteQuery;
import com.revolut.trading.orders.data.db.OrdersDatabase;
import dcl.b0;
import is6.x;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes12.dex */
public final class o extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f189009a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rrl.a f189011c = new rrl.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f189010b = new x(this, 5);

    public o(OrdersDatabase ordersDatabase) {
        this.f189009a = ordersDatabase;
    }

    public static /* synthetic */ Unit g(o oVar, k4l.d dVar, ArrayList arrayList, ArrayList arrayList2, Boolean bool, String str, ArrayList arrayList3) {
        super.f(dVar, arrayList, arrayList2, bool, str, arrayList3);
        return Unit.f186387a;
    }

    @Override // krl.l
    public final k a(String str) {
        return (k) DBUtil.performBlocking(this.f189009a, true, false, new n(this, str, 0));
    }

    @Override // krl.l
    public final List b(String str) {
        return (List) DBUtil.performBlocking(this.f189009a, true, false, new n(this, str, 1));
    }

    @Override // krl.l
    public final List c(ArrayList arrayList) {
        StringBuilder sbS = p.a.s("\n            SELECT * FROM `invest_orders`\n            WHERE (`currency_pair_first` IN (");
        int size = arrayList.size();
        StringUtil.appendPlaceholders(sbS, size);
        sbS.append(") OR `currency_pair_second` IN (");
        StringUtil.appendPlaceholders(sbS, arrayList.size());
        sbS.append("))");
        sbS.append("\n");
        sbS.append("        ");
        return (List) DBUtil.performBlocking(this.f189009a, true, false, new c18.c(this, sbS.toString(), arrayList, size, 3));
    }

    @Override // krl.l
    public final int d(SimpleSQLiteQuery simpleSQLiteQuery) {
        RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(simpleSQLiteQuery).toRoomRawQuery();
        return ((Integer) DBUtil.performBlocking(this.f189009a, true, false, new b0(roomRawQuery.getSql(), roomRawQuery, 3))).intValue();
    }

    @Override // krl.l
    public final void e(List list) {
        list.getClass();
        DBUtil.performBlocking(this.f189009a, false, true, new kp0.q(this, list, 5));
    }

    @Override // krl.l
    public final void f(k4l.d dVar, ArrayList arrayList, ArrayList arrayList2, Boolean bool, String str, ArrayList arrayList3) {
        DBUtil.performBlocking(this.f189009a, false, true, new m(this, dVar, arrayList, arrayList2, bool, str, arrayList3));
    }
}
