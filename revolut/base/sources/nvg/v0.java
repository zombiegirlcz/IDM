package nvg;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.feature.wealth.analytics.data.database.WealthAnalyticsDatabase;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final class v0 extends t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f219681a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pvg.t f219683c = new pvg.t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f219682b = new c(this, 22);
    public final c d = new c(this, 23);

    public v0(WealthAnalyticsDatabase wealthAnalyticsDatabase) {
        this.f219681a = wealthAnalyticsDatabase;
    }

    public static /* synthetic */ Unit e(v0 v0Var, List list, List list2) {
        super.a(list, list2);
        return Unit.f186387a;
    }

    @Override // nvg.t0
    public final void a(List list, List list2) {
        DBUtil.performBlocking(this.f219681a, false, true, new neg.q(this, 12, list, list2));
    }

    @Override // nvg.t0
    public final void b(List list) {
        list.getClass();
        DBUtil.performBlocking(this.f219681a, false, true, new u0(this, list, 1));
    }

    @Override // nvg.t0
    public final void c(List list) {
        list.getClass();
        DBUtil.performBlocking(this.f219681a, false, true, new u0(this, list, 0));
    }

    @Override // nvg.t0
    public final List d(iwg.a aVar, eel.c cVar, String str, String str2, String str3) {
        return (List) DBUtil.performBlocking(this.f219681a, true, false, new ael.u0(this, aVar, cVar, str, str2, str3, 11));
    }
}
