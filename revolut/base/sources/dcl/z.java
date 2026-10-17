package dcl;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.shared.feature.wealth.domain.impl.data.database.WealthDomainDatabase;

/* JADX INFO: loaded from: classes12.dex */
public final class z extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f113072a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qcl.k f113074c = new qcl.k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ark.c f113073b = new ark.c(this, 20);

    public z(WealthDomainDatabase wealthDomainDatabase) {
        this.f113072a = wealthDomainDatabase;
    }

    @Override // dcl.y
    public final hcl.s0 a(String str) {
        return (hcl.s0) DBUtil.performBlocking(this.f113072a, true, false, new dc4.g(this, str, 21));
    }

    @Override // dcl.y
    public final void b(hcl.s0 s0Var) {
        DBUtil.performBlocking(this.f113072a, false, true, new dc4.g(this, s0Var, 20));
    }
}
