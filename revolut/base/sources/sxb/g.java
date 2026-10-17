package sxb;

import androidx.room.RoomDatabase;
import androidx.room.RxRoom;
import androidx.room.util.DBUtil;
import com.revolut.feature.rev_points.impl.data.storage.database.RevPointsDatabase;
import efm.k;
import ofg.i;
import sx2.h;
import vxb.d0;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f266413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f266414b = new i(29);

    public g(RevPointsDatabase revPointsDatabase) {
        this.f266413a = revPointsDatabase;
    }

    @Override // sxb.f
    public final k a() {
        return RxRoom.createMaybe(this.f266413a, true, false, new sx2.g(11));
    }

    @Override // sxb.f
    public final void b(d0 d0Var) {
        DBUtil.performBlocking(this.f266413a, false, true, new h(this, d0Var, 5));
    }
}
