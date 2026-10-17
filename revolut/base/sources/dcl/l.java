package dcl;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.shared.feature.wealth.domain.impl.data.database.WealthDomainDatabase;

/* JADX INFO: loaded from: classes12.dex */
public final class l extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f113030a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qcl.h f113032c = new qcl.h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ark.c f113031b = new ark.c(this, 13);

    public l(WealthDomainDatabase wealthDomainDatabase) {
        this.f113030a = wealthDomainDatabase;
    }

    @Override // dcl.k
    public final hcl.t a(String str) {
        return (hcl.t) DBUtil.performBlocking(this.f113030a, true, false, new dc4.g(this, str, 12));
    }

    @Override // dcl.k
    public final void b(hcl.t tVar) {
        DBUtil.performBlocking(this.f113030a, false, true, new dc4.g(this, tVar, 11));
    }
}
