package nvg;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.feature.wealth.analytics.data.database.WealthAnalyticsDatabase;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final class t extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f219672a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b21.a f219674c = new b21.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f219673b = new c(this, 9);

    public t(WealthAnalyticsDatabase wealthAnalyticsDatabase) {
        this.f219672a = wealthAnalyticsDatabase;
    }

    public static /* synthetic */ Unit e(t tVar, ArrayList arrayList, String str, eel.c cVar, String str2) {
        super.c(arrayList, str, cVar, str2);
        return Unit.f186387a;
    }

    @Override // nvg.s
    public final void a(String str, eel.c cVar, String str2) {
        DBUtil.performBlocking(this.f219672a, false, true, new neg.q(this, str, cVar, str2));
    }

    @Override // nvg.s
    public final void b(ArrayList arrayList) {
        DBUtil.performBlocking(this.f219672a, false, true, new no.e0(this, arrayList, 29));
    }

    @Override // nvg.s
    public final void c(ArrayList arrayList, String str, eel.c cVar, String str2) {
        DBUtil.performBlocking(this.f219672a, false, true, new kwg.e(this, arrayList, str, cVar, str2, 11));
    }

    @Override // nvg.s
    public final List d(String str, eel.c cVar, String str2) {
        return (List) DBUtil.performBlocking(this.f219672a, true, false, new n68.w((Object) this, str, (Serializable) cVar, (Object) str2, 9));
    }
}
