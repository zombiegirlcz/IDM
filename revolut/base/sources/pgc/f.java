package pgc;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.feature.rewards.impl.data.database.RewardsDatabase;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import pfk.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f235868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ofg.i f235869b = new ofg.i(7);

    public f(RewardsDatabase rewardsDatabase) {
        this.f235868a = rewardsDatabase;
    }

    public static /* synthetic */ Unit e(f fVar, ArrayList arrayList) {
        super.b(arrayList);
        return Unit.f186387a;
    }

    @Override // pgc.d
    public final void a() {
        DBUtil.performBlocking(this.f235868a, false, true, new h0(14));
    }

    @Override // pgc.d
    public final void b(ArrayList arrayList) {
        DBUtil.performBlocking(this.f235868a, false, true, new e(this, arrayList, 0));
    }

    @Override // pgc.d
    public final List c() {
        return (List) DBUtil.performBlocking(this.f235868a, true, false, new h0(13));
    }

    @Override // pgc.d
    public final void d(ArrayList arrayList) {
        DBUtil.performBlocking(this.f235868a, false, true, new e(this, arrayList, 1));
    }
}
