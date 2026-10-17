package dcl;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.shared.feature.wealth.domain.impl.data.database.WealthDomainDatabase;
import kotlin.Unit;

/* JADX INFO: loaded from: classes12.dex */
public final class y0 extends w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f113070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s0 f113071b = new s0(this, 2);

    public y0(WealthDomainDatabase wealthDomainDatabase) {
        this.f113070a = wealthDomainDatabase;
        new g0(this, 2);
    }

    public static /* synthetic */ Unit e(y0 y0Var, ocl.a aVar) {
        super.d(aVar);
        return Unit.f186387a;
    }

    @Override // dcl.w0
    public final void a() {
        DBUtil.performBlocking(this.f113070a, false, true, new dak.c(23));
    }

    @Override // dcl.w0
    public final ocl.a b() {
        return (ocl.a) DBUtil.performBlocking(this.f113070a, true, false, new dce.l0(this, 2));
    }

    @Override // dcl.w0
    public final void c(ocl.a aVar) {
        DBUtil.performBlocking(this.f113070a, false, true, new x0(this, aVar, 1));
    }

    @Override // dcl.w0
    public final void d(ocl.a aVar) {
        DBUtil.performBlocking(this.f113070a, false, true, new x0(this, aVar, 0));
    }
}
