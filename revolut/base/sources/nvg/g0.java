package nvg;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.feature.wealth.analytics.data.database.WealthAnalyticsDatabase;
import java.io.Serializable;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final class g0 extends e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f219616a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b21.a f219618c = new b21.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f219617b = new c(this, 14);
    public final c d = new c(this, 15);

    public g0(WealthAnalyticsDatabase wealthAnalyticsDatabase) {
        this.f219616a = wealthAnalyticsDatabase;
    }

    public static /* synthetic */ Unit e(g0 g0Var, List list, List list2) {
        super.b(list, list2);
        return Unit.f186387a;
    }

    @Override // nvg.e0
    public final void a(List list) {
        list.getClass();
        DBUtil.performBlocking(this.f219616a, false, true, new f0(this, list, 0));
    }

    @Override // nvg.e0
    public final void b(List list, List list2) {
        DBUtil.performBlocking(this.f219616a, false, true, new neg.q(this, 9, list, list2));
    }

    @Override // nvg.e0
    public final void c(List list) {
        list.getClass();
        DBUtil.performBlocking(this.f219616a, false, true, new f0(this, list, 1));
    }

    @Override // nvg.e0
    public final List d(iwg.a aVar, eel.c cVar, String str, iwg.c cVar2, String str2, String str3) {
        return (List) DBUtil.performBlocking(this.f219616a, true, false, new krl.m((Object) this, (Serializable) aVar, (Serializable) cVar, str, (Object) cVar2, (Object) str2, (Object) str3, 2));
    }
}
