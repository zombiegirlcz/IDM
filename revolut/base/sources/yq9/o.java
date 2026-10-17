package yq9;

import androidx.room.RoomDatabase;
import ar9.x;
import com.revolut.feature.payments.groups.impl.data.database.PaymentsGroupsDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f316023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qra.g f316024b = new qra.g(this, 7);

    public o(PaymentsGroupsDatabase paymentsGroupsDatabase) {
        this.f316023a = paymentsGroupsDatabase;
    }

    public static x a(String str) {
        str.getClass();
        if (str.equals("MARK_AS_PAID")) {
            return x.MARK_AS_PAID;
        }
        if (str.equals("TRANSFER")) {
            return x.TRANSFER;
        }
        throw new IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(str));
    }
}
