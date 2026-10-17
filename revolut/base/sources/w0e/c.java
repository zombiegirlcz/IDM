package w0e;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.feature.stock_lending.impl.database.StockLendingDatabase;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import vz1.h;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f293685a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b21.a f293687c = new b21.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0g.b f293686b = new t0g.b(this, 10);

    public c(StockLendingDatabase stockLendingDatabase) {
        this.f293685a = stockLendingDatabase;
    }

    public static /* synthetic */ Unit e(c cVar, ArrayList arrayList) {
        super.b(arrayList);
        return Unit.f186387a;
    }

    @Override // w0e.a
    public final void a() {
        DBUtil.performBlocking(this.f293685a, false, true, new h(9));
    }

    @Override // w0e.a
    public final void b(ArrayList arrayList) {
        DBUtil.performBlocking(this.f293685a, false, true, new b(this, arrayList, 0));
    }

    @Override // w0e.a
    public final List c() {
        return (List) DBUtil.performBlocking(this.f293685a, true, false, new vx9.b(this, 21));
    }

    @Override // w0e.a
    public final void d(ArrayList arrayList) {
        DBUtil.performBlocking(this.f293685a, false, true, new b(this, arrayList, 1));
    }
}
