package fgj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f135084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f135085b;

    public c(String mobilePlanId, String featuredPhoneNumberId) {
        Intrinsics.checkNotNullParameter(mobilePlanId, "mobilePlanId");
        Intrinsics.checkNotNullParameter(featuredPhoneNumberId, "featuredPhoneNumberId");
        this.f135084a = mobilePlanId;
        this.f135085b = featuredPhoneNumberId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f135084a, cVar.f135084a) && Intrinsics.f(this.f135085b, cVar.f135085b);
    }

    public final int hashCode() {
        return this.f135085b.hashCode() + (this.f135084a.hashCode() * 31);
    }
}
