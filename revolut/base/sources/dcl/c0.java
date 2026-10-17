package dcl;

import androidx.room.RoomDatabase;
import androidx.room.RoomRawQuery;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SimpleSQLiteQuery;
import com.revolut.shared.feature.wealth.domain.impl.data.database.WealthDomainDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;

/* JADX INFO: loaded from: classes12.dex */
public final class c0 extends a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f113006a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qcl.d f113008c = new qcl.d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ark.c f113007b = new ark.c(this, 21);

    public c0(WealthDomainDatabase wealthDomainDatabase) {
        this.f113006a = wealthDomainDatabase;
    }

    public static /* synthetic */ Unit e(c0 c0Var, ArrayList arrayList, ArrayList arrayList2) {
        super.d(arrayList, arrayList2);
        return Unit.f186387a;
    }

    @Override // dcl.a0
    public final int a(SimpleSQLiteQuery simpleSQLiteQuery) {
        RoomRawQuery roomRawQuery = RoomSQLiteQuery.copyFrom(simpleSQLiteQuery).toRoomRawQuery();
        return ((Integer) DBUtil.performBlocking(this.f113006a, true, false, new b0(roomRawQuery.getSql(), roomRawQuery, 0))).intValue();
    }

    @Override // dcl.a0
    public final List b(Set set) {
        StringBuilder sbS = p.a.s("SELECT * FROM instrument_tickers WHERE ref IN (");
        StringUtil.appendPlaceholders(sbS, set.size());
        sbS.append(")");
        return (List) DBUtil.performBlocking(this.f113006a, true, false, new d27.g0(this, 14, sbS.toString(), set));
    }

    @Override // dcl.a0
    public final void c(ArrayList arrayList) {
        DBUtil.performBlocking(this.f113006a, false, true, new dc4.g(this, arrayList, 22));
    }

    @Override // dcl.a0
    public final void d(ArrayList arrayList, ArrayList arrayList2) {
        DBUtil.performBlocking(this.f113006a, false, true, new d27.g0(this, 15, arrayList, arrayList2));
    }
}
