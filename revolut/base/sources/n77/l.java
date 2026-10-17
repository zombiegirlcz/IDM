package n77;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.feature.global_markets.impl.data.database.GlobalMarketsDatabase;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import n1.y;

/* JADX INFO: loaded from: classes13.dex */
public final class l extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f213025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ao.g f213026b = new ao.g(this, 28);

    public l(GlobalMarketsDatabase globalMarketsDatabase) {
        this.f213025a = globalMarketsDatabase;
    }

    public static /* synthetic */ Unit e(l lVar, ArrayList arrayList) {
        super.c(arrayList);
        return Unit.f186387a;
    }

    @Override // n77.i
    public final List a() {
        return (List) DBUtil.performBlocking(this.f213025a, true, false, new y(this, 26));
    }

    @Override // n77.i
    public final void b() {
        DBUtil.performBlocking(this.f213025a, false, true, new n5k.c(13));
    }

    @Override // n77.i
    public final void c(ArrayList arrayList) {
        DBUtil.performBlocking(this.f213025a, false, true, new j(this, arrayList, 1));
    }

    @Override // n77.i
    public final void d(ArrayList arrayList) {
        DBUtil.performBlocking(this.f213025a, false, true, new j(this, arrayList, 0));
    }
}
