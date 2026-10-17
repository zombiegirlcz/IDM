package dkj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f115574a;

    public i(String featuredPhoneNumberId) {
        Intrinsics.checkNotNullParameter(featuredPhoneNumberId, "featuredPhoneNumberId");
        this.f115574a = featuredPhoneNumberId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f115574a, ((i) obj2).f115574a);
    }

    public final int hashCode() {
        return this.f115574a.hashCode();
    }
}
