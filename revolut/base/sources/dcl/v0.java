package dcl;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.shared.feature.wealth.domain.impl.data.database.WealthDomainDatabase;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
public final class v0 extends u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f113062a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qcl.d f113064c = new qcl.d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s0 f113063b = new s0(this, 1);

    public v0(WealthDomainDatabase wealthDomainDatabase) {
        this.f113062a = wealthDomainDatabase;
    }

    @Override // dcl.u0
    public final kcl.b a(String str) {
        return (kcl.b) DBUtil.performBlocking(this.f113062a, true, false, new m0(this, str, 7));
    }

    @Override // dcl.u0
    public final void b(kcl.b bVar) {
        DBUtil.performBlocking(this.f113062a, false, true, new m0(this, bVar, 6));
    }

    @Override // dcl.u0
    public final void c(ArrayList arrayList) {
        DBUtil.performBlocking(this.f113062a, false, true, new m0(this, arrayList, 8));
    }
}
