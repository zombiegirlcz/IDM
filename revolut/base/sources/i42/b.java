package i42;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f158267a;

    public b(String termsUrl) {
        Intrinsics.checkNotNullParameter(termsUrl, "termsUrl");
        this.f158267a = termsUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f158267a, ((b) obj2).f158267a);
    }

    public final int hashCode() {
        return this.f158267a.hashCode();
    }
}
