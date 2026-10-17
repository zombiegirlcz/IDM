package yxk;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.retail.feature.trading_onboarding.impl.data.database.TradingOnboardingDatabase;
import kotlin.Unit;
import yuc.p;
import yv8.j;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f317723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0g.b f317724b = new t0g.b(this, 25);

    public c(TradingOnboardingDatabase tradingOnboardingDatabase) {
        this.f317723a = tradingOnboardingDatabase;
    }

    public static /* synthetic */ Unit e(c cVar, byk.b bVar) {
        super.d(bVar);
        return Unit.f186387a;
    }

    @Override // yxk.a
    public final void a() {
        DBUtil.performBlocking(this.f317723a, false, true, new j(21));
    }

    @Override // yxk.a
    public final byk.b b() {
        return (byk.b) DBUtil.performBlocking(this.f317723a, true, false, new p(this, 18));
    }

    @Override // yxk.a
    public final void c(byk.b bVar) {
        DBUtil.performBlocking(this.f317723a, false, true, new b(this, bVar, 1));
    }

    @Override // yxk.a
    public final void d(byk.b bVar) {
        DBUtil.performBlocking(this.f317723a, false, true, new b(this, bVar, 0));
    }
}
