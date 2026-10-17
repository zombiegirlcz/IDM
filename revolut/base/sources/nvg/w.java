package nvg;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.feature.wealth.analytics.data.database.WealthAnalyticsDatabase;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final class w extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f219684a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pvg.t f219686c = new pvg.t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f219685b = new c(this, 10);
    public final c d = new c(this, 11);

    public w(WealthAnalyticsDatabase wealthAnalyticsDatabase) {
        this.f219684a = wealthAnalyticsDatabase;
    }

    public static /* synthetic */ Unit e(w wVar, List list, List list2) {
        super.a(list, list2);
        return Unit.f186387a;
    }

    @Override // nvg.u
    public final void a(List list, List list2) {
        DBUtil.performBlocking(this.f219684a, false, true, new neg.q(this, 8, list, list2));
    }

    @Override // nvg.u
    public final void b(List list) {
        list.getClass();
        DBUtil.performBlocking(this.f219684a, false, true, new v(this, list, 1));
    }

    @Override // nvg.u
    public final void c(List list) {
        list.getClass();
        DBUtil.performBlocking(this.f219684a, false, true, new v(this, list, 0));
    }

    @Override // nvg.u
    public final List d(String str, String str2, eel.c cVar, String str3, String str4) {
        return (List) DBUtil.performBlocking(this.f219684a, true, false, new ael.u0(this, str2, cVar, str3, str, str4, 8));
    }
}
