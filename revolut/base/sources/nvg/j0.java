package nvg;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.feature.wealth.analytics.data.database.WealthAnalyticsDatabase;
import java.util.List;
import kotlin.Unit;
import org.joda.time.Duration;

/* JADX INFO: loaded from: classes9.dex */
public final class j0 extends h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f219629a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pvg.t f219631c = new pvg.t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f219630b = new c(this, 16);
    public final c d = new c(this, 17);

    public j0(WealthAnalyticsDatabase wealthAnalyticsDatabase) {
        this.f219629a = wealthAnalyticsDatabase;
    }

    public static /* synthetic */ Unit e(j0 j0Var, List list, List list2) {
        super.b(list, list2);
        return Unit.f186387a;
    }

    @Override // nvg.h0
    public final void a(List list) {
        list.getClass();
        DBUtil.performBlocking(this.f219629a, false, true, new i0(this, list, 0));
    }

    @Override // nvg.h0
    public final void b(List list, List list2) {
        DBUtil.performBlocking(this.f219629a, false, true, new neg.q(this, 10, list, list2));
    }

    @Override // nvg.h0
    public final void c(List list) {
        DBUtil.performBlocking(this.f219629a, false, true, new i0(this, list, 1));
    }

    @Override // nvg.h0
    public final List d(iwg.a aVar, eel.c cVar, String str, String str2, Duration duration) {
        return (List) DBUtil.performBlocking(this.f219629a, true, false, new ael.u0(this, aVar, cVar, str, str2, duration, 9));
    }
}
