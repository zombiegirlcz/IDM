package nvg;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.feature.wealth.analytics.data.database.WealthAnalyticsDatabase;
import java.util.List;
import jel.a3;
import kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final class p0 extends n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f219660a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b21.a f219662c = new b21.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f219661b = new c(this, 19);
    public final c d = new c(this, 20);

    public p0(WealthAnalyticsDatabase wealthAnalyticsDatabase) {
        this.f219660a = wealthAnalyticsDatabase;
    }

    public static /* synthetic */ Unit e(p0 p0Var, List list, List list2) {
        super.c(list, list2);
        return Unit.f186387a;
    }

    @Override // nvg.n0
    public final void a(List list) {
        DBUtil.performBlocking(this.f219660a, false, true, new o0(this, list, 0));
    }

    @Override // nvg.n0
    public final void b(List list) {
        list.getClass();
        DBUtil.performBlocking(this.f219660a, false, true, new o0(this, list, 1));
    }

    @Override // nvg.n0
    public final void c(List list, List list2) {
        DBUtil.performBlocking(this.f219660a, false, true, new neg.q(this, 11, list, list2));
    }

    @Override // nvg.n0
    public final List d(iwg.a aVar, a3 a3Var, String str) {
        return (List) DBUtil.performBlocking(this.f219660a, true, false, new n68.w(this, aVar, a3Var, str, 13));
    }
}
