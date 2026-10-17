package ldk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class n implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f194172a;

    public n(String termsUrl) {
        Intrinsics.checkNotNullParameter(termsUrl, "termsUrl");
        this.f194172a = termsUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f194172a, ((n) obj2).f194172a);
    }

    public final int hashCode() {
        return this.f194172a.hashCode();
    }
}
