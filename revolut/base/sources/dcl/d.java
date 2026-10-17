package dcl;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.shared.feature.wealth.domain.impl.data.database.WealthDomainDatabase;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f113009a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qcl.c f113011c = new qcl.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ark.c f113010b = new ark.c(this, 9);

    public d(WealthDomainDatabase wealthDomainDatabase) {
        this.f113009a = wealthDomainDatabase;
    }

    @Override // dcl.c
    public final pcl.e a(String str) {
        return (pcl.e) DBUtil.performBlocking(this.f113009a, true, false, new dc4.g(this, str, 5));
    }

    @Override // dcl.c
    public final void b(ArrayList arrayList) {
        DBUtil.performBlocking(this.f113009a, false, true, new dc4.g(this, arrayList, 4));
    }
}
