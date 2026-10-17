package dcl;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.shared.feature.wealth.domain.impl.data.database.WealthDomainDatabase;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
public final class j extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f113025a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qcl.g f113027c = new qcl.g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ark.c f113026b = new ark.c(this, 12);

    public j(WealthDomainDatabase wealthDomainDatabase) {
        this.f113025a = wealthDomainDatabase;
    }

    @Override // dcl.i
    public final pcl.o a(String str) {
        return (pcl.o) DBUtil.performBlocking(this.f113025a, true, false, new dc4.g(this, str, 10));
    }

    @Override // dcl.i
    public final void b(ArrayList arrayList) {
        DBUtil.performBlocking(this.f113025a, false, true, new dc4.g(this, arrayList, 9));
    }
}
