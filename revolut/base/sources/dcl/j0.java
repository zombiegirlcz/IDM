package dcl;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.shared.feature.wealth.domain.impl.data.database.WealthDomainDatabase;

/* JADX INFO: loaded from: classes12.dex */
public final class j0 extends i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f113028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ark.c f113029b = new ark.c(this, 25);

    public j0(WealthDomainDatabase wealthDomainDatabase) {
        this.f113028a = wealthDomainDatabase;
    }

    @Override // dcl.i0
    public final hcl.i0 a(String str) {
        return (hcl.i0) DBUtil.performBlocking(this.f113028a, true, false, new dc4.g(this, str, 26));
    }

    @Override // dcl.i0
    public final void b(hcl.i0 i0Var) {
        DBUtil.performBlocking(this.f113028a, false, true, new dc4.g(this, i0Var, 25));
    }
}
