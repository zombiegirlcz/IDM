package jud;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.feature.staking.impl.database.StakingDatabase;
import is6.x;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f178659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f178660b = new x(4);

    public i(StakingDatabase stakingDatabase) {
        this.f178659a = stakingDatabase;
    }

    @Override // jud.h
    public final nud.a a(String str) {
        return (nud.a) DBUtil.performBlocking(this.f178659a, true, false, new jb8.a(str, 12));
    }

    @Override // jud.h
    public final void b(nud.a aVar) {
        DBUtil.performBlocking(this.f178659a, false, true, new jp3.b(this, aVar, 18));
    }
}
