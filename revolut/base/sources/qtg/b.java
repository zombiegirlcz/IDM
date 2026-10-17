package qtg;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.feature.wealth.account_closure.impl.data.database.WealthAccountClosureDatabase;
import ofg.i;
import qc0.w;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f249109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f249110b = new i(10);

    public b(WealthAccountClosureDatabase wealthAccountClosureDatabase) {
        this.f249109a = wealthAccountClosureDatabase;
    }

    @Override // qtg.a
    public final stg.a a(String str) {
        return (stg.a) DBUtil.performBlocking(this.f249109a, true, false, new w(str, 20));
    }

    @Override // qtg.a
    public final void b(stg.a aVar) {
        DBUtil.performBlocking(this.f249109a, false, true, new qpb.a(this, aVar, 10));
    }
}
