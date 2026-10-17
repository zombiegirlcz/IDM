package e7l;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f123413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f123414b;

    public k(String privacyPolicy, String terms) {
        Intrinsics.checkNotNullParameter(privacyPolicy, "privacyPolicy");
        Intrinsics.checkNotNullParameter(terms, "terms");
        this.f123413a = privacyPolicy;
        this.f123414b = terms;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f123413a, kVar.f123413a) && Intrinsics.f(this.f123414b, kVar.f123414b);
    }

    public final int hashCode() {
        return this.f123414b.hashCode() + (this.f123413a.hashCode() * 31);
    }
}
