package l7g;

import com.revolut.feature.travel.flights.models.domain.common.PhoneNumber;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f192595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PhoneNumber f192596b;

    public c() {
        this(null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f192595a, cVar.f192595a) && Intrinsics.f(this.f192596b, cVar.f192596b);
    }

    public final int hashCode() {
        String str = this.f192595a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        PhoneNumber phoneNumber = this.f192596b;
        return iHashCode + (phoneNumber != null ? phoneNumber.hashCode() : 0);
    }

    public c(String str, PhoneNumber phoneNumber) {
        this.f192595a = str;
        this.f192596b = phoneNumber;
    }
}
