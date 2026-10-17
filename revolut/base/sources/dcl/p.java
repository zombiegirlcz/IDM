package dcl;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.shared.feature.wealth.domain.impl.data.database.WealthDomainDatabase;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes12.dex */
public final class p extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f113047a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qcl.d f113049c = new qcl.d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ark.c f113048b = new ark.c(this, 15);

    public p(WealthDomainDatabase wealthDomainDatabase) {
        this.f113047a = wealthDomainDatabase;
    }

    public static /* synthetic */ Unit e(p pVar, String str, String str2, ArrayList arrayList) {
        super.d(str, str2, arrayList);
        return Unit.f186387a;
    }

    @Override // dcl.o
    public final void a(String str, String str2) {
        DBUtil.performBlocking(this.f113047a, false, true, new avj.o(str, str2, 7));
    }

    @Override // dcl.o
    public final void b(ArrayList arrayList) {
        DBUtil.performBlocking(this.f113047a, false, true, new dc4.g(this, arrayList, 15));
    }

    @Override // dcl.o
    public final List c(String str, String str2) {
        return (List) DBUtil.performBlocking(this.f113047a, true, false, new d27.g0(this, 12, str, str2));
    }

    @Override // dcl.o
    public final void d(String str, String str2, ArrayList arrayList) {
        DBUtil.performBlocking(this.f113047a, false, true, new a5b.b(this, str, str2, arrayList, 27));
    }
}
