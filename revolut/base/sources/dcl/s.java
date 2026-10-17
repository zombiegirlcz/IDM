package dcl;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.shared.feature.wealth.domain.impl.data.database.WealthDomainDatabase;

/* JADX INFO: loaded from: classes12.dex */
public final class s extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f113052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ark.c f113053b = new ark.c(17);

    public s(WealthDomainDatabase wealthDomainDatabase) {
        this.f113052a = wealthDomainDatabase;
    }

    @Override // dcl.r
    public final hcl.q0 a(String str) {
        return (hcl.q0) DBUtil.performBlocking(this.f113052a, true, false, new d7a.p(str, 10));
    }

    @Override // dcl.r
    public final void b(hcl.q0 q0Var) {
        DBUtil.performBlocking(this.f113052a, false, true, new dc4.g(this, q0Var, 16));
    }
}
