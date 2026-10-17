package f02;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f130992a;

    public a(String redirectUrl) {
        Intrinsics.checkNotNullParameter(redirectUrl, "redirectUrl");
        this.f130992a = redirectUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f130992a, ((a) obj2).f130992a);
    }

    public final int hashCode() {
        return this.f130992a.hashCode();
    }
}
