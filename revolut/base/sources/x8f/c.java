package x8f;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.feature.trading.transfer.investments.impl.data.database.TransferInvestmentsDatabase;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import u8f.d;
import wg9.p;
import wtl.f;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f303318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0g.b f303319b = new t0g.b(this, 18);

    public c(TransferInvestmentsDatabase transferInvestmentsDatabase) {
        this.f303318a = transferInvestmentsDatabase;
    }

    public static /* synthetic */ Unit e(c cVar, String str, d dVar, ArrayList arrayList) {
        super.d(str, dVar, arrayList);
        return Unit.f186387a;
    }

    public static String f(d dVar) {
        int i = b.f303317a[dVar.ordinal()];
        if (i == 1) {
            return "NONE";
        }
        if (i == 2) {
            return "IN";
        }
        if (i == 3) {
            return "OUT";
        }
        throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + dVar);
    }

    @Override // x8f.a
    public final void a(String str, d dVar) {
        DBUtil.performBlocking(this.f303318a, false, true, new x52.a(this, 5, str, dVar));
    }

    @Override // x8f.a
    public final List b(String str, d dVar) {
        return (List) DBUtil.performBlocking(this.f303318a, true, false, new f(this, 10, str, dVar));
    }

    @Override // x8f.a
    public final void c(ArrayList arrayList) {
        DBUtil.performBlocking(this.f303318a, false, true, new x52.a(this, arrayList, 4));
    }

    @Override // x8f.a
    public final void d(String str, d dVar, ArrayList arrayList) {
        DBUtil.performBlocking(this.f303318a, false, true, new p((Object) this, str, (Object) dVar, arrayList, 5));
    }
}
