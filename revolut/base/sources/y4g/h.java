package y4g;

import aii.r;
import com.revolut.feature.travel.flights.models.domain.common.PhoneNumber;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f310923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PhoneNumber f310924b;

    public h(String email, PhoneNumber phoneNumber) {
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        this.f310923a = email;
        this.f310924b = phoneNumber;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f310923a, hVar.f310923a) && Intrinsics.f(this.f310924b, hVar.f310924b);
    }

    public final int hashCode() {
        return this.f310924b.hashCode() + (this.f310923a.hashCode() * 31);
    }
}
