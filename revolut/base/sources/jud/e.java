package jud;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.feature.staking.impl.database.StakingDatabase;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f178654a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jo3.c f178656c = new jo3.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ay1.f f178655b = new ay1.f(this, 10);

    public e(StakingDatabase stakingDatabase) {
        this.f178654a = stakingDatabase;
    }

    public static /* synthetic */ Unit e(e eVar, ArrayList arrayList) {
        super.c(arrayList);
        return Unit.f186387a;
    }

    @Override // jud.b
    public final List a() {
        return (List) DBUtil.performBlocking(this.f178654a, true, false, new d(this, 0));
    }

    @Override // jud.b
    public final void b(ArrayList arrayList) {
        DBUtil.performBlocking(this.f178654a, false, true, new c(this, arrayList, 0));
    }

    @Override // jud.b
    public final void c(ArrayList arrayList) {
        DBUtil.performBlocking(this.f178654a, false, true, new c(this, arrayList, 1));
    }

    @Override // jud.b
    public final void d() {
        DBUtil.performBlocking(this.f178654a, false, true, new jt2.d(5));
    }
}
