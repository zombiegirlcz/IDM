package yqj;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.retail.feature.impl.budgeting.database.BudgetingDatabase;
import dcl.g0;
import ypd.i;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f316041a;

    public e(BudgetingDatabase budgetingDatabase) {
        this.f316041a = budgetingDatabase;
        new t0g.b(24);
        new g0(26);
        new g0(27);
    }

    @Override // yqj.d
    public final void a() {
        DBUtil.performBlocking(this.f316041a, false, true, new i(10));
    }

    @Override // t11.b2
    public final void delete(Object obj2) {
        throw a10.b.m(obj2);
    }

    @Override // t11.b2
    public final int update(Object obj2) {
        throw a10.b.m(obj2);
    }
}
