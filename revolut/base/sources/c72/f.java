package c72;

import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import c69.v;
import com.revolut.feature.apm.multibanco.impl.data.database.MultibancoDatabase;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f21839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ay1.f f21840b = new ay1.f(this, 2);

    public f(MultibancoDatabase multibancoDatabase) {
        this.f21839a = multibancoDatabase;
    }

    public static c d(String str) {
        str.getClass();
        switch (str) {
            case "CANCELLED":
                return c.CANCELLED;
            case "EXPIRED":
                return c.EXPIRED;
            case "USED":
                return c.USED;
            case "UNKNOWN":
                return c.UNKNOWN;
            case "ACTIVE":
                return c.ACTIVE;
            default:
                throw new IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(str));
        }
    }

    @Override // c72.d
    public final a a(String str) {
        return (a) DBUtil.performBlocking(this.f21839a, true, false, new byc.a(this, str, 27));
    }

    @Override // c72.d
    public final List b() {
        return (List) DBUtil.performBlocking(this.f21839a, true, false, new v(this, 2));
    }

    @Override // c72.d
    public final void c(List list) {
        list.getClass();
        DBUtil.performBlocking(this.f21839a, false, true, new byc.a(this, list, 28));
    }
}
