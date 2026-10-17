package nvg;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.feature.wealth.analytics.data.database.WealthAnalyticsDatabase;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final class r extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f219663a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pvg.t f219665c = new pvg.t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f219664b = new c(this, 7);
    public final c d = new c(this, 8);

    public r(WealthAnalyticsDatabase wealthAnalyticsDatabase) {
        this.f219663a = wealthAnalyticsDatabase;
    }

    public static /* synthetic */ Unit e(r rVar, pvg.m mVar, List list) {
        super.b(mVar, list);
        return Unit.f186387a;
    }

    @Override // nvg.q
    public final void a(pvg.m mVar) {
        DBUtil.performBlocking(this.f219663a, false, true, new no.e0(this, mVar, 27));
    }

    @Override // nvg.q
    public final void b(pvg.m mVar, List list) {
        DBUtil.performBlocking(this.f219663a, false, true, new neg.q(this, 6, mVar, list));
    }

    @Override // nvg.q
    public final void c(List list) {
        DBUtil.performBlocking(this.f219663a, false, true, new no.e0(this, list, 28));
    }

    @Override // nvg.q
    public final List d(eel.c cVar, String str, String str2, String str3) {
        return (List) DBUtil.performBlocking(this.f219663a, true, false, new kwg.e(this, str2, cVar, str3, str));
    }
}
