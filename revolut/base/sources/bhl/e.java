package bhl;

import androidx.room.RoomDatabase;
import androidx.room.RxRoom;
import androidx.room.util.DBUtil;
import beg.k;
import com.revolut.shared.feature.wealth_discovery.domain.impl.data.database.WealthDiscoveryDomainDatabase;
import efm.d0;
import efm.r;
import java.time.ZonedDateTime;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f15321a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fhl.a f15323c = new fhl.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ark.c f15322b = new ark.c(this, 4);

    public e(WealthDiscoveryDomainDatabase wealthDiscoveryDomainDatabase) {
        this.f15321a = wealthDiscoveryDomainDatabase;
    }

    @Override // bhl.d
    public final d0 a() {
        return RxRoom.createSingle(this.f15321a, true, false, new b9i.f(this, 29));
    }

    @Override // bhl.d
    public final void b(ArrayList arrayList) {
        DBUtil.performBlocking(this.f15321a, false, true, new k(this, arrayList, 10));
    }

    @Override // bhl.d
    public final r c(ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2) {
        b4d.c cVar = new b4d.c(this, 14, zonedDateTime, zonedDateTime2);
        return RxRoom.createObservable(this.f15321a, false, new String[]{"entities_adt"}, cVar);
    }
}
