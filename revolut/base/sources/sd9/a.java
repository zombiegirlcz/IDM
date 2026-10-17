package sd9;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements pu.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f261834a;

    public a(Set kycConsents) {
        Intrinsics.checkNotNullParameter(kycConsents, "kycConsents");
        this.f261834a = kycConsents;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f261834a, ((a) obj2).f261834a);
    }

    public final int hashCode() {
        return this.f261834a.hashCode();
    }
}
