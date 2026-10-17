package nvg;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.feature.wealth.analytics.data.database.WealthAnalyticsDatabase;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final class m0 extends k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f219648a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b21.a f219650c = new b21.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f219649b = new c(this, 18);

    public m0(WealthAnalyticsDatabase wealthAnalyticsDatabase) {
        this.f219648a = wealthAnalyticsDatabase;
    }

    public static /* synthetic */ Unit e(m0 m0Var, ArrayList arrayList) {
        super.c(arrayList);
        return Unit.f186387a;
    }

    @Override // nvg.k0
    public final void a(iwg.a aVar, eel.c cVar, String str, String str2) {
        DBUtil.performBlocking(this.f219648a, false, true, new n68.w(this, aVar, cVar, str, str2));
    }

    @Override // nvg.k0
    public final void b(ArrayList arrayList) {
        DBUtil.performBlocking(this.f219648a, false, true, new l0(this, arrayList, 1));
    }

    @Override // nvg.k0
    public final void c(ArrayList arrayList) {
        DBUtil.performBlocking(this.f219648a, false, true, new l0(this, arrayList, 0));
    }

    @Override // nvg.k0
    public final List d(iwg.a aVar, eel.c cVar, String str, String str2) {
        return (List) DBUtil.performBlocking(this.f219648a, true, false, new kwg.e(this, aVar, cVar, str, str2));
    }
}
