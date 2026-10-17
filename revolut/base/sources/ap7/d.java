package ap7;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f8102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f8103b;

    public d(Data user, List drivers) {
        Intrinsics.checkNotNullParameter(drivers, "drivers");
        Intrinsics.checkNotNullParameter(user, "user");
        this.f8102a = drivers;
        this.f8103b = user;
    }

    public static d a(d dVar, List drivers, Data user, int i) {
        if ((i & 1) != 0) {
            drivers = dVar.f8102a;
        }
        if ((i & 2) != 0) {
            user = dVar.f8103b;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(drivers, "drivers");
        Intrinsics.checkNotNullParameter(user, "user");
        return new d(user, drivers);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f8102a, dVar.f8102a) && Intrinsics.f(this.f8103b, dVar.f8103b);
    }

    public final int hashCode() {
        return this.f8103b.hashCode() + (this.f8102a.hashCode() * 31);
    }
}
