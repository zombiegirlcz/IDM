package l7g;

import com.revolut.feature.travel.flights.models.domain.common.PhoneNumber;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f192615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PhoneNumber f192616b;

    public k(String email, PhoneNumber phoneNumber) {
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        this.f192615a = email;
        this.f192616b = phoneNumber;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f192615a, kVar.f192615a) && Intrinsics.f(this.f192616b, kVar.f192616b);
    }

    public final int hashCode() {
        return this.f192616b.hashCode() + (this.f192615a.hashCode() * 31);
    }
}
