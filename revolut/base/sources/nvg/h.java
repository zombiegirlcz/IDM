package nvg;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.feature.wealth.analytics.data.database.WealthAnalyticsDatabase;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f219619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f219620b = new c(this, 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f219621c = new c(this, 2);
    public final c d = new c(this, 3);

    public h(WealthAnalyticsDatabase wealthAnalyticsDatabase) {
        this.f219619a = wealthAnalyticsDatabase;
    }

    public static /* synthetic */ Unit j(h hVar, pvg.g gVar, List list, List list2) {
        super.d(gVar, list, list2);
        return Unit.f186387a;
    }

    @Override // nvg.e
    public final void a(List list) {
        DBUtil.performBlocking(this.f219619a, false, true, new g(this, list, 0));
    }

    @Override // nvg.e
    public final void b(List list) {
        DBUtil.performBlocking(this.f219619a, false, true, new g(this, list, 1));
    }

    @Override // nvg.e
    public final void c(pvg.g gVar) {
        DBUtil.performBlocking(this.f219619a, false, true, new no.e0(this, gVar, 25));
    }

    @Override // nvg.e
    public final void d(pvg.g gVar, List list, List list2) {
        DBUtil.performBlocking(this.f219619a, false, true, new n68.w(this, gVar, list, list2, 8));
    }

    @Override // nvg.e
    public final pvg.g e(String str, String str2, boolean z) {
        return (pvg.g) DBUtil.performBlocking(this.f219619a, true, false, new f(this, str, z, str2, 2));
    }

    @Override // nvg.e
    public final yhm.r f(String str, String str2, boolean z) {
        return (yhm.r) DBUtil.performBlocking(this.f219619a, false, true, new ard.t(this, str, z, str2, 20));
    }

    @Override // nvg.e
    public final List g(String str, String str2, boolean z) {
        return (List) DBUtil.performBlocking(this.f219619a, true, false, new f(this, str, z, str2, 0));
    }

    @Override // nvg.e
    public final List h(String str, String str2, boolean z) {
        return (List) DBUtil.performBlocking(this.f219619a, true, false, new f(this, str, z, str2, 1));
    }
}
