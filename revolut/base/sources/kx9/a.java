package kx9;

import amh.n;
import androidx.room.RoomDatabase;
import androidx.room.RxRoom;
import androidx.room.util.DBUtil;
import com.revolut.feature.payments.recents.impl.data.PaymentsRecentDatabase;
import efm.b;
import gv9.i;
import java.util.List;
import kp0.q;
import prk.o;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f190507a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jx9.a f190509c = new jx9.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f190508b = new i(this, 1);

    public a(PaymentsRecentDatabase paymentsRecentDatabase) {
        this.f190507a = paymentsRecentDatabase;
    }

    public final List a(List list) {
        return (List) DBUtil.performBlocking(this.f190507a, true, false, new n(this, o.p(")", list, p.a.s("SELECT * FROM payments_recent_v2 WHERE recipientId in (")), list, 7));
    }

    public final b b(List list) {
        list.getClass();
        return RxRoom.createCompletable(this.f190507a, false, true, new q(this, list, 24));
    }
}
