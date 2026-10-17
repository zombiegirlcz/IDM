package pgc;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.feature.rewards.impl.data.database.RewardsDatabase;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import pb2.v;
import pfk.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f235863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ofg.i f235864b = new ofg.i(this, 6);

    public c(RewardsDatabase rewardsDatabase) {
        this.f235863a = rewardsDatabase;
    }

    public static /* synthetic */ Unit e(c cVar, ArrayList arrayList) {
        super.b(arrayList);
        return Unit.f186387a;
    }

    @Override // pgc.a
    public final void a() {
        DBUtil.performBlocking(this.f235863a, false, true, new h0(12));
    }

    @Override // pgc.a
    public final void b(ArrayList arrayList) {
        DBUtil.performBlocking(this.f235863a, false, true, new b(this, arrayList, 0));
    }

    @Override // pgc.a
    public final List c() {
        return (List) DBUtil.performBlocking(this.f235863a, true, false, new v(this, 16));
    }

    @Override // pgc.a
    public final void d(ArrayList arrayList) {
        DBUtil.performBlocking(this.f235863a, false, true, new b(this, arrayList, 1));
    }
}
