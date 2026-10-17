package nvg;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.feature.wealth.analytics.data.database.WealthAnalyticsDatabase;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final class p extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f219657a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pvg.t f219659c = new pvg.t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f219658b = new c(this, 5);
    public final c d = new c(this, 6);

    public p(WealthAnalyticsDatabase wealthAnalyticsDatabase) {
        this.f219657a = wealthAnalyticsDatabase;
    }

    public static /* synthetic */ Unit e(p pVar, List list, List list2) {
        super.b(list, list2);
        return Unit.f186387a;
    }

    @Override // nvg.n
    public final void a(List list) {
        list.getClass();
        DBUtil.performBlocking(this.f219657a, false, true, new o(this, list, 0));
    }

    @Override // nvg.n
    public final void b(List list, List list2) {
        DBUtil.performBlocking(this.f219657a, false, true, new neg.q(this, 5, list, list2));
    }

    @Override // nvg.n
    public final void c(List list) {
        list.getClass();
        DBUtil.performBlocking(this.f219657a, false, true, new o(this, list, 1));
    }

    @Override // nvg.n
    public final List d(String str, eel.c cVar, String str2, iwg.c cVar2, String str3) {
        return (List) DBUtil.performBlocking(this.f219657a, true, false, new ael.u0(this, str, cVar, str2, cVar2, str3, 7));
    }
}
