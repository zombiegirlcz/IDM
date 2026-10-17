package ppc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f238333a;

    public n(String termsOfBusinessUrl) {
        Intrinsics.checkNotNullParameter(termsOfBusinessUrl, "termsOfBusinessUrl");
        this.f238333a = termsOfBusinessUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f238333a, ((n) obj2).f238333a);
    }

    public final int hashCode() {
        return this.f238333a.hashCode();
    }
}
