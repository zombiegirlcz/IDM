package n77;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.feature.global_markets.impl.data.database.GlobalMarketsDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class e extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f213012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ao.g f213013b = new ao.g(27);

    public e(GlobalMarketsDatabase globalMarketsDatabase) {
        this.f213012a = globalMarketsDatabase;
    }

    @Override // n77.d
    public final f a(String str) {
        return (f) DBUtil.performBlocking(this.f213012a, true, false, new mll.h(str, 19));
    }

    @Override // n77.d
    public final void b(f fVar) {
        DBUtil.performBlocking(this.f213012a, false, true, new n45.b(this, fVar, 16));
    }
}
