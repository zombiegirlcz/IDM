package ggc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143622a;

    public f(String registrationUrl) {
        Intrinsics.checkNotNullParameter(registrationUrl, "registrationUrl");
        this.f143622a = registrationUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f143622a, ((f) obj2).f143622a);
    }

    public final int hashCode() {
        return this.f143622a.hashCode();
    }
}
