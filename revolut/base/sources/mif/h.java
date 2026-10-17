package mif;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.feature.transactions.impl.data.new_arch.database.TransactionsDatabase;
import java.util.Collections;
import java.util.List;
import nif.m2;

/* JADX INFO: loaded from: classes8.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f205798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final is6.x f205799b = new is6.x(18);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final is6.x f205800c = new is6.x(19);

    public h(TransactionsDatabase transactionsDatabase) {
        this.f205798a = transactionsDatabase;
    }

    public static void a() {
        List list = Collections.EMPTY_LIST;
    }

    public final m2 b(String str) {
        return (m2) DBUtil.performBlocking(this.f205798a, true, false, new lu6.p(str, 22));
    }

    public final void c(m2 m2Var) {
        DBUtil.performBlocking(this.f205798a, false, true, new ma2.s(this, m2Var, 23));
    }
}
