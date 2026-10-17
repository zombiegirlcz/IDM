package it5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f168343a;

    public b(String ssoUrl) {
        Intrinsics.checkNotNullParameter(ssoUrl, "ssoUrl");
        this.f168343a = ssoUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f168343a, ((b) obj2).f168343a);
    }

    public final int hashCode() {
        return this.f168343a.hashCode();
    }
}
