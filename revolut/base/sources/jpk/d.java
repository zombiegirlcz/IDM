package jpk;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import ao.g;
import com.revolut.retail.feature.ratedetails.impl.database.RatesRoomDatabase;
import j2c.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
public final class d extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f177312a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b21.a f177314c = new b21.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f177313b = new g(this, 8);
    public final g d = new g(this, 9);

    public d(RatesRoomDatabase ratesRoomDatabase) {
        this.f177312a = ratesRoomDatabase;
    }

    public static /* synthetic */ Unit e(d dVar, a aVar, ArrayList arrayList) {
        super.b(aVar, arrayList);
        return Unit.f186387a;
    }

    @Override // jpk.c
    public final long a(a aVar) {
        return ((Long) DBUtil.performBlocking(this.f177312a, false, true, new jp3.b(this, aVar, 3))).longValue();
    }

    @Override // jpk.c
    public final void b(a aVar, ArrayList arrayList) {
        DBUtil.performBlocking(this.f177312a, false, true, new o(this, 14, aVar, arrayList));
    }

    @Override // jpk.c
    public final void c(ArrayList arrayList) {
        DBUtil.performBlocking(this.f177312a, false, true, new jp3.b(this, arrayList, 4));
    }

    @Override // jpk.c
    public final List d(String str, String str2) {
        return (List) DBUtil.performBlocking(this.f177312a, true, false, new o(this, 13, str, str2));
    }
}
