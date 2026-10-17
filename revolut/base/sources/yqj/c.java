package yqj;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.retail.feature.impl.budgeting.database.BudgetingDatabase;
import dcl.g0;
import java.util.List;
import kotlin.Unit;
import xwd.o;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f316038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0g.b f316039b = new t0g.b(23);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g0 f316040c = new g0(24);
    public final g0 d = new g0(25);

    public c(BudgetingDatabase budgetingDatabase) {
        this.f316038a = budgetingDatabase;
    }

    public static /* synthetic */ Unit g(c cVar, String str, List list) {
        super.f(str, list);
        return Unit.f186387a;
    }

    @Override // yqj.a
    public final void a(String str) {
        DBUtil.performBlocking(this.f316038a, false, true, new y9d.c(str, 27));
    }

    @Override // yqj.a
    public final int b(String str) {
        return ((Integer) DBUtil.performBlocking(this.f316038a, false, true, new y9d.c(str, 26))).intValue();
    }

    @Override // yqj.a
    public final List c(String str) {
        return (List) DBUtil.performBlocking(this.f316038a, true, false, new y9d.c(str, 28));
    }

    @Override // yqj.a
    public final void d(arj.a aVar) {
        aVar.getClass();
        DBUtil.performBlocking(this.f316038a, false, true, new b(this, aVar, 0));
    }

    @Override // t11.b2
    public final void delete(Object obj2) {
        arj.a aVar = (arj.a) obj2;
        aVar.getClass();
        DBUtil.performBlocking(this.f316038a, false, true, new b(this, aVar, 1));
    }

    @Override // yqj.a
    public final void e(List list) {
        list.getClass();
        DBUtil.performBlocking(this.f316038a, false, true, new yj2.b(this, list, 23));
    }

    @Override // yqj.a
    public final void f(String str, List list) {
        DBUtil.performBlocking(this.f316038a, false, true, new o(this, 25, str, list));
    }

    @Override // t11.b2
    public final int update(Object obj2) {
        arj.a aVar = (arj.a) obj2;
        aVar.getClass();
        return ((Integer) DBUtil.performBlocking(this.f316038a, false, true, new b(this, aVar, 2))).intValue();
    }
}
