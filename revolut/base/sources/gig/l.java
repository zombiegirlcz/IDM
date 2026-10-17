package gig;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class l extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f144199a;

    public l(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f144199a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f144199a, ((l) obj2).f144199a);
    }

    public final int hashCode() {
        return this.f144199a.hashCode();
    }
}
