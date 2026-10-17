package dcl;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.shared.feature.wealth.domain.impl.data.database.WealthDomainDatabase;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes12.dex */
public final class v extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f113059a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qcl.d f113061c = new qcl.d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ark.c f113060b = new ark.c(this, 18);

    public v(WealthDomainDatabase wealthDomainDatabase) {
        this.f113059a = wealthDomainDatabase;
    }

    public static /* synthetic */ Unit e(v vVar, String str, String str2, eel.i iVar, ArrayList arrayList) {
        super.c(str, str2, iVar, arrayList);
        return Unit.f186387a;
    }

    public static String f(eel.i iVar) {
        int i = u.f113058a[iVar.ordinal()];
        if (i == 1) {
            return "PRICE";
        }
        if (i == 2) {
            return "YTM";
        }
        throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + iVar);
    }

    @Override // dcl.t
    public final List a(String str, String str2, eel.i iVar) {
        return (List) DBUtil.performBlocking(this.f113059a, true, false, new a5b.b((Object) this, (Object) str, (Object) str2, (Object) iVar, 28));
    }

    @Override // dcl.t
    public final void b(String str, String str2, eel.i iVar) {
        DBUtil.performBlocking(this.f113059a, false, true, new d27.g0(this, str, str2, iVar));
    }

    @Override // dcl.t
    public final void c(String str, String str2, eel.i iVar, ArrayList arrayList) {
        DBUtil.performBlocking(this.f113059a, false, true, new a5b.a((Object) this, (Object) str, (Object) str2, (Object) iVar, (Object) arrayList, 10));
    }

    @Override // dcl.t
    public final void d(ArrayList arrayList) {
        DBUtil.performBlocking(this.f113059a, false, true, new dc4.g(this, arrayList, 17));
    }
}
