package nvg;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.feature.wealth.analytics.data.database.WealthAnalyticsDatabase;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final class z extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f219693a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b21.a f219695c = new b21.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f219694b = new c(this, 12);

    public z(WealthAnalyticsDatabase wealthAnalyticsDatabase) {
        this.f219693a = wealthAnalyticsDatabase;
    }

    public static /* synthetic */ Unit e(z zVar, ArrayList arrayList) {
        super.c(arrayList);
        return Unit.f186387a;
    }

    @Override // nvg.x
    public final void a(iwg.a aVar, eel.c cVar, iwg.c cVar2, boolean z, String str, String str2) {
        DBUtil.performBlocking(this.f219693a, false, true, new kce.e(this, aVar, cVar, cVar2, z, str, str2));
    }

    @Override // nvg.x
    public final void b(ArrayList arrayList) {
        DBUtil.performBlocking(this.f219693a, false, true, new y(this, arrayList, 0));
    }

    @Override // nvg.x
    public final void c(ArrayList arrayList) {
        DBUtil.performBlocking(this.f219693a, false, true, new y(this, arrayList, 1));
    }

    @Override // nvg.x
    public final List d(iwg.a aVar, eel.c cVar, iwg.c cVar2, boolean z, String str, String str2) {
        return (List) DBUtil.performBlocking(this.f219693a, true, false, new l(this, aVar, cVar, cVar2, z, str, str2));
    }
}
