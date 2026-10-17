package dcl;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.shared.feature.wealth.domain.impl.data.database.WealthDomainDatabase;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
public final class l0 extends k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f113033a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qcl.m f113035c = new qcl.m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ark.c f113034b = new ark.c(this, 26);

    public l0(WealthDomainDatabase wealthDomainDatabase) {
        this.f113033a = wealthDomainDatabase;
    }

    @Override // dcl.k0
    public final pcl.y a(String str) {
        return (pcl.y) DBUtil.performBlocking(this.f113033a, true, false, new dc4.g(this, str, 28));
    }

    @Override // dcl.k0
    public final void b(ArrayList arrayList) {
        DBUtil.performBlocking(this.f113033a, false, true, new dc4.g(this, arrayList, 27));
    }
}
