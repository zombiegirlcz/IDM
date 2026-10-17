package wxf;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.feature.travel.common.impl.database.TravelDatabase;
import s7a.l0;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f300936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0g.b f300937b = new t0g.b(14);

    public e(TravelDatabase travelDatabase) {
        this.f300936a = travelDatabase;
    }

    @Override // wxf.d
    public final qxf.a a(String str, String str2) {
        return (qxf.a) DBUtil.performBlocking(this.f300936a, true, false, new l0(str, str2, 4));
    }

    @Override // wxf.d
    public final void b(qxf.a aVar) {
        DBUtil.performBlocking(this.f300936a, false, true, new wwa.a(this, aVar, 6));
    }
}
