package dcl;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.shared.feature.wealth.domain.impl.data.database.WealthDomainDatabase;

/* JADX INFO: loaded from: classes12.dex */
public final class h extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f113020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ark.c f113021b = new ark.c(this, 11);

    public h(WealthDomainDatabase wealthDomainDatabase) {
        this.f113020a = wealthDomainDatabase;
    }

    @Override // dcl.g
    public final hcl.m a(String str) {
        return (hcl.m) DBUtil.performBlocking(this.f113020a, true, false, new dc4.g(this, str, 8));
    }

    @Override // dcl.g
    public final void b(hcl.m mVar) {
        DBUtil.performBlocking(this.f113020a, false, true, new dc4.g(this, mVar, 7));
    }
}
