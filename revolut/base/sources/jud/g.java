package jud;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.feature.staking.impl.database.StakingDatabase;
import is6.x;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f178657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f178658b = new x(this, 3);

    public g(StakingDatabase stakingDatabase) {
        this.f178657a = stakingDatabase;
    }

    @Override // jud.f
    public final void a(mud.b bVar) {
        DBUtil.performBlocking(this.f178657a, false, true, new jp3.b(this, bVar, 17));
    }

    @Override // jud.f
    public final mud.b b(String str) {
        return (mud.b) DBUtil.performBlocking(this.f178657a, true, false, new jp3.b(this, str, 16));
    }
}
