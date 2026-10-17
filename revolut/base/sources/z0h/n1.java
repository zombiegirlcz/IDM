package z0h;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class n1 implements o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f318541a;

    public n1(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f318541a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n1) && Intrinsics.f(this.f318541a, ((n1) obj2).f318541a);
    }

    public final int hashCode() {
        return this.f318541a.hashCode();
    }
}
