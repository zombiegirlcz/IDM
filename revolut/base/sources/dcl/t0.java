package dcl;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.shared.feature.wealth.domain.impl.data.database.WealthDomainDatabase;
import hcl.t2;

/* JADX INFO: loaded from: classes12.dex */
public final class t0 extends r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f113055a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qcl.q f113057c = new qcl.q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s0 f113056b = new s0(this, 0);

    public t0(WealthDomainDatabase wealthDomainDatabase) {
        this.f113055a = wealthDomainDatabase;
    }

    @Override // dcl.r0
    public final t2 a(String str) {
        return (t2) DBUtil.performBlocking(this.f113055a, true, false, new m0(this, str, 5));
    }

    @Override // dcl.r0
    public final void b(t2 t2Var) {
        DBUtil.performBlocking(this.f113055a, false, true, new m0(this, t2Var, 4));
    }
}
