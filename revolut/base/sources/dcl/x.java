package dcl;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.shared.feature.wealth.domain.impl.data.database.WealthDomainDatabase;

/* JADX INFO: loaded from: classes12.dex */
public final class x extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f113065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ark.c f113066b = new ark.c(this, 19);

    public x(WealthDomainDatabase wealthDomainDatabase) {
        this.f113065a = wealthDomainDatabase;
    }

    @Override // dcl.w
    public final hcl.m0 a(String str) {
        return (hcl.m0) DBUtil.performBlocking(this.f113065a, true, false, new dc4.g(this, str, 18));
    }

    @Override // dcl.w
    public final void b(hcl.m0 m0Var) {
        DBUtil.performBlocking(this.f113065a, false, true, new dc4.g(this, m0Var, 19));
    }
}
