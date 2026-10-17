package nvg;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import com.revolut.feature.wealth.analytics.data.database.WealthAnalyticsDatabase;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final class d0 extends a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f219605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f219606b = new c(this, 13);

    public d0(WealthAnalyticsDatabase wealthAnalyticsDatabase) {
        this.f219605a = wealthAnalyticsDatabase;
    }

    public static /* synthetic */ Unit f(d0 d0Var, ArrayList arrayList) {
        super.c(arrayList);
        return Unit.f186387a;
    }

    @Override // nvg.a0
    public final void a(eel.c cVar, String str, String str2, String str3) {
        DBUtil.performBlocking(this.f219605a, false, true, new n68.w(this, cVar, str, str2, str3));
    }

    @Override // nvg.a0
    public final void b(ArrayList arrayList) {
        DBUtil.performBlocking(this.f219605a, false, true, new c0(this, arrayList, 1));
    }

    @Override // nvg.a0
    public final void c(ArrayList arrayList) {
        DBUtil.performBlocking(this.f219605a, false, true, new c0(this, arrayList, 0));
    }

    @Override // nvg.a0
    public final List d(eel.c cVar, String str, List list) {
        StringBuilder sbS = p.a.s("\n        SELECT * FROM complex_analytics_dividends\n        WHERE time_span = ?\n          AND currency = ?\n          AND portfolio_id = ?\n          AND ((? IS NULL AND account_types IS NULL) OR account_types = ?)\n          AND ref IN (");
        StringUtil.appendPlaceholders(sbS, list.size());
        sbS.append(")");
        sbS.append("\n");
        sbS.append("        ");
        return (List) DBUtil.performBlocking(this.f219605a, true, false, new n68.w(this, sbS.toString(), cVar, str, list));
    }

    @Override // nvg.a0
    public final List e(eel.c cVar, String str) {
        return (List) DBUtil.performBlocking(this.f219605a, true, false, new b0(this, cVar, str, 0));
    }
}
