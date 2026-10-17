package dcl;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.shared.feature.wealth.domain.impl.data.database.WealthDomainDatabase;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f113000a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qcl.b f113002c = new qcl.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ark.c f113001b = new ark.c(this, 8);

    public b(WealthDomainDatabase wealthDomainDatabase) {
        this.f113000a = wealthDomainDatabase;
    }

    @Override // dcl.a
    public final hcl.i a(String str) {
        return (hcl.i) DBUtil.performBlocking(this.f113000a, true, false, new dc4.g(this, str, 3));
    }

    @Override // dcl.a
    public final void b(hcl.i iVar) {
        DBUtil.performBlocking(this.f113000a, false, true, new dc4.g(this, iVar, 2));
    }
}
