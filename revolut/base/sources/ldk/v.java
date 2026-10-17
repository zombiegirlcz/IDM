package ldk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f194179a;

    public v(String termsUrl) {
        Intrinsics.checkNotNullParameter(termsUrl, "termsUrl");
        this.f194179a = termsUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v) && Intrinsics.f(this.f194179a, ((v) obj2).f194179a);
    }

    public final int hashCode() {
        return this.f194179a.hashCode();
    }
}
