package m91;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.feature.account_switching.impl.data.storage.AccountSwitchingDatabase;
import is6.x;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes20.dex */
public final class o extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f203620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f203621b = new x(16);

    public o(AccountSwitchingDatabase accountSwitchingDatabase) {
        this.f203620a = accountSwitchingDatabase;
    }

    public static /* synthetic */ Unit e(o oVar, ArrayList arrayList) {
        super.d(arrayList);
        return Unit.f186387a;
    }

    @Override // m91.m
    public final List a() {
        return (List) DBUtil.performBlocking(this.f203620a, true, false, new m62.l(22));
    }

    @Override // m91.m
    public final void b(ArrayList arrayList) {
        DBUtil.performBlocking(this.f203620a, false, true, new n(this, arrayList, 0));
    }

    @Override // m91.m
    public final void c() {
        DBUtil.performBlocking(this.f203620a, false, true, new m62.l(23));
    }

    @Override // m91.m
    public final void d(ArrayList arrayList) {
        DBUtil.performBlocking(this.f203620a, false, true, new n(this, arrayList, 1));
    }
}
