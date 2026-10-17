package ahg;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f5113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f5114b;

    public e() {
        this(0);
    }

    public static e a(e eVar, Data airlineDetails, Data userVouchers, int i) {
        if ((i & 1) != 0) {
            airlineDetails = eVar.f5113a;
        }
        if ((i & 2) != 0) {
            userVouchers = eVar.f5114b;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(airlineDetails, "airlineDetails");
        Intrinsics.checkNotNullParameter(userVouchers, "userVouchers");
        return new e(airlineDetails, userVouchers);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f5113a, eVar.f5113a) && Intrinsics.f(this.f5114b, eVar.f5114b);
    }

    public final int hashCode() {
        return this.f5114b.hashCode() + (this.f5113a.hashCode() * 31);
    }

    public e(Data airlineDetails, Data userVouchers) {
        Intrinsics.checkNotNullParameter(airlineDetails, "airlineDetails");
        Intrinsics.checkNotNullParameter(userVouchers, "userVouchers");
        this.f5113a = airlineDetails;
        this.f5114b = userVouchers;
    }

    public /* synthetic */ e(int i) {
        this(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null));
    }
}
