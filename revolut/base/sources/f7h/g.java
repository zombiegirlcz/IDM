package f7h;

import androidx.room.RoomDatabase;
import androidx.room.RoomRawQuery;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SimpleSQLiteQuery;
import com.revolut.feature.wealth.impl.data.database.WealthDatabase;
import dcl.b0;
import dcl.s0;
import eed.i;
import f0d.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import xzg.o;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f132621a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f132623c = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s0 f132622b = new s0(this, 6);

    public g(WealthDatabase wealthDatabase) {
        this.f132621a = wealthDatabase;
    }

    public static /* synthetic */ Unit e(g gVar, ArrayList arrayList, o oVar) {
        super.d(arrayList, oVar);
        return Unit.f186387a;
    }

    @Override // f7h.f
    public final List a(o oVar) {
        return (List) DBUtil.performBlocking(this.f132621a, true, false, new l(this, oVar, 9));
    }

    @Override // f7h.f
    public final void b(ArrayList arrayList) {
        DBUtil.performBlocking(this.f132621a, false, true, new l(this, arrayList, 10));
    }

    @Override // f7h.f
    public final int c(SimpleSQLiteQuery simpleSQLiteQuery) {
        RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(simpleSQLiteQuery).toRoomRawQuery();
        return ((Integer) DBUtil.performBlocking(this.f132621a, true, false, new b0(roomRawQuery.getSql(), roomRawQuery, 1))).intValue();
    }

    @Override // f7h.f
    public final void d(ArrayList arrayList, o oVar) {
        DBUtil.performBlocking(this.f132621a, false, true, new i(this, 13, arrayList, oVar));
    }
}
