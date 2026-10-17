package dcl;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.shared.feature.wealth.domain.impl.data.database.WealthDomainDatabase;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f113014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ark.c f113015b = new ark.c(10);

    public f(WealthDomainDatabase wealthDomainDatabase) {
        this.f113014a = wealthDomainDatabase;
    }

    @Override // dcl.e
    public final hcl.k a(String str) {
        return (hcl.k) DBUtil.performBlocking(this.f113014a, true, false, new d7a.p(str, 7));
    }

    @Override // dcl.e
    public final void b(hcl.k kVar) {
        DBUtil.performBlocking(this.f113014a, false, true, new dc4.g(this, kVar, 6));
    }
}
