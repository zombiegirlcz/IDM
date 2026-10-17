package mif;

import androidx.room.RoomDatabase;
import androidx.room.RxRoom;
import com.revolut.feature.transactions.impl.data.new_arch.database.TransactionsDatabase;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f205804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ao.g f205805b = new ao.g(this, 10);

    public j(TransactionsDatabase transactionsDatabase) {
        this.f205804a = transactionsDatabase;
    }

    public final efm.b a(ArrayList arrayList) {
        return RxRoom.createCompletable(this.f205804a, false, true, new a54.c(5, com.google.android.gms.internal.mlkit_vision_face.a.u(arrayList, p.a.s("DELETE FROM transaction_details WHERE leg_id IN ("), ")"), arrayList));
    }
}
