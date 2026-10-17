package ipk;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import ao.g;
import com.revolut.retail.feature.ratedetails.impl.database.RatesRoomDatabase;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class e extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f167757a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kpk.a f167759c = new kpk.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f167758b = new g(this, 5);
    public final d d = new d(this, 0);
    public final d e = new d(this, 1);

    public e(RatesRoomDatabase ratesRoomDatabase) {
        this.f167757a = ratesRoomDatabase;
    }

    @Override // ipk.b
    public final List a(String str, String str2, a aVar) {
        return (List) DBUtil.performBlocking(this.f167757a, true, false, new dqd.a(this, str, str2, aVar, 26));
    }

    @Override // ipk.b
    public final void b(f fVar) {
        DBUtil.performBlocking(this.f167757a, false, true, new c(this, fVar, 0));
    }

    @Override // t11.b2
    public final void delete(Object obj2) {
        f fVar = (f) obj2;
        fVar.getClass();
        DBUtil.performBlocking(this.f167757a, false, true, new c(this, fVar, 2));
    }

    @Override // t11.b2
    public final int update(Object obj2) {
        f fVar = (f) obj2;
        fVar.getClass();
        return ((Integer) DBUtil.performBlocking(this.f167757a, false, true, new c(this, fVar, 1))).intValue();
    }
}
