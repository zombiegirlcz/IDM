package nvg;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.feature.wealth.analytics.data.database.WealthAnalyticsDatabase;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f219602a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pvg.t f219604c = new pvg.t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final is6.x f219603b = new is6.x(this, 28);
    public final is6.x d = new is6.x(this, 29);
    public final c e = new c(this, 0);

    public d(WealthAnalyticsDatabase wealthAnalyticsDatabase) {
        this.f219602a = wealthAnalyticsDatabase;
    }

    public static /* synthetic */ Unit f(d dVar, List list, List list2, List list3) {
        super.d(list, list2, list3);
        return Unit.f186387a;
    }

    @Override // nvg.a
    public final void a(List list) {
        DBUtil.performBlocking(this.f219602a, false, true, new b(this, list, 1));
    }

    @Override // nvg.a
    public final void b(List list) {
        DBUtil.performBlocking(this.f219602a, false, true, new b(this, list, 2));
    }

    @Override // nvg.a
    public final void c(List list) {
        list.getClass();
        DBUtil.performBlocking(this.f219602a, false, true, new b(this, list, 0));
    }

    @Override // nvg.a
    public final void d(List list, List list2, List list3) {
        DBUtil.performBlocking(this.f219602a, false, true, new n68.w(this, list, list2, list3, 7));
    }

    @Override // nvg.a
    public final List e(iwg.a aVar, boolean z, String str, String str2) {
        return (List) DBUtil.performBlocking(this.f219602a, true, false, new ael.s(this, aVar, z, str, str2, 7));
    }
}
