package qtg;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.feature.wealth.account_closure.impl.data.database.WealthAccountClosureDatabase;
import dcl.g0;
import kotlin.Unit;
import ofg.i;
import qc0.w;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f249114a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ttg.a f249116c = new ttg.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f249115b = new i(this, 11);

    public e(WealthAccountClosureDatabase wealthAccountClosureDatabase) {
        this.f249114a = wealthAccountClosureDatabase;
        new g0(this, 17);
    }

    public static /* synthetic */ Unit e(e eVar, stg.b bVar) {
        super.d(bVar);
        return Unit.f186387a;
    }

    @Override // qtg.c
    public final void a(String str) {
        DBUtil.performBlocking(this.f249114a, false, true, new w(str, 21));
    }

    @Override // qtg.c
    public final stg.b b(String str) {
        return (stg.b) DBUtil.performBlocking(this.f249114a, true, false, new qpb.a(this, str, 11));
    }

    @Override // qtg.c
    public final void c(stg.b bVar) {
        DBUtil.performBlocking(this.f249114a, false, true, new d(this, bVar, 1));
    }

    @Override // qtg.c
    public final void d(stg.b bVar) {
        DBUtil.performBlocking(this.f249114a, false, true, new d(this, bVar, 0));
    }
}
