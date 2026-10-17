package vd9;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f287829a;

    public c(Set kycConsents) {
        Intrinsics.checkNotNullParameter(kycConsents, "kycConsents");
        this.f287829a = kycConsents;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f287829a, ((c) obj2).f287829a);
    }

    public final int hashCode() {
        return this.f287829a.hashCode();
    }
}
