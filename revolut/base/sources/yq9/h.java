package yq9;

import androidx.room.RoomDatabase;
import com.revolut.feature.payments.groups.impl.data.database.PaymentsGroupsDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f316005a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xq9.a f316007c = new xq9.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qra.g f316006b = new qra.g(this, 4);

    public h(PaymentsGroupsDatabase paymentsGroupsDatabase) {
        this.f316005a = paymentsGroupsDatabase;
    }

    public static ar9.c a(String str) {
        str.getClass();
        if (str.equals("DUMB")) {
            return ar9.c.DUMB;
        }
        if (str.equals("SMART")) {
            return ar9.c.SMART;
        }
        throw new IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(str));
    }
}
