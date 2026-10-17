package f9l;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import com.revolut.shared.feature.rates.impl.database.SharedRatesRoomDatabase;
import dcl.s0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import prk.o;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f132993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s0 f132994b = new s0(this, 7);

    public d(SharedRatesRoomDatabase sharedRatesRoomDatabase) {
        this.f132993a = sharedRatesRoomDatabase;
    }

    public static /* synthetic */ Unit d(d dVar, ArrayList arrayList) {
        super.a(arrayList);
        return Unit.f186387a;
    }

    @Override // f9l.b
    public final void a(ArrayList arrayList) {
        DBUtil.performBlocking(this.f132993a, false, true, new c(this, arrayList, 0));
    }

    @Override // f9l.b
    public final void b(ArrayList arrayList) {
        DBUtil.performBlocking(this.f132993a, false, true, new c(this, arrayList, 1));
    }

    @Override // f9l.b
    public final List c(List list, List list2) {
        StringBuilder sbS = p.a.s("select * from rates_cache where `from` in (");
        int size = list.size();
        StringUtil.appendPlaceholders(sbS, size);
        sbS.append(") and `to` in (");
        return (List) DBUtil.performBlocking(this.f132993a, true, false, new c18.c(this, o.p(")", list2, sbS), list, size, list2));
    }
}
