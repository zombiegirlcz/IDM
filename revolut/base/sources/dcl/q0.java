package dcl;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.shared.feature.wealth.domain.impl.data.database.WealthDomainDatabase;
import hcl.x1;

/* JADX INFO: loaded from: classes12.dex */
public final class q0 extends p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f113050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ark.c f113051b = new ark.c(this, 29);

    public q0(WealthDomainDatabase wealthDomainDatabase) {
        this.f113050a = wealthDomainDatabase;
    }

    @Override // dcl.p0
    public final x1 a(String str) {
        return (x1) DBUtil.performBlocking(this.f113050a, true, false, new m0(this, str, 3));
    }

    @Override // dcl.p0
    public final void b(x1 x1Var) {
        DBUtil.performBlocking(this.f113050a, false, true, new m0(this, x1Var, 2));
    }
}
