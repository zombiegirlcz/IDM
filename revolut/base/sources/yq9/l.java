package yq9;

import androidx.room.RoomDatabase;
import androidx.room.RxRoom;
import androidx.room.util.DBUtil;
import com.revolut.feature.payments.groups.impl.data.database.PaymentsGroupsDatabase;
import efm.r;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f316016a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xq9.g f316018c = new xq9.g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qra.g f316017b = new qra.g(this, 6);

    public l(PaymentsGroupsDatabase paymentsGroupsDatabase) {
        this.f316016a = paymentsGroupsDatabase;
    }

    public final r a(String str) {
        y9d.c cVar = new y9d.c(24, str, this);
        return RxRoom.createObservable(this.f316016a, false, new String[]{"payments_groups_members"}, cVar);
    }

    public final void b(ArrayList arrayList) {
        DBUtil.performBlocking(this.f316016a, false, true, new j(this, arrayList, 1));
    }
}
