package vgg;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f289161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f289162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f289163c;

    public j() {
        this(0);
    }

    public static j a(j jVar, Data airlineDetails, Data revPointsAccountStatus, Data userVouchers, int i) {
        if ((i & 1) != 0) {
            airlineDetails = jVar.f289161a;
        }
        if ((i & 2) != 0) {
            revPointsAccountStatus = jVar.f289162b;
        }
        if ((i & 4) != 0) {
            userVouchers = jVar.f289163c;
        }
        jVar.getClass();
        Intrinsics.checkNotNullParameter(airlineDetails, "airlineDetails");
        Intrinsics.checkNotNullParameter(revPointsAccountStatus, "revPointsAccountStatus");
        Intrinsics.checkNotNullParameter(userVouchers, "userVouchers");
        return new j(airlineDetails, revPointsAccountStatus, userVouchers);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f289161a, jVar.f289161a) && Intrinsics.f(this.f289162b, jVar.f289162b) && Intrinsics.f(this.f289163c, jVar.f289163c);
    }

    public final int hashCode() {
        return this.f289163c.hashCode() + kii.e.c(this.f289162b, this.f289161a.hashCode() * 31, 31);
    }

    public j(Data airlineDetails, Data revPointsAccountStatus, Data userVouchers) {
        Intrinsics.checkNotNullParameter(airlineDetails, "airlineDetails");
        Intrinsics.checkNotNullParameter(revPointsAccountStatus, "revPointsAccountStatus");
        Intrinsics.checkNotNullParameter(userVouchers, "userVouchers");
        this.f289161a = airlineDetails;
        this.f289162b = revPointsAccountStatus;
        this.f289163c = userVouchers;
    }

    public /* synthetic */ j(int i) {
        this(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, false, 7, null));
    }
}
