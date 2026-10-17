package mif;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import com.revolut.feature.transactions.impl.data.new_arch.database.TransactionsDatabase;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public final class d extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RoomDatabase f205791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gv9.i f205792c = new gv9.i(this, 2);

    public d(TransactionsDatabase transactionsDatabase) {
        this.f205791b = transactionsDatabase;
    }

    @Override // mif.b
    public final void a(ArrayList arrayList) {
        DBUtil.performBlocking(this.f205791b, false, true, new ma2.s(this, arrayList, 21));
    }

    @Override // mif.b
    public final void b(ArrayList arrayList) {
        DBUtil.performBlocking(this.f205791b, false, true, new a54.c(4, com.google.android.gms.internal.mlkit_vision_face.a.u(arrayList, p.a.s("DELETE FROM excluded_transactions WHERE excluded_transaction_id in ("), ")"), arrayList));
    }
}
