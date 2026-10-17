package vuf;

import androidx.room.RoomDatabase;
import androidx.room.RxRoom;
import androidx.room.util.DBUtil;
import com.revolut.feature.transport.impl.data.database.TransportDatabase;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class k extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RoomDatabase f292373a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f292375c = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0g.b f292374b = new t0g.b(this, 9);

    public k(TransportDatabase transportDatabase) {
        this.f292373a = transportDatabase;
    }

    public static f d(String str) {
        str.getClass();
        switch (str) {
            case "ACTIVATED":
                return f.ACTIVATED;
            case "NOT_PURCHASED":
                return f.NOT_PURCHASED;
            case "EXPIRED":
                return f.EXPIRED;
            case "PENDING":
                return f.PENDING;
            case "TO_BE_ACTIVATED":
                return f.TO_BE_ACTIVATED;
            default:
                throw new IllegalArgumentException("Can't convert value to enum, unknown value: ".concat(str));
        }
    }

    @Override // vuf.h
    public final List a() {
        return (List) DBUtil.performBlocking(this.f292373a, true, false, new i(this, 0));
    }

    @Override // vuf.h
    public final efm.r b() {
        i iVar = new i(this, 1);
        return RxRoom.createObservable(this.f292373a, false, new String[]{"purchased_transit_tickets"}, iVar);
    }

    @Override // vuf.h
    public final void c(ArrayList arrayList) {
        DBUtil.performBlocking(this.f292373a, false, true, new vrl.n(this, arrayList, 7));
    }
}
