package mif;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.feature.transactions.impl.data.new_arch.database.TransactionsDatabase;
import nif.d1;

/* JADX INFO: loaded from: classes13.dex */
public final class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f205796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final is6.x f205797b = new is6.x(17);

    public g(TransactionsDatabase transactionsDatabase) {
        this.f205796a = transactionsDatabase;
    }

    public final Long a(String str) {
        return (Long) DBUtil.performBlocking(this.f205796a, true, false, new lu6.p(str, 20));
    }

    public final void b(d1 d1Var) {
        DBUtil.performBlocking(this.f205796a, false, true, new ma2.s(this, d1Var, 22));
    }
}
