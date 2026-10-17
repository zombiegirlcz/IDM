package vo8;

import java.time.LocalDateTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDateTime f290895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f290896b;

    public n(LocalDateTime dateOfConsent, String juniorFirstName) {
        Intrinsics.checkNotNullParameter(dateOfConsent, "dateOfConsent");
        Intrinsics.checkNotNullParameter(juniorFirstName, "juniorFirstName");
        this.f290895a = dateOfConsent;
        this.f290896b = juniorFirstName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f290895a, nVar.f290895a) && Intrinsics.f(this.f290896b, nVar.f290896b);
    }

    public final int hashCode() {
        return this.f290896b.hashCode() + (this.f290895a.hashCode() * 31);
    }
}
