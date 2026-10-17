package s69;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f260173a;

    public p(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f260173a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f260173a, ((p) obj2).f260173a);
    }

    public final int hashCode() {
        return this.f260173a.hashCode();
    }
}
