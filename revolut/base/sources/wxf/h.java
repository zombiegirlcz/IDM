package wxf;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.feature.travel.common.impl.database.TravelDatabase;
import java.util.List;
import kotlin.Unit;
import wvg.r1;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f300941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0g.b f300942b = new t0g.b(15);

    public h(TravelDatabase travelDatabase) {
        this.f300941a = travelDatabase;
    }

    public static /* synthetic */ Unit e(h hVar, oxf.c[] cVarArr) {
        super.d(cVarArr);
        return Unit.f186387a;
    }

    @Override // wxf.f
    public final void a() {
        DBUtil.performBlocking(this.f300941a, false, true, new r1(25));
    }

    @Override // wxf.f
    public final List b() {
        return (List) DBUtil.performBlocking(this.f300941a, true, false, new r1(26));
    }

    @Override // wxf.f
    public final void c(oxf.c... cVarArr) {
        cVarArr.getClass();
        DBUtil.performBlocking(this.f300941a, false, true, new g(this, cVarArr, 0));
    }

    @Override // wxf.f
    public final void d(oxf.c... cVarArr) {
        DBUtil.performBlocking(this.f300941a, false, true, new g(this, cVarArr, 1));
    }
}
