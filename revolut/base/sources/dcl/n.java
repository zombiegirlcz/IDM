package dcl;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.shared.feature.wealth.domain.impl.data.database.WealthDomainDatabase;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class n extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f113039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ark.c f113040b = new ark.c(14);

    public n(WealthDomainDatabase wealthDomainDatabase) {
        this.f113039a = wealthDomainDatabase;
    }

    @Override // dcl.m
    public final void a(String str, String str2) {
        DBUtil.performBlocking(this.f113039a, false, true, new avj.o(str2, str, 5));
    }

    @Override // dcl.m
    public final jcl.e b(String str, String str2) {
        return (jcl.e) DBUtil.performBlocking(this.f113039a, true, false, new avj.o(str, str2, 6));
    }

    @Override // dcl.m
    public final List c(String str) {
        return (List) DBUtil.performBlocking(this.f113039a, true, false, new d7a.p(str, 9));
    }

    @Override // dcl.m
    public final List d(String str) {
        return (List) DBUtil.performBlocking(this.f113039a, true, false, new d7a.p(str, 8));
    }

    @Override // dcl.m
    public final void e(jcl.e eVar) {
        DBUtil.performBlocking(this.f113039a, false, true, new dc4.g(this, eVar, 14));
    }

    @Override // dcl.m
    public final void f(ArrayList arrayList) {
        DBUtil.performBlocking(this.f113039a, false, true, new dc4.g(this, arrayList, 13));
    }
}
